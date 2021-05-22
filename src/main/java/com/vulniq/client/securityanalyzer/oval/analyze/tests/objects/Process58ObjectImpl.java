
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
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.analyze.OperationAnalyzer;
import com.vulniq.client.securityanalyzer.datacollection.unix.ProcessProperties;
import com.vulniq.client.securityanalyzer.datacollection.unix.PsOutputParser;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import com.vulniq.client.securityanalyzer.oval.functions.ComponentGroup;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.mitre.oval.xmlschema.oval_common_5.CheckEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.Process58Object;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.Process58State;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Process58ObjectImpl extends OVALObjectImplBase
{

    private static Logger logger = LoggerFactory.getLogger(Process58ObjectImpl.class);
    private Process58Object process58Object;

    public Process58ObjectImpl(OVALInterpreter interpreter, Process58Object objectDefinition)
    {
        super(interpreter);
        this.process58Object = objectDefinition;
    }

    protected OSCommandOutput runPsCommand(DataCollectionTarget dataCollectionTarget)
    {
        String psCommand = "ps -e -o cputime,pid,ppid,pri,ruid,lstart,tty,uid,sess,command"; //TODO:add cls,label
        OSCommandOutput cmdOut = null;
        switch (dataCollectionTarget.getTargetType())
        {
            case Docker:
                cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                        "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                        psCommand);
                break;
            case Host:
            default:
                cmdOut = OSCommandUtils.runCommand(timeout, "ps", "-e", "-o",
                        "cputime,pid,ppid,pri,ruid,start,tty,uid,sess,command");
                break;
        }
        return cmdOut;
    }

    /**
     * returns StatusEnumeration.NOT_COLLECTED, existence will be set in collectValues
     * @param dataCollectionTarget
     * @return
     */
    @Override
    public StatusEnumeration checkExistence(DataCollectionTarget dataCollectionTarget)
    {
        return StatusEnumeration.NOT_COLLECTED;
    }

    @Override
    public ObjectCollectionResult collectValues(DataCollectionTarget dataCollectionTarget)
    {
        OSCommandOutput cmdOut = runPsCommand(dataCollectionTarget);
        List<ProcessProperties> processList = PsOutputParser.parsePsCommandOutput(cmdOut.getStdOut());
        ObjectCollectionResult objectCollectionResult = new ObjectCollectionResult();;

        EntityObjectIntType pidDefinition = process58Object.getPid();
        EntityObjectStringType commandLineDefinition = process58Object.getCommandLine();
        List<ComponentGroup> pidValues = null;
        List<ComponentGroup> commandLineValues = null;
        CheckEnumeration varCheck = null;
        boolean hasVarRefs = false;
        try
        {
            if (pidDefinition.getVarRef() != null)
            {
                pidValues = resolveVariableRef(pidDefinition.getVarRef());
                hasVarRefs = true;
                varCheck = pidDefinition.getVarCheck();
            }
            else
            {
                ComponentGroup dummyComponentGroup = new ComponentGroup();
                dummyComponentGroup.setValue(String.valueOf(pidDefinition.getValue()));
                dummyComponentGroup.setDataType(SimpleDatatypeEnumeration.fromValue(pidDefinition.getDatatype()));
                pidValues = new LinkedList<>();
                pidValues.add(dummyComponentGroup);
            }
            if(commandLineDefinition.getVarRef() != null)
            {
                commandLineValues = resolveVariableRef(commandLineDefinition.getVarRef());
                hasVarRefs = true;
                varCheck = commandLineDefinition.getVarCheck();
            }
            else
            {
                ComponentGroup dummyComponentGroup = new ComponentGroup();
                dummyComponentGroup.setValue(String.valueOf(commandLineDefinition.getValue()));
                dummyComponentGroup.setDataType(SimpleDatatypeEnumeration.fromValue(commandLineDefinition.getDatatype()));
                commandLineValues = new LinkedList<>();
                commandLineValues.add(dummyComponentGroup);
            }
            if(hasVarRefs)
            {
                objectCollectionResult = new ObjectCollectionResult(true, varCheck);
            }
        }
        catch (Exception ex)
        {
            objectCollectionResult = new ObjectCollectionResult();
            logger.error("collectValues error resolving variable refs", ex);
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                    "Failed to resolve variable references",
                    CollectionUtils.mapFromArgs("error", ex.getMessage()));
            objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR);
        }
        int errorCount = 0;
        int existsCount = 0;
        for(ComponentGroup pidValueInLoop : pidValues)
        {
            for(ComponentGroup commandLineValueInLoop : commandLineValues)
            {
                for (ProcessProperties processIndex : processList)
                {
                    try
                    {
                        ResultEnumeration resultForPid = OperationAnalyzer.applyOperation(pidDefinition.getOperation(), pidDefinition.getDatatype(), pidValueInLoop.getValue(), processIndex.getPid());
                        ResultEnumeration resultForCommandLine = OperationAnalyzer.applyOperation(commandLineDefinition.getOperation(), commandLineDefinition.getDatatype(), commandLineValueInLoop.getValue(), processIndex.getCommand());
                        if (resultForPid == ResultEnumeration.TRUE && resultForCommandLine == ResultEnumeration.TRUE ) // Check if this is true
                        {
                            objectCollectionResult.addCollectedValue(processIndex, StatusEnumeration.EXISTS, hasVarRefs);
                            existsCount++;
                        }
                    }
                    catch (UnexpectedOVALEvaluationError unexpectedOVALEvaluationError)
                    {
                        logger.error("collectValues UnexpectedOVALEvaluationError", unexpectedOVALEvaluationError);
                        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                                "Unexpected datatype or operation",
                                CollectionUtils.mapFromArgs("error", unexpectedOVALEvaluationError.getMessage(),
                                    "process", processIndex, "pid", pidValueInLoop, "commandLine", commandLineValueInLoop ));
                        objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR);
                        errorCount++;
                    }
                }
            }
        }

        if(logger.isDebugEnabled())
        {
            logger.debug("collectValues returning:" + StringUtils.toJson(objectCollectionResult, false));
        }
        return objectCollectionResult;
    }

    @Override
    public String getId()
    {
        return process58Object.getId();
    }

    @Override
    public Set getChildSet()
    {
        return process58Object.getSet();
    }

    /**
     *
     * @param individualCollectedValue will be a ProcessProperties instance
     * @param stateType
     * @return
     * @throws Exception
     */
    @Override
    public List<ResultEnumeration> evaluateSingleValueVsState(Object individualCollectedValue, StateType stateType) throws Exception
    {
        Process58State process58State = (Process58State) stateType;

        ProcessProperties collectedProcessProperties = (ProcessProperties) (individualCollectedValue);
        List<ResultEnumeration> resultsToBeCombined = new LinkedList<>();

        if (process58State.getCommandLine() != null)
        {
            ResultEnumeration resultForCommandLine = OperationAnalyzer.applyOperation(
                    process58State.getCommandLine().getOperation(),
                    process58State.getCommandLine().getDatatype(),
                    process58State.getCommandLine().getValue(),
                    collectedProcessProperties.getCommand());
            resultsToBeCombined.add(resultForCommandLine);
        }
        if (process58State.getPid() != null)
        {
            ResultEnumeration resultForPid = OperationAnalyzer.applyOperation(
                    process58State.getPid().getOperation(),
                    process58State.getPid().getDatatype(),
                    process58State.getPid().getValue(),
                    collectedProcessProperties.getPid());
            resultsToBeCombined.add(resultForPid);
        }
        if (process58State.getExecTime() != null)
        {
            ResultEnumeration resultForExecTime = OperationAnalyzer.applyOperation(
                    process58State.getExecTime().getOperation(),
                    process58State.getExecTime().getDatatype(),
                    process58State.getExecTime().getValue(),
                    collectedProcessProperties.getCpuTime());
            resultsToBeCombined.add(resultForExecTime);
        }
        if (process58State.getPpid() != null)
        {
            ResultEnumeration resultForPpid = OperationAnalyzer.applyOperation(
                    process58State.getPpid().getOperation(),
                    process58State.getPpid().getDatatype(),
                    process58State.getPpid().getValue(),
                    collectedProcessProperties.getPpid());
            resultsToBeCombined.add(resultForPpid);
        }
        if (process58State.getPriority() != null)
        {
            ResultEnumeration resultForPriority = OperationAnalyzer.applyOperation(
                    process58State.getPriority().getOperation(),
                    process58State.getPriority().getDatatype(),
                    process58State.getPriority().getValue(),
                    collectedProcessProperties.getPri());
            resultsToBeCombined.add(resultForPriority);
        }
        if (process58State.getRuid() != null)
        {
            ResultEnumeration resultForRuid = OperationAnalyzer.applyOperation(
                    process58State.getRuid().getOperation(),
                    process58State.getRuid().getDatatype(),
                    process58State.getRuid().getValue(),
                    collectedProcessProperties.getRuid());
            resultsToBeCombined.add(resultForRuid);
        }
        if (process58State.getSchedulingClass() != null)
        {
            ResultEnumeration resultForSchedulingClass = OperationAnalyzer.applyOperation(
                    process58State.getSchedulingClass().getOperation(),
                    process58State.getSchedulingClass().getDatatype(),
                    process58State.getSchedulingClass().getValue(),
                    collectedProcessProperties.getCls());
            resultsToBeCombined.add(resultForSchedulingClass);
        }
        if (process58State.getStartTime() != null)
        {
            ResultEnumeration resultForStartTime = OperationAnalyzer.applyOperation(
                    process58State.getStartTime().getOperation(),
                    process58State.getStartTime().getDatatype(),
                    process58State.getStartTime().getValue(),
                    collectedProcessProperties.getStart());
            resultsToBeCombined.add(resultForStartTime);
        }
        if (process58State.getTty() != null)
        {
            ResultEnumeration resultForTty = OperationAnalyzer.applyOperation(
                    process58State.getTty().getOperation(),
                    process58State.getTty().getDatatype(),
                    process58State.getTty().getValue(),
                    collectedProcessProperties.getTty());
            resultsToBeCombined.add(resultForTty);
        }
        if (process58State.getUserId() != null)
        {
            ResultEnumeration resultForUserId = OperationAnalyzer.applyOperation(
                    process58State.getUserId().getOperation(),
                    process58State.getUserId().getDatatype(),
                    process58State.getUserId().getValue(),
                    collectedProcessProperties.getUid());
            resultsToBeCombined.add(resultForUserId);
        }
        if (process58State.getExecShield() != null)
        {
            ResultEnumeration resultForExecShield = OperationAnalyzer.applyOperation(
                    process58State.getExecShield().getOperation(),
                    process58State.getExecShield().getDatatype(),
                    process58State.getExecShield().getValue(),
                    collectedProcessProperties.getExecShield());
            resultsToBeCombined.add(resultForExecShield);
        }
        if (process58State.getLoginuid() != null)
        {
            ResultEnumeration resultForLoginuid = OperationAnalyzer.applyOperation(
                    process58State.getLoginuid().getOperation(),
                    process58State.getLoginuid().getDatatype(),
                    process58State.getLoginuid().getValue(),
                    collectedProcessProperties.getLoginuid());
            resultsToBeCombined.add(resultForLoginuid);
        }
        if (process58State.getPosixCapability() != null)
        {
            ResultEnumeration resultForPosixCapability = OperationAnalyzer.applyOperation(
                    process58State.getPosixCapability().getOperation(),
                    process58State.getPosixCapability().getDatatype(),
                    process58State.getPosixCapability().getValue(),
                    collectedProcessProperties.getPosixCapability());
            resultsToBeCombined.add(resultForPosixCapability);
        }
        if (process58State.getSelinuxDomainLabel() != null)
        {
            ResultEnumeration resultForSelinuxDomainLabel = OperationAnalyzer.applyOperation(
                    process58State.getSelinuxDomainLabel().getOperation(),
                    process58State.getSelinuxDomainLabel().getDatatype(),
                    process58State.getSelinuxDomainLabel().getValue(),
                    collectedProcessProperties.getLabel());
            resultsToBeCombined.add(resultForSelinuxDomainLabel);
        }
        if (process58State.getSessionId() != null)
        {
            ResultEnumeration resultForSessionId = OperationAnalyzer.applyOperation(
                    process58State.getSessionId().getOperation(),
                    process58State.getSessionId().getDatatype(),
                    process58State.getSessionId().getValue(),
                    collectedProcessProperties.getSess());
            resultsToBeCombined.add(resultForSessionId);
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("evaluateSingleValueVsState resultsToBeCombined=" + resultsToBeCombined);
        }
        return resultsToBeCombined;
    }
    
    @Override
    public Map<String, List<String>> getCollectedItems()
    {
        return null;
    }
    
}
