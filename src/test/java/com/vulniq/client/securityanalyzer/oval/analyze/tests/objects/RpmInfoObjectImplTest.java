

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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vulniq.client.securityanalyzer.TerziTestSetup;
import com.vulniq.client.securityanalyzer.TerziTestUtilizingDocker;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.datacollection.linux.CollectedRpmInfo;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import org.junit.Assert;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoObject;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class RpmInfoObjectImplTest extends TerziTestUtilizingDocker
{
    @Test
    public void testCollectedRpmInfo()
    {
        String str = "Name        : vim-minimal\n" +
                "Epoch       : 2\n" +
                "Version     : 7.4.160\n" +
                "Release     : 1.el7\n" +
                "Architecture: x86_64\n" +
                "Install Date: Wed Mar  4 12:58:09 2015\n" +
                "Group       : Applications/Editors\n" +
                "Size        : 917608\n" +
                "License     : Vim\n" +
                "Signature   : RSA/SHA256, Fri Jul  4 05:41:17 2014, Key ID 24c6a8a7f4a80eb5\n" +
                "Source RPM  : vim-7.4.160-1.el7.src.rpm\n" +
                "Build Date  : Tue Jun 10 06:56:27 2014\n" +
                "Build Host  : worker1.bsys.centos.org\n" +
                "Relocations : (not relocatable)\n" +
                "Packager    : CentOS BuildSystem <http://bugs.centos.org>\n" +
                "Vendor      : CentOS\n" +
                "URL         : http://www.vim.org/\n" +
                "Summary     : A minimal version of the VIM editor\n" +
                "Description :\n" +
                "VIM (VIsual editor iMproved) is an updated and improved version of the\n" +
                "vi editor.  Vi was the first real screen-based editor for UNIX, and is\n" +
                "still very popular.  VIM improves on vi by adding new features:\n" +
                "multiple windows, multi-level undo, block highlighting and more. The\n" +
                "vim-minimal package includes a minimal version of VIM, which is\n" +
                "installed into /bin/vi for use when only the root partition is\n" +
                "present. NOTE: The online help is only available when the vim-common\n" +
                "package is installed.";
        CollectedRpmInfo collectedRpmInfo = new CollectedRpmInfo(str);
        Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
        System.out.println(gson.toJson(collectedRpmInfo));
        String evr = collectedRpmInfo.getValueByElementName("evr");
        assertEquals("2:7.4.160-1.el7", evr);
    }

    @Test
    public void collectValue() throws Exception
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-rhel7");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter interpreter = new OVALInterpreter("cisoval", target, osInfo, true);
        interpreter.loadDefinitionsFile("https://www.redhat.com/security/data/oval/com.redhat.rhsa-20190049.xml");
        ObjectType objType = OVALXMLLoader.loadObject(null, "oval:com.redhat.rhsa:obj:20190049006", osInfo.getDisplayVersion(), null);
        RpmInfoObjectImpl impl = new RpmInfoObjectImpl(interpreter, (RpminfoObject)objType);
        ObjectCollectionResult result = impl.collectValues(target);
        assertNotNull(result);
        StateType stateType = OVALXMLLoader.loadState(null, "oval:com.redhat.rhsa:ste:20190049001", osInfo.getDisplayVersion(), null);
        if(result.getCollectedValues()!=null)
        {
            List<ResultEnumeration> evalResult = impl.evaluateSingleValueVsState(result.getCollectedValues().get(0), stateType);
            System.out.println(evalResult);
            assertNotNull(evalResult);
            assertTrue(evalResult.get(0) == ResultEnumeration.TRUE);
        }
    }

    @Test
    public void testOVALTestContent()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-rhel7");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter ovalInterpreter = new OVALInterpreter("cisoval", target, osInfo, true);

        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/linux-def_rpminfo_test.xml";
        File ovalFile = new File(ovalXMLPath);

        OvalDefinitions definitions = OVALXMLLoader.loadOVALDefinitionsFile(ovalFile);
        Map<String, ResultEnumeration> testResults = new HashMap<>();
        for(int index = 0; index< definitions.getDefinitions().getDefinition().size(); index++)
        {
            String definitionId = definitions.getDefinitions().getDefinition().get(index).getId();
            ResultEnumeration resultOfDef = ovalInterpreter.evaluateDefinition(definitionId);
            testResults.put(definitionId, resultOfDef);
            System.out.println(definitionId + "   " + resultOfDef);
        }
        System.out.println(testResults);
        Assert.assertTrue(testResults.containsValue(ResultEnumeration.TRUE));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.ERROR));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.FALSE));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.NOT_APPLICABLE));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.NOT_EVALUATED));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.UNKNOWN));
    }
}