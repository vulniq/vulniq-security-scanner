

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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vulniq.client.securityanalyzer.TerziTestSetup;
import com.vulniq.client.securityanalyzer.TerziTestUtilizingDocker;
import com.vulniq.client.securityanalyzer.datacollection.os.LinuxOSInfo;
import com.vulniq.client.securityanalyzer.datacollection.os.MacOSInfo;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class OSInfoCollectorTest extends TerziTestUtilizingDocker
{

    @Test
    public void getOSInfo()
    {
    }

    @Test
    public void getOSInfoFromHost()
    {
        if(TerziTestSetup.isOnMac())
        {
            DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Host, "host");
            OSInfo osInfo = OSInfoCollector.getOSInfoFromHost();
            assertNotNull(osInfo);
            assertTrue(osInfo instanceof MacOSInfo);
        }
        if(TerziTestSetup.isOnLinux())
        {
            DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Host, "host");
            OSInfo osInfo = OSInfoCollector.getOSInfoFromHost();
            assertNotNull(osInfo);
            assertTrue(osInfo instanceof LinuxOSInfo);
        }
    }

    @Test
    public void getOSInfoFromDocker()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-debian10");
        OSInfo osInfo = OSInfoCollector.getOSInfoFromDocker(target);
        assertNotNull(osInfo);
        assertTrue(osInfo instanceof LinuxOSInfo);
        System.out.println(StringUtils.toJson(osInfo, true));
    }

}