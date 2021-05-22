
//package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windowsfiletest;
//
//import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
//import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
//import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
//import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
//import com.vulniq.client.securityanalyzer.oval.error.OSCommandTimedOutError;
//import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
//import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
//import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
//import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
//import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileBehaviors;
//import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject;
//
///**
// *
// *
// */
//public class PowerShellFileSearchUtils
//{
//
//    private OVALInterpreter ovalInterpreter;
//    private DataCollectionTarget target;
//    private FileObject fileObject;
//    private final int timeout = 240000;
//
//    private FileBehaviors behaviors = new FileBehaviors();
//
//    private EntityObjectStringType filepathEntity = new EntityObjectStringType();
//    private EntityObjectStringType pathEntity = new EntityObjectStringType();
//
//    private EntityObjectStringType filenameEntity;
//
//    private boolean isFilepath;
//    private boolean isRecursive;
//    private boolean isRegex;
//
//    public PowerShellFileSearchUtils(DataCollectionTarget target, OVALInterpreter ovalInterpreter, FileObject fileObject)
//    {
//        this.target = target;
//        this.fileObject = fileObject;
//        this.ovalInterpreter = ovalInterpreter;
//    }
//
//    public static Boolean isWindowsOS64Bit(DataCollectionTarget dataCollectionTarget)
//    {
//        if (dataCollectionTarget.getTargetType() == DataCollectionTargetType.Host)
//        {
//            String property = System.getProperty("os.arch");
//            return property.contains("64");
//        }
//        else
//        {
//            OSCommandOutput psOut = OSCommandUtils.runCommand(240000, TerziConfiguration.getDockerCommand(), "exec", dataCollectionTarget.getTargetName(),
//                    "powershell", "[Environment]::Is64BitOperatingSystem");
//            if (!psOut.isErrorOccured() && !psOut.isTimedOut() && psOut.getExitCode() == 0)
//            {
//                return psOut.getStdOut().equals("True");
//            }
//            else
//            {
//                OSCommandOutput cmdOut = OSCommandUtils.runCommand(240000, TerziConfiguration.getDockerCommand(),
//                        "exec", dataCollectionTarget.getTargetName(), "wmic", "os", "get", "osarchitecture");
//                if (!cmdOut.isErrorOccured() && !cmdOut.isTimedOut() && cmdOut.getExitCode() == 0)
//                {
//                    return cmdOut.getStdOut().contains("64-bit");
//                }
//            }
//        }
//        return null;
//    }
//
//    public String[] convertFileSearchResultsToAbsolutePath(String fileSearchResults)
//    {
//        if (fileSearchResults == null)
//        {
//            return new String[0];
//        }
//        String titleSplitRegex = "(?<=-)-\\s+";
//        String[] titleSplittedArray = fileSearchResults.trim().split(titleSplitRegex);
//
//        if (titleSplittedArray.length == 1)
//        {
//            return new String[0];
//        }
//        else
//        {
//            String pathSplitRegex = "\\r?\\n";
//            String[] pathSplittedArray = titleSplittedArray[1].trim().split(pathSplitRegex);
//            String[] arrayWithoutDuplicates = removeDuplicateElements(pathSplittedArray);
//            
//            String[] trimmedArray = new String[arrayWithoutDuplicates.length];
//            for (int i = 0; i < arrayWithoutDuplicates.length; i++)
//            {
//                trimmedArray[i] = arrayWithoutDuplicates[i].trim();
//            }
//            return trimmedArray;
//        }
//    }
//
//    private String[] removeDuplicateElements(String[] pathArray)
//    {
//        String[] array = new HashSet<String>(Arrays.asList(pathArray)).toArray(new String[0]);
//        return array;
//    }
//
//    public String getFileSearchResults() throws Exception
//    {
//        setClassProperties();
//
//        String command;
//        ArrayList<String> argumentList = constructCommandArguments();
//
//        if (target.getTargetType() == DataCollectionTargetType.Host)
//        {
//            command = "powershell";
//        }
//        else
//        {
//            command = TerziConfiguration.getDockerCommand();
//            argumentList.add(0, "exec");
//            argumentList.add(1, target.getTargetName());
//            argumentList.add(2, "powershell");
//        }
//
//        OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
//        try
//        {
//            handleCmdOutContent(cmdOut);
//            return cmdOut.getStdOut();
//        }
//        catch (Exception ex)
//        {
//            throw ex;
//        }
//    }
//
//    private String handleCmdOutContent(OSCommandOutput cmdOut) throws FileNotFoundException, Exception, OSCommandTimedOutError
//    {
//        if (cmdOut.isErrorOccured())
//        {
//            if (isFilepath)
//            {
//                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, fileObject.getId(), "PowerShell cannot find OVAL Object with ID: " + fileObject.getId(), CollectionUtils.mapFromArgs("Filepath:", fileObject.getFilepath().getValue().toString()));
//            }
//            else
//            {
//                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, fileObject.getId(), "PowerShell cannot find OVAL Object with ID: " + fileObject.getId(), CollectionUtils.mapFromArgs("Path:", fileObject.getPath().getValue().toString(), "Filename:", fileObject.getFilename().getValue().toString()));
//            }
//            throw new FileNotFoundException("PowerShell cannot find OVAL Object with ID: " + fileObject.getId());
//        }
//        else if (cmdOut.isTimedOut())
//        {
//            if (isFilepath)
//            {
//                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, fileObject.getId(), "PowerShell timed out while searching for OVAL Object with ID: " + fileObject.getId(), CollectionUtils.mapFromArgs("Filepath:", fileObject.getFilepath().getValue().toString()));
//            }
//            else
//            {
//                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, fileObject.getId(), "PowerShell timed out while searching for OVAL Object with ID: " + fileObject.getId(), CollectionUtils.mapFromArgs("Path:", fileObject.getPath().getValue().toString(), "Filename:", fileObject.getFilename().getValue().toString()));
//            }
//            throw new OSCommandTimedOutError("PowerShell timed out while searching for OVAL Object with ID: " + fileObject.getId(), timeout);
//        }
//        else
//        {
//            String cmdOutContent = cmdOut.getStdOut();
//            if (cmdOutContent != null)
//            {
//                return cmdOutContent;
//            }
//        }
//        return "";
//    }
//
//    private void checkFilepathOrPath()
//    {
//        if (filepathEntity == null)
//        {
//            isFilepath = false;
//            return;
//        }
//        else if (filepathEntity.getValue() == null)
//        {
//            isFilepath = false;
//            return;
//        }
//        else if (filepathEntity.getValue().toString().isEmpty() || filepathEntity.getValue().toString().isBlank())
//        {
//            isFilepath = false;
//            return;
//        }
//        else
//        {
//            isFilepath = true;
//            return;
//        }
//    }
//
//    private void checkRecursiveSearchEnabled()
//    {
//        if (behaviors == null)
//        {
//            isRecursive = false;
//            return;
//        }
//        if (behaviors.getRecurseDirection() == null)
//        {
//            isRecursive = false;
//            return;
//        }
//
//        if ("none".equals(behaviors.getRecurseDirection()) || behaviors.getRecurseDirection().isBlank())
//        {
//            isRecursive = false;
//            return;
//        }
//        else
//        {
//            isRecursive = true;
//            return;
//        }
//    }
//
//    private void checkRegexSearchEnabled()
//    {
//        if (isFilepath)
//        {
//            isRegex = filepathEntity.getOperation() == OperationEnumeration.PATTERN_MATCH;
//        }
//        else
//        {
//            if (filenameEntity == null)
//            {
//                isRegex = pathEntity.getOperation() == OperationEnumeration.PATTERN_MATCH;
//            }
//            else
//            {
//                isRegex = filenameEntity.getOperation() == OperationEnumeration.PATTERN_MATCH || pathEntity.getOperation() == OperationEnumeration.PATTERN_MATCH;
//            }
//        }
//    }
//
//    private void setClassProperties()
//    {
//        if (fileObject != null)
//        {
//            if (fileObject.getFilepath() != null)
//            {
//                this.filepathEntity = fileObject.getFilepath();
//            }
//            if (fileObject.getFilename() != null)
//            {
//                this.filenameEntity = fileObject.getFilename().getValue();
//            }
//            if (fileObject.getPath() != null)
//            {
//                this.pathEntity = fileObject.getPath();
//            }
//            if (fileObject.getBehaviors() != null)
//            {
//                this.behaviors = fileObject.getBehaviors();
//            }
//        }
//        checkFilepathOrPath();
//        checkRecursiveSearchEnabled();
//        checkRegexSearchEnabled();
//    }
//
//    private String extractFileDrive(String path)
//    {
//        String regex = "((?=[A-Z]:\\\\)|(?<=[A-Z]:\\\\))";
//        String[] pathArray = path.split(regex);
//
//        if (pathArray.length > 2)
//        {
//            return pathArray[1];
//        }
//        else if (pathArray.length == 2)
//        {
//            return pathArray[0];
//        }
//        else
//        {
//            return "C:\\";
//        }
//    }
//
//    private String getOperationParameter(OperationEnumeration oprEnum)
//    {
//        switch (oprEnum)
//        {
//            case EQUALS:
//                return "-ceq";
//            case NOT_EQUAL:
//                return "-cne";
//            case PATTERN_MATCH:
//                return "-cmatch";
//        }
//        return "-eq";
//    }
//
//    private String extractFileExtensionForFilter(String filename)
//    {
//        String regex = "\\.(?=[a-zA-z0-9*]+)";
//        String[] filenameArray = filename.split(regex);
//
//        String fileExtension = filenameArray[filenameArray.length - 1];
//        return "'*." + fileExtension + "'";
//    }
//
//    private ArrayList<String> constructCommandArguments()
//    {
//        ArrayList<String> argumentList = new ArrayList<>();
//
//        argumentList.add("gci"); //Get-ChildItem cmdlet
//
//        String fileSearchLocation = constructFileSearchLocation(); //Specify file search location
//        argumentList.add(fileSearchLocation);
//
//        argumentList.add(constructRecursiveParameters());
//
//        if (filenameEntity != null)
//        {
//            argumentList.add("-filter");
//
//            if (isFilepath)
//            {
//                argumentList.add(extractFileExtensionForFilter(filepathEntity.getValue().toString()));
//            }
//            else
//            {
//                argumentList.add(extractFileExtensionForFilter(filenameEntity.getValue().toString()));
//            }
//        }
//        argumentList.add("-erroraction");
//        argumentList.add("silentlycontinue");
//
//        argumentList.add("|");
//        argumentList.add("where-object");
//        argumentList.add(constructFileParameters());
//        argumentList.add("|");
//
//        argumentList.add("select-object");
//        if (filenameEntity == null)
//        {
//            argumentList.add("directoryname");
//        }
//        else
//        {
//            argumentList.add("fullname");
//        }
//
//        return argumentList;
//    }
//
//    private String constructFileSearchLocation()
//    {
//        String fileSearchLocation;
//        if (behaviors.getWindowsView().equals("32_bit") && isWindowsOS64Bit(target))
//        {
//            if (isFilepath)
//            {
//                String filepath32Bit;
//                if (filepathEntity.getValue().toString().contains("Program Files"))
//                {
//                    filepath32Bit = filepathEntity.getValue().toString().replace("Program Files", "Program Files (x86)");
//                }
//                else if (filepathEntity.getValue().toString().contains("System32"))
//                {
//                    filepath32Bit = filepathEntity.getValue().toString().replace("System32", "SysWOW64");
//                }
//                else
//                {
//                    filepath32Bit = filepathEntity.getValue().toString();
//                }
//                filepathEntity.setValue(filepath32Bit);
//            }
//            else
//            {
//                String path32Bit;
//                if (pathEntity.getValue().toString().contains("Program Files"))
//                {
//                    path32Bit = pathEntity.getValue().toString().replace("Program Files", "Program Files (x86)");
//                }
//                else if (pathEntity.getValue().toString().contains("System32"))
//                {
//                    path32Bit = pathEntity.getValue().toString().replace("System32", "SysWOW64");
//                }
//                else
//                {
//                    path32Bit = pathEntity.getValue().toString();
//                }
//                pathEntity.setValue(path32Bit);
//            }
//
//        }
//
//        if (isRegex)
//        {
//            String fileDrive;
//            String pathOrFilepath; 
//                    
//            if (isFilepath)
//            {
//                pathOrFilepath = filepathEntity.getValue().toString();
//            }
//            else
//            {
//                pathOrFilepath = pathEntity.getValue().toString();
//            }
//            
//            fileDrive = extractFileDrive(pathOrFilepath);
//            if (pathOrFilepath.matches("(.*)Program Files(.*)"))
//            {
//                fileSearchLocation = fileDrive + "Program Files";
//            }
//            else if (pathOrFilepath.matches("(.*)C:\\\\\\\\Windows(.*)"))
//            {
//                fileSearchLocation = fileDrive + "Windows";
//            }
//            else if (pathOrFilepath.matches("(.*)Program Files (.*)"))
//            {
//                fileSearchLocation = fileDrive + "Program Files (x86)";
//            }
//            else
//            {
//                fileSearchLocation = fileDrive;
//            }
//            return "'" + fileSearchLocation + "'";
//        }
//        else if (isRecursive)
//        {
//            int depthSize = 1;
//            StringBuilder sb = new StringBuilder();
//            sb.append("'");
//            if (behaviors.getRecurseDirection().equals("up"))
//            {
//                depthSize = behaviors.getMaxDepth().intValue();
//                String tempPath = pathEntity.getValue().toString();
//                if (depthSize < 0) // Negative depth means no limitation on recursive depth
//                {
//                    while (!"".equals(tempPath))
//                    {
//                        int lastSlashIndex = tempPath.lastIndexOf("\\");
//                        tempPath = tempPath.substring(0, lastSlashIndex);
//                        if (tempPath.endsWith(":"))
//                        {
//                            sb.append(tempPath);
//                            sb.append("\\'");
//                            break;
//                        }
//                        else
//                        {
//                            sb.append(tempPath);
//                            sb.append("','");
//                        }
//                    }
//                }
//                else // When maxdepth > 0
//                {
//                    for (int index = 0; index < depthSize; index++)
//                    {
//                        int lastSlashIndex = tempPath.lastIndexOf("\\");
//                        tempPath = tempPath.substring(0, lastSlashIndex);
//                        sb.append(tempPath);
//                        if (index + 1 == depthSize)
//                        {
//                            sb.append("'");
//                        }
//                        else
//                        {
//                            sb.append("','");
//                        }
//                    }
//                }
//                return sb.toString();
//            }
//            else
//            {
//                fileSearchLocation = pathEntity.getValue().toString();
//            }
//        }
//        else
//        {
//            if (isFilepath)
//            {
//                fileSearchLocation = filepathEntity.getValue().toString();
//            }
//            else
//            {
//                fileSearchLocation = pathEntity.getValue().toString();
//            }
//        }
//        return "'" + fileSearchLocation + "'";
//    }
//
//    private String constructRecursiveParameters()
//    {
//        StringBuilder sb = new StringBuilder();
//
//        if (!isRecursive)
//        {
//            if (isRegex)
//            {
//                return "-recurse";
//            }
//            else
//            {
//                return "-depth 0";
//            }
//        }
//        else
//        {
//            if (behaviors.getRecurseDirection().equals("up"))
//            {
//                return "-depth 0"; // This will be handled in constructFileSearchLocation()
//            }
//            else
//            {
//                if (behaviors.getMaxDepth().intValue() == -1)
//                {
//                    return "-recurse";
//                }
//                else
//                {
//                    String maxDepth = behaviors.getMaxDepth().toString();
//                    return "-depth " + maxDepth;
//                }
//            }
//        }
//    }
//
//    private String constructFileParameters()
//    {
//        //"{$_.fullname " + "-match " + "'^C:\\\\support\\\\xml'-and $_.name -match 'section1.xml'}"
//        if (isFilepath)
//        {
//            String filepathArguments = "{$_.fullname" + getOperationParameter(filepathEntity.getOperation()) + " '" + filepathEntity.getValue().toString() + "'}";
//            return filepathArguments;
//        }
//        else if (isRecursive)
//        {
//            String recursiveFileArguments;
//            if (filenameEntity != null && filenameEntity.getValue() != null)
//            {
//                recursiveFileArguments = "{$_.name " + getOperationParameter(filenameEntity.getOperation()) + " '" + filenameEntity.getValue().toString() + "'}";
//            }
//            else
//            { //  {$_.name -like '*.*'}
//                recursiveFileArguments = "{$_.name -like '*.*'}";
//            }
//            return recursiveFileArguments;
//        }
//        else
//        {
//            String pathArguments = "{$_.directoryname " + getOperationParameter(pathEntity.getOperation()) + " '" + pathEntity.getValue().toString() + "'";
//            if (filenameEntity != null && filenameEntity.getValue() != null)
//            {
//                pathArguments = pathArguments + " -and " + "$_.name " + getOperationParameter(filenameEntity.getOperation()) + " '" + filenameEntity.getValue().toString() + "'";
//            }
//            pathArguments = pathArguments + "}";
//            return pathArguments;
//        }
//    }
//}
