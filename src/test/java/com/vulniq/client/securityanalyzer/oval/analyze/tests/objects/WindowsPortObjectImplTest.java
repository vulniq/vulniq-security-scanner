
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
import com.vulniq.client.securityanalyzer.TerziTestSetup;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import com.vulniq.client.securityanalyzer.datacollection.windows.CollectedPortInfo;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PortObject;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;

import java.io.File;
import java.util.List;


public class WindowsPortObjectImplTest extends TerziTestBase
{
    private OVALInterpreter ovalInterpreter;
    
    @Test
    public void testObjectImpl()
    {
        //Run these tests only on windows
        Assume.assumeTrue(TerziTestSetup.isOnWindows());

        DataCollectionTarget hostOSTarget = new DataCollectionTarget(DataCollectionTargetType.Host, "host");
        OSInfo hostOSInfo = OSInfoCollector.getOSInfoFromHost();
        ovalInterpreter = new OVALInterpreter("unit-test", hostOSTarget, hostOSInfo, false);
        
        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/win-def_port_test.xml";
        File ovalFile = new File(ovalXMLPath);
        
        OvalDefinitions definitions = OVALXMLLoader.loadOVALDefinitionsFile(ovalFile);
        
        for (int index = 0; index < definitions.getObjects().getObject().size(); index++)
        {
            PortObject ovalObject = (PortObject) definitions.getObjects().getObject().get(index).getValue();
            WindowsPortObjectImpl impl = new WindowsPortObjectImpl(ovalInterpreter, ovalObject);
            StatusEnumeration existenceStatus = impl.checkExistence(hostOSTarget);
            if (existenceStatus == StatusEnumeration.EXISTS)
            {
                ObjectCollectionResult collectionResult = impl.collectValues(hostOSTarget);
                List<Object> collectedValues = collectionResult.getCollectedValues();
                
                for (Object collectedValue : collectedValues)
                {
                    CollectedPortInfo collectedPort = (CollectedPortInfo) collectedValue;
                    Assert.assertNotNull(collectedPort.getForeignAddress());
                    Assert.assertNotNull(collectedPort.getForeignPort());
                    Assert.assertNotNull(collectedPort.getLocalAddress());
                    Assert.assertNotNull(collectedPort.getLocalPort());
                    Assert.assertNotNull(collectedPort.getPid());
                    Assert.assertNotNull(collectedPort.getProtocol());
                }
            }
        }
        
    }
}