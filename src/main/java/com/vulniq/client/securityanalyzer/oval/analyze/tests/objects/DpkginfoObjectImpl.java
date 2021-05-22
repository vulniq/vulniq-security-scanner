

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

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.linux.DpkginfoCollector;
import com.vulniq.client.securityanalyzer.datacollection.os.LinuxOSInfo;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter.OVALTypesForLog;
import com.vulniq.client.securityanalyzer.oval.analyze.OperationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.OperatorAnalyzer;
import com.vulniq.client.securityanalyzer.datacollection.linux.CollectedDpkgInfo;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import com.vulniq.client.securityanalyzer.oval.functions.ComponentGroup;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.EntitySimpleBaseType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateSimpleBaseType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.FlagEnumeration;
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


public class DpkginfoObjectImpl extends OVALObjectImplBase
{
    private static Logger logger = LoggerFactory.getLogger(DpkginfoObjectImpl.class);
    private DpkginfoObject dpkginfoObject;

    public DpkginfoObjectImpl(OVALInterpreter interpreter, DpkginfoObject objectDefinition)
    {
        super(interpreter);
        this.dpkginfoObject = objectDefinition;
    }

    /**
     * DO NOT USE
     * @param target
     * @param operationEnumeration
     * @param version1
     * @param version2
     * @return
     */
    public boolean compareVersions(DataCollectionTarget target, OperationEnumeration operationEnumeration, String version1, String version2)
    {
        OSCommandOutput cmdOut = null;
        String opForOperator = "eq";
        switch (operationEnumeration)
        {
            case LESS_THAN:
                opForOperator = "lt";
                break;
            case NOT_EQUAL:
                opForOperator = "ne";
                break;
            case GREATER_THAN:
                opForOperator = "gt";
                break;
            case LESS_THAN_OR_EQUAL:
                opForOperator = "le";
                break;
            case GREATER_THAN_OR_EQUAL:
                opForOperator = "ge";
                break;
            case EQUALS:
            default:
                opForOperator = "eq";
                break;
        }
        switch (target.getTargetType())
        {
            case Docker:
                cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(), "exec", target.getTargetName(), "/bin/bash", "-c",
                        String.format("dpkg --compare-versions %s %s %s", version1, opForOperator, version2));
                break;
            case Host:
            default:
                cmdOut = OSCommandUtils.runCommand(timeout, "dpkg", "--compare-versions", version1, opForOperator, version2);
                break;
        }
        if(cmdOut.getExitCode()==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    /**
     * always returns StatusEnumeration.NOT_COLLECTED because actual existence status is set in collectValue
     * @param target
     * @return
     */
    @Override
    protected StatusEnumeration checkExistence(DataCollectionTarget target)
    {
        return StatusEnumeration.NOT_COLLECTED;
    }

    /**
     * runs "dpkg -p packagename" and returns version
     * @return
     */
    @Override
    protected ObjectCollectionResult collectValues(DataCollectionTarget target)
    {
        EntitySimpleBaseType packageNameDefinition = dpkginfoObject.getName();
        ObjectCollectionResult rv = null;
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
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALTypesForLog.Object, getId(),
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
            CollectedDpkgInfo collectedDpkgForLinux = new CollectedDpkgInfo(linuxOSInfo.getUnameProperties());
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                    "Pseudo package 'linux' is always installed.",
                    CollectionUtils.mapFromArgs("package", collectedDpkgForLinux, "version", collectedDpkgForLinux.getEvr()));
            List<CollectedDpkgInfo> linuxDpkgList = new LinkedList<>();
            linuxDpkgList.add(collectedDpkgForLinux);
            objectCollectionResult.addCollectedValue(linuxDpkgList, StatusEnumeration.EXISTS, isValueFromVarRef);
            return;
        }

        Map<String, CollectedDpkgInfo> dpkgs = DpkginfoCollector.getAllDpkgInfo(target);
        if(dpkgs==null)
        {
            //this means that an error occured
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALTypesForLog.Object, this.getId(),
                    "Failed to collect dpkg info",
                    CollectionUtils.mapFromArgs("error", DpkginfoCollector.getCommandResultForTarget(target)));
            objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR, isValueFromVarRef);
        }
        else
        {
            List<CollectedDpkgInfo> collectedDpkgInfoList = new LinkedList<>();
            String packageNameToSearch = String.valueOf(packageName);
            for(String dpkgName : dpkgs.keySet())
            {
                try
                {
                    ResultEnumeration operationResult = OperationAnalyzer.applyOperation(packageNameComparisonOperation, datatypeEnumeration, packageNameToSearch, dpkgName);
                    if(operationResult==ResultEnumeration.TRUE)
                    {
                        if(logger.isDebugEnabled())
                        {
                            logger.debug("packageNameComparisonOperation=" + packageNameComparisonOperation + " datatypeEnumeration=" + datatypeEnumeration +
                                    " packageNameToSearch=" + packageNameToSearch + " dpkgName=" + dpkgName + " operationResult=" + operationResult);
                        }
                        collectedDpkgInfoList.add(dpkgs.get(dpkgName));
                    }
                }
                catch (Exception ex)
                {
                    logger.error("Error at package name=" + dpkgName, ex);
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALTypesForLog.Object, this.getId(),
                            "Error comparing package names",
                            CollectionUtils.mapFromArgs("error", ex.getMessage(), "package", dpkgName));
                    objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR, isValueFromVarRef);
                    return;
                }
            }
            if (!collectedDpkgInfoList.isEmpty())
            {
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                        "Found matching package(s).",
                        CollectionUtils.mapFromArgs("package", packageName,
                                "operation", packageNameComparisonOperation,
                                "collected", collectedDpkgInfoList));
                objectCollectionResult.addCollectedValue(collectedDpkgInfoList, StatusEnumeration.EXISTS, isValueFromVarRef);
            }
            else
            {
                //this means that the package is not installed
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALTypesForLog.Object, this.getId(),
                        "No matching package",
                        CollectionUtils.mapFromArgs("package", packageName,
                                "operation", packageNameComparisonOperation)
                );
                objectCollectionResult.addItemCollectionStatus(StatusEnumeration.DOES_NOT_EXIST, isValueFromVarRef);
            }
        }
    }

    @Override
    public String getId()
    {
        return dpkginfoObject.getId();
    }

    @Override
    public Set getChildSet()
    {
        return dpkginfoObject.getSet();
    }

    /**
     *
     * @param individualCollectedValue this is a CollectedDpkgInfo
     * @param state this is a DpkginfoState instance
     * @return
     */
    @Override
    protected List<ResultEnumeration> evaluateSingleValueVsState(Object individualCollectedValue, StateType state) throws Exception
    {
        DpkginfoState dpkginfoState = (DpkginfoState) state;

        List<CollectedDpkgInfo> collectedDpkgInfoList = (List<CollectedDpkgInfo>) (individualCollectedValue);
        List<JAXBElement<? extends EntityStateSimpleBaseType>> stateChildren = dpkginfoState.getRest();
        List<ResultEnumeration> stateResultsToBeCombined = new LinkedList<>();


        for(CollectedDpkgInfo collectedDpkgInfo : collectedDpkgInfoList)
        {
            List<ResultEnumeration> tempResultListForSingleObject = new LinkedList<>();
            for (JAXBElement<? extends EntityStateSimpleBaseType> childState : stateChildren)
            {

                if (childState.getValue().getVarRef() != null)
                {
                    //FIXME implement variable support in DpkginfoObjectImpl
                }

                if (childState.getValue() instanceof DpkginfoState.Evr)
                {
                    DpkginfoState.Evr stateEvr = (DpkginfoState.Evr) childState.getValue();
                    if (SimpleDatatypeEnumeration.EVR_STRING.value().equalsIgnoreCase(stateEvr.getDatatype()))
                    {
                        ResultEnumeration result = OperationAnalyzer.applyOperation(stateEvr.getOperation(), SimpleDatatypeEnumeration.EVR_STRING, stateEvr.getValue(), collectedDpkgInfo.getEvr());
                        logger.debug("state=" + state.getId() + " " + (state.getComment() != null ? state.getComment() : "") + " evrStr=" + collectedDpkgInfo.getEvr() + " result='" + result + "'");
                        tempResultListForSingleObject.add(result);
                    }
                    else if (SimpleDatatypeEnumeration.DEBIAN_EVR_STRING.value().equalsIgnoreCase(stateEvr.getDatatype()))
                    {
                        ResultEnumeration result = OperationAnalyzer.applyOperation(stateEvr.getOperation(), SimpleDatatypeEnumeration.DEBIAN_EVR_STRING, stateEvr.getValue(), collectedDpkgInfo.getEvr());
                        logger.debug("state=" + state.getId() + " " + (state.getComment() != null ? state.getComment() : "") + " debianEvrStr=" + collectedDpkgInfo.getEvr() + " result='" + result + "'");
                        tempResultListForSingleObject.add(result);
                    }
                    else
                    {
                        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                                "Unsupported evr data type, unable to evaluate state",
                                CollectionUtils.mapFromArgs("evrDataType", stateEvr.getDatatype(), "state", state.getId()));
                        tempResultListForSingleObject.add(ResultEnumeration.ERROR);
                    }
                }
                else if (childState.getValue() instanceof DpkginfoState.Epoch)
                {
                    DpkginfoState.Epoch stateEpoch = (DpkginfoState.Epoch) childState.getValue();

                    ResultEnumeration result = OperationAnalyzer.applyOperation(stateEpoch.getOperation(), stateEpoch.getDatatype(), stateEpoch.getValue(), collectedDpkgInfo.getEpoch());
                    logger.debug("state=" + state.getId() + " " + (state.getComment() != null ? state.getComment() : "") + " EpochStr=" + collectedDpkgInfo.getEpoch() + " result='" + result + "'");
                    tempResultListForSingleObject.add(result);
                }
                else if (childState.getValue() instanceof DpkginfoState.Version)
                {
                    DpkginfoState.Version stateVersion = (DpkginfoState.Version) childState.getValue();
                    ResultEnumeration result = OperationAnalyzer.applyOperation(stateVersion.getOperation(), stateVersion.getDatatype(), stateVersion.getValue(), collectedDpkgInfo.getVersion());
                    logger.debug("state=" + state.getId() + " " + (state.getComment() != null ? state.getComment() : "") + " VersionStr=" + collectedDpkgInfo.getVersion() + " result='" + result + "'");
                    tempResultListForSingleObject.add(result);
                }
                else if (childState.getValue() instanceof DpkginfoState.Release)
                {
                    DpkginfoState.Release stateRelease = (DpkginfoState.Release) childState.getValue();
                    ResultEnumeration result = OperationAnalyzer.applyOperation(stateRelease.getOperation(), stateRelease.getDatatype(), stateRelease.getValue(), collectedDpkgInfo.getRelease());
                    logger.debug("state=" + state.getId() + " " + (state.getComment() != null ? state.getComment() : "") + " ReleaseStr=" + collectedDpkgInfo.getRelease() + " result='" + result + "'");
                    tempResultListForSingleObject.add(result);
                }
                else if (childState.getName().getLocalPart().equals("name"))
                {
                    ResultEnumeration result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedDpkgInfo.getName());
                    logger.debug("state=" + state.getId() + " " + (state.getComment() != null ? state.getComment() : "") + " Name=" + collectedDpkgInfo.getName() + " result='" + result + "'");
                    tempResultListForSingleObject.add(result);
                }
                else if (childState.getName().getLocalPart().equals("arch"))
                {
                    ResultEnumeration result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedDpkgInfo.getArchitecture());
                    logger.debug("state=" + state.getId() + " " + (state.getComment() != null ? state.getComment() : "") + " Architecture=" + collectedDpkgInfo.getArchitecture() + " result='" + result + "'");
                    tempResultListForSingleObject.add(result);
                }
                else
                {
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                            "Unsupported state type",
                            CollectionUtils.mapFromArgs("class", (childState.getValue()).getClass().getName()));
                    tempResultListForSingleObject.add(ResultEnumeration.ERROR);
                }
            }
            ResultEnumeration resultOfASingleState = OperatorAnalyzer.evaluate(dpkginfoState.getOperator(), tempResultListForSingleObject);
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
