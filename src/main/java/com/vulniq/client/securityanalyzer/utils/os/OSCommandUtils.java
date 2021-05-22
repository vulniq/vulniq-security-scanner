

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

package com.vulniq.client.securityanalyzer.utils.os;

import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import org.apache.commons.lang3.SystemUtils;
import org.apache.commons.text.StringEscapeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class OSCommandUtils
{
    private static Logger logger = LoggerFactory.getLogger(OSCommandUtils.class);

    public static final boolean IS_WINDOWS;

    static
    {
        IS_WINDOWS = SystemUtils.IS_OS_WINDOWS;
    }

    private static ExecutorService executorService = Executors.newCachedThreadPool();
    public static void shutdown()
    {
        executorService.shutdown();
    }
    public static OSCommandOutput runCommand(int timeoutInMilliSeconds, String command, String... args)
    {
        ProcessBuilder builder = new ProcessBuilder();
        List<String> commandList = new ArrayList<>();
        commandList.add(command);
        if(args!=null)
        {
            for(String tmpArg: args)
            {
                commandList.add(tmpArg);
            }
        }
        builder.command(commandList);

        OSCommandOutput cmdout;
        CommandExecutor commandExecutor = new CommandExecutor(builder);
        try
        {
            logger.debug("Running command:" + builder.command());
            Future future = executorService.submit(commandExecutor);
            Object futureRes = future.get(timeoutInMilliSeconds, TimeUnit.MILLISECONDS);
            logger.debug("Future result=" + futureRes);
            cmdout = commandExecutor.getCommandOutput();

            if(logger.isDebugEnabled())
            {
                logger.debug("Finished command:" + builder.command() + "Exit code=" + cmdout.getExitCode() + " stdout=" + cmdout.getStdOut() + " stderr=" + cmdout.getStdErr());
            }
        }
        catch (InterruptedException e)
        {
            cmdout = commandExecutor.getCommandOutput();
            cmdout.setErrorOccured(true);
            logger.error("Interrupted while running command:" + builder.command(), e);
        }
        catch (ExecutionException e)
        {
            cmdout = commandExecutor.getCommandOutput();
            cmdout.setErrorOccured(true);
            logger.error("Failed to execute command:" + builder.command(), e);
        }
        catch (TimeoutException e)
        {
            cmdout = commandExecutor.getCommandOutput();
            cmdout.setTimedOut(true);
            logger.error("Command timed out. Command:" + builder.command(), e);
        }
        finally
        {
            commandExecutor.cleanUp();
        }
        return cmdout;
    }

    /**
     * Similar to PHP escapeshellarg https://www.php.net/manual/en/function.escapeshellarg.php
     * DO NOT use for commands to be executed on host
     * USE for escaping command arguments passed to /bin/bash -c on docker
     * @param str
     * @return
     */
    public static String escapeShellArg(String str, OSInfo targetOSInfo)
    {
        if(str==null)
        {
            return null;
        }
        if(str.isBlank())
        {
            return str;
        }
        if(targetOSInfo.getOsType()== OSInfo.OSType.Windows)
        {
            String replaced = str.replace("%", " ");
            replaced = replaced.replace("!", " ");
            replaced = replaced.replace("\"", " ");
            String rv = "\"" + replaced + "\"";
            return rv;
        }
        else
        {
            String singleQuotesReplaced = str.replace("'", "\\'");
            String rv = "'" + singleQuotesReplaced + "'";
            return rv;
        }
    }


}
