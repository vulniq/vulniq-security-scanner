
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

public class EncodeDecodeTest 
{

    EncodeDecode encodeDecodeInstance;

    @Before
    public void setUp() 
    {
        encodeDecodeInstance = new EncodeDecode();
    }

    @After
    public void clearInstance() 
    {
        encodeDecodeInstance = null;
    }

    @Test
    public void testEncodeDecode() 
    {
        String test = "https://www.facebook.com.tr";
        Assert.assertEquals("https%3A%2F%2Fwww.facebook.com.tr", encodeDecodeInstance.urlEncode(test));
    }
    
    @Test
    public void testUrlIsEmpty() 
    {
        Assert.assertEquals("", encodeDecodeInstance.urlEncode(null));
    }

}
