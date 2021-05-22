
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

package com.vulniq.client.securityanalyzer.oval.analyze;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vulniq.client.securityanalyzer.TerziTestUtilizingDocker;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.DefinitionType;

import java.util.List;

import static org.junit.Assert.*;

public class DefinitionAnalyzerTest extends TerziTestUtilizingDocker
{

    @Test
    public void analyze()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-debian10");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter interpreter = new OVALInterpreter("cisoval", target, osInfo, false);
        //String definitionId = "oval:org.cisecurity:def:6111";
        //String definitionId = "oval:org.cisecurity:def:6076";
        String definitionId = "oval:org.cisecurity:def:6024";
        //String definitionId = "oval:org.cisecurity:def:2515";
        DefinitionType definitionType = OVALXMLLoader.loadDefinition("cisoval", definitionId, osInfo.getDisplayVersion(), null);
        DefinitionAnalyzer definitionAnalyzer = new DefinitionAnalyzer(interpreter, definitionType);
        definitionAnalyzer.analyze();
        System.out.println("Result=" + definitionAnalyzer.getResult());
        assertNotNull(definitionAnalyzer.getResult());

    }
}