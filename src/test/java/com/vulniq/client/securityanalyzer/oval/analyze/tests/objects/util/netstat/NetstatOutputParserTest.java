
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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.util.netstat;

import java.util.List;

import com.vulniq.client.securityanalyzer.TerziTestBase;
import com.vulniq.client.securityanalyzer.datacollection.unix.InetListeningServersProperties;
import com.vulniq.client.securityanalyzer.datacollection.unix.NetstatOutputParser;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 *
 */
public class NetstatOutputParserTest extends TerziTestBase
{

    /**
     * Test of parseNetsatCommandOutput method, of class NetstatOutputParser.
     */
    @Test
    public void testParseNetsatCommandOutput()
    {
        String exampleNetstatCommandOutput = "Active Internet connections (only servers) \n"
                + "Proto Recv-Q Send-Q Local Address           Foreign Address         State       User       Inode      PID/Program name \n"
                + "tcp        0      0 0.0.0.0:2222            0.0.0.0:*               LISTEN      2001       13430857   23/sshd\n"
                + "tcp        0      0 0.0.0.0:6000            0.0.0.0:*               LISTEN      2001       13432355   8/node \n"
                + "tcp        0      0 192.168.128.116:6001    0.0.0.0:*               LISTEN      2001       13431420   8/node  \n"
                + "tcp6       0      0 :::2222                 :::*                    LISTEN      2001       13429355   23/sshd \n"
                + "tcp6       0      0 :::46127                :::*                    LISTEN      2001       13432354   8/node";
        
        List<InetListeningServersProperties> listNetstatOutput = NetstatOutputParser.parseNetsatCommandOutput(exampleNetstatCommandOutput);
        assertEquals("tcp", listNetstatOutput.get(0).getProtocol());
        assertEquals("0.0.0.0", listNetstatOutput.get(0).getLocalAddress());
        assertEquals("0.0.0.0:2222", listNetstatOutput.get(0).getLocalFullAddress());
        assertEquals("2222", listNetstatOutput.get(0).getLocalPort());
        assertEquals("0.0.0.0", listNetstatOutput.get(0).getForeignAddress());
        assertEquals("*", listNetstatOutput.get(0).getForeignPort());
        assertEquals("23", listNetstatOutput.get(0).getPid());
        assertEquals("sshd", listNetstatOutput.get(0).getProgramName());
        for (InetListeningServersProperties netstatOutput : listNetstatOutput)
        {
            assertEquals("2001",netstatOutput.getUserId());
            assertEquals("*",netstatOutput.getForeignPort());
        }
    }
}
