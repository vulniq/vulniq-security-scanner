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
import com.vulniq.client.securityanalyzer.oval.analyze.OperationAnalyzer;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class RpmInfoCollector
{
    private static Logger logger = LoggerFactory.getLogger(DpkginfoCollector.class);

    private static Map<DataCollectionTarget, Map<String, CollectedRpmInfo>> rpmPackageCache = new HashMap<>();
    private static Map<DataCollectionTarget, OSCommandOutput.CommandResultStatus> collectedTargetStatusMap = new HashMap<>();

    public static synchronized OSCommandOutput.CommandResultStatus getCommandResultForTarget(DataCollectionTarget target)
    {
        return collectedTargetStatusMap.get(target);
    }

    public static synchronized Map<String, CollectedRpmInfo> getAllRpmInfo(DataCollectionTarget target)
    {
        if(!collectedTargetStatusMap.containsKey(target))
        {
            //we didn't collect data from this target yet, collect
            Map<String, CollectedRpmInfo> collected = collectRpmInfo(target);
            rpmPackageCache.put(target, collected);
        }
        return rpmPackageCache.get(target);
    }

    /**
     *
     * @param target
     * @param packageName
     * @return null if not collected, Optional.empty if package not found
     */
    public static synchronized Optional<CollectedRpmInfo> getRpmInfo(DataCollectionTarget target, String packageName)
    {
        if(!collectedTargetStatusMap.containsKey(target))
        {
            //we didn't collect data from this target yet, collect
            Map<String, CollectedRpmInfo> collected = collectRpmInfo(target);
            rpmPackageCache.put(target, collected);
        }
        if(rpmPackageCache.containsKey(target))
        {
            if(rpmPackageCache.get(target)==null)    //command failed
            {
                return null;
            }
            CollectedRpmInfo rv = rpmPackageCache.get(target).get(packageName);
            if(rv!=null)
            {
                return Optional.of(rv);
            }
            return Optional.empty();
        }
        return null;
    }

    public static synchronized Optional<CollectedRpmInfo> getRpmInfo(DataCollectionTarget target, String packageName,
                                                                     OperationEnumeration ovalComparisonOperation, String ovalDataTypeForPackageName)
    {
        if(!collectedTargetStatusMap.containsKey(target))
        {
            //we didn't collect data from this target yet, collect
            Map<String, CollectedRpmInfo> collected = collectRpmInfo(target);
            rpmPackageCache.put(target, collected);
        }
        if(rpmPackageCache.containsKey(target))
        {
            if(rpmPackageCache.get(target)==null)    //command failed
            {
                return null;
            }
            if(ovalComparisonOperation==OperationEnumeration.EQUALS)
            {
                CollectedRpmInfo rv = rpmPackageCache.get(target).get(packageName);
                if (rv != null)
                {
                    return Optional.of(rv);
                }
                return Optional.empty();
            }
            else
            {
                for(String tmpPackageName : rpmPackageCache.get(target).keySet())
                {
                    try
                    {
                        ResultEnumeration comparisonResult = OperationAnalyzer.applyOperation(ovalComparisonOperation, ovalDataTypeForPackageName, packageName, tmpPackageName);
                        if (comparisonResult == ResultEnumeration.TRUE)
                        {
                            if (logger.isDebugEnabled())
                            {
                                logger.debug("getRpmInfo found match:" + tmpPackageName);
                            }
                            CollectedRpmInfo found = rpmPackageCache.get(target).get(tmpPackageName);
                            if(found==null)
                            {
                                return Optional.empty();
                            }
                            else
                            {
                                return Optional.of(found);
                            }
                        }
                        if (comparisonResult == ResultEnumeration.ERROR)
                        {
                            logger.info("getRpmInfo comparison returned ERROR for " + packageName + " when comparing with " +
                                    tmpPackageName + " using operation:" + ovalComparisonOperation + " and data type " + ovalDataTypeForPackageName);
                            return null;
                        }
                    }
                    catch (Exception ex)
                    {
                        logger.error("getRpmInfo unexpected error for " + packageName + " when comparing with " + tmpPackageName +
                                " using operation:" + ovalComparisonOperation + " and data type " + ovalDataTypeForPackageName, ex);
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public static synchronized Map<String, CollectedRpmInfo> collectRpmInfo(DataCollectionTarget target)
    {
        OSCommandOutput cmdOut = null;
        switch (target.getTargetType())
        {
            case Docker:
                cmdOut = OSCommandUtils.runCommand(TerziConfiguration.getCommandTimeoutDefaultMS(), TerziConfiguration.getDockerCommand(),
                        "exec", target.getTargetName(),
                        "/bin/bash", "-c",
                        String.format("rpm -q -ia"));
                break;
            case Host:
            default:
                cmdOut = OSCommandUtils.runCommand(TerziConfiguration.getCommandTimeoutDefaultMS(), "rpm", "-q", "-ia");
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
                Map<String, CollectedRpmInfo> rv = parseRpmQIAOutput(cmdOut.getStdOut().trim());
                return rv;
            }
        }
    }

    public static Map<String, CollectedRpmInfo> parseRpmQIAOutput(String cmdOutput)
    {
        Map<String, CollectedRpmInfo> rv = new HashMap<>();
        String regex = "(?=Name\\s*:)";

        String[] stdOutArray = cmdOutput.split(regex);

        for (String rpmInfoString : stdOutArray)
        {
            CollectedRpmInfo collectedRpmInfo = new CollectedRpmInfo(rpmInfoString.trim());
            rv.put(collectedRpmInfo.getName(), collectedRpmInfo);
        }
        return rv;
    }
}
