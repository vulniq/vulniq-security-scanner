
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
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.analyze.OperationAnalyzer;
import com.vulniq.client.securityanalyzer.datacollection.windows.CollectedPortInfo;
import com.vulniq.client.securityanalyzer.oval.error.OSCommandTimedOutError;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIPAddressStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityObjectProtocolType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PortObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PortState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WindowsPortObjectImpl extends OVALObjectImplBase
{
    private static final Logger logger = LoggerFactory.getLogger(WindowsPortObjectImpl.class);
    private final PortObject objectDefinition;
    private static List<CollectedPortInfo> collectedPorts = new ArrayList<>();
    
    public WindowsPortObjectImpl(OVALInterpreter interpreter, PortObject objectDefinition)
    {
        super(interpreter);
        this.objectDefinition = objectDefinition;
        this.timeout = 18000;
    }
    
    private String getProtocol ()
    {
        EntityObjectProtocolType protocolType = objectDefinition.getProtocol();
        try
        {
            ResultEnumeration result = OperationAnalyzer.applyOperationString(protocolType.getOperation(), protocolType.getValue().toString(), "TCP");
            return  result == ResultEnumeration.TRUE ? "TCP" :"UDP";
        }
        catch (UnexpectedOVALEvaluationError unexpectedOVALEvaluationError)
        {
            logger.error("An error occurred while deciding whether OVAL Port Object is defined with a TCP or UDP protocol, searching for all protocols. Related OVAL Object Id: " + this.getId(),
                    unexpectedOVALEvaluationError);
            return "";
        }
    }
    
    private String executeNetstatCommand (DataCollectionTarget target) throws Exception
    {
        List<String> arguments = new ArrayList<>();
        String command;
        
        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            command = TerziConfiguration.getDockerCommand();
            String targetName = target.getTargetName();
            arguments.add("exec");
            arguments.add(targetName);
            arguments.add("powershell");
        }
        else
        {
            command = "powershell";
        }
        arguments.add("netstat");
        
        String protocol = getProtocol();
        if ("UDP".equals(protocol) || "TCP".equals(protocol))
        {
            arguments.add("-p");
            arguments.add(protocol);
        }
        arguments.add("-anoq");
        arguments.add("|");
        arguments.add("Select-String");
        arguments.add("LISTENING");
        if(logger.isDebugEnabled())
        {
            logger.debug("executeNetstatCommand arguments=" + arguments);
        }
        OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, arguments.toArray(new String[0]));
        
        return handleCmdOutContent(cmdOut);
    }
    
    private String handleCmdOutContent(OSCommandOutput cmdOut) throws Exception
    {
        if (cmdOut.isErrorOccured())
        {
            logger.error("PowerShell error while evaluating OVAL Object with ID: " + this.getId());
            throw new Exception("PowerShell error while evaluating OVAL Object with ID: " + this.getId());
        }
        else if (cmdOut.isTimedOut())
        {
            logger.error("PowerShell timed out while evaluating for OVAL Object with ID: " + this.getId());
            throw new OSCommandTimedOutError("PowerShell timed out while evaluating OVAL Object with ID: " + this.getId(), timeout);
        }
        else
        {
            if (cmdOut.getExitCode() != 0)
            {
                logger.error("An error occurred while executing 'netstat', PowerShell session might require admin privileges. "
                        + "The related OVAL Object ID:" + this.getId());
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                        "netstat command failed", CollectionUtils.mapFromArgs("exitCode", cmdOut.getExitCode()));
                return "";
            }
            else
            {
                String cmdOutContent = cmdOut.getStdOut();
                if (cmdOutContent != null && !"".equals(cmdOutContent))
                {
                    return cmdOutContent.trim();
                }
            }
        }
        logger.info("handleCmdOutContent returning empty result for OVAL Object " + getId());
        return "";
    }
    
    private void parseAddress (String fullAddress, CollectedPortInfo collectedPort, boolean isLocalAddress)
    {
        String address = null;
        String port = null;
        if(fullAddress.contains("["))
        {
            int lastColon = fullAddress.lastIndexOf(":");
            address = fullAddress.substring(0,lastColon);
            port = fullAddress.substring(lastColon+1,fullAddress.length());
        }
        else
        {
            String[] splitAddress = fullAddress.split(":");
            if(splitAddress.length > 1)
            {
                address = splitAddress[0];
                port = splitAddress[1];
            }
        }
        if(isLocalAddress)
        {
            collectedPort.setLocalAddress(address);
            try
            {
                collectedPort.setLocalPort(Integer.parseInt(port));
            }
            catch (Exception ex)
            {
                logger.error("Local port could not be parsed from netstat output. Related OVAL Object ID: " + this.getId()
                        + " port=" + port, ex);
            }
        }
        else
        {
            collectedPort.setForeignAddress(address);
            try
            {
                collectedPort.setForeignPort(Integer.parseInt(port));
            }
            catch (Exception ex)
            {
                logger.error("Foreign port could not be parsed from netstat output. Related OVAL Object ID: " + this.getId()
                        + " port=" + port, ex);
            }
        }
    }
    
    private List<CollectedPortInfo> parseNetstatOutput (String netstatOutput)
    {
        List<CollectedPortInfo> collectedPorts = new ArrayList<>();
        try (Scanner scanner = new Scanner(netstatOutput.trim()))
        {
            String line;
            while (scanner.hasNextLine())
            {
                CollectedPortInfo collectedPort = new CollectedPortInfo();
                line = scanner.nextLine();
                if (line == null || line.isBlank())
                {
                    continue;
                }
                Pattern pattern = Pattern.compile("\\s*(TCP|UDP)\\s+(\\S*)\\s+\\s+(\\S*)\\s+\\s+(\\S*)\\s+\\s+(\\S*)");
                Matcher matcher = pattern.matcher(line);
                if(matcher.matches())
                {
                    collectedPort.setProtocol(matcher.group(1));
                    
                    String localFullAddress = matcher.group(2);
                    parseAddress(localFullAddress,collectedPort,true);
                    String foreignFullAddress = matcher.group(3);
                    parseAddress(foreignFullAddress,collectedPort,false);
                    
                    String pid = matcher.group(5);
                    try
                    {
                        collectedPort.setPid(Integer.parseInt(pid));
                    }
                    catch (Exception ex)
                    {
                        logger.error("The pid associated with the related port cannot be parsed from netstat output. " +
                                "Related OVAL Object ID: " + this.getId() + " pid=" + pid, ex);
                    }
                    collectedPorts.add(collectedPort);
                }
            }
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("parseNetstatOutput returning: " + collectedPorts);
        }
        return collectedPorts;
    }
    
    @Override
    protected StatusEnumeration checkExistence(DataCollectionTarget dataCollectionTarget)
    {
        try
        {
            String netstatOutput = executeNetstatCommand(dataCollectionTarget);
            if(collectedPorts.size() == 0)
            {
                collectedPorts = parseNetstatOutput(netstatOutput);
            }
            
            if(collectedPorts.size() > 0)
            {
                return StatusEnumeration.EXISTS;
            }
            else
            {
                return StatusEnumeration.DOES_NOT_EXIST;
            }
        }
        catch (Exception e)
        {
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                    "An error occurred while checking existence of OVAL Object: '" + this.getId() ,
                    CollectionUtils.mapFromArgs("error", e.getMessage()));
            logger.error("Error in checkExistence", e);
            return StatusEnumeration.ERROR;
        }
    }
    
    private boolean doesCollectedPortMatchObject(CollectedPortInfo collectedPort)
    {
        if(collectedPort.getLocalAddress() == null || collectedPort.getLocalPort() == 0)
        {
            logger.debug("doesCollectedPortMatchObject is returning false because local address and port are undefined");
            return false;
        }
        else
        {
            try
            {
                ResultEnumeration resultOfAddress = OperationAnalyzer.applyOperation(objectDefinition.getLocalAddress().getOperation(), objectDefinition.getLocalAddress().getDatatype(), objectDefinition.getLocalAddress().getValue().toString(), collectedPort.getLocalAddress());
                ResultEnumeration resultOfPort = OperationAnalyzer.applyOperation(objectDefinition.getLocalPort().getOperation(), objectDefinition.getLocalPort().getDatatype(), objectDefinition.getLocalPort().getValue(), collectedPort.getLocalPort());
                boolean rv = (resultOfAddress == ResultEnumeration.TRUE && resultOfPort == ResultEnumeration.TRUE);
                logger.debug("doesCollectedPortMatchObject returning " + rv);
                return rv;
            }
            catch (UnexpectedOVALEvaluationError unexpectedOVALEvaluationError)
            {
                logger.error("doesCollectedPortMatchObject returning false due to UnexpectedOVALEvaluationError", unexpectedOVALEvaluationError);
                return false;
            }
        }
    }
    @Override
    protected ObjectCollectionResult collectValues(DataCollectionTarget dataCollectionTarget)
    {
        ObjectCollectionResult rv = new ObjectCollectionResult();
        for (CollectedPortInfo collectedPort : collectedPorts)
        {
            if(doesCollectedPortMatchObject(collectedPort))
            {
                rv.addCollectedValue(collectedPort, StatusEnumeration.EXISTS);
            }
        }
        logger.debug("collectValues collectionStatus=" + collectionStatus);
        return rv;
    }
    
    @Override
    protected List<ResultEnumeration> evaluateSingleValueVsState(Object individualCollectedValue, StateType stateType) throws Exception
    {
        PortState state = (PortState) stateType;
        CollectedPortInfo collectedPort = (CollectedPortInfo) individualCollectedValue;
        List<ResultEnumeration> rv = new ArrayList<>();
        logger.debug("Started to compare collected port with OVAL State which has an ID of: " + state.getId() +", with comment: " + state.getComment());
        if(state.getForeignAddress() != null)
        {
            EntityStateIPAddressStringType foreignAddress = state.getForeignAddress();
            ResultEnumeration result = OperationAnalyzer.applyOperation(foreignAddress.getOperation(), foreignAddress.getDatatype(), foreignAddress.getValue().toString(), collectedPort.getForeignAddress());
            logger.debug("Object Property = '" + collectedPort.getForeignAddress() + "'" + ", State Property = '" + foreignAddress.getValue().toString() + "'" + ", Result = '" + result + "'");
            rv.add(result);
        }
        if(state.getForeignPort() != null)
        {
            EntityStateStringType foreignPort = state.getForeignPort();
            ResultEnumeration result = OperationAnalyzer.applyOperation(foreignPort.getOperation(), foreignPort.getDatatype(), foreignPort.getValue().toString(), collectedPort.getForeignPort());
            logger.debug("Object Property = '" + collectedPort.getForeignPort() + "'" + ", State Property = '" + foreignPort.getValue().toString() + "'" + ", Result = '" + result + "'");
            rv.add(result);
        }
        if(state.getLocalAddress() != null)
        {
            EntityStateIPAddressStringType localAddress = state.getLocalAddress();
            ResultEnumeration result = OperationAnalyzer.applyOperation(localAddress.getOperation(), localAddress.getDatatype(), localAddress.getValue().toString(), collectedPort.getLocalAddress());
            logger.debug("Object Property = '" + collectedPort.getLocalAddress() + "'" + ", State Property = '" + localAddress.getValue().toString() + "'" + ", Result = '" + result + "'");
            rv.add(result);
        }
        if(state.getLocalPort() != null)
        {
            EntityStateIntType localPort = state.getLocalPort();
            ResultEnumeration result = OperationAnalyzer.applyOperation(localPort.getOperation(), localPort.getDatatype(), localPort.getValue().toString(), collectedPort.getLocalPort());
            logger.debug("Object Property = '" + collectedPort.getLocalPort() + "'" + ", State Property = '" + localPort.getValue().toString() + "'" + ", Result = '" + result + "'");
            rv.add(result);
        }
        if(state.getPid() != null)
        {
            EntityStateIntType pid = state.getPid();
            ResultEnumeration result = OperationAnalyzer.applyOperation(pid.getOperation(), pid.getDatatype(), pid.getValue().toString(), collectedPort.getPid());
            logger.debug("Object Property = '" + collectedPort.getPid() + "'" + ", State Property = '" + pid.getValue().toString() + "'" + ", Result = '" + result + "'");
            rv.add(result);
        }
        if(state.getProtocol() != null)
        {
            EntityStateStringType protocol = state.getProtocol();
            ResultEnumeration result = OperationAnalyzer.applyOperation(protocol.getOperation(), protocol.getDatatype(), protocol.getValue().toString(), collectedPort.getProtocol());
            logger.debug("Object Property = '" + collectedPort.getProtocol() + "'" + ", State Property = '" + protocol.getValue().toString() + "'" + ", Result = '" + result + "'");
            rv.add(result);
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("evaluateSingleValueVsState returning:" + rv);
        }
        return rv;
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
}
