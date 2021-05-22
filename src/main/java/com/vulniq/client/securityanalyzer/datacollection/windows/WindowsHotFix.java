
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

public class WindowsHotFix
{
    private String description;
    private String csName;
    private String installedBy;
    private String psComputerName;
    private String installedOn;
    private String path;
    private String hotFixId;
    
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public String getCsName()
    {
        return csName;
    }
    
    public void setCsName(String csName)
    {
        this.csName = csName;
    }
    
    public String getInstalledBy()
    {
        return installedBy;
    }
    
    public void setInstalledBy(String installedBy)
    {
        this.installedBy = installedBy;
    }
    
    public String getPsComputerName()
    {
        return psComputerName;
    }
    
    public void setPsComputerName(String psComputerName)
    {
        this.psComputerName = psComputerName;
    }
    
    public String getInstalledOn()
    {
        return installedOn;
    }
    
    public void setInstalledOn(String installedOn)
    {
        this.installedOn = installedOn;
    }
    
    public String getPath()
    {
        return path;
    }
    
    public void setPath(String path)
    {
        this.path = path;
    }
    
    public String getHotFixId()
    {
        return hotFixId;
    }
    
    public void setHotFixId(String hotFixId)
    {
        this.hotFixId = hotFixId;
    }
    
    
}
