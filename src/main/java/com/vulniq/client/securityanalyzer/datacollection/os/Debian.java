
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

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Debian extends Linux
{
    private static Map<String, String> versions;
    private static Pattern versionNamesPattern;
    static
    {
        versions = new LinkedHashMap<>();
        versions.put("bookworm", "12");
        versions.put("bullseye", "11");
        versions.put("buster", "10");
        versions.put("stretch", "9");
        versions.put("jessie", "8");
        versions.put("wheezy", "7");
        versions.put("squeeze", "6.0");
        versions.put("lenny", "5.0");
        versions.put("sarge", "3.1");
        versions.put("woody", "3.0");
        versions.put("potato", "2.2");
        versions.put("slink", "2.1");
        versions.put("hamm", "2.0");
        versions.put("bo", "1.3");
        versions.put("rex", "1.2");
        versions.put("buzz", "1.1");

        versionNamesPattern = Pattern.compile("\\b(" + String.join("|", versions.keySet()) + ")\\b");
    }

    public static String parseVersionFromPrettyName(String prettyName)
    {
        //PRETTY_NAME="Debian GNU/Linux 9 (stretch)"
        //PRETTY_NAME="Debian GNU/Linux buster/sid"
        if(prettyName==null)
        {
            return null;
        }
        prettyName = prettyName.toLowerCase(Locale.ENGLISH);
        Matcher m = versionNamesPattern.matcher(prettyName);
        if(m.find())
        {
            String versionName = m.group(1);
            return versionName;
        }
        return null;
    }

    public static String versionIdFromVersionCodeName(String versionCodeName)
    {
        return versions.get(versionCodeName);
    }
}
