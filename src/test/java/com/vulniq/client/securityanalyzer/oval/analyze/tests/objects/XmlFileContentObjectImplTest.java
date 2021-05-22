
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
import com.vulniq.client.securityanalyzer.TerziTestUtilizingDocker;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import java.util.List;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.XmlfilecontentObject;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.XmlfilecontentState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.FlagEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;

/**
 *
 *
 */
public class XmlFileContentObjectImplTest extends TerziTestUtilizingDocker
{

    public static final String XML_FILE_CONTENT_OBJECT_PATH = "<xmlfilecontent_object id=\"oval:org.mitre.oval.test:obj:475\" version=\"1\" comment=\"This object represents a xmlfilecontent_item with a path equal to '/tmp/support/xml/classes/class1', a filename equal to 'section1.xml', and an xpath query equal to '//*/grades/grade[@type='test']/text()'.\" xmlns=\"http://oval.mitre.org/XMLSchema/oval-definitions-5#independent\">\n"
            + "<path>/tmp/support/xml/classes/class1</path>\n"
            + "<filename>section1.xml</filename>\n"
            + "<xpath>//*/grades/grade[@type='test']/text()</xpath>\n"
            + "</xmlfilecontent_object>";

    public static final String XML_FILE_CONTENT_STATE_PATH = "<xmlfilecontent_state id=\"oval:org.mitre.oval.test:ste:675\" version=\"1\" comment=\"This state represents a xmlfilecontent_item with a path equal to '/tmp/support/xml/classes/class1', a filename equal to 'section1.xml', an xpath query equal to '//*/grades/grade[@type='test']/text()', and a value_of that matches the regular expression '(83|87|93|86|100|76|53|97)'.\" xmlns=\"http://oval.mitre.org/XMLSchema/oval-definitions-5#independent\">\n"
            + "<path>/tmp/support/xml/classes/class1</path>\n"
            + "<filename>section1.xml</filename>\n"
            + "<xpath>//*/grades/grade[@type='test']/text()</xpath>\n"
            + "<value_of operation=\"pattern match\">(83|87|93|86|100|76|53|97)</value_of>\n"
            + "</xmlfilecontent_state>";

    OVALInterpreter ovalInterpreter;
    DataCollectionTarget target;
    OSInfo osInfo;

    @Before
    public void setUp()
    {
        target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-debian10");
        osInfo = OSInfoCollector.getOSInfo(target);
        ovalInterpreter = new OVALInterpreter("unit-test", target, osInfo, false);
    }



    @Test
    public void evaluateSingleValueVsState() throws Exception
    {
        XmlfilecontentObject xmlObj = (XmlfilecontentObject) OVALXMLLoader.loadObjectFromXML(XML_FILE_CONTENT_OBJECT_PATH);
        XmlfilecontentState xmlFileContentState = (XmlfilecontentState) OVALXMLLoader.loadStateFromXML(XML_FILE_CONTENT_STATE_PATH);

        XmlFileContentObjectImpl impl = new XmlFileContentObjectImpl(ovalInterpreter, xmlObj);
        ObjectCollectionResult collectionResult = impl.collectValues(target);
        Assert.assertTrue(collectionResult.getCollectionStatus() == FlagEnumeration.COMPLETE);

        for (Object xmlPropertiesObject : collectionResult.getCollectedValues())
        {
            List<ResultEnumeration> results = impl.evaluateSingleValueVsState(xmlPropertiesObject, xmlFileContentState);
            Assert.assertNotNull(results);
            for(ResultEnumeration aResult : results)
            {
                Assert.assertTrue(ResultEnumeration.TRUE == aResult);
            }
        }

    }



}
