
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

import org.mitre.oval.xmlschema.oval_common_5.OperatorEnumeration;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;

import java.util.List;

public class AnalyzerUtils
{

    public static ResultEnumeration negateResult(ResultEnumeration result)
    {
        if(result == ResultEnumeration.TRUE) {
            return ResultEnumeration.FALSE;
        } else if(result == ResultEnumeration.FALSE) {
            return ResultEnumeration.TRUE;
        } else {
            return result;
        }
    }

    public static ResultEnumeration combineResultsByOperator(List<ResultEnumeration> results, OperatorEnumeration ovalOperator)
    {
        ResultEnumeration combinedResult = ResultEnumeration.UNKNOWN;
        if(results == null || results.size()==0)
        {
            combinedResult = ResultEnumeration.UNKNOWN;
        }
        int trueCount = 0;
        int falseCount = 0;
        int unknownCount = 0;
        int errorCount = 0;
        int notEvaluatedCount = 0;
        int notApplicableCount = 0;
        for(ResultEnumeration tmpRes : results)
        {
            switch (tmpRes)
            {
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
                case TRUE:
                    trueCount++;
                    break;
                case UNKNOWN:
                    unknownCount++;
                    break;
            }
        }
        // first check for a possible Not Applicable result
        if(notApplicableCount > 0 && notEvaluatedCount == 0 && falseCount == 0 && errorCount == 0 && unknownCount == 0 && trueCount == 0) {
            return ResultEnumeration.NOT_APPLICABLE;
        }
        switch(ovalOperator)
        {
            case OR:
                if(trueCount > 0) {
                    combinedResult = ResultEnumeration.TRUE;
                } else if(falseCount > 0 && trueCount == 0 && unknownCount == 0 &&  errorCount == 0 &&  notEvaluatedCount == 0) {
                    combinedResult = ResultEnumeration.FALSE;
                } else if(errorCount > 0 && trueCount == 0) {
                    combinedResult = ResultEnumeration.ERROR;
                } else if(unknownCount > 0 && trueCount == 0 && errorCount == 0) {
                    combinedResult = ResultEnumeration.UNKNOWN;
                } else if(notEvaluatedCount > 0 && unknownCount == 0 && trueCount == 0 && errorCount == 0) {
                    combinedResult = ResultEnumeration.NOT_EVALUATED;
                }
                break;
            case AND:
                if(trueCount > 0 && falseCount == 0 && errorCount == 0 && unknownCount == 0 && notEvaluatedCount == 0) {
                    combinedResult = ResultEnumeration.TRUE;
                } else if(falseCount > 0) {
                    combinedResult = ResultEnumeration.FALSE;
                } else if(falseCount == 0 && errorCount > 0) {
                    combinedResult = ResultEnumeration.ERROR;
                } else if(unknownCount > 0 && falseCount == 0 && errorCount == 0) {
                    combinedResult = ResultEnumeration.UNKNOWN;
                } else if(notEvaluatedCount > 0 && falseCount == 0 && errorCount == 0 && unknownCount == 0) {
                    combinedResult = ResultEnumeration.NOT_EVALUATED;
                }
                break;
            case ONE:
                if(trueCount == 1 && falseCount >= 0 && errorCount == 0 && unknownCount == 0 && notEvaluatedCount == 0 && notApplicableCount >= 0) {
                    combinedResult = ResultEnumeration.TRUE;
                } else if(trueCount >= 2 && falseCount >= 0 && errorCount >= 0 && unknownCount >= 0 && notEvaluatedCount >= 0 && notApplicableCount >= 0) {
                    combinedResult = ResultEnumeration.FALSE;
                } else if(trueCount == 0 && falseCount >= 0 && errorCount == 0 && unknownCount == 0 && notEvaluatedCount == 0 && notApplicableCount >= 0) {
                    combinedResult = ResultEnumeration.FALSE;
                } else if((trueCount == 0 || trueCount == 1) && falseCount >= 0 && errorCount >= 1 && unknownCount >= 0 && notEvaluatedCount >= 0 && notApplicableCount >= 0) {
                    combinedResult = ResultEnumeration.ERROR;
                } else if((trueCount == 0 || trueCount == 1) && falseCount >= 0 && errorCount == 0 && unknownCount >= 1 && notEvaluatedCount >= 0 && notApplicableCount >= 0) {
                    combinedResult = ResultEnumeration.UNKNOWN;
                } else if((trueCount == 0 || trueCount == 1) && falseCount >= 0 && errorCount == 0 && unknownCount == 0&& notEvaluatedCount >= 1 && notApplicableCount >= 0) {
                    combinedResult = ResultEnumeration.NOT_EVALUATED;
                }
                break;
            case XOR:
                if(trueCount%2 == 1 && notEvaluatedCount == 0 && unknownCount == 0 && errorCount == 0) {
                    combinedResult = ResultEnumeration.TRUE;
                } else if(trueCount%2 == 0 && notEvaluatedCount == 0 && unknownCount == 0 && errorCount == 0) {
                    combinedResult = ResultEnumeration.FALSE;
                } else if(errorCount > 0) {
                    combinedResult = ResultEnumeration.ERROR;
                } else if(unknownCount > 0 && errorCount == 0) {
                    combinedResult = ResultEnumeration.UNKNOWN;
                } else if(notEvaluatedCount > 0 && unknownCount == 0 && errorCount == 0) {
                    combinedResult = ResultEnumeration.NOT_EVALUATED;
                }
                break;
        }
        return combinedResult;
    }
}
