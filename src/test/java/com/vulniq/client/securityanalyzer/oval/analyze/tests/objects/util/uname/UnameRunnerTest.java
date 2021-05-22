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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.util.uname;

import com.vulniq.client.securityanalyzer.TerziTestUtilizingDocker;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.unix.UnameProperties;
import com.vulniq.client.securityanalyzer.datacollection.unix.UnameRunner;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UnameRunnerTest extends TerziTestUtilizingDocker
{

    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    public void runUname()
    {
        DataCollectionTarget hostOSTarget = new DataCollectionTarget(DataCollectionTargetType.Host, null);
        List<OSCommandOutput> unameOutputList = UnameRunner.runUname(hostOSTarget, 20000);

        for (OSCommandOutput unameOutputIndex : unameOutputList)
        {
            System.out.println(unameOutputIndex.getStdOut());
            assertNotNull(unameOutputIndex.getStdOut());
        }
    }

    @Test
    public void convertCommandOutputsToUnameProperties()
    {
        DataCollectionTarget hostOSTarget = new DataCollectionTarget(DataCollectionTargetType.Host, null);
        List<OSCommandOutput> unameOutputList = UnameRunner.runUname(hostOSTarget, 20000);
        UnameProperties unameProperties = UnameRunner.convertCommandOutputsToUnameProperties(unameOutputList);

        assertNotNull(unameProperties);
    }

}