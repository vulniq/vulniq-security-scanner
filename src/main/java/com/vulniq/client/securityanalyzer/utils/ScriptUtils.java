
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class ScriptUtils
{
    private static Logger logger = LoggerFactory.getLogger(ScriptUtils.class);

    public static String getPowershellScriptFileAbsolutePath(String scriptFilename)
    {
        String directoryPath;
        String scriptsPath;
        if("yes".equals(System.getProperty("TERZI_RUNNING_UNIT_TESTS")))
        {
            directoryPath = new File("").getAbsolutePath();
            scriptsPath = "\\src\\main\\resources\\powershell-scripts\\";
        }
        else
        {
            //At runtime current working dir is the bin folder
            directoryPath = new File("../").getAbsolutePath();
            scriptsPath = "/scripts/powershell/";
        }

        String scriptAbsolutePath = directoryPath + scriptsPath + scriptFilename;
        logger.debug("getScriptFileAbsolutePath return " + scriptAbsolutePath);
        return scriptAbsolutePath;
    }

}
