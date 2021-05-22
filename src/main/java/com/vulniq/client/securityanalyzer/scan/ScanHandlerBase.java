
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
import com.vulniq.client.securityanalyzer.datacollection.os.WindowsOSInfo;
import com.vulniq.client.securityanalyzer.datacollection.windows.WindowsHotFix;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.scan.finding.ScanFinding;
import com.vulniq.client.securityanalyzer.scan.finding.VulnerabilityFinding;
import com.vulniq.client.securityanalyzer.vulniqapi.VulnIQVulnerabilityVerificationData;
import com.vulniq.client.securityanalyzer.vulniqapi.VulnIQVulnerabilityData;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public abstract class ScanHandlerBase
{
    private transient Logger logger = LoggerFactory.getLogger(ScanHandlerBase.class);
    public enum Status {New, Running, Finished, Error};

    protected String guid = UUID.randomUUID().toString();
    protected Status status = Status.New;
    protected String statusDescription = "";
    protected transient DataCollectionTarget target;
    protected transient OSInfo osInfo;
    protected long startTimestampMillis;
    protected long endTimestampMillis;
    protected String threadName;
    protected transient SecurityScanner scannerInstance;
    protected List<ScanFinding> findings = new LinkedList<>();

    public abstract String getDisplayName();

    protected ScanHandlerBase(SecurityScanner owner, String threadName, OSInfo osInfo, DataCollectionTarget target)
    {
        this.scannerInstance = owner;
        this.threadName = threadName;
        this.osInfo = osInfo;
        this.target = target;
    }

    protected void beginRun()
    {
        this.setStatus(Status.Running);
        this.startTimestampMillis = System.currentTimeMillis();
    }

    protected void endRun()
    {
        this.endTimestampMillis = System.currentTimeMillis();
        //let the parent know that this thread is done
        scannerInstance.scanHandlerFinishedCallback(this, this.threadName);
    }
    public boolean handleVerificationData(VulnIQVulnerabilityVerificationData verificationData, VulnIQVulnerabilityData viqVulnerability, VulnerabilityFinding terziVulnerabilityFinding)
    {
        try
        {
            if (verificationData.isOVAL())
            {
                return handleOVALVerificationData(verificationData, viqVulnerability, terziVulnerabilityFinding);
            }
            else if (verificationData.isCVRF())
            {
                //TODO implement
                logger.warn("Unsupported vulnerability verification data! CSRF is not supported yet. data.guid=" + verificationData.getGuid());
            }
            else if (verificationData.isMSKBArticle())
            {
                return handleMSKBArticleVerificationData(verificationData, viqVulnerability, terziVulnerabilityFinding);
            }
        }
        catch (Exception ex)
        {
            logger.error("handleVerificationData - Unexpected error - verificationData:" + verificationData + " for:" + viqVulnerability.getName(), ex);
        }
        return false;
    }

    public boolean handleMSKBArticleVerificationData(VulnIQVulnerabilityVerificationData verificationData, VulnIQVulnerabilityData viqVulnerability, VulnerabilityFinding terziVulnerabilityFinding)
    {
        WindowsOSInfo windowsOSInfo = (WindowsOSInfo) osInfo;
        WindowsHotFix hotFix = windowsOSInfo.getInstalledHotfix(verificationData.getGuid());
        //if hotfix is not installed then the system is vulnerable
        terziVulnerabilityFinding.addMSKBArticleResult(verificationData, hotFix);
        return true;
    }

    public boolean handleOVALVerificationData(VulnIQVulnerabilityVerificationData verificationData, VulnIQVulnerabilityData viqVulnerability, VulnerabilityFinding terziVulnerabilityFinding)
    {
        OVALInterpreter ovalInterpreter = new OVALInterpreter(verificationData.getDataSourceGuid(), target, osInfo);
        ResultEnumeration ovalResult = ovalInterpreter.evaluateOVALItem(verificationData.getIdAtSource());
        logger.info("Evaluated OVAL verification data for " + viqVulnerability.getName() + " OVAL id:" + verificationData.getIdAtSource() + " Result:" + ovalResult);
        terziVulnerabilityFinding.addOVALResult(verificationData, verificationData.getGuid(), ovalResult, ovalInterpreter.getLogs());
        return true;
    }



    public Status getStatus()
    {
        return status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    public String getStatusDescription()
    {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription)
    {
        this.statusDescription = statusDescription;
    }


    public DataCollectionTarget getTarget()
    {
        return target;
    }

    public void setTarget(DataCollectionTarget target)
    {
        this.target = target;
    }

    public OSInfo getOsInfo()
    {
        return osInfo;
    }

    public void setOsInfo(OSInfo osInfo)
    {
        this.osInfo = osInfo;
    }

    public long getStartTimestampMillis()
    {
        return startTimestampMillis;
    }

    public void setStartTimestampMillis(long startTimestampMillis)
    {
        this.startTimestampMillis = startTimestampMillis;
    }

    public String getThreadName()
    {
        return threadName;
    }

    public void setThreadName(String threadName)
    {
        this.threadName = threadName;
    }

    public SecurityScanner getScannerInstance()
    {
        return scannerInstance;
    }

    public void setScannerInstance(SecurityScanner scannerInstance)
    {
        this.scannerInstance = scannerInstance;
    }

    public long getEndTimestampMillis()
    {
        return endTimestampMillis;
    }

    public void setEndTimestampMillis(long endTimestampMillis)
    {
        this.endTimestampMillis = endTimestampMillis;
    }

    public List<ScanFinding> getFindings()
    {
        return findings;
    }

    public void setFindings(List<ScanFinding> findings)
    {
        this.findings = findings;
    }

    public String getGuid()
    {
        return guid;
    }

    public void setGuid(String guid)
    {
        this.guid = guid;
    }


}
