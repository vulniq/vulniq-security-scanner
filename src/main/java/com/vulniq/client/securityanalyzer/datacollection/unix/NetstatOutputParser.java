
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

import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;

public class NetstatOutputParser
{
    private static Logger logger = LoggerFactory.getLogger(NetstatOutputParser.class);

    public static List parseNetsatCommandOutput(String netstatOutput)
    {
        LinkedList<InetListeningServersProperties> listNetstatOutput = new LinkedList<>();
        int lastOccurenceOfColon;
        try(BufferedReader input = new BufferedReader(new StringReader(netstatOutput)))
        {
            String lineOfNetstatOutput;

            input.readLine(); //To skip the first line in the netstatOutput which is a title block
            input.readLine(); //To skip the second line it the netstatOutput which consists of headers

            while ((lineOfNetstatOutput = input.readLine()) != null)
            {
                String[] splittedString = lineOfNetstatOutput.trim().split("\\s+");

                InetListeningServersProperties inetListeningServersProperties = new InetListeningServersProperties();

                inetListeningServersProperties.setProtocol(splittedString[0]);
                
                String localFullAddress = splittedString[3];
                inetListeningServersProperties.setLocalFullAddress(localFullAddress);//LocalFullAddress is in the form of LocalAddress:LocalPort

                lastOccurenceOfColon = localFullAddress.lastIndexOf(":");
                
                String localPort = localFullAddress.substring(lastOccurenceOfColon + 1, localFullAddress.length());
                inetListeningServersProperties.setLocalPort(localPort);
                
                String localRawIp = localFullAddress.substring(0, lastOccurenceOfColon);
                try
                {
                    InetAddress inetAddress = InetAddress.getByName(localRawIp);
                    String normalizedLocalIp = inetAddress.getHostAddress();
                    inetListeningServersProperties.setLocalAddress(normalizedLocalIp);

                }
                catch (UnknownHostException ex)
                {
                    logger.error("Invalid local IP address:" + localRawIp, ex);
                }

                String foreignFullAddress = splittedString[4];
                inetListeningServersProperties.setForeignFullAddress(foreignFullAddress);//ForeignFullAddress is in the form of ForeignAddress:ForeignPort

                lastOccurenceOfColon = foreignFullAddress.lastIndexOf(":");
                
                String foreignPort = foreignFullAddress.substring(lastOccurenceOfColon + 1, foreignFullAddress.length());
                inetListeningServersProperties.setForeignPort(foreignPort);
                
                String foreignRawIp = foreignFullAddress.substring(0, lastOccurenceOfColon);
                try
                {
                    InetAddress inetAddress = InetAddress.getByName(foreignRawIp);
                    String normalizedForeignIp = inetAddress.getHostAddress();
                    inetListeningServersProperties.setForeignAddress(normalizedForeignIp);
                }
                catch (UnknownHostException ex)
                {
                    logger.error("Invalid foreign IP address:" + foreignRawIp, ex);
                }

                inetListeningServersProperties.setUserId(splittedString[6]);

                String[] splittedPidProgramName = splittedString[8].split("/");
                inetListeningServersProperties.setPid(splittedPidProgramName[0]);
                inetListeningServersProperties.setProgramName(splittedPidProgramName[1]);

                if(logger.isDebugEnabled())
                {
                    logger.debug("Parsed netstat line:" + StringUtils.toJson(inetListeningServersProperties, false));
                }
                listNetstatOutput.add(inetListeningServersProperties);
            }
        }
        catch (Exception e)
        {
            logger.error("Error parsing netstat output", e);
        }
        return listNetstatOutput;
    }

}
