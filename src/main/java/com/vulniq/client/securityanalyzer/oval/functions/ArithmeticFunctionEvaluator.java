
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
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.ArithmeticEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.ArithmeticFunctionType;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticFunctionEvaluator extends FunctionEvaluatorBase
{
    ArithmeticFunctionType functionType;
    
    public ArithmeticFunctionEvaluator(ArithmeticFunctionType functionType, OVALInterpreter interpreter)
    {
        super(interpreter);
        this.functionType = functionType;
    }
    
    @Override
    public List<Object> getComponents()
    {
        return functionType.getObjectComponentOrVariableComponentOrLiteralComponent();
    }
    
    @Override
    public List<ComponentGroup> evaluate() throws UnexpectedOVALEvaluationError
    {
        List<List<ComponentGroup>> resolvedComponents = resolveComponentGroups();
        
        List<List<ComponentGroup>> cartesianProduct = new ArrayList<>();
        if (!childResults.isEmpty())
        {
            cartesianProduct.add(childResults);
        }
        else
        {
            cartesianProduct = findCartesianProduct(resolvedComponents);
        }
        List<ComponentGroup> rv = new ArrayList<>();
        boolean intFlag = true;
        ArithmeticEnumeration operation = functionType.getArithmeticOperation();
        for (List<ComponentGroup> componentGroups : cartesianProduct)
        {
            intFlag = true;
            Float tempResult;
            if (operation == ArithmeticEnumeration.ADD)
            {
                tempResult = 0f;
            }
            else
            {
                tempResult = 1f;
            }
            
            for (ComponentGroup componentGroup : componentGroups)
            {
                if (componentGroup.getDataType() == SimpleDatatypeEnumeration.FLOAT)
                {
                    intFlag = false;
                }
                Float value = StringUtils.parseFloat(componentGroup.getValue(), 0.0f);
                
                switch (operation)
                {
                    case ADD:
                        tempResult = tempResult + value;
                        break;
                    case MULTIPLY:
                        tempResult = tempResult * value;
                        break;
                }
            }
            ComponentGroup component = new ComponentGroup();
            
            if (intFlag)
            {
                component.setValue(String.valueOf(tempResult.intValue()));
                component.setDataType(SimpleDatatypeEnumeration.INT);
            }
            else
            {
                component.setValue(String.valueOf(tempResult));
                component.setDataType(SimpleDatatypeEnumeration.FLOAT);
            }
            rv.add(component);
        }
        return rv;
    }
}
