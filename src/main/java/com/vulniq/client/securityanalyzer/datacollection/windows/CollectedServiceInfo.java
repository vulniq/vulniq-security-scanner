
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

import java.util.ArrayList;

public class CollectedServiceInfo
{
    private String serviceName;
    private String displayName;
    private String description;
    private String serviceType;
    private String startType;
    private String currentState;
    private String controlsAccepted;
    private String startName;
    private String path;
    private String pid;
    private String serviceFlag;
    private ArrayList<String> dependencies;
    
    public String getServiceName()
    {
        return serviceName;
    }
    
    public void setServiceName(String serviceName)
    {
        this.serviceName = serviceName;
    }
    
    public String getDisplayName()
    {
        return displayName;
    }
    
    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public String getServiceType()
    {
        return serviceType;
    }
    
    public void setServiceType(String serviceType)
    {
        this.serviceType = serviceType;
    }
    
    public String getStartType()
    {
        return startType;
    }
    
    public void setStartType(String startType)
    {
        this.startType = startType;
    }
    
    public String getCurrentState()
    {
        return currentState;
    }
    
    public void setCurrentState(String currentState)
    {
        this.currentState = currentState;
    }
    
    public String getControlsAccepted()
    {
        return controlsAccepted;
    }
    
    public void setControlsAccepted(String controlsAccepted)
    {
        this.controlsAccepted = controlsAccepted;
    }
    
    public String getStartName()
    {
        return startName;
    }
    
    public void setStartName(String startName)
    {
        this.startName = startName;
    }
    
    public String getPath()
    {
        return path;
    }
    
    public void setPath(String path)
    {
        this.path = path;
    }
    
    public String getPid()
    {
        return pid;
    }
    
    public void setPid(String pid)
    {
        this.pid = pid;
    }
    
    public String getServiceFlag()
    {
        return serviceFlag;
    }
    
    public void setServiceFlag(String serviceFlag)
    {
        this.serviceFlag = serviceFlag;
    }
    
    public ArrayList<String> getDependencies()
    {
        if(dependencies == null)
        {
            return new ArrayList<>();
        }
        else
        {
            return dependencies;
        }
    }
    
    public void setDependencies(ArrayList<String> dependencies)
    {
        this.dependencies = dependencies;
    }
}
