
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

package com.vulniq.client.securityanalyzer.oval.analyze;

import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.ObjectCollectionResult;
import com.vulniq.client.securityanalyzer.oval.error.UnsupportedOVALItemError;
import org.mitre.oval.xmlschema.oval_definitions_5.SetOperatorEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.FlagEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetOperatorAnalyzer
{

    
    public static ObjectCollectionResult mergeSets(SetOperatorEnumeration operator, ObjectCollectionResult firstResult, ObjectCollectionResult secondResult)
    {
        ObjectCollectionResult merged = new ObjectCollectionResult();

        switch (operator)
        {
            case UNION:
                List<ObjectCollectionResult.CollectedItemEntry> mergedCollectedItems = new LinkedList<>();
                mergedCollectedItems.addAll(firstResult.getCollectedItems());
                mergedCollectedItems.addAll(secondResult.getCollectedItems());
                merged.setCollectedItems(mergedCollectedItems);
                break;
            case INTERSECTION:
                for(int i=0;i<firstResult.getCollectedItems().size(); i++)
                {
                    if(secondResult.getCollectedItems().contains(firstResult.getCollectedItems().get(i)))
                    {
                        merged.addCollectedValue(firstResult.getCollectedItems().get(i).collectedValue, firstResult.getCollectedItems().get(i).itemStatus, firstResult.getCollectedItems().get(i).isFromVariable);
                    }
                }
                break;
            case COMPLEMENT:
                for(int i=0;i<firstResult.getCollectedItems().size(); i++)
                {
                    if(!secondResult.getCollectedItems().contains(firstResult.getCollectedItems().get(i)))
                    {
                        merged.addCollectedValue(firstResult.getCollectedItems().get(i).collectedValue, firstResult.getCollectedItems().get(i).itemStatus, firstResult.getCollectedItems().get(i).isFromVariable);
                    }
                }
                break;
        }
        return merged;
    }
    
    public static ObjectCollectionResult applySetOperation (List<ObjectCollectionResult> collectionResults, SetOperatorEnumeration operator )
    {
        if(collectionResults.size() > 2 || collectionResults.size() == 0)
        {
            return null;
        }
        else if(collectionResults.size() == 1)
        {
            return applySetOperation(collectionResults.get(0), null, operator);
        }
        else
        {
            return applySetOperation(collectionResults.get(0), collectionResults.get(1), operator);
        }
    }
    
    public static ObjectCollectionResult applySetOperation (ObjectCollectionResult firstResult, ObjectCollectionResult secondResult, SetOperatorEnumeration operator)
    {
        if(secondResult == null)
        {
            return firstResult;
        }
        if(firstResult == null)
        {
            return secondResult;
        }
        if(secondResult == null && firstResult == null)
        {
            return null;
        }
        FlagEnumeration finalFlag = evaluateFlag(operator, firstResult.getCollectionStatus(), secondResult.getCollectionStatus());
        ObjectCollectionResult finalResult = mergeSets(operator, firstResult, secondResult);
        finalResult.setFlagEnumeration(finalFlag);

        return finalResult;
    }
    public static FlagEnumeration evaluateFlag(SetOperatorEnumeration setOperatorEnumeration, FlagEnumeration firstFlag, FlagEnumeration secondFlag)
    {
        if(setOperatorEnumeration==null)
        {
            return evaluateUnion(firstFlag, secondFlag);
        }
        switch (setOperatorEnumeration)
        {
            case COMPLEMENT:
                return evaluateComplement(firstFlag,secondFlag);
            case INTERSECTION:
                return evaluateIntersection(firstFlag,secondFlag);
            case UNION:
            default:
                return evaluateUnion(firstFlag, secondFlag);
        }
    }
    
    private static FlagEnumeration evaluateUnion(FlagEnumeration firstFlag, FlagEnumeration secondFlag)
    {
        /*
                 ||                                   ||
 set_operator is ||            obj 1 flag             ||
      union      ||                                   ||
                 ||  E  |  C  |  I  | DNE | NC  | NA  ||
-----------------||-----------------------------------||
               E ||  E  |  E  |  E  |  E  |  E  |  E  ||
  obj          C ||  E  |  C  |  I  |  C  |  I  |  C  ||
   2           I ||  E  |  I  |  I  |  I  |  I  |  I  ||
  flag       DNE ||  E  |  C  |  I  | DNE |  I  | DNE ||
              NC ||  E  |  I  |  I  |  I  |  NC |  NC ||
              NA ||  E  |  C  |  I  | DNE |  NC |  NA ||
-----------------||-----------------------------------||
         */
        
        if (firstFlag == FlagEnumeration.ERROR || secondFlag == FlagEnumeration.ERROR)
        {
            return FlagEnumeration.ERROR;
        }
        
        if (firstFlag == FlagEnumeration.COMPLETE)
        {
            if (secondFlag == FlagEnumeration.COMPLETE || secondFlag == FlagEnumeration.DOES_NOT_EXIST || secondFlag == FlagEnumeration.NOT_APPLICABLE)
            {
                return FlagEnumeration.COMPLETE;
            }
            else
            {
                return FlagEnumeration.INCOMPLETE;
            }
        }
        else if (firstFlag == FlagEnumeration.INCOMPLETE)
        {
            return FlagEnumeration.INCOMPLETE;
        }
        else if (firstFlag == FlagEnumeration.DOES_NOT_EXIST)
        {
            if (secondFlag == FlagEnumeration.COMPLETE)
            {
                return FlagEnumeration.COMPLETE;
            }
            else if (secondFlag == FlagEnumeration.INCOMPLETE || secondFlag == FlagEnumeration.NOT_COLLECTED)
            {
                return FlagEnumeration.INCOMPLETE;
            }
            else
            {
                return FlagEnumeration.DOES_NOT_EXIST;
            }
        }
        else if (firstFlag == FlagEnumeration.NOT_COLLECTED)
        {
            if (secondFlag == FlagEnumeration.NOT_COLLECTED || secondFlag == FlagEnumeration.NOT_APPLICABLE)
            {
                return FlagEnumeration.NOT_COLLECTED;
            }
            else
            {
                return FlagEnumeration.INCOMPLETE;
            }
        }
        else
        {
            return secondFlag;
        }
    }
    
    private static FlagEnumeration evaluateComplement(FlagEnumeration firstFlag, FlagEnumeration secondFlag)
    {
        /*
                 ||                                   ||
 set_operator is ||             obj 1 flag            ||
    complement   ||                                   ||
                 ||  E  |  C  |  I  | DNE | NC  | NA  ||
-----------------||-----------------------------------||
               E ||  E  |  E  |  E  | DNE |  E  |  E  ||
   obj         C ||  E  |  C  |  I  | DNE |  NC |  E  ||
    2          I ||  E  |  E  |  E  | DNE |  NC |  E  ||
   flag      DNE ||  E  |  C  |  I  | DNE |  NC |  E  ||
              NC ||  E  |  NC |  NC | DNE |  NC |  E  ||
              NA ||  E  |  E  |  E  |  E  |  E  |  E  ||
-----------------||-----------------------------------||
         */
        if(firstFlag == FlagEnumeration.ERROR)
        {
            return firstFlag;
        }
        
        if(secondFlag == FlagEnumeration.ERROR)
        {
            if(firstFlag == FlagEnumeration.DOES_NOT_EXIST)
            {
                return firstFlag;
            }
            else
            {
                return secondFlag;
            }
        }
        if(firstFlag == FlagEnumeration.NOT_APPLICABLE || secondFlag == FlagEnumeration.NOT_APPLICABLE)
        {
            return FlagEnumeration.ERROR;
        }
        
        if(firstFlag == FlagEnumeration.COMPLETE || firstFlag == FlagEnumeration.INCOMPLETE)
        {
            if(secondFlag == FlagEnumeration.INCOMPLETE)
            {
                return FlagEnumeration.ERROR;
            }
            if(secondFlag == FlagEnumeration.NOT_COLLECTED)
            {
                return FlagEnumeration.NOT_COLLECTED;
            }
            else
            {
                return firstFlag;
            }
        }
        else // firstFlag == FlagEnumeration.DOES_NOT_EXIST || firstFlag == FlagEnumeration.NOT_COLLECTED
        {
            return firstFlag;
        }
    }
    
    private static FlagEnumeration evaluateIntersection(FlagEnumeration firstFlag, FlagEnumeration secondFlag)
    {
        /*
                 ||                                   ||
 set_operator is ||             obj 1 flag            ||
  intersection   ||                                   ||
                 ||  E  |  C  |  I  | DNE | NC  | NA  ||
-----------------||-----------------------------------||
               E ||  E  |  E  |  E  | DNE |  E  |  E  ||
   obj         C ||  E  |  C  |  I  | DNE |  NC |  C  ||
    2          I ||  E  |  I  |  I  | DNE |  NC |  I  ||
   flag      DNE || DNE | DNE | DNE | DNE | DNE | DNE ||
              NC ||  E  |  NC |  NC | DNE |  NC |  NC ||
              NA ||  E  |  C  |  I  | DNE |  NC |  NA ||
-----------------||-----------------------------------||
    */
        if (firstFlag == FlagEnumeration.ERROR)
        {
            if(secondFlag == FlagEnumeration.DOES_NOT_EXIST)
            {
                return secondFlag;
            }
            else
            {
                return FlagEnumeration.ERROR;
            }
        }
        if(secondFlag == FlagEnumeration.ERROR)
        {
            if(firstFlag == FlagEnumeration.DOES_NOT_EXIST)
            {
                return firstFlag;
            }
            else
            {
                return FlagEnumeration.ERROR;
            }
        }
        if(firstFlag == FlagEnumeration.DOES_NOT_EXIST || secondFlag == FlagEnumeration.DOES_NOT_EXIST)
        {
            return FlagEnumeration.DOES_NOT_EXIST;
        }
        if(firstFlag == FlagEnumeration.COMPLETE)
        {
            return secondFlag;
        }
        if(firstFlag == FlagEnumeration.INCOMPLETE)
        {
            if( secondFlag == FlagEnumeration.NOT_COLLECTED)
            {
                return secondFlag;
            }
            else
            {
                return FlagEnumeration.INCOMPLETE;
            }
        }
        if(firstFlag == FlagEnumeration.NOT_COLLECTED)
        {
            return firstFlag;
        }
        return secondFlag;
    }
}
