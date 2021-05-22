
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
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.host.HostInfoCollector;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.error.OSCommandTimedOutError;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FileBehaviors;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Textfilecontent54Object;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.XmlfilecontentObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FileSearchUtils
{
    private Logger logger = LoggerFactory.getLogger(FileSearchUtils.class);
    private final int timeout = 240000;
    private DataCollectionTarget target;

    private Textfilecontent54Object textfilecontent54Object;
    private XmlfilecontentObject xmlfilecontentObject;

    private FileBehaviors behaviors = new FileBehaviors();

    private EntityObjectStringType filepathEntity = new EntityObjectStringType();
    private EntityObjectStringType pathEntity = new EntityObjectStringType();
    private EntityObjectStringType filenameEntity = new EntityObjectStringType();

    private OVALInterpreter ovalInterpreter;
    private boolean isFilepath;
    private boolean isRecursive;
    private boolean isRegex;

    public FileSearchUtils(DataCollectionTarget target, Textfilecontent54Object textfilecontent54Object, OVALInterpreter ovalInterpreter)
    {
        this.target = target;
        this.textfilecontent54Object = textfilecontent54Object;
        this.ovalInterpreter = ovalInterpreter;
    }


    public String getFileContents() throws FileNotFoundException, OSCommandTimedOutError
    {
        if (textfilecontent54Object != null)
        {
            if (textfilecontent54Object.getFilepath() != null)
            {
                this.filepathEntity = textfilecontent54Object.getFilepath();
            }
            if (textfilecontent54Object.getFilename() != null)
            {
                this.filenameEntity = textfilecontent54Object.getFilename();
            }
            if (textfilecontent54Object.getPath() != null)
            {
                this.pathEntity = textfilecontent54Object.getPath();
            }
            if (textfilecontent54Object.getBehaviors() != null)
            {
                this.behaviors = textfilecontent54Object.getBehaviors();
            }

            checkFilepathOrPath();
            checkRecursiveSearchEnabled();
            checkRegexSearchEnabled();
        }
        else if (xmlfilecontentObject != null)
        {
            if (xmlfilecontentObject.getFilepath() != null)
            {
                this.filepathEntity = xmlfilecontentObject.getFilepath();
            }
            if (xmlfilecontentObject.getFilename() != null)
            {
                this.filenameEntity = xmlfilecontentObject.getFilename();
            }
            if (xmlfilecontentObject.getPath() != null)
            {
                this.pathEntity = xmlfilecontentObject.getPath();
            }
            if (xmlfilecontentObject.getBehaviors() != null)
            {
                this.behaviors = xmlfilecontentObject.getBehaviors();
            }

            checkFilepathOrPath();
            checkRecursiveSearchEnabled();
            checkRegexSearchEnabled();
        }

        List<OSCommandOutput> cmdOutList = getFileContentsMain();
        String result;
        try
        {
            result = handleCmdOutContent(cmdOutList);
        }
        catch (FileNotFoundException | OSCommandTimedOutError ex)
        {
            throw ex;
        }

        return result;
    }

    private String handleCmdOutContent(List<OSCommandOutput> cmdOutList) throws FileNotFoundException, OSCommandTimedOutError
    {
        StringBuilder sb = new StringBuilder();
        int cmdOutListSize = cmdOutList.size();

        int errorCount = 0;
        int timeOutCount = 0;

        for (OSCommandOutput cmdOut : cmdOutList)
        {
            if (cmdOut.isErrorOccured())
            {
                errorCount++;
            }
            else if (cmdOut.isTimedOut())
            {
                timeOutCount++;
            }
            else if (cmdOut.getExitCode() != 0)
            {
                errorCount++;
            }
            else if (timeOutCount + errorCount < cmdOutListSize)
            {
                String fileContents = cmdOut.getStdOut();
                if (fileContents != null && !cmdOut.getStdOut().isBlank())
                {
                    sb.append(fileContents);
                    sb.append("\n");
                }
            }
            else
            {
                if (errorCount >= timeOutCount)
                {
                    if (isFilepath)
                    {
                        throw new FileNotFoundException("cat " + filepathEntity.getValue().toString() + " returned an error");
                    }
                    else
                    {
                        throw new FileNotFoundException("cat " + pathEntity.getValue().toString() + "/ " + filenameEntity.getValue().toString() + " returned an error");
                    }
                }
                else
                {
                    if (isFilepath)
                    {
                        throw new OSCommandTimedOutError("cat " + filepathEntity.getValue().toString() + " timed out", timeout);
                    }
                    else
                    {
                        throw new OSCommandTimedOutError("cat " + pathEntity.getValue().toString() + "/ " + filenameEntity.getValue().toString() + " timed out", timeout);
                    }
                }
            }
        }

        return sb.toString();
    }

    private void checkFilepathOrPath()
    {
        if (filepathEntity == null)
        {
            isFilepath = false;
            return;
        }
        else if (filepathEntity.getValue() == null)
        {
            isFilepath = false;
            return;
        }
        else if (filepathEntity.getValue().toString().isEmpty() || filepathEntity.getValue().toString().isBlank())
        {
            isFilepath = false;
            return;
        }
        else
        {
            isFilepath = true;
            return;
        }
    }

    private void checkRecursiveSearchEnabled()
    {
        
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
            return;
        }
        else
        {
            isRecursive = true;
            return;
        }
    }

    private void checkRegexSearchEnabled()
    {
        if (isFilepath)
        {
            isRegex = filepathEntity.getOperation() == OperationEnumeration.PATTERN_MATCH;
        }
        else
        {
            isRegex = filenameEntity.getOperation() == OperationEnumeration.PATTERN_MATCH || pathEntity.getOperation() == OperationEnumeration.PATTERN_MATCH;
        }
    }

    private List<OSCommandOutput> getFileContentsMain()
    {
        List<OSCommandOutput> cmdOutList;
        if (isFilepath)
        {
            cmdOutList = getFilepathMain();
        }
        else
        {
            cmdOutList = getFilenamePathMain();
        }
        return cmdOutList;
    }

    private List<OSCommandOutput> getFilepathMain()
    {
        List<OSCommandOutput> cmdOutList;
        if (isRegex)
        {
            if (target.getTargetType() == DataCollectionTargetType.Docker)
            {
                cmdOutList = getFilepathRegexDocker();
            }
            else
            {
                cmdOutList = getFilepathRegexHost();
            }
        }
        else
        {
            if (target.getTargetType() == DataCollectionTargetType.Docker)
            {
                cmdOutList = getFilepathSimpleDocker();
            }
            else
            {
                cmdOutList = getFilepathSimpleHost();
            }
        }
        return cmdOutList;
    }

    private List<OSCommandOutput> getFilenamePathMain()
    {
        List<OSCommandOutput> cmdOutList = new ArrayList<>();

        if (isRegex)
        {
            switch (target.getTargetType())
            {
                case Docker:
                    if (filenameEntity.getOperation() == OperationEnumeration.PATTERN_MATCH && pathEntity.getOperation() == OperationEnumeration.PATTERN_MATCH)
                    {
                        //THIS SHOULD PROBABLY NOT HAPPEN
                        logger.error("Both filenameEntity and pathEntity has operation PATTERN_MATCH (target=docker). This is an unhandled case and a support case should be opened!");
                    }
                    else if (filenameEntity.getOperation() == OperationEnumeration.PATTERN_MATCH)
                    {
                        cmdOutList = getFilenameRegexDocker();
                    }
                    else// pathEntity.getOperation() == OperationEnumeration.PATTERN_MATCH
                    {
                        cmdOutList = getPathRegexDocker();
                    }
                    break;

                case Host:
                    if (filenameEntity.getOperation() == OperationEnumeration.PATTERN_MATCH && pathEntity.getOperation() == OperationEnumeration.PATTERN_MATCH)
                    {
                        //THIS SHOULD PROBABLY NOT HAPPEN
                        logger.error("Both filenameEntity and pathEntity has operation PATTERN_MATCH (target=host). This is an unhandled case and a support case should be opened!");
                    }
                    else if (filenameEntity.getOperation() == OperationEnumeration.PATTERN_MATCH)
                    {
                        cmdOutList = getFilenameRegexHost();
                    }
                    else //pathEntity.getOperation() == OperationEnumeration.PATTERN_MATCH
                    {
                        cmdOutList = getPathRegexHost();
                    }
                    break;
            }
        }
        else if (isRecursive)
        {
            switch (target.getTargetType())
            {
                case Docker:
                    cmdOutList = getFilenamePathRecursiveDocker();
                    break;
                case Host:
                    cmdOutList = getFilenamePathRecursiveHost();
                    break;
            }
        }
        else // If the search is a simple one
        {
            switch (target.getTargetType())
            {
                case Docker:
                    cmdOutList = getFilenamePathSimpleDocker();
                    break;
                case Host:
                    cmdOutList = getFilenamePathSimpleHost();
                    break;
            }
        }
        return cmdOutList;
    }

    private List<OSCommandOutput> getFilenamePathSimpleHost()
    {
        LinkedList<OSCommandOutput> cmdOutList = new LinkedList<>();
        OSCommandOutput cmdOut = null;

        String filename = filenameEntity.getValue().toString();
        String path = pathEntity.getValue().toString();

        if (filenameEntity.getOperation() == OperationEnumeration.NOT_EQUAL)
        {
            cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-maxdepth", "1", "!", "-name", filename, "-exec", "cat", "{}", "+");
        }
        else
        {
            cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-maxdepth", "1", "-name", filename, "-exec", "cat", "{}", "+");
        }

        cmdOutList.add(cmdOut);
        return cmdOutList;
    }

    private List<OSCommandOutput> getFilenamePathSimpleDocker()
    {
        LinkedList<OSCommandOutput> cmdOutList = new LinkedList<>();
        OSCommandOutput cmdOut = null;

        String filename = filenameEntity.getValue().toString();
        String path = pathEntity.getValue().toString();
        //TODO could it be an OS without bash and find?
        if (filenameEntity.getOperation() == OperationEnumeration.NOT_EQUAL)
        {
            cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                    "exec", target.getTargetName(), "/bin/bash", "-c",
                    "find " + OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -maxdepth 1 ! -name " +
                            OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");
        }
        else
        {
            cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                    "exec", target.getTargetName(), "/bin/bash", "-c", "find " +
                            OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -maxdepth 1 -name " +
                            OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");
        }

        cmdOutList.add(cmdOut);
        return cmdOutList;
    }

    private List<OSCommandOutput> getFilenamePathRecursiveHost()
    {
        LinkedList<OSCommandOutput> cmdOutList = new LinkedList<>();
        OSCommandOutput cmdOut = null;
        OSInfo hostOSInfo = HostInfoCollector.getHostOSInfo();

        String filename = filenameEntity.getValue().toString();
        String path = pathEntity.getValue().toString();
        int depthSize = 1;

        switch (hostOSInfo.getOsType())
        {
            case Mac:
            case Linux:
                switch (behaviors.getRecurseDirection())
                {
                    case "up": // Recurse up into parent directories
                        depthSize = behaviors.getMaxDepth().intValue();
                        String tempPath = path;
                        if (depthSize < 0) // Negative depth means no limitation on recursive depth
                        {
                            while (!"".equals(tempPath))
                            {
                                int lastSlashIndex = tempPath.lastIndexOf("/");
                                tempPath = tempPath.substring(0, lastSlashIndex);
                                if ("".equals(tempPath))
                                {
                                    break;
                                }
                                if (filenameEntity.getOperation() == OperationEnumeration.NOT_EQUAL)
                                {
                                    cmdOut = OSCommandUtils.runCommand(timeout, "find", tempPath, "-maxdepth", "1", "!", "-name", filename, "-exec", "cat", "{}", "+");
                                }
                                else
                                {
                                    cmdOut = OSCommandUtils.runCommand(timeout, "find", tempPath, "-maxdepth", "1", "-name", filename, "-exec", "cat", "{}", "+");
                                }

                                cmdOutList.add(cmdOut);
                            }
                        }
                        else // When maxdepth > 0
                        {
                            for (int index = 0; index < depthSize; index++)
                            {
                                int lastSlashIndex = tempPath.lastIndexOf("/");
                                tempPath = tempPath.substring(0, lastSlashIndex);

                                if (filenameEntity.getOperation() == OperationEnumeration.NOT_EQUAL)
                                {
                                    cmdOut = OSCommandUtils.runCommand(timeout, "find", tempPath, "-maxdepth", "1", "!", "-name", filename, "-exec", "cat", "{}", "+");
                                }
                                else
                                {
                                    cmdOut = OSCommandUtils.runCommand(timeout, "find", tempPath, "-maxdepth", "1", "-name", filename, "-exec", "cat", "{}", "+");
                                }

                                cmdOutList.add(cmdOut);
                            }
                        }
                        break;
                    case "down":
                        depthSize = behaviors.getMaxDepth().intValue();
                        if (depthSize < 0) //Negative depth means no limitation on recursive depth
                        {
                            if (filenameEntity.getOperation() == OperationEnumeration.NOT_EQUAL)
                            {
                                cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "!", "-name", filename, "-exec", "cat", "{}", "+");
                            }
                            else
                            {
                                cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-name", filename, "-exec", "cat", "{}", "+");
                            }

                            cmdOutList.add(cmdOut);
                        }
                        else
                        {
                            depthSize++; // Depthsize in OVAL definitions and find command arguments is not the same.
                            String depthSizeString = String.valueOf(depthSize);
                            if (filenameEntity.getOperation() == OperationEnumeration.NOT_EQUAL)
                            {
                                cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-maxdepth", depthSizeString, "!", "-name", filename, "-exec", "cat", "{}", "+");
                            }
                            else
                            {
                                cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-maxdepth", depthSizeString, "-name", filename, "-exec", "cat", "{}", "+");
                            }

                            cmdOutList.add(cmdOut);
                        }
                        break;
                }
                break;
            case Unknown: //TODO: What if OSInfo.OSType.Unknown == hostOSInfo.getOsType()
                logger.error("Host type is unknown in getFilenamePathRecursiveHost. This is not supported yet!");
                break;
            case Windows: // TODO: Add support for Windows
                logger.error("Host type is Windows in getFilenamePathRecursiveHost. This is not supported yet!");
                break;
        }
        return cmdOutList;
    }

    private List<OSCommandOutput> getFilenamePathRecursiveDocker()
    {
        LinkedList<OSCommandOutput> cmdOutList = new LinkedList<>();
        OSCommandOutput cmdOut = null;

        String path = pathEntity.getValue().toString();
        String filename = filenameEntity.getValue().toString();
        int depthSize = 1;

        switch (behaviors.getRecurseDirection())
        {
            case "up": //Recurse up into parent directories
                depthSize = behaviors.getMaxDepth().intValue();
                String tempPath = path;
                if (depthSize < 0) // Negative depth means no limitation on recursive depth
                {
                    while (!"".equals(tempPath))
                    {
                        int lastSlashIndex = tempPath.lastIndexOf("/");
                        tempPath = tempPath.substring(0, lastSlashIndex);
                        if ("".equals(tempPath))
                        {
                            break;
                        }
                        //TODO should also support OSes other than linux/unix
                        if (filenameEntity.getOperation() == OperationEnumeration.NOT_EQUAL)
                        {
                            cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                                    "exec", target.getTargetName(), "/bin/bash", "-c",
                                    "find " + OSCommandUtils.escapeShellArg(tempPath, ovalInterpreter.getOsInfo()) + " -maxdepth 1 ! -name " +
                                            OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");

                        }
                        else
                        {
                            cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                                    "exec", target.getTargetName(), "/bin/bash", "-c",
                                    "find " + OSCommandUtils.escapeShellArg(tempPath, ovalInterpreter.getOsInfo()) + " -maxdepth 1 -name " +
                                            OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");
                        }

                        cmdOutList.add(cmdOut);
                    }
                }
                else
                {
                    for (int index = 0; index < depthSize; index++)
                    {
                        int lastSlashIndex = tempPath.lastIndexOf("/");
                        tempPath = tempPath.substring(0, lastSlashIndex);
                        //TODO should also support OSes other than linux/unix
                        if (filenameEntity.getOperation() == OperationEnumeration.NOT_EQUAL)
                        {
                            cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                                    "exec", target.getTargetName(), "/bin/bash", "-c",
                                    "find " + OSCommandUtils.escapeShellArg(tempPath, ovalInterpreter.getOsInfo()) + " -maxdepth 1 ! -name " +
                                            OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");
                        }
                        else
                        {
                            cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                                    "exec", target.getTargetName(), "/bin/bash", "-c",
                                    "find " + OSCommandUtils.escapeShellArg(tempPath, ovalInterpreter.getOsInfo()) + " -maxdepth 1 -name " +
                                            OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");
                        }
                        cmdOutList.add(cmdOut);
                    }
                }
                break;
            case "down": //Recurse down into child directories
                depthSize = behaviors.getMaxDepth().intValue();

                if (depthSize < 0) //Negative depth means no limitation on recursive depth
                {
                    //TODO should also support OSes other than linux/unix
                    if (filenameEntity.getOperation() == OperationEnumeration.NOT_EQUAL)
                    {
                        cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                                "exec", target.getTargetName(), "/bin/bash", "-c",
                                "find " + OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " ! -name " +
                                        OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");
                    }
                    else
                    {
                        cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                                "exec", target.getTargetName(), "/bin/bash", "-c",
                                "find " + OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -name " +
                                        OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");
                    }
                    cmdOutList.add(cmdOut);
                }
                else
                {
                    depthSize++;
                    String depthSizeString = String.valueOf(depthSize);
                    //TODO should also support OSes other than linux/unix
                    if (filenameEntity.getOperation() == OperationEnumeration.NOT_EQUAL)
                    {
                        cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                                "exec", target.getTargetName(), "/bin/bash", "-c",
                                "find " + OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -maxdepth " + depthSizeString +
                                        " ! -name " + OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");
                    }
                    else
                    {
                        cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                                "exec", target.getTargetName(), "/bin/bash", "-c",
                                "find " + OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -maxdepth " + depthSizeString + " -name " +
                                        OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");
                    }
                    cmdOutList.add(cmdOut);
                    break;
                }
        }
        return cmdOutList;
    }

    private List<OSCommandOutput> getPathRegexDocker()
    {
        String filename = filenameEntity.getValue().toString();
        String escapedFilename = StringUtils.escapeRegex(filename);
        String path = pathEntity.getValue().toString();

        String filepath;
        
        if ("$".equals(path.charAt(path.length() - 1)))
        {
            filepath = path.substring(0, path.length() - 1) + "/" + escapedFilename + "$";
        }
        else
        {
            filepath = path + "/" + escapedFilename + "$";
        }

        this.filepathEntity.setValue(filepath);
        return getFilepathRegexDocker();
    }

    private List<OSCommandOutput> getPathRegexHost()
    {
        String filename = filenameEntity.getValue().toString();
        String escapedFilename = StringUtils.escapeRegex(filename);
        String path = pathEntity.getValue().toString();

        String filepath = path.substring(0, path.length() - 1) + "/" + escapedFilename + "$";

        this.filepathEntity.setValue(filepath);
        return getFilepathRegexHost();
    }

    private List<OSCommandOutput> getFilenameRegexHost()
    {
        LinkedList<OSCommandOutput> cmdOutList = new LinkedList<>();
        OSCommandOutput cmdOut = null;
        OSInfo hostOSInfo = HostInfoCollector.getHostOSInfo();

        String filename = "'.*/" + filenameEntity.getValue().toString() + "'";
        String path = pathEntity.getValue().toString();

        switch (hostOSInfo.getOsType())
        {
            case Mac:
                cmdOut = OSCommandUtils.runCommand(timeout, "find", "-E", path, "-maxdepth", "1", "-regex", filename, "-exec", "cat", "{}", "+");
                cmdOutList.add(cmdOut);
                break;
            case Linux:
                cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-maxdepth", "1", "-regex", filename, "-exec", "cat", "{}", "+");
                cmdOutList.add(cmdOut);
                break;
            case Windows: // TODO: Add support for Windows
                logger.error("getFilenameRegexHost does not support Windows yet!");
                break;
            case Unknown: //TODO: What if OSInfo.OSType.Unknown == hostOSInfo.getOsType()
                logger.error("Unknown OS type in getFilenameRegexHost!");
                break;
        }
        return cmdOutList;
    }

    private List<OSCommandOutput> getFilenameRegexDocker()
    {
        LinkedList<OSCommandOutput> cmdOutList = new LinkedList<>();
        OSCommandOutput cmdOut = null;

        String filename = "'.*/" + filenameEntity.getValue().toString() + "'";
        String path = pathEntity.getValue().toString();
        //TODO should support other OSs too
        cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                "exec", target.getTargetName(), "/bin/bash", "-c", "find " +
                        OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -maxdepth 1 -regextype 'posix-extended' -regex " +
                        OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");

        cmdOutList.add(cmdOut);
        return cmdOutList;
    }

    private List<OSCommandOutput> getFilepathSimpleDocker()
    {
        List<OSCommandOutput> cmdOutList = new ArrayList<>();
        String filepath = filepathEntity.getValue().toString();
        int lastSlashIndex = filepath.lastIndexOf("/");

        String path = filepath.substring(0, lastSlashIndex);
        String filename = filepath.substring(lastSlashIndex + 1);

        //TODO should support other OSs too
        OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                "exec", target.getTargetName(), "/bin/bash", "-c", "find " +
                        OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -maxdepth 1 -name " +
                        OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");

        cmdOutList.add(cmdOut);
        return cmdOutList;
    }

    private List<OSCommandOutput> getFilepathSimpleHost()
    {
        List<OSCommandOutput> cmdOutList = new ArrayList<>();
        OSCommandOutput cmdOut = null;
        OSInfo hostOSInfo = HostInfoCollector.getHostOSInfo();
        String filepath = filepathEntity.getValue().toString();
        int lastSlashIndex = filepath.lastIndexOf("/");

        String path = filepath.substring(0, lastSlashIndex);
        String filename = filepath.substring(lastSlashIndex + 1);

        switch (hostOSInfo.getOsType())
        {
            case Mac:
            case Linux: //TODO: Verify below expression for Linux
                cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-maxdepth", "1", "-name", filename, "-exec", "cat", "{}", "+");
                break;

            case Windows: // TODO: Add support for Windows
                logger.error("getFilepathSimpleHost does not support Windows yet!");
                break;

            case Unknown: //TODO: What to do OSInfo.OSType.Unknown == hostOSInfo.getOsType()
                logger.error("Unknown OS type in getFilepathSimpleHost!");
                break;

        }
        cmdOutList.add(cmdOut);
        return cmdOutList;
    }

    private List<OSCommandOutput> getFilepathRegexDocker()
    {
        String filepath = filepathEntity.getValue().toString();
        LinkedList<OSCommandOutput> cmdOutList = new LinkedList<>();

        //TODO should also support other OSs
        OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                "exec", target.getTargetName(), "/bin/bash", "-c", "find / -regextype 'posix-extended' -regex " +
                        OSCommandUtils.escapeShellArg(filepath, ovalInterpreter.getOsInfo()) + " -exec cat {} +");
        cmdOutList.add(cmdOut);
        return cmdOutList;
    }

    private List<OSCommandOutput> getFilepathRegexHost()
    {
        LinkedList<OSCommandOutput> cmdOutList = new LinkedList<>();
        OSInfo hostOSInfo = HostInfoCollector.getHostOSInfo();
        OSCommandOutput cmdOut = null;
        String filepath = filepathEntity.getValue().toString();

        switch (hostOSInfo.getOsType())
        {
            case Mac:
                cmdOut = OSCommandUtils.runCommand(timeout, "find", "-E", "/", "-regex", filepath, "-exec", "cat", "{}", "+");
                break;

            case Linux: // TODO: Verify whether the below is true
                cmdOut = OSCommandUtils.runCommand(timeout, "find", "/", "-regex", filepath, "-exec", "cat", "{}", "+");
                break;

            case Windows: // TODO: Add support for Windows
                logger.error("getFilepathRegexHost does not support Windows yet!");
                return null;

            case Unknown: //TODO: What to do OSInfo.OSType.Unknown == hostOSInfo.getOsType()
                logger.error("Unknown OS in getFilepathRegexHost!");
                return null;

        }
        cmdOutList.add(cmdOut);
        return cmdOutList;
    }
}
