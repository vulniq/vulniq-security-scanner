
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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windows;

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Textfilecontent54Behaviors;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Textfilecontent54Object;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.XmlfilecontentObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileBehaviors;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PowerShellFileSearchUtils extends PowerShellSearchUtilsBase
{
    private Logger logger = LoggerFactory.getLogger(PowerShellFileSearchUtils.class);
    private Textfilecontent54Object textFileContent54Object;
    private XmlfilecontentObject xmlFileContentObject;
    private FileObject windowsFileObject;
    private FileBehaviors behaviors = new FileBehaviors();

    private EntityObjectStringType filepathEntity = new EntityObjectStringType();
    private EntityObjectStringType pathEntity = new EntityObjectStringType();

    private EntityObjectStringType filenameEntity;

    private boolean isFilepath;
    private boolean isRecursive;
    private boolean isRegex;

    public PowerShellFileSearchUtils(DataCollectionTarget target, FileObject windowsFileObject)
    {
        super(target);
        this.windowsFileObject = windowsFileObject;
    }
    
    public PowerShellFileSearchUtils(DataCollectionTarget target, Textfilecontent54Object textFileContent54Object)
    {
        super(target);
        this.textFileContent54Object = textFileContent54Object;
    }
    
    public PowerShellFileSearchUtils(DataCollectionTarget target, XmlfilecontentObject xmlFileContentObject)
    {
        super(target);
        this.xmlFileContentObject = xmlFileContentObject;
    }

    public String[] convertFileSearchResultsToAbsolutePath(String fileSearchResults)
    {
        if (fileSearchResults == null)
        {
            return new String[0];
        }
        String titleSplitRegex = "(?<=-)-\\s+";
        String[] titleSplittedArray = fileSearchResults.trim().split(titleSplitRegex);

        if (titleSplittedArray.length == 1)
        {
            return new String[0];
        }
        else
        {
            String pathSplitRegex = "\\r?\\n";
            String[] pathSplittedArray = titleSplittedArray[1].trim().split(pathSplitRegex);
            String[] arrayWithoutDuplicates = removeDuplicateElements(pathSplittedArray);

            String[] trimmedArray = new String[arrayWithoutDuplicates.length];
            for (int i = 0; i < arrayWithoutDuplicates.length; i++)
            {
                trimmedArray[i] = arrayWithoutDuplicates[i].trim();
            }
            return trimmedArray;
        }
    }

    private String[] removeDuplicateElements(String[] pathArray)
    {
        String[] array = new HashSet<String>(Arrays.asList(pathArray)).toArray(new String[0]);
        return array;
    }

    public OSCommandOutput executeSearchCommand()
    {
        setClassProperties();

        String command;
        ArrayList<String> argumentList = constructCommandArguments();

        if (target.getTargetType() == DataCollectionTargetType.Host)
        {
            command = "powershell";
        }
        else
        {
            command = TerziConfiguration.getDockerCommand();
            argumentList.add(0, "exec");
            argumentList.add(1, target.getTargetName());
            argumentList.add(2, "powershell");
        }
        argumentList.remove(argumentList.size()-1);
        argumentList.remove(argumentList.size()-1);
        argumentList.add("Get-Content");

        OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
        
        return cmdOut;
    }
    
    public String getFileSearchResults() throws Exception
    {
        setClassProperties();

        String command;
        ArrayList<String> argumentList = constructCommandArguments();

        if (target.getTargetType() == DataCollectionTargetType.Host)
        {
            command = "powershell";
        }
        else
        {
            command = TerziConfiguration.getDockerCommand();
            argumentList.add(0, "exec");
            argumentList.add(1, target.getTargetName());
            argumentList.add(2, "powershell");
        }

        OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
        try
        {
            handleCmdOutContent(cmdOut);
            return cmdOut.getStdOut();
        }
        catch (Exception ex)
        {
            throw ex;
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

    private void checkRegexSearchEnabled()
    {
        if (isFilepath)
        {
            isRegex = filepathEntity.getOperation() == OperationEnumeration.PATTERN_MATCH;
        }
        else
        {
            if (filenameEntity == null)
            {
                isRegex = pathEntity.getOperation() == OperationEnumeration.PATTERN_MATCH;
            }
            else
            {
                isRegex = filenameEntity.getOperation() == OperationEnumeration.PATTERN_MATCH || pathEntity.getOperation() == OperationEnumeration.PATTERN_MATCH;
            }
        }
    }

    @Override
    protected void setClassProperties()
    {
        if (windowsFileObject != null)
        {
            if (windowsFileObject.getFilepath() != null)
            {
                this.filepathEntity = windowsFileObject.getFilepath();
            }
            if (windowsFileObject.getFilename() != null)
            {
                this.filenameEntity = windowsFileObject.getFilename().getValue();
            }
            if (windowsFileObject.getPath() != null)
            {
                this.pathEntity = windowsFileObject.getPath();
            }
            if (windowsFileObject.getBehaviors() != null)
            {
                this.behaviors = windowsFileObject.getBehaviors();
            }
        }
        else if (textFileContent54Object != null)
        {
            if (textFileContent54Object.getFilepath() != null)
            {
                this.filepathEntity = textFileContent54Object.getFilepath();
            }
            if (textFileContent54Object.getFilename() != null)
            {
                this.filenameEntity = textFileContent54Object.getFilename();
            }
            if (textFileContent54Object.getPath() != null)
            {
                this.pathEntity = textFileContent54Object.getPath();
            }
            if (textFileContent54Object.getBehaviors() != null)
            {
                Textfilecontent54Behaviors textFileBehaviors = textFileContent54Object.getBehaviors();
                behaviors.setMaxDepth(textFileBehaviors.getMaxDepth());
                behaviors.setRecurse(textFileBehaviors.getRecurse());
                behaviors.setRecurseDirection(textFileBehaviors.getRecurseDirection());
                behaviors.setRecurseFileSystem(textFileBehaviors.getRecurseFileSystem());
                behaviors.setWindowsView(textFileBehaviors.getWindowsView());
            }
        }
        else if (xmlFileContentObject != null)
        {
            if (xmlFileContentObject.getFilepath() != null)
            {
                this.filepathEntity = xmlFileContentObject.getFilepath();
            }
            if (xmlFileContentObject.getFilename() != null)
            {
                this.filenameEntity = xmlFileContentObject.getFilename();
            }
            if (xmlFileContentObject.getPath() != null)
            {
                this.pathEntity = xmlFileContentObject.getPath();
            }
            if (xmlFileContentObject.getBehaviors() != null)
            {
                behaviors.setMaxDepth(xmlFileContentObject.getBehaviors().getMaxDepth());
                behaviors.setRecurse(xmlFileContentObject.getBehaviors().getRecurse());
                behaviors.setRecurseDirection(xmlFileContentObject.getBehaviors().getRecurseDirection());
                behaviors.setRecurseFileSystem(xmlFileContentObject.getBehaviors().getRecurseFileSystem());
                behaviors.setWindowsView(xmlFileContentObject.getBehaviors().getWindowsView());
            }
        }
        checkFilepathOrPath();
        checkRecursiveSearchEnabled();
        checkRegexSearchEnabled();
    }

    private String extractFileDrive(String path)
    {
        String regex = "((?=[A-Z]:\\\\)|(?<=[A-Z]:\\\\))";
        String[] pathArray = path.split(regex);

        if (pathArray.length > 2)
        {
            return pathArray[1];
        }
        else if (pathArray.length == 2)
        {
            return pathArray[0];
        }
        else
        {
            return "C:\\";
        }
    }

    private String extractFileExtensionForFilter(String filename)
    {
        String regex = "\\.(?=[a-zA-z0-9*]+)";
        String[] filenameArray = filename.split(regex);

        String fileExtension = filenameArray[filenameArray.length - 1];
        String rv = "'*." + fileExtension + "'";
        logger.debug("extractFileExtensionForFilter return:" + rv);
        return rv;
    }

    private ArrayList<String> constructCommandArguments()
    {
        ArrayList<String> argumentList = new ArrayList<>();

        argumentList.add("Get-ChildItem"); //Get-ChildItem cmdlet

        String fileSearchLocation = constructFileSearchLocation(); //Specify file search location
        argumentList.add(fileSearchLocation);

        argumentList.add(constructRecursiveParameters());

        if (filenameEntity != null)
        {
            argumentList.add("-filter");

            if (isFilepath)
            {
                argumentList.add(extractFileExtensionForFilter(filepathEntity.getValue().toString()));
            }
            else
            {
                argumentList.add(extractFileExtensionForFilter(filenameEntity.getValue().toString()));
            }
        }
        argumentList.add("-erroraction");
        argumentList.add("silentlycontinue");

        argumentList.add("|");
        argumentList.add("where-object");
        argumentList.add(constructFileParameters());
        argumentList.add("|");

        argumentList.add("select-object");
        if (filenameEntity == null)
        {
            argumentList.add("directoryname");
        }
        else
        {
            argumentList.add("fullname");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("constructCommandArguments return:" + argumentList);
        }
        return argumentList;
    }

    private String constructFileSearchLocation()
    {
        String fileSearchLocation;
        if (behaviors.getWindowsView().equals("32_bit") && isWindowsOS64Bit(target))
        {
            if (isFilepath)
            {
                String filepath32Bit;
                if (filepathEntity.getValue().toString().contains("Program Files"))
                {
                    filepath32Bit = filepathEntity.getValue().toString().replace("Program Files", "Program Files (x86)");
                }
                else if (filepathEntity.getValue().toString().contains("System32"))
                {
                    filepath32Bit = filepathEntity.getValue().toString().replace("System32", "SysWOW64");
                }
                else
                {
                    filepath32Bit = filepathEntity.getValue().toString();
                }
                filepathEntity.setValue(filepath32Bit);
            }
            else
            {
                String path32Bit;
                if (pathEntity.getValue().toString().contains("Program Files"))
                {
                    path32Bit = pathEntity.getValue().toString().replace("Program Files", "Program Files (x86)");
                }
                else if (pathEntity.getValue().toString().contains("System32"))
                {
                    path32Bit = pathEntity.getValue().toString().replace("System32", "SysWOW64");
                }
                else
                {
                    path32Bit = pathEntity.getValue().toString();
                }
                pathEntity.setValue(path32Bit);
            }
            logger.debug("constructFileSearchLocation pathEntity=" + pathEntity);
        }

        if (isRegex)
        {
            String fileDrive;
            String pathOrFilepath;

            if (isFilepath)
            {
                pathOrFilepath = filepathEntity.getValue().toString();
            }
            else
            {
                pathOrFilepath = pathEntity.getValue().toString();
            }

            fileDrive = extractFileDrive(pathOrFilepath);
            if (pathOrFilepath.matches("(.*)Program Files(.*)"))
            {
                fileSearchLocation = fileDrive + "Program Files";
                return "'" + fileSearchLocation + "'";
            }
            else if (pathOrFilepath.matches("(.*)C:\\\\\\\\Windows(.*)"))
            {
                fileSearchLocation = fileDrive + "Windows";
                return "'" + fileSearchLocation + "'";
            }
            else if (pathOrFilepath.matches("(.*)Program Files (.*)"))
            {
                fileSearchLocation = fileDrive + "Program Files (x86)";
                return "'" + fileSearchLocation + "'";
            }
            else
            {
                if (!isRecursive)
                {
                    fileSearchLocation = fileDrive;
                    return "'" + fileSearchLocation + "'";
                }
            }
        }
        if (isRecursive)
        {
            int depthSize = 1;
            StringBuilder sb = new StringBuilder();
            sb.append("'");
            if (behaviors.getRecurseDirection().equals("up"))
            {
                depthSize = behaviors.getMaxDepth().intValue();
                String tempPath = pathEntity.getValue().toString();
                if (depthSize < 0) // Negative depth means no limitation on recursive depth
                {
                    while (!"".equals(tempPath))
                    {
                        int lastSlashIndex = tempPath.lastIndexOf("\\");
                        tempPath = tempPath.substring(0, lastSlashIndex);
                        if (tempPath.endsWith(":"))
                        {
                            sb.append(tempPath);
                            sb.append("\\'");
                            break;
                        }
                        else
                        {
                            sb.append(tempPath);
                            sb.append("','");
                        }
                    }
                }
                else // When maxdepth > 0
                {
                    for (int index = 0; index < depthSize; index++)
                    {
                        int lastSlashIndex = tempPath.lastIndexOf("\\");
                        tempPath = tempPath.substring(0, lastSlashIndex);
                        sb.append(tempPath);
                        if (index + 1 == depthSize)
                        {
                            sb.append("'");
                        }
                        else
                        {
                            sb.append("','");
                        }
                    }
                }
                return sb.toString();
            }
            else
            {
                fileSearchLocation = pathEntity.getValue().toString();
            }
        }
        else
        {
            if (isFilepath)
            {
                fileSearchLocation = filepathEntity.getValue().toString();
            }
            else
            {
                fileSearchLocation = pathEntity.getValue().toString();
            }
        }
        return "'" + fileSearchLocation + "'";
    }

    private String constructRecursiveParameters()
    {
        if (!isRecursive)
        {
            if (isRegex)
            {
                return "-recurse";
            }
            else
            {
                return "-depth 0";
            }
        }
        else
        {
            if (behaviors.getRecurseDirection().equals("up"))
            {
                return "-depth 0"; // This will be handled in constructFileSearchLocation()
            }
            else
            {
                if (behaviors.getMaxDepth().intValue() == -1)
                {
                    return "-recurse";
                }
                else
                {
                    String maxDepth = behaviors.getMaxDepth().toString();
                    return "-depth " + maxDepth;
                }
            }
        }
    }

    private String constructFileParameters()
    {
        //"{$_.fullname " + "-match " + "'^C:\\\\support\\\\xml'-and $_.name -match 'section1.xml'}"
        if (isFilepath)
        {
            String filepathArguments = "{$_.fullname" + getOperationParameter(filepathEntity.getOperation()) + " '" + filepathEntity.getValue().toString() + "'}";
            return filepathArguments;
        }
        else if (isRecursive)
        {
            String recursiveFileArguments;
            if (filenameEntity != null && filenameEntity.getValue() != null)
            {
                recursiveFileArguments = "{$_.name " + getOperationParameter(filenameEntity.getOperation()) + " '" + filenameEntity.getValue().toString() + "'}";
            }
            else
            { //  {$_.name -like '*.*'}
                recursiveFileArguments = "{$_.name -like '*.*'}";
            }
            return recursiveFileArguments;
        }
        else
        {
            String pathArguments = "{$_.directoryname " + getOperationParameter(pathEntity.getOperation()) + " '" + pathEntity.getValue().toString() + "'";
            if (filenameEntity != null && filenameEntity.getValue() != null)
            {
                pathArguments = pathArguments + " -and " + "$_.name " + getOperationParameter(filenameEntity.getOperation()) + " '" + filenameEntity.getValue().toString() + "'";
            }
            pathArguments = pathArguments + "}";
            return pathArguments;
        }
    }

    @Override
    public String getId()
    {
        return windowsFileObject.getId();
    }
}
