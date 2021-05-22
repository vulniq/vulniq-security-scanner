
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

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WindowsHotFixCollector
{
    private final Logger logger = LoggerFactory.getLogger(WindowsHotFixCollector.class);
    private int timeout = 200000;
    //(Get-HotFix).InstalledOn.ToUniversalTime() | Get-Date -Format "yyyyMMddTHH:mm:ssZ"; Get-HotFix | Select-Object Description, CSName, InstalledBy, PSComputerName, InstalledOn, Path, HotFixID
    
    public List<WindowsHotFix> collectHotfixes(DataCollectionTarget target)
    {
        String command = null;
        ArrayList<String> argumentList = new ArrayList<>();
        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            command = TerziConfiguration.getDockerCommand();
            
            argumentList.add("exec");
            argumentList.add(target.getTargetName());
            argumentList.add("powershell");
            argumentList.add("\"");
        }
        else
        {
            command = "powershell.exe";
        }
    
        argumentList.add("(Get-HotFix).InstalledOn.ToUniversalTime()");
        argumentList.add("|");
        argumentList.add("Get-Date");
        argumentList.add("-Format");
        argumentList.add("'yyyyMMddTHH:mm:ssZ';");
        argumentList.add("Get-HotFix");
        argumentList.add("|");
        argumentList.add("Select-Object");
        argumentList.add("Description,");
        argumentList.add("CSName,");
        argumentList.add("InstalledBy,");
        argumentList.add("PSComputerName,");
        argumentList.add("Path,");
        argumentList.add("HotFixID");
        
        if(target.getTargetType() == DataCollectionTargetType.Docker)
        {
            argumentList.add("\"");
        }
        
        return runCommand(timeout, command, argumentList);
    }
    
    
    private List<WindowsHotFix> runCommand(int timeout, String command, ArrayList<String> argumentList)
    {
        OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command,
                                                           argumentList.toArray(new String[argumentList.size()]));
        
        if (cmdOut.isErrorOccured())
        {
            logger.error("An error occurred while searching for installed Windows hotfixes.");
            return null;
        }
        else if (cmdOut.isTimedOut())
        {
            logger.error("Command timed out while searching for installed Windows hotfixes.");
            return null;
        }
        else
        {
            return parseCmdOut(cmdOut.getStdOut());
        }
    }
    
    private List<WindowsHotFix> parseCmdOut(String cmdOut)
    {
        String installDates = cmdOut.substring(0, cmdOut.indexOf("Description")).trim();
        String hotFixOutput = cmdOut.substring(cmdOut.indexOf("Description")).trim();
        List<WindowsHotFix> hotFixes = new ArrayList<>();
    
        try (Scanner scanner = new Scanner(installDates))
        {
            String line = null;
            while(scanner.hasNextLine())
            {
                line = scanner.nextLine();
                if (line == null)
                {
                    continue;
                }
                WindowsHotFix hotFix = new WindowsHotFix();
                hotFix.setInstalledOn(line);
                hotFixes.add(hotFix);
            }
            
        }
        catch (Exception ex)
        {
            logger.error("Error while parsing HotFix Install Dates" + installDates, ex);
        }
        
        int count = 0;
        
        try (Scanner scanner = new Scanner(hotFixOutput))
        {
            String line = null;
            while (scanner.hasNextLine())
            {
                line = scanner.nextLine();
                if (line == null || line.equals(""))
                {
                    count++;
                    continue;
                }
                WindowsHotFix hotFix = hotFixes.get(count);
                if (hotFix.getDescription() == null)
                {
                    Pattern pattern = Pattern.compile("Description\\s*:(.*)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        hotFix.setDescription(m.group(1).trim());
                    }
                }
                if (hotFix.getCsName() == null)
                {
                    Pattern pattern = Pattern.compile("CSName\\s*:(.*)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        hotFix.setCsName(m.group(1).trim());
                    }
                }
                if (hotFix.getInstalledBy() == null)
                {
                    Pattern pattern = Pattern.compile("InstalledBy\\s*:(.*)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        hotFix.setInstalledBy(m.group(1).trim());
                    }
                }
                if (hotFix.getPsComputerName() == null)
                {
                    Pattern pattern = Pattern.compile("PSComputerName\\s*:(.*)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        hotFix.setPsComputerName(m.group(1).trim());
                    }
                }
                if (hotFix.getPath() == null)
                {
                    Pattern pattern = Pattern.compile("Path\\s*:(.*)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        hotFix.setPath(m.group(1).trim());
                    }
                }
                if (hotFix.getHotFixId() == null)
                {
                    Pattern pattern = Pattern.compile("HotFixID\\s*:(.*)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        hotFix.setHotFixId(m.group(1).trim());
                    }
                }
                
            }
        }
        catch (Exception ex)
        {
            logger.error("Error while parsing HotFix Info" + hotFixOutput, ex);
        }
        
        return hotFixes;
    }
}
