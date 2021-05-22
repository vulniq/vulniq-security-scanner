
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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.variables;

import com.vulniq.client.securityanalyzer.TerziTestBase;
import com.vulniq.client.securityanalyzer.TerziTestSetup;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import com.vulniq.client.securityanalyzer.oval.functions.ComponentGroup;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.ConstantVariable;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_definitions_5.VariableType;

import javax.xml.bind.JAXBElement;
import java.io.File;
import java.util.List;

public class ConstantVariableImplTest extends TerziTestBase
{
    private OVALInterpreter ovalInterpreter;
    
    @Test
    public void testConstantVariableImpl ()
    {
        //Run these tests only on windows
        Assume.assumeFalse(TerziTestSetup.isOnWindows());

        DataCollectionTarget hostOSTarget = new DataCollectionTarget(DataCollectionTargetType.Host, "host");
        OSInfo hostOSInfo = OSInfoCollector.getOSInfoFromHost();
        ovalInterpreter = new OVALInterpreter("unit-test", hostOSTarget, hostOSInfo, false);
        
        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/oval-def_constant_variable.xml";
        File ovalFile = new File(ovalXMLPath);
        
        OvalDefinitions definitions = OVALXMLLoader.loadOVALDefinitionsFile(ovalFile);
        List<JAXBElement<? extends VariableType>> variables = definitions.getVariables().getVariable();
        
        for (int index = 0; index < variables.size(); index++)
        {
            if(variables.get(index).getValue() instanceof ConstantVariable)
            {
                ConstantVariable value = (ConstantVariable) variables.get(index).getValue();
                ConstantVariableImpl impl = new ConstantVariableImpl(ovalInterpreter, value);
                List<ComponentGroup> results = impl.evaluate();
                System.out.println(value.getId() +" "+ value.getComment());
                for (ComponentGroup componentGroup : results)
                {
                    Assert.assertNotNull(componentGroup.getValue());
                    System.out.println(componentGroup.getValue());
                }
            }
        }
    }
}