
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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windowsfiletest;

import com.vulniq.client.securityanalyzer.TerziTestSetup;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windows.PowerShellFileSearchUtils;
import com.vulniq.client.securityanalyzer.oval.error.FilePropertyNotFoundException;
import com.vulniq.client.securityanalyzer.oval.error.NonExistentFilePropertyError;
import com.vulniq.client.securityanalyzer.oval.error.OSCommandTimedOutError;
import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBElement;

import com.vulniq.client.securityanalyzer.utils.FileUtils;
import org.apache.commons.lang3.SystemUtils;
import org.junit.After;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Textfilecontent54Object;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject;

/**
 *
 *
 */
public class PowerShellFileSearchUtilsTest
{

    OVALInterpreter ovalInterpreter;
    DataCollectionTarget hostOSTarget;
    OSInfo hostOSInfo;

    public PowerShellFileSearchUtilsTest()
    {
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
    public void testOfPowerShellFileUtils()
    {
        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/win-def_file_test.xml";
        File ovalFile = new File(ovalXMLPath);

        OvalDefinitions definitions = OVALXMLLoader.loadOVALDefinitionsFile(ovalFile);

        for (JAXBElement<? extends ObjectType> jAXBElement : definitions.getObjects().getObject())
        {
            FileObject fileObject = (FileObject) jAXBElement.getValue();
            PowerShellFileSearchUtils psFileUtils = new PowerShellFileSearchUtils(hostOSTarget, fileObject);

            try
            {
                String fileAbsolutePath = psFileUtils.getFileSearchResults();
                assertNotNull(fileAbsolutePath);
            }
            catch (Exception ex)
            {
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_WARN, OVALInterpreter.OVALTypesForLog.Object, fileObject.getId(), "PowerShell file search failed at unit-test", null);
            }
        }

    }

    @Test
    public void testOfPowerShellUtilsDocker()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-windows");
        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/win-def_file_test.xml";
        File ovalFile = new File(ovalXMLPath);

        OvalDefinitions definitions = OVALXMLLoader.loadOVALDefinitionsFile(ovalFile);

        for (JAXBElement<? extends ObjectType> jAXBElement : definitions.getObjects().getObject())
        {
            FileObject fileObject = (FileObject) jAXBElement.getValue();
            PowerShellFileSearchUtils psFileUtils = new PowerShellFileSearchUtils(target, fileObject);

            try
            {
                String fileAbsolutePath = psFileUtils.getFileSearchResults();
                assertNotNull(fileAbsolutePath);
            }
            catch (Exception ex)
            {
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_WARN, OVALInterpreter.OVALTypesForLog.Object, fileObject.getId(), "PowerShell file search failed at unit-test", null);
            }
        }
    }
    
    @Test
    public void testForTextFileContent54 () throws OSCommandTimedOutError, FilePropertyNotFoundException, NonExistentFilePropertyError
    {
        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/ind-def_textfilecontent54_test-windows.xml";
        File ovalFile = new File(ovalXMLPath);

        OvalDefinitions definitions = OVALXMLLoader.loadOVALDefinitionsFile(ovalFile);

        ArrayList<String[]> resultList = new ArrayList<>();
        for (JAXBElement<? extends ObjectType> jAXBElement : definitions.getObjects().getObject())
        {
            Textfilecontent54Object textfilecontent54Object = (Textfilecontent54Object) jAXBElement.getValue();
            PowerShellFileSearchUtils psFileUtils = new PowerShellFileSearchUtils(hostOSTarget, textfilecontent54Object);

            try
            {
                String fileAbsolutePath = psFileUtils.getFileSearchResults();
                String[] convertFileSearchResultsToAbsolutePath = psFileUtils.convertFileSearchResultsToAbsolutePath(fileAbsolutePath);
                resultList.add(convertFileSearchResultsToAbsolutePath);
                assertNotNull(fileAbsolutePath);
            }
            catch (Exception ex)
            {
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_WARN, OVALInterpreter.OVALTypesForLog.Object, textfilecontent54Object.getId(), "PowerShell file search failed at unit-test", null);
            }
        }
        for (String[] paths : resultList)
        {
            for (String path : paths)
            {
                String fileContent = PowerShellFilePropertiesUtils.getFileContent(hostOSTarget, path);
                assertNotNull(fileContent);
                assertNotEquals("", path);
            }
        }
    }
}
