

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

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;

public class CommandExecutor implements Runnable
{
    private Logger logger = LoggerFactory.getLogger(CommandExecutor.class);
    private ProcessBuilder processBuilder;
    private OSCommandOutput commandOutput;
    private Process process = null;
    private Thread stdOutThread = null;
    private Thread stdErrThread = null;


    public CommandExecutor(ProcessBuilder processBuilder)
    {
        this.processBuilder = processBuilder;
    }

    public OSCommandOutput getCommandOutput()
    {
        return commandOutput;
    }

    @Override
    public void run()
    {
        try
        {
            commandOutput = new OSCommandOutput(processBuilder);
            process = processBuilder.start();
            long processId = process.pid();
            if(logger.isDebugEnabled())
            {
                logger.debug("Started pid=" + process.pid() + " for command=" + process.info().commandLine());
            }
            commandOutput.setStartInstant(Instant.now());

            CommandOutStreamConsumer stdOutConsumer = new CommandOutStreamConsumer(process.getInputStream(), processBuilder.command());
            stdOutThread = new Thread(stdOutConsumer);
            stdOutThread.setName(TerziConfiguration.getThreadNamePrefix() + "stdout-consumer-" + processId);
            stdOutThread.start();

            CommandOutStreamConsumer stdErrConsumer = new CommandOutStreamConsumer(process.getErrorStream(), processBuilder.command());
            stdErrThread = new Thread(stdErrConsumer);
            stdErrThread.setName(TerziConfiguration.getThreadNamePrefix() + "stderr-consumer-" + processId);
            stdErrThread.start();

            stdOutThread.join();
            stdErrThread.join();
            int exitCode = process.waitFor();

            commandOutput.setExitInstant(Instant.now());
            commandOutput.setExitCode(exitCode);
            commandOutput.setStdErr(stdErrConsumer.getOutput());
            commandOutput.setStdOut(stdOutConsumer.getOutput());

        }
        catch (Exception ex)
        {
            logger.error("Error running OS command: '" + processBuilder.command() + "'", ex);
            commandOutput.setError(ex);
        }
        finally
        {
            cleanUp();
        }
    }

    public void cleanUp()
    {
        try
        {
            if (process != null && process.isAlive())
            {
                process.destroy();
            }
            if(stdOutThread!=null && stdOutThread.isAlive())
            {
                stdOutThread.interrupt();
            }
            if(stdErrThread!=null && stdErrThread.isAlive())
            {
                stdErrThread.interrupt();
            }
        }
        catch (Exception ex)
        {
            logger.error("Error while cleaning up at CommandExecutor.cleanUp", ex);
        }
    }
}