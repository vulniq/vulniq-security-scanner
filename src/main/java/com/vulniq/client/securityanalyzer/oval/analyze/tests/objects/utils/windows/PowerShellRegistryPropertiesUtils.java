
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
import com.vulniq.client.securityanalyzer.oval.error.NonExistentRegistryPropertyError;
import com.vulniq.client.securityanalyzer.oval.error.OSCommandTimedOutError;
import com.vulniq.client.securityanalyzer.utils.ScriptUtils;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.EntitySimpleBaseType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateAnySimpleType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PowerShellRegistryPropertiesUtils
{

    private RegistryObject objectDefinition;
    private final DataCollectionTarget target;
    private final int timeout = 120000;
    private final ArrayList<String> initialDockerArguments = new ArrayList<>();
    private final ArrayList<String> initialArgumentList;
    private final String command;
    private final Logger logger = LoggerFactory.getLogger(PowerShellRegistryPropertiesUtils.class);

    private static Map<DataCollectionTarget, Map<String, Optional<CollectedWindowsRegistryInfo>>> collectedInfoCache = new HashMap<>();

    /**
     * We use an Optional because we don't want to keep retrying for something that actually returns null
     * (it is unlikely to be null but just in case)
     * @param target
     * @param pathNameOperation
     * @return
     */
    private static synchronized Optional<CollectedWindowsRegistryInfo> getCollectedWindowsRegistryInfoFromCache(DataCollectionTarget target, String pathNameOperation)
    {
        if(collectedInfoCache.containsKey(target))
        {
            Map<String, Optional<CollectedWindowsRegistryInfo>> secondMap = collectedInfoCache.get(target);
            if(secondMap.containsKey(pathNameOperation))
            {
                Optional<CollectedWindowsRegistryInfo> optionalCollectedWindowsRegistryInfo = secondMap.get(pathNameOperation);
                return optionalCollectedWindowsRegistryInfo;
            }
        }
        return null;
    }

    private static synchronized void addCollectedWindowsRegistryInfoToCache(DataCollectionTarget target, String pathNameOperation, CollectedWindowsRegistryInfo collectedWindowsRegistryInfo)
    {
        if(!collectedInfoCache.containsKey(target))
        {
            collectedInfoCache.put(target, new HashMap<String, Optional<CollectedWindowsRegistryInfo>>());
        }
        Map<String, Optional<CollectedWindowsRegistryInfo>> secondMap = collectedInfoCache.get(target);
        if(collectedWindowsRegistryInfo==null)
        {
            Optional<CollectedWindowsRegistryInfo> optionalCollectedWindowsRegistryInfo = Optional.empty();
            secondMap.put(pathNameOperation, optionalCollectedWindowsRegistryInfo);
        }
        else
        {
            Optional<CollectedWindowsRegistryInfo> optionalCollectedWindowsRegistryInfo = Optional.of(collectedWindowsRegistryInfo);
            secondMap.put(pathNameOperation, optionalCollectedWindowsRegistryInfo);
        }
    }

    public PowerShellRegistryPropertiesUtils(DataCollectionTarget target)
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
    private String splitHiveFromRegistryPath (String registryPath)
    {
        Pattern pattern = Pattern.compile("HKEY.*?(?=\\\\)");
        Matcher matcher = pattern.matcher(registryPath);
        matcher.find();
        String rv = matcher.group(0);
        logger.debug("splitHiveFromRegistryPath return: " + rv);
        return rv;
    }
    
    private String splitKeyFromRegistryPath (String registryPath)
    {
        String substringBeginAtFirstSlash = registryPath.substring(registryPath.indexOf("\\")+1);
        String substringBeginAtSecondSlash = substringBeginAtFirstSlash.substring(substringBeginAtFirstSlash.indexOf("\\") +1 );
        logger.debug("splitKeyFromRegistryPath return: " + substringBeginAtSecondSlash);
        return substringBeginAtSecondSlash;
    }
    
    private String getOperationParameter(OperationEnumeration oprEnum)
    {
        switch (oprEnum)
        {
            case EQUALS:
                return "-ceq";
            case NOT_EQUAL:
                return "-cne";
            case PATTERN_MATCH:
                return "-cmatch";
        }
        return "-eq";
    }

    /**
     * this is the entry point to this class
     * results will be cached
     * @param registryPath
     * @param entryName
     * @param operationForEntryName
     * @return
     * @throws Exception
     */
    public CollectedWindowsRegistryInfo getRegistryProperties(String registryPath, String entryName, OperationEnumeration operationForEntryName) throws Exception
    {
        //return from cache if it was already collected
        String cacheKey = registryPath + "--" + entryName + "--" + operationForEntryName;
        Optional<CollectedWindowsRegistryInfo> fromCache = getCollectedWindowsRegistryInfoFromCache(this.target, cacheKey);
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
            CollectedWindowsRegistryInfo collectedInfo = new CollectedWindowsRegistryInfo();
            collectedInfo.setLastWriteTime(getLastWriteTime(registryPath)); // Set LastWriteTime
            collectedInfo.setHive(splitHiveFromRegistryPath(registryPath));
            collectedInfo.setKey(splitKeyFromRegistryPath(registryPath));
            collectedInfo.setName(entryName);
            EntitySimpleBaseType collectedValue = new EntityStateAnySimpleType();

            String registryEntryType;
            if (entryName == null)
            {
                collectedValue.setValue(null);
                collectedInfo.setValue(collectedValue);
                return collectedInfo;
            }
            else if (!entryName.equals(""))
            {
                registryEntryType = convertPowerShellTypeToRegistryType(getRegistryEntryType(registryPath, entryName, operationForEntryName));
            }
            else
            {
                registryEntryType = "REG_SZ";
            }


            collectedInfo.setType(registryEntryType); // Set Type

            String registryValue;

            switch (registryEntryType) //Set Value
            {
                case ("REG_BINARY"):
                    registryValue = getRegistryEntryHexValue(registryPath, entryName);
                    collectedValue.setValue(registryValue);
                    collectedValue.setDatatype("binary");
                    break;
                case ("REG_EXPAND_SZ"):
                    registryValue = getRegistryEntryValue(registryPath, entryName, operationForEntryName);
                    collectedValue.setValue(registryValue);
                    collectedValue.setDatatype("String");
                    collectedInfo.setExpandedValue(getRegistryEntryExpandedValue(registryPath, entryName));
                    break;
                case ("REG_MULTI_SZ"):
                    registryValue = getRegistryEntryValue(registryPath, entryName, operationForEntryName);
                    String[] registryValueSplitted = splitFromNewLine(registryValue);
                    collectedValue.setValue(registryValueSplitted);
                    collectedValue.setDatatype("String");
                    break;
                case ("REG_SZ"):
                case ("RED_DWORD"):
                case ("RED_QWORD"):
                    registryValue = getRegistryEntryValue(registryPath, entryName, operationForEntryName);
                    collectedValue.setValue(registryValue);
                    collectedValue.setDatatype("String");
                    break;
                default:
                    registryValue = getRegistryEntryValue(registryPath, entryName, operationForEntryName);
                    collectedValue.setValue(registryValue);
                    collectedValue.setDatatype("String");
                    break;
            }
            collectedInfo.setValue(collectedValue);
            logger.debug("getRegistryProperties return: " + collectedInfo);
            addCollectedWindowsRegistryInfoToCache(this.target, cacheKey, collectedInfo);
            return collectedInfo;
        }
        catch (Exception ex)
        {
            logger.error("getRegistryProperties returning null due to unexpected exception", ex);
            addCollectedWindowsRegistryInfoToCache(this.target, cacheKey, null);
            return null;
        }
    }

    private String handleCmdOutContent(OSCommandOutput cmdOut) throws FileNotFoundException, Exception, OSCommandTimedOutError, NonExistentRegistryPropertyError
    {
        if (cmdOut.isErrorOccured())
        {
            throw new FileNotFoundException();
        }
        else if (cmdOut.isTimedOut())
        {
            throw new OSCommandTimedOutError();
        }
        else
        {
            String cmdOutContent = cmdOut.getStdOut();
            if (cmdOutContent != null && !cmdOutContent.trim().equals(""))
            {
                return cmdOutContent.trim();
            }
        }
        throw new NonExistentRegistryPropertyError();
    }

//    private String getRegistryEntryValueAndType(String registryPath, String entryName) throws Exception
//    {//$Item = Get-Item 'HKLM:\Software\Microsoft\Windows NT\CurrentVersion'; $Item.GetValue('CurrentVersion'); $Item.GetValueKind('CurrentVersion')
//        ArrayList<String> argumentList = new ArrayList<>();
//        argumentList.addAll(initialArgumentList);
//
//        argumentList.add("$Item");
//        argumentList.add("=");
//        argumentList.add("Get-Item");
//        argumentList.add("'" + registryPath + "';");
//        argumentList.add("$Item.GetValue('" + entryName + "',$null,'DoNotExpandEnvironmentNames');");
//        argumentList.add("$Item.GetValueKind('" + entryName + "')");
//
//        try
//        {
//            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
//            return handleCmdOutContent(cmdOut);
//        }
//        catch (Exception ex)
//        {
//            logger.error("An error occured while getting type and/or value of the registry entry with path: '" + registryPath + "' and name: '" + entryName + "'", ex);
//            throw ex;
//        }
//    }

    public String getRegistryEntryValue(String registryPath, String entryName, OperationEnumeration operationForEntryName) throws Exception
    {
        ArrayList<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);

        String nameParameter;
        if (entryName == null)
        {
            return null;
        }
        else if ("".equals(entryName))
        {
            nameParameter = "";
        }
        else
        {
            nameParameter = "$Name";
            argumentList.add(nameParameter);
            argumentList.add("=");
            argumentList.add("(Get-Item");
            argumentList.add("'" + registryPath + "').GetValueNames()");
            argumentList.add("|");
            argumentList.add("Where-Object");
            argumentList.add("{$_");
            argumentList.add(getOperationParameter(operationForEntryName));
            argumentList.add("'" + entryName + "'};");
        }
        
        argumentList.add("$Item");
        argumentList.add("=");
        argumentList.add("Get-Item");
        //TODO escape registryPath
        argumentList.add("'" + registryPath + "';");
        
        if("".equals(entryName))
        {
            //TODO escape nameParameter
            argumentList.add("$Item.GetValue('"+ nameParameter + "',$null,'DoNotExpandEnvironmentNames')");
        }
        else
        {
            //TODO escape nameParameter
            argumentList.add("$Item.GetValue("+ nameParameter + ",$null,'DoNotExpandEnvironmentNames')");
        }
        
        logger.debug("getRegistryEntryValue argumentList=" + argumentList);
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            return handleCmdOutContent(cmdOut);
        }
        catch (Exception ex)
        {
            logger.error("An error occured while getting value of the registry entry with path: '" + registryPath + "' and name: '" + entryName + "'");
            throw ex;
        }

    }

    public String getRegistryEntryType(String registryPath, String entryName, OperationEnumeration operationForEntryName) throws Exception
    {
        //$a = (Get-Item 'HKLM:\Software\Microsoft\Windows NT\CurrentVersion').GetValueNames() | Where-Object {$_ -match 'CurrentVersion'};
        ArrayList<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);

        String nameParameter;
        if (entryName == null)
        {
            return null;
        }
        else if ("".equals(entryName))
        {
            nameParameter = "";
        }
        else
        {
            nameParameter = "$Name";
            argumentList.add(nameParameter);
            argumentList.add("=");
            argumentList.add("(Get-Item");
            //TODO escape registryPath
            argumentList.add("'" + registryPath + "').GetValueNames()");
            argumentList.add("|");
            argumentList.add("Where-Object");
            argumentList.add("{$_");
            argumentList.add(getOperationParameter(operationForEntryName));
            //TODO escape registryPath
            argumentList.add("'" + entryName + "'};");
        }
        argumentList.add("$Item");
        argumentList.add("=");
        argumentList.add("Get-Item");
        //TODO escape registryPath
        argumentList.add("'" + registryPath + "';");
        //TODO escape nameParameter
        argumentList.add("$Item.GetValueKind(" + nameParameter + ")");

        logger.debug("getRegistryEntryType argumentList=" + argumentList);
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            return handleCmdOutContent(cmdOut);
        }
        catch (Exception ex)
        {
            logger.error("An error occured while getting type of the registry entry with path: '" + registryPath + "' and name: '" + entryName + "'");
            throw ex;
        }
    }

    private String convertPowerShellTypeToRegistryType(String powerShellType)
    {
        switch (powerShellType)
        {
            case ("Binary"):
                return "REG_BINARY";
            case ("DWord"):
                return "REG_DWORD";
            case ("ExpandString"):
                return "REG_EXPAND_SZ";
            case ("MultiString"):
                return "REG_MULTI_SZ";
            case ("QWord"):
                return "REG_QWORD";
            case ("String"):
                return "REG_SZ";
            default:
                return "REG_SZ";
        }
    }

    public String getRegistryEntryHexValue(String registryPath, String entryName) throws Exception
    {
        //((Get-Item 'HKLM:\Software\Microsoft\Windows NT\CurrentVersion').GetValue('DigitalProductId') | ForEach-Object ToString X2) -join ''
        ArrayList<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);

        argumentList.add("((Get-Item");
        //TODO escape registryPath and entryName
        argumentList.add("'" + registryPath + "').GetValue('" + entryName + "')");
        argumentList.add("|");
        argumentList.add("ForEach-Object");
        argumentList.add("ToString");
        argumentList.add("X2)");
        argumentList.add("-join");
        argumentList.add("''");
        logger.debug("getRegistryEntryHexValue argumentList=" + argumentList);
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            return handleCmdOutContent(cmdOut);
        }
        catch (Exception ex)
        {
            logger.error("An error occured while getting hex value of the registry entry with path: '" + registryPath + "' and name: '" + entryName + "'");
            throw ex;
        }
    }

    private String getRegistryEntryExpandedValue(String registryPath, String entryName) throws Exception
    {
        ArrayList<String> argumentList = new ArrayList<>();
        argumentList.addAll(initialArgumentList);

        argumentList.add("$Item");
        argumentList.add("=");
        argumentList.add("Get-Item");
        //TODO escape registryPath
        argumentList.add("'" + registryPath + "';");
        //TODO escape registryPath
        argumentList.add("$Item.GetValue('" + entryName + "');");
        logger.debug("getRegistryEntryExpandedValue argumentList=" + argumentList);
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            return handleCmdOutContent(cmdOut);
        }
        catch (Exception ex)
        {
            logger.error("An error occured while getting expanded value of the registry entry with path: '" + registryPath + "' and name: '" + entryName + "'");
            throw ex;
        }
    }
    


    public String getLastWriteTime(String registryPath) throws Exception
    {
        ArrayList<String> argumentList = new ArrayList<>();

        String scriptCommand = "powershell";
        String dockerWrapperScriptPath = ScriptUtils.getPowershellScriptFileAbsolutePath("dockerScriptWrapper.ps1");
        String hostWrapperScriptPath = ScriptUtils.getPowershellScriptFileAbsolutePath("hostScriptWrapper.ps1");
        String getLastWriteTimeScriptPath = ScriptUtils.getPowershellScriptFileAbsolutePath("getRegistryLastWriteTime.ps1");

        argumentList.add("-executionpolicy");
        argumentList.add("bypass");
        argumentList.add(".");
        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("'" + dockerWrapperScriptPath + "'");
        }
        else
        {
            argumentList.add("'" + hostWrapperScriptPath + "'");
        }

        argumentList.add("-scriptPath");
        argumentList.add("'" + getLastWriteTimeScriptPath + "'");

        argumentList.add("-filePath");
        //TODO escape registryPath
        argumentList.add("'" + registryPath + "'");

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("-targetName");
            argumentList.add("'" + target.getTargetName() + "'");
        }
        logger.debug("getLastWriteTime argumentList=" + argumentList);
        OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, scriptCommand, argumentList.toArray(new String[argumentList.size()]));
        try
        {
            String fileType = handleCmdOutContent(cmdOut);
            String[] splittedArray = splitFromNewLine(fileType);
            if (!splittedArray[0].equals("0") || splittedArray.length == 1)
            {
                logger.error("An error occured while getting last write time of the registry key with path: '" + registryPath);
                throw new NonExistentRegistryPropertyError();
            }
            else
            {
                return splittedArray[1];
            }
        }
        catch (Exception ex)
        {
            logger.error("An error occured while getting last write time of the registry key with path: '" + registryPath, ex);
            throw ex;
        }

    }

    private String[] splitFromNewLine(String stringToBeSplitted)
    {
        String regex = "\\r?\\n";

        return stringToBeSplitted.split(regex);
    }

}
