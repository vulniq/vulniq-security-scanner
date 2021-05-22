
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
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import org.junit.Before;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;

import static org.junit.Assert.*;

public class OperationAnalyzerTest extends TerziTestBase
{
    @Before
    public void setUp()
    {
    }

    @Test
    public void getEpochFromEVR()
    {
    }

    @Test
    public void getVersionFromEVR()
    {
    }

    @Test
    public void getReleaseFromEVR()
    {
    }

    @Test
    public void parseVersion()
    {
    }

    /** Tests for rpmvercmp
     * TODO: Correct rpmvercmp method first
     */
    @Test
    public void rpmvercmp()
    {
//        assertEquals(-1 , OperationAnalyzer.rpmvercmp("1.0^git1~pre", "1.0^git1"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("1.0^git1", "1.0^git1~pre"));
//        assertEquals(-1 , OperationAnalyzer.rpmvercmp("1.4~beta2", "1.4.8"));
//        assertEquals(-1 , OperationAnalyzer.rpmvercmp("1~beta2", "1.0.1"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("1.0.0.0", "1~beta"));
//        assertEquals(-1 , OperationAnalyzer.rpmvercmp("1.0.0.0", "1.0.0.1~beta"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("1.2~beta2", "1.0.1"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("1.4.8", "1.4~beta2"));
//        assertEquals(0 , OperationAnalyzer.rpmvercmp("a", "a"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("a", "A"));
//        assertEquals(0 , OperationAnalyzer.rpmvercmp("a+", "a+"));
//        assertEquals(0 , OperationAnalyzer.rpmvercmp("a+", "a_"));
//        assertEquals(0 , OperationAnalyzer.rpmvercmp("2.0.1", "2.0.1"));
//        assertEquals(0 , OperationAnalyzer.rpmvercmp("2.0.1a", "2.0.1a"));
//        assertEquals(0 , OperationAnalyzer.rpmvercmp("20101121", "20101121"));
//        assertEquals(-1 , OperationAnalyzer.rpmvercmp("20101120", "20101121"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("20101122", "20101121"));
//        //assertEquals(-1 , OperationAnalyzer.rpmvercmp("2.0.1", "2.0.1a"));
//        assertEquals(0 , OperationAnalyzer.rpmvercmp("1.0~rc1~git123", "1.0~rc1~git123"));
//        assertEquals(0 , OperationAnalyzer.rpmvercmp("1.1.α", "1.1.β"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("1.0^20160102", "1.0^20160101^git1"));
//        assertEquals(-1 , OperationAnalyzer.rpmvercmp("1.0^20160101^git1", "1.0^20160102"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("1:0.27.1-4.el7", "1:0.27.1-2.el7"));
//        assertEquals(-1 , OperationAnalyzer.rpmvercmp("2.6.5-86.el7", "2.7.5-86.el7"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("1.0~rc1^git1", "1.0~rc1"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("1.0^git1", "1.0^git1~pre"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("2~", "2~~"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("5.5p10", "5.5p1"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("10.1xyz", "10xyz"));
    }

    @Test
    public void rpmvercmp2()
    {
//        assertEquals(-1 , OperationAnalyzer.rpmvercmp("xyz.4", "8"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("1.0aa", "1.0a"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("10.0039", "10.0001"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("10b2", "10a1"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("xyz10.1", "xyz10"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("11.2.5", "11.2"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("11.2.a", "11.2"));
//        assertEquals(-1 , OperationAnalyzer.rpmvercmp("1b.fc17", "1.fc17"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("1.fc17", "1b.fc17"));
//        assertEquals(0 , OperationAnalyzer.rpmvercmp("1b.fc17", "1b.fc17"));
//        assertEquals(-1 , OperationAnalyzer.rpmvercmp("1g.fc17", "1.fc17"));
//        assertEquals(1 , OperationAnalyzer.rpmvercmp("1.fc17", "1g.fc17"));
//        assertEquals(-1 , OperationAnalyzer.rpmvercmp("1.0~rc1", "1.0~rc2"));
    }

    @Test
    public void applyOperationEvrString()
    {
        try
        {
            {
                ResultEnumeration result = OperationAnalyzer.applyOperationEvrString(OperationEnumeration.LESS_THAN, "0:1.4~beta2", "1.4.8");
                assertEquals(ResultEnumeration.FALSE, result);
            }
            {
                ResultEnumeration result = OperationAnalyzer.applyOperationEvrString(OperationEnumeration.LESS_THAN, "1:1.4~beta2", "1.4.8");
                assertEquals(ResultEnumeration.TRUE, result);
            }
            {
                ResultEnumeration result = OperationAnalyzer.applyOperationEvrString(OperationEnumeration.LESS_THAN_OR_EQUAL,
                        "0:1.4.8", "1.4.8");
                assertEquals(ResultEnumeration.TRUE, result);
            }
            {
                ResultEnumeration result = OperationAnalyzer.applyOperationEvrString(OperationEnumeration.LESS_THAN_OR_EQUAL,
                        "0:1.4.8", "1.4.8~beta");
                assertEquals(ResultEnumeration.TRUE, result);
            }
            {
                ResultEnumeration result = OperationAnalyzer.applyOperationEvrString(OperationEnumeration.GREATER_THAN, "0:1.4~beta2", "1.4.8");
                assertEquals(ResultEnumeration.TRUE, result);
            }
            {
                ResultEnumeration result = OperationAnalyzer.applyOperationEvrString(OperationEnumeration.GREATER_THAN, "1:1.4~beta2", "1.4.8");
                assertEquals(ResultEnumeration.FALSE, result);
            }
            {
                ResultEnumeration result = OperationAnalyzer.applyOperationEvrString(OperationEnumeration.GREATER_THAN_OR_EQUAL, "0:1.4~beta2", "0:1.4~beta2");
                assertEquals(ResultEnumeration.TRUE, result);
            }
            {
                ResultEnumeration result = OperationAnalyzer.applyOperationEvrString(OperationEnumeration.GREATER_THAN_OR_EQUAL, "1:1.4~beta2", "1.5.7");
                assertEquals(ResultEnumeration.FALSE, result);
            }
            {
                ResultEnumeration result = OperationAnalyzer.applyOperationEvrString(OperationEnumeration.EQUALS, "2.7.5-86.el7", "2.7.5-86.el7");
                assertEquals(ResultEnumeration.TRUE, result);
            }
            {
                ResultEnumeration result = OperationAnalyzer.applyOperationEvrString(OperationEnumeration.EQUALS, "2.6.5-86.el7", "2.7.5-86.el7");
                assertEquals(ResultEnumeration.FALSE, result);
            }
            {
                ResultEnumeration result = OperationAnalyzer.applyOperationEvrString(OperationEnumeration.NOT_EQUAL, "2.7.5-86.el7", "2.7.5-86.el7");
                assertEquals(ResultEnumeration.FALSE, result);
            }
            {
                ResultEnumeration result = OperationAnalyzer.applyOperationEvrString(OperationEnumeration.NOT_EQUAL, "2.6.5-86.el7", "2.7.5-86.el7");
                assertEquals(ResultEnumeration.TRUE, result);
            }
//            {
//                ResultEnumeration result = OperationAnalyzer.applyOperationEvrString(OperationEnumeration.GREATER_THAN, "1g.fc17", "1.fc17");
//                assertEquals(ResultEnumeration.TRUE, result);
//            }

        } catch (UnexpectedOVALEvaluationError unexpectedOVALEvaluationError)
        {
            unexpectedOVALEvaluationError.printStackTrace();
        }
    }

    /**
     * Tests for applyOperationInt method.
     *
     * @throws com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError
     */
    @Test
    public void applyOperationIntTestBitwiseAnd_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationInt(OperationEnumeration.BITWISE_AND, 13, 9);
        assertEquals(ResultEnumeration.FALSE, result);
    }

    @Test
    public void applyOperationIntTestBitwiseAnd_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationInt(OperationEnumeration.BITWISE_AND, 9, 13);
        assertEquals(ResultEnumeration.TRUE, result);
    }

    @Test
    public void applyOperationIntTestBitwiseOr_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationInt(OperationEnumeration.BITWISE_OR, 30, 10);
        assertEquals(ResultEnumeration.TRUE, result);
    }

    @Test
    public void applyOperationIntTestBitwiseOr_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationInt(OperationEnumeration.BITWISE_OR, 10, 30);
        assertEquals(ResultEnumeration.FALSE, result);
    }

    @Test
    public void applyOperationIntTestEquals_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationInt(OperationEnumeration.EQUALS, 10, 10);
        assertEquals(ResultEnumeration.TRUE, result);
    }

    @Test
    public void applyOperationIntTestEquals_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationInt(OperationEnumeration.EQUALS, 10, 30);
        assertEquals(ResultEnumeration.FALSE, result);
    }

    @Test
    public void applyOperationIntTestNotEqual_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationInt(OperationEnumeration.NOT_EQUAL, 10, 30);
        assertEquals(ResultEnumeration.TRUE, result);
    }

    @Test
    public void applyOperationIntTestNotEqual_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationInt(OperationEnumeration.NOT_EQUAL, 10, 10);
        assertEquals(ResultEnumeration.FALSE, result);
    }

    @Test
    public void applyOperationIntTestGreaterThan_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationInt(OperationEnumeration.GREATER_THAN, 10, 15);
        assertEquals(ResultEnumeration.TRUE, result);
    }

    @Test
    public void applyOperationIntTestGreaterThan_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationInt(OperationEnumeration.GREATER_THAN, 10, 5);
        assertEquals(ResultEnumeration.FALSE, result);
    }

    @Test
    public void applyOperationIntTestGreaterThanOrEqual_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationInt(OperationEnumeration.GREATER_THAN_OR_EQUAL, 10, 15);
        assertEquals(ResultEnumeration.TRUE, result);
        ResultEnumeration result2 = OperationAnalyzer.applyOperationInt(OperationEnumeration.GREATER_THAN_OR_EQUAL, 10, 10);
        assertEquals(ResultEnumeration.TRUE, result2);
    }

    @Test
    public void applyOperationIntTestGreaterThanOrEqual_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationInt(OperationEnumeration.GREATER_THAN_OR_EQUAL, 10, 5);
        assertEquals(ResultEnumeration.FALSE, result);
    }

    @Test
    public void applyOperationIntTestLessThan_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationInt(OperationEnumeration.LESS_THAN, 20, 15);
        assertEquals(ResultEnumeration.TRUE, result);
    }

    @Test
    public void applyOperationIntTestLessThan_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationInt(OperationEnumeration.LESS_THAN, 10, 20);
        assertEquals(ResultEnumeration.FALSE, result);
    }

    @Test
    public void applyOperationIntTestLessThanOrEqual_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationInt(OperationEnumeration.LESS_THAN_OR_EQUAL, 20, 15);
        assertEquals(ResultEnumeration.TRUE, result);
        ResultEnumeration result2 = OperationAnalyzer.applyOperationInt(OperationEnumeration.LESS_THAN_OR_EQUAL, 20, 20);
        assertEquals(ResultEnumeration.TRUE, result2);
    }

    @Test
    public void applyOperationIntTestLessThanOrEqual_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationInt(OperationEnumeration.LESS_THAN_OR_EQUAL, 10, 20);
        assertEquals(ResultEnumeration.FALSE, result);
    }

    /**
     * Tests for applyOperationString method.
     *
     */
    @Test
    public void applyOperationStringTestEquals_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationString(OperationEnumeration.EQUALS, "apples", "apples");
        assertEquals(ResultEnumeration.TRUE, result);
    }

    @Test
    public void applyOperationStringTestEquals_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationString(OperationEnumeration.EQUALS, "apples", "oranges");
        assertEquals(ResultEnumeration.FALSE, result);
        ResultEnumeration result2 = OperationAnalyzer.applyOperationString(OperationEnumeration.EQUALS, "apples", "APPLES");
        assertEquals(ResultEnumeration.FALSE, result2);
    }

    @Test
    public void applyOperationStringTestNotEqual_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationString(OperationEnumeration.NOT_EQUAL, "apples", "oranges");
        assertEquals(ResultEnumeration.TRUE, result);
    }

    @Test
    public void applyOperationStringTestNotEqual_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationString(OperationEnumeration.NOT_EQUAL, "apples", "apples");
        assertEquals(ResultEnumeration.FALSE, result);
    }

    @Test
    public void applyOperationStringTestCaseInsensitiveEquals_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationString(OperationEnumeration.CASE_INSENSITIVE_EQUALS, "apples", "apples");
        assertEquals(ResultEnumeration.TRUE, result);
        ResultEnumeration result2 = OperationAnalyzer.applyOperationString(OperationEnumeration.CASE_INSENSITIVE_EQUALS, "apples", "APPLES");
        assertEquals(ResultEnumeration.TRUE, result2);
    }

    @Test
    public void applyOperationStringTestCaseInsensitiveEquals_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationString(OperationEnumeration.CASE_INSENSITIVE_EQUALS, "apples", "oranges");
        assertEquals(ResultEnumeration.FALSE, result);
    }

    @Test
    public void applyOperationStringTestCaseInsensitiveNotEqual_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationString(OperationEnumeration.CASE_INSENSITIVE_NOT_EQUAL, "apples", "apples");
        assertEquals(ResultEnumeration.FALSE, result);
        ResultEnumeration result2 = OperationAnalyzer.applyOperationString(OperationEnumeration.CASE_INSENSITIVE_NOT_EQUAL, "apples", "APPLES");
        assertEquals(ResultEnumeration.FALSE, result2);
    }

    @Test
    public void applyOperationStringTestCaseInsensitiveNotEqual_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationString(OperationEnumeration.CASE_INSENSITIVE_NOT_EQUAL, "apples", "oranges");
        assertEquals(ResultEnumeration.TRUE, result);
    }

    @Test
    public void applyOperationStringTestPatternMatch_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationString(OperationEnumeration.PATTERN_MATCH, "apples", "aapples");
        assertEquals(ResultEnumeration.TRUE, result);
    }

    @Test
    public void applyOperationStringTestPatternMatch_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationString(OperationEnumeration.PATTERN_MATCH, "apples", "oranges");
        assertEquals(ResultEnumeration.FALSE, result);
    }

    /**
     * Tests for applyOperationBinary method.
     *
     */
    @Test
    public void applyOperationBinaryTestEquals_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationBinary(OperationEnumeration.EQUALS, "8f", "8f");
        assertEquals(ResultEnumeration.TRUE, result);
        ResultEnumeration result2 = OperationAnalyzer.applyOperationBinary(OperationEnumeration.EQUALS, "f3", "f3");
        assertEquals(ResultEnumeration.TRUE, result2);
    }

    @Test
    public void applyOperationBinaryTestEquals_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationBinary(OperationEnumeration.EQUALS, "5f", "ff");
        assertEquals(ResultEnumeration.FALSE, result);
    }

    @Test
    public void applyOperationBinaryTestNotEqual_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationBinary(OperationEnumeration.NOT_EQUAL, "5c", "8f");
        assertEquals(ResultEnumeration.TRUE, result);
    }

    @Test
    public void applyOperationBinaryTestNotEqual_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationBinary(OperationEnumeration.NOT_EQUAL, "4a", "4a");
        assertEquals(ResultEnumeration.FALSE, result);
    }

    /**
     * Tests for applyOperationBoolean method.
     *
     */
    @Test
    public void applyOperationBooleanTestEquals_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationBoolean(OperationEnumeration.EQUALS, "true", "1");
        assertEquals(ResultEnumeration.TRUE, result);
    }

    @Test
    public void applyOperationBooleanTestEquals_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationBoolean(OperationEnumeration.EQUALS, "true", Boolean.FALSE);
        assertEquals(ResultEnumeration.FALSE, result);
    }

    @Test
    public void applyOperationBooleanTestNotEqual_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationBoolean(OperationEnumeration.NOT_EQUAL, "true", Boolean.FALSE);
        assertEquals(ResultEnumeration.TRUE, result);
    }

    @Test
    public void applyOperationBooleanTestNotEqual_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationBoolean(OperationEnumeration.NOT_EQUAL, Boolean.TRUE, "1");
        assertEquals(ResultEnumeration.FALSE, result);
    }

    /**
     * Tests for applyOperationFloat method.
     *
     */
    @Test
    public void applyOperationFloatTestEquals_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationFloat(OperationEnumeration.EQUALS, 10.00, 10.0);
        assertEquals(ResultEnumeration.TRUE, result);
    }

    @Test
    public void applyOperationFloatTestEquals_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationFloat(OperationEnumeration.EQUALS, 10.01, 10.000);
        assertEquals(ResultEnumeration.FALSE, result);
    }

    @Test
    public void applyOperationFloatTestNotEqual_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationFloat(OperationEnumeration.NOT_EQUAL, 10.01, 10.000);
        assertEquals(ResultEnumeration.TRUE, result);
    }

    @Test
    public void applyOperationFloatTestNotEqual_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationFloat(OperationEnumeration.NOT_EQUAL, 10.00, 10.00000);
        assertEquals(ResultEnumeration.FALSE, result);
    }

    @Test
    public void applyOperationFloatTestGreaterThan_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationFloat(OperationEnumeration.GREATER_THAN, 10, 15);
        assertEquals(ResultEnumeration.TRUE, result);
    }

    @Test
    public void applyOperationFloatTestGreaterThan_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationFloat(OperationEnumeration.GREATER_THAN, 10, 5);
        assertEquals(ResultEnumeration.FALSE, result);
    }

    @Test
    public void applyOperationFloatTestGreaterThanOrEqual_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationFloat(OperationEnumeration.GREATER_THAN_OR_EQUAL, 10, 15);
        assertEquals(ResultEnumeration.TRUE, result);
        ResultEnumeration result2 = OperationAnalyzer.applyOperationFloat(OperationEnumeration.GREATER_THAN_OR_EQUAL, 10, 10);
        assertEquals(ResultEnumeration.TRUE, result2);
    }

    @Test
    public void applyOperationFloatTestGreaterThanOrEqual_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationFloat(OperationEnumeration.GREATER_THAN_OR_EQUAL, 10, 5);
        assertEquals(ResultEnumeration.FALSE, result);
    }

    @Test
    public void applyOperationFloatTestLessThan_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationFloat(OperationEnumeration.LESS_THAN, 20, 15);
        assertEquals(ResultEnumeration.TRUE, result);
    }

    @Test
    public void applyOperationFloatTestLessThan_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationFloat(OperationEnumeration.LESS_THAN, 10, 20);
        assertEquals(ResultEnumeration.FALSE, result);
    }

    @Test
    public void applyOperationFloatTestLessThanOrEqual_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationFloat(OperationEnumeration.LESS_THAN_OR_EQUAL, 20, 15);
        assertEquals(ResultEnumeration.TRUE, result);
        ResultEnumeration result2 = OperationAnalyzer.applyOperationFloat(OperationEnumeration.LESS_THAN_OR_EQUAL, 20, 20);
        assertEquals(ResultEnumeration.TRUE, result2);
    }

    @Test
    public void applyOperationFloatTestLessThanOrEqual_False() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationFloat(OperationEnumeration.LESS_THAN_OR_EQUAL, 10, 20);
        assertEquals(ResultEnumeration.FALSE, result);
    }

    /**
     * Tests for applyOperationVersion method.
     *
     */
    
    @Test
    public void applyOperationVersionTestGreaterThan() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationVersion(OperationEnumeration.GREATER_THAN, "1.2.3.4", "6.7.8");
        assertEquals(ResultEnumeration.TRUE, result);
        ResultEnumeration result2 = OperationAnalyzer.applyOperationVersion(OperationEnumeration.GREATER_THAN, "1.2.3", "6-7-8");
        assertEquals(ResultEnumeration.TRUE, result2);
        ResultEnumeration result3 = OperationAnalyzer.applyOperationVersion(OperationEnumeration.GREATER_THAN, "1.2.3", "1.1.1");
        assertEquals(ResultEnumeration.FALSE, result3);
    }

    @Test
    public void applyOperationVersionTestEquals_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationVersion(OperationEnumeration.EQUALS, "1.2.3.0", "1.2.3");
        assertEquals(ResultEnumeration.TRUE, result);
        ResultEnumeration result2 = OperationAnalyzer.applyOperationVersion(OperationEnumeration.EQUALS, "1.2.3", "1-2-3");
        assertEquals(ResultEnumeration.TRUE, result2);
        ResultEnumeration result3 = OperationAnalyzer.applyOperationVersion(OperationEnumeration.EQUALS, "1a2a3", "1-2-3");
        assertEquals(ResultEnumeration.TRUE, result3);

    }
    
    @Test
    public void applyOperationVersionTestNotEqual_True() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationVersion(OperationEnumeration.NOT_EQUAL, "1.2", "1.2.3");
        assertEquals(ResultEnumeration.TRUE, result);
        ResultEnumeration result2 = OperationAnalyzer.applyOperationVersion(OperationEnumeration.NOT_EQUAL, "1.2.3", "12-3");
        assertEquals(ResultEnumeration.TRUE, result2);
        ResultEnumeration result3 = OperationAnalyzer.applyOperationVersion(OperationEnumeration.NOT_EQUAL, "1a23", "1-2-3");
        assertEquals(ResultEnumeration.TRUE, result3);

    }
    
    @Test
    public void applyOperationVersionTestLessThan() throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = OperationAnalyzer.applyOperationVersion(OperationEnumeration.LESS_THAN, "1.2.3.4", "6.7.8");
        assertEquals(ResultEnumeration.FALSE, result);
        ResultEnumeration result2 = OperationAnalyzer.applyOperationVersion(OperationEnumeration.LESS_THAN, "1.2.3", "6-7-8");
        assertEquals(ResultEnumeration.FALSE, result2);
        ResultEnumeration result3 = OperationAnalyzer.applyOperationVersion(OperationEnumeration.LESS_THAN, "1.2.3", "1.1.1");
        assertEquals(ResultEnumeration.TRUE, result3);
    }
    /**
     * Tests for enumerationVersionCompare method.
     *
     */
    @Test
    public void enumerationVersionCompareTest()
    {
        assertEquals(0, OperationAnalyzer.enumerationVersionCompare("2.0.1", "2.0.1"));
        assertEquals(1, OperationAnalyzer.enumerationVersionCompare("2.11", "2.0.1"));
        assertEquals(-1, OperationAnalyzer.enumerationVersionCompare("2.0.0", "2.0.1"));
        assertEquals(0, OperationAnalyzer.enumerationVersionCompare("2a0a1", "2.0.1"));
        assertEquals(0, OperationAnalyzer.enumerationVersionCompare("1.2.0.0", "1.2"));
        assertEquals(1, OperationAnalyzer.enumerationVersionCompare("1.2.5.5", "1.2.5."));
        assertEquals(0, OperationAnalyzer.enumerationVersionCompare("1.2.51", "1.2.51."));
        assertEquals(0, OperationAnalyzer.enumerationVersionCompare("1.2..5", "1.2.5."));
    }
    
    @Test
    public void debianVersiontester()
    {
        assertEquals(0, OperationAnalyzer.dpkgVerCmp("1.2", "1.2"));
        assertEquals(1, OperationAnalyzer.dpkgVerCmp("1.3", "1.2"));
        assertEquals(-1, OperationAnalyzer.dpkgVerCmp("1.2", "1.3"));
        assertEquals(1, OperationAnalyzer.dpkgVerCmp("a", "1"));
        assertEquals(-1, OperationAnalyzer.dpkgVerCmp("1", "a"));
        assertEquals(0, OperationAnalyzer.dpkgVerCmp("1.60+git20180626.aebd88e", "1.60+git20180626.aebd88e"));
        assertEquals(1, OperationAnalyzer.dpkgVerCmp("1.60+git20180626.aebd88e", "1.60+git20161116.90da8a0"));
        assertEquals(0, OperationAnalyzer.dpkgVerCmp("1.8.2.1", "1.8.2.1"));
        assertEquals(1, OperationAnalyzer.dpkgVerCmp("1.8.2.1", "1.8.2"));
        assertEquals(-1, OperationAnalyzer.dpkgVerCmp("1.8.2", "1.8.2.1"));
        assertEquals(1, OperationAnalyzer.dpkgVerCmp("1.0.6-9.2~deb10u1", "1.0.6-8.1"));
        assertEquals(-1, OperationAnalyzer.dpkgVerCmp("1.0.6-9.2~deb10u1", "1.0.6-9.2"));
        assertEquals(1, OperationAnalyzer.dpkgVerCmp("3:20161105-1", "3:20121221-5+b2"));
        assertEquals(-1, OperationAnalyzer.dpkgVerCmp("3:20121221-5+b2", "3:20161105-1"));
        assertEquals(1, OperationAnalyzer.dpkgVerCmp("4:20161105-1", "3:20121221-5+b2"));
        assertEquals(0, OperationAnalyzer.dpkgVerCmp("0:abc", "abc"));   
    }

}
