

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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects;

import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import com.vulniq.client.securityanalyzer.oval.analyze.CheckEnumerationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.OperationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.SetOperatorAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.variables.ConstantVariableImpl;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.variables.LocalVariableImpl;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import com.vulniq.client.securityanalyzer.oval.error.UnsupportedOVALItemError;
import com.vulniq.client.securityanalyzer.oval.functions.ComponentGroup;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.mitre.oval.xmlschema.oval_definitions_5.ConstantVariable;
import org.mitre.oval.xmlschema.oval_definitions_5.LocalVariable;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5.VariableType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.VariableObject;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.VariableState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.FlagEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VariableObjectImpl extends OVALObjectImplBase
{
    private static final Logger logger = LoggerFactory.getLogger(VariableObjectImpl.class);
    private final VariableObject variableObject;
    
    public VariableObjectImpl(OVALInterpreter interpreter, VariableObject objectDefinition)
    {
        super(interpreter);
        this.variableObject = objectDefinition;
    }

    
    @Override
    public StatusEnumeration checkExistence(DataCollectionTarget dataCollectionTarget)
    {
        if ( variableObject.getSet() == null && variableObject.getVarRef().getVarRef() != null)
        {
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object,
                                   this.getId(),
                                   "Invalid OVAL object! var_ref attribute for the var_ref entity of a Variable Object is prohibited by OVAL.",
                    CollectionUtils.mapFromArgs("varRef", variableObject.getVarRef().getVarRef()));
            return StatusEnumeration.ERROR;
        }
        return StatusEnumeration.EXISTS;
    }
    /*
    public List<ComponentGroup> resolveVariableRef(String variableRef)
    {
        VariableType variableType = OVALXMLLoader.loadVariable(ovalInterpreter.getDataSourceGuid(), variableRef, ovalInterpreter.getOsInfo().getDisplayVersion(), null);
        if(variableType==null)
        {
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Variable, variableObject.getId(),
                    "Failed to load variable reference",
                    CollectionUtils.mapFromArgs("Referenced variable id", variableRef));
            return null;
        }
        if (variableType instanceof LocalVariable)
        {
            logger.debug("resolveVariableRef " + variableRef + " is a LocalVariable");
            LocalVariable localVariable = (LocalVariable) variableType;
            LocalVariableImpl impl = new LocalVariableImpl(ovalInterpreter, localVariable);
            return impl.evaluate();
        }
        else if (variableType instanceof ConstantVariable)
        {
            logger.debug("resolveVariableRef " + variableRef + " is a ConstantVariable");
            ConstantVariable constantVariable = (ConstantVariable) variableType;
            ConstantVariableImpl impl = new ConstantVariableImpl(ovalInterpreter, constantVariable);
            return impl.evaluate();
        }
        throw new UnsupportedOVALItemError("Unsupported variable type: " + variableType.getClass() + " variable id:" + variableRef + " referenced from:" + getId());
    }
     */

    @Override
    public ObjectCollectionResult collectValues(DataCollectionTarget dataCollectionTarget)
    {
        ObjectCollectionResult objectCollectionResult = new ObjectCollectionResult();

        if (variableObject.getVarRef() == null)
        {
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object,
                                   this.getId(),
                                   "Variable Object must contain a variable reference entity.",
                                   null);
            objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR);
            return objectCollectionResult;
        }
        List<ComponentGroup> componentGroups = null;
        try
        {
            componentGroups = resolveVariableRef(variableObject.getVarRef().getValue().toString());
        }
        catch (UnexpectedOVALEvaluationError unexpectedOVALEvaluationError)
        {
            logger.error("collectValues: Variable Object " + getId() +" contains a variable reference entity '" +
                    variableObject.getVarRef().getValue() +
                    "' but the variable it references cannot be resolved. Setting collection status to ERROR.");
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object,
                    this.getId(),
                    "Failed to resolve variable reference.",
                    CollectionUtils.mapFromArgs("Referenced variable id", variableObject.getVarRef().getValue().toString()));

            objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR);
        }

        if (componentGroups != null)
        {
            for (ComponentGroup componentGroup : componentGroups)
            {
                objectCollectionResult.addCollectedValue(componentGroup, StatusEnumeration.EXISTS);
            }
        }
        else
        {
            logger.error("collectValues: Variable Object " + getId() +" contains a variable reference entity '" +
                            variableObject.getVarRef().getValue() +
                    "' but the variable it references cannot be resolved. Setting collection status to ERROR.");
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object,
                    this.getId(),
                    "Failed to resolve variable reference.",
                    CollectionUtils.mapFromArgs("Referenced variable id", variableObject.getVarRef().getValue().toString()));

            objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR);
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("collectValues returning:" + StringUtils.toJson(objectCollectionResult, false));
        }
        return objectCollectionResult;
    }
    
    @Override
    public List<ResultEnumeration> evaluateSingleValueVsState(Object individualValue, StateType stateType) throws Exception
    {
        VariableState variableState = (VariableState) stateType;
        ComponentGroup collectedValue = (ComponentGroup) individualValue;
        List<ResultEnumeration> tempResults = new LinkedList<>();
        List<ResultEnumeration> resultsToBeCombined = new LinkedList<>();
        List<ComponentGroup> stateComponents = new ArrayList<>();
        if (variableState.getVarRef() != null) //TODO: Make sure that var_check and entity_check properties are implemented properly.
        {
            stateComponents = resolveVariableRef(variableState.getVarRef().getValue().toString());
        }
        
        if (variableState.getValue().getVarRef() != null)
        {
            logger.debug("evaluateSingleValueVsState variableState.value contains a varRef");
            stateComponents = resolveVariableRef(variableState.getValue().getVarRef());
            if(stateComponents == null || stateComponents.isEmpty())
            {
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.State,
                                       variableState.getId(),
                                       "Variable Reference of state cannot be resolved. There may be a problem related to Variable definition or it may be defined as an external variable which is not currently supported.",
                                       null);
                resultsToBeCombined.add(ResultEnumeration.ERROR);
                return resultsToBeCombined;
            }
            for (ComponentGroup stateComponent : stateComponents)
            {
                ResultEnumeration tempResult = OperationAnalyzer.applyOperation(variableState.getValue().getOperation(), variableState.getValue().getDatatype(), stateComponent.getValue(), collectedValue.getValue());
                logger.debug("stateComponent=" + stateComponent.getValue()+" collectedValue=" + collectedValue.getValue() + " result=" + tempResult);
                tempResults.add(tempResult);
            }
            ResultEnumeration resultForASingleState = CheckEnumerationAnalyzer.evaluate(variableState.getValue().getVarCheck(), tempResults);
            resultsToBeCombined.add(resultForASingleState);
        }
        else if (variableState.getValue() != null)
        {
            ResultEnumeration tempResult = OperationAnalyzer.applyOperation(variableState.getValue().getOperation(), variableState.getValue().getDatatype(), variableState.getValue().getValue().toString(), collectedValue.getValue());
            tempResults.add(tempResult);
            
            ResultEnumeration resultForASingleState = CheckEnumerationAnalyzer.evaluate(variableState.getValue().getEntityCheck(), tempResults);
            resultsToBeCombined.add(resultForASingleState);
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("evaluateSingleValueVsState returning:" + resultsToBeCombined);
        }
        return resultsToBeCombined;
    }
    
    @Override
    public Map<String, List<String>> getCollectedItems() // TODO: Can depth be more?
    {
        if(variableObject.getSet()!=null)
        {
            try
            {
                ObjectCollectionResult objectCollectionResult = collectValuesFromSetElement(variableObject.getSet());
                if(objectCollectionResult.getCollectionStatus() == FlagEnumeration.COMPLETE || objectCollectionResult.getCollectionStatus() == FlagEnumeration.INCOMPLETE)
                {
                    Map<String,List<String>> itemFieldsToValues = new HashMap<>();
                    itemFieldsToValues.put("value",new ArrayList<>());
                    List<Object> collectedValues = objectCollectionResult.getCollectedValues();
                    for (Object collectedValue : collectedValues)
                    {
                        ComponentGroup collectedGroup = (ComponentGroup) collectedValue;
                        itemFieldsToValues.get("value").add(collectedGroup.getValue());
                    }
                    return itemFieldsToValues;
                }
                else
                {
                    return null;
                }
            }
            catch (Exception ex)
            {
                logger.error("getCollectedItems Error, variable object id=" + getId(), ex);
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object,
                        this.getId(),
                        "Failed to collect object components from referenced set.",
                        CollectionUtils.mapFromArgs("error", ex.getMessage()));

                return null;
            }
        }
        else
        {
            checkExistence(ovalInterpreter.getDataCollectionTarget());
            ObjectCollectionResult objectCollectionResult = collectValues(ovalInterpreter.getDataCollectionTarget());
            if(objectCollectionResult.getCollectionStatus() == FlagEnumeration.COMPLETE || objectCollectionResult.getCollectionStatus() == FlagEnumeration.INCOMPLETE)
            {
                Map<String,List<String>> itemFieldsToValues = new HashMap<>();
                itemFieldsToValues.put("value",new ArrayList<>());
                List<Object> collectedValues = objectCollectionResult.getCollectedValues();
                for (Object collectedValue : collectedValues)
                {
                    ComponentGroup collectedGroup = (ComponentGroup) collectedValue;
                    itemFieldsToValues.get("value").add(collectedGroup.getValue());
                }
                return itemFieldsToValues;
            }
            else
            {
                return null;
            }
        }

    }
    
    @Override
    public String getId()
    {
        return variableObject.getId();
    }

    @Override
    public Set getChildSet()
    {
        return variableObject.getSet();
    }


}
