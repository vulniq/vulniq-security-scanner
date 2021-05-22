
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

package com.vulniq.client.securityanalyzer.datacollection.windows;

import com.google.gson.JsonObject;
import com.vulniq.client.securityanalyzer.datacollection.InstalledSoftware;
import com.vulniq.client.securityanalyzer.utils.DateTimeUtils;
import com.vulniq.client.securityanalyzer.utils.JSONUtils;
import org.apache.logging.log4j.core.util.JsonUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WindowsInstalledSoftware extends InstalledSoftware
{
    private String displayName;
    private String publisher;
    private String displayVersion;
    private String installDate;

    public WindowsInstalledSoftware()
    {

    }

    public WindowsInstalledSoftware(JsonObject parsedJsonObject)
    {
        if(parsedJsonObject.has("DisplayName"))
        {
            this.setDisplayName(JSONUtils.getAsString(parsedJsonObject, "DisplayName"));
        }
        if(parsedJsonObject.has("Publisher"))
        {
            String publisher = JSONUtils.getAsString(parsedJsonObject, "Publisher");
            this.setVendor(InstalledSoftware.normalizeVendorName(publisher));
        }
        if(parsedJsonObject.has("DisplayVersion"))
        {
            String version = JSONUtils.getAsString(parsedJsonObject, "DisplayVersion");
            this.setVersion(version);
        }
        if(parsedJsonObject.has("InstallDate"))
        {
            String installDate = JSONUtils.getAsString(parsedJsonObject, "InstallDate");
            this.setInstallTime(DateTimeUtils.parseWindowsInstallDate(installDate));
        }

        if(this.getDisplayName()!=null)
        {
            if(this.getVendor()==null || this.getVendor().isBlank())
            {
                //if vendor name is empty then assume that the first word of the product name is the vendor name
                //as in "Microsoft Office", "Realtek rtl...", "Apache http..."
                int spacePos = this.getDisplayName().indexOf(' ');
                if(spacePos>-1)
                {
                    String firstWord = this.getDisplayName().substring(0, spacePos);
                    this.setVendor(firstWord);
                }
            }

            this.setName(InstalledSoftware.normalizeSoftwareName(this.getVendor(), this.getDisplayName(), this.getVersion()));

            Pattern architecturePattern = Pattern.compile("(\\b[xX]86\\b)|(\\b[xX]64\\b)");
            Matcher matcher = architecturePattern.matcher(this.getDisplayName());
            if (matcher.find())
            {
                this.setArchitecture(matcher.group(0).toLowerCase());
            }
        }
    }
    @Override
    public String toString()
    {
        return displayName;
    }
    
    public String getDisplayName()
    {
        return displayName;
    }
    
    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }

}
