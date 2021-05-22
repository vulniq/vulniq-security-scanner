
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

package com.vulniq.client.securityanalyzer.oval.analyze;

import com.vulniq.client.securityanalyzer.TerziTestBase;
import com.vulniq.client.securityanalyzer.TerziTestSetup;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_common_5.CheckEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;

/**
 *
 *
 */
public class CheckEnumerationAnalyzerTest extends TerziTestBase
{

    public CheckEnumerationAnalyzerTest()
    {
    }

    @Before
    public void setUp()
    {
    }


    /**
     * Tests of evaluate method, of class CheckEnumerationAnalyzer for
     * checkEnumeration of AT_LEAST_ONE.
     */
    @Test
    public void testEvaluateAtLeastOne_True() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.TRUE);
        Assert.assertEquals(ResultEnumeration.TRUE, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.AT_LEAST_ONE, results));
    }

    @Test
    public void testEvaluateAtLeastOne_False() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        Assert.assertEquals(ResultEnumeration.FALSE, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.AT_LEAST_ONE, results));
    }

    @Test
    public void testEvaluateAtLeastOne_Error() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.ERROR);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        Assert.assertEquals(ResultEnumeration.ERROR, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.AT_LEAST_ONE, results));
    }

    @Test
    public void testEvaluateAtLeastOne_Unknown() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.UNKNOWN);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        Assert.assertEquals(ResultEnumeration.UNKNOWN, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.AT_LEAST_ONE, results));
    }

    @Test
    public void testEvaluateAtLeastOne_NotEvaluated() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_EVALUATED);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        Assert.assertEquals(ResultEnumeration.NOT_EVALUATED, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.AT_LEAST_ONE, results));
    }

    @Test
    public void testEvaluateAtLeastOne_NotApplicable() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        Assert.assertEquals(ResultEnumeration.NOT_APPLICABLE, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.AT_LEAST_ONE, results));
    }

    @Test
    public void testEvaluateAtLeastOne_NotApplicable2() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.NOT_EVALUATED);
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.ERROR);
        results.add(ResultEnumeration.UNKNOWN);
        Assert.assertNotEquals(ResultEnumeration.NOT_APPLICABLE, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.AT_LEAST_ONE, results));
    }

    /**
     * Tests of evaluate method, of class CheckEnumerationAnalyzer for
     * checkEnumeration of ALL.
     */
    @Test
    public void testEvaluateAll_True() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.TRUE);
        Assert.assertEquals(ResultEnumeration.TRUE, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.ALL, results));
    }

    @Test
    public void testEvaluateAll_False() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.TRUE);
        Assert.assertEquals(ResultEnumeration.FALSE, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.ALL, results));
    }

    @Test
    public void testEvaluateAll_Error() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.ERROR);
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.UNKNOWN);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.NOT_EVALUATED);
        Assert.assertEquals(ResultEnumeration.ERROR, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.ALL, results));
    }

    @Test
    public void testEvaluateAll_Unknown() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.UNKNOWN);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.NOT_EVALUATED);
        Assert.assertEquals(ResultEnumeration.UNKNOWN, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.ALL, results));
    }

    @Test
    public void testEvaluateAll_NotEvaluated() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.NOT_EVALUATED);
        Assert.assertEquals(ResultEnumeration.NOT_EVALUATED, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.ALL, results));
    }

    @Test
    public void testEvaluateAll_NotApplicable() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        Assert.assertEquals(ResultEnumeration.NOT_APPLICABLE, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.ALL, results));
    }

    @Test
    public void testEvaluateALL_NotApplicable2() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.NOT_EVALUATED);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.ERROR);
        results.add(ResultEnumeration.UNKNOWN);
        Assert.assertNotEquals(ResultEnumeration.NOT_APPLICABLE, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.ALL, results));
    }

    /**
     * Tests of evaluate method, of class CheckEnumerationAnalyzer for
     * checkEnumeration of ONLY_ONE.
     */
    @Test
    public void testEvaluateOnlyOne_True() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        Assert.assertEquals(ResultEnumeration.TRUE, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.ONLY_ONE, results));
    }

    @Test
    public void testEvaluateOnlyOne_False1() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.UNKNOWN);
        results.add(ResultEnumeration.ERROR);
        results.add(ResultEnumeration.NOT_EVALUATED);
        Assert.assertEquals(ResultEnumeration.FALSE, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.ONLY_ONE, results));
    }

    @Test
    public void testEvaluateOnlyOne_False2() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        Assert.assertEquals(ResultEnumeration.FALSE, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.ONLY_ONE, results));
    }

    @Test
    public void testEvaluateOnlyOne_Error() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.ERROR);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        Assert.assertEquals(ResultEnumeration.ERROR, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.ONLY_ONE, results));
        results.add(ResultEnumeration.TRUE);
        Assert.assertEquals(ResultEnumeration.ERROR, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.ONLY_ONE, results));
    }

    @Test
    public void testEvaluateOnlyOne_Unknown() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.UNKNOWN);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        Assert.assertEquals(ResultEnumeration.UNKNOWN, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.ONLY_ONE, results));
        results.add(ResultEnumeration.TRUE);
        Assert.assertEquals(ResultEnumeration.UNKNOWN, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.ONLY_ONE, results));
    }

    @Test
    public void testEvaluateOnlyOne_NotEvaluated() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_EVALUATED);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        Assert.assertEquals(ResultEnumeration.NOT_EVALUATED, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.ONLY_ONE, results));
        results.add(ResultEnumeration.TRUE);
        Assert.assertEquals(ResultEnumeration.NOT_EVALUATED, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.ONLY_ONE, results));
    }

    @Test
    public void testEvaluateOnlyOne_NotApplicable() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        Assert.assertEquals(ResultEnumeration.NOT_APPLICABLE, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.ONLY_ONE, results));
    }

    @Test
    public void testEvaluateOnlyOne_NotApplicable2() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.NOT_EVALUATED);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.ERROR);
        results.add(ResultEnumeration.UNKNOWN);
        Assert.assertNotEquals(ResultEnumeration.NOT_APPLICABLE, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.ONLY_ONE, results));
    }

    /**
     * Tests of evaluate method, of class CheckEnumerationAnalyzer for
     * checkEnumeration of NONE_SATISFY.
     */
    @Test
    public void testEvaluateNoneSatisfy_True() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        Assert.assertEquals(ResultEnumeration.TRUE, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.NONE_SATISFY, results));
    }

    @Test
    public void testEvaluateNoneSatisfy_False() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.ERROR);
        results.add(ResultEnumeration.UNKNOWN);
        Assert.assertEquals(ResultEnumeration.FALSE, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.NONE_SATISFY, results));
    }

    @Test
    public void testEvaluateNoneSatisfy_Error() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.ERROR);
        results.add(ResultEnumeration.UNKNOWN);
        Assert.assertEquals(ResultEnumeration.ERROR, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.NONE_SATISFY, results));
    }

    @Test
    public void testEvaluateNoneSatisfy_Unknown() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.NOT_EVALUATED);
        results.add(ResultEnumeration.UNKNOWN);
        Assert.assertEquals(ResultEnumeration.UNKNOWN, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.NONE_SATISFY, results));
    }

    @Test
    public void testEvaluateNoneSatisfy_NotEvaluated() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.NOT_EVALUATED);
        Assert.assertEquals(ResultEnumeration.NOT_EVALUATED, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.NONE_SATISFY, results));
    }

    @Test
    public void testEvaluateNoneSatisfy_NotApplicable() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        Assert.assertEquals(ResultEnumeration.NOT_APPLICABLE, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.NONE_SATISFY, results));
    }

    @Test
    public void testEvaluateNoneSatisfy_NotApplicable2() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.NOT_EVALUATED);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.ERROR);
        results.add(ResultEnumeration.UNKNOWN);
        Assert.assertNotEquals(ResultEnumeration.NOT_APPLICABLE, CheckEnumerationAnalyzer.evaluate(CheckEnumeration.NONE_SATISFY, results));
    }

    /**
     * WARNING I had to modify the xml as it contained errors 'in my opinion', Serkan
     */
    @Test
    public void testOVALTestContentCheckEnumeration()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Host, "");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter ovalInterpreter = new OVALInterpreter("cisoval", target, osInfo, true);
        ovalInterpreter.setOvalLogLevel(4);
        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/oval_check_enumeration.xml";
        File ovalFile = new File(ovalXMLPath);

        OvalDefinitions definitions = OVALXMLLoader.loadOVALDefinitionsFile(ovalFile);
        Map<String, ResultEnumeration> testResults = new HashMap<>();
        for(int index = 0; index< definitions.getDefinitions().getDefinition().size(); index++)
        {
            String definitionId = definitions.getDefinitions().getDefinition().get(index).getId();
            ResultEnumeration resultForDefinition = ovalInterpreter.evaluateDefinition(definitionId);
            testResults.put(definitionId, resultForDefinition);
            System.out.println(definitionId + "   " + resultForDefinition);
        }
        System.out.println(testResults);
        Assert.assertTrue(testResults.containsValue(ResultEnumeration.TRUE));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.ERROR));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.FALSE));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.NOT_APPLICABLE));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.NOT_EVALUATED));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.UNKNOWN));
    }


    @Test
    public void testOVALTestContentCheckEnumerationObjectState()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Host, "");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter ovalInterpreter = new OVALInterpreter("cisoval", target, osInfo, true);
        ovalInterpreter.setOvalLogLevel(4);
        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/oval_check_enumeration_object_state.xml";
        File ovalFile = new File(ovalXMLPath);

        OvalDefinitions definitions = OVALXMLLoader.loadOVALDefinitionsFile(ovalFile);

        Map<String, ResultEnumeration> testResults = new HashMap<>();
        for(int index = 0; index< definitions.getDefinitions().getDefinition().size(); index++)
        {
            String definitionId = definitions.getDefinitions().getDefinition().get(index).getId();
            ResultEnumeration resultForDefinition = ovalInterpreter.evaluateDefinition(definitionId);
            testResults.put(definitionId, resultForDefinition);
            System.out.println(definitionId + "   " + resultForDefinition);
        }
        System.out.println(testResults);
        Assert.assertTrue("oval:org.mitre.oval.test:tst:422 looks wrong. Check if it's the only failing test" ,
                            testResults.containsValue(ResultEnumeration.TRUE));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.ERROR));
        Assert.assertFalse("oval:org.mitre.oval.test:tst:422 looks wrong. Check if it's the only failing test" ,
                            testResults.containsValue(ResultEnumeration.FALSE));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.NOT_APPLICABLE));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.NOT_EVALUATED));
        Assert.assertFalse(testResults.containsValue(ResultEnumeration.UNKNOWN));
    }

    @Test
    public void testOVALTestContentExistenceEnumeration()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Host, "");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter ovalInterpreter = new OVALInterpreter("cisoval", target, osInfo, true);
        ovalInterpreter.setOvalLogLevel(4);
        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/oval_existence_enumeration.xml";
        File ovalFile = new File(ovalXMLPath);

        OvalDefinitions definitions = OVALXMLLoader.loadOVALDefinitionsFile(ovalFile);
        Map<String, ResultEnumeration> testResults = new HashMap<>();
        for(int index = 0; index< definitions.getDefinitions().getDefinition().size(); index++)
        {
            String definitionId = definitions.getDefinitions().getDefinition().get(index).getId();
            ResultEnumeration resultForDefinition = ovalInterpreter.evaluateDefinition(definitionId);
            testResults.put(definitionId, resultForDefinition);
            System.out.println(definitionId + "   " + resultForDefinition);
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
