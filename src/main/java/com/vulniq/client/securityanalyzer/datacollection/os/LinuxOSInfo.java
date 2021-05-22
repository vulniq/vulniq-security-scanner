

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

public class LinuxOSInfo extends OSInfo
{
    //one of the constants or null if it's not one of the well-known ones
    private LinuxType linuxType;
    private UnameProperties unameProperties;

    public LinuxOSInfo()
    {
        super();
        this.osType = OSType.Linux;
        this.linuxType = linuxType;
    }

    public LinuxType getLinuxType()
    {
        return linuxType;
    }

    public void setLinuxType(LinuxType linuxType)
    {
        this.linuxType = linuxType;
    }

    public boolean isDebian()
    {
        if(linuxType!=null && linuxType==LinuxType.debian)
        {
            return true;
        }
        return false;
    }

    public boolean isUbuntu()
    {
        if(linuxType!=null && linuxType==LinuxType.ubuntu)
        {
            return true;
        }
        return false;
    }

    public boolean isRedHat()
    {
        if(linuxType!=null && (linuxType==LinuxType.redhat || linuxType==LinuxType.centos || linuxType==LinuxType.fedora))
        {
            return true;
        }
        return false;
    }


    @Override
    public String getPackageType()
    {
        switch (linuxType)
        {
            case centos:
            case fedora:
            case redhat:
                return "RedHat";
            case debian:
            case alpine:
            case ubuntu:
                return "Debian";
        }

        return null;
    }

    /**
     * only for Debian because Debian uses the same oval ids multiple times for different debian versions
     * returns null for others
     * @return
     */
    public String getNameUsedInOVALIds()
    {
        if(isDebian())
        {
            return getVersionCodeName();
        }
        return null;
    }


    public boolean parseLinuxOSRelease(String etcOsReleaseContents)
    {
        Scanner scanner = new Scanner(etcOsReleaseContents);
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine().trim();
            String varName = StringUtils.substringBeforeFirstOf(line, "=");
            String varValue = StringUtils.substringAfterFirstOf(line, "=");
            varValue = Linux.unescapeLinuxEtcOsReleaseEntry(varValue);
            if(varName!=null)
            {
                varName = varName.toLowerCase(Locale.ENGLISH);
                switch (varName)
                {
                    case "name":
                        setOsName(varValue);
                        break;
                    case "id":
                        setLinuxType(LinuxType.fromString(varValue));
                        break;
                    case "version_id":
                        setVersionId(varValue);
                        break;
                    case "version":
                        setVersionLongName(varValue);
                        break;
                    case "cpe_name":
                        setCpeName(varValue);
                        break;
                    case "version_codename":
                        setVersionCodeName(varValue);
                        break;
                    case "pretty_name":
                        setDisplayName(varValue);
                        break;
                }
            }
        }   //while
        scanner.close();
        //now fix things that were not found. for example some debians include PRETTY_NAME but not any versionId names
        if(getDisplayName()!=null && getVersionId()==null)
        {
            switch (getLinuxType())
            {
                case debian:
                    setVersionCodeName(Debian.parseVersionFromPrettyName(getDisplayName()));
                    setVersionId(Debian.versionIdFromVersionCodeName(getVersionCodeName()));
                    break;

            }
        }
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
