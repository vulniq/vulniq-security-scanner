
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

package com.vulniq.client.securityanalyzer.oval.functions;

import com.vulniq.client.securityanalyzer.TerziTestBase;
import com.vulniq.client.securityanalyzer.TerziTestSetup;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 *
 */
public class GlobToRegexFunctionEvaluatorTest extends TerziTestBase
{
    @Before
    public void setUp()
    {
    }

    /**
     * Test of convertGlobToRegex method, of class GlobToRegexFunctionEvaluator.
     */
    @Test
    public void testConvertGLobToRegex()
    {
        GlobToRegexFunctionEvaluator instance = new GlobToRegexFunctionEvaluator(null, null);
        {
            String pattern = "\\[hello\\]";
            boolean noEscape = false;
            String expected = "^\\[hello\\]$";
            String result = instance.convertGlobToRegex(pattern, noEscape);
            Assert.assertEquals(expected, result);
        }
        {
            String pattern = "\\[hello\\]";
            boolean noEscape = true;
            String expected = "^\\\\[hello\\\\]$";
            String result = instance.convertGlobToRegex(pattern, noEscape);
            Assert.assertEquals(expected, result);
        }
        {
            String pattern = "\\*";
            boolean noEscape = false;
            String expected = "^\\*$";
            String result = instance.convertGlobToRegex(pattern, noEscape);
            Assert.assertEquals(expected, result);
        }
        {
            String pattern = "\\*";
            boolean noEscape = true;
            String expected = "^\\\\[^/]*$";
            String result = instance.convertGlobToRegex(pattern, noEscape);
            Assert.assertEquals(expected, result);
        }
        {
            String pattern = "*.*";
            String expResult = "^(?=[^.])[^/]*\\.[^/]*$";
            boolean glob = true;
            String result = instance.convertGlobToRegex(pattern, glob);
            Assert.assertEquals(expResult, result);

        }
        {
            String pattern = "x[[:digit:]]\\*";
            String expResult = "^x[[:digit:]]\\\\[^/]*$";
            boolean glob = true;
            String result = instance.convertGlobToRegex(pattern, glob);
            Assert.assertEquals(expResult, result);
        }

        {
            String pattern = "/root/.*";
            String expResult = "^/root/\\.[^/]*$";
            boolean glob = false;
            String result = instance.convertGlobToRegex(pattern, glob);
            Assert.assertEquals(expResult, result);
        }
        {
            String pattern = "'/root/.*'";
            String expResult = "^/root/\\.[^/]*$";
            boolean glob = false;
            String result = instance.convertGlobToRegex(pattern, glob);
            Assert.assertEquals(expResult, result);
        }
        {
            String pattern = "'\\*'";
            boolean noEscape = true;
            String expected = "^\\\\[^/]*$";
            String result = instance.convertGlobToRegex(pattern, noEscape);
            Assert.assertEquals(expected, result);
        }

    }

}
