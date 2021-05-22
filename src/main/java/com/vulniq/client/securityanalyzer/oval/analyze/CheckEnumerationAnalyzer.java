
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
import com.vulniq.client.securityanalyzer.oval.error.UnsupportedOVALItemError;
import org.mitre.oval.xmlschema.oval_common_5.CheckEnumeration;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;

import java.util.Collection;

public class CheckEnumerationAnalyzer
{
    public static ResultEnumeration evaluate(CheckEnumeration checkEnumeration, Collection<ResultEnumeration> results) throws UnexpectedOVALEvaluationError
    {
        int trueCount = 0;
        int falseCount = 0;
        int errorCount = 0;
        int unknownCount = 0;
        int notEvaluatedCount = 0;
        int notApplicableCount = 0;
        for(ResultEnumeration tmpRes : results)
        {
            switch (tmpRes)
            {
                case TRUE:
                    trueCount++;
                    break;
                case ERROR:
                    errorCount++;
                    break;
                case FALSE:
                    falseCount++;
                    break;
                case NOT_APPLICABLE:
                    notApplicableCount++;
                    break;
                case NOT_EVALUATED:
                    notEvaluatedCount++;
                    break;
                case UNKNOWN:
                    unknownCount++;
                    break;
                default:
                    TerziLog.supportCase(CheckEnumerationAnalyzer.class.getName(), "Unexpected ResultEnumeration value",
                                        String.valueOf(tmpRes), "You are using OVAL definitions not supported by this application", null);
                        break;
            }
        }
        switch (checkEnumeration)
        {
            case ALL:
                /*
 check attr is ||                             ||  final result is
               || T  | F  | E  | U  | NE | NA ||
---------------||-----------------------------||------------------
               || 1+ | 0  | 0  | 0  | 0  | 0+ ||  True
               || 0+ | 1+ | 0+ | 0+ | 0+ | 0+ ||  False
     ALL       || 0+ | 0  | 1+ | 0+ | 0+ | 0+ ||  Error
               || 0+ | 0  | 0  | 1+ | 0+ | 0+ ||  Unknown
               || 0+ | 0  | 0  | 0  | 1+ | 0+ ||  Not Evaluated
               || 0  | 0  | 0  | 0  | 0  | 1+ ||  Not Applicable
---------------||-----------------------------||------------------
                 */
                if(trueCount>0 && falseCount==0 && errorCount==0 && unknownCount==0 && notEvaluatedCount==0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.TRUE;
                }
                else if(trueCount>=0 && falseCount>0 && errorCount>=0 && unknownCount>=0 && notEvaluatedCount>=0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.FALSE;
                }
                else if(trueCount>=0 && falseCount==0 && errorCount>0 && unknownCount>=0 && notEvaluatedCount>=0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.ERROR;
                }
                else if(trueCount>=0 && falseCount==0 && errorCount==0 && unknownCount>0 && notEvaluatedCount>=0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.UNKNOWN;
                }
                else if(trueCount>=0 && falseCount==0 && errorCount==0 && unknownCount==0 && notEvaluatedCount>0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.NOT_EVALUATED;
                }
                else if(trueCount==0 && falseCount==0 && errorCount==0 && unknownCount==0 && notEvaluatedCount==0 && notApplicableCount>0)
                {
                    return ResultEnumeration.NOT_APPLICABLE;
                }
                break;
            case AT_LEAST_ONE:
/*
 check attr is ||                             ||  final result is
               || T  | F  | E  | U  | NE | NA ||
---------------||-----------------------------||------------------
               || 1+ | 0+ | 0+ | 0+ | 0+ | 0+ ||  True
               || 0  | 1+ | 0  | 0  | 0  | 0+ ||  False
  AT LEAST ONE || 0  | 0+ | 1+ | 0+ | 0+ | 0+ ||  Error
               || 0  | 0+ | 0  | 1+ | 0+ | 0+ ||  Unknown
               || 0  | 0+ | 0  | 0  | 1+ | 0+ ||  Not Evaluated
               || 0  | 0  | 0  | 0  | 0  | 1+ ||  Not Applicable
---------------||-----------------------------||------------------

 */
                if(trueCount>0 && falseCount>=0 && errorCount>=0 && unknownCount>=0 && notEvaluatedCount>=0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.TRUE;
                }
                else if(trueCount==0 && falseCount>0 && errorCount==0 && unknownCount==0 && notEvaluatedCount==0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.FALSE;
                }
                else if(trueCount==0 && falseCount>=0 && errorCount>0 && unknownCount>=0 && notEvaluatedCount>=0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.ERROR;
                }
                //0  | 0+ | 0  | 1+ | 0+ | 0+ ||  Unknown
                else if(trueCount==0 && falseCount>=0 && errorCount==0 && unknownCount>0 && notEvaluatedCount>=0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.UNKNOWN;
                }
                //0  | 0+ | 0  | 0  | 1+ | 0+ ||  Not Evaluated
                else if(trueCount==0 && falseCount>=0 && errorCount==0 && unknownCount==0 && notEvaluatedCount>0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.NOT_EVALUATED;
                }
                //0  | 0  | 0  | 0  | 0  | 1+ ||  Not Applicable
                else if(trueCount==0 && falseCount==0 && errorCount==0 && unknownCount==0 && notEvaluatedCount==0 && notApplicableCount>0)
                {
                    return ResultEnumeration.NOT_APPLICABLE;
                }
                break;
            case NONE_SATISFY:
/*
 check attr is ||                             ||  final result is
               || T  | F  | E  | U  | NE | NA ||
---------------||-----------------------------||------------------
               || 0  | 1+ | 0  | 0  | 0  | 0+ ||  True
               || 1+ | 0+ | 0+ | 0+ | 0+ | 0+ ||  False
  NONE SATISFY || 0  | 0+ | 1+ | 0+ | 0+ | 0+ ||  Error
               || 0  | 0+ | 0  | 1+ | 0+ | 0+ ||  Unknown
               || 0  | 0+ | 0  | 0  | 1+ | 0+ ||  Not Evaluated
               || 0  | 0  | 0  | 0  | 0  | 1+ ||  Not Applicable
---------------||-----------------------------||------------------

 */
                if(trueCount==0 && falseCount>0 && errorCount==0 && unknownCount==0 && notEvaluatedCount==0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.TRUE;
                }
                else if(trueCount>0 && falseCount>=0 && errorCount>=0 && unknownCount>=0 && notEvaluatedCount>=0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.FALSE;
                }
                //0  | 0+ | 1+ | 0+ | 0+ | 0+ ||  Error
                else if(trueCount==0 && falseCount>=0 && errorCount>0 && unknownCount>=0 && notEvaluatedCount>=0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.ERROR;
                }
                //0  | 0+ | 0  | 1+ | 0+ | 0+ ||  Unknown
                else if(trueCount==0 && falseCount>=0 && errorCount==0 && unknownCount>0 && notEvaluatedCount>=0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.UNKNOWN;
                }
                //0  | 0+ | 0  | 0  | 1+ | 0+ ||  Not Evaluated
                else if(trueCount==0 && falseCount>0 && errorCount==0 && unknownCount==0 && notEvaluatedCount>0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.NOT_EVALUATED;
                }
                else if(trueCount==0 && falseCount==0 && errorCount==0 && unknownCount==0 && notEvaluatedCount==0 && notApplicableCount>0)
                {
                    return ResultEnumeration.NOT_APPLICABLE;
                }
                break;
            case ONLY_ONE:
/*
 check attr is ||                             ||  final result is
               || T  | F  | E  | U  | NE | NA ||
---------------||-----------------------------||------------------
               || 1  | 0+ | 0  | 0  | 0  | 0+ ||  True
               || 2+ | 0+ | 0+ | 0+ | 0+ | 0+ ||  ** False **
               || 0  | 1+ | 0  | 0  | 0  | 0+ ||  ** False **
   ONLY ONE    ||0,1 | 0+ | 1+ | 0+ | 0+ | 0+ ||  Error
               ||0,1 | 0+ | 0  | 1+ | 0+ | 0+ ||  Unknown
               ||0,1 | 0+ | 0  | 0  | 1+ | 0+ ||  Not Evaluated
               || 0  | 0  | 0  | 0  | 0  | 1+ ||  Not Applicable
---------------||-----------------------------||------------------

 */
                if(trueCount==1 && falseCount>=0 && errorCount==0 && unknownCount==0 && notEvaluatedCount==0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.TRUE;
                }
                else if(trueCount>1 && falseCount>=0 && errorCount>=0 && unknownCount>=0 && notEvaluatedCount>=0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.FALSE;
                }
                //0  | 1+ | 0  | 0  | 0  | 0+ ||  ** False **
                else if(trueCount==0 && falseCount>0 && errorCount==0 && unknownCount==0 && notEvaluatedCount==0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.FALSE;
                }
                //0,1 | 0+ | 1+ | 0+ | 0+ | 0+ ||  Error
                else if(trueCount<2 && falseCount>=0 && errorCount>0 && unknownCount>=0 && notEvaluatedCount>=0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.ERROR;
                }
                //0,1 | 0+ | 0  | 1+ | 0+ | 0+ ||  Unknown
                else if(trueCount<2 && falseCount>=0 && errorCount==0 && unknownCount>0 && notEvaluatedCount>=0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.UNKNOWN;
                }
                //0,1 | 0+ | 0  | 0  | 1+ | 0+ ||  Not Evaluated
                else if(trueCount<2 && falseCount>=0 && errorCount==0 && unknownCount==0 && notEvaluatedCount>0 && notApplicableCount>=0)
                {
                    return ResultEnumeration.NOT_EVALUATED;
                }
                //0  | 0  | 0  | 0  | 0  | 1+ ||  Not Applicable
                else if(trueCount==0 && falseCount==0 && errorCount==0 && unknownCount==0 && notEvaluatedCount==0 && notApplicableCount>0)
                {
                    return ResultEnumeration.NOT_APPLICABLE;
                }
                break;
            case NONE_EXIST:
                //deprecated and Replaced by the 'none satisfy' value.
                throw new UnsupportedOVALItemError("CheckEnumeration.NONE_EXIST is deprecated and not supported");
        }
        throw new UnexpectedOVALEvaluationError("CheckEnumerationAnalyzer.evaluate should not reach here");
    }
}
