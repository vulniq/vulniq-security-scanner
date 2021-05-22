
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
import com.vulniq.client.securityanalyzer.datacollection.unix.InetListeningServersProperties;
import com.vulniq.client.securityanalyzer.datacollection.unix.NetstatOutputParser;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectIPAddressStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.InetlisteningserversObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.InetlisteningserversState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.FlagEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * TODO add variable support
 */
public class InetListeningServersObjectImpl extends OVALObjectImplBase
{

    private static Logger logger = LoggerFactory.getLogger(InetListeningServersObjectImpl.class);
    private InetlisteningserversObject inetListeningServersObject;

    public InetListeningServersObjectImpl(OVALInterpreter interpreter, InetlisteningserversObject objectDefinition)
    {
        super(interpreter);
        this.inetListeningServersObject = objectDefinition;
    }

    public OSCommandOutput runNetstatCommand(DataCollectionTarget dataCollectionTarget)
    {
        final String netstatCommand = "netstat";
        final String netStatArgument = "-tuwlnpe";

        OSCommandOutput cmdOut = null;

        switch (dataCollectionTarget.getTargetType())
        {
            case Docker:
                cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                        "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                          netstatCommand + " " + netStatArgument);
                break;
            case Host:
            default:
                cmdOut = OSCommandUtils.runCommand(timeout, netstatCommand, netStatArgument);
                break;
        }
        return cmdOut;
    }

    /**
     * always returns StatusEnumeration.NOT_COLLECTED because actual existence
     * status is set in collectValues
     *
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
        ObjectCollectionResult objectCollectionResult = new ObjectCollectionResult();

        OSCommandOutput cmdOut = runNetstatCommand(dataCollectionTarget);
        List<InetListeningServersProperties> netstatOutputList = NetstatOutputParser.parseNetsatCommandOutput(cmdOut.getStdOut());

        EntityObjectStringType protocolDefinition = inetListeningServersObject.getProtocol();
        EntityObjectIntType localPortDefinition = inetListeningServersObject.getLocalPort();
        EntityObjectIPAddressStringType localAddressDefinition = inetListeningServersObject.getLocalAddress();

        int errorCount = 0;

        if (cmdOut.isErrorOccured())
        {
            addFailedLog(cmdOut.getError());
            objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR);
            return objectCollectionResult;
        }
        else if (cmdOut.isTimedOut())
        {
            addTimedOutLog(timeout);
            objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR);
            return objectCollectionResult;
        }
        else
        {
            //exit code is not 0 if netstat is not found (should never happen)
            if (cmdOut.getExitCode() != 0)
            {
                objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR);
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                        "netstat command could not be found", CollectionUtils.mapFromArgs("exitCode", cmdOut.getExitCode()));
                return objectCollectionResult;
            }
            else
            {
                String netstatOutputString = cmdOut.getStdOut().trim();
                if (netstatOutputString != null)
                {
                    for (InetListeningServersProperties netstatIndex : netstatOutputList)
                    {
                        try
                        {
                            ResultEnumeration resultForProtocol = OperationAnalyzer.applyOperation(protocolDefinition.getOperation(), protocolDefinition.getDatatype(), protocolDefinition.getValue(), netstatIndex.getProtocol());
                            ResultEnumeration resultForLocalPort = OperationAnalyzer.applyOperation(localPortDefinition.getOperation(), localPortDefinition.getDatatype(), localPortDefinition.getValue(), netstatIndex.getLocalPort());
                            ResultEnumeration resultForLocalAddress = OperationAnalyzer.applyOperation(localAddressDefinition.getOperation(), localAddressDefinition.getDatatype(), localAddressDefinition.getValue(), netstatIndex.getLocalAddress());
                            if(logger.isDebugEnabled())
                            {
                                logger.debug("collectValues netstat entry=" + netstatIndex + " resultForProtocol=" + resultForProtocol
                                        + " resultForLocalPort=" + resultForLocalPort + " resultForLocalAddress=" + resultForLocalAddress);
                            }
                            if (resultForProtocol == ResultEnumeration.TRUE || resultForLocalPort == ResultEnumeration.TRUE || resultForLocalAddress == ResultEnumeration.TRUE)
                            {
                                objectCollectionResult.addCollectedValue(netstatIndex, StatusEnumeration.EXISTS);
                            }
                        }
                        catch (UnexpectedOVALEvaluationError ex)
                        {
                            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                                    "Unexpected datatype or unexpected operation",
                                    CollectionUtils.mapFromArgs("error", ex.getMessage(), "netstatEntry", netstatIndex));
                            objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR);
                            errorCount++;
                        }
                    }
                }
                else
                {
                    objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR);
                }
            }
        }

        FlagEnumeration collectionStatusFlag = objectCollectionResult.getCollectionStatus();
        if(logger.isDebugEnabled())
        {
            logger.debug("collectValues returning:" + StringUtils.toJson(objectCollectionResult, false));
        }
        return objectCollectionResult;
    }

    @Override
    public List<ResultEnumeration> evaluateSingleValueVsState(Object individualCollectedValue, StateType stateType) throws Exception
    {
        InetlisteningserversState inetListeningServersState = (InetlisteningserversState) stateType;

        InetListeningServersProperties collectedInetListeningServersProperties = (InetListeningServersProperties) (individualCollectedValue);
        List<ResultEnumeration> resultsToBeCombined = new LinkedList<>();

        if (inetListeningServersState.getProtocol() != null)
        {
            ResultEnumeration resultForProtocol = OperationAnalyzer.applyOperation(
                    inetListeningServersState.getProtocol().getOperation(),
                    inetListeningServersState.getProtocol().getDatatype(),
                    inetListeningServersState.getProtocol().getValue(),
                    collectedInetListeningServersProperties.getProtocol());
            resultsToBeCombined.add(resultForProtocol);
        }
        if (inetListeningServersState.getLocalFullAddress() != null)
        {
            ResultEnumeration resultForLocalFullAddress = OperationAnalyzer.applyOperation(
                    inetListeningServersState.getLocalFullAddress().getOperation(),
                    inetListeningServersState.getLocalFullAddress().getDatatype(),
                    inetListeningServersState.getLocalFullAddress().getValue(),
                    collectedInetListeningServersProperties.getLocalFullAddress());
            resultsToBeCombined.add(resultForLocalFullAddress);
        }
        if (inetListeningServersState.getLocalAddress() != null)
        {
            ResultEnumeration resultForLocalAddress = OperationAnalyzer.applyOperation(
                    inetListeningServersState.getLocalAddress().getOperation(),
                    inetListeningServersState.getLocalAddress().getDatatype(),
                    inetListeningServersState.getLocalAddress().getValue(),
                    collectedInetListeningServersProperties.getLocalAddress());
            resultsToBeCombined.add(resultForLocalAddress);
        }
        if (inetListeningServersState.getLocalPort() != null)
        {
            ResultEnumeration resultForLocalPort = OperationAnalyzer.applyOperation(
                    inetListeningServersState.getLocalPort().getOperation(),
                    inetListeningServersState.getLocalPort().getDatatype(),
                    inetListeningServersState.getLocalPort().getValue(),
                    collectedInetListeningServersProperties.getLocalPort());
            resultsToBeCombined.add(resultForLocalPort);
        }
        if (inetListeningServersState.getForeignFullAddress() != null)
        {
            ResultEnumeration resultForForeignFullAddress = OperationAnalyzer.applyOperation(
                    inetListeningServersState.getForeignFullAddress().getOperation(),
                    inetListeningServersState.getForeignFullAddress().getDatatype(),
                    inetListeningServersState.getForeignFullAddress().getValue(),
                    collectedInetListeningServersProperties.getForeignFullAddress());
            resultsToBeCombined.add(resultForForeignFullAddress);
        }
        if (inetListeningServersState.getForeignAddress() != null)
        {
            ResultEnumeration resultForForeignAddress = OperationAnalyzer.applyOperation(
                    inetListeningServersState.getForeignAddress().getOperation(),
                    inetListeningServersState.getForeignAddress().getDatatype(),
                    inetListeningServersState.getForeignAddress().getValue(),
                    collectedInetListeningServersProperties.getForeignAddress());
            resultsToBeCombined.add(resultForForeignAddress);
        }
        if (inetListeningServersState.getForeignPort() != null)
        {
            ResultEnumeration resultForForeignPort = OperationAnalyzer.applyOperation(
                    inetListeningServersState.getForeignPort().getOperation(),
                    inetListeningServersState.getForeignPort().getDatatype(),
                    inetListeningServersState.getForeignPort().getValue(),
                    collectedInetListeningServersProperties.getForeignPort());
            resultsToBeCombined.add(resultForForeignPort);
        }
        if (inetListeningServersState.getPid() != null)
        {
            ResultEnumeration resultForPid = OperationAnalyzer.applyOperation(
                    inetListeningServersState.getPid().getOperation(),
                    inetListeningServersState.getPid().getDatatype(),
                    inetListeningServersState.getPid().getValue(),
                    collectedInetListeningServersProperties.getPid());
            resultsToBeCombined.add(resultForPid);
        }
        if (inetListeningServersState.getProgramName() != null)
        {
            ResultEnumeration resultForProgramName = OperationAnalyzer.applyOperation(
                    inetListeningServersState.getProgramName().getOperation(),
                    inetListeningServersState.getProgramName().getDatatype(),
                    inetListeningServersState.getProgramName().getValue(),
                    collectedInetListeningServersProperties.getProgramName());
            resultsToBeCombined.add(resultForProgramName);
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
        return inetListeningServersObject.getId();
    }

    @Override
    public Set getChildSet()
    {
        return inetListeningServersObject.getSet();
    }

}
