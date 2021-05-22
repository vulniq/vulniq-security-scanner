
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

package com.vulniq.client.securityanalyzer.http;

import com.vulniq.client.securityanalyzer.TerziTestBase;
import com.vulniq.client.securityanalyzer.datacollection.InstalledSoftware;
import com.vulniq.client.securityanalyzer.datacollection.os.WindowsOSInfo;
import com.vulniq.client.securityanalyzer.vulniqapi.VulnIQAPIClient;
import com.vulniq.client.securityanalyzer.vulniqapi.VulnIQVulnerabilityData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class VulnIQAPIClientTest extends TerziTestBase
{

    @Before
    public void setUp() throws Exception
    {
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void getVulnerabilitiesAffectingSoftwareWindows()
    {
        WindowsOSInfo osInfo = new WindowsOSInfo();
        osInfo.setOsName("Microsoft Windows Server 2016 Standard Evaluation");
        osInfo.setVersionLongName("10.0.14393 N/A Build 14393");
        InstalledSoftware software = new InstalledSoftware();
        software.setName("Google Chrome");
        software.setVersion("80.0.4430.1");
        software.setVendor("Google LLC");
        List<VulnIQVulnerabilityData> vulns = VulnIQAPIClient.getVulnerabilitiesAffectingSoftware(osInfo, software);
        for(VulnIQVulnerabilityData v : vulns)
        {
            System.out.println(v);
        }
    }
}