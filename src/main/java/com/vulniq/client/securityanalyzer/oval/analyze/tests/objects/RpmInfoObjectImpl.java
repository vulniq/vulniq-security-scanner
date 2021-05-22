

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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.linux.CollectedDpkgInfo;
import com.vulniq.client.securityanalyzer.datacollection.linux.CollectedRpmInfo;
import com.vulniq.client.securityanalyzer.datacollection.linux.DpkginfoCollector;
import com.vulniq.client.securityanalyzer.datacollection.linux.RpmInfoCollector;
import com.vulniq.client.securityanalyzer.datacollection.os.LinuxOSInfo;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.analyze.OperationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.OperatorAnalyzer;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import com.vulniq.client.securityanalyzer.oval.functions.ComponentGroup;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import com.vulniq.client.securityanalyzer.utils.VersionUtils;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.EntitySimpleBaseType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateEVRStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RpmInfoObjectImpl extends OVALObjectImplBase
{
    private Logger logger = LoggerFactory.getLogger(RpmInfoObjectImpl.class);
    private RpminfoObject objectDefinition;
    private static Map<DataCollectionTarget, List<CollectedRpmInfo>> rpmPackageCache = new HashMap<>();
    
    public RpmInfoObjectImpl(OVALInterpreter interpreter, RpminfoObject objectDefinition)
    {
        super(interpreter);
        this.objectDefinition = objectDefinition;
    }

    /**
     * always returns StatusEnumeration.NOT_COLLECTED because actual existence status is set in collectValue
     * @param dataCollectionTarget
     * @return
     */
    @Override
    protected StatusEnumeration checkExistence(DataCollectionTarget dataCollectionTarget)
    {
        return StatusEnumeration.NOT_COLLECTED;
    }

    @Override
    protected ObjectCollectionResult collectValues(DataCollectionTarget target)
    {
        ObjectCollectionResult rv = new ObjectCollectionResult();
        EntitySimpleBaseType packageNameDefinition = objectDefinition.getName();
        if(packageNameDefinition.getVarRef()!=null)
        {
            rv = new ObjectCollectionResult(true, packageNameDefinition.getVarCheck());
            try
            {
                List<ComponentGroup> componentsFromVarRef = resolveVariableRef(packageNameDefinition.getVarRef());
                if(componentsFromVarRef!=null)
                {
                    for(ComponentGroup group : componentsFromVarRef)
                    {
                        collectValueForPackageName(target, rv, group.getValue(), packageNameDefinition.getOperation(), group.getDataType(), true);
                    }
                }
            }
            catch (Exception ex)
            {
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, getId(),
                        "Error resolving variable reference",
                        CollectionUtils.mapFromArgs("error", ex.getMessage(), "variable", packageNameDefinition.getVarRef()));
                rv.addItemCollectionStatus(StatusEnumeration.ERROR);
            }
        }
        else
        {
            rv = new ObjectCollectionResult();
            String packageName = String.valueOf(packageNameDefinition.getValue());
            collectValueForPackageName(target, rv, packageName, packageNameDefinition.getOperation(), SimpleDatatypeEnumeration.STRING, false);
        }

        return rv;
    }

    protected void collectValueForPackageName(DataCollectionTarget target, ObjectCollectionResult objectCollectionResult, String packageName,
                                              OperationEnumeration packageNameComparisonOperation,
                                              SimpleDatatypeEnumeration datatypeEnumeration,
                                              boolean isValueFromVarRef)
    {
        if("linux".equals(packageName) && packageNameComparisonOperation==OperationEnumeration.EQUALS)
        {
            //shortcut to OSInfo
            LinuxOSInfo linuxOSInfo = (LinuxOSInfo)ovalInterpreter.getOsInfo();
            CollectedRpmInfo collectedRpmForLinux = new CollectedRpmInfo(linuxOSInfo.getUnameProperties());
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                    "Pseudo package 'linux' is always installed.",
                    CollectionUtils.mapFromArgs("package", collectedRpmForLinux, "version", collectedRpmForLinux.getEvr()));
            List<CollectedRpmInfo> linuxRpmList = new LinkedList<>();
            linuxRpmList.add(collectedRpmForLinux);
            objectCollectionResult.addCollectedValue(linuxRpmList, StatusEnumeration.EXISTS, isValueFromVarRef);

            return;
        }

        Map<String, CollectedRpmInfo> rpms = RpmInfoCollector.getAllRpmInfo(target);
        if(rpms==null)
        {
            //this means that an error occured
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                    "Failed to collect rpm info",
                    CollectionUtils.mapFromArgs("error", RpmInfoCollector.getCommandResultForTarget(target)));
            objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR, isValueFromVarRef);
        }
        else
        {
            List<CollectedRpmInfo> collectedRpmInfoList = new LinkedList<>();
            String packageNameToSearch = String.valueOf(packageName);
            for(String rpmName : rpms.keySet())
            {
                try
                {
                    ResultEnumeration operationResult = OperationAnalyzer.applyOperation(packageNameComparisonOperation, datatypeEnumeration, packageNameToSearch, rpmName);
                    if(operationResult==ResultEnumeration.TRUE)
                    {
                        if(logger.isDebugEnabled())
                        {
                            logger.debug("packageNameComparisonOperation=" + packageNameComparisonOperation + " datatypeEnumeration=" + datatypeEnumeration +
                                    " packageNameToSearch=" + packageNameToSearch + " rpmName=" + rpmName + " operationResult=" + operationResult);
                        }
                        collectedRpmInfoList.add(rpms.get(rpmName));
                    }
                }
                catch (Exception ex)
                {
                    logger.error("Error at package name=" + rpmName, ex);
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                            "Error comparing package names",
                            CollectionUtils.mapFromArgs("error", ex.getMessage(), "package", rpmName));
                    objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR, isValueFromVarRef);
                    return;
                }
            }
            if (!collectedRpmInfoList.isEmpty())
            {
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                        "Found matching package(s).",
                        CollectionUtils.mapFromArgs("package", packageName,
                                "operation", packageNameComparisonOperation,
                                "collected", collectedRpmInfoList));
                objectCollectionResult.addCollectedValue(collectedRpmInfoList, StatusEnumeration.EXISTS, isValueFromVarRef);
            }
            else
            {
                //this means that the package is not installed
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                        "No matching package",
                        CollectionUtils.mapFromArgs("package", packageName, "operation", packageNameComparisonOperation)
                );
                objectCollectionResult.addItemCollectionStatus(StatusEnumeration.DOES_NOT_EXIST, isValueFromVarRef);
            }
        }
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

    @Override
    protected List<ResultEnumeration> evaluateSingleValueVsState(Object individualCollectedValue, StateType stateType) throws Exception
    {
        List<CollectedRpmInfo> collectedRpmInfoList = (List<CollectedRpmInfo>) individualCollectedValue;
        RpminfoState state = (RpminfoState) stateType;
        List<ResultEnumeration> stateResultsToBeCombined = new LinkedList<>();

        for(CollectedRpmInfo collectedRpmInfo : collectedRpmInfoList)
        {
            List<ResultEnumeration> tempResultListForSingleObject = new LinkedList<>();

            if (state.getRest() != null)
            {
                //state.getRest contains child elements like
                // name, arch, epoch, release, version, evr, signature_keyid, extended_name, filepath

                for (JAXBElement jaxbElement : state.getRest())
                {
                    try
                    {
                        String elementName = jaxbElement.getName().getLocalPart();
                        switch (elementName)
                        {
                            case "version":
                                RpminfoState.Version rpmVersion = (RpminfoState.Version) jaxbElement.getValue();
                                ResultEnumeration resultForVersion = OperationAnalyzer.applyOperation(rpmVersion.getOperation(), rpmVersion.getDatatype(), rpmVersion.getValue(), collectedRpmInfo.getVersion());
                                logger.debug("RpminfoState.Version operation=" + rpmVersion.getOperation() + " dataType=" + rpmVersion.getDatatype() +
                                        " stateValue=" + rpmVersion.getValue() + " collectedVersion=" + collectedRpmInfo.getVersion() + " RESULT=" + resultForVersion);
                                tempResultListForSingleObject.add(resultForVersion);
                                break;
                            case "epoch":
                                String collectedEpochValue = collectedRpmInfo.getValueByElementName("epoch");
                                RpminfoState.Epoch rpmEpoch = (RpminfoState.Epoch) jaxbElement.getValue();
                                ResultEnumeration resultForEpoch = OperationAnalyzer.applyOperation(rpmEpoch.getOperation(), rpmEpoch.getDatatype(), rpmEpoch.getValue(), collectedEpochValue);
                                logger.debug("RpminfoState.Epoch operation=" + rpmEpoch.getOperation() + " dataType=" + rpmEpoch.getDatatype() +
                                        " stateValue=" + rpmEpoch.getValue() + " collectedEpoch=" + collectedEpochValue + " RESULT=" + resultForEpoch);
                                tempResultListForSingleObject.add(resultForEpoch);
                                break;
                            case "release":
                                RpminfoState.Release rpmRelease = (RpminfoState.Release) jaxbElement.getValue();
                                ResultEnumeration resultForRelease = OperationAnalyzer.applyOperation(rpmRelease.getOperation(), rpmRelease.getDatatype(), rpmRelease.getValue(),
                                        collectedRpmInfo.getValueByElementName("release"));
                                logger.debug("RpminfoState.Release operation=" + rpmRelease.getOperation() + " dataType=" + rpmRelease.getDatatype() +
                                        " stateValue=" + rpmRelease.getValue() + " collectedRelease=" +
                                        collectedRpmInfo.getValueByElementName("epoch") + " RESULT=" + resultForRelease);
                                tempResultListForSingleObject.add(resultForRelease);
                                break;
                            case "arch":    //EntityStateStringType
                            case "name":
                            case "signature_keyid":
                            case "extended_name":
                            case "filepath":

                                EntityStateStringType entityStateStringType = (EntityStateStringType) jaxbElement.getValue();
                                ResultEnumeration resultForElement = OperationAnalyzer.applyOperation(entityStateStringType.getOperation(), entityStateStringType.getDatatype(),
                                        entityStateStringType.getValue(), collectedRpmInfo.getValueByElementName(elementName));
                                logger.debug("RpminfoState.Release operation=" + entityStateStringType.getOperation() + " dataType=" + entityStateStringType.getDatatype() +
                                        " stateValue=" + entityStateStringType.getValue() + " collected Value=" +
                                        collectedRpmInfo.getValueByElementName("epoch") + " RESULT=" + resultForElement);
                                tempResultListForSingleObject.add(resultForElement);
                                break;
                            case "evr": //EntityStateEVRStringType
                                String collectedEvrValue = collectedRpmInfo.getValueByElementName("evr");
                                EntityStateEVRStringType entityStateEVRStringType = (EntityStateEVRStringType) jaxbElement.getValue();
                                ResultEnumeration resultForEVR = OperationAnalyzer.applyOperation(entityStateEVRStringType.getOperation(), entityStateEVRStringType.getDatatype(),
                                        entityStateEVRStringType.getValue(), collectedEvrValue);
                                logger.debug("RpminfoState.Release operation=" + entityStateEVRStringType.getOperation() + " dataType=" + entityStateEVRStringType.getDatatype() +
                                        " stateValue=" + entityStateEVRStringType.getValue() + " collectedEvr=" +
                                        collectedEvrValue + " RESULT=" + resultForEVR);
                                tempResultListForSingleObject.add(resultForEVR);
                                break;
                        }
                    }
                    catch (Exception ex)
                    {
                        logger.error("Error at evaluateSingleValueVsState element name=" + jaxbElement.getName(), ex);
                        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                                "Error evaluating object vs state",
                                CollectionUtils.mapFromArgs("error", ex.getMessage()));
                        tempResultListForSingleObject.add(ResultEnumeration.ERROR);
                    }
                }
            }
            ResultEnumeration resultOfASingleState = OperatorAnalyzer.evaluate(state.getOperator(), tempResultListForSingleObject);
            stateResultsToBeCombined.add(resultOfASingleState);
        }
        return stateResultsToBeCombined;
    }
    
    @Override
    public Map<String, List<String>> getCollectedItems()
    {
        return null;
    }
    

}
