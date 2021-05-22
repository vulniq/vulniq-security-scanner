
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
import com.vulniq.client.securityanalyzer.oval.analyze.OperatorAnalyzer;
import com.vulniq.client.securityanalyzer.datacollection.windows.CollectedServiceInfo;
import com.vulniq.client.securityanalyzer.oval.error.OSCommandTimedOutError;
import com.vulniq.client.securityanalyzer.oval.error.UnsupportedOVALItemError;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateServiceCurrentStateType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.ServiceObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.ServiceState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WindowsServiceObjectImpl extends OVALObjectImplBase
{
    private static final Logger logger = LoggerFactory.getLogger(WindowsServiceObjectImpl.class);
    private final ServiceObject objectDefinition;
    private String cmdOutContent;
    
    private static final Map<String, String> serviceType;
    private static final Map<String, String> currentState;
    private static final Map<String, String> startType;
    
    static
    {
        serviceType = new HashMap<>();
        serviceType.put("2", "SERVICE_FILE_SYSTEM_DRIVER");
        serviceType.put("1", "SERVICE_KERNEL_DRIVER");
        serviceType.put("10", "SERVICE_WIN32_OWN_PROCESS");
        serviceType.put("20", "SERVICE_WIN32_SHARE_PROCESS");
        serviceType.put("100", "SERVICE_INTERACTIVE_PROCESS");
        
        currentState = new HashMap<>();
        currentState.put("5", "SERVICE_CONTINUE_PENDING");
        currentState.put("6", "SERVICE_PAUSE_PENDING");
        currentState.put("7", "SERVICE_PAUSED");
        currentState.put("4", "SERVICE_RUNNING");
        currentState.put("2", "SERVICE_START_PENDING");
        currentState.put("3", "SERVICE_STOP_PENDING");
        currentState.put("1", "SERVICE_STOPPED");
        
        startType = new HashMap<>();
        startType.put("2", "SERVICE_AUTO_START");
        startType.put("0", "SERVICE_BOOT_START");
        startType.put("3", "SERVICE_DEMAND_START");
        startType.put("4", "SERVICE_DISABLED");
        startType.put("1", "SERVICE_SYSTEM_START");
    }
    
    public WindowsServiceObjectImpl(OVALInterpreter interpreter, ServiceObject objectDefinition)
    {
        super(interpreter);
        this.objectDefinition = objectDefinition;
        this.timeout = 18000;
    }
    
    private String executeServiceControlCommand(DataCollectionTarget target) throws Exception
    {
        String command;
        String serviceName = objectDefinition.getServiceName().getValue().toString();
        OSCommandOutput cmdOut;
        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            command = TerziConfiguration.getDockerCommand();
            String targetName = target.getTargetName();
            String[] arguments = {"exec", targetName, "powershell", "sc.exe", "queryEx", serviceName, ";", "sc.exe", "qc", serviceName, ";", "sc.exe", "Qdescription", serviceName};
            logger.debug("executeServiceControlCommand arguments=" + arguments);
            cmdOut = OSCommandUtils.runCommand(timeout, command, arguments);
        }
        else
        {
            command = "powershell";
            String[] arguments = {"sc.exe", "queryEx", serviceName, ";", "sc.exe", "qc", serviceName, ";", "sc.exe", "Qdescription", serviceName};
            logger.debug("executeServiceControlCommand arguments=" + arguments);
            cmdOut = OSCommandUtils.runCommand(timeout, command, arguments);
        }
    
        return handleCmdOutContent(cmdOut);
    }
    
    private String handleCmdOutContent(OSCommandOutput cmdOut) throws Exception
    {
        if (cmdOut.isErrorOccured())
        {
            logger.error("handleCmdOutContent error occured. OVAL id: " + this.getId());
            throw new Exception("PowerShell command failed for object: " + this.getId());
        }
        else if (cmdOut.isTimedOut())
        {
            logger.error("PowerShell timed out while evaluating OVAL Object with ID: " + this.getId());
            throw new OSCommandTimedOutError("PowerShell timed out while evaluating OVAL Object with ID: " + this.getId(), timeout);
        }
        else
        {
            if (cmdOut.getExitCode() != 0)
            {
                logger.error("An error occurred while executing 'sc.exe', the related Windows service might not exist in the system or the PowerShell session might require admin privileges. " +
                        "The related OVAL Object ID:" + this.getId());
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, getId(),
                        "An error occurred while executing 'sc.exe', the related Windows service might not exist in the system or the PowerShell session might require admin privileges",
                        CollectionUtils.mapFromArgs("exitCode", cmdOut.getExitCode()));
                return "";
            }
            else
            {
                String cmdOutContent = cmdOut.getStdOut();
                if (cmdOutContent != null)
                {
                    return cmdOutContent.trim();
                }
            }
        }
        logger.debug("handleCmdOutContent returning empty string");
        return "";
    }
    
    @Override
    protected StatusEnumeration checkExistence(DataCollectionTarget dataCollectionTarget)
    {
        try
        {
            String cmdOutContent = executeServiceControlCommand(dataCollectionTarget);
            if (StringUtils.isNullOrBlank(cmdOutContent))
            {
                logger.debug("checkExistence cmdOutContent is null or blank. return DOES_NOT_EXIST");
                return StatusEnumeration.DOES_NOT_EXIST;
            }
            else
            {
                logger.debug("checkExistence cmdOutContent is NOT null or blank. return EXISTS");
                this.cmdOutContent = cmdOutContent;
                return StatusEnumeration.EXISTS;
                
            }
        }
        catch (Exception e)
        {
            logger.error("checkExistence unexpected error. return ERROR", e);
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                    "An error occurred while evaluating OVAL Object: '" + this.getId() + "'. Check logs for more details.",
                    CollectionUtils.mapFromArgs("error", e.getMessage()));
            return StatusEnumeration.ERROR;
        }
    }
    
    private CollectedServiceInfo parseCmdOutContent(String cmdOutContent)
    {
        CollectedServiceInfo serviceInfo = new CollectedServiceInfo();
        
        try (Scanner scanner = new Scanner(cmdOutContent.trim()))
        {
            String line;
            while (scanner.hasNextLine())
            {
                line = scanner.nextLine();
                if (line == null || line.isBlank())
                {
                    continue;
                }
                if (serviceInfo.getServiceType() == null)
                {
                    Pattern pattern = Pattern.compile("\\s*(TYPE)\\s+:\\s+(\\w+)(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        String valueFromCmdOut = m.group(2).trim();
                        String valueForOval = serviceType.get(valueFromCmdOut);
                        serviceInfo.setServiceType(valueForOval);
                        continue;
                    }
                }
                if (serviceInfo.getCurrentState() == null)
                {
                    Pattern pattern = Pattern.compile("\\s*(STATE)\\s+:\\s+(\\w+)(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        String valueFromCmdOut = m.group(2).trim();
                        String valueForOval = currentState.get(valueFromCmdOut);
                        serviceInfo.setCurrentState(valueForOval);
                    }
                }
                if (serviceInfo.getPid() == null)
                {
                    Pattern pattern = Pattern.compile("\\s*(PID)\\s+:\\s+(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        String valueFromCmdOut = m.group(2).trim();
                        serviceInfo.setPid(valueFromCmdOut);
                        if ("0".equals(valueFromCmdOut))
                        {
                            serviceInfo.setServiceFlag("0");
                        }
                        else
                        {
                            serviceInfo.setServiceFlag("1");
                        }
                        continue;
                    }
                }
                if (serviceInfo.getStartType() == null)
                {
                    Pattern pattern = Pattern.compile("\\s*(START_TYPE)\\s+:\\s+(\\w+)(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        String valueFromCmdOut = m.group(2).trim();
                        String valueForOval = startType.get(valueFromCmdOut);
                        serviceInfo.setStartType(valueForOval);
                        continue;
                    }
                }
                if (serviceInfo.getPath() == null)
                {
                    Pattern pattern = Pattern.compile("\\s*(BINARY_PATH_NAME)\\s+:\\s+(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        String valueFromCmdOut = m.group(2).trim();
                        serviceInfo.setPath(valueFromCmdOut);
                        continue;
                    }
                }
                if (serviceInfo.getDependencies().isEmpty())
                {
                    Pattern pattern = Pattern.compile("\\s*(DEPENDENCIES)\\s+:\\s+(\\V+|\\s*)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        String valueFromCmdOut = m.group(2).trim();
                        if (!"".equals(valueFromCmdOut))
                        {
                            serviceInfo.getDependencies().add(valueFromCmdOut);
                            while (true)
                            {
                                String nextLine = scanner.nextLine();
                                Pattern dependencyPattern = Pattern.compile("\\s+:\\s+(\\V+)");
                                Matcher dependencyMatcher = dependencyPattern.matcher(nextLine);
                                if (dependencyMatcher.matches())
                                {
                                    String dependency = dependencyMatcher.group(1).trim();
                                    serviceInfo.getDependencies().add(dependency);
                                }
                                else
                                {
                                    Pattern startNamePattern = Pattern.compile("\\s*(SERVICE_START_NAME)\\s+:\\s+(\\V+)");
                                    Matcher startNameMatcher = startNamePattern.matcher(nextLine);
                                    if (startNameMatcher.matches())
                                    {
                                        String startName = startNameMatcher.group(2).trim();
                                        serviceInfo.setStartName(startName);
                                    }
                                    break;
                                }
                            }
                        }
                        continue;
                    }
                }
                if (serviceInfo.getDisplayName() == null)
                {
                    Pattern pattern = Pattern.compile("\\s*(DISPLAY_NAME)\\s+:\\s+(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        String valueFromCmdOut = m.group(2).trim();
                        serviceInfo.setDisplayName(valueFromCmdOut);
                        continue;
                    }
                }
                if (serviceInfo.getStartName() == null)
                {
                    Pattern pattern = Pattern.compile("\\s*(SERVICE_START_NAME)\\s+:\\s+(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        String valueFromCmdOut = m.group(2).trim();
                        serviceInfo.setStartName(valueFromCmdOut);
                        continue;
                    }
                }
                if (serviceInfo.getDescription() == null)
                {
                    Pattern pattern = Pattern.compile("\\s*(DESCRIPTION)\\s*:\\s+(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        String valueFromCmdOut = m.group(2).trim();
                        serviceInfo.setDescription(valueFromCmdOut);
                        continue;
                    }
                }
                if (serviceInfo.getServiceName() == null)
                {
                    Pattern pattern = Pattern.compile("\\s*(SERVICE_NAME)\\s*:\\s+(\\V+)");
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        String valueFromCmdOut = m.group(2).trim();
                        serviceInfo.setServiceName(valueFromCmdOut);
                    }
                }
            }
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("parseCmdOutContent returning:" + StringUtils.toJson(serviceInfo, false));
        }
        return serviceInfo;
    }
    
    @Override
    protected ObjectCollectionResult collectValues(DataCollectionTarget dataCollectionTarget)
    {
        ObjectCollectionResult collectionResult = new ObjectCollectionResult();

        CollectedServiceInfo serviceInfo = parseCmdOutContent(this.cmdOutContent);
        collectionResult.addCollectedValue(serviceInfo, StatusEnumeration.EXISTS);
        if(logger.isDebugEnabled())
        {
            logger.debug("collectValues returning:" + StringUtils.toJson(collectionResult, false));
        }
        return collectionResult;
    }
    
    @Override
    protected List<ResultEnumeration> evaluateSingleValueVsState(Object individualCollectedValue, StateType stateType) throws Exception
    {
        CollectedServiceInfo serviceInfo = (CollectedServiceInfo) individualCollectedValue;
        ServiceState state = (ServiceState) stateType;
        List<ResultEnumeration> rv = new ArrayList<>();
        if (state.getControlsAccepted() != null) //TODO: Implement support for controls accepted entity.
        {
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.State, this.getId(),
                    "Controls accepted parameter in OVAL State definition is not yet implemented.", null);
            throw new UnsupportedOVALItemError("Controls accepted parameter in OVAL State definition is not yet implemented.");
        }
        if (state.getCurrentState() != null)
        {
            EntityStateServiceCurrentStateType currentState = state.getCurrentState();
            ResultEnumeration result = OperationAnalyzer.applyOperation(currentState.getOperation(), currentState.getDatatype(), currentState.getValue().toString(), serviceInfo.getCurrentState());
            logger.debug("State = " + state.getId() + ", State Comment = " + state.getComment() + ", Object Property = '" + serviceInfo.getCurrentState() + "'" + ", State Property = '" + currentState.getValue().toString() + "'" + ", Result = '" + result + "'");
            rv.add(result);
        }
        if (state.getDependencies() != null) //TODO: There is a possible issue regarding OVAL with dependencies. It is not clear what to do when a service state has more than one dependency.
        {
            EntityStateStringType stateDependencies = state.getDependencies();
            ArrayList<String> objectDependencies = serviceInfo.getDependencies();
            if(objectDependencies == null || objectDependencies.size() == 0)
            {
                logger.debug("State = " + state.getId() + ", State Comment = " + state.getComment() + ", Object Property = 'null'" + ", State Property = '" + stateDependencies.getValue().toString() + "'" + ", Result = ' ResultEnumeration.NOT_EVALUATED'");
                rv.add(ResultEnumeration.NOT_EVALUATED);
            }
            else
            {
                ArrayList<ResultEnumeration> tempResults = new ArrayList<>();
                for (String objectDependency : objectDependencies)
                {
                    ResultEnumeration tempResult = OperationAnalyzer.applyOperation(stateDependencies.getOperation(), stateDependencies.getDatatype(), stateDependencies.getValue().toString(), objectDependency);
                    logger.debug("State = " + state.getId() + ", State Comment = " + state.getComment() + ", Object Property = '" + objectDependency + "'" + ", State Property = '" + stateDependencies.getValue().toString() + "'" + ", Result = '" + tempResult + "'");
                    tempResults.add(tempResult);
                }
                ResultEnumeration result = OperatorAnalyzer.evaluate(state.getOperator(), tempResults);
                rv.add(result);
            }
        }
        if (state.getDescription() != null)
        {
            EntityStateStringType description = state.getDescription();
            ResultEnumeration result = OperationAnalyzer.applyOperation(description.getOperation(), description.getDatatype(), description.getValue().toString(), serviceInfo.getDescription());
            logger.debug("State = " + state.getId() + ", State Comment = " + state.getComment() + ", Object Property = '" + serviceInfo.getDescription() + "'" + ", State Property = '" + description.getValue().toString() + "'" + ", Result = '" + result + "'");
            rv.add(result);
        }
        if (state.getDisplayName() != null)
        {
            EntityStateStringType displayName = state.getDisplayName();
            ResultEnumeration result = OperationAnalyzer.applyOperation(displayName.getOperation(), displayName.getDatatype(), displayName.getValue().toString(), serviceInfo.getDisplayName());
            logger.debug("State = " + state.getId() + ", State Comment = " + state.getComment() + ", Object Property = '" + serviceInfo.getDisplayName() + "'" + ", State Property = '" + displayName.getValue().toString() + "'" + ", Result = '" + result + "'");
            rv.add(result);
        }
        if (state.getPath() != null)
        {
            EntityStateStringType path = state.getPath();
            ResultEnumeration result = OperationAnalyzer.applyOperation(path.getOperation(), path.getDatatype(), path.getValue().toString(), serviceInfo.getPath());
            logger.debug("State = " + state.getId() + ", State Comment = " + state.getComment() + ", Object Property = '" + serviceInfo.getPath() + "'" + ", State Property = '" + path.getValue().toString() + "'" + ", Result = '" + result + "'");
            rv.add(result);
        }
        if (state.getPid() != null)
        {
            EntityStateIntType pid = state.getPid();
            ResultEnumeration result = OperationAnalyzer.applyOperation(pid.getOperation(), pid.getDatatype(), pid.getValue().toString(), serviceInfo.getPid());
            logger.debug("State = " + state.getId() + ", State Comment = " + state.getComment() + ", Object Property = '" + serviceInfo.getPid() + "'" + ", State Property = '" + pid.getValue().toString() + "'" + ", Result = '" + result + "'");
            rv.add(result);
        }
        if (state.getServiceFlag() != null)
        {
            EntityStateBoolType serviceFlag = state.getServiceFlag();
            ResultEnumeration result = OperationAnalyzer.applyOperation(serviceFlag.getOperation(), serviceFlag.getDatatype(), serviceFlag.getValue().toString(), serviceInfo.getServiceFlag());
            logger.debug("State = " + state.getId() + ", State Comment = " + state.getComment() + ", Object Property = '" + serviceInfo.getServiceFlag() + "'" + ", State Property = '" + serviceFlag.getValue().toString() + "'" + ", Result = '" + result + "'");
            rv.add(result);
        }
        if (state.getServiceName() != null)
        {
            EntityStateStringType serviceName = state.getServiceName();
            ResultEnumeration result = OperationAnalyzer.applyOperation(serviceName.getOperation(), serviceName.getDatatype(), serviceName.getValue().toString(), serviceInfo.getServiceName());
            logger.debug("State = " + state.getId() + ", State Comment = " + state.getComment() + ", Object Property = '" + serviceInfo.getServiceName() + "'" + ", State Property = '" + serviceName.getValue().toString() + "'" + ", Result = '" + result + "'");
            rv.add(result);
        }
        if (state.getServiceType() != null)
        {
            EntityStateStringType serviceType = state.getServiceType();
            ResultEnumeration result = OperationAnalyzer.applyOperation(serviceType.getOperation(), serviceType.getDatatype(), serviceType.getValue().toString(), serviceInfo.getServiceType());
            logger.debug("State = " + state.getId() + ", State Comment = " + state.getComment() + ", Object Property = '" + serviceInfo.getServiceType() + "'" + ", State Property = '" + serviceType.getValue().toString() + "'" + ", Result = '" + result + "'");
            rv.add(result);
        }
        if (state.getStartName() != null)
        {
            EntityStateStringType startName = state.getStartName();
            ResultEnumeration result = OperationAnalyzer.applyOperation(startName.getOperation(), startName.getDatatype(), startName.getValue().toString(), serviceInfo.getStartName());
            logger.debug("State = " + state.getId() + ", State Comment = " + state.getComment() + ", Object Property = '" + serviceInfo.getStartName() + "'" + ", State Property = '" + startName.getValue().toString() + "'" + ", Result = '" + result + "'");
            rv.add(result);
        }
        if (state.getStartType() != null)
        {
            EntityStateStringType startType = state.getStartType();
            ResultEnumeration result = OperationAnalyzer.applyOperation(startType.getOperation(), startType.getDatatype(), startType.getValue().toString(), serviceInfo.getStartType());
            logger.debug("State = " + state.getId() + ", State Comment = " + state.getComment() + ", Object Property = '" + serviceInfo.getStartType() + "'" + ", State Property = '" + startType.getValue().toString() + "'" + ", Result = '" + result + "'");
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
