
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
import com.vulniq.client.securityanalyzer.oval.analyze.OperationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.SetOperatorAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windows.CollectedWindowsRegistryInfo;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windows.PowerShellRegistryPropertiesUtils;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windows.PowerShellRegistrySearchUtils;
import com.vulniq.client.securityanalyzer.oval.functions.ComponentGroup;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.mitre.oval.xmlschema.oval_common_5.CheckEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.Filter;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistryObjectImpl extends OVALObjectImplBase
{
    private static Logger logger = LoggerFactory.getLogger(RegistryObjectImpl.class);
    List<String[]> allRegistryPaths = new ArrayList<String[]>();
    private CheckEnumeration varCheck = CheckEnumeration.ALL;
    boolean errorOccuredInConstuctor = false;
    private List<RegistryObject> registryObjects = new ArrayList<>();

    private RegistryObject objectDefinition;

    public RegistryObjectImpl(OVALInterpreter interpreter, RegistryObject objectDefinition)
    {
        super(interpreter);
        this.objectDefinition = objectDefinition;
        checkVarRef();
    }
    
    private void checkVarRef()
    {
        try
        {
            if (objectDefinition.getKey() != null && objectDefinition.getKey().getValue() != null && objectDefinition.getKey().getValue().getVarRef() != null)
            {
                    List<ComponentGroup> registryKeys = resolveVariableRef(objectDefinition.getKey().getValue().getVarRef());
                    varCheck = objectDefinition.getKey().getValue().getVarCheck();
                    for (ComponentGroup registryKey : registryKeys)
                    {
                        RegistryObject tempObject = copyObject(objectDefinition);
                        tempObject.getKey().getValue().setValue(registryKey.getValue());
                        registryObjects.add(tempObject);
                    }
            }
            if (registryObjects.isEmpty())
            {
                registryObjects.add(objectDefinition);
            }
        }
        catch (Exception ex)
        {
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                    "Unexpected error while checking variable references",
                    CollectionUtils.mapFromArgs("error", ex.getMessage()));
            logger.error("Unexpected error in checkVarRef", ex);
            errorOccuredInConstuctor = true;
        }
    }
    
    private Map<String,List<String>> initializeItemPropertyMap()
    {
        Map<String,List<String>> itemFieldsToValues = new HashMap<>();
        itemFieldsToValues.put("hive",new ArrayList<>());
        itemFieldsToValues.put("key",new ArrayList<>());
        itemFieldsToValues.put("name",new ArrayList<>());
        itemFieldsToValues.put("last_write_time",new ArrayList<>());
        itemFieldsToValues.put("type",new ArrayList<>());
        itemFieldsToValues.put("value",new ArrayList<>());
        itemFieldsToValues.put("expanded_value",new ArrayList<>());
        if(logger.isDebugEnabled())
        {
            logger.debug("initializeItemPropertyMap itemFieldsToValues=" + itemFieldsToValues);
        }
        return itemFieldsToValues;
    }
    
    private RegistryObject copyObject(RegistryObject source)
    {
        RegistryObject destination = new RegistryObject();
        destination.setBehaviors(source.getBehaviors());
        destination.setHive(source.getHive());
        destination.setName(source.getName());
        destination.setSet(source.getSet());
        JAXBElement<EntityObjectStringType> sourceKey = new JAXBElement<>(source.getKey().getName(),source.getKey().getDeclaredType(),source.getKey().getScope(),source.getKey().getValue());
    
        EntityObjectStringType sourceKeyValue = source.getKey().getValue();
        EntityObjectStringType destKeyValue = new EntityObjectStringType();
        destKeyValue.setValue(sourceKeyValue.getValue());
        destKeyValue.setOperation(sourceKeyValue.getOperation());
        destKeyValue.setVarCheck(sourceKeyValue.getVarCheck());
        destKeyValue.setVarRef(sourceKeyValue.getVarRef());
        destKeyValue.setDatatype(sourceKeyValue.getDatatype());
        sourceKey.setValue(destKeyValue);
        destination.setKey(sourceKey);
        return destination;
    }
    
    @Override
    public Map<String, List<String>> getCollectedItems()
    {
        Map<String, List<String>> itemFieldsToValues = initializeItemPropertyMap();
    
        checkExistence(ovalInterpreter.getDataCollectionTarget());
        ObjectCollectionResult objectCollectionResult = collectValues(ovalInterpreter.getDataCollectionTarget());
        if(objectCollectionResult.getCollectedValues() == null || objectCollectionResult.getCollectedValues().isEmpty())
        {
            logger.debug("getCollectedItems returning null because collected values is null or empty");
            return null;
        }
    
        List<Object> collectedValues = objectCollectionResult.getCollectedValues();
        for (Object collectedValue : collectedValues)
        {
            if(collectedValue != null && collectedValue instanceof CollectedWindowsRegistryInfo)
            {
                CollectedWindowsRegistryInfo registryProperties = (CollectedWindowsRegistryInfo) collectedValue;
                ArrayList<String> properties = new ArrayList<>();
                itemFieldsToValues.get("hive").add(registryProperties.getHive());
                itemFieldsToValues.get("key").add(registryProperties.getKey());
                itemFieldsToValues.get("name").add(registryProperties.getName());
                itemFieldsToValues.get("last_write_time").add(registryProperties.getLastWriteTime());
                itemFieldsToValues.get("type").add(registryProperties.getType());
                itemFieldsToValues.get("value").add(registryProperties.getValueAsString());
                itemFieldsToValues.get("expanded_value").add(registryProperties.getExpandedValue());
            }
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("getCollectedItems itemFieldsToValues=" + itemFieldsToValues);
        }
        return itemFieldsToValues;
    }

    @Override
    protected void checkExistenceObjectReferenceExistsCallback(ObjectType objectType)
    {
        RegistryObject registryObject = (RegistryObject) objectType;
        PowerShellRegistrySearchUtils searchUtils = new PowerShellRegistrySearchUtils(ovalInterpreter.getDataCollectionTarget(), registryObject);
        String[] collectedPath = searchUtils.getRegistryPath();
        allRegistryPaths.add(collectedPath);
    }

    @Override
    public StatusEnumeration checkExistence(DataCollectionTarget dataCollectionTarget)
    {
        if(errorOccuredInConstuctor)
        {
            return StatusEnumeration.ERROR;
        }
        for (RegistryObject registryObject : registryObjects)
        {
            PowerShellRegistrySearchUtils registrySearchUtils = new PowerShellRegistrySearchUtils(dataCollectionTarget,
                                                                                                  registryObject);
            String[] collectedPath = registrySearchUtils.getRegistryPath();
    
            if (collectedPath.length == 0)
            {
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                                       "The specified registry key does not exist.",
                                       CollectionUtils.mapFromArgs("object", objectDefinition.getComment()));
            }
            else if (collectedPath.length == 1 && (collectedPath[0] == null || collectedPath[0].equals("")))
            {
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                                       "The specified registry key does not exist.",
                                       CollectionUtils.mapFromArgs("object", objectDefinition.getComment()));
            }
            else
            {
                this.allRegistryPaths.add(collectedPath);
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                                       "The specified registry key exists.",
                                       CollectionUtils.mapFromArgs("Registry Key Path", List.of(collectedPath)));
            }
        }
        StatusEnumeration rv = StatusEnumeration.ERROR;
        if (varCheck == CheckEnumeration.ONLY_ONE) // This may have other values, but I didn't see them in real OVAL Tests.
        {
            if (allRegistryPaths.size() == 1)
            {
                logger.debug("checkExistence varCheck is ONLY_ONE and allRegistryPaths.size() is 1. Returning EXISTS");
                rv = StatusEnumeration.EXISTS;
            }
            else
            {
                logger.debug("checkExistence varCheck is ONLY_ONE and allRegistryPaths.size() is not equal to 1. Returning DOES_NOT_EXIST");
                rv = StatusEnumeration.DOES_NOT_EXIST;
                allRegistryPaths.clear();
            }
        }
        else // For values of CheckEnumeration ALL and ONLY_ONE.
        {
            if (allRegistryPaths.isEmpty())
            {
                logger.debug("checkExistence varCheck is not ONLY_ONE and allRegistryPaths is empty. Returning DOES_NOT_EXIST");
                rv = StatusEnumeration.DOES_NOT_EXIST;
            }
            else
            {
                logger.debug("checkExistence varCheck is not ONLY_ONE and allRegistryPaths is not empty. Returning EXISTS");
                rv = StatusEnumeration.EXISTS;
            }
        }
        return rv;
    }

    @Override
    public  ObjectCollectionResult collectValues(DataCollectionTarget dataCollectionTarget)
    {
        ObjectCollectionResult rv = new ObjectCollectionResult();
        if(allRegistryPaths.isEmpty())
        {
            rv.addItemCollectionStatus(StatusEnumeration.DOES_NOT_EXIST);
        }
        else
        {
            for (RegistryObject registryObject : registryObjects)
            {
                for (String[] registryPaths : allRegistryPaths)
                {
                    for (String individualPath : registryPaths)
                    {
                        PowerShellRegistryPropertiesUtils propertiesUtil = new PowerShellRegistryPropertiesUtils(
                                dataCollectionTarget);
                        String entryName;
                        OperationEnumeration oprEnum;
                        if (registryObject.getName().getValue() == null || registryObject.getName().getValue().getValue() == null)
                        {
                            entryName = null;
                            oprEnum = null;
                        }
                        else
                        {
                            entryName = registryObject.getName().getValue().getValue().toString();
                            oprEnum = registryObject.getName().getValue().getOperation();
                        }
                        try
                        {
                            CollectedWindowsRegistryInfo registryProperties = propertiesUtil.getRegistryProperties(
                                    individualPath, entryName, oprEnum);
                            if (registryObject.getBehaviors() != null)
                            {
                                registryProperties.setWindowsView(registryObject.getBehaviors().getWindowsView());
                            }
                            rv.addCollectedValue(registryProperties, StatusEnumeration.EXISTS);
                            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Object,
                                                   this.getId(), "Registry properties are collected successfully",
                                                   CollectionUtils.mapFromArgs("Registry Key Path", individualPath,
                                                                               "Registry Name", entryName));
                        }
                        catch (Exception ex)
                        {
                            rv.addItemCollectionStatus(StatusEnumeration.ERROR);
                            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object,
                                                   this.getId(),
                                                   "An error occurred while collecting information about registry item with path: " + individualPath,
                                                   CollectionUtils.mapFromArgs("error", ex.getMessage()));
                            logger.error("collectValues failed with unexpected error for OVAL id=" + getId(), ex);
                            return rv;
                        }
                    }
                }
            }
        }
        return rv;
    }
    




    @Override
    public  List<ResultEnumeration> evaluateSingleValueVsState(Object individualCollectedValue, StateType stateType) throws Exception
    {
        CollectedWindowsRegistryInfo collectedInfo = (CollectedWindowsRegistryInfo) individualCollectedValue;
        RegistryState registryState = (RegistryState) stateType;
        List<ResultEnumeration> resultsToBeCombined = new ArrayList<>();

        if(registryState.getHive() != null)
        {
            ResultEnumeration resultHive = OperationAnalyzer.applyOperation(
                    registryState.getHive().getOperation(),
                    registryState.getHive().getDatatype(),
                    registryState.getHive().getValue().toString().toUpperCase(),
                    collectedInfo.getHive().toUpperCase());
            resultsToBeCombined.add(resultHive);
        }
        if(registryState.getKey()!= null)
        {
            ResultEnumeration resultKey = OperationAnalyzer.applyOperation(
                    registryState.getKey().getOperation(),
                    registryState.getKey().getDatatype(),
                    registryState.getKey().getValue().toString().toUpperCase(),
                    collectedInfo.getKey().toUpperCase());
            resultsToBeCombined.add(resultKey);
        }
        if (registryState.getName() != null)
        {
            ResultEnumeration resultName = OperationAnalyzer.applyOperation(
                    registryState.getName().getOperation(),
                    registryState.getName().getDatatype(),
                    registryState.getName().getValue().toString().toUpperCase(),
                    collectedInfo.getName().toUpperCase());
            resultsToBeCombined.add(resultName);
        }
        if (registryState.getValue() != null)
        {
            ResultEnumeration resultValue = OperationAnalyzer.applyOperation(
                    registryState.getValue().getOperation(),
                    registryState.getValue().getDatatype(),
                    registryState.getValue().getValue(),
                    collectedInfo.getValue().getValue());
            resultsToBeCombined.add(resultValue);
        }
        if (registryState.getType() != null)
        {
            ResultEnumeration resultType = OperationAnalyzer.applyOperation(
                    registryState.getType().getOperation(),
                    registryState.getType().getDatatype(),
                    registryState.getType().getValue(),
                    collectedInfo.getType());
            resultsToBeCombined.add(resultType);
        }
        if (registryState.getExpandedValue() != null)
        {
            ResultEnumeration resultExpandedValue = OperationAnalyzer.applyOperation(
                    registryState.getExpandedValue().getOperation(),
                    registryState.getExpandedValue().getDatatype(),
                    registryState.getExpandedValue().getValue(),
                    collectedInfo.getExpandedValue());
            resultsToBeCombined.add(resultExpandedValue);
        }
        if (registryState.getLastWriteTime() != null)
        {
            ResultEnumeration resultLastWriteTime = OperationAnalyzer.applyOperation(
                    registryState.getLastWriteTime().getOperation(),
                    registryState.getLastWriteTime().getDatatype(),
                    registryState.getLastWriteTime().getValue(),
                    collectedInfo.getLastWriteTime());
            resultsToBeCombined.add(resultLastWriteTime);
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("evaluateSingleValueVsState resultsToBeCombined=" + resultsToBeCombined);
        }
        return resultsToBeCombined;
    }
    
    
    @Override
    public String getId()
    {
        return objectDefinition.getId();
    }

    @Override
    public Set getChildSet()
    {
        return objectDefinition.getSet();
    }
}
