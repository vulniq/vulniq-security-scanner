
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

package com.vulniq.client.securityanalyzer.utils;

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.error.OSCommandTimedOutError;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;

public class FileUtils
{
    private static Logger logger = LoggerFactory.getLogger(FileUtils.class);

    public static String getFileContents(DataCollectionTarget dataCollectionTarget, String filePath, int timeout, OSInfo osInfo)
            throws FileNotFoundException, OSCommandTimedOutError, Exception
    {
        switch (dataCollectionTarget.getTargetType())
        {
            case Docker:
                OSCommandOutput cmdOut = null;
                cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                        "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                        String.format("cat %s", OSCommandUtils.escapeShellArg(filePath, osInfo)));
                if(cmdOut.isErrorOccured())
                {
                    throw new FileNotFoundException("cat "+filePath+" returned an error");
                }
                else if(cmdOut.isTimedOut())
                {
                    throw new OSCommandTimedOutError("cat "+filePath+" timed out", timeout);
                }
                else
                {
                    String fileContents = cmdOut.getStdOut();
                    if(fileContents!=null)
                    {
                        return fileContents;
                    }
                }
                break;
            case Host:
            default:
                File fileOnHost = new File(filePath);
                if(fileOnHost.exists() && fileOnHost.isFile())
                {
                    try
                    {
                        String fileContents = Files.readString(fileOnHost.toPath());
                        return fileContents;
                    }
                    catch (Exception ex)
                    {
                        throw ex;
                    }
                }
                else
                {
                    throw new FileNotFoundException(filePath + " does not exist");
                }
        }
        return null;
    }

    public static boolean checkIfFileOrFolderExists(DataCollectionTarget dataCollectionTarget, String filePath, int timeout, OSInfo osInfo)
            throws FileNotFoundException, OSCommandTimedOutError
    {
        switch (dataCollectionTarget.getTargetType())
        {
            case Docker:
                OSCommandOutput cmdOut = null;
                cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(), "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                        String.format("test -e %s", OSCommandUtils.escapeShellArg(filePath, osInfo)));
                if(cmdOut.isErrorOccured())
                {
                    throw new FileNotFoundException("Failed to check if "+filePath+" exists:" + cmdOut.getError());
                }
                else if(cmdOut.isTimedOut())
                {
                    throw new OSCommandTimedOutError("test -e "+filePath+" timed out", timeout);
                }
                else
                {
                    if(cmdOut.getExitCode()!=0)
                    {
                        return false;
                    }
                    else
                    {
                        return true;
                    }
                }
            case Host:
            default:
                File fileOnHost = new File(filePath);
                if(fileOnHost.exists())
                {
                    return true;
                }
                else
                {
                    return false;
                }
        }
    }
}
