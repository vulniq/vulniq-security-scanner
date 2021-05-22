
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
import com.vulniq.client.securityanalyzer.oval.analyze.ExistenceEnumerationAnalyzer.EvaluationTarget;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import java.util.LinkedList;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_common_5.ExistenceEnumeration;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;

/**
 *
 *
 */
public class ExistenceEnumerationAnalyzerTest extends TerziTestBase
{

    public ExistenceEnumerationAnalyzerTest()
    {
    }

    /**
     * Test of evaluate method, of class ExistenceEnumerationAnalyzer for case
     * "ALL_EXIST" and the evaluation target is "State".
     */
    
    @Test
    public void testEvaluateAllExist_State_True() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.EXISTS);
        Assert.assertEquals(ResultEnumeration.TRUE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ALL_EXIST, results, EvaluationTarget.State));
    }

    @Test
    public void testEvaluateAllExist_State_False() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        Assert.assertEquals(ResultEnumeration.FALSE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ALL_EXIST, results, EvaluationTarget.State));
    }

    @Test
    public void testEvaluateAllExist_State_False2() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.EXISTS);
        results.add(StatusEnumeration.DOES_NOT_EXIST);
        results.add(StatusEnumeration.ERROR);
        results.add(StatusEnumeration.NOT_COLLECTED);
        Assert.assertEquals(ResultEnumeration.FALSE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ALL_EXIST, results, EvaluationTarget.State));
    }

    @Test
    public void testEvaluateAllExist_State_Error() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.EXISTS);
        results.add(StatusEnumeration.ERROR);
        results.add(StatusEnumeration.NOT_COLLECTED);
        Assert.assertEquals(ResultEnumeration.ERROR, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ALL_EXIST, results, EvaluationTarget.State));
    }

    @Test
    public void testEvaluateAllExist_State_Unknown() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.EXISTS);
        results.add(StatusEnumeration.NOT_COLLECTED);
        Assert.assertEquals(ResultEnumeration.UNKNOWN, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ALL_EXIST, results, EvaluationTarget.State));
    }

    /**
     * Test of evaluate method, of class ExistenceEnumerationAnalyzer for case
     * "ALL_EXIST" and the evaluation target is "Test". When evaluation target
     * is "Test" case "ALL_EXIST" becomes "AT_LEAST_ONE_EXISTS".
     */
    
    @Test
    public void testEvaluateAllExist_Test_True() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.EXISTS);
        results.add(StatusEnumeration.DOES_NOT_EXIST);
        results.add(StatusEnumeration.ERROR);
        results.add(StatusEnumeration.NOT_COLLECTED);
        Assert.assertEquals(ResultEnumeration.TRUE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ALL_EXIST, results, EvaluationTarget.Test));
    }

    @Test
    public void testEvaluateAllExist_Test_False() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.DOES_NOT_EXIST);
        Assert.assertEquals(ResultEnumeration.FALSE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ALL_EXIST, results, EvaluationTarget.Test));
    }

    @Test
    public void testEvaluateAllExist_Test_Error() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.DOES_NOT_EXIST);
        results.add(StatusEnumeration.ERROR);
        results.add(StatusEnumeration.NOT_COLLECTED);
        Assert.assertEquals(ResultEnumeration.ERROR, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ALL_EXIST, results, EvaluationTarget.Test));
    }

    @Test
    public void testEvaluateAllExist_Test_Unknown() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.DOES_NOT_EXIST);
        results.add(StatusEnumeration.NOT_COLLECTED);
        Assert.assertEquals(ResultEnumeration.UNKNOWN, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ALL_EXIST, results, EvaluationTarget.Test));
    }

    /**
     * Test of evaluate method, of class ExistenceEnumerationAnalyzer for case
     * "ANY_EXIST" and the evaluation target is "Test" or "State".
     *
     */
    
    @Test
    public void testEvaluateAnyExist_True() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.DOES_NOT_EXIST);
        results.add(StatusEnumeration.NOT_COLLECTED);
        results.add(StatusEnumeration.EXISTS);        
        Assert.assertEquals(ResultEnumeration.TRUE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ANY_EXIST, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.TRUE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ANY_EXIST, results, EvaluationTarget.State));
    }
    
    @Test
    public void testEvaluateAnyExist_True2() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();   
        Assert.assertEquals(ResultEnumeration.TRUE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ANY_EXIST, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.TRUE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ANY_EXIST, results, EvaluationTarget.State));
    }
    @Test
    public void testEvaluateAnyExist_True3() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.DOES_NOT_EXIST);
        results.add(StatusEnumeration.NOT_COLLECTED);
        results.add(StatusEnumeration.EXISTS);
        results.add(StatusEnumeration.ERROR);        
        Assert.assertEquals(ResultEnumeration.TRUE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ANY_EXIST, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.TRUE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ANY_EXIST, results, EvaluationTarget.State));
    }    
    
    @Test
    public void testEvaluateAnyExist_Error() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.DOES_NOT_EXIST);
        results.add(StatusEnumeration.NOT_COLLECTED);
        results.add(StatusEnumeration.ERROR);        
        Assert.assertEquals(ResultEnumeration.ERROR, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ANY_EXIST, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.ERROR, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ANY_EXIST, results, EvaluationTarget.State));
    } 
    
    /**
     * Test of evaluate method, of class ExistenceEnumerationAnalyzer for case
     * "AT_LEAST_ONE_EXISTS" and the evaluation target is "Test" or "State".
     *
     */
    
    @Test
    public void testEvaluateAtLeastOneExists_True() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.EXISTS);
        results.add(StatusEnumeration.DOES_NOT_EXIST);
        results.add(StatusEnumeration.ERROR);
        results.add(StatusEnumeration.NOT_COLLECTED);
        Assert.assertEquals(ResultEnumeration.TRUE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.AT_LEAST_ONE_EXISTS, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.TRUE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.AT_LEAST_ONE_EXISTS, results, EvaluationTarget.State));
    }

    @Test
    public void testEvaluateAtLeastOneExists_False() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.DOES_NOT_EXIST);
        Assert.assertEquals(ResultEnumeration.FALSE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.AT_LEAST_ONE_EXISTS, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.FALSE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.AT_LEAST_ONE_EXISTS, results, EvaluationTarget.State));
    }

    @Test
    public void testEvaluateAtLeastOneExists_Error() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.DOES_NOT_EXIST);
        results.add(StatusEnumeration.ERROR);
        results.add(StatusEnumeration.NOT_COLLECTED);
        Assert.assertEquals(ResultEnumeration.ERROR, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.AT_LEAST_ONE_EXISTS, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.ERROR, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.AT_LEAST_ONE_EXISTS, results, EvaluationTarget.State));
    }

    @Test
    public void testEvaluateAtLeastOneExists_Unknown() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.DOES_NOT_EXIST);
        results.add(StatusEnumeration.NOT_COLLECTED);
        Assert.assertEquals(ResultEnumeration.UNKNOWN, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.AT_LEAST_ONE_EXISTS, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.UNKNOWN, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.AT_LEAST_ONE_EXISTS, results, EvaluationTarget.State));
    }
    
    /**
     * Test of evaluate method, of class ExistenceEnumerationAnalyzer for case
     * "NONE_EXIST" and the evaluation target is "Test" or "State".
     *
     */

    @Test
    public void testEvaluateNoneExist_True() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        //Check when the results list is empty
        Assert.assertEquals(ResultEnumeration.TRUE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.NONE_EXIST, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.TRUE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.NONE_EXIST, results, EvaluationTarget.State));
        
        results.add(StatusEnumeration.DOES_NOT_EXIST);
        
        Assert.assertEquals(ResultEnumeration.TRUE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.NONE_EXIST, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.TRUE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.NONE_EXIST, results, EvaluationTarget.State));
    }
    
    @Test
    public void testEvaluateNoneExist_False() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.DOES_NOT_EXIST);
        results.add(StatusEnumeration.ERROR);
        results.add(StatusEnumeration.EXISTS);
        results.add(StatusEnumeration.NOT_COLLECTED);        
        Assert.assertEquals(ResultEnumeration.FALSE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.NONE_EXIST, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.FALSE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.NONE_EXIST, results, EvaluationTarget.State));
    }
    
    @Test
    public void testEvaluateNoneExist_Error() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.DOES_NOT_EXIST);
        results.add(StatusEnumeration.ERROR);
        results.add(StatusEnumeration.NOT_COLLECTED);        
        Assert.assertEquals(ResultEnumeration.ERROR, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.NONE_EXIST, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.ERROR, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.NONE_EXIST, results, EvaluationTarget.State));
    }    
    
    @Test
    public void testEvaluateNoneExist_Unknown() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.DOES_NOT_EXIST);
        results.add(StatusEnumeration.NOT_COLLECTED);        
        Assert.assertEquals(ResultEnumeration.UNKNOWN, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.NONE_EXIST, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.UNKNOWN, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.NONE_EXIST, results, EvaluationTarget.State));
    } 

    /**
     * Test of evaluate method, of class ExistenceEnumerationAnalyzer for case
     * "ONLY_ONE_EXISTS" and the evaluation target is "Test" or "State".
     *
     */
    
    @Test
    public void testEvaluateOnlyOneExists_True() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.EXISTS);
        results.add(StatusEnumeration.DOES_NOT_EXIST);        
        Assert.assertEquals(ResultEnumeration.TRUE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ONLY_ONE_EXISTS, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.TRUE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ONLY_ONE_EXISTS, results, EvaluationTarget.State));
    }     
    
    @Test
    public void testEvaluateOnlyOneExists_False1() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.EXISTS);
        results.add(StatusEnumeration.DOES_NOT_EXIST);        
        results.add(StatusEnumeration.EXISTS);
        results.add(StatusEnumeration.ERROR); 
        results.add(StatusEnumeration.NOT_COLLECTED);
        Assert.assertEquals(ResultEnumeration.FALSE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ONLY_ONE_EXISTS, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.FALSE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ONLY_ONE_EXISTS, results, EvaluationTarget.State));
    }

    @Test
    public void testEvaluateOnlyOneExists_False2() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        Assert.assertEquals(ResultEnumeration.FALSE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ONLY_ONE_EXISTS, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.FALSE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ONLY_ONE_EXISTS, results, EvaluationTarget.State));
        results.add(StatusEnumeration.DOES_NOT_EXIST);        
        Assert.assertEquals(ResultEnumeration.FALSE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ONLY_ONE_EXISTS, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.FALSE, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ONLY_ONE_EXISTS, results, EvaluationTarget.State));
    }

    public void testEvaluateOnlyOneExists_Error() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.EXISTS);
        results.add(StatusEnumeration.DOES_NOT_EXIST);        
        results.add(StatusEnumeration.ERROR); 
        results.add(StatusEnumeration.NOT_COLLECTED);
        Assert.assertEquals(ResultEnumeration.ERROR, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ONLY_ONE_EXISTS, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.ERROR, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ONLY_ONE_EXISTS, results, EvaluationTarget.State));
    }
    
    public void testEvaluateOnlyOneExists_Unknown() throws UnexpectedOVALEvaluationError
    {
        LinkedList<StatusEnumeration> results = new LinkedList<>();
        results.add(StatusEnumeration.EXISTS);
        results.add(StatusEnumeration.DOES_NOT_EXIST);        
        results.add(StatusEnumeration.NOT_COLLECTED);
        Assert.assertEquals(ResultEnumeration.UNKNOWN, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ONLY_ONE_EXISTS, results, EvaluationTarget.Test));
        Assert.assertEquals(ResultEnumeration.UNKNOWN, ExistenceEnumerationAnalyzer.evaluate(ExistenceEnumeration.ONLY_ONE_EXISTS, results, EvaluationTarget.State));
    }    
    
}
