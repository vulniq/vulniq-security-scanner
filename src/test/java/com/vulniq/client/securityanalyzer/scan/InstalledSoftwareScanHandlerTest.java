

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

package com.vulniq.client.securityanalyzer.scan;

import com.vulniq.client.securityanalyzer.TerziTestUtilizingDocker;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.InstalledSoftware;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.main.TerziOutputWriter;
import org.junit.Before;
import org.junit.Test;

public class InstalledSoftwareScanHandlerTest extends TerziTestUtilizingDocker
{

    @Before
    public void setUp()
    {
    }

    //TODO add RHEL and other versions
    @Test
    public void runDebian()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-debian10");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        TerziOutputWriter outputWriter = new TerziOutputWriter(true, false);
        SecurityScanner scanner = new SecurityScanner(target, osInfo, 1, false, outputWriter);
        InstalledSoftware installedSoftware = new InstalledSoftware();
        installedSoftware.setName("apache2");
        installedSoftware.setVersion("2.4.25-3+deb");
        InstalledSoftwareScanHandler scanHandler = new InstalledSoftwareScanHandler(scanner, "unit-test", installedSoftware, osInfo, target);
        scanHandler.run();
    }

    @Test
    public void runRhel7()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-rhel7");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        TerziOutputWriter outputWriter = new TerziOutputWriter(true, false);
        SecurityScanner scanner = new SecurityScanner(target, osInfo, 1, false, outputWriter);
        InstalledSoftware installedSoftware = new InstalledSoftware();
        installedSoftware.setName("jenkins-plugin-workflow-api");
        installedSoftware.setVersion("0:2.10-10.el7");
        InstalledSoftwareScanHandler scanHandler = new InstalledSoftwareScanHandler(scanner, "unit-test", installedSoftware, osInfo, target);
        scanHandler.run();
    }
}