
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

package com.vulniq.client.securityanalyzer.utils.os;

import com.vulniq.client.securityanalyzer.TerziTestBase;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.os.LinuxOSInfo;
import org.junit.Assert;
import org.junit.Test;

public class OSCommandUtilsTest extends TerziTestBase
{

    @Test
    public void runCommand()
    {
        OSCommandOutput output = OSCommandUtils.runCommand(3000, "ls", "-l", "/");
        System.out.println("************");
        System.out.println(output.getStdOut());
        System.out.println("-----------");
        System.out.println(output.getStdErr());
        System.out.println("===========");
    }

    @Test
    public void escapeShellArg()
    {
        OSInfo osInfo = new LinuxOSInfo();
        {
            String str = "cmd.exe";
            String escaped = OSCommandUtils.escapeShellArg(str, osInfo);
            Assert.assertEquals("'cmd.exe'", escaped);
        }

        {
            String str = "/usr/local/bin/";
            String escaped = OSCommandUtils.escapeShellArg(str, osInfo);
            Assert.assertEquals("'/usr/local/bin/'", escaped);
        }
        {
            String str = "/usr/local\\0/bin/";
            String escaped = OSCommandUtils.escapeShellArg(str, osInfo);
            Assert.assertEquals("'/usr/local\\0/bin/'", escaped);
        }

        {
            String str = "cmd.exe`date`";
            String escaped = OSCommandUtils.escapeShellArg(str, osInfo);
            Assert.assertEquals("'cmd.exe`date`'", escaped);
        }

        {
            String str = "cmd.exe\ndate";
            String escaped = OSCommandUtils.escapeShellArg(str, osInfo);
            Assert.assertEquals("'cmd.exe\ndate'", escaped);
        }

        {
            String str = "rpm -V bash";
            String escaped = OSCommandUtils.escapeShellArg(str, osInfo);
            Assert.assertEquals("'rpm -V bash'", escaped);
        }

        {
            String str = "^l.";
            String escaped = OSCommandUtils.escapeShellArg(str, osInfo);
            Assert.assertEquals("'^l.'", escaped);
        }

        {
            String str = "xyz|cat /etc/hosts";
            String escaped = OSCommandUtils.escapeShellArg(str, osInfo);
            Assert.assertEquals("'xyz|cat /etc/hosts'", escaped);
        }

        {
            String str = "'xyz|cat /etc/hosts'";
            String escaped = OSCommandUtils.escapeShellArg(str, osInfo);
            Assert.assertEquals("'\\'xyz|cat /etc/hosts\\''", escaped);
        }
        {
            String str = "^b.n$";
            String escaped = OSCommandUtils.escapeShellArg(str, osInfo);
            Assert.assertEquals("'^b.n$'", escaped);
        }

        {
            String str = "\"quoted text\"";
            String escaped = OSCommandUtils.escapeShellArg(str, osInfo);
            Assert.assertEquals("'\"quoted text\"'", escaped);
        }

    }
}