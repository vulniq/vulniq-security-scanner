
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

package com.vulniq.client.securityanalyzer.datacollection.unix;

import com.vulniq.client.securityanalyzer.datacollection.unix.ProcessProperties;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;

import static com.vulniq.client.securityanalyzer.main.TerziOptions.logger;

public class PsOutputParser
{

    /**
     * Parses 'ps -e -o cputime,pid,ppid,pri,ruid,start,tty,uid,sess,command' output only
     * @param psOutput
     * @return
     */
    public static List parsePsCommandOutput(String psOutput)
    {
        LinkedList<ProcessProperties> listPsOutput = new LinkedList<>();
        try(BufferedReader input = new BufferedReader(new StringReader(psOutput)))
        {
            String lineOfPsOutput;
            String headerLine = input.readLine();
            //headerLine will be something like the following
            //    TIME   PID  PPID PRI  RUID                  STARTED TT         UID  SESS COMMAND
            int timeEnd= headerLine.indexOf("TIME") + 4;
            int pidEnd = headerLine.indexOf("PID", timeEnd) + 3;
            int ppidEnd = headerLine.indexOf("PPID", pidEnd) + 4;
            int priEnd = headerLine.indexOf("PRI", ppidEnd) + 3;
            int ruidEnd = headerLine.indexOf("RUID", priEnd) + 4;
            int startedEnd = headerLine.indexOf("STARTED", ruidEnd) + 7;
            int ttEnd = headerLine.indexOf("TT", startedEnd) + 2;
            int uidEnd = headerLine.indexOf("UID", ttEnd) + 3;
            int sessEnd = headerLine.indexOf("SESS", uidEnd) + 4;

            while ((lineOfPsOutput = input.readLine()) != null)
            {
                ProcessProperties processProperties = new ProcessProperties();
                processProperties.setCpuTime(lineOfPsOutput.substring(0, timeEnd).trim());
                processProperties.setPid(lineOfPsOutput.substring(timeEnd, pidEnd).trim());
                processProperties.setPpid(lineOfPsOutput.substring(pidEnd, ppidEnd).trim());
                processProperties.setPri(lineOfPsOutput.substring(ppidEnd, priEnd).trim());
                processProperties.setRuid(lineOfPsOutput.substring(priEnd, ruidEnd).trim());
                processProperties.setStart(lineOfPsOutput.substring(ruidEnd, startedEnd).trim());
                String ttyUidPart = lineOfPsOutput.substring(startedEnd, uidEnd).trim();
                String[] splitTtyUidPart = ttyUidPart.split("\\s", 2);
                processProperties.setTty(splitTtyUidPart[0].trim());
                processProperties.setUid(splitTtyUidPart[1].trim());
                processProperties.setSess(lineOfPsOutput.substring(uidEnd, sessEnd).trim());
                processProperties.setCommand(lineOfPsOutput.substring(sessEnd+1).trim());
                //processProperties.setCls(splittedString[10]);
                //processProperties.setLabel(splittedString[11]);
                listPsOutput.add(processProperties);
            }
        }
        catch (Exception e)
        {
            logger.error("Failed to parse ps output:" + psOutput, e);
        }
        return listPsOutput;
    }

}
