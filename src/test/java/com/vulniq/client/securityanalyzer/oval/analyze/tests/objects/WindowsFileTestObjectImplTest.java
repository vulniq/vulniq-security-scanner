
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
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;

import javax.xml.bind.JAXBElement;
import java.io.File;
import java.util.List;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 *
 *
 */
public class WindowsFileTestObjectImplTest
{

    OVALInterpreter ovalInterpreter;
    DataCollectionTarget hostOSTarget;
    OSInfo hostOSInfo;
    private static OvalDefinitions definitions;
    private static List<JAXBElement<? extends ObjectType>> ovalObjectList;

    public WindowsFileTestObjectImplTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/win-def_file_test.xml";
        File ovalFile = new File(ovalXMLPath);

        definitions = OVALXMLLoader.loadOVALDefinitionsFile(ovalFile);
        ovalObjectList = definitions.getObjects().getObject();
    }


    @Before
    public void setUp()
    {
        //Run these tests only on windows
        Assume.assumeTrue(TerziTestSetup.isOnWindows());

        hostOSTarget = new DataCollectionTarget(DataCollectionTargetType.Host, "host");
        hostOSInfo = OSInfoCollector.getOSInfoFromHost();
        ovalInterpreter = new OVALInterpreter("unit-test", hostOSTarget, hostOSInfo, false);
    }


    @Test
    public void testCheckExistence()
    {
        for (JAXBElement<? extends ObjectType> jaxbObject : ovalObjectList)
        {
            FileObject fileObject = (FileObject) jaxbObject.getValue();
            WindowsFileTestObjectImpl objectImpl = new WindowsFileTestObjectImpl(ovalInterpreter, fileObject);
            StatusEnumeration existenceStatus = objectImpl.checkExistence(hostOSTarget);

            assertNotEquals(StatusEnumeration.ERROR, existenceStatus);
        }
    }
    
    
    @Test
    public void testCollectValues()
    {
        for (int index = 0; index < ovalObjectList.size(); index++)
        {
            JAXBElement<? extends ObjectType> jaxbObject = ovalObjectList.get(index);
            FileObject fileObject = (FileObject) jaxbObject.getValue();
            WindowsFileTestObjectImpl objectImpl = new WindowsFileTestObjectImpl(ovalInterpreter, fileObject);
            ObjectCollectionResult collectionResult = objectImpl.collectValues(hostOSTarget);

            assertNotEquals(StatusEnumeration.ERROR, collectionResult.getCollectionStatus());

            for (Object collectedValue : collectionResult.getCollectedValues())
            {
                assertNotNull(collectedValue);
            }
        }
    }
    
    
    @Test
    public void testEvaluateSingleValueVsState() throws Exception
    {
        List<JAXBElement<? extends StateType>> stateList = definitions.getStates().getState();
        StateType stateType = stateList.get(2).getValue();

        List<JAXBElement<? extends ObjectType>> objectList = definitions.getObjects().getObject();
        ObjectType objectType = objectList.get(2).getValue();
        FileObject fileObject = (FileObject) objectType;

        WindowsFileTestObjectImpl objectImpl = new WindowsFileTestObjectImpl(ovalInterpreter, fileObject);
        ObjectCollectionResult collectionResult = objectImpl.collectValues(hostOSTarget);
        for (Object collectedValue : collectionResult.getCollectedValues())
        {
            List<ResultEnumeration> resultList = objectImpl.evaluateSingleValueVsState(collectedValue, stateType);
            for (ResultEnumeration resultEnumeration : resultList)
            {
                assertNotEquals(ResultEnumeration.ERROR, resultEnumeration);
            }
        }
    }
    
    @Test
    public void objectTest()
    {
        ovalInterpreter = new OVALInterpreter("cisoval", hostOSTarget, hostOSInfo, false);
        ObjectType cisoval = OVALXMLLoader.loadObject("cisoval", "oval:org.cisecurity:obj:185", null, null);
        FileObject ovalObj = (FileObject) cisoval;
    
        
        WindowsFileTestObjectImpl impl = new WindowsFileTestObjectImpl(ovalInterpreter, ovalObj);
        StatusEnumeration statusEnumeration = impl.checkExistence(ovalInterpreter.getDataCollectionTarget());
        System.out.println(statusEnumeration);
        Assert.assertEquals(StatusEnumeration.DOES_NOT_EXIST, statusEnumeration);
    }
}
