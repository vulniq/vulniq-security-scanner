

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

package com.vulniq.client.securityanalyzer.scan.finding;

import java.util.UUID;

public class ScanFinding
{
    public enum FindingType {Vuln, Info};
    public enum VerificationStatus {Unverified, Verified_OVAL, Verified_MSHotfix};
    public enum FindingScore {Unknown, Informational, Low, Medium, High, Critical, Fatal};

    protected FindingType findingType;
    protected VerificationStatus verificationStatus;
    protected String verificationDescription;

    protected String findingGuid = UUID.randomUUID().toString();
    protected String name;
    protected String description;
    protected FindingScore score = FindingScore.Informational;
    protected boolean needsReview;


    public ScanFinding()
    {
        this.findingType = FindingType.Info;
        this.score = FindingScore.Informational;
        this.needsReview = false;
    }

    public FindingType getFindingType()
    {
        return findingType;
    }

    public void setFindingType(FindingType findingType)
    {
        this.findingType = findingType;
    }

    public VerificationStatus getVerificationStatus()
    {
        return verificationStatus;
    }

    public void setVerificationStatus(VerificationStatus verificationStatus)
    {
        this.verificationStatus = verificationStatus;
    }

    public String getTitle()
    {
        return this.name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public FindingScore getScore()
    {
        return score;
    }

    public void setScore(FindingScore score)
    {
        this.score = score;
    }

    public boolean isNeedsReview()
    {
        return needsReview;
    }

    public void setNeedsReview(boolean needsReview)
    {
        this.needsReview = needsReview;
    }

    public String getFindingGuid()
    {
        return findingGuid;
    }

    public void setFindingGuid(String findingGuid)
    {
        this.findingGuid = findingGuid;
    }

    public static FindingScore getFindingScoreFromVulnIQDataScore(String dataScore)
    {
        //dataScore: enum('Unknown','None','Low','Medium','High','Critical')
        if(dataScore==null || dataScore.isEmpty() || dataScore.isBlank())
        {
            return FindingScore.Unknown;
        }
        if("None".equals(dataScore))
        {
            return FindingScore.Informational;
        }
        if("Low".equals(dataScore))
        {
            return FindingScore.Low;
        }
        if("Medium".equals(dataScore))
        {
            return FindingScore.Medium;
        }
        if("High".equals(dataScore))
        {
            return FindingScore.High;
        }
        if("Critical".equals(dataScore))
        {
            return FindingScore.Critical;
        }
        return FindingScore.Unknown;
    }

    public String getVerificationDescription()
    {
        return verificationDescription;
    }

    public void setVerificationDescription(String verificationDescription)
    {
        this.verificationDescription = verificationDescription;
    }
}
