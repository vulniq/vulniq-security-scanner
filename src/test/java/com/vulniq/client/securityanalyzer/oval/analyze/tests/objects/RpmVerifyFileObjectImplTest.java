
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

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.FlagEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;

/**
 *
 *
 */
public class RpmVerifyFileObjectImplTest extends TerziTestUtilizingDocker
{

    OVALInterpreter ovalInterpreter;
    DataCollectionTarget target;
    OSInfo osInfo;
    String verifyFileObject = "<rpmverifyfile_object id=\"oval:com.redhat.rhba:obj:20070304015\" version=\"638\" xmlns=\"http://oval.mitre.org/XMLSchema/oval-definitions-5#linux\">\n"
            + "<behaviors noconfigfiles=\"true\" noghostfiles=\"true\" nogroup=\"true\" nolinkto=\"true\" nomd5=\"true\" nomode=\"true\" nomtime=\"true\" nordev=\"true\" nosize=\"true\" nouser=\"true\"/>\n"
            + "<name operation=\"pattern match\"/>\n"
            + "<epoch operation=\"pattern match\"/>\n"
            + "<version operation=\"pattern match\"/>\n"
            + "<release operation=\"pattern match\"/>\n"
            + "<arch operation=\"pattern match\"/>\n"
            + "<filepath>/etc/redhat-release</filepath>\n"
            + "</rpmverifyfile_object>";

    String verifyFileState = "<rpmverifyfile_state id=\"oval:com.redhat.rhba:ste:20150364007\" version=\"638\" xmlns=\"http://oval.mitre.org/XMLSchema/oval-definitions-5#linux\">\n"
            + "<name operation=\"pattern match\">^redhat-release</name>\n"
            + "<version operation=\"pattern match\">^7[^\\d]</version>\n"
            + " </rpmverifyfile_state>";

    @Before
    public void setUp()
    {
        target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-rhel7");
        osInfo = OSInfoCollector.getOSInfo(target);
        ovalInterpreter = new OVALInterpreter("unit-test", target, osInfo, false);
    }

    @Test
    public void collectValues() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
    {
        RpmverifyfileObject xmlObj = (RpmverifyfileObject) OVALXMLLoader.loadObjectFromXML(verifyFileObject);
        RpmverifyfileState xmlState = (RpmverifyfileState) OVALXMLLoader.loadStateFromXML(verifyFileState);

        RpmVerifyFileObjectImpl impl = new RpmVerifyFileObjectImpl(ovalInterpreter, xmlObj);
        ObjectCollectionResult collectionResult = impl.collectValues(target);
        assertTrue(collectionResult.getCollectionStatus() == FlagEnumeration.COMPLETE);
        assertFalse(collectionResult.getCollectedValues().isEmpty());

    }

    @Test
    public void evaluateSingleValueVsState() throws Exception
    {
        RpmverifyfileObject xmlObj = (RpmverifyfileObject) OVALXMLLoader.loadObjectFromXML(verifyFileObject);
        RpmverifyfileState xmlState = (RpmverifyfileState) OVALXMLLoader.loadStateFromXML(verifyFileState);

        RpmVerifyFileObjectImpl impl = new RpmVerifyFileObjectImpl(ovalInterpreter, xmlObj);
        ObjectCollectionResult collectionResult = impl.collectValues(target);
        assertFalse(collectionResult.getCollectedValues().isEmpty());
        
        for(Object rpmVerifyFileItem : collectionResult.getCollectedValues())
        {
            List<ResultEnumeration> results = impl.evaluateSingleValueVsState(rpmVerifyFileItem, xmlState);
            System.out.println(results);
            assertNotNull(results);
        }
    }

    @Test
    public void testOVALTestContent()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-rhel7");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter ovalInterpreter = new OVALInterpreter("cisoval", target, osInfo, true);

        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/linux-def_rpmverifyfile_test.xml";
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
