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

import com.vulniq.client.securityanalyzer.TerziTestBase;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CriteriaAnalyzerTest extends TerziTestBase
{

    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    public void testOVALTestContentCriteria()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Host, "");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter ovalInterpreter = new OVALInterpreter("cisoval", target, osInfo);
        ovalInterpreter.setOvalLogLevel(4);
        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/oval-def_criteria.xml";
        File ovalFile = new File(ovalXMLPath);

        OvalDefinitions definitions = OVALXMLLoader.loadOVALDefinitionsFile(ovalFile);

        Map<String, ResultEnumeration> testResults = new HashMap<>();
        for(int index = 0; index< definitions.getDefinitions().getDefinition().size(); index++)
        {
            String definitionId = definitions.getDefinitions().getDefinition().get(index).getId();
            ResultEnumeration resultForDefinition = ovalInterpreter.evaluateDefinition(definitionId);
            testResults.put(definitionId, resultForDefinition);
            System.out.println(definitionId + "   " + resultForDefinition);
        }
        System.out.println(testResults);
        Assert.assertTrue(testResults.containsValue(ResultEnumeration.TRUE));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.ERROR));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.FALSE));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.NOT_APPLICABLE));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.NOT_EVALUATED));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.UNKNOWN));
    }
}