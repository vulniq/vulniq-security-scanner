
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
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windows.PowerShellFileSearchUtils;
import com.vulniq.client.securityanalyzer.datacollection.windows.CollectedWindowsFileInfo;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windowsfiletest.PowerShellFilePropertiesUtils;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import com.vulniq.client.securityanalyzer.oval.functions.ComponentGroup;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.mitre.oval.xmlschema.oval_common_5.CheckEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateSimpleBaseType;
import org.mitre.oval.xmlschema.oval_definitions_5.Filter;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileBehaviors;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.FlagEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class WindowsFileTestObjectImpl extends OVALObjectImplBase
{
    
    private static Logger logger = LoggerFactory.getLogger(WindowsFileTestObjectImpl.class);
    
    private List<FileObject> fileObjects = new ArrayList<>();
    private FileObject objectDefinition;
    private List<String> allFileSearchResults = new ArrayList<>();
    private CheckEnumeration varCheck = CheckEnumeration.ALL;
    private StatusEnumeration registryEntriesExistRunCollectValues = StatusEnumeration.NOT_COLLECTED;
    
    public WindowsFileTestObjectImpl(OVALInterpreter interpreter, FileObject objectDefinition)
    {
        super(interpreter);
        this.objectDefinition = objectDefinition;
        checkVarRef();
    }

    
    private FileObject copyObject(FileObject source)
    {
        FileObject destination = new FileObject();
        destination.setPath(source.getPath());
        destination.setBehaviors(source.getBehaviors());
        destination.setFilename(source.getFilename());
        destination.setFilepath(source.getFilepath());
        destination.setSet(source.getSet());
        return destination;
    }
    
    private void checkVarRef()
    {
        try
        {
            if (objectDefinition.getPath() != null)
            {
                if (objectDefinition.getPath().getVarRef() != null)
                {
                    logger.debug("checkVarRef objectDefinition.getPath().getVarRef() is not null");
                    List<ComponentGroup> paths = resolveVariableRef(objectDefinition.getPath().getVarRef());
                    varCheck = objectDefinition.getPath().getVarCheck();
                    for (ComponentGroup path : paths)
                    {
                        FileObject tempObject = copyObject(objectDefinition);
                        tempObject.getPath().setValue(path.getValue());
                        fileObjects.add(tempObject);
                    }
                }
            }
            if (objectDefinition.getFilepath() != null)
            {
                if (objectDefinition.getFilepath().getVarRef() != null)
                {
                    logger.debug("checkVarRef objectDefinition.getFilepath().getVarRef() is not null");
                    List<ComponentGroup> filepaths = resolveVariableRef(objectDefinition.getFilepath().getVarRef());
                    varCheck = objectDefinition.getFilepath().getVarCheck();
                    for (ComponentGroup filepath : filepaths)
                    {
                        FileObject tempObject = copyObject(objectDefinition);
                        tempObject.getFilepath().setValue(filepath.getValue());
                        fileObjects.add(tempObject);
                    }
                }
            }
            if (objectDefinition.getFilename() != null)
            {
                if (objectDefinition.getFilename().getValue() != null && objectDefinition.getFilename().getValue().getVarRef() != null)
                {
                    logger.debug("checkVarRef objectDefinition.getFilename().getValue().getVarRef() is not null");
                    List<ComponentGroup> filenames = resolveVariableRef(objectDefinition.getFilename().getValue().getVarRef());
                    varCheck = objectDefinition.getFilename().getValue().getVarCheck();
                    for (ComponentGroup filename : filenames)
                    {
                        FileObject tempObject = copyObject(objectDefinition);
                        tempObject.getFilename().getValue().setValue(filename.getValue());
                        fileObjects.add(tempObject);
                    }
                }
            }
            if (fileObjects.isEmpty())
            {
                fileObjects.add(objectDefinition);
            }
        }
        catch (Exception ex)
        {
            logger.error("checkVarRef unexpected error", ex);
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                    "Unexpected error while checking variable references.", CollectionUtils.mapFromArgs("error", ex.getMessage()));
            //TODO reflect this error in
        }
    }
    
    private StatusEnumeration checkSetExistence(Set parentSet)
    {
        List<Set> childSets = parentSet.getSet();
        if (childSets.size() != 0)
        {
            if (childSets.size() > 2)
            {
                logger.warn("checkSetExistence childSets.size() > 2. This is unexpected, please report this to VulnIQ support.");
                return StatusEnumeration.ERROR;
            }
            if (childSets.size() == 1)
            {
                logger.debug("checkSetExistence childSets.size is 1.");
                return checkSetExistence(childSets.get(0));
            }
            else
            {
                logger.debug("checkSetExistence childSets.size is 0.");
                Set firstChild = childSets.get(0);
                Set secondChild = childSets.get(1);
                StatusEnumeration firstExistence = checkSetExistence(firstChild);
                StatusEnumeration secondExistence = checkSetExistence(secondChild);
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
            try
            {
                List<String> objectReferences = parentSet.getObjectReference();
                String firstReference = null;
                String secondReference = null;
                if (objectReferences.size() > 2)
                {
                    logger.warn("checkSetExistence objectReferences.size() > 2. This is unexpected, please report this to VulnIQ support.");
                    return null;
                }
                else if (objectReferences.size() == 1)
                {
                    firstReference = objectReferences.get(0);
                    ObjectType firstObjectType = OVALXMLLoader.loadObject(ovalInterpreter.getDataSourceGuid(),
                                                                          firstReference,
                                                                          ovalInterpreter.getOsInfo().getDisplayVersion(),
                                                                          null);
                    
                    OVALObjectImplBase firstImpl = OVALObjectImplBase.getInstance(firstObjectType, ovalInterpreter);
                    StatusEnumeration existence = firstImpl.checkExistence(ovalInterpreter.getDataCollectionTarget());
                    if (existence == StatusEnumeration.EXISTS)
                    {
                        PowerShellFileSearchUtils firstSearcher = new PowerShellFileSearchUtils(
                                ovalInterpreter.getDataCollectionTarget(), (FileObject) firstObjectType);
                        String firstResults = firstSearcher.getFileSearchResults();
                        allFileSearchResults.add(firstResults);
                    }
                    return existence;
                }
                else
                {
                    firstReference = objectReferences.get(0);
                    secondReference = objectReferences.get(1);
                    
                    ObjectType firstObjectType = OVALXMLLoader.loadObject(ovalInterpreter.getDataSourceGuid(), firstReference,
                                                                          ovalInterpreter.getOsInfo().getDisplayVersion(),
                                                                          null);
                    
                    OVALObjectImplBase firstImpl = OVALObjectImplBase.getInstance(firstObjectType, ovalInterpreter);
                    StatusEnumeration firstExistence = firstImpl.checkExistence(ovalInterpreter.getDataCollectionTarget());
                    
                    ObjectType secondObjectType = OVALXMLLoader.loadObject(ovalInterpreter.getDataSourceGuid(),
                                                                           secondReference,
                                                                           ovalInterpreter.getOsInfo().getDisplayVersion(),
                                                                           null);
                    
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
                            PowerShellFileSearchUtils firstSearcher = new PowerShellFileSearchUtils(
                                    ovalInterpreter.getDataCollectionTarget(), (FileObject) firstObjectType);
                            String firstResults = firstSearcher.getFileSearchResults();
                            allFileSearchResults.add(firstResults);
                        }
                        if (secondExistence == StatusEnumeration.EXISTS)
                        {
                            PowerShellFileSearchUtils secondSearcher = new PowerShellFileSearchUtils(
                                    ovalInterpreter.getDataCollectionTarget(), (FileObject) firstObjectType);
                            String secondResults = secondSearcher.getFileSearchResults();
                            allFileSearchResults.add(secondResults);
                        }
                        return StatusEnumeration.EXISTS; // At least one result EXISTS so try to use that in further analysis.
                    }
                }
            }
            catch (Exception ex)
            {
                logger.error("checkSetExistence unexpected error. Returning null", ex);
                return null;
            }
        }
    }

    @Override
    protected void checkExistenceObjectReferenceExistsCallback(ObjectType objectType)
    {
        try
        {
            PowerShellFileSearchUtils firstSearcher = new PowerShellFileSearchUtils(ovalInterpreter.getDataCollectionTarget(), (FileObject) objectType);
            String firstResults = firstSearcher.getFileSearchResults();
            allFileSearchResults.add(firstResults);
        }
        catch (Exception ex)
        {
            logger.error("checkExistenceObjectReferenceExistsCallback object id=" + objectType.getId(), ex);
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_WARN, OVALInterpreter.OVALTypesForLog.Object, getId(),
                    "Failed to process a referenced file path",
                    CollectionUtils.mapFromArgs("error", ex.getMessage(), "Referenced object id", objectType.getId()));
        }
    }

    @Override
    public StatusEnumeration checkExistence(DataCollectionTarget dataCollectionTarget)
    {
        StatusEnumeration rv = StatusEnumeration.ERROR;
        for (FileObject fileObject : fileObjects)
        {
            PowerShellFileSearchUtils psFileSearcher = new PowerShellFileSearchUtils(dataCollectionTarget, fileObject);
            try
            {
                String results = psFileSearcher.getFileSearchResults();
                if (results != null && !results.trim().equals(""))
                {
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Object,
                                           this.getId(), "File or Folder exists",
                                           CollectionUtils.mapFromArgs("File or Folder Path: ", results));
                    this.allFileSearchResults.add(results);
                }
                else
                {
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Object,
                                           this.getId(), "File or Folder does not exist.",
                                           CollectionUtils.mapFromArgs("OVAL Object Comment: ",
                                                                       objectDefinition.getComment()));
                }
            }
            catch (Exception ex)
            {
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object,
                                       this.getId(),
                                       "Encountered with an error while trying to determine whether file or folder exists.",
                                        CollectionUtils.mapFromArgs("fileObject", fileObject.getComment())
                );
                return StatusEnumeration.ERROR;
            }
            //TODO "This may have other values, but I didn't see them in real OVAL Tests."
            if (varCheck == CheckEnumeration.ONLY_ONE)
            {
                if (allFileSearchResults.size() == 1)
                {
                    rv = StatusEnumeration.EXISTS;
                }
                else
                {
                    rv = StatusEnumeration.DOES_NOT_EXIST;
                    allFileSearchResults.clear();
                }
            }
            else // For values of CheckEnumeration ALL and ONLY_ONE.
            {
                if (allFileSearchResults.isEmpty())
                {
                    rv = StatusEnumeration.DOES_NOT_EXIST;
                }
                else
                {
                    rv = StatusEnumeration.EXISTS;
                }
            }
        }
        logger.debug("checkExistence returning:" + rv);
        this.registryEntriesExistRunCollectValues = rv;
        return rv;
    }
    
    @Override
    public ObjectCollectionResult collectValues(DataCollectionTarget dataCollectionTarget)
    {
        ObjectCollectionResult rv = new ObjectCollectionResult();
        if (this.registryEntriesExistRunCollectValues != StatusEnumeration.EXISTS)
        {
            rv.addItemCollectionStatus(StatusEnumeration.DOES_NOT_EXIST);
            rv.setFlagEnumeration(FlagEnumeration.DOES_NOT_EXIST);
            return rv;
        }
        else
        {
            try
            {
                for (FileObject fileObject : fileObjects)
                {
                    CollectedWindowsFileInfo collectedFileInfo = new CollectedWindowsFileInfo();
                    PowerShellFileSearchUtils psFileSearcher = new PowerShellFileSearchUtils(dataCollectionTarget,
                                                                                             fileObject);

                    List<String> allAbsoluteFilepaths = new ArrayList<>();
                    for (String fileSearchResult : allFileSearchResults)
                    {
                        String[] tempAbsolutePaths = psFileSearcher.convertFileSearchResultsToAbsolutePath(
                                fileSearchResult);
                        allAbsoluteFilepaths.addAll(Arrays.asList(tempAbsolutePaths));
                    }

                    String[] fileSearchResultArray = allAbsoluteFilepaths.toArray(new String[0]);

                    int index = 0;
                    int nonExistenceCounter = 0;

                    for (String filepath : fileSearchResultArray)
                    {
                        PowerShellFilePropertiesUtils psFilePropertiesUtils = new PowerShellFilePropertiesUtils(
                                dataCollectionTarget);
                        if (!psFilePropertiesUtils.checkFileOrFolderExists(filepath))
                        {
                            nonExistenceCounter++;
                            if (index == fileSearchResultArray.length - 1 && index == nonExistenceCounter - 1)
                            {
                                rv.addItemCollectionStatus(StatusEnumeration.DOES_NOT_EXIST);
                                return rv;
                            }
                        }
                        else
                        {
                            if (objectDefinition.getFilename() != null && objectDefinition.getFilename().isNil()) // If the filepath points to a directory rather than a file.
                            {
                                collectedFileInfo = psFilePropertiesUtils.getDirectoryAllInfo(filepath);
                                collectedFileInfo.setWindowsView(getObjectWindowsViewProperty());
                                rv.addCollectedValue(collectedFileInfo, StatusEnumeration.EXISTS);
                            }
                            else
                            {
                                collectedFileInfo = psFilePropertiesUtils.getFileAllInfo(filepath);
                                rv.addCollectedValue(collectedFileInfo, StatusEnumeration.EXISTS);
                            }

                            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG,
                                                   OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                                                   "File or Folder properties are collected successfully",
                                                   CollectionUtils.mapFromArgs("File or Folder Path: ", filepath));
                        }
                        index++;
                    }
                }
            }
            catch (Exception ex)
            {
                logger.error("collectValues Error trying to collect file or folder properties", ex);
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object,
                                       this.getId(),
                                       "Encountered an error while trying to collect file or folder properties.",
                                       CollectionUtils.mapFromArgs("error", ex.getMessage()));
                rv.addItemCollectionStatus(StatusEnumeration.ERROR);
                return rv;
            }
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("collectValues returning:" + StringUtils.toJson(rv, false));
        }
        return rv;
    }
    
    @Override
    protected List<ResultEnumeration> evaluateSingleValueVsState(Object individualCollectedValue, StateType stateType) throws Exception
    {
        CollectedWindowsFileInfo collectedWindowsFileInfo = (CollectedWindowsFileInfo) individualCollectedValue;
        FileState fileState = (FileState) stateType;
        List<ResultEnumeration> resultsToBeCombined = new ArrayList<>();
        
        for (JAXBElement<? extends EntityStateSimpleBaseType> childState : fileState.getRest())
        {
            EntityStateSimpleBaseType childStateValue = childState.getValue();
            List<String> objectValueList = new ArrayList<>();
            
            switch (childState.getName().getLocalPart())
            {
                case "path":
                    objectValueList.add(collectedWindowsFileInfo.getPath());
                    break;
                case "filepath":
                    objectValueList.add(collectedWindowsFileInfo.getFilepath());
                    break;
                case "filename":
                    objectValueList.add(collectedWindowsFileInfo.getFilename());
                    break;
                case "owner":
                    objectValueList.add(collectedWindowsFileInfo.getOwner());
                    break;
                case "size":
                    objectValueList.add(collectedWindowsFileInfo.getSize());
                    break;
                case "a_time":
                    objectValueList.add(collectedWindowsFileInfo.getaTime());
                    break;
                case "c_time":
                    objectValueList.add(collectedWindowsFileInfo.getcTime());
                    break;
                case "m_time":
                    objectValueList.add(collectedWindowsFileInfo.getmTime());
                    break;
                case "ms_checksum":
                    objectValueList.add(collectedWindowsFileInfo.getMsChecksum());
                    break;
                case "version":
                    objectValueList.add(collectedWindowsFileInfo.getVersion());
                    break;
                case "type":
                    objectValueList.add(collectedWindowsFileInfo.getType());
                    break;
                case "attribute":
                    objectValueList.addAll(collectedWindowsFileInfo.getAttribute());
                    break;
                case "development_class":
                    objectValueList.add(collectedWindowsFileInfo.getDevelopmentClass());
                    break;
                case "company":
                    objectValueList.add(collectedWindowsFileInfo.getCompany());
                    break;
                case "internal_name":
                    objectValueList.add(collectedWindowsFileInfo.getInternalName());
                    break;
                case "language":
                    objectValueList.add(collectedWindowsFileInfo.getLanguage());
                    break;
                case "original_filename":
                    objectValueList.add(collectedWindowsFileInfo.getOriginalFilename());
                    break;
                case "product_name":
                    objectValueList.add(collectedWindowsFileInfo.getProductName());
                    break;
                case "product_version":
                    objectValueList.add(collectedWindowsFileInfo.getProductVersion());
                    break;
                case "windows_view":
                    objectValueList.add(collectedWindowsFileInfo.getWindowsView());
                    break;
            }
            
            if (objectValueList.size() > 0)
            {
                
                for (String objectValue : objectValueList)
                {
                    ResultEnumeration result;
                    if (childState.getValue().getVarRef() != null)
                    {
                        List<ComponentGroup> componentGroups = this.resolveVariableRef(
                                childState.getValue().getVarRef());
                        List<ResultEnumeration> interimResults = new ArrayList<>();
                        try
                        {
                            for (ComponentGroup componentGroup : componentGroups)
                            {
                                ResultEnumeration tempResult = OperationAnalyzer.applyOperation(
                                        childState.getValue().getOperation(), componentGroup.getDataType(),
                                        componentGroup.getValue(), objectValue);
                                interimResults.add(tempResult);
                            }
                            ResultEnumeration resultOfSingleStateEntry = CheckEnumerationAnalyzer.evaluate(childState.getValue().getVarCheck(), interimResults);
                            resultsToBeCombined.add(resultOfSingleStateEntry);
                            logger.debug("State = " + fileState.getId() + ", State Comment = " + fileState.getComment() +
                                            ", Object Property = '" + objectValue + "'" + ", State Operator = '" +
                                            childState.getValue().getOperation().toString() + "'" + ", Variable ID which the State Refers  = '" +
                                            childState.getValue().getVarRef() + "'" + ", Result = '" + resultOfSingleStateEntry + "'");
                        }
                        catch (Exception ex)
                        {
                            logger.error("evaluateSingleValueVsState error evaluating varRef", ex);
                            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR,
                                                   OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                                                   "An error occured while comparing the file item to the state which contains a variable reference.",
                                                   CollectionUtils.mapFromArgs("class",
                                                                               (childState.getValue()).getClass().getName()));
                            resultsToBeCombined.add(ResultEnumeration.ERROR);

                        }
                        
                    }
                    else
                    {
                        try
                        {
                            result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(),
                                                                      childState.getValue().getDatatype(),
                                                                      childState.getValue().getValue(), objectValue);
                            logger.debug("State = " + fileState.getId() + ", State Comment = " + fileState.getComment() +
                                            ", Object Property = '" + objectValue + "'" + ", State Operator = '" +
                                            childState.getValue().getOperation().toString() + "'" + ", State Property = '" +
                                            childState.getValue().getValue().toString() + "'" + ", Result = '" + result + "'");
                            resultsToBeCombined.add(result);
                        }
                        catch (UnexpectedOVALEvaluationError ex)
                        {
                            try
                            {
                                result = OperationAnalyzer.applyOperationVersion(childState.getValue().getOperation(),
                                                                                 childState.getValue().getValue(),
                                                                                 objectValue);
                                logger.debug("State = " + fileState.getId() + ", State Comment = " + fileState.getComment() +
                                                ", Object Property = '" + objectValue + "'" + ", State Operator = '" +
                                                childState.getValue().getOperation().toString() + "'" + ", State Property = '" +
                                                childState.getValue().getValue().toString() + "'" + ", Result = '" + result + "'");
                                resultsToBeCombined.add(result);
                            }
                            catch (UnexpectedOVALEvaluationError ex2)
                            {
                                logger.error("evaluateSingleValueVsState ex2", ex2);
                                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR,
                                                       OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                                                       "Unsupported state type", CollectionUtils.mapFromArgs("class",
                                                                                                             (childState.getValue()).getClass().getName()));
                                resultsToBeCombined.add(ResultEnumeration.ERROR);
                            }
                        }
                    }
                }
            }
            else
            {
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object,
                                       this.getId(), "Unsupported state type",
                                        CollectionUtils.mapFromArgs("class", (childState.getValue()).getClass().getName()));
                resultsToBeCombined.add(ResultEnumeration.ERROR);
            }
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("evaluateSingleValueVsState returning:" + resultsToBeCombined);
        }
        return resultsToBeCombined;
    }
    
    @Override
    public Map<String, List<String>> getCollectedItems()
    {
        return null;
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

    private String getObjectWindowsViewProperty()
    {
        FileBehaviors behaviors = objectDefinition.getBehaviors();
        
        if (behaviors == null)
        {
            return "64_bit";
        }
        else if (behaviors.getWindowsView() == null)
        {
            return "64_bit";
        }
        else
        {
            return behaviors.getWindowsView();
        }
    }
}
