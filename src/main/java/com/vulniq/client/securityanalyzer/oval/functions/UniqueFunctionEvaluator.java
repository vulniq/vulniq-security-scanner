
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
import org.mitre.oval.xmlschema.oval_definitions_5.UniqueFunctionType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueFunctionEvaluator extends FunctionEvaluatorBase
{
    private final UniqueFunctionType functionType;

    public UniqueFunctionEvaluator(UniqueFunctionType functionType, OVALInterpreter interpreter)
    {
        super(interpreter);
        this.functionType = functionType;
    }
    
    @Override
    protected List<Object> getComponents()
    {
        return functionType.getObjectComponentOrVariableComponentOrLiteralComponent();
    }
    
    private List<ComponentGroup> evaluateUniqueFunction(List<List<ComponentGroup>> cartesianProduct)
    {
        Set<ComponentGroup> uniqueValues = new HashSet<>();
    
        for (List<ComponentGroup> groups : cartesianProduct)
        {
            for (ComponentGroup group : groups)
            {
                uniqueValues.add(group);
            }
        }
    
        return new ArrayList<>(uniqueValues);
    }
    
    @Override
    protected List<ComponentGroup> evaluate() throws UnexpectedOVALEvaluationError
    {
        List<List<ComponentGroup>> componentGroups = resolveComponentGroups();
        List<List<ComponentGroup>> cartesianProduct = findCartesianProduct(componentGroups);
        
        if(childResults.isEmpty())
        {
            return evaluateUniqueFunction(cartesianProduct);
        }
        else
        {
            List<List<ComponentGroup>> childGroups = new ArrayList<>();
            childGroups.add(childResults);
            if(componentGroups.size() > 0)
            {
                for (List<ComponentGroup> groups : cartesianProduct)
                {
                    childGroups.add(groups);
                }
            }
            List<List<ComponentGroup>> cartesianWithChildValues = findCartesianProduct(childGroups);
            return evaluateUniqueFunction(cartesianWithChildValues);
        }
    }
}
