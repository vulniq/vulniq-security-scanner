

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
import com.vulniq.client.securityanalyzer.oval.OVALInterpreterCache;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import com.vulniq.client.securityanalyzer.oval.analyze.ExistenceEnumerationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.OperatorAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.SetOperatorAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.variables.ConstantVariableImpl;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.variables.LocalVariableImpl;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import com.vulniq.client.securityanalyzer.oval.error.UnsupportedOVALItemError;
import com.vulniq.client.securityanalyzer.oval.functions.ComponentGroup;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.mitre.oval.xmlschema.oval_common_5.ExistenceEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.OperatorEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.ConstantVariable;
import org.mitre.oval.xmlschema.oval_definitions_5.Filter;
import org.mitre.oval.xmlschema.oval_definitions_5.FilterActionEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.LocalVariable;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateRefType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5.VariableType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Textfilecontent54Object;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.VariableObject;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.XmlfilecontentObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.InetlisteningserversObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileObject;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileObject;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.Process58Object;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.UnameObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.CmdletObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PortObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.ServiceObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Wmi57Object;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.WmiObject;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.FlagEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public abstract class OVALObjectImplBase
{
    private Logger logger = LoggerFactory.getLogger(OVALObjectImplBase.class);

    /**
     * the object exists or not
     */
    //protected StatusEnumeration existenceStatus = null;
    /**
     * collection results (regardless of existence check)
     */
    protected FlagEnumeration collectionStatus = FlagEnumeration.NOT_COLLECTED;
    //protected List<Object> collectedValues;
    private ObjectCollectionResult collectionResult = new ObjectCollectionResult();

    protected OVALInterpreter ovalInterpreter;

    protected int timeout = 2000;

    /**
     *
     * @return collected value
     */
    protected abstract StatusEnumeration checkExistence(DataCollectionTarget dataCollectionTarget);

    protected abstract ObjectCollectionResult collectValues(DataCollectionTarget dataCollectionTarget);

    public abstract String getId();


    public abstract Set getChildSet();

    protected abstract List<ResultEnumeration> evaluateSingleValueVsState(Object individualCollectedValue, StateType stateType) throws Exception;
    
    public abstract Map<String,List<String>> getCollectedItems();

    /**
     * As defined in the xsd:
     * "The set element's object_reference refers to an existing OVAL Object. The set element's filter
     * element provides a reference to an existing OVAL State and includes an optional action attribute.
     * The filter's action attribute allows the author to specify whether matching items should be
     * included or excluded from the overall set. The default filter action is to exclude all matching
     * items. In other words, the filter can be thought of filtering items out by default."
     * @param filters
     * @param objectCollectionResult
     */
    protected void filterCollectionResult (List<Filter> filters, ObjectCollectionResult objectCollectionResult)
    {
        if(objectCollectionResult.getCollectionStatus() == FlagEnumeration.NOT_COLLECTED)
        {
            return;
        }
        for (Filter filter : filters)
        {
            String stateId = filter.getValue();
            StateType stateType = OVALXMLLoader.loadState(ovalInterpreter.getDataSourceGuid(), stateId,
                                                          ovalInterpreter.getOsInfo().getDisplayVersion(), null);
            java.util.TreeSet<Integer> indexesToRemove = new TreeSet<>();
            for (int index = 0; index < objectCollectionResult.getCollectedItems().size(); index++)
            {
                Object collectedValue = objectCollectionResult.getCollectedItems().get(index).collectedValue;
                if(collectedValue==null)
                {
                    continue;
                }
                try
                {
                    List<ResultEnumeration> filterResults = evaluateSingleValueVsState(collectedValue, stateType);
                    //TODO we hardcode OperatorEnumeration.OR here because for example to filter two files, state may have 2 values
                    // and the file will match only one of them.
                    ResultEnumeration comparisonResult = OperatorAnalyzer.evaluate(OperatorEnumeration.OR, filterResults);
                    
                    if(filter.getAction() == null || filter.getAction() == FilterActionEnumeration.EXCLUDE)
                    {
                        if(comparisonResult == ResultEnumeration.TRUE)
                        {
                            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.Object, getId(),
                                    "Filter out excluded item",
                                    CollectionUtils.mapFromArgs("state", stateId, "Removed item", String.valueOf(collectedValue)) );
                            logger.debug("filterCollectionResult removed excluded item " + collectedValue);
                            indexesToRemove.add(index);
                        }
                    }
                    else    //INCLUDE
                    {
                        if(comparisonResult == ResultEnumeration.FALSE)
                        {
                            logger.debug("filterCollectionResult removed " + collectedValue);
                            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.Object, getId(),
                                    "Remove item as it doesn't match the filter",
                                    CollectionUtils.mapFromArgs("state", stateId, "Removed item", String.valueOf(collectedValue)) );
                            indexesToRemove.add(index);
                        }
                    }
                }
                catch (Exception e)
                {
                    logger.error("filterCollectionResult unexpected error", e);
                }
            }
            //WARNING! we MUST remove in descending order because otherwise element indexes change as we remove them
            Iterator<Integer> reverseIterator = indexesToRemove.descendingIterator();
            while(reverseIterator.hasNext())
            {
                int index = reverseIterator.next().intValue();
                objectCollectionResult.removeCollectedItem(index);
            }
        }
    }
    
    public List<ComponentGroup> resolveVariableRef(String variableRef) throws UnexpectedOVALEvaluationError
    {
        VariableType variableType = OVALXMLLoader.loadVariable(ovalInterpreter.getDataSourceGuid(), variableRef, ovalInterpreter.getOsInfo().getDisplayVersion(), null);
        if (variableType instanceof LocalVariable)
        {
            LocalVariable localVariable = (LocalVariable) variableType;
            LocalVariableImpl impl = new LocalVariableImpl(ovalInterpreter, localVariable);
            return impl.evaluate();
        }
        else if (variableType instanceof ConstantVariable)
        {
            ConstantVariable constantVariable = (ConstantVariable) variableType;
            ConstantVariableImpl impl = new ConstantVariableImpl(ovalInterpreter, constantVariable);
            return impl.evaluate();
        }
        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object,
                               this.getId(),
                               "Variable Reference cannot be resolved. There may be a problem related to Variable definition or it may be defined as an external variable which is not currently supported. Related Variable ID: " + variableRef,
                               null);
        throw new UnexpectedOVALEvaluationError("Variable Reference cannot be resolved. There may be a problem related to Variable definition or it may be defined as an external variable which is not currently supported.Related Variable ID: " + variableRef);
    }

    public OVALObjectImplBase(OVALInterpreter interpreter)
    {
        this.ovalInterpreter = interpreter;
    }

    protected void addTimedOutLog(int timeout)
    {
        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_WARN, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                "Command timed out.", CollectionUtils.mapFromArgs("timeout", timeout));
    }

    protected void addFailedLog(Throwable ex)
    {
        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                "Error running command.",   //TODO improve this message and method
                CollectionUtils.mapFromArgs("error", (ex!=null?ex.getMessage():""))
        );
        if(ex!=null)
        {
            logger.error("Error running command for " + this.getId(), ex);
        }
    }


    public ResultEnumeration getExistenceStatus(ExistenceEnumeration checkExistenceValueFromTest) throws UnexpectedOVALEvaluationError
    {
        //TODO return DOES_NOT_EXIST if set returns empty values
        List<StatusEnumeration> itemStatuses = this.collectionResult.getCollectedItemStatuses();
        return ExistenceEnumerationAnalyzer.evaluate(checkExistenceValueFromTest, itemStatuses, ExistenceEnumerationAnalyzer.EvaluationTarget.Test);
    }

    public FlagEnumeration getCollectionStatus()
    {
        return collectionStatus;
    }

    public void setCollectionStatus(FlagEnumeration collectionStatus)
    {
        this.collectionStatus = collectionStatus;
    }



    public List<Object> getCollectedValues()
    {
        return collectionResult.getCollectedValues();
    }


    public boolean collect() throws UnexpectedOVALEvaluationError
    {
        OVALInterpreterCache.CollectedObjectCacheEntry fromCache = OVALInterpreterCache.getCollectedObjectFromCache(ovalInterpreter.getDataCollectionTarget(), this.getId());
        if(fromCache!=null)
        {
            this.collectionStatus = fromCache.collectionStatus;
            this.collectionResult = fromCache.collectionResult;
            return true;
        }
        StatusEnumeration checkExistenceReturnValue = StatusEnumeration.NOT_COLLECTED;
        if(this.getChildSet()!=null)
        {
            checkExistenceReturnValue = calculateExistenceFromSet(this.getChildSet());
        }
        else
        {
            checkExistenceReturnValue = checkExistence(this.ovalInterpreter.getDataCollectionTarget());
        }
        if(checkExistenceReturnValue!=StatusEnumeration.DOES_NOT_EXIST)
        {
            if(this.getChildSet()==null)
            {
                this.collectionResult = collectValues(this.ovalInterpreter.getDataCollectionTarget());
                this.collectionStatus = collectionResult.getCollectionStatus();
            }
            else
            {
                this.collectionResult = collectValuesFromSetElement(this.getChildSet());
                this.collectionStatus = collectionResult.getCollectionStatus();
            }
        }
        else
        {
            this.collectionStatus = FlagEnumeration.DOES_NOT_EXIST;
        }
        OVALInterpreterCache.addCollectedObjectToCache(ovalInterpreter.getDataCollectionTarget(), this.getId(), this.collectionStatus, this.collectionResult);
        return true;
    }

    protected StatusEnumeration calculateExistenceFromSet(Set parentSet) throws UnexpectedOVALEvaluationError
    {
        List<Set> childSets = parentSet.getSet();
        if (childSets.size() != 0)
        {
            logger.debug("checkSetExistence childSets.size()=" + childSets.size());
            if (childSets.size() > 2)
            {
                throw new UnexpectedOVALEvaluationError("OVAL Object with id=" + this.getId() + " contains more than two child set elements " +
                        "which is not allowed by OVAL specifications supported by this tool");
            }
            if (childSets.size() == 1)
            {
                return calculateExistenceFromSet(childSets.get(0));
            }
            else
            {
                Set firstChild = childSets.get(0);
                Set secondChild = childSets.get(1);
                StatusEnumeration firstExistence = calculateExistenceFromSet(firstChild);
                StatusEnumeration secondExistence = calculateExistenceFromSet(secondChild);
                if (firstExistence != StatusEnumeration.EXISTS && secondExistence != StatusEnumeration.EXISTS)
                {
                    if (firstExistence == secondExistence) // Both can be either of ERROR or DOES_NOT_EXIST.
                    {
                        return firstExistence;
                    }
                    else // One of them must be ERROR, so return ERROR.
                    {
                        return StatusEnumeration.ERROR;
                    }
                }
                else // If at least one exists, try to use that value for further analysis.
                {
                    return StatusEnumeration.EXISTS;
                }
            }
        }
        else
        {
            logger.debug("calculateExistenceFromSet with no child sets");
            try
            {
                List<String> objectReferences = parentSet.getObjectReference();
                String firstReference = null;
                String secondReference = null;
                if (objectReferences.size() > 2)
                {
                    throw new UnexpectedOVALEvaluationError("OVAL Object with id=" + this.getId() + " contains " +
                            "a set element with more than two child object references " +
                            "which is not allowed by OVAL specifications supported by this tool");
                }
                else if (objectReferences.size() == 1)
                {
                    firstReference = objectReferences.get(0);
                    ObjectType firstObjectType = OVALXMLLoader.loadObject(ovalInterpreter.getDataSourceGuid(),
                            firstReference, ovalInterpreter.getOsInfo().getDisplayVersion(), null);

                    OVALObjectImplBase firstImpl = OVALObjectImplBase.getInstance(firstObjectType, ovalInterpreter);
                    StatusEnumeration existence = firstImpl.checkExistence(ovalInterpreter.getDataCollectionTarget());
                    if (existence == StatusEnumeration.EXISTS)
                    {
                        checkExistenceObjectReferenceExistsCallback(firstObjectType);
                    }
                    return existence;
                }
                else
                {
                    firstReference = objectReferences.get(0);
                    secondReference = objectReferences.get(1);

                    ObjectType firstObjectType = OVALXMLLoader.loadObject(ovalInterpreter.getDataSourceGuid(),
                            firstReference, ovalInterpreter.getOsInfo().getDisplayVersion(), null);

                    OVALObjectImplBase firstImpl = OVALObjectImplBase.getInstance(firstObjectType, ovalInterpreter);
                    StatusEnumeration firstExistence = firstImpl.checkExistence(ovalInterpreter.getDataCollectionTarget());

                    ObjectType secondObjectType = OVALXMLLoader.loadObject(ovalInterpreter.getDataSourceGuid(),
                            secondReference, ovalInterpreter.getOsInfo().getDisplayVersion(), null);

                    OVALObjectImplBase secondImpl = OVALObjectImplBase.getInstance(secondObjectType, ovalInterpreter);

                    StatusEnumeration secondExistence = secondImpl.checkExistence(ovalInterpreter.getDataCollectionTarget());

                    if (firstExistence != StatusEnumeration.EXISTS && secondExistence != StatusEnumeration.EXISTS)
                    {
                        if (firstExistence == secondExistence) // Both can be ERROR or DOES_NOT_EXIST.
                        {
                            return firstExistence;
                        }
                        else // One of them must be ERROR, so return ERROR.
                        {
                            return StatusEnumeration.ERROR;
                        }
                    }
                    else
                    {
                        if (firstExistence == StatusEnumeration.EXISTS)
                        {
                            checkExistenceObjectReferenceExistsCallback(firstObjectType);
                        }
                        if (secondExistence == StatusEnumeration.EXISTS)
                        {
                            checkExistenceObjectReferenceExistsCallback(secondObjectType);
                        }
                        return StatusEnumeration.EXISTS; // At least one result EXISTS so try to use that in further analysis.
                    }
                }
            }
            catch (Exception ex)
            {
                logger.error("calculateExistenceFromSet unexpected error. Returning null", ex);
                return null;
            }
        }
    }

    /**
     * No op by default.
     * Override in child classes if necessary
     * @param objectType
     */
    protected void checkExistenceObjectReferenceExistsCallback(ObjectType objectType)
    {
        //override in child classes
    }

    /**
     *              <xsd:choice>
     *                 <xsd:sequence>
     *                     <xsd:element ref="oval-def:set" minOccurs="1" maxOccurs="2"/>
     *                 </xsd:sequence>
     *                 <xsd:sequence>
     *                     <xsd:element name="object_reference" type="oval:ObjectIDPattern" minOccurs="1" maxOccurs="2"/>
     *                     <xsd:element ref="oval-def:filter" minOccurs="0" maxOccurs="unbounded"/>
     *                 </xsd:sequence>
     *             </xsd:choice>
     */
    protected ObjectCollectionResult collectValuesFromSetElement(Set parentSet) throws UnexpectedOVALEvaluationError
    {
        List<Set> childSets = parentSet.getSet();
        if (childSets.size() != 0)
        {
            logger.debug("checkSets childSets.size() != 0. OVAL id=" + getId());
            if (childSets.size() > 2)
            {
                throw new UnexpectedOVALEvaluationError("OVAL Object with id=" + this.getId() + " contains more than two child set elements " +
                        "which is not allowed by OVAL specifications supported by this tool");
            }
            if (childSets.size() == 1)
            {
                return collectValuesFromSetElement(childSets.get(0));
            }
            else
            {
                Set firstChild = childSets.get(0);
                Set secondChild = childSets.get(1);
                ObjectCollectionResult firstChildResult = collectValuesFromSetElement(firstChild);
                ObjectCollectionResult secondChildResult = collectValuesFromSetElement(secondChild);
                ObjectCollectionResult rv = SetOperatorAnalyzer.applySetOperation(firstChildResult, secondChildResult, parentSet.getSetOperator());
                return rv;
            }
        }
        else
        {
            logger.debug("checkSets no childSets. OVAL id=" + getId());
            List<String> objectReferences = parentSet.getObjectReference(); // OVAL says that the size of this list must be 1 or 2.
            List<Filter> filters = parentSet.getFilter();

            if (objectReferences.size() > 2)
            {
                throw new UnexpectedOVALEvaluationError("OVAL Object with id=" + this.getId() + " contains " +
                        "a set element with more than two child object references " +
                        "which is not allowed by OVAL specifications supported by this tool");
            }
            ObjectCollectionResult firstObjectCollectionResult = null;
            ObjectCollectionResult secondObjectCollectionResult = null;

            if (objectReferences.size() == 1)
            {
                String objectReference = objectReferences.get(0);
                ObjectType objectType = OVALXMLLoader.loadObject(ovalInterpreter.getDataSourceGuid(), objectReference,
                        ovalInterpreter.getOsInfo().getDisplayVersion(),
                        null);
                OVALObjectImplBase impl = OVALObjectImplBase.getInstance(objectType, ovalInterpreter);
                impl.checkExistence(ovalInterpreter.getDataCollectionTarget());
                firstObjectCollectionResult = impl.collectValues(ovalInterpreter.getDataCollectionTarget());
                filterCollectionResult(filters, firstObjectCollectionResult);
                logger.debug("objectReferences.size() == 1 objectReference=" + objectReference + "" +
                        "firstObjectCollectionResult=" + StringUtils.toJson(firstObjectCollectionResult,false));

            }
            else
            {
                String firstObjectReference = objectReferences.get(0);
                ObjectType firstObjectType = OVALXMLLoader.loadObject(ovalInterpreter.getDataSourceGuid(),
                        firstObjectReference,
                        ovalInterpreter.getOsInfo().getDisplayVersion(),
                        null);
                OVALObjectImplBase firstImpl = OVALObjectImplBase.getInstance(firstObjectType, ovalInterpreter);
                firstImpl.checkExistence(ovalInterpreter.getDataCollectionTarget());
                firstObjectCollectionResult = firstImpl.collectValues(ovalInterpreter.getDataCollectionTarget());
                filterCollectionResult(filters, firstObjectCollectionResult);
                logger.debug("objectReferences.size() == 2 firstObjectReference=" + firstObjectReference + "" +
                        "firstObjectCollectionResult=" + StringUtils.toJson(firstObjectCollectionResult,false));

                String secondObjectReference = objectReferences.get(1);
                ObjectType secondObjectType = OVALXMLLoader.loadObject(ovalInterpreter.getDataSourceGuid(),
                        secondObjectReference,
                        ovalInterpreter.getOsInfo().getDisplayVersion(),
                        null);
                OVALObjectImplBase secondImpl = OVALObjectImplBase.getInstance(secondObjectType, ovalInterpreter);
                secondImpl.checkExistence(ovalInterpreter.getDataCollectionTarget());
                secondObjectCollectionResult = secondImpl.collectValues(ovalInterpreter.getDataCollectionTarget());
                filterCollectionResult(filters, secondObjectCollectionResult);
                logger.debug("objectReferences.size() == 2 secondObjectReference=" + secondObjectReference + "" +
                        "secondObjectCollectionResult=" + StringUtils.toJson(secondObjectCollectionResult,false));

            }
            ObjectCollectionResult objectCollectionResult = SetOperatorAnalyzer.applySetOperation(
                    firstObjectCollectionResult, secondObjectCollectionResult, parentSet.getSetOperator());
            if(logger.isDebugEnabled())
            {
                logger.debug("checkSets returning: " + StringUtils.toJson(objectCollectionResult, false));
            }
            return objectCollectionResult;
        }
    }

//
//    protected ObjectCollectionResult collectValuesWithVariableSupport(DataCollectionTarget target, EntitySimpleBaseType entitySimpleBaseType)
//    {
//        //no var references
//        if(entitySimpleBaseType.getVarRef()==null)
//        {
//            String packageName = OVALUtils.getStringValue(entitySimpleBaseType);
//            ObjectCollectionResult resultForValue = collectValueInternal(target, packageName);
//            switch (resultForValue.getCollectionStatus())
//            {
//                case ERROR:
//                    this.setExistenceStatus(StatusEnumeration.ERROR);
//                    break;
//                case EXISTS:
//                    this.setExistenceStatus(StatusEnumeration.EXISTS);
//                    break;
//                case NOT_COLLECTED:
//                    this.setExistenceStatus(StatusEnumeration.DOES_NOT_EXIST);
//                    break;
//                case DOES_NOT_EXIST:
//                    this.setExistenceStatus(StatusEnumeration.DOES_NOT_EXIST);
//                    break;
//            }
//            return resultForValue;
//        }
//
//        /////////object has var references
//        List<Object> expandedValues = OVALUtils.getValuesExpandingVariables(ovalInterpreter, entitySimpleBaseType);
//
//        //If a variable does not have any value value when referenced by an OVAL Object
//        //the object should be considered to not exist.
//        if(expandedValues==null || expandedValues.isEmpty())
//        {
//            this.setExistenceStatus(StatusEnumeration.DOES_NOT_EXIST);
//            this.setCollectionStatus(StatusEnumeration.NOT_COLLECTED);
//            ObjectCollectionResult rv = new ObjectCollectionResult(true, entitySimpleBaseType.getVarCheck());
//            rv.setCollectionStatus(StatusEnumeration.NOT_COLLECTED);
//            return rv;
//        }
//        /*
//        The optional var_check attribute specifies how data collection or state evaluation should proceed
//        when an element uses a var_ref attribute, and the associated variable defines more than one value.
//        For example, if an object entity 'filename' with an operation of 'not equal' references a variable
//        that returns five different values, and the var_check attribute has a value of 'all', then an actual
//        file on the system matches only if the actual filename does not equal any of the variable values.
//        As another example, if a state entity 'size' with an operation of 'less than' references a variable
//        that has five different integer values, and the var_check attribute has a value of 'all',
//        then the 'size' state entity evaluates to true only if the corresponding 'size' item entity is less
//        than each of the five integers defined by the variable.
//         */
//
//        ObjectCollectionResult finalReturnValue = new ObjectCollectionResult(true, entitySimpleBaseType.getVarCheck());
//
//        int existenceDoesNotExistCount = 0;
//        int existenceExistCount = 0;
//        int existenceErrorCount = 0;
//        int existenceNotCollectedCount = 0;
//
//        for(Object tmpValue : expandedValues)
//        {
//            String packageName = String.valueOf(tmpValue);
//            ObjectCollectionResult resultForValue = collectValueInternal(target, packageName);
//            switch (resultForValue.getCollectionStatus())
//            {
//                case ERROR:
//                    existenceErrorCount++;
//                    break;
//                case EXISTS:
//                    existenceExistCount++;
//                    break;
//                case NOT_COLLECTED:
//                    existenceNotCollectedCount++;
//                    break;
//                case DOES_NOT_EXIST:
//                    existenceDoesNotExistCount++;
//                    break;
//            }
//            finalReturnValue.addCollectionStatusForVarValue(resultForValue.getCollectionStatus());
//            finalReturnValue.addMultipleCollectedValues(resultForValue.getCollectedValues());
//        }
//        ///now combine existence status values
//        switch (finalReturnValue.getVarCheck())
//        {
//            case ALL:
//                if(existenceDoesNotExistCount>0)
//                {
//                    this.setExistenceStatus(StatusEnumeration.DOES_NOT_EXIST);
//                }
//                else if(existenceErrorCount>0)
//                {
//                    this.setExistenceStatus(StatusEnumeration.ERROR);
//                }
//                else if(existenceNotCollectedCount>0)
//                {
//                    this.setExistenceStatus(StatusEnumeration.NOT_COLLECTED);
//                }
//                else
//                {
//                    this.setExistenceStatus(StatusEnumeration.EXISTS);
//                }
//                break;
//            case AT_LEAST_ONE:
//                if(existenceExistCount>0)
//                {
//                    this.setExistenceStatus(StatusEnumeration.EXISTS);
//                }
//                else
//                {
//                    if(existenceErrorCount>0)
//                    {
//                        this.setExistenceStatus(StatusEnumeration.ERROR);
//                    }
//                    else
//                    {
//                        this.setExistenceStatus(StatusEnumeration.DOES_NOT_EXIST);
//                    }
//                }
//                break;
//            case ONLY_ONE:
//                if(existenceExistCount==1)
//                {
//                    this.setExistenceStatus(StatusEnumeration.EXISTS);
//                }
//                else if(existenceErrorCount>0)
//                {
//                    this.setExistenceStatus(StatusEnumeration.ERROR);
//                }
//                else
//                {
//                    this.setExistenceStatus(StatusEnumeration.DOES_NOT_EXIST);
//                }
//                break;
//            case NONE_EXIST:
//                //FIXME I don't know how to handle this
//                break;
//            case NONE_SATISFY:
//                //FIXME I don't know how to handle this
//                break;
//        }
//
//        return finalReturnValue;
//    }
//

    /**
     * evaluate each collected value against the given state
     *      Each matching item is compared to each referenced state.
     *      The result of comparing each state to a single item is combined based on the specified state_operator value
     *      to determine one result for each item.
     * @param stateRefs
     * @return stateid => result
     */
    public List<ResultEnumeration> analyzeStates(List<StateRefType> stateRefs, OperatorEnumeration stateOperator) throws UnexpectedOVALEvaluationError
    {
        if(this.collectionResult ==null)
        {
            ArrayList<ResultEnumeration> rv = new ArrayList<>();
            rv.add(ResultEnumeration.NOT_EVALUATED);
            return rv;
        }

        ArrayList<ResultEnumeration> rv = new ArrayList<>();
        for(Object individualValue : this.collectionResult.getCollectedValues())
        {
            List<ResultEnumeration> resultsForThisIndividualValue = new ArrayList<>();
            for(StateRefType stateRefType : stateRefs)
            {
                StateType stateType = OVALXMLLoader.loadState(ovalInterpreter.getDataSourceGuid(), stateRefType.getStateRef(), ovalInterpreter.getOsInfo().getDisplayVersion(), null);
                //Each matching item is compared to each referenced state.
                try
                {
                    List<ResultEnumeration> resultsForThisState = evaluateSingleValueVsState(individualValue, stateType);
                    ResultEnumeration stateResultForThisStateAfterCombining = OperatorAnalyzer.evaluate(stateType.getOperator(), resultsForThisState);
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                            "Results for state",
                            CollectionUtils.mapFromArgs(
                                    "stateId", stateRefType.getStateRef(),
                                    "stateComment", stateType.getComment(),
                                    "resultsForState", resultsForThisState));

                    resultsForThisIndividualValue.add(stateResultForThisStateAfterCombining);
                }
                catch (Exception ex)
                {
                    logger.error("individualCollectedValue=" + individualValue + " StateType=" + stateType.getId(), ex);
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                            "Exception evaluating state",
                            CollectionUtils.mapFromArgs("state", stateRefType.getStateRef(),
                                    "error", ex.getMessage()));

                    resultsForThisIndividualValue.add(ResultEnumeration.ERROR);
                }
            }
            //The result of comparing each state to a single item is combined based on the specified state_operator value
            ResultEnumeration resultForThisIndividualValue = OperatorAnalyzer.evaluate(stateOperator, resultsForThisIndividualValue);
            rv.add(resultForThisIndividualValue);
        }
        return rv;
    }

    public static FlagEnumeration calculateFlagEnumeration(List<StatusEnumeration> itemStatuses)
    {
        int errorCount = 0;
        int existsCount = 0;
        int doesNotExistCount = 0;
        int notCollectedCount = 0;
        if(itemStatuses==null)
        {
            return FlagEnumeration.NOT_COLLECTED;
        }
        for(StatusEnumeration statusEnumeration : itemStatuses)
        {
            switch (statusEnumeration)
            {
                case ERROR:
                    errorCount++;
                    break;
                case EXISTS:
                    existsCount++;
                    break;
                case NOT_COLLECTED:
                    notCollectedCount++;
                    break;
                case DOES_NOT_EXIST:
                    doesNotExistCount++;
                    break;
            }
        }
        if(errorCount>0)
        {
            return FlagEnumeration.ERROR;
        }
        if(notCollectedCount == 0 && existsCount>0)
        {
            return FlagEnumeration.COMPLETE;
        }
        if(notCollectedCount>0)
        {
            return FlagEnumeration.INCOMPLETE;
        }
        if(existsCount==0)
        {
            return FlagEnumeration.DOES_NOT_EXIST;
        }
        return FlagEnumeration.NOT_APPLICABLE;
    }


    public int getTimeout()
    {
        return timeout;
    }

    public void setTimeout(int timeout)
    {
        this.timeout = timeout;
    }

    public static OVALObjectImplBase getInstance(ObjectType objectType, OVALInterpreter ovalInterpreter)
    {
        if(objectType==null)
        {
            //don't do this
            return null;
        }
        if(objectType instanceof DpkginfoObject)
        {
            DpkginfoObjectImpl impl = new DpkginfoObjectImpl(ovalInterpreter, (DpkginfoObject)objectType);
            return impl;
        }
        if(objectType instanceof FileObject)
        {
            UnixFileObjectImpl impl = new UnixFileObjectImpl(ovalInterpreter, (FileObject) objectType);
            return impl;
        }
        if(objectType instanceof Textfilecontent54Object)
        {
            TextFileContent54ObjectImpl impl = new TextFileContent54ObjectImpl(ovalInterpreter, (Textfilecontent54Object) objectType);
            return impl;
        }
        if(objectType instanceof UnameObject)
        {
            UnameObjectImpl impl = new UnameObjectImpl(ovalInterpreter, (UnameObject) objectType);
            return impl;
        }
        if(objectType instanceof RpminfoObject)
        {
            RpmInfoObjectImpl impl = new RpmInfoObjectImpl(ovalInterpreter, (RpminfoObject) objectType);
            return impl;
        }
        if (objectType instanceof Process58Object)
        {
            Process58ObjectImpl impl = new Process58ObjectImpl(ovalInterpreter, (Process58Object) objectType);
            return impl;
        }
        if (objectType instanceof VariableObject)
        {
            VariableObjectImpl impl = new VariableObjectImpl (ovalInterpreter, (VariableObject) objectType);
            return impl;
        }
        if (objectType instanceof InetlisteningserversObject)
        {
            InetListeningServersObjectImpl impl = new InetListeningServersObjectImpl (ovalInterpreter, (InetlisteningserversObject) objectType);
            return impl;
        }
        if (objectType instanceof XmlfilecontentObject)
        {
            XmlFileContentObjectImpl impl = new XmlFileContentObjectImpl(ovalInterpreter, (XmlfilecontentObject) objectType);
            return impl;
        } 
        if (objectType instanceof RpmverifyfileObject)
        {
            RpmVerifyFileObjectImpl impl = new RpmVerifyFileObjectImpl(ovalInterpreter, (RpmverifyfileObject) objectType);
            return impl;
        }
        if (objectType instanceof org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject)
        {
            WindowsFileTestObjectImpl impl = new WindowsFileTestObjectImpl(ovalInterpreter, (org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject) objectType);
            return impl;
        }
        if (objectType instanceof RegistryObject)
        {
            RegistryObjectImpl impl = new RegistryObjectImpl(ovalInterpreter, (RegistryObject) objectType);
            return impl;
        } 
        if (objectType instanceof WmiObject)
        {
            WmiObjectImpl impl = new WmiObjectImpl(ovalInterpreter, (WmiObject) objectType);
            return impl;
        } 
        if (objectType instanceof Wmi57Object)
        {
            Wmi57ObjectImpl impl = new Wmi57ObjectImpl(ovalInterpreter, (Wmi57Object) objectType);
            return impl;
        }
        if (objectType instanceof CmdletObject)
        {
            CmdletObjectImpl impl = new CmdletObjectImpl(ovalInterpreter, (CmdletObject) objectType);
            return impl;
        }
        if (objectType instanceof ServiceObject)
        {
            WindowsServiceObjectImpl impl = new WindowsServiceObjectImpl(ovalInterpreter, (ServiceObject) objectType);
            return impl;
        }
        if (objectType instanceof PortObject)
        {
            WindowsPortObjectImpl impl = new WindowsPortObjectImpl(ovalInterpreter, (PortObject) objectType);
            return impl;
        }
        if (objectType instanceof FamilyObject)
        {
            FamilyObjectImpl impl = new FamilyObjectImpl(ovalInterpreter, (FamilyObject) objectType);
            return impl;
        }
        
        throw new UnsupportedOVALItemError(objectType.getClass() + " " + objectType.getId() + " is not supported");
    }

    /**
    protected ObjectCollectionResult collectValueInternal(DataCollectionTarget target, EntitySimpleBaseType entitySimpleBaseType)
    {
        throw new RuntimeException("Override collectValueInternal");
    }


     * @deprecated DON'T USE. to be removed
     * ONLY USE FOR OBJECTS WITH A SINGLE name ATTRIBUTE
     * such as rpm package name, dpkg package name etc
     * @param target
     * @param entitySimpleBaseType
     * @return
     */
    /*
    protected ObjectCollectionResult collectValuesForSingleItemName(DataCollectionTarget target, EntitySimpleBaseType entitySimpleBaseType)
    {
        //no var references
        if(entitySimpleBaseType.getVarRef()==null)
        {
            ObjectCollectionResult resultForValue = collectValueInternal(target, entitySimpleBaseType);
            switch (resultForValue.getCollectionStatus())
            {
                case ERROR:
                    this.setExistenceStatus(StatusEnumeration.ERROR);
                    break;
                case EXISTS:
                    this.setExistenceStatus(StatusEnumeration.EXISTS);
                    break;
                case NOT_COLLECTED:
                    this.setExistenceStatus(StatusEnumeration.DOES_NOT_EXIST);
                    break;
                case DOES_NOT_EXIST:
                    this.setExistenceStatus(StatusEnumeration.DOES_NOT_EXIST);
                    break;
            }
            return resultForValue;
        }
        else
        {
            List<Object> packageNames = OVALUtils.getValuesExpandingVariables(ovalInterpreter, entitySimpleBaseType);

            //If a variable does not have any value value when referenced by an OVAL Object
            //the object should be considered to not exist.
            if(packageNames==null || packageNames.isEmpty())
            {
                return returnNotExistsBecauseVariableHasNoValues(entitySimpleBaseType.getVarCheck());
            }
            int existenceDoesNotExistCount = 0;
            int existenceExistCount = 0;
            int existenceErrorCount = 0;
            int existenceNotCollectedCount = 0;


            ObjectCollectionResult finalReturnValue = new ObjectCollectionResult(true, entitySimpleBaseType.getVarCheck());
            for(Object tmpPackageNameObj : packageNames)
            {
                String packageName = String.valueOf(tmpPackageNameObj);
                ObjectCollectionResult resultForPackage = collectValueInternal(target, tmpPackageNameObj);
                switch (resultForPackage.getCollectionStatus())
                {
                    case ERROR:
                        existenceErrorCount++;
                        break;
                    case EXISTS:
                        existenceExistCount++;
                        break;
                    case NOT_COLLECTED:
                        existenceNotCollectedCount++;
                        break;
                    case DOES_NOT_EXIST:
                        existenceDoesNotExistCount++;
                        break;
                }
                finalReturnValue.addCollectionStatusForVarValue(resultForPackage.getCollectionStatus());
                finalReturnValue.addMultipleCollectedValues(resultForPackage.getCollectedValues());
            }
            this.setExistenceStatus(calculateStatusFromVariableValues(entitySimpleBaseType.getVarCheck(),
                    existenceDoesNotExistCount, existenceErrorCount, existenceNotCollectedCount, existenceExistCount));
            return finalReturnValue;
        }

    }
    */
}
