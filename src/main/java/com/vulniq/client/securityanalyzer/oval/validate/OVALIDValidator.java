

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

package com.vulniq.client.securityanalyzer.oval.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OVALIDValidator
{
    public static final Pattern definitionIDPattern = Pattern.compile("oval:[A-Za-z0-9_\\-\\.]+:def:[1-9][0-9]*");
    public static final Pattern objectIDPattern = Pattern.compile("oval:[A-Za-z0-9_\\-\\.]+:obj:[1-9][0-9]*");
    public static final Pattern stateIDPattern = Pattern.compile("oval:[A-Za-z0-9_\\-\\.]+:ste:[1-9][0-9]*");
    public static final Pattern testIDPattern = Pattern.compile("oval:[A-Za-z0-9_\\-\\.]+:tst:[1-9][0-9]*");
    public static final Pattern variableIDPattern = Pattern.compile("oval:[A-Za-z0-9_\\-\\.]+:var:[1-9][0-9]*");

    public static boolean isValidDefinitionID(String idStr)
    {
        if(idStr==null || idStr.isEmpty())
        {
            return false;
        }
        Matcher m = definitionIDPattern.matcher(idStr);
        return m.matches();
    }

    public static boolean isValidObjectID(String idStr)
    {
        if(idStr==null || idStr.isEmpty())
        {
            return false;
        }
        Matcher m = objectIDPattern.matcher(idStr);
        return m.matches();
    }

    public static boolean isValidStateID(String idStr)
    {
        if(idStr==null || idStr.isEmpty())
        {
            return false;
        }
        Matcher m = stateIDPattern.matcher(idStr);
        return m.matches();
    }

    public static boolean isValidTestID(String idStr)
    {
        if(idStr==null || idStr.isEmpty())
        {
            return false;
        }
        Matcher m = testIDPattern.matcher(idStr);
        return m.matches();
    }

    public static boolean isValidVariableID(String idStr)
    {
        if(idStr==null || idStr.isEmpty())
        {
            return false;
        }
        Matcher m = variableIDPattern.matcher(idStr);
        return m.matches();
    }
}
