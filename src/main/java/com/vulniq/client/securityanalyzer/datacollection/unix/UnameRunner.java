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

package com.vulniq.client.securityanalyzer.datacollection.unix;

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

public class UnameRunner
{
    private static Logger logger = LoggerFactory.getLogger(UnameRunner.class);

    public static List<OSCommandOutput> runUname(DataCollectionTarget dataCollectionTarget, int timeoutMS)
    {
        final String unameCommand = "uname";
        final String[] unameArgumentArray = {"-m", "-n", "-s", "-r", "-v", "-p"};

        OSCommandOutput cmdOut = null;
        List<OSCommandOutput> cmdOutList = new LinkedList();

        for (String unameArgumentIndex : unameArgumentArray)
        {
            switch (dataCollectionTarget.getTargetType())
            {
                case Docker:
                    cmdOut = OSCommandUtils.runCommand(timeoutMS, TerziConfiguration.getDockerCommand(),
                            "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                            unameCommand + " " + unameArgumentIndex);
                    break;
                case Host:
                default:
                    cmdOut = OSCommandUtils.runCommand(timeoutMS, unameCommand, unameArgumentIndex);
                    break;
            }
            cmdOutList.add(cmdOut);
        }

        return cmdOutList;
    }

    public static UnameProperties convertCommandOutputsToUnameProperties (List<OSCommandOutput> cmdOutList)
    {
        try
        {
            UnameProperties unameProperties = new UnameProperties();

            unameProperties.setMachineClass(cmdOutList.get(0).getStdOut().trim());
            unameProperties.setNodeName(cmdOutList.get(1).getStdOut().trim());
            unameProperties.setOsName(cmdOutList.get(2).getStdOut().trim());
            unameProperties.setOsRelease(cmdOutList.get(3).getStdOut().trim());
            unameProperties.setOsVersion(cmdOutList.get(4).getStdOut().trim());
            unameProperties.setProcessorType(cmdOutList.get(5).getStdOut().trim());
            if (logger.isDebugEnabled())
            {
                logger.debug("convertCommandToUnameProperties returning: " + StringUtils.toJson(unameProperties, false));
            }
            return unameProperties;
        }
        catch (Exception ex)
        {
            return null;
        }
    }
}
