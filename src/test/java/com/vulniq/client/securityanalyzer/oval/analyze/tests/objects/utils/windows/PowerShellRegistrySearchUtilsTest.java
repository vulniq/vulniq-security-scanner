
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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windows;

import com.vulniq.client.securityanalyzer.TerziTestSetup;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import java.io.File;
import javax.xml.bind.JAXBElement;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 *
 */
public class PowerShellRegistrySearchUtilsTest
{

    OVALInterpreter ovalInterpreter;
    DataCollectionTarget hostOSTarget;
    OSInfo hostOSInfo;
    private Logger logger; 

    public PowerShellRegistrySearchUtilsTest()
    {
    }

    @Before
    public void setUp()
    {
        //Run these tests only on windows
        Assume.assumeTrue(TerziTestSetup.isOnWindows());
        logger = LoggerFactory.getLogger(PowerShellRegistrySearchUtilsTest.class);
        hostOSTarget = new DataCollectionTarget(DataCollectionTargetType.Host, "host");
        hostOSInfo = OSInfoCollector.getOSInfoFromHost();
        ovalInterpreter = new OVALInterpreter("unit-test", hostOSTarget, hostOSInfo, false);
    }

    /**
     *
     */
    @Test
    public void testOfPowerShellRegistrySearchUtils()
    {
        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/win-def_registry_test.xml";
        File ovalFile = new File(ovalXMLPath);

        OvalDefinitions definitions = OVALXMLLoader.loadOVALDefinitionsFile(ovalFile);

        for (JAXBElement<? extends ObjectType> jAXBElement : definitions.getObjects().getObject())
        {
            RegistryObject registryObject = (RegistryObject) jAXBElement.getValue();
            PowerShellRegistrySearchUtils psRegistryUtils = new PowerShellRegistrySearchUtils(hostOSTarget, registryObject);

            try
            {
                String[] registryPathArray = psRegistryUtils.getRegistryPath();
                for (String registryPath : registryPathArray)
                {
                    assertNotEquals("", registryPath);
                }
            }
            catch (Exception ex)
            {
                logger.error("An error occured while performing unit tests for Windows Registry Search");
            }
        }
    }

    @Test
    public void testOfPowerShellRegistrySearchUtilsDocker()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-windows");
        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/win-def_registry_test.xml";
        File ovalFile = new File(ovalXMLPath);

        OvalDefinitions definitions = OVALXMLLoader.loadOVALDefinitionsFile(ovalFile);

        for (JAXBElement<? extends ObjectType> jAXBElement : definitions.getObjects().getObject())
        {
            RegistryObject registryObject = (RegistryObject) jAXBElement.getValue();
            PowerShellRegistrySearchUtils psRegistryUtils = new PowerShellRegistrySearchUtils(target, registryObject);

            try
            {
                String[] registryPathArray = psRegistryUtils.getRegistryPath();
                for (String registryPath : registryPathArray)
                {
                    assertNotEquals("", registryPath);
                }
            }
            catch (Exception ex)
            {
                logger.error("An error occured while performing unit tests for Windows Registry Search");
            }
        }
    }

}
