

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

import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.mitre.oval.xmlschema.oval_common_5.CheckEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.FlagEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ObjectCollectionResult
{
    private List<CollectedItemEntry> collectedItems = new LinkedList<>();
    private CheckEnumeration varCheck;
    private boolean hasVarReferences = false;
    private FlagEnumeration flagEnumeration;
    
    /**
     * use when object has no variable references
     */
    public ObjectCollectionResult()
    {

    }

    public ObjectCollectionResult(boolean objectHasVarReferences, CheckEnumeration varCheck)
    {
        this.hasVarReferences = objectHasVarReferences;
        this.varCheck = varCheck;
    }



    /**
     * DO NOT USE THIS TO MODIFY VALUES
     * @return
     */
    public List<Object> getCollectedValues()
    {
        List<Object> rv = new LinkedList<>();
        for(CollectedItemEntry collectedItemEntry : collectedItems)
        {
            if(collectedItemEntry.collectedValue!=null)
            {
                rv.add(collectedItemEntry.collectedValue);
            }
        }
        return Collections.unmodifiableList(rv);
    }

    public FlagEnumeration getCollectionStatus()
    {
        if(this.flagEnumeration!=null)
        {
            return this.flagEnumeration;
        }
        if(this.hasVarReferences)
        {
            return this.calculateFlagFromVariableValues();
        }
        else
        {
            List<StatusEnumeration> itemStatuses = getCollectedItemStatuses();
            return OVALObjectImplBase.calculateFlagEnumeration(itemStatuses);
        }
    }

    /**
     * FIXME this is likely wrong or missing something
     * @return
     */
    private FlagEnumeration calculateFlagFromVariableValues()
    {
        int doesNotExistCount = 0;
        int errorCount = 0;
        int notCollectedCount = 0;
        int existCount = 0;
        for(CollectedItemEntry itemEntry : collectedItems)
        {
            StatusEnumeration tmpStatus = itemEntry.itemStatus;
            switch (tmpStatus)
            {
                case ERROR:
                    errorCount++;
                    break;
                case EXISTS:
                    existCount++;
                    break;
                case DOES_NOT_EXIST:
                    doesNotExistCount++;
                    break;
                case NOT_COLLECTED:
                    notCollectedCount++;
                    break;
            }
        }
        switch (varCheck)
        {
            case ALL:
                if(errorCount>0)
                {
                    return FlagEnumeration.ERROR;
                }
                if(doesNotExistCount>0)
                {
                    return FlagEnumeration.DOES_NOT_EXIST;
                }
                if(notCollectedCount>0)
                {
                    return FlagEnumeration.INCOMPLETE;
                }
                else
                {
                    return FlagEnumeration.COMPLETE;
                }
            case AT_LEAST_ONE:
                if(existCount>0)
                {
                    if(errorCount>0 || notCollectedCount>0)
                    {
                        return FlagEnumeration.INCOMPLETE;
                    }
                    if(errorCount == 0 && notCollectedCount == 0)
                    {
                        return FlagEnumeration.COMPLETE;
                    }
                }
                else
                {
                    if(errorCount>0)
                    {
                        return  FlagEnumeration.ERROR;
                    }
                    else
                    {
                        return FlagEnumeration.DOES_NOT_EXIST;
                    }
                }
            case ONLY_ONE:
                if(errorCount>0)
                {
                    return FlagEnumeration.ERROR;
                }
                if(existCount==1)
                {
                    return FlagEnumeration.COMPLETE;
                }
                else
                {
                    return FlagEnumeration.DOES_NOT_EXIST;
                }
            case NONE_EXIST:
            case NONE_SATISFY:
                if(existCount>0)
                {
                    return FlagEnumeration.DOES_NOT_EXIST;
                }
                if(errorCount>0)
                {
                    return FlagEnumeration.ERROR;
                }
                if(doesNotExistCount>0)
                {
                    return FlagEnumeration.COMPLETE;
                }
                break;
        }
        return FlagEnumeration.ERROR;
    }

    public void addItemCollectionStatus(StatusEnumeration collectionStatus, boolean fromVarRef)
    {
        addCollectedValue(null, collectionStatus, fromVarRef);
    }
    public void addItemCollectionStatus(StatusEnumeration collectionStatus)
    {
        addCollectedValue(null, collectionStatus, false);
    }

    public void addCollectedValue(Object aCollectedValue, StatusEnumeration collectionStatus)
    {
        addCollectedValue(aCollectedValue, collectionStatus, false);
    }
    public void addCollectedValue(Object aCollectedValue, StatusEnumeration collectionStatus, boolean isValueFromVarRef)
    {
        CollectedItemEntry itemEntry = new CollectedItemEntry();
        itemEntry.isFromVariable = isValueFromVarRef;
        itemEntry.itemStatus = collectionStatus;
        itemEntry.collectedValue = aCollectedValue;
        collectedItems.add(itemEntry);
    }

    public void removeCollectedItem(int index)
    {
        this.collectedItems.remove(index);
    }

    /**
     * overrides the calculated value
     * if not set, it will be auto-calculated
     * use only for SETs
     * @param flagEnumeration
     */
    public void setFlagEnumeration(FlagEnumeration flagEnumeration)
    {
        this.flagEnumeration = flagEnumeration;
    }


    public List<StatusEnumeration> getCollectedItemStatuses()
    {
        List<StatusEnumeration> itemStatuses = new LinkedList<>();
        for(CollectedItemEntry itemEntry : collectedItems)
        {
            itemStatuses.add(itemEntry.itemStatus);
        }
        return itemStatuses;
    }

    public static class CollectedItemEntry
    {
        public boolean isFromVariable = false;
        public Object collectedValue = null;
        public StatusEnumeration itemStatus = null;

        @Override
        public boolean equals(Object obj)
        {
            if(!(obj instanceof  CollectedItemEntry))
            {
                return false;
            }
            if(obj == null)
            {
                return false;
            }
            CollectedItemEntry other = (CollectedItemEntry)obj;
            if(collectedValue == null && other.collectedValue==null)
            {
                return true;
            }
            return Objects.equals(collectedValue, other.collectedValue);
        }
    }

    public List<CollectedItemEntry> getCollectedItems()
    {
        return collectedItems;
    }

    public void setCollectedItems(List<CollectedItemEntry> collectedItems)
    {
        this.collectedItems = collectedItems;
    }
}
