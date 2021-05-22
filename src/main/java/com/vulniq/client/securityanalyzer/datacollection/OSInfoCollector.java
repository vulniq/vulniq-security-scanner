

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

package com.vulniq.client.securityanalyzer.datacollection;

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.datacollection.docker.DockerContainerInfo;
import com.vulniq.client.securityanalyzer.datacollection.docker.DockerInfoCollector;
import com.vulniq.client.securityanalyzer.datacollection.host.HostInfoCollector;
import com.vulniq.client.securityanalyzer.datacollection.os.LinuxOSInfo;
import com.vulniq.client.securityanalyzer.datacollection.os.WindowsOSInfo;
import com.vulniq.client.securityanalyzer.datacollection.unix.UnameProperties;
import com.vulniq.client.securityanalyzer.datacollection.unix.UnameRunner;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class OSInfoCollector
{
    private static Logger logger = LoggerFactory.getLogger(OSInfoCollector.class);
    public static OSInfo getOSInfo(DataCollectionTarget collectionTarget)
    {
        switch (collectionTarget.getTargetType())
        {
            case Docker:
                return getOSInfoFromDocker(collectionTarget);
            case Host:
            default:
                return getOSInfoFromHost();
        }
    }

    public static OSInfo getOSInfoFromHost()
    {
        OSInfo rv = HostInfoCollector.getHostOSInfo();
        return rv;
    }

    public static OSInfo getOSInfoFromDocker(DataCollectionTarget collectionTarget)
    {
        logger.debug("Collecting OS info from docker: " + collectionTarget);
        Map<String, Object> dockerInspect = DockerInfoCollector.dockerInspect(collectionTarget.getTargetName());
        if(dockerInspect!=null)
        {
            DockerContainerInfo dockerContainerInfo = new DockerContainerInfo(dockerInspect);
            String platform = dockerContainerInfo.getPlatform();
            logger.debug("Target OS platform: " + platform);
            if("linux".equals(platform))
            {
                LinuxOSInfo osInfo = new LinuxOSInfo();
                osInfo.setContainerInfo(dockerContainerInfo);
                osInfo.setOsType(OSInfo.OSType.Linux);
                OSCommandOutput osReleaseContents = OSCommandUtils.runCommand(TerziConfiguration.getCommandTimeoutDefaultMS(),
                        TerziConfiguration.getDockerCommand(),
                        "exec", collectionTarget.getTargetName(), "/bin/bash", "-c",
                        "cat /etc/os-release");
                if(!osReleaseContents.isErrorOccured() && !osReleaseContents.isTimedOut())
                {
                    osInfo.parseLinuxOSRelease(osReleaseContents.getStdOut());
                }
                List<OSCommandOutput> unameOutputs = UnameRunner.runUname(collectionTarget, TerziConfiguration.getCommandTimeoutDefaultMS());
                UnameProperties unameProperties = UnameRunner.convertCommandOutputsToUnameProperties(unameOutputs);
                osInfo.setUnameProperties(unameProperties);
                return osInfo;
            }
            else if ("windows".equals(platform))
            {
                WindowsOSInfo osInfo = new WindowsOSInfo();
                osInfo.setContainerInfo(dockerContainerInfo);
                osInfo.setOsType(OSInfo.OSType.Windows);
                OSCommandOutput osReleaseContents = OSCommandUtils.runCommand(300000,   //<-- 300 seconds
                        TerziConfiguration.getDockerCommand(),
                        "exec", collectionTarget.getTargetName(), "systeminfo");
                if (!osReleaseContents.isErrorOccured() && !osReleaseContents.isTimedOut())
                {
                    osInfo.parseWindowsOSRelease(osReleaseContents.getStdOut());
                }
                return osInfo;

            }
        }
        return null;
    }


}