
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

package com.vulniq.client.securityanalyzer.datacollection.linux;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vulniq.client.securityanalyzer.datacollection.unix.UnameProperties;
import com.vulniq.client.securityanalyzer.utils.VersionUtils;

import java.util.ArrayList;
import java.util.List;

public class CollectedDpkgInfo
{
    public CollectedDpkgInfo()
    {

    }

    public CollectedDpkgInfo(UnameProperties unameProperties)
    {
        this.setArchitecture(unameProperties.getArchitecture());
        this.setEpoch("0");
        this.setEvr(unameProperties.getEvr());
        this.setName("linux");
    }
    private String name;
    private String architecture;
    private String epoch;
    private String version;
    private String release;
    private String evr;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getArchitecture()
    {
        return architecture;
    }

    public void setArchitecture(String architecture)
    {
        this.architecture = architecture;
    }

    public String getEpoch()
    {
        return epoch;
    }

    public void setEpoch(String epoch)
    {
        this.epoch = epoch;
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public String getRelease()
    {
        return release;
    }

    public void setRelease(String release)
    {
        this.release = release;
    }

    public String getEvr()
    {
        if(evr == null)
        {
            return (epoch==null?"0":epoch) + ":" + this.version + "-" + this.release;
        }
        return evr;
    }

    /**
     * parses and sets other fields as well
     * @return
     */
    public void setEvr(String evr)
    {
        this.epoch = VersionUtils.getEpochFromEVR(evr);
        this.version = VersionUtils.getVersionFromEVR(evr);
        this.release = VersionUtils.getReleaseFromEVR(evr);
        this.evr = evr;
    }

    @Override
    public String toString()
    {
        return this.name + " " + this.evr;
    }

}
