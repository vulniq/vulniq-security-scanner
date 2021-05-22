

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

package com.vulniq.client.securityanalyzer.datacollection.host;

import com.vulniq.client.securityanalyzer.TerziTestBase;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.os.LinuxOSInfo;
import com.vulniq.client.securityanalyzer.datacollection.os.MacOSInfo;
import org.apache.commons.lang3.SystemUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class HostInfoCollectorTest extends TerziTestBase
{

    @Test
    public void getHostOSInfo()
    {
        if(SystemUtils.IS_OS_MAC)
        {
            OSInfo osInfo = HostInfoCollector.getHostOSInfo();
            assertTrue(osInfo instanceof MacOSInfo);
        }
        if(SystemUtils.IS_OS_LINUX)
        {
            OSInfo osInfo = HostInfoCollector.getHostOSInfo();
            assertTrue(osInfo instanceof LinuxOSInfo);
        }
    }
}