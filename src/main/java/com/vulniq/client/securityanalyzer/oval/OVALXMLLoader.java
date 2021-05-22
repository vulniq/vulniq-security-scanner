

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

package com.vulniq.client.securityanalyzer.oval;

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.vulniqapi.VulnIQAPIClient;
import com.vulniq.client.securityanalyzer.oval.xml.OVALNamespaceAddingFilter;
import com.vulniq.client.securityanalyzer.utils.EncodeDecode;
import org.mitre.oval.xmlschema.oval_common_5.CheckEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.ExistenceEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.DefinitionType;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;
import org.mitre.oval.xmlschema.oval_definitions_5.VariableType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.UnmarshallerHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

/**
 * loads the xml for the given oval id
 */
public class OVALXMLLoader
{
    private static Logger logger = LoggerFactory.getLogger(OVALXMLLoader.class);
    //TODO ADD expiration to caches
    private static Map<String, String> ovalXmlCache = new HashMap<>() ;
    private static Map<String, Object> ovalItemCache = new HashMap<>();

    public static synchronized DefinitionType loadDefinition(String dataSourceGuid, String ovalId, String osVersion, String ovalItemVersion)
    {
        if(ovalItemCache.containsKey(ovalId))
        {
            Object cachedItem = ovalItemCache.get(ovalId);
            if(cachedItem instanceof DefinitionType)
            {
                return (DefinitionType) cachedItem;
            }
            else if(cachedItem instanceof JAXBElement)
            {
                JAXBElement<? extends DefinitionType> tt = (JAXBElement<? extends DefinitionType>) cachedItem;
                return tt.getValue();
            }
        }
        try
        {
            JAXBContext jc = JAXBContext.newInstance(DefinitionType.class);
            XMLFilter xmlFilter = new OVALNamespaceAddingFilter();
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxParser = spf.newSAXParser();
            XMLReader xmlReader = saxParser.getXMLReader();
            xmlFilter.setParent(xmlReader);

            Unmarshaller unmarshaller = jc.createUnmarshaller();
            UnmarshallerHandler unmarshallerHandler = unmarshaller.getUnmarshallerHandler();
            xmlFilter.setContentHandler(unmarshallerHandler);
            String xml = getOVALXml(dataSourceGuid, ovalId, osVersion, ovalItemVersion);
            if(xml==null)
            {
                return null;
            }
            StringReader stringReader = new StringReader(xml);
            //JAXBElement jaxbElement = (JAXBElement) unmarshaller.unmarshal(stringReader);
            InputSource inputSource = new InputSource(stringReader);
            xmlFilter.parse(inputSource);
            JAXBElement jaxbElement = (JAXBElement) unmarshallerHandler.getResult();
            DefinitionType ovalDef = (DefinitionType) jaxbElement.getValue();
            ovalItemCache.put(ovalId, ovalDef);
            return ovalDef;
        }
        catch (Exception ex)
        {
            logger.error("loadDefinition dataSourceGuid="+dataSourceGuid + " ovalId="+ovalId, ex);
            return null;
        }
    }

    public static synchronized ObjectType loadObject(String dataSourceGuid, String ovalId, String osVersion, String ovalItemVersion)
    {
        if(ovalItemCache.containsKey(ovalId))
        {
            Object cachedItem = ovalItemCache.get(ovalId);
            if(cachedItem instanceof ObjectType)
            {
                return (ObjectType) cachedItem;
            }
            else if(cachedItem instanceof JAXBElement)
            {
                JAXBElement<? extends ObjectType> tt = (JAXBElement<? extends ObjectType>) cachedItem;
                return tt.getValue();
            }
        }
        try
        {
            JAXBContext jc = JAXBContext.newInstance(ObjectType.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            String xml = getOVALXml(dataSourceGuid, ovalId, osVersion, ovalItemVersion);
            if(xml==null)
            {
                return null;
            }
            StringReader reader = new StringReader(xml);
            JAXBElement obj = (JAXBElement) unmarshaller.unmarshal(reader);
            ObjectType oval = (ObjectType) obj.getValue();
            ovalItemCache.put(ovalId, oval);
            return oval;
        }
        catch (Exception ex)
        {
            logger.error("loadObject dataSourceGuid="+dataSourceGuid + " ovalId="+ovalId, ex);
            return null;
        }
    }

    /**
     * Parse and load object from given XML
     * @param objectDefinitionXML
     * @return
     */
    public static ObjectType loadObjectFromXML(String objectDefinitionXML)
    {
        try
        {
            JAXBContext jc = JAXBContext.newInstance(ObjectType.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            if(objectDefinitionXML==null)
            {
                return null;
            }
            StringReader reader = new StringReader(objectDefinitionXML);
            JAXBElement obj = (JAXBElement) unmarshaller.unmarshal(reader);
            ObjectType oval = (ObjectType) obj.getValue();
            return oval;
        }
        catch (Exception ex)
        {
            logger.error("loadObject XML=" + objectDefinitionXML, ex);
            return null;
        }
    }

    public static synchronized StateType loadState(String dataSourceGuid, String ovalId, String osVersion, String ovalItemVersion)
    {
        if(ovalItemCache.containsKey(ovalId))
        {
            Object cachedItem = ovalItemCache.get(ovalId);
            if(cachedItem instanceof StateType)
            {
                return (StateType) cachedItem;
            }
            else if(cachedItem instanceof JAXBElement)
            {
                JAXBElement<? extends StateType> tt = (JAXBElement<? extends StateType>) cachedItem;
                return tt.getValue();
            }
        }
        try
        {
            JAXBContext jc = JAXBContext.newInstance(StateType.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            String xml = getOVALXml(dataSourceGuid, ovalId, osVersion, ovalItemVersion);
            if(xml==null)
            {
                return null;
            }
            StringReader reader = new StringReader(xml);
            JAXBElement obj = (JAXBElement) unmarshaller.unmarshal(reader);
            StateType oval = (StateType) obj.getValue();
            ovalItemCache.put(ovalId, oval);
            return oval;
        }
        catch (Exception ex)
        {
            logger.error("loadState dataSourceGuid="+dataSourceGuid + " ovalId="+ovalId, ex);
            return null;
        }
    }


    public static synchronized StateType loadStateFromXML(String stateXml)
    {
        try
        {
            JAXBContext jc = JAXBContext.newInstance(StateType.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            if(stateXml==null)
            {
                return null;
            }
            StringReader reader = new StringReader(stateXml);
            JAXBElement obj = (JAXBElement) unmarshaller.unmarshal(reader);
            StateType oval = (StateType) obj.getValue();
            return oval;
        }
        catch (Exception ex)
        {
            logger.error("loadStateFromXML stateXml="+stateXml, ex);
            return null;
        }
    }

    public static synchronized TestType loadTest(String dataSourceGuid, String ovalId, String osVersion, String ovalItemVersion)
    {
        if(ovalItemCache.containsKey(ovalId))
        {
            Object cachedItem = ovalItemCache.get(ovalId);
            if(cachedItem instanceof TestType)
            {
                return (TestType) cachedItem;
            }
            else if(cachedItem instanceof JAXBElement)
            {
                JAXBElement<? extends TestType> tt = (JAXBElement<? extends TestType>) cachedItem;
                return tt.getValue();
            }
        }
        try
        {
            JAXBContext jc = JAXBContext.newInstance(TestType.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            String xml = getOVALXml(dataSourceGuid, ovalId, osVersion, ovalItemVersion);
            if(xml==null)
            {
                return null;
            }
            StringReader reader = new StringReader(xml);
            JAXBElement obj = (JAXBElement) unmarshaller.unmarshal(reader);
            TestType oval = (TestType) obj.getValue();
            replaceDeprecatedCheckForTest(oval, ovalId);
            ovalItemCache.put(ovalId, oval);
            return oval;
        }
        catch (Exception ex)
        {
            logger.error("loadDefinition dataSourceGuid="+dataSourceGuid + " ovalId="+ovalId, ex);
            return null;
        }

    }

    private static void replaceDeprecatedCheckForTest(TestType ovalTest, String ovalId)
    {
        if(ovalTest.getCheck() == CheckEnumeration.NONE_EXIST)
        {
            ovalTest.setCheck(CheckEnumeration.NONE_SATISFY);
            ovalTest.setCheckExistence(ExistenceEnumeration.NONE_EXIST);
            logger.warn("Replaced deprecated 'none exist' check value with 'none satisfy' and also changed check_existence to none_exist. Test id=" + ovalId);
        }
    }

    public static synchronized VariableType loadVariable(String dataSourceGuid, String ovalId, String osVersion, String ovalItemVersion)
    {
        if(ovalItemCache.containsKey(ovalId))
        {
            Object cachedItem = ovalItemCache.get(ovalId);
            if(cachedItem instanceof VariableType)
            {
                return (VariableType) cachedItem;
            }
            else if(cachedItem instanceof JAXBElement)
            {
                JAXBElement<? extends VariableType> tt = (JAXBElement<? extends VariableType>) cachedItem;
                return tt.getValue();
            }
        }
        try
        {
            JAXBContext jc = JAXBContext.newInstance(VariableType.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            String xml = getOVALXml(dataSourceGuid, ovalId, osVersion, ovalItemVersion);
            if(xml==null)
            {
                return null;
            }
            StringReader reader = new StringReader(xml);
            JAXBElement obj = (JAXBElement) unmarshaller.unmarshal(reader);
            VariableType oval = (VariableType) obj.getValue();
            ovalItemCache.put(ovalId, oval);
            return oval;
        }
        catch (Exception ex)
        {
            logger.error("loadVariable dataSourceGuid="+dataSourceGuid + " ovalId="+ovalId, ex);
            return null;
        }
    }

    public static synchronized String getOVALXml(String dataSourceGuid, String ovalId, String osVersion, String ovalItemVersion)
    {
        if(ovalXmlCache.containsKey(ovalId))
        {
            return ovalXmlCache.get(ovalId);
        }
        String url = TerziConfiguration.getVulnIQEngineBaseUrl() + TerziConfiguration.getVulnIQOVALXMLUrl() + "?dataSourceGuid=" + EncodeDecode.urlEncode(dataSourceGuid)
                + "&ovalId=" + EncodeDecode.urlEncode(ovalId)
                + "&osVersion=" + EncodeDecode.urlEncode(osVersion)
                + "&ovalVersion=" + EncodeDecode.urlEncode(ovalItemVersion);
        String xml = VulnIQAPIClient.getFromVulnIQUsingAccessTokenAsString(url, false);
        ovalXmlCache.put(ovalId, xml);
        return xml;
    }

    public static OvalDefinitions loadOVALDefinitionsFile(File ovalFile)
    {
        try
        {
            JAXBContext jc = JAXBContext.newInstance(OvalDefinitions.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            FileReader reader = new FileReader(ovalFile);
            OvalDefinitions definitions = (OvalDefinitions) unmarshaller.unmarshal(reader);

            if(definitions==null)
            {
                return null;
            }
            if(definitions.getTests()!=null && definitions.getTests().getTest()!=null)
            {
                //Map<String, JAXBElement<? extends TestType>> ovalTests = new HashMap<>();
                for (JAXBElement<? extends TestType> tmpTest : definitions.getTests().getTest())
                {
                    //ovalTests.put(tmpTest.getValue().getId(), tmpTest);
                    replaceDeprecatedCheckForTest(((TestType) tmpTest.getValue()), tmpTest.getValue().getId());
                    ovalItemCache.put(tmpTest.getValue().getId(), tmpTest);
                }
            }
            //Map<String, JAXBElement<? extends ObjectType>> ovalObjects = new HashMap<>();
            if(definitions.getObjects()!=null && definitions.getObjects().getObject()!=null)
            {
                for (JAXBElement<? extends ObjectType> tmpObject : definitions.getObjects().getObject())
                {
                    //ovalObjects.put(tmpObject.getValue().getId(), tmpObject);
                    ovalItemCache.put(tmpObject.getValue().getId(), tmpObject);
                }
            }
            //Map<String, JAXBElement<? extends StateType>> ovalStates = new HashMap<>();
            if(definitions.getStates()!=null && definitions.getStates().getState()!=null)
            {
                for (JAXBElement<? extends StateType> tmpState : definitions.getStates().getState())
                {
                    //ovalStates.put(tmpState.getValue().getId(), tmpState);
                    ovalItemCache.put(tmpState.getValue().getId(), tmpState);
                }
            }
            //Map<String, JAXBElement<? extends VariableType>> ovalVariables = new HashMap<>();
            if(definitions.getVariables()!=null && definitions.getVariables().getVariable()!=null)
            {
                for (JAXBElement<? extends VariableType> tmpVar : definitions.getVariables().getVariable())
                {
                    //ovalVariables.put(tmpVar.getValue().getId(), tmpVar);
                    ovalItemCache.put(tmpVar.getValue().getId(), tmpVar);
                }
            }

            for(DefinitionType tmpDefinitionType : definitions.getDefinitions().getDefinition())
            {
                ovalItemCache.put(tmpDefinitionType.getId(), tmpDefinitionType);
            }
            return definitions;
        }
        catch (Exception ex)
        {
            logger.error("loadOVALDefinitionsFile ovalFile="+ovalFile, ex);
            return null;
        }
    }
}
