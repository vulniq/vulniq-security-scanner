

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

package com.vulniq.client.securityanalyzer.datacollection.host;

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.os.LinuxOSInfo;
import com.vulniq.client.securityanalyzer.datacollection.os.MacOSInfo;
import com.vulniq.client.securityanalyzer.datacollection.os.WindowsOSInfo;
import com.vulniq.client.securityanalyzer.datacollection.unix.UnameProperties;
import com.vulniq.client.securityanalyzer.datacollection.unix.UnameRunner;
import com.vulniq.client.securityanalyzer.utils.FileUtils;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.apache.commons.lang3.SystemUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Collect data from the host (current operating system)
 */
public class HostInfoCollector
{
    private static Logger logger = LoggerFactory.getLogger(HostInfoCollector.class);

    /**
     * returns null in case of error
     * @param command
     * @param commandParams
     * @return
     */
    public static String runDataCollectionCommand(String command, String... commandParams)
    {
        OSCommandOutput cmdOut = OSCommandUtils.runCommand(300000, command, commandParams);
        if(cmdOut.isErrorOccured() || cmdOut.isTimedOut())
        {
            return null;
        }
        String stdout = cmdOut.getStdOut();
        if(stdout!=null)
        {
            stdout = stdout.trim();
        }
        return stdout;
    }

    /**
     * Get operating system info from the host
     * @return
     */
    public static OSInfo getHostOSInfo()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Host, null);
        if(SystemUtils.IS_OS_LINUX)
        {
            LinuxOSInfo rv = new LinuxOSInfo();
            try
            {
                String etcOSRelease = FileUtils.getFileContents(target, "/etc/os-release", 30000, rv);
                rv.parseLinuxOSRelease(etcOSRelease);
            }
            catch (Exception ex)
            {
                logger.error("Error reading /etc/os-release in HostInfoCollector.getHostOSInfo", ex);
            }
            List<OSCommandOutput> unameOutputs = UnameRunner.runUname(target, TerziConfiguration.getCommandTimeoutDefaultMS());
            UnameProperties unameProperties = UnameRunner.convertCommandOutputsToUnameProperties(unameOutputs);
            rv.setUnameProperties(unameProperties);
            return rv;
        }
        else if(SystemUtils.IS_OS_MAC)
        {
            MacOSInfo rv = new MacOSInfo();
            String swVersOutput = runDataCollectionCommand("sw_vers");
            rv.parseMacOSXSwVers(swVersOutput);
            List<OSCommandOutput> unameOutputs = UnameRunner.runUname(target, TerziConfiguration.getCommandTimeoutDefaultMS());
            UnameProperties unameProperties = UnameRunner.convertCommandOutputsToUnameProperties(unameOutputs);
            rv.setUnameProperties(unameProperties);
            return rv;
        }
        else if(SystemUtils.IS_OS_WINDOWS)
        {
            WindowsOSInfo rv = new WindowsOSInfo();
            try 
            {
                OSCommandOutput cmdOut = OSCommandUtils.runCommand(300000, "systeminfo");
                String systemInfoOSRelease= cmdOut.getStdOut();
                rv.parseWindowsOSRelease(systemInfoOSRelease);
            
            } 
            catch (Exception ex) 
            {
                logger.error("Error reading systeminfo in HostInfoCollector.getHostOSInfo", ex);
            }
            return rv;
        }    
            throw new RuntimeException("Implement getHostOSInfo");
    }
}
