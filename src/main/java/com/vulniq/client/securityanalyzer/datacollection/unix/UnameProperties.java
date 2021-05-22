
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

package com.vulniq.client.securityanalyzer.datacollection.unix;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vulniq.client.securityanalyzer.utils.StringUtils;

public class UnameProperties
{

    /**
     * uname -m
     */
    private String machineClass;
    /**
     * uname -n
     */
    private String nodeName;
    /**
     * uname -s
     * "--kernel-name" on Linux
     */
    private String osName;
    /**
     * uname -r
     * "--kernel-release" on Linux
     */
    private String osRelease;
    /**
     * uname -v
     * "--kernel-version" on Linux
     */
    private String osVersion;
    /**
     * uname -p
     *  "--processor" on Linux
     */
    private String processorType;

    public String getMachineClass()
    {
        return machineClass;
    }

    public void setMachineClass(String machineClass)
    {
        this.machineClass = machineClass;
    }

    public String getNodeName()
    {
        return nodeName;
    }

    public void setNodeName(String nodeName)
    {
        this.nodeName = nodeName;
    }

    public String getOsName()
    {
        return osName;
    }

    public void setOsName(String osName)
    {
        this.osName = osName;
    }

    public String getOsRelease()
    {
        return osRelease;
    }

    public void setOsRelease(String osRelease)
    {
        this.osRelease = osRelease;
    }

    public String getOsVersion()
    {
        return osVersion;
    }

    public void setOsVersion(String osVersion)
    {
        this.osVersion = osVersion;
    }

    public String getProcessorType()
    {
        return processorType;
    }

    public void setProcessorType(String processorType)
    {
        this.processorType = processorType;
    }

    /**
     * convenience method for linux, returns osName
     * @return
     */
    public String getKernelName()
    {
        return osName;
    }

    /**
     * convenience method for linux, returns osRelease
     * @return
     */
    public String getKernelRelease()
    {
        return osRelease;
    }

    /**
     * convenience method for linux, returns osVersion
     * @return
     */
    public String getKernelVersion()
    {
        return osVersion;
    }

    /**
     *
     * @return machineClass
     */
    public String getArchitecture()
    {
        return machineClass;
    }

    /**
     *
     * @return osRelease
     */
    public String getEvr()
    {
        return osRelease;
    }

    /**
     *
     * @return the last part of osRelease, after last -
     */
    public String getEvrReleasePart()
    {
        if(osRelease==null)
        {
            return "";
        }
        int lastDash = osRelease.lastIndexOf('-');
        if(lastDash<0)
        {
            return null;
        }
        if((lastDash+1)==osRelease.length())
        {
            return "";
        }
        return osRelease.substring(lastDash+1);
    }

    public String getEvrVersionPart()
    {
        if(osRelease==null)
        {
            return "";
        }
        String evrString = osRelease;
        if(osRelease.contains(":"))
        {
            evrString = StringUtils.substringAfterFirstOf(osRelease, ":");
        }
        int firstDash = evrString.indexOf('-');
        if(firstDash<0)
        {
            return evrString;
        }
        return evrString.substring(0, firstDash);
    }
    
    @Override
    public String toString()
    {
        String combinedInfo = String.format("%s %s %s %s %s %s", osName.trim(), nodeName.trim(),osRelease.trim(),osVersion.trim(),machineClass.trim(),processorType.trim());
        return combinedInfo;
    }
}
