
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

package com.vulniq.client.securityanalyzer.datacollection;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.vulniq.client.securityanalyzer.TerziTestBase;
import com.vulniq.client.securityanalyzer.datacollection.windows.WindowsInstalledSoftware;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstalledSoftwareTest extends TerziTestBase
{

    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    public void normalizeVendorName()
    {
        assertEquals("microsoft", InstalledSoftware.normalizeVendorName("Microsoft Corporation"));
        assertEquals("adobe", InstalledSoftware.normalizeVendorName("Adobe Systems Incorporated"));
        assertEquals("mozilla", InstalledSoftware.normalizeVendorName("Mozilla"));
        assertEquals("google", InstalledSoftware.normalizeVendorName("Google LLC"));
        assertEquals("google", InstalledSoftware.normalizeVendorName("Google LLC."));
        assertEquals("google", InstalledSoftware.normalizeVendorName("Google Inc"));
        assertEquals("google", InstalledSoftware.normalizeVendorName("Google Inc."));
        assertEquals("software", InstalledSoftware.normalizeVendorName("Software Ag"));
    }

    @Test
    public void normalizeSoftwareName()
    {
        assertEquals("chrome", InstalledSoftware.normalizeSoftwareName("google", "Google Chrome", null));
        assertEquals("visual c++ 2015 additional runtime",
                InstalledSoftware.normalizeSoftwareName("microsoft", "Microsoft Visual C++ 2015 x64 Additional Runtime - 14.0.23026", "14.0.23026"));
        assertEquals("maintenance service",
                InstalledSoftware.normalizeSoftwareName("mozilla", "Mozilla Maintenance Service", "87.0"));
        assertEquals("firefox",
                InstalledSoftware.normalizeSoftwareName("mozilla", "Mozilla Firefox 87.0 (x86 en-US)", "87.0"));

        assertEquals("build of openjdk with hotspot 11.0.10+9",   //<-- not a very desirable product name
                InstalledSoftware.normalizeSoftwareName("microsoft", "Microsoft Build of OpenJDK with Hotspot 11.0.10+9 (x64) ", "11.0.10.9"));

    }

    @Test
    public void testWindowsSoftwareNormalization()
    {
        JsonObject jsonObject = new JsonParser().parse("{\n" +
                "        \"DisplayName\": \"Microsoft Visual C++ 2015 x64 Minimum Runtime - 14.0.23026\",\n" +
                "        \"Publisher\": \"Microsoft Corporation\",\n" +
                "        \"DisplayVersion\": \"14.0.23026\",\n" +
                "        \"InstallDate\": \"20210418\",\n" +
                "        \"Version\": \"14.0.23026\",\n" +
                "        \"installTime\": \"Apr 18, 2021, 12:00:00 AM\"\n" +
                "      }").getAsJsonObject();
        WindowsInstalledSoftware windowsInstalledSoftware = new WindowsInstalledSoftware(jsonObject);
        assertNotNull(windowsInstalledSoftware);
        assertEquals("microsoft", windowsInstalledSoftware.getVendor());
        assertEquals("visual c++ 2015 minimum runtime", windowsInstalledSoftware.getName());
        assertEquals("x64", windowsInstalledSoftware.getArchitecture());
    }

    @Test
    public void testWindowsSoftwareNormalization2()
    {
        JsonObject jsonObject = new JsonParser().parse("{\n" +
                "        \"DisplayName\": \"Microsoft Visual C++ 2015 Redistributable (x64) - 14.0.23026\",\n" +
                "        \"Name\": \"visual c++ 2015 redistributable - 14.0.23026\",\n" +
                "        \"DisplayVersion\": \"14.0.23026.0\",\n" +
                "        \"architecture\": \"x64\",\n" +
                "        \"Publisher\": \"microsoft\"\n" +
                "      }").getAsJsonObject();
        WindowsInstalledSoftware windowsInstalledSoftware = new WindowsInstalledSoftware(jsonObject);
        assertNotNull(windowsInstalledSoftware);
        assertEquals("microsoft", windowsInstalledSoftware.getVendor());
        assertEquals("visual c++ 2015 redistributable", windowsInstalledSoftware.getName());
        assertEquals("x64", windowsInstalledSoftware.getArchitecture());
    }
}