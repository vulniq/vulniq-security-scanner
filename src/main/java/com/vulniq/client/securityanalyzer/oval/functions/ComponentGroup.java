
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

package com.vulniq.client.securityanalyzer.oval.functions;

import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;

import java.util.Objects;

public class ComponentGroup
{
    private String value;
    private SimpleDatatypeEnumeration dataType;
    
    public String getValue()
    {
        return value;
    }
    
    public void setValue(String value)
    {
        this.value = value;
    }
    
    public SimpleDatatypeEnumeration getDataType()
    {
        return dataType;
    }
    
    public void setDataType(SimpleDatatypeEnumeration dataType)
    {
        this.dataType = dataType;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        
        ComponentGroup that = (ComponentGroup) o;
        
        if (!Objects.equals(value, that.value))
        {
            return false;
        }
        return dataType == that.dataType;
    }
    
    @Override
    public int hashCode()
    {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (dataType != null ? dataType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString()
    {
        return value;
    }
}
