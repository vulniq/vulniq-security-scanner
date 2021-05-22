
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
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.InetlisteningserversObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.InetlisteningserversState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.FlagEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.mockito.Mockito;

/**
 *
 *
 */
public class InetListeningServersObjectImplTest extends TerziTestBase
{

    public static final String exampleNetstatCommandOutput = "Active Internet connections (only servers) \n"
            + "Proto Recv-Q Send-Q Local Address           Foreign Address         State       User       Inode      PID/Program name \n"
            + "tcp        0      0 0.0.0.0:2222            0.0.0.0:*               LISTEN      2001       13430857   23/sshd\n"
            + "tcp        0      0 0.0.0.0:6000            0.0.0.0:*               LISTEN      2001       13432355   8/node \n"
            + "tcp        0      0 192.168.128.116:6001    0.0.0.0:*               LISTEN      2001       13431420   8/node  \n"
            + "tcp6       0      0 :::2222                 :::*                    LISTEN      2001       13429355   23/sshd \n"
            + "tcp6       0      0 :::46127                :::*                    LISTEN      2001       13432354   8/node";

    public static final String OVAL_TEST_OBJECT_771 = "<inetlisteningservers_object id=\"oval:org.mitre.oval.test:obj:771\" version=\"2\" comment=\"This object represents a inetlisteningservers_object with the protocol equal to 'tcp', the local_address equal to '127.0.0.1', and the local_port equal to '25'.\" xmlns=\"http://oval.mitre.org/XMLSchema/oval-definitions-5#linux\">\n"
            + "<protocol>tcp</protocol>\n"
            + "<local_address>127.0.0.1</local_address>\n"
            + "<local_port datatype=\"int\">25</local_port>\n"
            + "</inetlisteningservers_object>";

    public static final String OVAL_TEST_STATE_653 = "<inetlisteningservers_state id=\"oval:org.mitre.oval.test:ste:653\" version=\"2\" comment=\"This inetlisteningservers_state represents an inetlisteningservers_item which has a protocol equal to 'tcp', a local_address equal to '127.0.0.1', and a local_port equal to '25'.\" xmlns=\"http://oval.mitre.org/XMLSchema/oval-definitions-5#linux\">\r\n"
            + "<protocol>tcp</protocol>\r\n "
            + " <local_address>127.0.0.1</local_address>\r\n"
            + "<local_port datatype=\"int\" operation=\"equals\">25</local_port>\r\n"
            + "</inetlisteningservers_state>";

    OVALInterpreter ovalInterpreter;
    DataCollectionTarget hostOSTarget;
    OSInfo hostOSInfo;

    public InetListeningServersObjectImplTest()
    {
    }

    /**
     * setup metod does not need to be named setup
     */
    @Before
    public void setUp()
    {
        hostOSTarget = new DataCollectionTarget(DataCollectionTargetType.Host, "host");
        hostOSInfo = OSInfoCollector.getOSInfoFromHost();
        ovalInterpreter = new OVALInterpreter("unit-test", hostOSTarget, hostOSInfo, false);
    }

    /**
     * Test of runNetstatCommand method, of class
     * InetListeningServersObjectImpl.
     */
    @Test
    public void testRunNetstatCommand()
    {
        InetlisteningserversObject xmlObj = (InetlisteningserversObject) OVALXMLLoader.loadObjectFromXML(OVAL_TEST_OBJECT_771);

        InetListeningServersObjectImpl impl = new InetListeningServersObjectImpl(ovalInterpreter, xmlObj);
        OSCommandOutput osCommandOutput = impl.runNetstatCommand(hostOSTarget);
        System.out.println(osCommandOutput.getStdOut());
        assertNotNull(osCommandOutput.getStdOut());
    }

    /**
     * Test of collectValues method, of class InetListeningServersObjectImpl.
     */
    @Test
    public void testCollectValues()
    {
        InetlisteningserversObject xmlObj = (InetlisteningserversObject) OVALXMLLoader.loadObjectFromXML(OVAL_TEST_OBJECT_771);

        InetListeningServersObjectImpl impl = new InetListeningServersObjectImpl(ovalInterpreter, xmlObj);
        OSCommandOutput osCommandOutput = impl.runNetstatCommand(hostOSTarget);

        osCommandOutput.setStdOut(exampleNetstatCommandOutput); // This is required since the local test environment is Macos and gives a different output with netstat command

        InetListeningServersObjectImpl spyOfObjectImpl = Mockito.spy(new InetListeningServersObjectImpl(ovalInterpreter, xmlObj));
        Mockito.when(spyOfObjectImpl.runNetstatCommand(hostOSTarget)).thenReturn(osCommandOutput);

        ObjectCollectionResult collectionResult = spyOfObjectImpl.collectValues(hostOSTarget);
        assertTrue(collectionResult.getCollectionStatus() == FlagEnumeration.COMPLETE);
        assertFalse(collectionResult.getCollectedValues().isEmpty());

    }

    /**
     * Test of evaluateSingleValueVsState method, of class
     * InetListeningServersObjectImpl.
     */
    @Test
    public void testEvaluateSingleValueVsState() throws Exception
    {
        InetlisteningserversObject xmlObj = (InetlisteningserversObject) OVALXMLLoader.loadObjectFromXML(OVAL_TEST_OBJECT_771);
        InetlisteningserversState inetListeningServersState = (InetlisteningserversState)  OVALXMLLoader.loadStateFromXML(OVAL_TEST_STATE_653);

        InetListeningServersObjectImpl impl = new InetListeningServersObjectImpl(ovalInterpreter, xmlObj);
        OSCommandOutput osCommandOutput = impl.runNetstatCommand(hostOSTarget);

        osCommandOutput.setStdOut(exampleNetstatCommandOutput); // This is required since the local test environment is Macos and gives a different output with netstat command

        InetListeningServersObjectImpl spyOfObjectImpl = Mockito.spy(new InetListeningServersObjectImpl(ovalInterpreter, xmlObj));
        Mockito.when(spyOfObjectImpl.runNetstatCommand(hostOSTarget)).thenReturn(osCommandOutput);

        ObjectCollectionResult collectionResult = spyOfObjectImpl.collectValues(hostOSTarget);
        assertTrue(collectionResult.getCollectionStatus() == FlagEnumeration.COMPLETE);
        assertFalse(collectionResult.getCollectedValues().isEmpty());

        for(Object inetPropertiesObj : collectionResult.getCollectedValues())
        {
            List<ResultEnumeration> results = impl.evaluateSingleValueVsState(inetPropertiesObj, inetListeningServersState);
            assertNotNull(results);
        }

    }

}
