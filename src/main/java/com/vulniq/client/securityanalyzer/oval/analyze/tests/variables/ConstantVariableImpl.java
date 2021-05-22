
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
import com.vulniq.client.securityanalyzer.oval.functions.ComponentGroup;
import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.ConstantVariable;
import org.mitre.oval.xmlschema.oval_definitions_5.ValueType;

import java.util.ArrayList;
import java.util.List;

public class ConstantVariableImpl
{
    private final ConstantVariable constantVariable;
    private final OVALInterpreter interpreter;
    
    public ConstantVariableImpl(OVALInterpreter interpreter, ConstantVariable constantVariable)
    {
        this.interpreter = interpreter;
        this.constantVariable = constantVariable;
    }
    
    public List<ComponentGroup> evaluate()
    {
        SimpleDatatypeEnumeration datatype = constantVariable.getDatatype();
        List<ValueType> values = constantVariable.getValue();
        List<ComponentGroup> components = new ArrayList<>();
        for (ValueType value : values)
        {
            ComponentGroup componentGroup = new ComponentGroup();
            componentGroup.setValue(value.getValue().toString());
            componentGroup.setDataType(datatype);
            components.add(componentGroup);
        }
        
        return components;
    }
}
