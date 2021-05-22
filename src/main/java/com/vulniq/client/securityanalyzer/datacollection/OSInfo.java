
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

import com.vulniq.client.securityanalyzer.datacollection.docker.DockerContainerInfo;
import com.vulniq.client.securityanalyzer.datacollection.os.LinuxType;

public abstract class OSInfo
{
    public enum OSType {Windows, Linux, Mac, Unknown};

    protected OSType osType = OSType.Unknown;

    protected String osName;
    protected String versionId;
    protected String versionCodeName;
    protected String versionLongName;
    protected String cpeName;
    protected String displayName;
    protected DockerContainerInfo containerInfo;

    public OSInfo()
    {
    }


    /**
     * to be used for calling vulniq list-by-package endpoint
     * @return
     */
    public abstract String getPackageType();

    public OSType getOsType()
    {
        return osType;
    }

    public void setOsType(OSType osType)
    {
        this.osType = osType;
    }

    public String getVersionId()
    {
        return versionId;
    }

    public void setVersionId(String versionId)
    {
        this.versionId = versionId;
    }

    public String getVersionLongName()
    {
        return versionLongName;
    }

    public void setVersionLongName(String versionLongName)
    {
        this.versionLongName = versionLongName;
    }

    public String getCpeName()
    {
        return cpeName;
    }

    public void setCpeName(String cpeName)
    {
        this.cpeName = cpeName;
        //TODO parse the cpe name and set versionId etc
    }

    public String getOsName()
    {
        return osName;
    }

    public void setOsName(String osName)
    {
        this.osName = osName;
    }

    public String getVersionCodeName()
    {
        return versionCodeName;
    }

    public void setVersionCodeName(String versionCodeName)
    {
        this.versionCodeName = versionCodeName;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }

    public DockerContainerInfo getContainerInfo()
    {
        return containerInfo;
    }

    public void setContainerInfo(DockerContainerInfo containerInfo)
    {
        this.containerInfo = containerInfo;
    }

    public String getDisplayVersion()
    {
        if(versionLongName!=null && !versionLongName.isBlank())
        {
            return versionLongName;
        }
        if(versionCodeName!=null && !versionCodeName.isBlank())
        {
            return versionCodeName;
        }
        return versionId;
    }
}
