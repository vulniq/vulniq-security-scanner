
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vulniq.client.securityanalyzer.TerziTestBase;
import com.vulniq.client.securityanalyzer.TerziTestSetup;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.DefinitionType;

import static org.junit.Assert.*;

public class OVALXMLLoaderTest extends TerziTestBase
{

    @Test
    public void getOVALXml()
    {
        //oval:org.cisecurity:def:5872
        OVALXMLLoader ovalxmlLoader = new OVALXMLLoader();
        String xml = ovalxmlLoader.getOVALXml("cisoval", "oval:org.cisecurity:tst:9465", null, null);
        System.out.println(xml);
        assertNotNull(xml);
    }

    @Test
    public void loadDefinition()
    {
        String ovalId = "oval:org.debian:def:20190211";
        DefinitionType definitionType = OVALXMLLoader.loadDefinition("debian-oval", ovalId, "buster", null);
        assertNotNull(definitionType);
    }
}