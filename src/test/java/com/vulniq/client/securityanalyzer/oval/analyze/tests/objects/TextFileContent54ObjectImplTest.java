
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

import com.vulniq.client.securityanalyzer.TerziTestUtilizingDocker;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.textfilecontent54.TextFileContent54Item;
import org.junit.Assert;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Textfilecontent54Object;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileObject;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class TextFileContent54ObjectImplTest extends TerziTestUtilizingDocker
{

    private TextFileContent54ObjectImpl setupObjectImpl()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-debian10");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter ovalInterpreter = new OVALInterpreter("cisoval", target, osInfo);
        Textfilecontent54Object ovalObjDef = (Textfilecontent54Object) OVALXMLLoader.loadObjectFromXML("<textfilecontent54_object xmlns=\"http://oval.mitre.org/XMLSchema/oval-definitions-5#independent\" comment=\"Object holds Debian version\" id=\"oval:org.mitre.oval:obj:26771\" version=\"16\">\n" +
                "  <path>/etc</path>\n" +
                "  <filename>debian_version</filename>\n" +
                "  <pattern operation=\"pattern match\">^(\\d+).*$</pattern>\n" +
                "  <instance datatype=\"int\">1</instance>\n" +
                "</textfilecontent54_object>");
        //Textfilecontent54Object ovalObjDef = (Textfilecontent54Object) OVALXMLLoader.loadObject("cisoval", "oval:org.mitre.oval:obj:26771", osInfo.getDisplayVersion(), null);

        TextFileContent54ObjectImpl impl = new TextFileContent54ObjectImpl(ovalInterpreter, ovalObjDef);
        return impl;
    }

    @Test
    public void checkExistence()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-debian10");
        TextFileContent54ObjectImpl impl = setupObjectImpl();
        StatusEnumeration statusEnumeration = impl.checkExistence(target);
        System.out.println("checkExistence statusEnumeration=" + statusEnumeration);

    }

    @Test
    public void collectValue()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-debian10");
        TextFileContent54ObjectImpl impl = setupObjectImpl();
        ObjectCollectionResult result = impl.collectValues(target);
        assertNotNull(result);
        System.out.println("Collection status:" + result.getCollectionStatus());
        System.out.println("Collected values:" + result.getCollectedValues());
        List<TextFileContent54Item> content54ItemList = (List<TextFileContent54Item>) result.getCollectedValues().get(0);
        TextFileContent54Item item = (TextFileContent54Item)content54ItemList.get(0);
        assertEquals("10", item.getSubexpression().get(0));
    }

    @Test
    public void evaluateSingleValueVsState()
    {
    }

    @Test
    public void testOVALTestContent()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-rhel7");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter ovalInterpreter = new OVALInterpreter("cisoval", target, osInfo, true);

        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/ind-def_textfilecontent54_test-linux.xml";
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
