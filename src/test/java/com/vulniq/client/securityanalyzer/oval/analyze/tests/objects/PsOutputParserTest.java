

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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects;

import com.vulniq.client.securityanalyzer.TerziTestBase;
import com.vulniq.client.securityanalyzer.datacollection.unix.PsOutputParser;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class PsOutputParserTest extends TerziTestBase
{

    @Before
    public void setup()
    {
    }


    @Test
    public void runPsCommand()
    {
        String psOut =
                "    TIME   PID  PPID PRI  RUID                  STARTED TT         UID  SESS COMMAND\n" +
                "00:00:00     1     0  19     0 Tue May 18 00:37:42 2021 pts/0        0     1 /bin/bash\n" +
                "00:00:00 29195     0  19     0 Thu May 20 17:07:57 2021 ?            0 29195 tail -f /dev/null\n" +
                "00:00:00 29220     1  19     0 Thu May 20 17:08:19 2021 ?            0 29213 tail -f /dev/null\n" +
                "00:00:00 29371     0  19     0 Thu May 20 18:11:37 2021 ?            0 29371 ps -e -o cputime,pid,ppid,pri,ruid,lstart,tty,uid,sess,command\n";
        List processList = PsOutputParser.parsePsCommandOutput(psOut);
        System.out.println(StringUtils.toJson(processList, true));

    }
}