
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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windows;

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.oval.error.OSCommandTimedOutError;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public abstract class PowerShellSearchUtilsBase
{
    private Logger logger = LoggerFactory.getLogger(PowerShellSearchUtilsBase.class);
    
    protected int timeout = 180000;
    protected DataCollectionTarget target;
    
    
    public PowerShellSearchUtilsBase (DataCollectionTarget target)
    {
        this.target = target;
    }
    
    
    public abstract String getId();
    
    protected String getOperationParameter(OperationEnumeration oprEnum)
    {
        switch (oprEnum)
        {
            case EQUALS:
                return "-eq";
            case NOT_EQUAL:
                return "-ne";
            case PATTERN_MATCH:
                return "-cmatch";
        }
        return "-eq";
    }
    
    
    protected String handleCmdOutContent(OSCommandOutput cmdOut) throws FileNotFoundException, Exception, OSCommandTimedOutError
    {
        if (cmdOut.isErrorOccured())
        {
            logger.error("PowerShell cannot find OVAL Object with ID: " + this.getId());
            throw new FileNotFoundException("PowerShell cannot find OVAL Object with ID: " + this.getId());
        }
        else if (cmdOut.isTimedOut())
        {
            logger.error("PowerShell timed out while searching for OVAL Object with ID: " + this.getId());
            throw new OSCommandTimedOutError("PowerShell timed out while searching for OVAL Object with ID: " + this.getId(), timeout);
        }
        else
        {
            String cmdOutContent = cmdOut.getStdOut();
            if (cmdOutContent != null)
            {
                return cmdOutContent.trim();
            }
        }
        return "";
    }
    
    
    protected boolean checkRecursiveSearchIsOn(String recurseDirection)
    {
        if (recurseDirection == null)
        {
            return false;
        }

        return !("none".equals(recurseDirection) || recurseDirection.isBlank());
    }
    
    protected boolean checkRegexSearchIsOn(OperationEnumeration operationEnum)
    {
        return operationEnum == OperationEnumeration.PATTERN_MATCH;
    }
    
    protected abstract void setClassProperties();
    
    
    protected String composeRecursiveParameters(String recurseDirection, int maxDepth)
    {
        if (recurseDirection.equals("up") || recurseDirection.equals("none"))
        {
            return "-depth 0"; // This will be handled in constructFileSearchLocation()
        }
        else
        {
            if (maxDepth == -1)
            {
                return "-recurse";
            }
            else
            {
                String maxDepthString = String.valueOf(maxDepth);
                return "-depth " + maxDepthString;
            }
        }
    }
    
    public static Boolean isWindowsOS64Bit(DataCollectionTarget dataCollectionTarget)
    {
        if (dataCollectionTarget.getTargetType() == DataCollectionTargetType.Host)
        {
            String property = System.getProperty("os.arch");
            return property.contains("64");
        }
        else
        {
            OSCommandOutput psOut = OSCommandUtils.runCommand(240000, TerziConfiguration.getDockerCommand(), "exec", dataCollectionTarget.getTargetName(),
                    "powershell", "[Environment]::Is64BitOperatingSystem");
            if (!psOut.isErrorOccured() && !psOut.isTimedOut() && psOut.getExitCode() == 0)
            {
                return psOut.getStdOut().trim().equals("True");
            }
            else
            {
                OSCommandOutput cmdOut = OSCommandUtils.runCommand(240000, TerziConfiguration.getDockerCommand(),
                        "exec", dataCollectionTarget.getTargetName(), "wmic", "os", "get", "osarchitecture");
                if (!cmdOut.isErrorOccured() && !cmdOut.isTimedOut() && cmdOut.getExitCode() == 0)
                {
                    return cmdOut.getStdOut().contains("64-bit");
                }
            }
        }
        return null;
    }
    
    protected String getSearchResults(ArrayList<String> argumentList) throws Exception
    {
        String command;

        if (target.getTargetType() == DataCollectionTargetType.Host)
        {
            command = "powershell";
        }
        else
        {
            command = TerziConfiguration.getDockerCommand();
            argumentList.add(0, "exec");
            argumentList.add(1, target.getTargetName());
            argumentList.add(2, "powershell");
        }

        OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
        try
        {
            handleCmdOutContent(cmdOut);
            return cmdOut.getStdOut();
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }
        
}
