
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

package com.vulniq.client.securityanalyzer.logging;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class TerziLog
{
    private static Logger logger = LoggerFactory.getLogger(TerziLog.class);

    public static void supportCase(String where, String what, String details, String solution, Throwable ex)
    {
        Map<String,Object> valuesForLog = new HashMap<>();
        valuesForLog.put("Where", where);
        valuesForLog.put("What", what);
        valuesForLog.put("Details", details);
        valuesForLog.put("Solution", solution);
        valuesForLog.put("Exception", ex);
        Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
        String logStr = gson.toJson(valuesForLog);
        System.out.println("WARNING: A support case might be required to resolve this issue: " + logStr);
        logger.warn("WARNING: A support case might be required to resolve this issue:" + logStr);
    }
}
