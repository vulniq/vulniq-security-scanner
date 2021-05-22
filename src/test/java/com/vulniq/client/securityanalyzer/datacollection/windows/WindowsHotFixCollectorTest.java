
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
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class WindowsHotFixCollectorTest extends TerziTestUtilizingDocker
{

    @Before
    public void setUp()
    {
        //Run these tests only on windows
        Assume.assumeTrue(TerziTestSetup.isOnWindows());
    }

    @Test
    public void testCollectHotfixesOnHost()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Host, "host");
        WindowsHotFixCollector collector = new WindowsHotFixCollector();
        List<WindowsHotFix> installedHotFixes = collector.collectHotfixes(target);
    
        for (WindowsHotFix installedHotFix : installedHotFixes)
        {
            Assert.assertNotNull(installedHotFix.getInstalledOn());
            Assert.assertNotNull(installedHotFix.getHotFixId());
        }
        
    }
    
    
    @Test
    public void testCollectHotfixesOnDocker()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-windows");
        WindowsHotFixCollector collector = new WindowsHotFixCollector();
        List<WindowsHotFix> installedHotFixes = collector.collectHotfixes(target);
        for (WindowsHotFix installedHotFix : installedHotFixes)
        {
            Assert.assertNotNull(installedHotFix.getInstalledOn());
            Assert.assertNotNull(installedHotFix.getHotFixId());
        }
        
    }
    
}