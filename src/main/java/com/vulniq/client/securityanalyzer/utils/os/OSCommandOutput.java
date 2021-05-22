

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


import java.time.Instant;
import java.util.List;

public class OSCommandOutput
{
    public static enum CommandResultStatus {SUCCEEDED, TIMED_OUT, ERROR_OCCURRED, NONZERO_EXITCODE};

    private int exitCode = -1;
    private List<String> command;
    private String stdOut;
    private String stdErr;
    private Instant exitInstant;
    private Instant startInstant;
    private boolean timedOut = false;
    private boolean errorOccured = false;
    private Throwable error;


    public int getExitCode()
    {
        return exitCode;
    }

    public void setExitCode(int exitCode)
    {
        this.exitCode = exitCode;
    }

    public List<String> getCommand()
    {
        return command;
    }

    public void setCommand(List<String> command)
    {
        this.command = command;
    }

    public String getStdOut()
    {
        return stdOut;
    }

    public void setStdOut(String stdOut)
    {
        this.stdOut = stdOut;
    }

    public String getStdErr()
    {
        return stdErr;
    }

    public void setStdErr(String stdErr)
    {
        this.stdErr = stdErr;
    }

    public Instant getExitInstant()
    {
        return exitInstant;
    }

    public void setExitInstant(Instant exitInstant)
    {
        this.exitInstant = exitInstant;
    }

    public Instant getStartInstant()
    {
        return startInstant;
    }

    public void setStartInstant(Instant startInstant)
    {
        this.startInstant = startInstant;
    }

    public boolean isTimedOut()
    {
        return timedOut;
    }

    public void setTimedOut(boolean timedOut)
    {
        this.timedOut = timedOut;
    }

    public OSCommandOutput(ProcessBuilder processBuilder)
    {
        this.command = processBuilder.command();
    }

    public Throwable getError()
    {
        return error;
    }

    public void setError(Throwable error)
    {
        this.error = error;
    }

    public boolean isErrorOccured()
    {
        return errorOccured;
    }

    public void setErrorOccured(boolean errorOccured)
    {
        this.errorOccured = errorOccured;
    }
}