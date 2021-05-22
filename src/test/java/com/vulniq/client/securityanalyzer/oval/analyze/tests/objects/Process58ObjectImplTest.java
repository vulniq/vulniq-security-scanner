

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

import com.vulniq.client.securityanalyzer.TerziTestBase;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.Process58Object;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.Process58State;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.FlagEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class Process58ObjectImplTest extends TerziTestBase
{
    //TODO test with variables
    //XMLs taken from https://github.com/OVALProject/Test-Content/blob/master/solaris/unix-def_process58_test.xml
    public static final String PROCESS58_OBJECT_PID_LESS_THAN_10 = "<process58_object id=\"oval:org.mitre.oval.test:obj:541\" version=\"1\" comment=\"Retrieve process58_items with pid less than 10.\" xmlns=\"http://oval.mitre.org/XMLSchema/oval-definitions-5#unix\">\n" +
            "      <command_line operation=\"pattern match\"/>\n" +
            "      <pid datatype=\"int\" operation=\"less than\">10</pid>\n" +
            "    </process58_object>";

    public static final String PROCESS58_STATE_PID_LESS_THAN_10 = "    <process58_state id=\"oval:org.mitre.oval.test:ste:1297\" version=\"1\" comment=\"process58_items with pid less than 10.\" xmlns=\"http://oval.mitre.org/XMLSchema/oval-definitions-5#unix\">\n" +
            "      <pid datatype=\"int\" operation=\"less than\">10</pid>\n" +
            "    </process58_state>";

    OVALInterpreter ovalInterpreter;
    DataCollectionTarget hostOSTarget;
    OSInfo hostOSInfo;

    @Before
    public void setUp() throws Exception
    {
        hostOSTarget = new DataCollectionTarget(DataCollectionTargetType.Host, "host");
        hostOSInfo = OSInfoCollector.getOSInfoFromHost();
        ovalInterpreter =  new OVALInterpreter("unit-test", hostOSTarget, hostOSInfo, false);
    }


    @Test
    public void runPsCommand()
    {
        Process58Object xmlObj = (Process58Object) OVALXMLLoader.loadObjectFromXML(PROCESS58_OBJECT_PID_LESS_THAN_10);

        Process58ObjectImpl impl = new Process58ObjectImpl(ovalInterpreter, xmlObj);
        OSCommandOutput osCommandOutput = impl.runPsCommand(hostOSTarget);
        System.out.println(osCommandOutput.getStdOut());
        assertNotNull(osCommandOutput.getStdOut());
    }

    @Test
    public void checkExistence()
    {
        Process58Object xmlObj = (Process58Object) OVALXMLLoader.loadObjectFromXML(PROCESS58_OBJECT_PID_LESS_THAN_10);

        Process58ObjectImpl impl = new Process58ObjectImpl(ovalInterpreter, xmlObj);
        StatusEnumeration checkResult = impl.checkExistence(hostOSTarget);
        assertNotNull(checkResult);
    }

    @Test
    public void collectValues()
    {
        Process58Object xmlObj = (Process58Object) OVALXMLLoader.loadObjectFromXML(PROCESS58_OBJECT_PID_LESS_THAN_10);

        Process58ObjectImpl impl = new Process58ObjectImpl(ovalInterpreter, xmlObj);
        ObjectCollectionResult collectionResult = impl.collectValues(hostOSTarget);
        assertTrue(collectionResult.getCollectionStatus() == FlagEnumeration.COMPLETE);
        assertFalse(collectionResult.getCollectedValues().isEmpty());
    }

    @Test
    public void evaluateSingleValueVsState() throws Exception
    {
        Process58Object xmlObj = (Process58Object) OVALXMLLoader.loadObjectFromXML(PROCESS58_OBJECT_PID_LESS_THAN_10);
        Process58State process58State = (Process58State)  OVALXMLLoader.loadStateFromXML(PROCESS58_STATE_PID_LESS_THAN_10);

        Process58ObjectImpl impl = new Process58ObjectImpl(ovalInterpreter, xmlObj);
        ObjectCollectionResult collectionResult = impl.collectValues(hostOSTarget);
        assertTrue(collectionResult.getCollectionStatus() == FlagEnumeration.COMPLETE);
        assertFalse(collectionResult.getCollectedValues().isEmpty());

        for(Object processPropertiesObj : collectionResult.getCollectedValues())
        {
            List<ResultEnumeration> results = impl.evaluateSingleValueVsState(processPropertiesObj, process58State);
            assertNotNull(results);
        }
    }
/*  Already tested in Process58TestImplTest
    @Test
    public void testOVALTestContent()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Host, "");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter ovalInterpreter = new OVALInterpreter("cisoval", target, osInfo, true);

        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/unix-def_process58_test.xml";
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
        Assert.assertFalse("Some tests fail because there is no sched process", testResults.containsValue(ResultEnumeration.ERROR));
        Assert.assertFalse("Some tests fail because there is no sched process", testResults.containsValue(ResultEnumeration.FALSE));
        Assert.assertFalse("Some tests fail because there is no sched process", testResults.containsValue(ResultEnumeration.NOT_APPLICABLE));
        Assert.assertFalse("Some tests fail because there is no sched process", testResults.containsValue(ResultEnumeration.NOT_EVALUATED));
        Assert.assertFalse("Some tests fail because there is no sched process", testResults.containsValue(ResultEnumeration.UNKNOWN));
    }
 */
}