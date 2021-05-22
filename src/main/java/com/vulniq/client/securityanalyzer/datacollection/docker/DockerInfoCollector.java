

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

package com.vulniq.client.securityanalyzer.datacollection.docker;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Collect data from docker itself or a running container
 */
public class DockerInfoCollector
{
    private static Logger logger = LoggerFactory.getLogger(DockerInfoCollector.class);

    public static String runCommandOnDockerLinux(String targetName, String command)
    {
        OSCommandOutput cmdOut = OSCommandUtils.runCommand(15000, TerziConfiguration.getDockerCommand(),
                 "exec", targetName, "/bin/bash", "-c", command);
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

    public static Map<String, DockerContainerInfo> dockerPS()
    {
        OSCommandOutput cmdOut = OSCommandUtils.runCommand(15000, TerziConfiguration.getDockerCommand(), "ps", "-q");
        if(cmdOut.isErrorOccured() || cmdOut.isTimedOut())
        {
            return null;
        }
        Map<String, DockerContainerInfo> rv = new HashMap<>();
        String dockerPsOut = cmdOut.getStdOut().trim();
        Scanner scanner = new Scanner(dockerPsOut);
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            String containerId = line.trim();
            Map<String, Object> inspectOutput = dockerInspect(containerId);
            DockerContainerInfo dockerContainerInfo = new DockerContainerInfo(inspectOutput);
            rv.put(containerId, dockerContainerInfo);
        }
        scanner.close();
        return rv;
    }

    public static Map<String, Object> dockerInspect(String containerId)
    {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        List<Map<String,Object>> thelist = new ArrayList();
        OSCommandOutput cmdOut = OSCommandUtils.runCommand(15000, TerziConfiguration.getDockerCommand(), "inspect", containerId);
        if(cmdOut.isErrorOccured() || cmdOut.isTimedOut())
        {
            return null;
        }
        if(cmdOut.getStdOut()==null)
        {
            return null;
        }
        thelist = gson.fromJson(cmdOut.getStdOut().trim(), thelist.getClass());
        if(thelist!=null && !thelist.isEmpty())
        {
            Map<String, Object> rv = thelist.get(0);
            return rv;
        }
        return null;
    }

    public static Date getContainerStarted(String containerId)
    {
        return getContainerDate(containerId, ".State.StartedAt");
    }

    public static Date getContainerCreated(String containerId)
    {
        return getContainerDate(containerId, ".Created");
    }

    public static Date getContainerDate(String containerId, String dateType)
    {
        OSCommandOutput cmdOut = OSCommandUtils.runCommand(15000, TerziConfiguration.getDockerCommand(),
                                    "inspect", "--format={{"+dateType+"}}", containerId);
        if(cmdOut.isErrorOccured() || cmdOut.isTimedOut())
        {
            return null;
        }
        return parseDockerDate(cmdOut.getStdOut().trim());
    }

    public static Date parseDockerDate(String dateFromDockerOutput)
    {
        if(dateFromDockerOutput==null || dateFromDockerOutput.isBlank())
        {
            return null;
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_INSTANT;
        try
        {
            String datestr = dateFromDockerOutput;
            Date d = Date.from(Instant.from(dateTimeFormatter.parse(datestr)));
            return d;
        }
        catch (Exception ex)
        {
            try
            {
                dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
                Date d = Date.from(Instant.from(dateTimeFormatter.parse(dateFromDockerOutput)));
                return d;
            }
            catch (Exception ex2)
            {
                logger.error("Error parsing docker timestamp:" + dateFromDockerOutput, ex2);
                return null;
            }
        }
    }
}
