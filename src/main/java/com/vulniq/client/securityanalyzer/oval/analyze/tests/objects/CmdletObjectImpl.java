
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
import com.vulniq.client.securityanalyzer.oval.analyze.CheckEnumerationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.OperationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.error.OSCommandTimedOutError;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectFieldType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateFieldType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.CmdletObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.CmdletState;
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

/**
 * TODO add variable support
 */
public class CmdletObjectImpl extends OVALObjectImplBase
{
    enum AllowedVerbs
    {Approve, Assert, Compare, Confirm, Find, Get, Import, Measure, Read, Request, Resolve, Search, Select, Show, Test, Trace, Watch, Empty}
    
    private CmdletObject objectDefinition;
    private static final Logger logger = LoggerFactory.getLogger(CmdletObjectImpl.class);
    private String cmdletOutput;
    private boolean errorOccuredInConstructor = false;
    
    public CmdletObjectImpl(OVALInterpreter interpreter, CmdletObject objectDefinition)
    {
        super(interpreter);
        this.objectDefinition = objectDefinition;
        this.timeout = 10000;
        String cmdletVerb = objectDefinition.getVerb().getValue().toString();
        try
        {
            AllowedVerbs.valueOf(cmdletVerb);
        }
        catch (Exception ex)
        {
            errorOccuredInConstructor = true;
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                    "The given cmdlet verb is not whitelisted and therefore the cmdlet is not allowed to be executed with PowerShell.",
                    CollectionUtils.mapFromArgs("actual", cmdletVerb, "allowed", AllowedVerbs.values()));
        }
    }
    
    private List<String> createPSImportArguments()
    { //Import-Module -FullyQualifiedName @{ModuleName = 'Appx'; RequiredVersion = '2.0.1.0'; GUID  = 'aeef2bef-eba9-4a1d-a3d2-d0b52df76deb'};
        
        List<String> arguments = new ArrayList<>();
        if (objectDefinition.getModuleName().isNil())
        {
            logger.debug("createPSImportArguments getModuleName().isNil() returning null");
            return null;
        }
        else
        {
            String moduleName = objectDefinition.getModuleName().getValue().getValue().toString();
            boolean isVersionNil = objectDefinition.getModuleVersion().isNil();
            arguments.add("Import-Module");
            if (isVersionNil)
            {
                arguments.add(moduleName + ";");
            }
            else
            {
                String moduleVersion = objectDefinition.getModuleVersion().getValue().getValue().toString();
                boolean isIdNil = objectDefinition.getModuleId().isNil();
                arguments.add("-FullyQualifiedName");
                arguments.add("@{ModuleName");
                arguments.add("=");
                arguments.add("'" + moduleName + "';");
                arguments.add("RequiredVersion");
                arguments.add("=");
                if (isIdNil)
                {
                    arguments.add("'" + moduleVersion + "';};");
                }
                else
                {
                    arguments.add("'" + moduleVersion + "';");
                    String moduleId = objectDefinition.getModuleId().getValue().getValue().toString();
                    arguments.add("GUID");
                    arguments.add("=");
                    arguments.add("'" + moduleId + "';};");
                }
            }
            if(logger.isDebugEnabled())
            {
                logger.debug("createPSImportArguments arguments=" + arguments);
            }
            return arguments;
        }
    }
    
    private String createCmdlet()
    {
        String verb = objectDefinition.getVerb().getValue().toString();
        String noun = objectDefinition.getNoun().getValue().toString();
        String rv = verb + "-" + noun;
        logger.debug("createCmdlet return:" + rv);
        return rv;
    }
    
    private List<String> createCmdletPipeline()
    {
        List<String> pipelineArguments = new ArrayList<>();
        String cmdlet = createCmdlet();
        pipelineArguments.add(cmdlet);
        
        if (!objectDefinition.getParameters().isNil())
        {
            List<EntityObjectFieldType> parameterFields = objectDefinition.getParameters().getValue().getField();
            for (EntityObjectFieldType parameterField : parameterFields)
            {
                if (!StringUtils.isNullOrBlank(parameterField.getName()))
                {
                    pipelineArguments.add("-" + parameterField.getName());
                }
                if (!StringUtils.isNullOrBlank(parameterField.getValue()))
                {
                    pipelineArguments.add(parameterField.getValue().toString());
                }
            }
        }
        
        if (!objectDefinition.getSelect().isNil())
        {
            pipelineArguments.add("|");
            pipelineArguments.add("Select-Object");
            List<EntityObjectFieldType> selectFields = objectDefinition.getSelect().getValue().getField();
            HashMap<String, List<String>> fieldMap = new HashMap<String, List<String>>();
            for (EntityObjectFieldType selectField : selectFields)
            {
                String name = selectField.getName();
                
                if (!fieldMap.containsKey(name))
                {
                    fieldMap.put(name, new ArrayList<String>());
                }
                
                if (!StringUtils.isNullOrBlank(selectField.getValue()))
                {
                    String value = selectField.getValue().toString();
                    fieldMap.get(name).add(value);
                }
            }
            for (String name : fieldMap.keySet())
            {
                pipelineArguments.add("-" + name);
                List<String> values = fieldMap.get(name);
                for (int index = 0; index < values.size(); index++)
                {
                    if (index != values.size() - 1)
                    {
                        pipelineArguments.add(values.get(index) + ",");
                    }
                    else
                    {
                        pipelineArguments.add(values.get(index));
                    }
                }
            }
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("createCmdletPipeline pipelineArguments=" + pipelineArguments);
        }
        return pipelineArguments;
    }
    
    private List<String> createPSCommandArguments()
    { // Import-Module -FullyQualifiedName @{ModuleName = 'Appx'; RequiredVersion = '2.0.1.0'; GUID  = 'aeef2bef-eba9-4a1d-a3d2-d0b52df76deb'}; if($?) {Get-AppxPackage} else {exit 1}
        List<String> importArguments = createPSImportArguments();
        List<String> arguments = createCmdletPipeline();
        if (importArguments == null)
        {
            logger.debug("createPSCommandArguments return null");
            return arguments;
        }
        else
        {
            List<String> combinedArguments = new ArrayList<>();
            combinedArguments.addAll(importArguments);
            combinedArguments.add("if($?)");
            combinedArguments.add("{" );
            combinedArguments.addAll(arguments);
            combinedArguments.add("|");
            combinedArguments.add("Format-List");
            combinedArguments.add("}" );
            combinedArguments.add("else");
            combinedArguments.add("{exit" );
            combinedArguments.add("1}" );
            if(logger.isDebugEnabled())
            {
                logger.debug("createPSCommandArguments combinedArguments=" + combinedArguments);
            }
            return combinedArguments;
        }
    }
    
    private String executePSCmdlet (List<String> arguments, DataCollectionTarget target) throws Exception
    {
        String command;
        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            command = TerziConfiguration.getDockerCommand();
            arguments.add(0,"exec");
            arguments.add(0,target.getTargetName());
            arguments.add(0,"powershell");
        }
        else
        {
            command = "powershell";
        }
        
        String[] argumentsAsArray = arguments.toArray(new String[arguments.size()]);
        OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentsAsArray);
        if (cmdOut.isErrorOccured())
        {
            logger.error("PowerShell cannot find OVAL Object with ID: " + this.getId());
            throw new Exception ("PowerShell cannot find OVAL Object with ID: " + this.getId());
        }
        else if (cmdOut.isTimedOut())
        {
            logger.error("PowerShell timed out while searching for OVAL Object with ID: " + this.getId());
            throw new OSCommandTimedOutError("PowerShell timed out while searching for OVAL Object with ID: " + this.getId(), timeout);
        }
        else
        {
            if(cmdOut.getExitCode() != 0)
            {
                logger.error("An error occurred while executing PowerShell cmdlet, the cmdlet or the module containing the cmdlet might not exist in the system or the process might require admin privileges. " +
                        "arguments=" + arguments);
                throw new Exception("The cmdlet or the module containing the cmdlet might not exist in the system or the process might require admin privileges.");
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
        logger.debug("executePSCmdlet return empty string");
        return "";
    }
    private List<HashMap<String,String>> parseCmdletOut(String cmdletOutput)
    {
        List<HashMap<String,String>> parsedCmdOut = new ArrayList<>();
        HashMap<String,String> individualResults = new HashMap<>();
    
        try (Scanner scanner = new Scanner(cmdletOutput.trim()))
        {
            String line = null;
            while (scanner.hasNextLine())
            {
                line = scanner.nextLine();
                if (line == null || line.isBlank())
                {
                    parsedCmdOut.add(individualResults);
                    individualResults = new HashMap<>();
                    continue;
                }
                Pattern pattern = Pattern.compile("(\\V+)\\s*:\\s*(\\V+)");
                Matcher m = pattern.matcher(line);
                if (m.matches())
                {
                    String key = m.group(1).trim();
                    String value = m.group(2).trim();
                    individualResults.put(key,value);
                }
            }
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("parseCmdletOut return:" + parsedCmdOut);
        }
        return parsedCmdOut;
    }
    @Override
    protected StatusEnumeration checkExistence(DataCollectionTarget dataCollectionTarget)
    {
        if (errorOccuredInConstructor)
        {
            return StatusEnumeration.ERROR;
        }
        else
        {
            List<String> arguments = createPSCommandArguments();
            try
            {
                cmdletOutput = executePSCmdlet(arguments, dataCollectionTarget);
                if("".equals(cmdletOutput))
                {
                    return StatusEnumeration.DOES_NOT_EXIST;
                }
                else
                {
                    return StatusEnumeration.EXISTS;
                }
            }
            catch (Exception e)
            {
                logger.error("Error in checkExistence", e);
                return  StatusEnumeration.ERROR;
            }
        }
    }
    
    @Override
    protected ObjectCollectionResult collectValues(DataCollectionTarget dataCollectionTarget)
    {
        ObjectCollectionResult rv = new ObjectCollectionResult();
        List<HashMap<String, String>> parsedCmdletOut = parseCmdletOut(this.cmdletOutput);
        if(parsedCmdletOut.size() == 0)
        {
            rv.addItemCollectionStatus(StatusEnumeration.DOES_NOT_EXIST);
            return rv;
        }

        for (HashMap<String, String> individualItem : parsedCmdletOut)
        {
            rv.addCollectedValue(individualItem, StatusEnumeration.EXISTS);
        }

        if(logger.isDebugEnabled())
        {
            logger.debug("collectValues return:" + StringUtils.toJson(rv, false));
        }
        return rv;
    }
    
    @Override
    public String getId()
    {
        return objectDefinition.getId();
    }

    @Override
    public Set getChildSet()
    {
        return this.objectDefinition.getSet();
    }

    @Override
    protected List<ResultEnumeration> evaluateSingleValueVsState(Object individualCollectedValue, StateType stateType) throws Exception
    {
        HashMap<String, String> individualItem = (HashMap<String, String>) individualCollectedValue;
        CmdletState state = (CmdletState) stateType;
        List<ResultEnumeration> tempResults = new ArrayList<>();
        List<ResultEnumeration> results = new ArrayList<>();
        
        List<EntityStateFieldType> fields = state.getValue().getField();
        for (EntityStateFieldType field : fields)
        {
            String fieldName = field.getName();
            String fieldValue = field.getValue().toString();
            for (String key : individualItem.keySet())
            {
                if(key.equalsIgnoreCase(fieldName))
                {
                    ResultEnumeration resultOfValue = OperationAnalyzer.applyOperation(field.getOperation(), field.getDatatype(), fieldValue, individualItem.get(key));
                    logger.debug("State = " + state.getId() + ", State Comment = " + state.getComment() + ", Object Property = '" + individualItem.get(key) + "'"
                            + ", State Property = '" + fieldValue + "'"
                            + ", Result = '" + resultOfValue + "'");
                    tempResults.add(resultOfValue);
                }
            }
        }
        if (tempResults.isEmpty())
        {
            results.add(ResultEnumeration.ERROR);
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                    "Cmdlet defined in OVAL does not correspond to the OVAL State.",null);
        }
        else
        {
            ResultEnumeration result = CheckEnumerationAnalyzer.evaluate(state.getValue().getEntityCheck(), tempResults);
            results.add(result);
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("evaluateSingleValueVsState return:" + results);
        }
        return results;
    }
    
    @Override
    public Map<String, List<String>> getCollectedItems()
    {
        logger.warn("getCollectedItems always returns null");
        return null;
    }
}
