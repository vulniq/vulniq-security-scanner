
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

package com.vulniq.client.securityanalyzer.datacollection.windows;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.InstalledSoftware;
import com.vulniq.client.securityanalyzer.utils.ScriptUtils;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WindowsInstalledSoftwareCollector
{
    private int timeout = 200000;
    private final Logger logger = LoggerFactory.getLogger(WindowsInstalledSoftwareCollector.class);
    

    private List<InstalledSoftware> collectHostSoftware(DataCollectionTarget target, ArrayList<String> argumentList)
    {
        String scriptCommand = "powershell.exe";
        String scriptName = "hostInstalledPrograms.ps1";
        argumentList.add(ScriptUtils.getPowershellScriptFileAbsolutePath(scriptName));
        
        return runCommand(timeout, scriptCommand, argumentList);
    }
    
    private List<InstalledSoftware> collectDockerSoftware(DataCollectionTarget target, ArrayList<String> argumentList)
    {
        String scriptCommand = "powershell.exe";
        String scriptName = "dockerInstalledPrograms.ps1";
        argumentList.add(ScriptUtils.getPowershellScriptFileAbsolutePath(scriptName));
        argumentList.add("-scriptPath");
        argumentList.add(ScriptUtils.getPowershellScriptFileAbsolutePath("hostInstalledPrograms.ps1"));
        argumentList.add("-targetName");
        argumentList.add(target.getTargetName());
        
        return runCommand(timeout, scriptCommand, argumentList);
    }
    
    private List<InstalledSoftware> parseCmdOut(String cmdOut)
    {
        String regex = "(\\{[^}]+\\})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cmdOut);
        List<InstalledSoftware> installedPrograms = new ArrayList<>();
        JsonParser jsonParser = new JsonParser();
        while (matcher.find())
        {
            String matchGroup1 = "";
            try
            {
                matchGroup1 = matcher.group(1);
                JsonObject jsonObject = jsonParser.parse(matchGroup1).getAsJsonObject();
                WindowsInstalledSoftware installedProgram = new WindowsInstalledSoftware(jsonObject);
                if (installedProgram.getDisplayName() != null && !installedProgram.getDisplayName().equals(""))
                {
                    installedPrograms.add(installedProgram);
                }
            }
            catch (Exception ex)
            {
                logger.error("parseCmdOut - Error parsing entry:" + matchGroup1, ex);
            }
        }
        return installedPrograms;
    }
    
    private List<InstalledSoftware> runCommand(int timeout, String command, ArrayList<String> argumentList)
    {
        OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command,
                                                           argumentList.toArray(new String[argumentList.size()]));
        
        if (cmdOut.isErrorOccured())
        {
            logger.error("An error occurred while searching for installed software.");
            return null;
        }
        else if (cmdOut.isTimedOut())
        {
            logger.error("Command timed out while searching for installed software.");
            return null;
        }
        else
        {
            return parseCmdOut(cmdOut.getStdOut());
        }
    }
    
    public List<InstalledSoftware> collectSoftware(DataCollectionTarget target)
    {
        ArrayList<String> argumentList = new ArrayList<>();
        argumentList.add("-ExecutionPolicy");
        argumentList.add("Bypass");
        argumentList.add("-File");
        if (target.getTargetType() == DataCollectionTargetType.Host)
        {
            return collectHostSoftware(target, argumentList);
        }
        else
        {
            return collectDockerSoftware(target, argumentList);
        }
    }
}
