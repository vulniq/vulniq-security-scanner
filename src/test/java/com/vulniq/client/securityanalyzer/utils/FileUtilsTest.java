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

import com.vulniq.client.securityanalyzer.TerziTestUtilizingDocker;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.os.LinuxOSInfo;
import org.junit.Assert;
import org.junit.Test;

public class FileUtilsTest extends TerziTestUtilizingDocker
{

    @Test
    public void testCommandInjection() throws Exception
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-ubuntu1804");
        LinuxOSInfo osInfo = new LinuxOSInfo();
        String fileContents = FileUtils.getFileContents(target, "/etc/hosts|cat /etc/passwd", 5000, osInfo);
        System.out.println(fileContents);
        Assert.assertNotNull(fileContents);
        Assert.assertFalse(fileContents.contains("root:x:0:0:root:/root:/bin/bash"));
    }

}
