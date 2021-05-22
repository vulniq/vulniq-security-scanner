
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

package com.vulniq.client.securityanalyzer;

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.apache.commons.lang3.SystemUtils;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TerziTestSetup
{
    public static boolean isSetupDone = false;
    public static boolean isDockerContainersSetup = false;

    public static synchronized void setupSystemProps()
    {
        System.out.println("TerziTestSetup.setupSystemProps called");
        if(!isSetupDone)
        {
            Path absolutePath = Paths.get("").toAbsolutePath();
            System.setProperty("TERZI_RUNNING_UNIT_TESTS", "yes");
            System.setProperty("log4j.configurationFile", absolutePath + "/src/main/resources/conf/log4j2-test.xml");
            System.setProperty(TerziConfiguration.ENV_TERZI_CONFIG_FOLDER, absolutePath + "/src/main/resources/conf/");
            System.setProperty(TerziConfiguration.ENV_TERZI_CONFIGURATION_FILE, absolutePath + "/src/main/resources/conf/terzi.properties");

            String configFilePath = System.getProperty(TerziConfiguration.ENV_TERZI_CONFIGURATION_FILE);
            TerziConfiguration.loadConfigurationFile(configFilePath);
            isSetupDone = true;
        }
    }

    public static synchronized void cleanUp()
    {
    }
    public static synchronized void cleanUpDockerContainers()
    {
        System.out.println("TerziTestSetup.cleanUp called");
        OSCommandOutput stopRhel7 = OSCommandUtils.runCommand(5000, "docker", "stop", "terzi-rhel7");
        OSCommandOutput stopDebian = OSCommandUtils.runCommand(5000, "docker", "stop", "terzi-debian10");
        if(isOnWindows())
        {
            OSCommandOutput stopWindows = OSCommandUtils.runCommand(30000, "docker", "stop", "terzi-windows");
        }
    }

    public static boolean isOnWindows()
    {
        return SystemUtils.IS_OS_WINDOWS;
    }

    public static boolean isOnLinux()
    {
        return SystemUtils.IS_OS_LINUX;
    }

    public static boolean isOnMac()
    {
        return SystemUtils.IS_OS_MAC;
    }

    /**
     * create (if necessary) and start all test containers
     * terzi-rhel7
     * terzi-debian10
     * terzi-windows (if host is windows)
     */
    public static synchronized void setupDockerContainers()
    {
        if(!isDockerContainersSetup)
        {
            if(isOnWindows())
            {
                //TODO add terzi-windows here
            }
            else
            {
                startContainer("terzi-rhel7", "terzi/rhel7.5-231", "rhel7");
                startContainer("terzi-debian10", "terzi/debian10", "debian10");
                startContainer("terzi-ubuntu1804", "terzi/ubuntu1804", "ubuntu1804");
            }
            isDockerContainersSetup = true;
        }
    }

    private static void startContainer(String containerName, String imageName, String dockerfileFolder)
    {
        Path absolutePath = Paths.get("").toAbsolutePath();
        String testDockersFolder = absolutePath + "/test-dockers/";
        OSCommandOutput dockerPS = OSCommandUtils.runCommand(30000, "docker", "ps", "--filter",
                "name=" + containerName);
        if(dockerPS.getStdOut().contains(containerName))
        {
            //already running
            System.out.println("container " + containerName + " is already running");
            return;
        }
        OSCommandOutput startCmdOut = OSCommandUtils.runCommand(30000, "docker", "start", containerName);
        if(startCmdOut.getExitCode()!=0)
        {
            //note build context is project root folder
            OSCommandOutput buildCmdOut = OSCommandUtils.runCommand(300000, "docker",
                    "build", "-t", imageName,
                    "-f", testDockersFolder + dockerfileFolder + "/Dockerfile",
                    absolutePath.toString()
            );
            if(buildCmdOut.getExitCode()!=0)
            {
                System.out.println("FAILED to build "+containerName+" image. docker build exitCode=" + buildCmdOut.getExitCode()+ " stderr=" + buildCmdOut.getStdErr());
            }
            else
            {
                OSCommandOutput runCmdOut = OSCommandUtils.runCommand(300000, "docker",
                        "run",  "--name", containerName, "-t", "-d", imageName, "/bin/bash"
                );
                if(runCmdOut.getExitCode()!=0)
                {
                    System.out.println("FAILED to run "+containerName+" image. docker run exitCode=" + runCmdOut.getExitCode()+ " stderr=" + runCmdOut.getStdErr());
                }
            }
        }
    }

}
