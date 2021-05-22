
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
import com.vulniq.client.securityanalyzer.TerziTestBase;
import com.vulniq.client.securityanalyzer.TerziTestUtilizingDocker;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.junit.Assume;
import org.junit.Test;

import javax.xml.crypto.Data;

import java.util.List;

import static org.junit.Assert.*;

public class InstalledSoftwareCollectorTest extends TerziTestUtilizingDocker
{

    @Test
    public void getInstalledSoftware()
    {
    }

    @Test
    public void getInstalledSoftwareFromDpkg()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-debian10");
        List<InstalledSoftware> installedSoftwareList = InstalledSoftwareCollector.getInstalledSoftwareFromDpkg(target);
        assertNotNull(installedSoftwareList);
    }

    @Test
    public void parseYumOutputLine1()
    {
        String line="systemd-libs.x86_64                          219-57.el7            @anaconda/7.5";
        InstalledSoftware software = InstalledSoftwareCollector.parseYumOutputLine(line, false);
        assertEquals("systemd-libs", software.getName());
        assertEquals("219-57.el7", software.getVersion());
        assertEquals("x86_64", software.getArchitecture());
    }

    @Test
    public void parseYumOutputLine2()
    {
        String line="subscription-manager-rhsm-certificates.x86_64                                             1.20.11-1.el7_5       @anaconda/7.5";
        InstalledSoftware software = InstalledSoftwareCollector.parseYumOutputLine(line, true);
        assertNotNull(software);
        assertEquals("subscription-manager-rhsm-certificates", software.getName());
        assertEquals("1.20.11-1.el7_5", software.getVersion());
        assertEquals("x86_64", software.getArchitecture());
    }

    @Test
    public void getInstalledSoftwareFromYumTest()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-rhel7");
        List<InstalledSoftware> softwareList = InstalledSoftwareCollector.getInstalledSoftwareFromYum(target);
        System.out.println(StringUtils.toJson(softwareList, true));
        assertNotNull(softwareList);
    }

    @Test
    public void processYumListInstalledOutputTestWithMultilineOutput()
    {
        String yumOutput = "Loaded plugins: ovl, product-id, search-disabled-repos\n" +
                "Repodata is over 2 weeks old. Install yum-cron? Or run: yum makecache fast\n" +
                "Installed Packages\n" +
                "subscription-manager-rhsm.x86_64             1.20.11-1.el7_5       @anaconda/7.5\n" +
                "subscription-manager-rhsm-certificates.x86_64\n" +
                "                                             1.20.11-1.el7_5       @anaconda/7.5\n" +
                "systemd.x86_64                               219-57.el7            @anaconda/7.5\n";
        List<InstalledSoftware> softwareList = InstalledSoftwareCollector.processYumListInstalledOutput(yumOutput);
        boolean foundRhsmCerts = false;
        for(InstalledSoftware installedSoftware : softwareList)
        {
            if("subscription-manager-rhsm-certificates".equals(installedSoftware.getName()))
            {
                foundRhsmCerts = true;
                break;
            }
        }
        assertTrue(foundRhsmCerts);
    }

    @Test
    public void getInstalledSoftwareFromMacPkgutil()
    {
        Assume.assumeTrue(SystemUtils.IS_OS_MAC);
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Host, "host");
        List<InstalledSoftware> softwares = InstalledSoftwareCollector.getInstalledSoftwareFromMacPkgutil(target);
        assertNotNull(softwares);
        assertTrue(softwares.size()>0);
        System.out.println(StringUtils.toJson(softwares, true));
    }

    @Test
    public void getInstalledSoftwareFromMacBrewList()
    {
        Assume.assumeTrue(SystemUtils.IS_OS_MAC);
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Host, "host");
        List<InstalledSoftware> softwares = InstalledSoftwareCollector.getInstalledSoftwareFromMacBrewList(target);
        assertNotNull(softwares);
        assertTrue(softwares.size()>0);
        System.out.println(StringUtils.toJson(softwares, true));
    }

    @Test
    public void parseInstalledSoftwareFromMacPortInstalled()
    {
        String cmdOutput = "a52dec @0.7.4_0 (active)\n" +
                "adns @1.4_0 (active)\n" +
                "apache2 @2.2.27_0+preforkmpm (active)\n" +
                "apr @1.5.1_0 (active)\n" +
                " apr-util @1.5.3_0 (active)\n" +
                "   aquaterm @1.1.1_0 (active)\n" +
                "  asciidoc @8.6.9_1+python27 (active)";
        List<InstalledSoftware> softwares = InstalledSoftwareCollector.parseInstalledSoftwareFromMacPortInstalled(cmdOutput);
        assertNotNull(softwares);
        assertTrue(softwares.size()>0);
        System.out.println(StringUtils.toJson(softwares, true));
    }
}