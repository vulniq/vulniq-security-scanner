
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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windows;

import org.mitre.oval.xmlschema.oval_definitions_5.EntitySimpleBaseType;

public class CollectedWindowsRegistryInfo
{
    private String hive;
    private String key;
    private String name;
    private String lastWriteTime;
    private String type;
    private EntitySimpleBaseType value;
    private String expandedValue;
    private String windowsView;

    public String getHive()
    {
        return hive;
    }

    public void setHive(String hive)
    {
        this.hive = hive;
    }

    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLastWriteTime()
    {
        return lastWriteTime;
    }

    public void setLastWriteTime(String lastWriteTime)
    {
        this.lastWriteTime = lastWriteTime;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public EntitySimpleBaseType getValue()
    {
        return value;
    }

    public void setValue(EntitySimpleBaseType value)
    {
        this.value = value;
    }

    public String getExpandedValue()
    {
        return expandedValue;
    }

    public void setExpandedValue(String expandedValue)
    {
        this.expandedValue = expandedValue;
    }

    public String getWindowsView()
    {
        return windowsView;
    }

    public void setWindowsView(String windowsView)
    {
        this.windowsView = windowsView;
    }
    
    @Override
    public String toString()
    {
        return "Hive: " + hive + ", key: " + key +", name: " + name + ".";
    }
    
    public String getValueAsString()
    {
        if(value == null || value.getValue() == null)
        {
            return null;
        }
        return value.getValue().toString();
    }
    
}
