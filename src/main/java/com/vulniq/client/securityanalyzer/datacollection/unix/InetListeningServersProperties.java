
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

public class InetListeningServersProperties
{
   /**
     * The protocol entity defines the specific transport-layer protocol, in
     * lowercase: tcp or udp, associated with the inet listening server.
     */
    private String protocol;

    /**
     * This is the IP address of the network interface on which the program
     * listens. Note that the IP address can be IPv4 or IPv6.
     */
    private String localAddress;

    /**
     * This is the TCP or UDP port number associated with the inet listening
     * server.
     */
    private String localPort;

    /**
     * This is the IP address and network port number associated with the inet
     * listening server, equivalent to local_address:local_port. Note that the
     * IP address can be IPv4 or IPv6
     */
    private String localFullAddress;

    /**
     * This is the name of the communicating program.
     */
    private String programName;

    /**
     * This is the IP address with which the program is communicating, or with
     * which it will communicate, in the case of a listening server. Note that
     * the IP address can be IPv4 or IPv6.
     */
    private String foreignAddress;

    /**
     * This is the TCP or UDP port to which the program communicates. In the
     * case of a listening program accepting new connections, the value will be
     * 0.
     */
    private String foreignPort;

    /**
     * This is the IP address and network port to which the program is
     * communicating or will accept communications from, equivalent to
     * foreign_address:foreign_port. Note that the IP address can be IPv4 or
     * IPv6.
     */
    private String foreignFullAddress;

    /**
     * The pid is the process ID of a specific process.
     */
    private String pid;

    /**
     * The numeric user id, or uid, is the third column of each user's entry in
     * /etc/passwd. It represents the owner, and thus privilege level, of the
     * specified program.
     */
    private String userId;

    public String getProtocol()
    {
        return protocol;
    }

    public void setProtocol(String protocol)
    {
        this.protocol = protocol;
    }

    public String getLocalAddress()
    {
        return localAddress;
    }

    public void setLocalAddress(String localAddress)
    {
        this.localAddress = localAddress;
    }

    public String getLocalPort()
    {
        return localPort;
    }

    public void setLocalPort(String localPort)
    {
        this.localPort = localPort;
    }

    public String getLocalFullAddress()
    {
        return localFullAddress;
    }

    public void setLocalFullAddress(String localFullAddress)
    {
        this.localFullAddress = localFullAddress;
    }

    public String getProgramName()
    {
        return programName;
    }

    public void setProgramName(String programName)
    {
        this.programName = programName;
    }

    public String getForeignAddress()
    {
        return foreignAddress;
    }

    public void setForeignAddress(String foreignAddress)
    {
        this.foreignAddress = foreignAddress;
    }

    public String getForeignPort()
    {
        return foreignPort;
    }

    public void setForeignPort(String foreignPort)
    {
        this.foreignPort = foreignPort;
    }

    public String getForeignFullAddress()
    {
        return foreignFullAddress;
    }

    public void setForeignFullAddress(String foreignFullAddress)
    {
        this.foreignFullAddress = foreignFullAddress;
    }

    public String getPid()
    {
        return pid;
    }

    public void setPid(String pid)
    {
        this.pid = pid;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }
    
    @Override
    public String toString()
    {
        return "InetListeningServer Name: " + programName.trim() + ", Pid: " + pid.trim() + ", localPort: "+localPort;
    }
    

}
