
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

package com.vulniq.client.securityanalyzer.datacollection.os;

import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.unix.UnameProperties;
import com.vulniq.client.securityanalyzer.utils.StringUtils;

import java.util.Locale;
import java.util.Scanner;

public class MacOSInfo extends OSInfo
{
    private UnameProperties unameProperties;

    public MacOSInfo()
    {
        this.osType = OSType.Mac;
    }

    @Override
    public String getPackageType()
    {
        return null;
    }

    @Override
    public String getDisplayName()
    {
        return getOsName() + " " + getVersionLongName();
    }

    /**
     * ProductName:	Mac OS X
     * ProductVersion:	10.15.3
     * BuildVersion:	19D76
     * TODO we ignore BuildVersion for now
     * @param swVersOutput
     * @return
     */
    public boolean parseMacOSXSwVers(String swVersOutput)
    {
        Scanner scanner = new Scanner(swVersOutput);
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine().trim();
            String varName = StringUtils.substringBeforeFirstOf(line, ":");
            if(varName!=null)
            {
                varName = varName.trim();
            }
            String varValue = StringUtils.substringAfterFirstOf(line, ":");
            if(varValue!=null)
            {
                varValue = varValue.trim();
            }
            if(varName!=null)
            {
                varName = varName.toLowerCase(Locale.ENGLISH);
                switch (varName)
                {
                    case "productname":
                        setOsName(varValue);
                        break;
                    case "productversion":
                        setVersionLongName(varValue);
                        break;
                }
            }
        }   //while
        scanner.close();
        return true;
    }

    public UnameProperties getUnameProperties()
    {
        return unameProperties;
    }

    public void setUnameProperties(UnameProperties unameProperties)
    {
        this.unameProperties = unameProperties;
    }
}
