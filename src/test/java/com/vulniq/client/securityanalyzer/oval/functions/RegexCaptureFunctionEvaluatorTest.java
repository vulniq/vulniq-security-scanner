
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

package com.vulniq.client.securityanalyzer.oval.functions;

import com.vulniq.client.securityanalyzer.TerziTestBase;
import com.vulniq.client.securityanalyzer.TerziTestSetup;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.variables.LocalVariableImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.LocalVariable;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_definitions_5.VariableType;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;

import javax.xml.bind.JAXBElement;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 *
 */
public class RegexCaptureFunctionEvaluatorTest extends TerziTestBase
{
    private OVALInterpreter ovalInterpreter;
    
    @Before
    public void setUp()
    {
        DataCollectionTarget hostOSTarget;
        OSInfo hostOSInfo;
        hostOSTarget = new DataCollectionTarget(DataCollectionTargetType.Host, "host");
        hostOSInfo = OSInfoCollector.getOSInfoFromHost();
        ovalInterpreter = new OVALInterpreter("unit-test", hostOSTarget, hostOSInfo, false);
    }
    
    @Test
    public void testRegexCaptureFunction()
    {
        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/oval-def_regex_capture_function.xml";
        File ovalFile = new File(ovalXMLPath);

        OvalDefinitions definitions = OVALXMLLoader.loadOVALDefinitionsFile(ovalFile);
        Map<String, ResultEnumeration> results = new HashMap<>();
        for (int index =0; index< definitions.getDefinitions().getDefinition().size(); index++)
        {
            String definitionId = definitions.getDefinitions().getDefinition().get(index).getId();
            ResultEnumeration resultForDefinition = ovalInterpreter.evaluateDefinition(definitionId);
            results.put(definitionId, resultForDefinition);
        }
        System.out.println("----------------------Results------------------------------");
        System.out.println(results.toString());
        System.out.println("----------------------------------------------------");
        Assert.assertTrue(results.containsValue(ResultEnumeration.TRUE));
        Assert.assertTrue(!results.containsValue(ResultEnumeration.FALSE));
        Assert.assertTrue(!results.containsValue(ResultEnumeration.ERROR));
        Assert.assertTrue(!results.containsValue(ResultEnumeration.NOT_APPLICABLE));
        Assert.assertTrue(!results.containsValue(ResultEnumeration.NOT_EVALUATED));
        Assert.assertTrue(!results.containsValue(ResultEnumeration.UNKNOWN));
    }
    
    @Test
    public void testValues()
    {
        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/oval-def_regex_capture_function.xml";
        File ovalFile = new File(ovalXMLPath);
        
        OvalDefinitions definitions = OVALXMLLoader.loadOVALDefinitionsFile(ovalFile);
        List<JAXBElement<? extends VariableType>> variables = definitions.getVariables().getVariable();
    
        for (JAXBElement<? extends VariableType> variable : variables)
        {
            if (variable.getValue() instanceof LocalVariable)
            {
                LocalVariable value = (LocalVariable) variable.getValue();
                System.out.println("----------Variable Start----------");
                System.out.println("Local Variable ID: " + value.getId());
                LocalVariableImpl impl = new LocalVariableImpl(ovalInterpreter, value);
                List<ComponentGroup> trial = impl.evaluate();
                for (ComponentGroup componentGroup : trial)
                {
                    Assert.assertNotNull(componentGroup.getValue());
                    System.out.println(componentGroup.getValue());
                }
                System.out.println("----------Variable End----------");
            }
        }
    }
}
