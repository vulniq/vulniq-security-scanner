

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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects;

import com.vulniq.client.securityanalyzer.TerziTestSetup;
import com.vulniq.client.securityanalyzer.TerziTestUtilizingDocker;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.DefinitionType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DpkginfoObjectImplTest extends TerziTestUtilizingDocker
{
    @Test
    public void collect() throws UnexpectedOVALEvaluationError
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-debian10");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter ovalInterpreter = new OVALInterpreter("cisoval", target, osInfo);
        DpkginfoObject xmlObj = new DpkginfoObject();
        EntityObjectStringType packageName = new EntityObjectStringType();
        packageName.setValue("perl");
        xmlObj.setName(packageName);
        DpkginfoObjectImpl dpkg = new DpkginfoObjectImpl(ovalInterpreter, xmlObj);
        dpkg.setTimeout(1000000);
        boolean collectResult = dpkg.collect();
        System.out.println(dpkg.getCollectedValues());
        Assert.assertTrue(collectResult);
        ovalInterpreter.printLogsPlainText(System.out);
    }

    @Test
    public void compareVersions()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-debian10");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter ovalInterpreter = new OVALInterpreter("cisoval", target, osInfo);
        DpkginfoObject xmlObj = new DpkginfoObject();
        EntityObjectStringType packageName = new EntityObjectStringType();

        DpkginfoObjectImpl dpkg = new DpkginfoObjectImpl(ovalInterpreter, xmlObj);
        dpkg.setTimeout(1000000);

        Assert.assertTrue("1.2.3 is equal to 1.2.3", dpkg.compareVersions(target, OperationEnumeration.EQUALS, "1.2.3", "1.2.3"));

        Assert.assertTrue(dpkg.compareVersions(target, OperationEnumeration.LESS_THAN, "0:2.6.0~pre3-1", "0:2.6.0-1"));

        Assert.assertTrue(dpkg.compareVersions(target, OperationEnumeration.GREATER_THAN_OR_EQUAL, "7.52.1-5+deb9u8", "7.51.1-5+deb9u8"));
    }

    //@Test
    public void evaluateSingleValueVsState() throws UnexpectedOVALEvaluationError
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-debian10");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter ovalInterpreter = new OVALInterpreter("cisoval", target, osInfo);
        DpkginfoObject xmlObj = (DpkginfoObject) OVALXMLLoader.loadObject("cisoval", "oval:org.mitre.oval:obj:10648", osInfo.getDisplayVersion(), null);

        DpkginfoObjectImpl dpkgImpl = new DpkginfoObjectImpl(ovalInterpreter, xmlObj);

        DpkginfoState xmlState = (DpkginfoState) OVALXMLLoader.loadState("cisoval", "oval:org.cisecurity:ste:8033", osInfo.getDisplayVersion(), null);

        if(dpkgImpl.collect())
        {
            for(Object individualValue:dpkgImpl.getCollectedValues())
            {
                try
                {
                    List<ResultEnumeration> results = dpkgImpl.evaluateSingleValueVsState(individualValue, xmlState);
                    System.out.println(results);
                    Assert.assertNotNull(results);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void testUbuntu()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-ubuntu1804");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter ovalInterpreter = new OVALInterpreter("NOTUSED", target, osInfo);
        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/test-data/oval/ubuntu-test.xml";
        File xmlFile = new File(ovalXMLPath);
        OvalDefinitions ovalDefinitions = OVALXMLLoader.loadOVALDefinitionsFile(xmlFile);

        DpkginfoObject dpkginfoObject = (DpkginfoObject) OVALXMLLoader.loadObject("NOTUSED", "oval:com.ubuntu.bionic:obj:414710000000", null, null);
        DpkginfoObjectImpl dpkgImpl = new DpkginfoObjectImpl(ovalInterpreter, dpkginfoObject);

        ObjectCollectionResult result = dpkgImpl.collectValues(target);
        Assert.assertNotNull(result);
        System.out.println(StringUtils.toJson(result, true));

        ResultEnumeration ubuntuInstalledResult = ovalInterpreter.evaluateDefinition("oval:com.ubuntu.bionic:def:100");
        Assert.assertEquals(ResultEnumeration.TRUE, ubuntuInstalledResult);

/*
        ResultEnumeration aptTestResult = ovalInterpreter.evaluateTest("oval:com.ubuntu.bionic:tst:435910000000");
        Assert.assertEquals(ResultEnumeration.TRUE, aptTestResult);
*/
    }


    @Test
    public void testOVALTestContent()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-debian10");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter ovalInterpreter = new OVALInterpreter("cisoval", target, osInfo, true);

        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/linux-def_dpkginfo_test.xml";
        File ovalFile = new File(ovalXMLPath);

        OvalDefinitions definitions = OVALXMLLoader.loadOVALDefinitionsFile(ovalFile);
        Map<String, ResultEnumeration> testResults = new HashMap<>();
        for(int index = 0; index< definitions.getDefinitions().getDefinition().size(); index++)
        {
            String definitionId = definitions.getDefinitions().getDefinition().get(index).getId();
            ResultEnumeration resultOfDef = ovalInterpreter.evaluateDefinition(definitionId);
            testResults.put(definitionId, resultOfDef);
            System.out.println(definitionId + "   " + resultOfDef);
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
