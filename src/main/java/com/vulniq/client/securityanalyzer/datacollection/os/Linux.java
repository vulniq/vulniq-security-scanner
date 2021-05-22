

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
import com.vulniq.client.securityanalyzer.utils.StringUtils;

import java.util.Locale;
import java.util.Scanner;

public class Linux
{
    public static String unescapeLinuxEtcOsReleaseEntry(String varValue)
    {
        if(varValue==null)
        {
            return varValue;
        }
        if(varValue.startsWith("\""))
        {
            varValue = varValue.substring(1);
            if(varValue.endsWith("\""))
            {
                varValue = varValue.substring(0, varValue.length()-1);
            }
        }

        //we are trying to replace two backslashes with one back slash
        varValue = varValue.replaceAll("\\\\\\\\", "\\");

        return varValue;

    }




}
