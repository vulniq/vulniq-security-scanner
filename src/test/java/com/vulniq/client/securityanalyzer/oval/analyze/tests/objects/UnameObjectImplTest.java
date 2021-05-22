
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

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.UnameObject;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.UnameState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.FlagEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;


public class UnameObjectImplTest extends TerziTestBase
{

    public static final String UNAME_OBJECT = "<uname_object id=\"oval:org.mitre.oval.test:obj:1356\" version=\"1\" comment=\"Retrieve the only uname_item on the system.\" xmlns=\"http://oval.mitre.org/XMLSchema/oval-definitions-5#unix\"/>";

    public static final String UNAME_STATE = "<uname_state id=\"oval:org.mitre.oval.test:ste:1645\" version=\"1\" comment=\"This state represents a uname_item that has a machine_class, node_name, os_name, os_release, os_version, and processor_type that match the regular expression '.*'.\" xmlns=\"http://oval.mitre.org/XMLSchema/oval-definitions-5#unix\">\n"
            + "<machine_class operation=\"pattern match\">.*</machine_class>\n"
            + "<node_name operation=\"pattern match\">.*</node_name>"
            + "<os_name operation=\"pattern match\">.*</os_name>\n"
            + "<os_release operation=\"pattern match\">.*</os_release>\n"
            + "<os_version operation=\"pattern match\">.*</os_version>\n"
            + "<processor_type operation=\"pattern match\">.*</processor_type>\n"
            + "</uname_state>";

    OVALInterpreter ovalInterpreter;
    DataCollectionTarget hostOSTarget;
    OSInfo hostOSInfo;

    public UnameObjectImplTest()
    {
    }


    @Before
    public void setUp()
    {
        //Run these tests only on windows
        Assume.assumeFalse(TerziTestSetup.isOnWindows());

        hostOSTarget = new DataCollectionTarget(DataCollectionTargetType.Host, "host");
        hostOSInfo = OSInfoCollector.getOSInfoFromHost();
        ovalInterpreter = new OVALInterpreter("unit-test", hostOSTarget, hostOSInfo, false);
    }



    /**
     * Test of collectValues method, of class UnameObjectImpl.
     */
    @Test
    public void testCollectValues()
    {
        UnameObject xmlObj = (UnameObject) OVALXMLLoader.loadObjectFromXML(UNAME_OBJECT);

        UnameObjectImpl impl = new UnameObjectImpl(ovalInterpreter, xmlObj);
        ObjectCollectionResult collectionResult = impl.collectValues(hostOSTarget);

        assertTrue(collectionResult.getCollectionStatus() == FlagEnumeration.COMPLETE);
        assertFalse(collectionResult.getCollectedValues().isEmpty());

    }

    /**
     * Test of evaluateSingleValueVsState method, of class UnameObjectImpl.
     */
    @Test
    public void testEvaluateSingleValueVsState() throws Exception
    {
        UnameObject xmlObj = (UnameObject) OVALXMLLoader.loadObjectFromXML(UNAME_OBJECT);
        UnameState uname58State = (UnameState) OVALXMLLoader.loadStateFromXML(UNAME_STATE);

        UnameObjectImpl impl = new UnameObjectImpl(ovalInterpreter, xmlObj);
        ObjectCollectionResult collectionResult = impl.collectValues(hostOSTarget);

        assertTrue(collectionResult.getCollectionStatus() == FlagEnumeration.COMPLETE);
        assertFalse(collectionResult.getCollectedValues().isEmpty());

        for (Object UnamePropertiesObj : collectionResult.getCollectedValues())
        {
            List<ResultEnumeration> results = impl.evaluateSingleValueVsState(UnamePropertiesObj, uname58State);
            assertNotNull(results);
            for (int index = 0; index < results.size(); index++)
            {
                assertEquals(ResultEnumeration.TRUE, results.get(0));
            }

        }

    }

}
