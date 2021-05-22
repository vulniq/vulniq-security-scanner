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

package com.vulniq.client.securityanalyzer.datacollection.linux;

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.logging.TerziLog;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class DpkginfoCollector
{
    private static Logger logger = LoggerFactory.getLogger(DpkginfoCollector.class);

    private static Map<DataCollectionTarget, Map<String, CollectedDpkgInfo>> debianPackageCache = new HashMap<>();
    private static Map<DataCollectionTarget, OSCommandOutput.CommandResultStatus> collectedTargetStatusMap = new HashMap<>();

    public static synchronized OSCommandOutput.CommandResultStatus getCommandResultForTarget(DataCollectionTarget target)
    {
        return collectedTargetStatusMap.get(target);
    }

    /**
     *
     * @param target
     * @param packageName
     * @return null if not collected, Optional.empty if package not found
     */
    public static synchronized Optional<CollectedDpkgInfo> getDpkgInfo(DataCollectionTarget target, String packageName)
    {
        if(!collectedTargetStatusMap.containsKey(target))
        {
            //we didn't collect data from this target yet, collect
            Map<String, CollectedDpkgInfo> collected = collectDpkgInfo(target);
            debianPackageCache.put(target, collected);
        }
        if(debianPackageCache.containsKey(target))
        {
            if(debianPackageCache.get(target)==null)    //command failed
            {
                return null;
            }
            CollectedDpkgInfo rv = debianPackageCache.get(target).get(packageName);
            if(rv!=null)
            {
                return Optional.of(rv);
            }
            return Optional.empty();
        }
        return null;
    }

    /**
     * get all collected packages
     * @param target
     * @return null if not collected
     */
    public static synchronized Map<String, CollectedDpkgInfo> getAllDpkgInfo(DataCollectionTarget target)
    {
        if(!collectedTargetStatusMap.containsKey(target))
        {
            //we didn't collect data from this target yet, collect
            Map<String, CollectedDpkgInfo> collected = collectDpkgInfo(target);
            debianPackageCache.put(target, collected);
        }
        return debianPackageCache.get(target);
    }

    public static synchronized Map<String, CollectedDpkgInfo> collectDpkgInfo(DataCollectionTarget target)
    {
        OSCommandOutput cmdOut = null;
        switch (target.getTargetType())
        {
            case Docker:
                cmdOut = OSCommandUtils.runCommand(TerziConfiguration.getCommandTimeoutDefaultMS(), TerziConfiguration.getDockerCommand(),
                        "exec", target.getTargetName(), "/bin/bash", "-c",
                        String.format("dpkg-query -W"));
                break;
            case Host:
            default:
                cmdOut = OSCommandUtils.runCommand(TerziConfiguration.getCommandTimeoutDefaultMS(), "dpkg-query", "-W");
                break;
        }
        if (cmdOut.isErrorOccured())
        {
            collectedTargetStatusMap.put(target, OSCommandOutput.CommandResultStatus.ERROR_OCCURRED);
            return null;
        }
        else if (cmdOut.isTimedOut())
        {
            collectedTargetStatusMap.put(target, OSCommandOutput.CommandResultStatus.TIMED_OUT);
            return null;
        }
        else
        {
            //exit code is not 0 if there is an error
            if (cmdOut.getExitCode() != 0)
            {
                collectedTargetStatusMap.put(target, OSCommandOutput.CommandResultStatus.NONZERO_EXITCODE);
                return null;
            }
            else
            {
                collectedTargetStatusMap.put(target, OSCommandOutput.CommandResultStatus.SUCCEEDED);
                Map<String, CollectedDpkgInfo> rv = parseDpkgQueryWOutput(cmdOut.getStdOut().trim());
                return rv;
            }
        }
    }


    /**
     * Parse whole output, like:
     * libgssapi-krb5-2:amd64	1.16-2ubuntu0.2
     * libgssapi3-heimdal:amd64	7.5.0+dfsg-1
     * libhcrypto4-heimdal:amd64	7.5.0+dfsg-1
     * libheimbase1-heimdal:amd64	7.5.0+dfsg-1
     * libheimntlm0-heimdal:amd64	7.5.0+dfsg-1
     * libhogweed4:amd64	3.4-1
     * libhx509-5-heimdal:amd64	7.5.0+dfsg-1
     * libidn2-0:amd64	2.0.4-1.1build2
     * libip4tc0:amd64	1.6.1-2ubuntu2
     * libip6tc0:amd64	1.6.1-2ubuntu2
     * libiptc0:amd64	1.6.1-2ubuntu2
     * libk5crypto3:amd64	1.16-2ubuntu0.2
     * libkeyutils1:amd64	1.5.9-9.2ubuntu2
     * @param dpkgQueryWOutput
     * @return
     */
    public static Map<String, CollectedDpkgInfo> parseDpkgQueryWOutput(String dpkgQueryWOutput)
    {
        if(dpkgQueryWOutput==null)
        {
            return null;
        }
        Map<String, CollectedDpkgInfo> rv = new HashMap<>();
        try(Scanner scanner = new Scanner(dpkgQueryWOutput))
        {
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine().trim();
                String[] split = line.split("\\t");
                if (split == null || split.length != 2)
                {
                    logger.warn("Unexpected line in dpkg-query -W output: " + line);
                    TerziLog.supportCase("DpkginfoCollector.parseDpkgQueryWOutput",
                            "Unexpected line in dpkg-query -W output",
                            "Line: '" + line + "'",
                            "Please report this issue to VulnIQ support", null);
                }
                else
                {
                    CollectedDpkgInfo collectedDpkgInfo = new CollectedDpkgInfo();

                    String nameAndArch = split[0];
                    String[] splittedNameAndArch = nameAndArch.split(":");

                    if (splittedNameAndArch.length < 2)
                    {
                        collectedDpkgInfo.setName(splittedNameAndArch[0]);
                    }
                    else
                    {
                        collectedDpkgInfo.setName(splittedNameAndArch[0]);
                        collectedDpkgInfo.setArchitecture(splittedNameAndArch[1]);
                    }
                    collectedDpkgInfo.setEvr(split[1]);
                    rv.put(collectedDpkgInfo.getName(), collectedDpkgInfo);
                }
            }
        }
        return rv;
    }
}
