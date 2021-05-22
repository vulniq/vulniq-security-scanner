
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
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import java.util.LinkedList;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_common_5.OperatorEnumeration;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;


public class OperatorAnalyzerTest extends TerziTestBase
{
    
    public OperatorAnalyzerTest()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Tests of evaluate method, of class OperatorAnalyzer for case "AND".
     * @throws com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError
     */

    @Test
    public void testEvaluateAnd_True() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.NOT_APPLICABLE);        
        Assert.assertEquals(ResultEnumeration.TRUE, OperatorAnalyzer.evaluate(OperatorEnumeration.AND, results));
    }

    @Test
    public void testEvaluateAnd_notTrue() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);       
        Assert.assertNotEquals(ResultEnumeration.TRUE, OperatorAnalyzer.evaluate(OperatorEnumeration.AND, results));
    }
    
    @Test
    public void testEvaluateAnd_False() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.FALSE);        
        Assert.assertEquals(ResultEnumeration.FALSE, OperatorAnalyzer.evaluate(OperatorEnumeration.AND, results));
    }

    @Test
    public void testEvaluateAnd_Error() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.ERROR);
        results.add(ResultEnumeration.TRUE);        
        Assert.assertEquals(ResultEnumeration.ERROR, OperatorAnalyzer.evaluate(OperatorEnumeration.AND, results));
    }    
    @Test
    public void testEvaluateAnd_Unknown() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.UNKNOWN);
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.NOT_EVALUATED);        
        Assert.assertEquals(ResultEnumeration.UNKNOWN, OperatorAnalyzer.evaluate(OperatorEnumeration.AND, results));
    }
    
    @Test
    public void testEvaluateAnd_NotEvaluated() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.NOT_EVALUATED);        
        Assert.assertEquals(ResultEnumeration.NOT_EVALUATED, OperatorAnalyzer.evaluate(OperatorEnumeration.AND, results));
    }         

    @Test
    public void testEvaluateAnd_NotApplicable() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);      
        Assert.assertEquals(ResultEnumeration.NOT_APPLICABLE, OperatorAnalyzer.evaluate(OperatorEnumeration.AND, results));
    }
    
    @Test(expected = UnexpectedOVALEvaluationError.class)
    public void testEvaluateForExpectedException_And() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        Assert.assertEquals(ResultEnumeration.NOT_APPLICABLE, OperatorAnalyzer.evaluate(OperatorEnumeration.AND, results));       
    }
    
    /**
     * Tests of evaluate method, of class OperatorAnalyzer for case "ONE".
     */
    
    @Test
    public void testEvaluateOne_True() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);        
        Assert.assertEquals(ResultEnumeration.TRUE, OperatorAnalyzer.evaluate(OperatorEnumeration.ONE, results));
    }
    
    @Test
    public void testEvaluateOne_False1() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.ERROR);
        results.add(ResultEnumeration.NOT_EVALUATED);        
        Assert.assertEquals(ResultEnumeration.FALSE, OperatorAnalyzer.evaluate(OperatorEnumeration.ONE, results));
    }

    @Test
    public void testEvaluateOne_False2() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);        
        Assert.assertEquals(ResultEnumeration.FALSE, OperatorAnalyzer.evaluate(OperatorEnumeration.ONE, results));
    }    

    @Test
    public void testEvaluateOne_Error() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.ERROR);
        results.add(ResultEnumeration.NOT_EVALUATED);          
        Assert.assertEquals(ResultEnumeration.ERROR, OperatorAnalyzer.evaluate(OperatorEnumeration.ONE, results));
    }

    @Test
    public void testEvaluateOne_Unknown() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.UNKNOWN);
        results.add(ResultEnumeration.NOT_EVALUATED);          
        Assert.assertEquals(ResultEnumeration.UNKNOWN, OperatorAnalyzer.evaluate(OperatorEnumeration.ONE, results));
    }
    
    @Test
    public void testEvaluateOne_NotEvaluated() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.NOT_EVALUATED);          
        Assert.assertEquals(ResultEnumeration.NOT_EVALUATED, OperatorAnalyzer.evaluate(OperatorEnumeration.ONE, results));
    }

    @Test
    public void testEvaluateOne_NotApplicable() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);    
        Assert.assertEquals(ResultEnumeration.NOT_APPLICABLE, OperatorAnalyzer.evaluate(OperatorEnumeration.ONE, results));
    }
    
    @Test(expected = UnexpectedOVALEvaluationError.class)
    public void testEvaluateForExpectedException_One() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        Assert.assertEquals(ResultEnumeration.NOT_APPLICABLE, OperatorAnalyzer.evaluate(OperatorEnumeration.ONE, results));       
    }    

    /**
     * Tests of evaluate method, of class OperatorAnalyzer for case "OR".
     * @throws com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError
     */

    @Test
    public void testEvaluateOr_True() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.UNKNOWN);
        results.add(ResultEnumeration.NOT_EVALUATED);
        results.add(ResultEnumeration.ERROR);
        Assert.assertEquals(ResultEnumeration.TRUE, OperatorAnalyzer.evaluate(OperatorEnumeration.OR, results));
    }
    
    @Test
    public void testEvaluateOr_False() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        Assert.assertEquals(ResultEnumeration.FALSE, OperatorAnalyzer.evaluate(OperatorEnumeration.OR, results));
    }
    
    @Test
    public void testEvaluateOr_Error() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.UNKNOWN);
        results.add(ResultEnumeration.NOT_EVALUATED);
        results.add(ResultEnumeration.ERROR);
        Assert.assertEquals(ResultEnumeration.ERROR, OperatorAnalyzer.evaluate(OperatorEnumeration.OR, results));
    }

    @Test
    public void testEvaluateOr_Unknown() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.UNKNOWN);
        results.add(ResultEnumeration.NOT_EVALUATED);
        Assert.assertEquals(ResultEnumeration.UNKNOWN, OperatorAnalyzer.evaluate(OperatorEnumeration.OR, results));
    }

    @Test
    public void testEvaluateOr_NotEvaluated() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.NOT_EVALUATED);
        Assert.assertEquals(ResultEnumeration.NOT_EVALUATED, OperatorAnalyzer.evaluate(OperatorEnumeration.OR, results));
    }    

    @Test
    public void testEvaluateOr_NotApplicable() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        Assert.assertEquals(ResultEnumeration.NOT_APPLICABLE, OperatorAnalyzer.evaluate(OperatorEnumeration.OR, results));
    }
    
    @Test(expected = UnexpectedOVALEvaluationError.class)
    public void testEvaluateForExpectedException_Or() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        Assert.assertEquals(ResultEnumeration.NOT_APPLICABLE, OperatorAnalyzer.evaluate(OperatorEnumeration.OR, results));       
    }

    /**
     * Tests of evaluate method, of class OperatorAnalyzer for case "XOR".
     * @throws com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError
     */

    @Test
    public void testEvaluateXor_True() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.TRUE);
        Assert.assertEquals(ResultEnumeration.TRUE, OperatorAnalyzer.evaluate(OperatorEnumeration.XOR, results));
    }

    @Test
    public void testEvaluateXor_False() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.TRUE);
        Assert.assertEquals(ResultEnumeration.FALSE, OperatorAnalyzer.evaluate(OperatorEnumeration.XOR, results));
    }

    @Test
    public void testEvaluateXor_Error() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.UNKNOWN);
        results.add(ResultEnumeration.NOT_EVALUATED);
        results.add(ResultEnumeration.ERROR);
        Assert.assertEquals(ResultEnumeration.ERROR, OperatorAnalyzer.evaluate(OperatorEnumeration.XOR, results));
    } 
    
    @Test
    public void testEvaluateXor_Unknown() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.UNKNOWN);
        results.add(ResultEnumeration.NOT_EVALUATED);
        Assert.assertEquals(ResultEnumeration.UNKNOWN, OperatorAnalyzer.evaluate(OperatorEnumeration.XOR, results));
    }

    @Test
    public void testEvaluateXor_NotEvaluated() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        results.add(ResultEnumeration.FALSE);
        results.add(ResultEnumeration.TRUE);
        results.add(ResultEnumeration.NOT_EVALUATED);
        Assert.assertEquals(ResultEnumeration.NOT_EVALUATED, OperatorAnalyzer.evaluate(OperatorEnumeration.XOR, results));
    }    

    @Test
    public void testEvaluateXor_NotApplicable() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        results.add(ResultEnumeration.NOT_APPLICABLE);
        Assert.assertEquals(ResultEnumeration.NOT_APPLICABLE, OperatorAnalyzer.evaluate(OperatorEnumeration.XOR, results));
    }
    
    @Test
    public void testEvaluateEmptyResultsReturnFalse_Xor() throws UnexpectedOVALEvaluationError
    {
        LinkedList<ResultEnumeration> results = new LinkedList<>();
        Assert.assertEquals(ResultEnumeration.FALSE, OperatorAnalyzer.evaluate(OperatorEnumeration.XOR, results));
    }    
}
