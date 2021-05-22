

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

package com.vulniq.client.securityanalyzer.datacollection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public class InstalledSoftware
{
    private transient Logger logger = LoggerFactory.getLogger(InstalledSoftware.class);
    private String name;
    private String version;
    private String description;
    private String architecture;
    private String vendor;
    private Date installTime;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getArchitecture()
    {
        return architecture;
    }

    public void setArchitecture(String architecture)
    {
        this.architecture = architecture;
    }

    public String getVendor()
    {
        return vendor;
    }

    public void setVendor(String vendor)
    {
        this.vendor = vendor;
    }

    public Date getInstallTime()
    {
        return installTime;
    }

    public void setInstallTime(Date installTime)
    {
        this.installTime = installTime;
    }

    public void setInstallTimeUnixTimestamp(String installTimeUnixTs)
    {
        if(installTimeUnixTs==null || installTimeUnixTs.isBlank())
        {
            return;
        }
        try
        {
            this.installTime = new Date(Long.parseLong(installTimeUnixTs) * 1000l);
        }
        catch (Exception ex)
        {
            logger.error("Error setting install time from unix timestamp value:'" +installTimeUnixTs+ "'", ex);
        }
    }

    public static String normalizeVendorName(String vendor)
    {
        if(vendor==null)
        {
            return null;
        }
        if(vendor.isBlank())
        {
            return "";
        }
        vendor = vendor.toLowerCase(Locale.ENGLISH);
        vendor = vendor.trim();

        String regex = "(\\s+(llc|corp|corporation|inc|incorporation|co|ltd|limited|plc|ag|gmbh|project|systems incorporated)\\.?)$";
        String rv = vendor.replaceAll(regex, "");
        return rv;
    }

    public static String normalizeSoftwareName(String normalizedVendorName, String softwareName, String version)
    {
        if(softwareName==null)
        {
            return null;
        }
        if(softwareName.isBlank())
        {
            return "";
        }
        softwareName = softwareName.toLowerCase(Locale.ENGLISH);
        if(version!=null)
        {
            version = version.toLowerCase(Locale.ENGLISH);
        }
        List<String> vendorSuffixes = List.of(
                "llc", "corp", "corporation", "inc", "incorporation", "co", "ltd", "limited", "plc", "ag", "gmbh", "project", "systems incorporated"
        );
        String vendorRegex = "^("+ Pattern.quote(normalizedVendorName) +
                        "(\\s*(" + String.join("|", vendorSuffixes)+")?\\.?)\\s+)";
        softwareName = softwareName.replaceFirst(vendorRegex, "");

        softwareName = softwareName.replaceAll("(\\((x86|x64)\\s[a-z]{2}[\\-_][a-z]{2,3}\\))", "");
        softwareName = softwareName.replaceAll("(\\((x86|x64)\\))", "");
        softwareName = softwareName.replaceAll("(\\bx86|x64\\b)", "");


        if(version!=null)
        {
            String softwareNameWithoutVersion = softwareName.replaceAll("([\\s\\-]+" + Pattern.quote(version) + "([\\+\\-\\.]{1}[0-9]+)?\\s*)$", "");
            if(softwareName.equals(softwareNameWithoutVersion) && version!=null)
            {
                String versionWithoutLastSegment = version.replaceFirst("(\\.[0-9]+)$", "");
                if(!version.equals(versionWithoutLastSegment) && versionWithoutLastSegment.length()>1)
                {
                    softwareName = softwareName.replaceAll("([\\s\\-]+" + Pattern.quote(versionWithoutLastSegment) + "\\s*)$", "");
                }
            }
            else
            {
                softwareName = softwareNameWithoutVersion;
            }
        }

        softwareName = softwareName.replaceFirst("([\\s\\-]+)$", "");

        softwareName = softwareName.replaceAll("\\s{2,}", " ");

        return softwareName;
    }
}
