
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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windowsfiletest;

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.windows.CollectedWindowsFileInfo;
import com.vulniq.client.securityanalyzer.oval.error.FilePropertyNotFoundException;
import com.vulniq.client.securityanalyzer.oval.error.NonExistentFilePropertyError;
import com.vulniq.client.securityanalyzer.oval.error.OSCommandTimedOutError;
import com.vulniq.client.securityanalyzer.utils.ScriptUtils;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PowerShellFilePropertiesUtils
{

    private static Logger logger = LoggerFactory.getLogger(PowerShellFilePropertiesUtils.class);
    private DataCollectionTarget target;
    private ArrayList<String> initialDockerArguments = new ArrayList<>();
    private String command;
    private final List<String> initialArgumentList;
    private int timeout = 240000;
    
    private String lastAccessTime;
    private String lastModificationTime;
    private String creationTime;

    private String language;
    private String originalFilename;
    private String internalName;
    private String productName;
    private String fileVersion;
    private String developmentClass;
    private String company;
    private String productVersion;
    private String owner;
    private String size;
    private List<String> attributes = new ArrayList<>();

    private static Map<DataCollectionTarget, Map<String, Optional<CollectedWindowsFileInfo>>> collectedInfoCache = new HashMap<>();

    /**
     * We use an Optional because we don't want to keep retrying for something that actually returns null
     * (it is unlikely to be null but just in case)
     * @param target
     * @param pathNameOperation
     * @return
     */
    private static synchronized Optional<CollectedWindowsFileInfo> getCollectedWindowsFileInfoFromCache(DataCollectionTarget target, String pathNameOperation)
    {
        if(collectedInfoCache.containsKey(target))
        {
            Map<String, Optional<CollectedWindowsFileInfo>> secondMap = collectedInfoCache.get(target);
            if(secondMap.containsKey(pathNameOperation))
            {
                Optional<CollectedWindowsFileInfo> optionalCollectedInfo = secondMap.get(pathNameOperation);
                return optionalCollectedInfo;
            }
        }
        return null;
    }

    private static synchronized void addCollectedWindowsFileInfoToCache(DataCollectionTarget target, String pathNameOperation, CollectedWindowsFileInfo collectedWindowsFileInfo)
    {
        if(!collectedInfoCache.containsKey(target))
        {
            collectedInfoCache.put(target, new HashMap<String, Optional<CollectedWindowsFileInfo>>());
        }
        Map<String, Optional<CollectedWindowsFileInfo>> secondMap = collectedInfoCache.get(target);
        if(collectedWindowsFileInfo==null)
        {
            Optional<CollectedWindowsFileInfo> optionalInfo = Optional.empty();
            secondMap.put(pathNameOperation, optionalInfo);
        }
        else
        {
            Optional<CollectedWindowsFileInfo> optionalInfo = Optional.of(collectedWindowsFileInfo);
            secondMap.put(pathNameOperation, optionalInfo);
        }
    }

    public PowerShellFilePropertiesUtils(DataCollectionTarget target)
    {
        this.target = target;
        initialDockerArguments.add("exec");
        initialDockerArguments.add(target.getTargetName());
        initialDockerArguments.add("powershell");
        initialDockerArguments.add("\"");
        if (target.getTargetType() == DataCollectionTargetType.Host)
        {
            command = "powershell";
            initialArgumentList = new ArrayList<>();
        }
        else
        {
            command = TerziConfiguration.getDockerCommand();
            initialArgumentList = new ArrayList<>();
            initialArgumentList.addAll(initialDockerArguments);
        }
    }
    
    public static String getFileContent(DataCollectionTarget target, String filepath) throws OSCommandTimedOutError, FilePropertyNotFoundException, NonExistentFilePropertyError
    {
        ArrayList<String> argumentList = new ArrayList<>();
        String command;
        int timeout = 240000;
        if (target.getTargetType() == DataCollectionTargetType.Host)
        {
            command = "powershell";
        }
        else
        {
            command = TerziConfiguration.getDockerCommand();
            argumentList.add("exec");
            argumentList.add(target.getTargetName());
            argumentList.add("powershell");
        }
        argumentList.add("Get-Content");
        //TODO escape
        argumentList.add("'" + filepath + "'");
        OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
        
        if (cmdOut.isErrorOccured())
        {
            throw new FilePropertyNotFoundException("An error occured in powershell session while getting file contents");
        }
        else if (cmdOut.isTimedOut())
        {
            throw new OSCommandTimedOutError("PowerShell timed out while getting file contents.", timeout);
        }
        else
        {
            if (cmdOut.getExitCode() == 0)
            {
                String cmdOutContents = cmdOut.getStdOut();
                if (cmdOutContents != null && !cmdOutContents.trim().equals(""))
                {
                    return cmdOutContents;
                }
            }
        }
        throw new NonExistentFilePropertyError("File " + filepath + " does not exist.");
    }

    /**
     * The development_class element allows the distinction to be made between the GDR development environment and the
     * QFE development environment.
     * This field holds the text found in front of the mmmmmm-nnnn version, for example srv03_gdr.
     * PowerShell command is in a similar form to: "(Get-Item
     * 'C:\Windows\System32\comctl32.dll').VersionInfo.FileVersion"
     *
     * @param filepath
     * @return Returns a string such as "WinBuild" or "19h1_release_svc_prod1" if the version is in the form of
     * "10.0.18362.1 (WinBuild.160101.0800)" or "10.0.18362.1016 (19h1_release_svc_prod1.200804-2022)" respectively.
     */
    public String getFileDevelopmentClass(String filepath)
    {
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        argumentList.add("(Get-item");
        //TODO escape
        argumentList.add("'" + filepath + "').VersionInfo.FileVersion");
        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            String fileFullVersion = handleCmdOutContent(cmdOut);
            String regex = "\\),\\(|\\)|\\(";
            String[] splittedVersionArray = fileFullVersion.split(regex);

            if (splittedVersionArray.length == 1)
            {
                return "";
            }
            else
            {
                String secondaryVersion = splittedVersionArray[1];
                String regexDevelopmentClass = "\\.";
                String[] secondaryVersionArray = secondaryVersion.split(regexDevelopmentClass);
                if (secondaryVersionArray.length == 1)
                {
                    return "";
                }
                else
                {
                    return secondaryVersionArray[0];
                }
            }
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.warn("getFileDevelopmentClass " + filepath + " threw NonExistentFilePropertyError", nonExistentFileProperty);
            return null;
        }
        catch (Exception ex)
        {
            logger.error("Cannot find development class property for file with filepath: " + filepath, ex);
            return null;
        }
    }

    /**
     * Gets the Windows properties for a given directory.
     *
     * @param filepath
     * @return Returns a CollectedWindowsFileInfo Object with properties that can be found for a directory.
     */
    public CollectedWindowsFileInfo getDirectoryAllInfo(String filepath)
    {
        //return from cache if it was already collected
        String cacheKey = filepath;
        Optional<CollectedWindowsFileInfo> fromCache = getCollectedWindowsFileInfoFromCache(this.target, cacheKey);
        if(fromCache!=null)
        {
            if(fromCache.isPresent())
            {
                return fromCache.get();
            }
            return null;
        }
        try
        {
            CollectedWindowsFileInfo fileInfo = new CollectedWindowsFileInfo();
            fileInfo.setFilepath(filepath);
            fileInfo.setPath(filepath);

            fileInfo.setOwner(getFileOwner(filepath));
            if (getFileTimeValues(filepath))
            {
                fileInfo.setaTime(getLastAccessTime());
                fileInfo.setcTime(getCreationTime());
                fileInfo.setmTime(getLastModificationTime());
            }
            fileInfo.setType(getFileType(filepath));

            List<String> attributeList = new ArrayList<>();
            attributeList.add("Directory");
            fileInfo.setAttribute(attributeList);

            addCollectedWindowsFileInfoToCache(this.target, cacheKey, fileInfo);
            return fileInfo;
        }
        catch (Exception ex)
        {
            logger.error("getFileAllInfo returning null due to unexpected exception", ex);
            addCollectedWindowsFileInfoToCache(this.target, cacheKey, null);
            return null;
        }
    }

    /**
     * Gets the Windows properties for a given file.
     *
     * @param filepath
     * @return Returns a CollectedWindowsFileInfo Object with properties that can be found for a file.
     */
    public CollectedWindowsFileInfo getFileAllInfo(String filepath)
    {
        //return from cache if it was already collected
        String cacheKey = filepath;
        Optional<CollectedWindowsFileInfo> fromCache = getCollectedWindowsFileInfoFromCache(this.target, cacheKey);
        if(fromCache!=null)
        {
            if(fromCache.isPresent())
            {
                return fromCache.get();
            }
            return null;
        }
        try
        {
            CollectedWindowsFileInfo fileInfo = new CollectedWindowsFileInfo();
            fileInfo.setFilepath(filepath);
            fileInfo.setFilename(getFilenameFromFilepath(filepath));
            fileInfo.setPath(getPathFromFilepath(filepath));

            fileInfo.setMsChecksum(getFileMsChecksum(filepath));
            fileInfo.setType(getFileType(filepath));

            if (setFileProperties(filepath))
            {
                fileInfo.setCompany(getCompany());
                fileInfo.setDevelopmentClass(getDevelopmentClass());
                fileInfo.setInternalName(getInternalName());
                fileInfo.setLanguage(getLanguage());
                fileInfo.setOriginalFilename(getOriginalFilename());
                fileInfo.setProductName(getProductName());
                fileInfo.setProductVersion(getProductVersion());
                fileInfo.setVersion(getFileVersion());
                fileInfo.setaTime(getLastAccessTime());
                fileInfo.setcTime(getCreationTime());
                fileInfo.setmTime(getLastModificationTime());
                fileInfo.setAttribute(getAttributes());
                fileInfo.setOwner(getOwner());
                fileInfo.setSize(getSize());
            }
            else
            {
                fileInfo.setAttribute(getFileAttributes(filepath));
                fileInfo.setOwner(getFileOwner(filepath));
                fileInfo.setSize(getSizeOfFile(filepath));
                if (getFileVersionInfoProperties(filepath))
                {
                    fileInfo.setCompany(getCompany());
                    fileInfo.setDevelopmentClass(getDevelopmentClass());
                    fileInfo.setInternalName(getInternalName());
                    fileInfo.setLanguage(getLanguage());
                    fileInfo.setOriginalFilename(getOriginalFilename());
                    fileInfo.setProductName(getProductName());
                    fileInfo.setProductVersion(getProductVersion());
                    fileInfo.setVersion(getFileVersion());
                }
                else
                {
                    fileInfo.setCompany(getFileCompanyName(filepath));
                    fileInfo.setDevelopmentClass(getFileDevelopmentClass(filepath));
                    fileInfo.setInternalName(getFileInternalName(filepath));
                    fileInfo.setLanguage(getFileLanguage(filepath));
                    fileInfo.setOriginalFilename(getFileOriginalName(filepath));
                    fileInfo.setProductName(getFileProductName(filepath));
                    fileInfo.setProductVersion(getFileProductVersion(filepath));
                    fileInfo.setVersion(getFileVersion(filepath));
                }

                if (getFileTimeValues(filepath))
                {
                    fileInfo.setaTime(getLastAccessTime());
                    fileInfo.setcTime(getCreationTime());
                    fileInfo.setmTime(getLastModificationTime());
                }
                else
                {
                    fileInfo.setaTime(getFileLastAccessTime(filepath));
                    fileInfo.setcTime(getFileCreationTime(filepath));
                    fileInfo.setmTime(getFileModificationTime(filepath));
                }
            }
            addCollectedWindowsFileInfoToCache(this.target, cacheKey, fileInfo);
            return fileInfo;
        }
        catch (Exception ex)
        {
            logger.error("getFileAllInfo returning null due to unexpected exception", ex);
            addCollectedWindowsFileInfoToCache(this.target, cacheKey, null);
            return null;
        }

    }
    
    public boolean setFileProperties (String filepath)
    { // $Content = (Get-Content 'C:\Users\kamuran\Desktop\PowerShellScripts\FileTestNew\trial2.ps1') -replace 'pathToBeReplaced', 
        //'C:\Program Files\Internet Explorer\iexplore.exe'; powershell -command $Content
        String scriptPath = ScriptUtils.getPowershellScriptFileAbsolutePath("getFileProperties.ps1");
        
        List<String> argumentList = new ArrayList<>();
        argumentList.add("\"$Content");
        argumentList.add("=");
        argumentList.add("(Get-Content");
        argumentList.add("'" + scriptPath + "')");
        argumentList.add("-replace");
        argumentList.add("'pathToBeReplaced',");
        //TODO escape
        argumentList.add("'" + filepath + "';");
        if(target.getTargetType() == DataCollectionTargetType.Docker)
        { // docker exec terzi-windows powershell -command $Content
            argumentList.add(TerziConfiguration.getDockerCommand());
            argumentList.add("exec");
            argumentList.add(target.getTargetName());
        }
        argumentList.add("powershell");
        argumentList.add("-command");
        argumentList.add("$Content\"");
        if(logger.isDebugEnabled())
        {
            logger.debug("setFileProperties argumentList=" + argumentList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, "powershell", argumentList.toArray(new String[argumentList.size()]));
            String scriptOutput = handleCmdOutContent(cmdOut);
            parseGetFileInfoScript(scriptOutput);
            return true;
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("setFileProperties threw NonExistentFilePropertyError", nonExistentFileProperty);
            return false;
        }
        catch (Exception ex)
        {
            logger.error("Error while collecting properties for file with filepath: " + filepath, ex);
            return false;
        }
    }

    private boolean parseGetFileInfoScript (String scriptOutput)
    {
        try (Scanner scanner = new Scanner(scriptOutput.trim()))
        {
            String line = null;
            while (scanner.hasNextLine())
            {
                line = scanner.nextLine();
                if (line == null)
                {
                    continue;
                }
                if (language == null)
                {
                    Pattern pattern = Pattern.compile("Language:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        this.language = m.group(1);
                    }
                }
                if (originalFilename == null)
                {
                    Pattern pattern = Pattern.compile("Original Filename:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        this.originalFilename = m.group(1);
                    }
                }
                if (internalName == null)
                {
                    Pattern pattern = Pattern.compile("Internal Name:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        this.internalName = m.group(1);
                    }
                }
                if (productName == null)
                {
                    Pattern pattern = Pattern.compile("Product Name:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        this.productName = m.group(1);
                    }
                }
                if (fileVersion == null)
                {
                    Pattern pattern = Pattern.compile("File Version:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        String regex = "\\),\\(|\\)|\\(";
                        String[] splittedVersionArray = m.group(1).split(regex);
                        this.fileVersion = splittedVersionArray[0];
                    }
                }
                if (developmentClass == null)
                {
                    Pattern pattern = Pattern.compile("File Version:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        String regex = "\\),\\(|\\)|\\(";
                        String[] splittedVersionArray = m.group(1).split(regex);

                        String devClass;
                        if (splittedVersionArray.length == 1)
                        {
                            devClass = "";
                        }
                        else
                        {
                            String secondaryVersion = splittedVersionArray[1];
                            String regexDevelopmentClass = "\\.";
                            String[] secondaryVersionArray = secondaryVersion.split(regexDevelopmentClass);
                            if (secondaryVersionArray.length == 1)
                            {
                                devClass = "";
                            }
                            else
                            {
                                devClass = secondaryVersionArray[0];
                            }
                        }
                        this.developmentClass = devClass;
                    }
                }
                if (company == null)
                {
                    Pattern pattern = Pattern.compile("Company Name:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        this.company = m.group(1);
                    }
                }
                if (productVersion == null)
                {
                    Pattern pattern = Pattern.compile("Product Version:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        this.productVersion = m.group(1);
                    }
                }
                if (creationTime == null)
                {
                    Pattern pattern = Pattern.compile("Creation Time:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        this.creationTime = m.group(1);
                    }
                }
                if (lastAccessTime == null)
                {
                    Pattern pattern = Pattern.compile("Last Access Time:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        this.lastAccessTime = m.group(1);
                    }
                }
                if (lastModificationTime == null)
                {
                    Pattern pattern = Pattern.compile("Last Write Time:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        this.lastModificationTime = m.group(1);
                    }
                }
                if (owner == null)
                {
                    Pattern pattern = Pattern.compile("Owner:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        this.owner = m.group(1);
                    }
                }
                if (size == null)
                {
                    Pattern pattern = Pattern.compile("Size:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        this.size = m.group(1);
                    }
                }
                if (attributes == null)
                {
                    Pattern pattern = Pattern.compile("Size:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        String[] attributeArray =  m.group(1).split(",");
                        for (String individualAttribute : attributeArray)
                        {
                            attributes.add(individualAttribute.trim());
                        }
                    }
                }
            }
            logger.debug("parseGetFileInfoScript return true");
            return true;
        }
        catch (Exception ex)
        {
            logger.error("Error in parseGetFileInfoScript", ex);
            return false;
        }
        
    }

    private String getFilenameFromFilepath(String filepath)
    {
        Path path = Paths.get(filepath);
        Path fileName = path.getFileName();

        return fileName.toString();
    }

    private String getPathFromFilepath(String filepath)
    {
        Path path = Paths.get(filepath);
        Path parent = path.getParent();

        return parent.toString();
    }



    /**
     * Checks whether a file or a folder exists with a given filepath.
     * PowerShell command is in a similar form to: "Test-Path C:\Windows\System32\comctlsa32.dll"
     *
     * @param filepath
     */
    public boolean checkFileOrFolderExists(String filepath)
    { // 
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        argumentList.add("Test-Path");
        //TODO escape
        argumentList.add("'" + filepath + "'");

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            String cmdletOut = handleCmdOutContent(cmdOut);
            return "True".equals(cmdletOut);
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info(nonExistentFileProperty.getMessage());
            return false;
        }
        catch (Exception ex)
        {
            logger.error("Cannot check whether file or folder exists with path: " + filepath, ex);
            return false;
        }
    }

    /**
     * The type element marks whether the file is a named pipe, standard file, etc.
     * These types are the return values for GetFileType. For directories, this element must have a status of 'does not
     * exist'.
     *
     * @param filepath
     * @return Returns a string which is the return value for GetFileType function in Win32 API.
     * https://docs.microsoft.com/en-us/windows/win32/api/fileapi/nf-fileapi-getfiletype
     */
    public String getFileType(String filepath)
    {
        String dockerWrapperScriptPath = ScriptUtils.getPowershellScriptFileAbsolutePath("dockerScriptWrapper.ps1");
        String hostWrapperScriptPath = ScriptUtils.getPowershellScriptFileAbsolutePath("hostScriptWrapper.ps1");
        String getFileTypeScriptPath = ScriptUtils.getPowershellScriptFileAbsolutePath("getFileType.ps1");
        String actualCommand = this.command;
        command = "powershell";

        List<String> psScriptList = new ArrayList<>();
        psScriptList.add("-executionpolicy");
        psScriptList.add("bypass");

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            psScriptList.add("\"&('" + dockerWrapperScriptPath + "')");
        }
        else
        {
            psScriptList.add("\"&('" + hostWrapperScriptPath + "')");
        }

        psScriptList.add("-scriptPath");
        psScriptList.add("'" + getFileTypeScriptPath + "'");

        psScriptList.add("-filePath");
        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            //TODO escape
            psScriptList.add("'" + filepath + "'");
            psScriptList.add("-targetName");
            psScriptList.add(target.getTargetName() + "\"");
        }
        else
        {
            psScriptList.add("'" + filepath + "'\"");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getFileType psScriptList=" + psScriptList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, psScriptList.toArray(new String[psScriptList.size()]));
            String fileType = handleCmdOutContent(cmdOut);
            command = actualCommand;
            return fileType;
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("NonExistentFilePropertyError in getFileType:" + nonExistentFileProperty.getMessage());
            command = actualCommand;
            return null;
        }
        catch (Exception ex)
        {
            logger.error("getFileType Cannot find type property for file with filepath: " + filepath, ex);
            command = actualCommand;
            return null;
        }

    }

    /**
     * The checksum of the file as supplied by Microsoft's MapFileAndCheckSum function.
     * Calls the PowerShell script located in scripts/powershell (or under resources when running unit tests) in a similar format to:
     * "powershell -executionpolicy bypass "&('C:\abc\checksumDockerWrapper.ps1') -scriptPath
     * 'C:\abc\mapFileAndChecksum.ps1' -filePath 'C:\Program Files\Internet Explorer\iexplore.exe' -targetName
     * terzi-windows"
     *
     * @param filepath
     * @return Returns a checksum value as a String which is calculated with the below function.
     * https://docs.microsoft.com/en-us/windows/win32/api/imagehlp/nf-imagehlp-mapfileandchecksuma
     */
    public String getFileMsChecksum(String filepath)
    {
        String dockerWrapperScriptPath = ScriptUtils.getPowershellScriptFileAbsolutePath("dockerScriptWrapper.ps1");
        String hostWrapperScriptPath = ScriptUtils.getPowershellScriptFileAbsolutePath("hostScriptWrapper.ps1");
        String checksumScriptPath = ScriptUtils.getPowershellScriptFileAbsolutePath("mapFileAndChecksum.ps1");
        String actualCommand = this.command;
        command = "powershell";

        List<String> psScriptList = new ArrayList<>();
        psScriptList.add("-executionpolicy");
        psScriptList.add("bypass");

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            psScriptList.add("\"&('" + dockerWrapperScriptPath + "')");
        }
        else
        {
            psScriptList.add("\"&('" + hostWrapperScriptPath + "')");
        }

        psScriptList.add("-scriptPath");
        psScriptList.add("'" + checksumScriptPath + "'");

        psScriptList.add("-filePath");
        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            //TODO escape
            psScriptList.add("'" + filepath + "'");
            psScriptList.add("-targetName");
            psScriptList.add(target.getTargetName() + "\"");
        }
        else
        {
            psScriptList.add("'" + filepath + "'\"");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getFileMsChecksum psScriptList=" + psScriptList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, psScriptList.toArray(new String[psScriptList.size()]));
            String msChecksum = handleCmdOutContent(cmdOut);
            command = actualCommand;
            return msChecksum;
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("NonExistentFilePropertyError in getFileMsChecksum:" + nonExistentFileProperty.getMessage());
            command = actualCommand;
            return null;
        }
        catch (Exception ex)
        {
            logger.error("Cannot find Microsoft checksum property for file with filepath: " + filepath, ex);
            command = actualCommand;
            return null;
        }
    }

    /**
     * This entity defines an internal name to be found within the version-information structure.
     * PowerShell command is in a similar form to: "$x=[System.Diagnostics.FileVersionInfo]::GetVersionInfo('C:\Program
     * Files\Internet Explorer\iexplore.exe') ; $x.InternalName"
     *
     * @param filepath
     * @return Returns file internal name property as a string.
     */
    public String getFileInternalName(String filepath)
    {
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        //TODO escape
        argumentList.add("$versionInfo=[System.Diagnostics.FileVersionInfo]::GetVersionInfo('" + filepath + "');");
        argumentList.add("$versionInfo.InternalName");

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getFileInternalName argumentList=" + argumentList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            String internalName = handleCmdOutContent(cmdOut);
            return internalName;
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("NonExistentFilePropertyError in getFileInternalName:" + nonExistentFileProperty.getMessage());
            return null;
        }
        catch (Exception ex)
        {
            logger.error("Cannot find internal name property for file with filepath: " + filepath, ex);
            return null;
        }
    }
    
    /**
     * This entity defines a product name to be found within the version-information structure.
     * PowerShell command is in a similar form to: "$x=[System.Diagnostics.FileVersionInfo]::GetVersionInfo('C:\Program
     * Files\Internet Explorer\iexplore.exe') ; $x.ProductName"
     *
     * @param filepath
     * @return Returns file product name property as a string.
     */
    public String getFileProductName(String filepath)
    {
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        //TODO escape
        argumentList.add("$versionInfo=[System.Diagnostics.FileVersionInfo]::GetVersionInfo('" + filepath + "');");
        argumentList.add("$versionInfo.ProductName");

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getFileProductName argumentList=" + argumentList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            String productName = handleCmdOutContent(cmdOut);
            return productName;
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("NonExistentFilePropertyError in getFileProductName:" + nonExistentFileProperty.getMessage());
            return null;
        }
        catch (Exception ex)
        {
            logger.error("Cannot find product name property for file with filepath: " + filepath, ex);
            return null;
        }
    }

    /**
     * This entity defines a language to be found within the version-information structure.
     * PowerShell command is in a similar form to: "$x=[System.Diagnostics.FileVersionInfo]::GetVersionInfo('C:\Program
     * Files\Internet Explorer\iexplore.exe') ; $x.Language"
     *
     * @param filepath
     * @return Returns file language property as a string.
     */
    public String getFileLanguage(String filepath)
    {
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        //TODO escape
        argumentList.add("$versionInfo=[System.Diagnostics.FileVersionInfo]::GetVersionInfo('" + filepath + "');");
        argumentList.add("$versionInfo.Language");

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getFileLanguage argumentList=" + argumentList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            String fileLanguage = handleCmdOutContent(cmdOut);
            return fileLanguage;
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("NonExistentFilePropertyError in getFileLanguage:" + nonExistentFileProperty.getMessage());
            return null;
        }
        catch (Exception ex)
        {
            logger.error("Cannot find language property for file with filepath: " + filepath, ex);
            return null;
        }
    }

    /**
     * This entity defines an original filename to be found within the version-information structure.
     * PowerShell command is in a similar form to: "$x=[System.Diagnostics.FileVersionInfo]::GetVersionInfo('C:\Program
     * Files\Internet Explorer\iexplore.exe') ; $x.OriginalFilename"
     *
     * @param filepath
     * @return Returns file original name property as a string.
     */
    public String getFileOriginalName(String filepath)
    {
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        //TODO escape
        argumentList.add("$versionInfo=[System.Diagnostics.FileVersionInfo]::GetVersionInfo('" + filepath + "');");
        argumentList.add("$versionInfo.OriginalFilename");

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getFileOriginalName argumentList=" + argumentList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            String originalFileName = handleCmdOutContent(cmdOut);
            return originalFileName;
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("NonExistentFilePropertyError in getFileOriginalName:" + nonExistentFileProperty.getMessage());
            return null;
        }
        catch (Exception ex)
        {
            logger.error("Cannot find original filename property for file with filepath: " + filepath, ex);
            return null;
        }
    }

    /**
     * The attribute element marks a Windows file attribute, these types are the return values for GetFileAttribute.
     * The attribute element can be included multiple times in a system characteristic item in order to record that a
     * file has a number of different attributes.
     * PowerShell command is in a similar form to: "gci iexplore.exe | Select-Object Attributes"
     *
     * @param filepath
     * @return Returns file attribute properties in List.
     */
    public List<String> getFileAttributes(String filepath)
    {
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        argumentList.add("gci");
        //TODO escape
        argumentList.add("'" + filepath + "'");
        argumentList.add("|");
        argumentList.add("select-object");
        argumentList.add("attributes");

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getFileAttributes argumentList=" + argumentList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            String attributeString = handleCmdOutContent(cmdOut);

            String[] attributeArray = attributeString.split(",");
            List<String> attributeList = new ArrayList<>();
            for (String individualAttribute : attributeArray)
            {
                attributeList.add(individualAttribute.trim());
            }
            return attributeList;
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("NonExistentFilePropertyError in getFileAttributes:" + nonExistentFileProperty.getMessage());
            return null;
        }
        catch (Exception ex)
        {
            logger.error("Cannot find attributes property for file with filepath: " + filepath, ex);
            return null;
        }

    }

    /**
     * This entity defines a company name to be found within the version-information structure.
     * PowerShell command is in a similar form to: "(Get-Item
     * 'C:\Windows\System32\comctl32.dll').VersionInfo.CompanyName"
     *
     * @param filepath
     * @return Returns file company property as a string.
     */
    public String getFileCompanyName(String filepath)
    {
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        argumentList.add("(Get-item");
        //TODO escape
        argumentList.add("'" + filepath + "').VersionInfo.CompanyName");
        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getFileCompanyName argumentList=" + argumentList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            return handleCmdOutContent(cmdOut);
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("NonExistentFilePropertyError in getFileCompanyName:" + nonExistentFileProperty.getMessage());
            return null;
        }
        catch (Exception ex)
        {
            logger.error("Cannot find company name property for file with filepath: " + filepath, ex);
            return null;
        }
    }

    /**
     * The version element is the delimited version string of the file.
     * PowerShell command is in a similar form to: "(Get-Item
     * 'C:\Windows\System32\comctl32.dll').VersionInfo.FileVersion"
     *
     * @param filepath
     * @return Returns file version property as a string.
     */
    public String getFileVersion(String filepath)
    {
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        argumentList.add("(Get-item");
        //TODO escape
        argumentList.add("'" + filepath + "').VersionInfo.FileVersion");
        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getFileVersion argumentList=" + argumentList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            String fileFullVersion = handleCmdOutContent(cmdOut);
            String regex = "\\),\\(|\\)|\\(";
            String[] splittedVersionArray = fileFullVersion.split(regex);
            return splittedVersionArray[0];
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("NonExistentFilePropertyError in getFileVersion: " + nonExistentFileProperty.getMessage());
            return null;
        }
        catch (Exception ex)
        {
            logger.error("Cannot find version property for file with filepath: " + filepath, ex);
            return null;
        }
    }

    /**
     * This entity defines the product version held within the version-information structure.
     * This may not necessarily be a string compatible with the OVAL version datatype.
     * PowerShell command is in a similar form to: "(Get-Item
     * 'C:\Windows\System32\comctl32.dll').VersionInfo.ProductVersion"
     *
     * @param filepath
     * @return Returns file production version property as a string.
     */
    public String getFileProductVersion(String filepath)
    {
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        argumentList.add("(Get-item");
        //TODO escape
        argumentList.add("'" + filepath + "').VersionInfo.ProductVersion");
        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getFileProductVersion argumentList=" + argumentList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            return handleCmdOutContent(cmdOut);
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("NonExistentFilePropertyError in getFileProductVersion:" + nonExistentFileProperty.getMessage());
            return null;
        }
        catch (Exception ex)
        {
            logger.error("Cannot find product version property for file with filepath: " + filepath, ex);
            return null;
        }
    }

    /**
     * The owner element is a string that contains the name of the owner.
     * The name should be specified in the "DOMAIN\\username" format.
     * PowerShell command is in a similar form to: "get-acl iexplore.exe | select-object Owner"
     *
     * @param filepath
     * @return Returns file owner property as a string.
     */
    public String getFileOwner(String filepath)
    {
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        argumentList.add("Get-acl");
        //TODO escape
        argumentList.add("'" + filepath + "'");
        argumentList.add("|");
        argumentList.add("select");
        argumentList.add("owner");

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getFileOwner argumentList=" + argumentList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            return handleCmdOutContent(cmdOut);
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("NonExistentFilePropertyError in getFileOwner:" + nonExistentFileProperty.getMessage());
            return null;
        }
        catch (Exception ex)
        {
            logger.error("Cannot find file owner property for file with filepath: " + filepath, ex);
            return null;
        }
    }
    
    /**
     * Sets the instance properties of creation time, last access time and last modification time.
     * PowerShell command is in a similar form to: "$Item = Get-Item 'iexplore.exe'; $Item.LastWriteTimeUtc.ToFileTime();
     * $Item.LastAccessTimeUtc.ToFileTime();$Item.CreationTimeUtc.ToFileTime();"
     * 
     *
     * @param filepath
     * @return Returns a boolean indicating the success of the method.
     */
    public boolean getFileTimeValues (String filepath)
    {
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        argumentList.add("$Item");
        argumentList.add("=");
        
        argumentList.add("Get-item");
        //TODO escape
        argumentList.add("'" + filepath + "';");
        argumentList.add("$Item.LastWriteTimeUtc.ToFileTime();");
        argumentList.add("$Item.LastAccessTimeUtc.ToFileTime();");
        argumentList.add("$Item.CreationTimeUtc.ToFileTime();\"");
        if(logger.isDebugEnabled())
        {
            logger.debug("getFileTimeValues argumentList=" + argumentList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            String cmdOutContent = handleCmdOutContent(cmdOut);
            String[] splittedArray = splitFromNewLine(cmdOutContent);
            this.lastModificationTime = splittedArray[0];
            this.lastAccessTime = splittedArray[1];
            this.creationTime = splittedArray[2];
            return true;
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.error("NonExistentFilePropertyError in getFileTimeValues: " + nonExistentFileProperty.getMessage());
            return false;
        }
        catch (Exception ex)
        {
            logger.error("Cannot find relevant time value properties for file with filepath: " + filepath, ex);
            return false;
        }
    }

    private String[] splitFromNewLine(String stringToBeSplitted)
    {
        String regex = "\\r?\\n";

        return stringToBeSplitted.split(regex);
    }

    /**
     * Time of last modification of file.
     * The string should represent the FILETIME structure which is a 64-bit value representing the number of
     * 100-nanosecond intervals since January 1, 1601 (UTC).
     * PowerShell command is in a similar form to: "(Get-item 'C:\Program Files\Internet
     * Explorer\iexplore.exe').LastWriteTimeUtc.ToFileTime()"
     *
     * @param filepath
     * @return Returns file last modification time property as a string.
     */
    public String getFileModificationTime(String filepath)
    {
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        argumentList.add("(Get-item");
        //TODO escape
        argumentList.add("'" + filepath + "').LastWriteTimeUtc.ToFileTime()");

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getFileModificationTime argumentList=" + argumentList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            return handleCmdOutContent(cmdOut);
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("NonExistentFilePropertyError in getFileModificationTime:" + nonExistentFileProperty.getMessage());
            return null;
        }
        catch (Exception ex)
        {
            logger.error("Cannot find last modification time property for file with filepath: " + filepath, ex);
            return null;
        }
    }

    /**
     * Time of last access of file. Valid on NTFS but not on FAT formatted disk drives.
     * The string should represent the FILETIME structure which is a 64-bit value representing the number of
     * 100-nanosecond intervals since January 1, 1601 (UTC).
     * PowerShell command is in a similar form to: " (Get-item 'C:\Program Files\Internet
     * Explorer\iexplore.exe').LastAccessTimeUtc.ToFileTime()"
     *
     * @param filepath
     * @return Returns file last access time property as a string.
     */
    public String getFileLastAccessTime(String filepath)
    {
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        argumentList.add("(Get-item");
        //TODO escape
        argumentList.add("'" + filepath + "').LastAccessTimeUtc.ToFileTime()");

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getFileLastAccessTime argumentList=" + argumentList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            return handleCmdOutContent(cmdOut);
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("NonExistentFilePropertyError in getFileLastAccessTime:" + nonExistentFileProperty.getMessage());
            return null;
        }
        catch (Exception ex)
        {
            logger.error("Cannot find last access time property for file with filepath: " + filepath, ex);
            return null;
        }
    }

    /**
     * Time of creation of file. Valid on NTFS but not on FAT formatted disk drives.
     * The string should represent the FILETIME structure which is a 64-bit value representing the number of
     * 100-nanosecond intervals since January 1, 1601 (UTC).
     * PowerShell command is in a similar form to: " (Get-item 'C:\Program Files\Internet
     * Explorer\iexplore.exe').CreationTimeUtc.ToFileTime()"
     *
     * @param filepath
     * @return Returns file creation time property as a string.
     */
    public String getFileCreationTime(String filepath)
    {
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        argumentList.add("(Get-item");
        //TODO escape
        argumentList.add("'" + filepath + "').CreationTimeUtc.ToFileTime()");

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getFileCreationTime argumentList=" + argumentList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            return handleCmdOutContent(cmdOut);
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("NonExistentFilePropertyError in getFileCreationTime:" + nonExistentFileProperty.getMessage());
            return null;
        }
        catch (Exception ex)
        {
            logger.error("Cannot find creation time property for file with filepath: " + filepath, ex);
            return null;
        }
    }

    /**
     * The size element is the size of the file in bytes.
     * PowerShell command is in a similar form to: "gci 'C:\Program Files\Internet Explorer\iexplore.exe' | select
     * length"
     *
     * @param filepath
     * @return Returns file size property as a string.
     */
    public String getSizeOfFile(String filepath)
    {
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        argumentList.add("gci");
        //TODO escape
        argumentList.add("'" + filepath + "'");
        argumentList.add("|");
        argumentList.add("select");
        argumentList.add("length");

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getSizeOfFile argumentList=" + argumentList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            return handleCmdOutContent(cmdOut);
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("NonExistentFilePropertyError in getSizeOfFile:" + nonExistentFileProperty.getMessage());
            return null;
        }
        catch (Exception ex)
        {
            logger.error("Cannot find size property for file with filepath: " + filepath, ex);
            return null;
        }
    }

    /**
     * The system username.
     *
     * @return Returns system username as a string.
     */
    public String getSystemUsername()
    {
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        argumentList.add("$env:USERNAME");

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getSystemUsername argumentList=" + argumentList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            return handleCmdOutContent(cmdOut);
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("NonExistentFilePropertyError in getSystemUsername:" + nonExistentFileProperty.getMessage());
            return null;
        }
        catch (Exception ex)
        {
            logger.error("Cannot find system username", ex);
            return null;
        }
    }

    /**
     * The system user domain.
     *
     * @return Returns system user domain as a string.
     */
    public String getSystemUserDomain()
    {
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        argumentList.add("$env:USERDOMAIN");

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getSystemUserDomain argumentList=" + argumentList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            return handleCmdOutContent(cmdOut);
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("NonExistentFilePropertyError in getSystemUserDomain:" + nonExistentFileProperty.getMessage());
            return null;
        }
        catch (Exception ex)
        {
            logger.error("Cannot find system user domain", ex);
            return null;
        }
    }

    private String handleCmdOutContent(OSCommandOutput cmdOut) throws FileNotFoundException, Exception, OSCommandTimedOutError
    {
        if (cmdOut.isErrorOccured())
        {
            throw new FilePropertyNotFoundException("An error occured in powershell session when searching for a file property.");
        }
        else if (cmdOut.isTimedOut())
        {
            throw new OSCommandTimedOutError("PowerShell timed out.", timeout);
        }
        else
        {
            if (cmdOut.getExitCode() == 0)
            {
                String cmdOutContents = cmdOut.getStdOut();
                if (cmdOutContents != null && !cmdOutContents.trim().equals(""))
                {
                    return trimCmdOutContent(cmdOutContents);
                }
            }
        }
        throw new NonExistentFilePropertyError("File property does not exist.");
    }

    private String trimCmdOutContent(String cmdOutContent)
    {
        String titleSplitRegex = "(?<=-)-\\s+";
        String[] titleSplittedArray = cmdOutContent.trim().split(titleSplitRegex);

        if (titleSplittedArray.length == 1)
        {
            return titleSplittedArray[0].trim();
        }
        else
        {
            return titleSplittedArray[1].trim();
        }
    }
    
    /**
     * Sets the instance properties related to file version info such as version, filename, company name etc.
     * PowerShell command is in a similar form to: "[System.Diagnostics.FileVersionInfo]::GetVersionInfo('C:\Program Files\Internet Explorer\iexplore.exe') | format-list *"
     * 
     *
     * @param filepath
     * @return Returns a boolean indicating the success of the method.
     */
    public boolean getFileVersionInfoProperties (String filepath)
    {
        List<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);
        //TODO escape
        argumentList.add("[System.Diagnostics.FileVersionInfo]::GetVersionInfo('" + filepath + "')");
        argumentList.add("|");
        argumentList.add("Format-List");
        argumentList.add("*");

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getFileVersionInfoProperties argumentList=" + argumentList);
        }
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            String fileVersionInfoProperties = handleCmdOutContent(cmdOut);
            return parseFileVersionInfoProperties(fileVersionInfoProperties);
        }
        catch (NonExistentFilePropertyError nonExistentFileProperty)
        {
            logger.info("NonExistentFilePropertyError in getFileVersionInfoProperties:" + nonExistentFileProperty.getMessage());
            return false;
        }
        catch (Exception ex)
        {
            logger.error("Error while collecting VersionInfo related properties for file with filepath: " + filepath, ex);
            return false;
        }
    }
    
    private boolean parseFileVersionInfoProperties(String fileVersionInfoProperties)
    {
        try (Scanner scanner = new Scanner(fileVersionInfoProperties))
        {
            String line = null;
            while (scanner.hasNextLine())
            {
                line = scanner.nextLine();
                if (line == null)
                {
                    continue;

                }
                if (language == null)
                {
                    Pattern pattern = Pattern.compile("Language\\s*:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        this.language = m.group(1);
                    }
                }
                if (originalFilename == null)
                {
                    Pattern pattern = Pattern.compile("OriginalFilename\\s*:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        this.originalFilename = m.group(1);
                    }
                }
                if (internalName == null)
                {
                    Pattern pattern = Pattern.compile("InternalName\\s*:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        this.internalName = m.group(1);
                    }
                }
                if (productName == null)
                {
                    Pattern pattern = Pattern.compile("ProductName\\s*:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        this.productName = m.group(1);
                    }
                }
                if (fileVersion == null)
                {
                    Pattern pattern = Pattern.compile("FileVersion\\s*:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        String regex = "\\),\\(|\\)|\\(";
                        String[] splittedVersionArray = m.group(1).split(regex);
                        this.fileVersion = splittedVersionArray[0];
                    }
                }
                if (developmentClass == null)
                {
                    Pattern pattern = Pattern.compile("FileVersion\\s*:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        String regex = "\\),\\(|\\)|\\(";
                        String[] splittedVersionArray = m.group(1).split(regex);

                        String devClass;
                        if (splittedVersionArray.length == 1)
                        {
                            devClass = "";
                        }
                        else
                        {
                            String secondaryVersion = splittedVersionArray[1];
                            String regexDevelopmentClass = "\\.";
                            String[] secondaryVersionArray = secondaryVersion.split(regexDevelopmentClass);
                            if (secondaryVersionArray.length == 1)
                            {
                                devClass = "";
                            }
                            else
                            {
                                devClass = secondaryVersionArray[0];
                            }
                        }
                        this.developmentClass = devClass;
                    }
                }
                if (company == null)
                {
                    Pattern pattern = Pattern.compile("CompanyName\\s*:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        this.company = m.group(1);
                    }
                }
                if (productVersion == null)
                {
                    Pattern pattern = Pattern.compile("ProductVersion\\s*:\\s*(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        this.productVersion = m.group(1);
                    }
                }
            }
            return true;
        }
        catch (Exception ex)
        {
            logger.error("Error in parseFileVersionInfoProperties", ex);
            return false;
        }
    }

    public String getOwner()
    {
        return owner;
    }

    public String getSize()
    {
        return size;
    }

    public List<String> getAttributes()
    {
        return attributes;
    }
    
    public String getLanguage()
    {
        return language;
    }


    public String getOriginalFilename()
    {
        return originalFilename;
    }


    public String getInternalName()
    {
        return internalName;
    }

    public String getProductName()
    {
        return productName;
    }

    public String getFileVersion()
    {
        return fileVersion;
    }

    public String getDevelopmentClass()
    {
        return developmentClass;
    }

    public String getCompany()
    {
        return company;
    }

    public String getProductVersion()
    {
        return productVersion;
    }

    public String getLastAccessTime()
    {
        return lastAccessTime;
    }

    public String getLastModificationTime()
    {
        return lastModificationTime;
    }

    public String getCreationTime()
    {
        return creationTime;
    }
}
