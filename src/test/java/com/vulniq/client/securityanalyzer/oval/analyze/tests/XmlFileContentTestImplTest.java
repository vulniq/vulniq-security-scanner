
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

package com.vulniq.client.securityanalyzer.oval.analyze.tests;

import com.vulniq.client.securityanalyzer.TerziTestSetup;
import com.vulniq.client.securityanalyzer.TerziTestUtilizingDocker;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import org.junit.After;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 */
public class XmlFileContentTestImplTest extends TerziTestUtilizingDocker
{
    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of XmlFileContentTestImpl class for Host for Windows OS.
     */
    @Test
    public void testOfXmlFileContentTestWindows()
    {
        //Run these tests only on windows
        Assume.assumeTrue(TerziTestSetup.isOnWindows());

        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-windows");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter ovalInterpreter = new OVALInterpreter("unit-test", target, osInfo, true);

        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/ind-def_xmlfilecontent_test-windows.xml";
        File ovalFile = new File(ovalXMLPath);

        OvalDefinitions definitions = OVALXMLLoader.loadOVALDefinitionsFile(ovalFile);

        Map<String, ResultEnumeration> testResults = new HashMap<>();
        for (int index = 0; index < definitions.getDefinitions().getDefinition().size(); index++)
        {
            String definitionId = definitions.getDefinitions().getDefinition().get(index).getId();
            ResultEnumeration resultOfTest = ovalInterpreter.evaluateDefinition(definitionId);
            testResults.put(definitionId, resultOfTest);
            System.out.println("----------------------------------------------------");
            System.out.println(definitionId + "   " + resultOfTest);
            System.out.println("----------------------------------------------------");
        }
        System.out.println("----------------------Test results------------------------------");
        System.out.println(testResults.toString());
        System.out.println("----------------------------------------------------");
        Assert.assertTrue(testResults.containsValue(ResultEnumeration.TRUE));
        Assert.assertTrue(!testResults.containsValue(ResultEnumeration.FALSE));
        Assert.assertTrue(!testResults.containsValue(ResultEnumeration.ERROR));
        Assert.assertTrue(!testResults.containsValue(ResultEnumeration.NOT_APPLICABLE));
        Assert.assertTrue(!testResults.containsValue(ResultEnumeration.NOT_EVALUATED));
        Assert.assertTrue(!testResults.containsValue(ResultEnumeration.UNKNOWN));
    }

    /**
     * Test of XmlFileContentTestImpl class for Docker.
     */
    @Test
    public void testOfXmlFileContentTestDocker()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-debian10");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter ovalInterpreter = new OVALInterpreter("unit-test", target, osInfo, true);

        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/ind-def_xmlfilecontent_test.xml";
        File ovalFile = new File(ovalXMLPath);

        OvalDefinitions definitions = OVALXMLLoader.loadOVALDefinitionsFile(ovalFile);

        Map<String, ResultEnumeration> testResults = new HashMap<>();
        for (int index = 0; index < definitions.getDefinitions().getDefinition().size(); index++)
        {
            String definitionId = definitions.getDefinitions().getDefinition().get(index).getId();
            ResultEnumeration resultOfTest = ovalInterpreter.evaluateDefinition(definitionId);
            testResults.put(definitionId, resultOfTest);
            System.out.println("----------------------------------------------------");
            System.out.println(definitionId + "   " + resultOfTest);
            System.out.println("----------------------------------------------------");
        }
        System.out.println("----------------------Test results------------------------------");
        System.out.println(testResults.toString());
        System.out.println("----------------------------------------------------");
        Assert.assertTrue(testResults.containsValue(ResultEnumeration.TRUE));
        Assert.assertTrue(!testResults.containsValue(ResultEnumeration.FALSE));
        Assert.assertTrue(!testResults.containsValue(ResultEnumeration.ERROR));
        Assert.assertTrue(!testResults.containsValue(ResultEnumeration.NOT_APPLICABLE));
        Assert.assertTrue(!testResults.containsValue(ResultEnumeration.NOT_EVALUATED));
        Assert.assertTrue(!testResults.containsValue(ResultEnumeration.UNKNOWN));
    }

}
