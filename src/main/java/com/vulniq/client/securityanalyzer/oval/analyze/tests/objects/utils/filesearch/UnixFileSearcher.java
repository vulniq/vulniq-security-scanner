
/*
 *     VulnIQ Security Scanner, Terzi
 *     Copyright (C) 2021  SBOSoft A.S. and its affiliates
 *     Contact : info@vulniq.com www.vulniq.com
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.filesearch;

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.error.OSCommandTimedOutError;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileBehaviors;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UnixFileSearcher
{
    private Logger logger = LoggerFactory.getLogger(UnixFileSearcher.class);
    private OVALInterpreter interpreter;
    private FileObject fileObject;
    private DataCollectionTarget target;
    private String command;
    private boolean isFilepath;
    private boolean isRecursive;
    private boolean isRegex;
    private boolean doesContainSet;
    
    private ArrayList<String> arguments = new ArrayList<>();
    
    public UnixFileSearcher(OVALInterpreter interpreter, FileObject fileObject)
    {
        this.interpreter = interpreter;
        this.fileObject = fileObject;
        this.target = interpreter.getDataCollectionTarget();
    }
    
    private OSCommandOutput runFindCommand()
    {
        int timeout = 240000;
        if (interpreter.getDataCollectionTarget().getTargetType() == DataCollectionTargetType.Docker)
        {
            command = TerziConfiguration.getDockerCommand();
            String joinedFindPart = String.join(" ", arguments);
            return OSCommandUtils.runCommand(timeout, command,
                    "exec", target.getTargetName(), "/bin/bash", "-c", joinedFindPart);
        }
        else
        {
            command = "find";
            return OSCommandUtils.runCommand(timeout, command, arguments.toArray(arguments.toArray(new String[0])));
        }

    }



    public String[] findFilesOrDirectories() throws UnexpectedOVALEvaluationError, OSCommandTimedOutError, FileNotFoundException
    {
        //checkSets();

        {
            checkFilepathOrPath();
            checkRecursiveSearchEnabled();
            checkRegexSearchEnabled();
            if (!isRegex)
            {
                if (!isRecursive)
                {
                    if (isFilepath)
                    {
                        String filepath = fileObject.getFilepath().getValue().toString();
                        int index = filepath.lastIndexOf('/');
                        String filename = filepath.substring(index + 1);
                        String path = filepath.substring(0, index);
                        addFileSimpleArguments(path, filename, OperationEnumeration.EQUALS);
                    }
                    else
                    {
                        String path = fileObject.getPath().getValue().toString();
                        if (isFilenameNil())
                        {
                            addDirectorySimpleArguments(path);
                        }
                        else
                        {
                            String filename = fileObject.getFilename().getValue().getValue().toString();
                            addFileSimpleArguments(path, filename, fileObject.getFilename().getValue().getOperation());
                        }
                    }
                }
                else
                {
                    String filename = fileObject.getFilename().getValue().getValue().toString();
                    String path = fileObject.getPath().getValue().toString();
                    addRecursiveArguments(filename, path, fileObject.getFilename().getValue().getOperation());
                }
            }
            else
            {
                logger.warn("Finding files with regex becomes troublesome with symlinks, please make sure that the results for file search is correct. OVAL Object Id: " +fileObject.getId());
                if (isFilepath)
                {
                    addRegexArguments("/", fileObject.getFilepath().getValue().toString());
                }
                else
                {
                    if (isFilenameNil())
                    {
                        addRegexArguments("/", fileObject.getPath().getValue().toString());
                    }
                    else
                    {
                        String path = fileObject.getPath().getValue().toString();
                        String filename = fileObject.getFilename().getValue().getValue().toString();
                        if (fileObject.getPath().getOperation() == OperationEnumeration.PATTERN_MATCH)
                        {
                            String regex = addFileSeparatorIfNotPresent(stripEndAnchorFromRegex(path)) + stripStartAnchorFromRegex(filename);
                            addRegexArguments("/", regex);
                        }
                        else
                        {
                            String regex = addFileSeparatorIfNotPresent(path) + stripStartAnchorFromRegex(filename);
                            addRegexArguments(path, regex);
                        }
                    }
                }
            }
    
            OSCommandOutput cmdOut = runFindCommand();
    
            if (cmdOut.isErrorOccured())
            {
                throw new UnexpectedOVALEvaluationError("An error occurred in terminal while searching for file or directory.");
            }
            else if (cmdOut.isTimedOut())
            {
                //TODO add the command which timed out
                throw new OSCommandTimedOutError();
            }
            else if (cmdOut.getStdOut().trim().equals(""))
            {
                throw new FileNotFoundException(cmdOut.getCommand() + " failed");
            }
            else
            {
                String[] foundPaths = parseCmdOut(cmdOut.getStdOut());
                return foundPaths;
            }
        }
    }
    
    private String[] parseCmdOut(String stdOut)
    {
        return stdOut.trim().split("\\n");
    }
    
    private String stripEndAnchorFromRegex(String regex)
    {
        if(regex.charAt(regex.length()-1) == '$')
        {
            return regex.substring(0, regex.length() - 1);
        }
        return regex;
    }
    
    private String addFileSeparatorIfNotPresent(String path)
    {
        if(path.charAt(path.length()- 1)  != '/')
        {
            return path + "/";
        }
        return path;
    }
    
    private String stripStartAnchorFromRegex(String regex)
    {
        if(regex.charAt(0) == '^')
        {
            return regex.substring(1);
        }
        return regex;
    }
    
    private void addDirectorySimpleArguments(String path)
    {
        if (target.getTargetType() == DataCollectionTargetType.Host)
        {
            arguments.add(path);
            arguments.add("-maxdepth");
            arguments.add("0");
            //arguments.add("-type");
            //arguments.add("d");
        }
        else
        {
            arguments.add("find -L " + OSCommandUtils.escapeShellArg(path, interpreter.getOsInfo()) + " -maxdepth 0");
        }
    
    }
    
    private void addFileSimpleArguments(String path, String filename, OperationEnumeration operation)
    {
        if (target.getTargetType() == DataCollectionTargetType.Host)
        {
            arguments.add("-L");
            arguments.add(path);
            arguments.add("-maxdepth");
            arguments.add("1");
            if (operation == OperationEnumeration.NOT_EQUAL)
            {
                arguments.add("!");
            }
            arguments.add("-name");
            arguments.add(OSCommandUtils.escapeShellArg(filename, interpreter.getOsInfo()));
        }
        else
        {
            if (operation == OperationEnumeration.NOT_EQUAL)
            {
                arguments.add("find -L " + OSCommandUtils.escapeShellArg(path, interpreter.getOsInfo()) + " -maxdepth 1 ! -name " +
                        OSCommandUtils.escapeShellArg(filename, interpreter.getOsInfo()));
            }
            else
            {
                arguments.add("find -L " + OSCommandUtils.escapeShellArg(path, interpreter.getOsInfo()) + " -maxdepth 1 -name " +
                        OSCommandUtils.escapeShellArg(filename, interpreter.getOsInfo()));
            }
        }
    }
    
    private void addRegexArguments(String searchStartDirectory, String regex)
    {
        if (target.getTargetType() == DataCollectionTargetType.Host)
        {
            arguments.add(searchStartDirectory);
            arguments.add("-regextype");
            arguments.add("posix-extended");
            arguments.add("-regex");
            arguments.add(regex);
        }
        else
        {
            arguments.add("find " + OSCommandUtils.escapeShellArg(searchStartDirectory, interpreter.getOsInfo()) +
                    " -regextype 'posix-extended' -regex " + OSCommandUtils.escapeShellArg(regex, interpreter.getOsInfo()));
        }
    }
    
    private void addRecursiveArgumentsUpDirection(String filename, String path, OperationEnumeration operation)
    {
        FileBehaviors behaviors = fileObject.getBehaviors();
        int depthSize = behaviors.getMaxDepth().intValue();
        String tempPath = path;
        int counter = 0;
        ArrayList<String> fileSearchLocations = new ArrayList<>();
        fileSearchLocations.add(tempPath);
        while (!"".equals(tempPath))
        {
            counter++;
            if ((depthSize > 0 && counter > depthSize) || "".equals(tempPath))
            {
                break;
            }
            int lastSlashIndex = tempPath.lastIndexOf("/");
            tempPath = tempPath.substring(0, lastSlashIndex);
            fileSearchLocations.add(tempPath);
        }
        if(target.getTargetType() == DataCollectionTargetType.Host)
        {
            arguments.addAll(fileSearchLocations);
            arguments.add("-maxdepth");
            arguments.add("1");
            if (operation == OperationEnumeration.NOT_EQUAL)
            {
                arguments.add("!");
            }
            arguments.add("-name");
            arguments.add(filename);
        }
        else
        {
            StringBuilder sb = new StringBuilder();
            sb.append("find ");
            for (String fileSearchLocation : fileSearchLocations)
            {
                sb.append(OSCommandUtils.escapeShellArg(fileSearchLocation, interpreter.getOsInfo()));
                sb.append(" ");
            }
            sb.append("-maxdepth ");
            sb.append("1 ");
            if (operation == OperationEnumeration.NOT_EQUAL)
            {
                sb.append("! ");
            }
            sb.append("-name ");
            sb.append(OSCommandUtils.escapeShellArg(filename, interpreter.getOsInfo()));
            arguments.add(sb.toString());
        }
    }
    private void addRecursiveArgumentsDownDirection(String filename, String path, OperationEnumeration operation)
    {
        FileBehaviors behaviors = fileObject.getBehaviors();
        int depthSize = behaviors.getMaxDepth().intValue();
        
        if(target.getTargetType() == DataCollectionTargetType.Host)
        {
            arguments.add(path);
            if (depthSize >= 0)
            {
                depthSize++; // Depth size in OVAL definitions and find command arguments is not the same.
                String depthSizeString = String.valueOf(depthSize);
                arguments.add("-maxdepth");
                arguments.add(depthSizeString);
            }
            if (operation == OperationEnumeration.NOT_EQUAL)
            {
                arguments.add("!");
            }
            arguments.add("-name");
            arguments.add(filename);
        }
        else
        {
            StringBuilder sb = new StringBuilder();
            sb.append("find -L ");
            sb.append(path);
            
            if (depthSize >= 0)
            {
                depthSize++; // Depth size in OVAL definitions and find command arguments is not the same.
                String depthSizeString = String.valueOf(depthSize);
                sb.append(" -maxdepth ");
                sb.append(depthSizeString);
            }
            sb.append(" ");
            if(operation == OperationEnumeration.NOT_EQUAL)
            {
                sb.append("! ");
            }
            sb.append("-name ");
            sb.append(OSCommandUtils.escapeShellArg(filename, interpreter.getOsInfo()));
            arguments.add(sb.toString());
        }
    }
    
    private void addRecursiveArguments(String filename, String path, OperationEnumeration operation)
    {
        FileBehaviors behaviors = fileObject.getBehaviors();
        switch (behaviors.getRecurseDirection())
        {
            case "up":
                addRecursiveArgumentsUpDirection(filename, path, operation);
                break;
            case "down":
                addRecursiveArgumentsDownDirection(filename, path, operation);
                break;
        }
    }
    
    private boolean isFilenameNil()
    {
        if (fileObject.getFilename() != null)
        {
            return fileObject.getFilename().isNil();
        }
        return true;
    }
    
    private void checkFilepathOrPath()
    {
        EntityObjectStringType filepathEntity = fileObject.getFilepath();
        if (filepathEntity == null)
        {
            isFilepath = false;
        }
        else if (filepathEntity.getValue() == null)
        {
            isFilepath = false;
        }
        else if (filepathEntity.getValue().toString().isEmpty() || filepathEntity.getValue().toString().isBlank())
        {
            isFilepath = false;
        }
        else
        {
            isFilepath = true;
        }
        logger.debug("At the end of checkFilepathOrPath, isFilepath=" + isFilepath);
    }
    
    private void checkRecursiveSearchEnabled()
    {
        FileBehaviors behaviors = fileObject.getBehaviors();
        if (behaviors == null)
        {
            isRecursive = false;
            return;
        }
        if (behaviors.getRecurseDirection() == null)
        {
            isRecursive = false;
            return;
        }
        
        if ("none".equals(behaviors.getRecurseDirection()) || behaviors.getRecurseDirection().isBlank())
        {
            isRecursive = false;
        }
        else
        {
            isRecursive = true;
        }
        logger.debug("At the end of checkRecursiveSearchEnabled, isRecursive=" + isRecursive);
    }
    
    private void checkRegexSearchEnabled()
    {
        checkFilepathOrPath();
        if (isFilepath)
        {
            EntityObjectStringType filepathEntity = fileObject.getFilepath();
            isRegex = filepathEntity.getOperation() == OperationEnumeration.PATTERN_MATCH;
        }
        else
        {
            EntityObjectStringType pathEntity = fileObject.getPath();
            if (fileObject.getFilename() != null && !fileObject.getFilename().isNil())
            {
                EntityObjectStringType filenameEntity = fileObject.getFilename().getValue();
                isRegex = filenameEntity.getOperation() == OperationEnumeration.PATTERN_MATCH || pathEntity.getOperation() == OperationEnumeration.PATTERN_MATCH;
            }
            else
            {
                isRegex = pathEntity.getOperation() == OperationEnumeration.PATTERN_MATCH;
            }
        }
        logger.debug("At the end of checkRegexSearchEnabled, isRegex=" + isRegex);
    }
    
    
    public boolean isRegex()
    {
        return isRegex;
    }
}
