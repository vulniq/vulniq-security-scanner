

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

package com.vulniq.client.securityanalyzer.datacollection;

import java.util.Objects;

public class DataCollectionTarget
{

    private DataCollectionTargetType targetType;
    private String targetName;

    public DataCollectionTarget(DataCollectionTargetType targetType, String targetName)
    {
        this.targetName = targetName;
        this.targetType = targetType;
    }

    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.targetType);
        hash = 71 * hash + Objects.hashCode(this.targetName);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final DataCollectionTarget other = (DataCollectionTarget) obj;
        if (!Objects.equals(this.targetName, other.targetName))
        {
            return false;
        }
        if (this.targetType != other.targetType)
        {
            return false;
        }
        return true;
    }

    public DataCollectionTargetType getTargetType()
    {
        return targetType;
    }

    public void setTargetType(DataCollectionTargetType targetType)
    {
        this.targetType = targetType;
    }

    public String getTargetName()
    {
        return targetName;
    }

    public void setTargetName(String targetName)
    {
        this.targetName = targetName;
    }

    @Override
    public String toString()
    {
        return this.targetType + ":" + this.targetName;
    }
}
