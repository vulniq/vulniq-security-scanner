
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

import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.OVALObjectImplBase;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.variables.LocalVariableImpl;
import com.vulniq.client.securityanalyzer.oval.error.OVALFunctionError;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.ArithmeticFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.BeginFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.ConcatFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.ConstantVariable;
import org.mitre.oval.xmlschema.oval_definitions_5.EndFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.EscapeRegexFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.ExternalVariable;
import org.mitre.oval.xmlschema.oval_definitions_5.GlobToRegexFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.LiteralComponentType;
import org.mitre.oval.xmlschema.oval_definitions_5.LocalVariable;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectComponentType;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.RegexCaptureFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.SplitFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.SubstringFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.TimeDifferenceFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.ValueType;
import org.mitre.oval.xmlschema.oval_definitions_5.VariableComponentType;
import org.mitre.oval.xmlschema.oval_definitions_5.VariableType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class FunctionEvaluatorBase
{
    protected List<ComponentGroup> childResults = new ArrayList<>();
    protected List<ComponentGroup> finalResults;
    protected OVALInterpreter interpreter;
    private static final Logger logger = LoggerFactory.getLogger(FunctionEvaluatorBase.class);
    
    public FunctionEvaluatorBase(OVALInterpreter interpreter)
    {
        this.interpreter = interpreter;
    }
    
    public FunctionEvaluatorBase getEvaluator(Object functionType)
    {
        if (functionType instanceof ArithmeticFunctionType)
        {
            ArithmeticFunctionType function = (ArithmeticFunctionType) functionType;
            return new ArithmeticFunctionEvaluator(function, interpreter);
        }
        else if (functionType instanceof ConcatFunctionType)
        {
            ConcatFunctionType function = (ConcatFunctionType) functionType;
            return new ConcatFunctionEvaluator(function, interpreter);
        }
        else if (functionType instanceof BeginFunctionType)
        {
            BeginFunctionType function = (BeginFunctionType) functionType;
            return new BeginFunctionEvaluator(function, interpreter);
        }
        else if (functionType instanceof EndFunctionType)
        {
            EndFunctionType function = (EndFunctionType) functionType;
            return new EndFunctionEvaluator(function, interpreter);
        }
        else if (functionType instanceof EscapeRegexFunctionType)
        {
            EscapeRegexFunctionType function = (EscapeRegexFunctionType) functionType;
            return new EscapeRegexFunctionEvaluator(function, interpreter);
        }
        else if (functionType instanceof GlobToRegexFunctionType)
        {
            GlobToRegexFunctionType function = (GlobToRegexFunctionType) functionType;
            return new GlobToRegexFunctionEvaluator(function, interpreter);
        }
        else if (functionType instanceof RegexCaptureFunctionType)
        {
            RegexCaptureFunctionType function = (RegexCaptureFunctionType) functionType;
            return new RegexCaptureFunctionEvaluator(function, interpreter);
        }
        else if (functionType instanceof SplitFunctionType)
        {
            SplitFunctionType function = (SplitFunctionType) functionType;
            return new SplitFunctionEvaluator(function, interpreter);
        }
        else if (functionType instanceof SubstringFunctionType)
        {
            SubstringFunctionType function = (SubstringFunctionType) functionType;
            return new SubstringFunctionEvaluator(function, interpreter);
        }
        else if (functionType instanceof TimeDifferenceFunctionType)
        {
            TimeDifferenceFunctionType function = (TimeDifferenceFunctionType) functionType;
            return new TimeDifferenceFunctionEvaluator(function, interpreter);
        }
        //interpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Variable, this.getId(), "Invalid Type of OVAL Function Type.", null);
        return null;
    }
    
    public List<ComponentGroup> getFinalResults()
    {
        return finalResults;
    }
    
    public void computeValue() throws Exception
    {
        try
        {
            if (hasChildFunction())
            {
                List<Object> components = this.getComponents();
                for (Object component : components)
                {
                    if (component != null)
                    {
                        FunctionEvaluatorBase evaluator = getEvaluator(component);
                        evaluator.computeValue();
                        childResults = evaluator.getFinalResults();
                    }
                }
            }
            this.finalResults = evaluate();
        }
        catch (Exception ex)
        {
            logger.error("An error occurred while analyzing OVAL Function.");
            throw new OVALFunctionError("Related error occurred in: " + this.getClass().toString());
        }
    }
    
    protected abstract List<Object> getComponents();
    
    protected abstract List<ComponentGroup> evaluate() throws UnexpectedOVALEvaluationError;
    
    protected boolean hasChildFunction()
    {
        List<Object> components = this.getComponents();
        
        for (Object component : components)
        {
            if (component instanceof ObjectComponentType || component instanceof VariableComponentType || component instanceof LiteralComponentType)
            {
                return false;
            }
        }
        return true;
    }
    
    protected List<ComponentGroup> resolveObjectComponent(ObjectComponentType objectComponentType)
    {
        ObjectType ovalObject = OVALXMLLoader.loadObject(interpreter.getDataSourceGuid(), objectComponentType.getObjectRef(),
                                                         interpreter.getOsInfo().getDisplayVersion(), null);
        OVALObjectImplBase impl = OVALObjectImplBase.getInstance(ovalObject, interpreter);
        
        Map<String, List<String>> itemFields = impl.getCollectedItems();
    
        if(itemFields == null)
        {
            return new ArrayList<>();
        }
        List<String> itemValues = itemFields.get(objectComponentType.getItemField());
    
        if(itemValues == null)
        {
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
            return componentGroups;
        }
    }
    
    protected List<ComponentGroup> resolveVariableComponent(VariableComponentType variableComponent) throws UnexpectedOVALEvaluationError
    {
        List<ComponentGroup> componentGroupValues = new ArrayList<>();
        VariableType variableType = OVALXMLLoader.loadVariable(interpreter.getDataSourceGuid(),
                                                               variableComponent.getVarRef(),
                                                               interpreter.getOsInfo().getDisplayVersion(), null);
        
        if (variableType instanceof ConstantVariable)
        {
            ConstantVariable constantVariable = (ConstantVariable) variableType;
            SimpleDatatypeEnumeration datatype = constantVariable.getDatatype();
            for (ValueType valueType : constantVariable.getValue())
            {
                ComponentGroup componentGroup = new ComponentGroup();
                componentGroup.setDataType(datatype);
                componentGroup.setValue(valueType.getValue().toString());
                componentGroupValues.add(componentGroup);
            }
            return componentGroupValues;
        }
        else if(variableType instanceof LocalVariable)
        {
            LocalVariable localVariable = (LocalVariable) variableType;
            LocalVariableImpl impl = new LocalVariableImpl(interpreter,localVariable);
            return impl.evaluate();
        }
        else if (variableType instanceof ExternalVariable)
        {
            ExternalVariable externalVariable = (ExternalVariable) variableType;
            logger.error("External Variable is not yet implemented to Terzi, related variable Id is, " + externalVariable.getId() + ", with comment: " + externalVariable.getComment());
            throw new UnexpectedOVALEvaluationError("External Variable is not yet implemented to Terzi, related variable Id is, " + externalVariable.getId());
        }
        return null; // TODO: Never should reach here, be sure.
    }
    
    protected List<List<ComponentGroup>> resolveComponentGroups() throws UnexpectedOVALEvaluationError
    {
        List<Object> components = this.getComponents();
        List<List<ComponentGroup>> resolvedComponents = new ArrayList<>();
        
        for (Object component : components)
        {
            ComponentGroup componentGroup = new ComponentGroup();
            List<ComponentGroup> componentGroupValues = new ArrayList<>();
            if (component instanceof ObjectComponentType)
            {
                List<ComponentGroup> resolvedObjects = resolveObjectComponent((ObjectComponentType) component);
                if(resolvedObjects != null && !resolvedObjects.isEmpty())
                {
                    resolvedComponents.add(resolvedObjects);
                }
            }
            else if (component instanceof VariableComponentType)
            {
                componentGroupValues = resolveVariableComponent((VariableComponentType) component);
                resolvedComponents.add(componentGroupValues);
            }
            else if (component instanceof LiteralComponentType)
            {
                LiteralComponentType literalComponent = (LiteralComponentType) component;
                componentGroup.setValue(literalComponent.getValue().toString());
                componentGroup.setDataType(literalComponent.getDatatype());
                componentGroupValues.add(componentGroup);
                resolvedComponents.add(componentGroupValues);
            }
        }
        return resolvedComponents;
    }
    
    protected List<List<ComponentGroup>> findCartesianProduct(List<List<ComponentGroup>> input)
    {
        List<List<ComponentGroup>> residual = new ArrayList<>();
        if (input.isEmpty())
        {
            residual.add(new ArrayList<>());
            return residual;
        }
        else
        {
            process(input, residual);
        }
        return residual;
    }
    
    private void process(List<List<ComponentGroup>> lists, List<List<ComponentGroup>> residual)
    {
        List<ComponentGroup> heads = lists.get(0);
        List<List<ComponentGroup>> tails = findCartesianProduct(lists.subList(1, lists.size()));
        
        for (ComponentGroup head : heads)
        {
            for (List<ComponentGroup> tail : tails)
            {
                List<ComponentGroup> tmp = new ArrayList<>(tail.size());
                tmp.add(head);
                tmp.addAll(tail);
                residual.add(tmp);
            }
        }
    }
}
