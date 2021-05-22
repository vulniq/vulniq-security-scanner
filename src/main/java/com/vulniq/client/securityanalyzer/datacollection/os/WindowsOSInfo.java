
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
import com.vulniq.client.securityanalyzer.datacollection.windows.WindowsHotFix;
import com.vulniq.client.securityanalyzer.utils.StringUtils;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class WindowsOSInfo extends OSInfo
{
    private WindowsType windowsType;
    private List<WindowsHotFix> installedHotfixes;
    public WindowsOSInfo()
    {
        super();
        this.osType = OSType.Windows;
        this.windowsType = windowsType;
    }
    
    public WindowsType getWindowsType()
    {
         return windowsType;
    }
    
    public void setWindowsType(WindowsType windowsType)
    {
         this.windowsType=windowsType;
    }
    
    public boolean isPro()
    {
        if (windowsType!=null && windowsType==WindowsType.pro)
        {
            return true;
        }
        return false;
    }
    
    public boolean isHome()
    {
        if (windowsType!=null && windowsType==WindowsType.home)
        {
            return true;
        }
        return false;
    
    }
    
    public boolean isEducation()
    {
        if (windowsType!=null && windowsType==WindowsType.education)
        {
            return true;
        }
        return false;
    }
    
    public boolean isEnterprise()
    {
        if (windowsType!=null && windowsType==WindowsType.enterprise)
        {
            return true;
        }
        return false;
    }


    @Override
    public String getPackageType() 
    {
        return null;
    }

    public boolean parseWindowsOSRelease(String systemInfoOSReleaseContents)
    {
        Scanner scanner = new Scanner(systemInfoOSReleaseContents);
        while (scanner.hasNextLine())
        {
            String line=scanner.nextLine().trim();
            String varName=StringUtils.substringBeforeFirstOf(line, ":");
            String varValue=StringUtils.substringAfterFirstOf(line, ":");
            if (varName!=null && varValue!=null)
            {
                varName=varName.trim();
                varValue=varValue.trim();
                varName = varName.toLowerCase(Locale.ENGLISH);
                switch(varName)
                {
                    case "os name":
                        setOsName(varValue);
                        break;
                    case "os version":
                        setVersionLongName(varValue);
                        break;
                }
            }
        }
        scanner.close();
        //needed to allow gson serialize displayName properly
        setDisplayName(getOsName() + " " + getVersionLongName());
        return true;
    }

    public List<WindowsHotFix> getInstalledHotfixes()
    {
        return installedHotfixes;
    }

    public void setInstalledHotfixes(List<WindowsHotFix> installedHotfixes)
    {
        this.installedHotfixes = installedHotfixes;
    }

    public WindowsHotFix getInstalledHotfix(String kbArticleId)
    {
        if(this.installedHotfixes==null)
        {
            return null;
        }
        for(WindowsHotFix hotFix : this.installedHotfixes)
        {
            if(kbArticleId.equals(hotFix.getHotFixId()))
            {
                return hotFix;
            }
        }
        return null;
    }
}
