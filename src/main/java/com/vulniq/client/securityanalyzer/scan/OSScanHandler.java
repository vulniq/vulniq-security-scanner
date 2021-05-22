
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

package com.vulniq.client.securityanalyzer.scan;

import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.vulniqapi.VulnIQAPIClient;
import com.vulniq.client.securityanalyzer.scan.finding.VulnerabilityFinding;
import com.vulniq.client.securityanalyzer.vulniqapi.VulnIQVulnerabilityVerificationData;
import com.vulniq.client.securityanalyzer.vulniqapi.VulnIQVulnerabilityData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class OSScanHandler extends ScanHandlerBase implements Runnable
{
    private transient Logger logger = LoggerFactory.getLogger(OSScanHandler.class);

    @Override
    public String getDisplayName()
    {
        return osInfo.getDisplayName() + " " + osInfo.getDisplayVersion();
    }

    public OSScanHandler(SecurityScanner owner, String threadName, OSInfo osInfo, DataCollectionTarget target)
    {
        super(owner, threadName, osInfo, target);
    }

    @Override
    public void run()
    {
        logger.info("OSScanHandler.run - starting to process " + osInfo.getDisplayName() + " " + osInfo.getDisplayVersion());
        beginRun();
        try
        {

            List<VulnIQVulnerabilityData> viqVulnsForOS = VulnIQAPIClient.getVulnerabilitiesAffectingOS(osInfo);
            int totalVerificationDataCount = 0;
            if(logger.isDebugEnabled())
            {
                logger.debug(String.format("Vulnerabilites for %s: %s", osInfo.getDisplayName() + " " + osInfo.getDisplayVersion(), viqVulnsForOS));
            }
            if (viqVulnsForOS != null)
            {
                for (VulnIQVulnerabilityData vulnIQVulnerabilityData : viqVulnsForOS)
                {
                    try
                    {
                        VulnerabilityFinding findingForVuln = new VulnerabilityFinding(vulnIQVulnerabilityData);
                        this.findings.add(findingForVuln);
                        logger.info("Starting to process vulnerability:" + vulnIQVulnerabilityData);
                        logger.debug("OSScanHandler.run getting verification data for: " + vulnIQVulnerabilityData.getName());
                        List<VulnIQVulnerabilityVerificationData> verificationData = VulnIQAPIClient.getVulnVerificationData(vulnIQVulnerabilityData, osInfo, null);
                        if (verificationData != null && verificationData.size()>0)
                        {
                            logger.debug("Found verification data for " + vulnIQVulnerabilityData.getName());
                            for (VulnIQVulnerabilityVerificationData vulnVerificationData : verificationData)
                            {
                                totalVerificationDataCount++;
                                handleVerificationData(vulnVerificationData, vulnIQVulnerabilityData, findingForVuln);
                            }
                        }
                    }
                    catch (Exception ex)
                    {
                        logger.error("Error handling vulnerability data: " + vulnIQVulnerabilityData, ex);
                    }
                }
            }
            int vulnCount = viqVulnsForOS!=null?viqVulnsForOS.size():0;

            this.statusDescription = "Vulnerabilities: " + vulnCount + " Verification Actions: "+ totalVerificationDataCount;
            this.setStatus(Status.Finished);
        }
        catch (Exception ex)
        {
            logger.error("Error in OSScanHandler.run", ex);
            this.statusDescription = "Error: " + ex.getMessage();
            this.setStatus(Status.Error);
        }
        endRun();
        logger.info("OSScanHandler.run - finished processing " + osInfo.getDisplayName() + " " + osInfo.getDisplayVersion());
    }
}
