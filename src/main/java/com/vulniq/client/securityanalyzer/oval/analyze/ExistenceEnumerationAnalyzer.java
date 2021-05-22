
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

import com.vulniq.client.securityanalyzer.logging.TerziLog;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import org.mitre.oval.xmlschema.oval_common_5.ExistenceEnumeration;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;

import java.util.Collection;

public class ExistenceEnumerationAnalyzer
{
    public enum EvaluationTarget {State, Test};

    public static ResultEnumeration evaluate(ExistenceEnumeration existenceEnumeration, Collection<StatusEnumeration> results, EvaluationTarget evaluationTarget)
        throws UnexpectedOVALEvaluationError
    {
        int existsCount = 0;
        int doesNotExistCount = 0;
        int errorCount = 0;
        int notCollectedCount = 0;
        for(StatusEnumeration tmpStatus : results)
        {
            switch(tmpStatus)
            {
                case ERROR:
                    errorCount++;
                    break;
                case EXISTS:
                    existsCount++;
                    break;
                case NOT_COLLECTED:
                    notCollectedCount++;
                    break;
                case DOES_NOT_EXIST:
                    doesNotExistCount++;
                    break;
                default:
                    TerziLog.supportCase(ExistenceEnumerationAnalyzer.class.getName(), "Unexpected StatusEnumeration value",
                            String.valueOf(tmpStatus), "You are using OVAL definitions not supported by this application", null);
                    break;
            }
        }

        /*
        When used in the context of an OVAL state entity's check_existence attribute,
            a value of 'all_exist' means that every item entity for an object defined by
            the description exists on the system.
        When used in the context of an OVAL test's check_existence attribute,
            this value is equivalent to 'at_least_one_exists' because non-existent items have no impact
            upon evaluation.
         */
        if(evaluationTarget == EvaluationTarget.Test && existenceEnumeration == ExistenceEnumeration.ALL_EXIST)
        {
            existenceEnumeration = ExistenceEnumeration.AT_LEAST_ONE_EXISTS;
        }
        switch (existenceEnumeration)
        {
            case ALL_EXIST:
/*
       attr value   ||                           || existence piece is
                    ||  EX  |  DE  |  ER  |  NC  ||
--------------------||---------------------------||------------------
                    ||  1+  |  0   |  0   |  0   ||  True
                    ||  0   |  0   |  0   |  0   ||  False
                    ||  0+  |  1+  |  0+  |  0+  ||  False
        all_exist   ||  0+  |  0   |  1+  |  0+  ||  Error
                    ||  0+  |  0   |  0   |  1+  ||  Unknown
                    ||  --  |  --  |  --  |  --  ||  Not Evaluated
                    ||  --  |  --  |  --  |  --  ||  Not Applicable
--------------------||---------------------------||------------------
 */
                if(existsCount>0 && doesNotExistCount==0 && errorCount==0 && notCollectedCount==0)
                {
                    return ResultEnumeration.TRUE;
                }
                else if(existsCount==0 && doesNotExistCount==0 && errorCount==0 && notCollectedCount==0)
                {
                    return ResultEnumeration.FALSE;
                }
                else if(existsCount>0 && doesNotExistCount>0 && errorCount>=0 && notCollectedCount>=0)
                {
                    return ResultEnumeration.FALSE;
                }
                //0+  |  0   |  1+  |  0+  ||  Error
                else if(existsCount>0 && doesNotExistCount==0 && errorCount>0 && notCollectedCount>=0)
                {
                    return ResultEnumeration.ERROR;
                }
                //0+  |  0   |  0   |  1+  ||  Unknown
                else if(existsCount>=0 && doesNotExistCount==0 && errorCount==0 && notCollectedCount>0)
                {
                    return ResultEnumeration.UNKNOWN;
                }
                break;
            case ANY_EXIST:
/*
       attr value   ||                           ||  existence piece is
                    ||  EX  |  DE  |  ER  |  NC  ||
--------------------||---------------------------||------------------
                    ||  0+  |  0+  |  0   |  0+  ||  True
                    ||  1+  |  0+  |  1+  |  0+  ||  True
                    ||  --  |  --  |  --  |  --  ||  False
        any_exist   ||  0   |  0+  |  1+  |  0+  ||  Error
                    ||  --  |  --  |  --  |  --  ||  Unknown
                    ||  --  |  --  |  --  |  --  ||  Not Evaluated
                    ||  --  |  --  |  --  |  --  ||  Not Applicable
--------------------||---------------------------||------------------

 */
                if(existsCount>=0 && doesNotExistCount>=0 && errorCount==0 && notCollectedCount>=0)
                {
                    return ResultEnumeration.TRUE;
                }
                else if(existsCount>0 && doesNotExistCount>=0 && errorCount>0 && notCollectedCount>=0)
                {
                    return ResultEnumeration.TRUE;
                }
                //0   |  0+  |  1+  |  0+  ||  Error
                else if(existsCount==0 && doesNotExistCount>=0 && errorCount>0 && notCollectedCount>=0)
                {
                    return ResultEnumeration.ERROR;
                }
                break;
            case AT_LEAST_ONE_EXISTS:
/*
       attr value   ||                           ||  existence piece is
                    ||  EX  |  DE  |  ER  |  NC  ||
--------------------||---------------------------||------------------
                    ||  1+  |  0+  |  0+  |  0+  ||  True
                    ||  0   |  0+  |  0   |  0   ||  False
at_least_one_exists ||  0   |  0+  |  1+  |  0+  ||  Error
                    ||  0   |  0+  |  0   |  1+  ||  Unknown
                    ||  --  |  --  |  --  |  --  ||  Not Evaluated
                    ||  --  |  --  |  --  |  --  ||  Not Applicable
--------------------||---------------------------||------------------

 */
                if(existsCount>0 && doesNotExistCount>=0 && errorCount>=0 && notCollectedCount>=0)
                {
                    return ResultEnumeration.TRUE;
                }
                else if(existsCount==0 && doesNotExistCount>=0 && errorCount==0 && notCollectedCount==0)
                {
                    return ResultEnumeration.FALSE;
                }
                //0   |  0+  |  1+  |  0+  ||  Error
                else if(existsCount==0 && doesNotExistCount>=0 && errorCount>0 && notCollectedCount>=0)
                {
                    return ResultEnumeration.ERROR;
                }
                //0   |  0+  |  0   |  1+  ||  Unknown
                else if(existsCount==0 && doesNotExistCount>=0 && errorCount==0 && notCollectedCount>0)
                {
                    return ResultEnumeration.UNKNOWN;
                }
                break;
            case NONE_EXIST:
/*
       attr value   ||                           ||  existence piece is
                    ||  EX  |  DE  |  ER  |  NC  ||
--------------------||---------------------------||------------------
                    ||  0   |  0+  |  0   |  0   ||  True
                    ||  1+  |  0+  |  0+  |  0+  ||  False
       none_exist   ||  0   |  0+  |  1+  |  0+  ||  Error
                    ||  0   |  0+  |  0   |  1+  ||  Unknown
                    ||  --  |  --  |  --  |  --  ||  Not Evaluated
                    ||  --  |  --  |  --  |  --  ||  Not Applicable
--------------------||---------------------------||------------------

 */
                if(existsCount==0 && doesNotExistCount>=0 && errorCount==0 && notCollectedCount==0)
                {
                    return ResultEnumeration.TRUE;
                }
                else if(existsCount>0 && doesNotExistCount>=0 && errorCount>=0 && notCollectedCount>=0)
                {
                    return ResultEnumeration.FALSE;
                }
                //0   |  0+  |  1+  |  0+  ||  Error
                else if(existsCount==0 && doesNotExistCount>=0 && errorCount>0 && notCollectedCount>=0)
                {
                    return ResultEnumeration.ERROR;
                }
                //0   |  0+  |  0   |  1+  ||  Unknown
                else if(existsCount==0 && doesNotExistCount>=0 && errorCount==0 && notCollectedCount>0)
                {
                    return ResultEnumeration.UNKNOWN;
                }
                break;
            case ONLY_ONE_EXISTS:
/*
       attr value   ||                           ||  existence piece is
                    ||  EX  |  DE  |  ER  |  NC  ||
--------------------||---------------------------||------------------
                    ||  1   |  0+  |  0   |  0   ||  True
                    ||  2+  |  0+  |  0+  |  0+  ||  False
                    ||  0   |  0+  |  0   |  0   ||  False
  only_one_exists   ||  0,1 |  0+  |  1+  |  0+  ||  Error
                    ||  0,1 |  0+  |  0   |  1+  ||  Unknown
                    ||  --  |  --  |  --  |  --  ||  Not Evaluated
                    ||  --  |  --  |  --  |  --  ||  Not Applicable
--------------------||---------------------------||------------------

 */
                if(existsCount==1 && doesNotExistCount>=0 && errorCount==0 && notCollectedCount==0)
                {
                    return ResultEnumeration.TRUE;
                }
                else if(existsCount>=1 && doesNotExistCount>=0 && errorCount>=0 && notCollectedCount>=0)
                {
                    return ResultEnumeration.FALSE;
                }
                //0   |  0+  |  0   |  0   ||  False
                else if(existsCount==0 && doesNotExistCount>=0 && errorCount==0 && notCollectedCount==0)
                {
                    return ResultEnumeration.FALSE;
                }
                //0,1 |  0+  |  1+  |  0+  ||  Error
                else if(existsCount<2 && doesNotExistCount>=0 && errorCount>0 && notCollectedCount>=0)
                {
                    return ResultEnumeration.ERROR;
                }
                //0,1 |  0+  |  0   |  1+  ||  Unknown
                else if(existsCount<2 && doesNotExistCount>=0 && errorCount==0 && notCollectedCount>0)
                {
                    return ResultEnumeration.UNKNOWN;
                }
                break;
        }
        throw new UnexpectedOVALEvaluationError("ExistenceEnumerationAnalyzer.evaluate should not reach here");
    }
}
