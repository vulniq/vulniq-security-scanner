
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

package com.vulniq.client.securityanalyzer.datacollection.windows;

public class CollectedPortInfo
{
    private String localAddress;
    private int localPort;
    private String protocol;
    private int pid;
    private String foreignAddress;
    private int foreignPort;
    
    public String getLocalAddress()
    {
        return localAddress;
    }
    
    public void setLocalAddress(String localAddress)
    {
        this.localAddress = localAddress;
    }
    
    public int getLocalPort()
    {
        return localPort;
    }
    
    public void setLocalPort(int localPort)
    {
        this.localPort = localPort;
    }
    
    public String getProtocol()
    {
        return protocol;
    }
    
    public void setProtocol(String protocol)
    {
        this.protocol = protocol;
    }
    
    public int getPid()
    {
        return pid;
    }
    
    public void setPid(int pid)
    {
        this.pid = pid;
    }
    
    public String getForeignAddress()
    {
        return foreignAddress;
    }
    
    public void setForeignAddress(String foreignAddress)
    {
        this.foreignAddress = foreignAddress;
    }
    
    public int getForeignPort()
    {
        return foreignPort;
    }
    
    public void setForeignPort(int foreignPort)
    {
        this.foreignPort = foreignPort;
    }
}
