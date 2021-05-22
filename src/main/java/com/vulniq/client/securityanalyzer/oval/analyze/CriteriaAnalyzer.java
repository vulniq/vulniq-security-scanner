

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

import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALUtils;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.mitre.oval.xmlschema.oval_definitions_5.CriteriaType;
import org.mitre.oval.xmlschema.oval_definitions_5.CriterionType;
import org.mitre.oval.xmlschema.oval_definitions_5.ExtendDefinitionType;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CriteriaAnalyzer
{
    private Logger logger = LoggerFactory.getLogger(CriteriaAnalyzer.class);
    private ResultEnumeration finalResult;
    private List<ResultEnumeration> results;
    private List<String> evaluatedItems;
    private CriteriaType criteria;
    private OVALInterpreter ovalInterpreter;

    /**
     * The optional applicability_check attribute provides a Boolean flag that when true indicates that
     * the criterion/criteria/extend_definition is being used to determine whether the OVAL Definition applies
     * to a given system.
     *
     *
     * @param
     * @return
     */
    /*
    public static ResultEnumeration applyApplicabilityCheck(ResultEnumeration currentResult, Boolean applicabilityCheck)
    {

    }
    */

    public ResultEnumeration getFinalResult()
    {
        if(finalResult==null)
        {
            analyze();
        }
        return finalResult;
    }

    public CriteriaAnalyzer(OVALInterpreter interpreter, CriteriaType criteriaParam)
    {
        this.criteria = criteriaParam;
        this.ovalInterpreter = interpreter;
        this.results = new LinkedList<>();
        this.evaluatedItems = new LinkedList<>();
    }

    public void analyze()
    {
        logger.debug("CriteriaAnalyzer.analyze begin " + StringUtils.emptyStringIfNull(criteria.getComment()));
        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Criteria, null,
                "Starting to evaluate criteria",
                CollectionUtils.mapFromArgs("comment", criteria.getComment()));

        int childCriteriaCounter = 0;

        for(Object child : criteria.getCriteriaOrCriterionOrExtendDefinition())
        {
            if(child instanceof  CriteriaType)
            {
                childCriteriaCounter++;
                CriteriaType childAsCriteria = (CriteriaType) child;

                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Criteria, null,
                        "Found child criteria", null);

                logger.debug("CriteriaAnalyzer.analyze child CriteriaType " + StringUtils.emptyStringIfNull(childAsCriteria.getComment()));

                CriteriaAnalyzer childAnalyzer = new CriteriaAnalyzer(ovalInterpreter, childAsCriteria);
                ResultEnumeration childResult = childAnalyzer.getFinalResult();

                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.Criteria, null, "Evaluated child criteria ",
                        CollectionUtils.mapFromArgs("result", childResult));
                //Note: CriteriaAnalyzer returns negated result, do not negate again

                evaluatedItems.add("child_criteria_" + childCriteriaCounter);
                results.add(childResult);
                if(childAsCriteria.isApplicabilityCheck()!=null && childAsCriteria.isApplicabilityCheck())
                {
                    if(childResult!=ResultEnumeration.TRUE)
                    {
                        finalResult = ResultEnumeration.NOT_APPLICABLE;
                        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.Criteria, null,
                                "Child criteria is an applicability check and final result is set to NOT_APPLICABLE because the result for child was not TRUE",
                                CollectionUtils.mapFromArgs("commentForChild", childAsCriteria.getComment()));

                        logger.debug("CriteriaAnalyzer.analyze child ["+StringUtils.emptyStringIfNull(childAsCriteria.getComment()) +"] " +
                                        "CriteriaType " + StringUtils.emptyStringIfNull(childAsCriteria.getComment()) +
                                        " finalResult = ResultEnumeration.NOT_APPLICABLE because this is an applicability check and child criteria did not return true");
                        return;
                    }
                    else
                    {
                        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Criteria, null,
                                "Child result is TRUE, applicability will not change the outcome",
                                null);
                    }
                }
            }
            else if(child instanceof CriterionType)
            {
                CriterionType criterion = (CriterionType) child;
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Criteria, null,
                        "Found child criterion" ,
                        CollectionUtils.mapFromArgs("commentForChild", criterion.getComment()));

                logger.debug("CriteriaAnalyzer.analyze child CriterionType " + StringUtils.emptyStringIfNull(criterion.getComment()));
                ResultEnumeration testResult = ovalInterpreter.evaluateTest(criterion.getTestRef());
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.Criteria, null,
                        "Evaluated child criterion" ,
                        CollectionUtils.mapFromArgs("criterionComment", criterion.getComment(),
                                "test", criterion.getTestRef(),
                                "result", testResult));

                if(criterion.isNegate())
                {
                    ResultEnumeration resultBeforeNegation = testResult;
                    testResult = AnalyzerUtils.negateResult(testResult);

                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Criteria, null,
                            "Criterion has negate set, negating the result" ,
                            CollectionUtils.mapFromArgs("resultBeforeNegate", resultBeforeNegation,
                                    "resultAfterNegate", testResult));
                }
                evaluatedItems.add(criterion.getTestRef());
                results.add(testResult);
                if(criterion.isApplicabilityCheck()!=null && criterion.isApplicabilityCheck())
                {
                    if(testResult!=ResultEnumeration.TRUE)
                    {
                        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Criteria, null,
                                "Child is an applicability check and final result is set to NOT_APPLICABLE because the result for child was not TRUE" ,
                                null);
                        logger.debug("CriteriaAnalyzer.analyze child CriterionType " + StringUtils.emptyStringIfNull(criterion.getComment()) + " finalResult = ResultEnumeration.NOT_APPLICABLE because this is an applicability check and test did not return true");
                        finalResult = ResultEnumeration.NOT_APPLICABLE;
                        return;
                    }
                    else
                    {
                        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Criteria, null,
                                "Child result is TRUE, applicability check will not change the outcome" ,
                                null);
                    }
                }
            }
            else if(child instanceof ExtendDefinitionType)
            {
                ExtendDefinitionType extendDefinition = (ExtendDefinitionType) child;
                ovalInterpreter.increaseLogIndent();
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.ExtendedDefinition, extendDefinition.getDefinitionRef(),
                        "Found child extended definition" ,
                        null);

                logger.debug("CriteriaAnalyzer.analyze child ExtendDefinitionType " + StringUtils.emptyStringIfNull(extendDefinition.getDefinitionRef()));
                ResultEnumeration childResult = ovalInterpreter.evaluateDefinition(extendDefinition.getDefinitionRef());

                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.Criteria, null,
                        "Finished evaluating extended definition" ,
                        CollectionUtils.mapFromArgs("childResult", childResult));
                ovalInterpreter.decreaseLogIndent();

                if(extendDefinition.isNegate())
                {
                    ResultEnumeration resultBeforeNegation = childResult;
                    childResult = AnalyzerUtils.negateResult(childResult);

                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.ExtendedDefinition, extendDefinition.getDefinitionRef(),
                            "Extended definition has negate set, negating the result" ,
                            CollectionUtils.mapFromArgs("resultBeforeNegate", resultBeforeNegation,
                                    "resultAfterNegate", childResult));
                }
                evaluatedItems.add(extendDefinition.getDefinitionRef());
                results.add(childResult);
                if(extendDefinition.isApplicabilityCheck()!=null && extendDefinition.isApplicabilityCheck())
                {
                    if(childResult!=ResultEnumeration.TRUE)
                    {
                        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.ExtendedDefinition, extendDefinition.getDefinitionRef(),
                                "Child is an applicability check and final result is set to NOT_APPLICABLE because the result for child was not TRUE" ,
                                null);
                        finalResult = ResultEnumeration.NOT_APPLICABLE;
                        logger.debug("CriteriaAnalyzer.analyze child ExtendDefinitionType " + StringUtils.emptyStringIfNull(extendDefinition.getDefinitionRef()) + " finalResult = ResultEnumeration.NOT_APPLICABLE because this is an applicability check and child did not return true");
                        return;
                    }
                    else
                    {
                        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.ExtendedDefinition, extendDefinition.getDefinitionRef(),
                                "Child result is TRUE, applicability check will not change the outcome",
                                null);
                    }
                }
            }
            else
            {
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Criteria, null,
                        "Unexpected child criteria type",
                        CollectionUtils.mapFromArgs("class", child.getClass().getName()));

                throw new IllegalArgumentException("Unexpected child criteria type " + child);
            }
        }

        //now combine results to find the final result
        try
        {
            logger.debug("results=" + results + " evaluatedItems=" + evaluatedItems );
            finalResult = OperatorAnalyzer.evaluate(criteria.getOperator(), results);
            logger.debug("CriteriaAnalyzer.analyze end " + StringUtils.emptyStringIfNull(criteria.getComment()) + " finalResult=" + finalResult);
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Criteria, null,
                    "Final result after combining results",
                    CollectionUtils.mapFromArgs(
                            "operator", criteria.getOperator(),
                            "criteriaComment", criteria.getComment(),
                            "evaluatedItems", evaluatedItems,
                            "results", results,
                            "finalResult", finalResult));

        }
        catch (Exception ex)
        {
            logger.debug("CriteriaAnalyzer.analyze end " + StringUtils.emptyStringIfNull(criteria.getComment()) + " finalResult=ERROR due to an exception", ex);
            finalResult = ResultEnumeration.ERROR;
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Criteria, null,
                    "Error combining results for criteria",
                    CollectionUtils.mapFromArgs(
                            "operator", criteria.getOperator(),
                            "criteriaComment", criteria.getComment(),
                            "error", ex.getMessage()));
        }

        if(criteria.isNegate())
        {
            ResultEnumeration resultBeforeNegation = finalResult;
            finalResult = AnalyzerUtils.negateResult(finalResult);
            logger.debug("CriteriaAnalyzer.analyze end " + StringUtils.emptyStringIfNull(criteria.getComment()) + " isNegate is true. finalResult after negation=" + finalResult);
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Criteria, null,
                    "Negate is set for criteria",
                    CollectionUtils.mapFromArgs(
                            "operator", criteria.getOperator(),
                            "criteriaComment", criteria.getComment(),
                            "resultBeforeNegate", resultBeforeNegation,
                            "finalResult", finalResult));
        }

    }


}
