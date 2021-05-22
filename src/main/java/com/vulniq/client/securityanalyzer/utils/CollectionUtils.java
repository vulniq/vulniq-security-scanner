

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

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CollectionUtils
{
    public static Map mapFromArgs(Object... args)
    {
        Map rv = new LinkedHashMap();
        for(int i=0; i<args.length; i=(i+2))
        {
            if((i+1)<args.length)
            {
                rv.put(args[i], args[i+1]);
            }
            else
            {
                rv.put(args[i], null);
            }
        }
        return rv;
    }
}
