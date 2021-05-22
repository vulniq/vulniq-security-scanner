
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

package com.vulniq.client.securityanalyzer.datacollection.windows;

import com.vulniq.client.securityanalyzer.TerziTestSetup;
import com.vulniq.client.securityanalyzer.TerziTestUtilizingDocker;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.InstalledSoftware;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class WindowsInstalledSoftwareCollectorTest extends TerziTestUtilizingDocker
{
    @Before
    public void setUp()
    {
        //Run these tests only on windows
        Assume.assumeTrue(TerziTestSetup.isOnWindows());
    }

    @Test
    public void testCollectSoftwareOnHost()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Host, "host");
        WindowsInstalledSoftwareCollector collector = new WindowsInstalledSoftwareCollector();
        List<InstalledSoftware> installedPrograms = collector.collectSoftware(target);
    
        for (InstalledSoftware installedProgram : installedPrograms)
        {
            Assert.assertNotNull(installedProgram.getName());
        }
    }
    
    @Test
    public void testCollectSoftwareOnDocker()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-windows");
        WindowsInstalledSoftwareCollector collector = new WindowsInstalledSoftwareCollector();
        List<InstalledSoftware> installedPrograms = collector.collectSoftware(target);
        
        for (InstalledSoftware installedProgram : installedPrograms)
        {
            Assert.assertNotNull(installedProgram.getName());
        }
    }

}