

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
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.ConcatFunctionType;

import java.util.ArrayList;
import java.util.List;

public class ConcatFunctionEvaluator extends FunctionEvaluatorBase
{
    private final ConcatFunctionType functionType;
    
    public ConcatFunctionEvaluator(ConcatFunctionType functionType, OVALInterpreter interpreter)
    {
        super(interpreter);
        this.functionType = functionType;
    }
    
    @Override
    public List<Object> getComponents()
    {
        return functionType.getObjectComponentOrVariableComponentOrLiteralComponent();
    }
    
    private List<ComponentGroup> evaluateConcatFunction(List<List<ComponentGroup>> cartesianProduct)
    {
        List<ComponentGroup> rv = new ArrayList<>();
        for (List<ComponentGroup> groups : cartesianProduct)
        {
            StringBuilder sb = new StringBuilder();
            for (ComponentGroup iteratorGroup : groups)
            {
                sb.append(iteratorGroup.getValue());
            }
            ComponentGroup group = new ComponentGroup();
            group.setValue(sb.toString());
            group.setDataType(SimpleDatatypeEnumeration.STRING);
            rv.add(group);
        }
        return rv;
    }
    
    @Override
    public List<ComponentGroup> evaluate() throws UnexpectedOVALEvaluationError
    {
        List<List<ComponentGroup>> componentGroups = resolveComponentGroups();
        
        List<List<ComponentGroup>> cartesianProduct = findCartesianProduct(componentGroups);
        
        if (childResults.isEmpty())
        {
            return evaluateConcatFunction(cartesianProduct);
        }
        else
        {
            List<List<ComponentGroup>> childGroups = new ArrayList<>();
            childGroups.add(childResults);
            if (componentGroups.size() > 0)
            {
                for (List<ComponentGroup> groups : cartesianProduct)
                {
                    childGroups.add(groups);
                }
            }
            List<List<ComponentGroup>> cartesianWithChildValues = findCartesianProduct(childGroups);
            return evaluateConcatFunction(cartesianWithChildValues);
        }
    }
}
