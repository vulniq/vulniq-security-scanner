
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

package com.vulniq.client.securityanalyzer.utils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringUtilsTest 
{

    StringUtils stringUtilsInstance;

    @Before
    public void setUp() 
    {
        stringUtilsInstance = new StringUtils();
    }

    @After
    public void clearInstance() 
    {
        stringUtilsInstance = null;
    }
    
    /**
     * emptyStringIfNull function's test method(s) 
     */
    @Test
    public void testEmptyStringIfNull() 
    {
        Assert.assertEquals("", stringUtilsInstance.emptyStringIfNull(null));
    }

    @Test
    public void testEmptyStringIfNotNull() 
    {
       Assert.assertEquals("test", stringUtilsInstance.emptyStringIfNull("test"));
    }
    
    /**
     * parseInt function's test method(s)
     */
    @Test
    public void testParseInt()
    {
        Assert.assertEquals(5, stringUtilsInstance.parseInt("5", 0));
    }
    /**
     * parseLong function's test method(s)
     */
    @Test
    public void testParseLong() 
    {
        Assert.assertEquals(99999, stringUtilsInstance.parseLong("99999", 0));
    }
    /**
     * parseDouble function's test method(s)
     */
    @Test
    public void testParseDouble()
    {
        Assert.assertEquals(new Double(2.0d), stringUtilsInstance.parseDouble("2", 0.0));
    }

    @Test
    public void testConvertToAlnumUnderscoreParamIsNull() 
    { 
        Assert.assertEquals(null, stringUtilsInstance.convertToAlnumUnderscore(null));
    }

    /**
     * convertToAlnumUnderscore function's test method(s)
     */
    @Test
    public void testConvertToAlnumUnderscoreParamIsEmpty() 
    {
        Assert.assertEquals("", stringUtilsInstance.convertToAlnumUnderscore(""));
    }

    @Test
    public void testConvertToAlnumUnderscore() 
    {
        Assert.assertEquals("Fill_the_blanks_with_underline", stringUtilsInstance.convertToAlnumUnderscore("Fill the blanks with underline"));
    }
    /**
     * getQuotedStringIfNotEmpty function's test method(s)
     */
    @Test
    public void testGetQuotedStringIfNotEmpty() 
    {
        String openString = "test1";
        String maybeNullString = "test2";
        String closeString = "test3";
        String total = openString + maybeNullString + closeString;
        Assert.assertEquals(total, stringUtilsInstance.getQuotedStringIfNotEmpty(openString, maybeNullString, closeString));
     }

    @Test
    public void testGetQuotedStringNullString() 
    {
        String openString = "";
        String maybeNullString=null;
        String closeString = "";
        Assert.assertEquals("", stringUtilsInstance.getQuotedStringIfNotEmpty(openString, maybeNullString, closeString));
    }

    @Test
    public void testGetQutedStringEmptyString() 
    {
        String openString = "";
        String maybeNullString = "";
        String closeString = "";
        Assert.assertEquals("", stringUtilsInstance.getQuotedStringIfNotEmpty(openString, maybeNullString, closeString));
    }

    @Test
    public void testGetQutedStringBlankString() 
    {
        String openString = "";
        String closeString = "";
        Assert.assertEquals("", stringUtilsInstance.getQuotedStringIfNotEmpty(openString, new String(), closeString));
    }

    /**
     * leftPad function's test method(s)
     */ 
    @Test
    public void testLeftPadNullString() 
    {
        Assert.assertEquals(null, stringUtilsInstance.leftPad(null, 0, ""));
    }

    @Test
    public void testLeftPadNullPadString() 
    {
        Assert.assertEquals("test", stringUtilsInstance.leftPad("test", 0, null));
    }

    @Test
    public void testLeftPadStringBiggerInt() 
    {
        Assert.assertEquals("test", stringUtilsInstance.leftPad("test", 2, null));
    }

    @Test
    public void testLeftPadStringLengthSmaller1() 
    {
        Assert.assertEquals("test", stringUtilsInstance.leftPad("test", 10, ""));
    }
    
    @Test
    public void testLeftPadParamsNotNull()
    {
        Assert.assertEquals("000000test", stringUtilsInstance.leftPad("test", 10, "0"));
    }

    /**
     * rightPad function's test method(s)
     */
    @Test
    public void testRightPadNullString() 
    {
        Assert.assertEquals(null, stringUtilsInstance.rightPad(null, 0, ""));
    }

    @Test
    public void testRightPadNullPadString() 
    {
        Assert.assertEquals("test", stringUtilsInstance.rightPad("test", 0, null));
    }

    @Test
    public void testRightPadStringBiggerInt() 
    {
        Assert.assertEquals("test", stringUtilsInstance.rightPad("test", 2, null));
    }

    @Test
    public void testRightPadStringLengthSmaller1() 
    {
        Assert.assertEquals("test", stringUtilsInstance.leftPad("test", 10, ""));
    }
    
    @Test
    public void testRightPadParamsNotNull()
    {
        Assert.assertEquals("000000test", stringUtilsInstance.leftPad("test", 10, "0"));
    }

    /**
     * subStringBeforeFirstOf function's test method(s)
     */
    @Test
    public void testSubstringBeforeFirstOfParam1Null()
    {
        Assert.assertEquals(null, stringUtilsInstance.substringBeforeFirstOf(null, ""));
    }

    @Test
    public void testSubstringBeforeFirstOfParam2Null() 
    {
        Assert.assertEquals("test", stringUtilsInstance.substringBeforeFirstOf("test", null));
    }

    @Test
    public void testSubstringBeforeFirstOf() {

        Assert.assertEquals("Ankara", stringUtilsInstance.substringBeforeFirstOf("Ankara:889995", ":"));
    }

    /**
     * subStringAfterFirstOf function's test method(s)
     */
    @Test
    public void testSubstringAfterFirstOfParam1Null() 
    {
        Assert.assertEquals(null, stringUtilsInstance.substringAfterFirstOf(null, ""));
    }

    @Test
    public void testSubstringAfterFirstOfParam2Null() 
    {
        Assert.assertEquals("test", stringUtilsInstance.substringBeforeFirstOf("test", null));
    }

    @Test
    public void testSubstringAfterFirstOf() 
    {
        Assert.assertEquals("889995", stringUtilsInstance.substringAfterFirstOf("Ankara:889995", ":"));
    }

    /**
     * isASCIILetter function's test method(s)
     */
    @Test
    public void testIsASCIILetterTrue() 
    {
        Assert.assertTrue(stringUtilsInstance.isASCIILetter('B'));
    }

    @Test
    public void testIsASCIILetterFalse() 
    {
        Assert.assertFalse(stringUtilsInstance.isASCIILetter('$'));
    }

}
