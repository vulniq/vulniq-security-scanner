
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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.variables;

import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.OVALObjectImplBase;
import com.vulniq.client.securityanalyzer.oval.functions.ArithmeticFunctionEvaluator;
import com.vulniq.client.securityanalyzer.oval.functions.BeginFunctionEvaluator;
import com.vulniq.client.securityanalyzer.oval.functions.ComponentGroup;
import com.vulniq.client.securityanalyzer.oval.functions.ConcatFunctionEvaluator;
import com.vulniq.client.securityanalyzer.oval.functions.EndFunctionEvaluator;
import com.vulniq.client.securityanalyzer.oval.functions.EscapeRegexFunctionEvaluator;
import com.vulniq.client.securityanalyzer.oval.functions.GlobToRegexFunctionEvaluator;
import com.vulniq.client.securityanalyzer.oval.functions.RegexCaptureFunctionEvaluator;
import com.vulniq.client.securityanalyzer.oval.functions.SplitFunctionEvaluator;
import com.vulniq.client.securityanalyzer.oval.functions.SubstringFunctionEvaluator;
import com.vulniq.client.securityanalyzer.oval.functions.TimeDifferenceFunctionEvaluator;
import com.vulniq.client.securityanalyzer.oval.functions.UniqueFunctionEvaluator;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.ArithmeticFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.BeginFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.ConcatFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.EndFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.EscapeRegexFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.GlobToRegexFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.LiteralComponentType;
import org.mitre.oval.xmlschema.oval_definitions_5.LocalVariable;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectComponentType;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.RegexCaptureFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.SplitFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.SubstringFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.TimeDifferenceFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.UniqueFunctionType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LocalVariableImpl
{
    private static final Logger logger = LoggerFactory.getLogger(LocalVariableImpl.class);
    private final LocalVariable localVariable;
    private final OVALInterpreter interpreter;
    
    public LocalVariableImpl(OVALInterpreter interpreter, LocalVariable localVariable)
    {
        this.interpreter = interpreter;
        this.localVariable = localVariable;
    }
    
    public List<ComponentGroup> evaluate()
    {
        LocalVariable initialVariable = localVariable;
        try
        {
            if (initialVariable.getArithmetic() != null)
            {
                logger.debug("evaluate arithmetic");
                ArithmeticFunctionType arithmetic = initialVariable.getArithmetic();
                ArithmeticFunctionEvaluator evaluator = new ArithmeticFunctionEvaluator(arithmetic, interpreter);
                evaluator.computeValue();
                return evaluator.getFinalResults();
            }
            else if (initialVariable.getConcat() != null)
            {
                logger.debug("evaluate concat");
                ConcatFunctionType concat = initialVariable.getConcat();
                ConcatFunctionEvaluator evaluator = new ConcatFunctionEvaluator(concat, interpreter);
                evaluator.computeValue();
                return evaluator.getFinalResults();
            }
            else if (initialVariable.getBegin() != null)
            {
                logger.debug("evaluate begin");
                BeginFunctionType begin = initialVariable.getBegin();
                BeginFunctionEvaluator evaluator = new BeginFunctionEvaluator(begin, interpreter);
                evaluator.computeValue();
                return evaluator.getFinalResults();
            }
            else if (initialVariable.getUnique() != null)
            {
                logger.debug("evaluate unique");
                UniqueFunctionType unique = initialVariable.getUnique();
                UniqueFunctionEvaluator evaluator = new UniqueFunctionEvaluator(unique, interpreter);
                evaluator.computeValue();
                return evaluator.getFinalResults();
            }
            else if (initialVariable.getEnd() != null)
            {
                logger.debug("evaluate end");
                EndFunctionType end = initialVariable.getEnd();
                EndFunctionEvaluator evaluator = new EndFunctionEvaluator(end, interpreter);
                evaluator.computeValue();
                return evaluator.getFinalResults();
            }
            else if (initialVariable.getEscapeRegex() != null)
            {
                logger.debug("evaluate escapeRegex");
                EscapeRegexFunctionType escapeRegex = initialVariable.getEscapeRegex();
                EscapeRegexFunctionEvaluator evaluator = new EscapeRegexFunctionEvaluator(escapeRegex, interpreter);
                evaluator.computeValue();
                return evaluator.getFinalResults();
            }
            else if (initialVariable.getGlobToRegex() != null)
            {
                logger.debug("evaluate globToRegex");
                GlobToRegexFunctionType globToRegex = initialVariable.getGlobToRegex();
                GlobToRegexFunctionEvaluator evaluator = new GlobToRegexFunctionEvaluator(globToRegex, interpreter);
                evaluator.computeValue();
                return evaluator.getFinalResults();
            }
            else if (initialVariable.getRegexCapture() != null)
            {
                logger.debug("evaluate regexCapture");
                RegexCaptureFunctionType regexCapture = initialVariable.getRegexCapture();
                RegexCaptureFunctionEvaluator evaluator = new RegexCaptureFunctionEvaluator(regexCapture, interpreter);
                evaluator.computeValue();
                return evaluator.getFinalResults();
            }
            else if (initialVariable.getSplit() != null)
            {
                logger.debug("evaluate split");
                SplitFunctionType split = initialVariable.getSplit();
                SplitFunctionEvaluator evaluator = new SplitFunctionEvaluator(split, interpreter);
                evaluator.computeValue();
                return evaluator.getFinalResults();
            }
            else if (initialVariable.getSubstring() != null)
            {
                logger.debug("evaluate substring");
                SubstringFunctionType substring = initialVariable.getSubstring();
                SubstringFunctionEvaluator evaluator = new SubstringFunctionEvaluator(substring, interpreter);
                evaluator.computeValue();
                return evaluator.getFinalResults();
            }
            else if (initialVariable.getTimeDifference() != null)
            {
                logger.debug("evaluate timeDifference");
                TimeDifferenceFunctionType timeDifference = initialVariable.getTimeDifference();
                TimeDifferenceFunctionEvaluator evaluator = new TimeDifferenceFunctionEvaluator(timeDifference, interpreter);
                evaluator.computeValue();
                return evaluator.getFinalResults();
            }
            else if (initialVariable.getObjectComponent() != null)
            {
                logger.debug("evaluate objectComponent");
                ObjectComponentType objectComponent = initialVariable.getObjectComponent();
                return resolveObjectComponent(objectComponent);
            }
            else if (initialVariable.getLiteralComponent() != null)
            {
                logger.debug("evaluate LiteralComponent");
                LiteralComponentType literalComponent = initialVariable.getLiteralComponent();
                ComponentGroup componentGroup = new ComponentGroup();
                componentGroup.setDataType(literalComponent.getDatatype());
                componentGroup.setValue(String.valueOf(literalComponent.getValue()));
                List<ComponentGroup> rv = new LinkedList<ComponentGroup>();
                rv.add(componentGroup);
                return rv;
            }
        }
        catch (Exception ex)
        {
            logger.error("An error occurred while analyzing variable with ID: " + initialVariable.getId(), ex);
            interpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Variable,
                    initialVariable.getId(),
                    "Error evaluating function.", CollectionUtils.mapFromArgs("error", ex.getMessage()));
            return null;
        }
        interpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Variable, initialVariable.getId(), "Invalid type of OVAL Function or the Function is not defined properly.", null);
        return null;
    }
    
    private List<ComponentGroup> resolveObjectComponent(ObjectComponentType objectComponentType)
    {
        ObjectType ovalObject = OVALXMLLoader.loadObject(interpreter.getDataSourceGuid(), objectComponentType.getObjectRef(),
                                                         interpreter.getOsInfo().getDisplayVersion(), null);
        OVALObjectImplBase impl = OVALObjectImplBase.getInstance(ovalObject, interpreter);
        
        Map<String, List<String>> itemFields = impl.getCollectedItems();
        
        if(itemFields == null)
        {
            logger.debug("resolveObjectComponent itemFields is null");
            return new ArrayList<>();
        }
        List<String> itemValues = itemFields.get(objectComponentType.getItemField());
        
        if(itemValues == null)
        {
            logger.debug("resolveObjectComponent itemValues is null");
            return null;
        }
        else
        {
            ArrayList<ComponentGroup> componentGroups = new ArrayList<>();
            for (String itemValue : itemValues)
            {
                ComponentGroup group = new ComponentGroup();
                group.setDataType(SimpleDatatypeEnumeration.STRING);
                group.setValue(itemValue);
                componentGroups.add(group);
            }
            if(logger.isDebugEnabled())
            {
                logger.debug("resolveObjectComponent returning:" + StringUtils.toJson(componentGroups, false));
            }
            return componentGroups;
        }
    }
    
}
