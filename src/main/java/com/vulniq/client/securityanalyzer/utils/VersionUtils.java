

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

package com.vulniq.client.securityanalyzer.utils;

public class VersionUtils
{
    /**
     * EVR format is EPOCH:VERSION-RELEASE
     * Note that a null epoch (or '(none)' as returned by rpm) is equivalent to '0' and would hence have the form 0:VERSION-RELEASE.
     * @param evr
     * @return
     */
    public static String getEpochFromEVR(String evr)
    {
        if(evr==null)
        {
            return null;
        }
        if(evr.isEmpty())
        {
            return "0";
        }
        String epoch = StringUtils.substringBeforeFirstOf(evr, ":");
        if(epoch==null || epoch.isEmpty())
        {
            return "0";
        }
        return epoch;
    }

    public static String getVersionFromEVR(String evr)
    {
        if(evr==null)
        {
            return null;
        }
        if(evr.isEmpty())
        {
            return "";
        }
        int dashIndex = evr.indexOf("-");
        int colonIndex = evr.indexOf(":");
        String rv = "";
        if(colonIndex<0)    //no epoch
        {
            if(dashIndex>-1)    //release exists
            {
                rv = evr.substring(0, dashIndex);
            }
            else    //no release, no epoch
            {
                rv = evr;
            }
        }
        else        //there is epoch
        {
            if(dashIndex>-1)    //both epoch and release exists
            {
                rv = evr.substring(colonIndex+1, dashIndex);
            }
            else    //no release, only epoch
            {
                rv = evr.substring(colonIndex+1);
            }
        }
        return rv;
    }

    public static String getReleaseFromEVR(String evr)
    {
        if(evr==null)
        {
            return null;
        }
        if(evr.isEmpty())
        {
            return "";
        }
        int dashIndex = evr.indexOf("-");
        if(dashIndex<0)
        {
            return "";
        }
        else
        {
            return evr.substring(dashIndex+1);
        }
    }
}
