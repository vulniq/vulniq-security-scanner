
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
import com.vulniq.client.securityanalyzer.datacollection.InstalledSoftware;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.vulniqapi.VulnIQAPIClient;
import com.vulniq.client.securityanalyzer.scan.finding.VulnerabilityFinding;
import com.vulniq.client.securityanalyzer.vulniqapi.VulnIQVulnerabilityVerificationData;
import com.vulniq.client.securityanalyzer.vulniqapi.VulnIQVulnerabilityData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * SecurityScanner runs instances of this class as threads to process a single software version.
 * - send a request to vulniq API and gets a list of vulns affecting the software
 * - if any vulns are found, for each vuln:
 *      -- send another request to vulniq for each vuln and get a list of confirmation methods (for now OVAL only)
 *      -- run the confirmation method (e.g OVAL)
 */
public class InstalledSoftwareScanHandler extends ScanHandlerBase implements Runnable
{
    private transient Logger logger = LoggerFactory.getLogger(InstalledSoftwareScanHandler.class);

    private InstalledSoftware installedSoftware;

    public InstalledSoftwareScanHandler(SecurityScanner owner, String threadName, InstalledSoftware software, OSInfo osInfo, DataCollectionTarget target)
    {
        super(owner, threadName, osInfo, target);
        this.installedSoftware = software;
    }

    @Override
    public void run()
    {
        logger.info("InstalledSoftwareScanHandler.run - starting to process " + installedSoftware.getName() + " " + installedSoftware.getVersion());
        beginRun();
        //first query vulniq to get vulns by product and versions
        //then for each vuln, get and evaluate verification actions (OVAL or MS Hotfixes)
        logger.info("InstalledSoftwareScanHandler.run calling VulnIQ to get list of vulnerabilities affecting " + installedSoftware.getName() + " " + installedSoftware.getVersion());
        try
        {
            List<VulnIQVulnerabilityData> viqVulnsForSoftware = VulnIQAPIClient.getVulnerabilitiesAffectingSoftware(osInfo, installedSoftware);
            int totalVerificationDataCount = 0;
            if(logger.isDebugEnabled())
            {
                logger.debug(String.format("Vulnerabilites for %s: %s", installedSoftware.getName() + " " + installedSoftware.getVersion(), viqVulnsForSoftware));
            }
            if (viqVulnsForSoftware != null)
            {
                for (VulnIQVulnerabilityData viqVulnData : viqVulnsForSoftware)
                {
                    try
                    {
                        VulnerabilityFinding findingForVuln = new VulnerabilityFinding(viqVulnData);
                        this.findings.add(findingForVuln);
                        logger.info("Starting to process vulnerability:" + viqVulnData);
                        logger.debug("InstalledSoftwareScanHandler.run getting verification data for: " + viqVulnData.getName());
                        List<VulnIQVulnerabilityVerificationData> verificationData = VulnIQAPIClient.getVulnVerificationData(viqVulnData, osInfo, installedSoftware);
                        if (verificationData != null && verificationData.size()>0)
                        {
                            logger.debug("Found verification data for " + viqVulnData.getName());
                            for (VulnIQVulnerabilityVerificationData vulnVerificationData : verificationData)
                            {
                                totalVerificationDataCount++;
                                handleVerificationData(vulnVerificationData, viqVulnData, findingForVuln);
                            }
                        }
                    }
                    catch (Exception ex)
                    {
                        logger.error("Error handling vulnerability data: " + viqVulnData, ex);
                    }
                }
            }
            int vulnCount = viqVulnsForSoftware!=null?viqVulnsForSoftware.size():0;

            this.statusDescription = "Vulnerabilities: " + vulnCount + " Verification Actions: "+ totalVerificationDataCount;
            this.setStatus(Status.Finished);
        }
        catch (Exception ex)
        {
            logger.error("Error in InstalledSoftwareScanHandler.run", ex);
            this.statusDescription = "Error: " + ex.getMessage();
            this.setStatus(Status.Error);
        }
        endRun();
    }


    public InstalledSoftware getInstalledSoftware()
    {
        return installedSoftware;
    }

    public void setInstalledSoftware(InstalledSoftware installedSoftware)
    {
        this.installedSoftware = installedSoftware;
    }

    @Override
    public String toString()
    {
        return "ScanHandler for " + this.installedSoftware;
    }

    @Override
    public String getDisplayName()
    {
        return installedSoftware.getName() + " " + installedSoftware.getVersion();
    }
}
