

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

package com.vulniq.client.securityanalyzer.oval;

import com.vulniq.client.securityanalyzer.oval.error.UnsupportedOVALItemError;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.mitre.oval.xmlschema.oval_definitions_5.ConstantVariable;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntitySimpleBaseType;
import org.mitre.oval.xmlschema.oval_definitions_5.ExternalVariable;
import org.mitre.oval.xmlschema.oval_definitions_5.LocalVariable;
import org.mitre.oval.xmlschema.oval_definitions_5.ValueType;
import org.mitre.oval.xmlschema.oval_definitions_5.VariableType;

import javax.xml.bind.JAXBElement;
import java.util.LinkedList;
import java.util.List;

public class OVALUtils
{
    /**
     * data type is always assumed to be string
     * @param entityObjectStringType
     * @return
     */
    public static String getStringValue(EntitySimpleBaseType entityObjectStringType)
    {
        return String.valueOf(entityObjectStringType.getValue());
    }


    public static int getIntValue(EntityObjectIntType entityObjectIntType, int defaultValue)
    {
        return StringUtils.parseInt(String.valueOf(entityObjectIntType.getValue()), defaultValue);
    }

    public static List<Object> getValuesExpandingVariables(OVALInterpreter ovalInterpreter, JAXBElement<? extends EntitySimpleBaseType> jaxbElement)
    {
        return getValuesExpandingVariables(ovalInterpreter, jaxbElement.getValue());
    }

    /**
     * TODO getValuesExpandingVariables methods are not used. consider removing or change other classes to use these
     * @deprecated
     * @param ovalInterpreter
     * @param simpleBaseType
     * @return
     */
    public static List<Object> getValuesExpandingVariables(OVALInterpreter ovalInterpreter, EntitySimpleBaseType simpleBaseType)
    {
        if(simpleBaseType.getVarRef()==null)
        {
            //simple value without any var references
            List<Object> rv = new LinkedList<>();
            rv.add(getSingleValueWithDataType(simpleBaseType));
            return rv;
        }
        else
        {
            List<Object> rv = new LinkedList<>();
            //resolve variable references
            VariableType variableType = OVALXMLLoader.loadVariable(ovalInterpreter.getDataSourceGuid(), simpleBaseType.getVarRef(), ovalInterpreter.getOsInfo().getDisplayVersion(), null);
            if(variableType instanceof ConstantVariable)
            {
                ConstantVariable constantVariable = (ConstantVariable) variableType;
                List<ValueType> values = constantVariable.getValue();
                if(values!=null)
                {
                    for(ValueType valueType : values)
                    {
                        rv.add(valueType.getValue());
                    }
                }
            }
            else if(variableType instanceof LocalVariable)
            {
                Object localComponentPart = null;
                LocalVariable localVariable = (LocalVariable) variableType;
                if(localVariable.getLiteralComponent()!=null)
                {
                    localComponentPart = getSingleValueWithDataType(localVariable.getLiteralComponent().getDatatype().value(), localVariable.getLiteralComponent().getValue());
                }
                throw new UnsupportedOVALItemError("LocalVariable is not supported. variable id=" + variableType.getId());
            }
            else if(variableType instanceof ExternalVariable)
            {
                throw new UnsupportedOVALItemError("ExternalVariable is not supported. variable id=" + variableType.getId());
            }
            return rv;
        }
    }

    public static Object getSingleValueWithDataType(String dataTypeString, Object valueObj)
    {
        switch (dataTypeString)
        {
            case "boolean":
                return valueObj;
        }
        return valueObj;
    }

    public static Object getSingleValueWithDataType(EntitySimpleBaseType simpleBaseType)
    {
        Object valueAsObject = simpleBaseType.getValue();
        return getSingleValueWithDataType(simpleBaseType.getDatatype(), valueAsObject);
    }
}
