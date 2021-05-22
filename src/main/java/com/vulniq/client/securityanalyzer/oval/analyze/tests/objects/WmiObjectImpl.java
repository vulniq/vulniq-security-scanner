
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
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windows.CollectedWmiInfo;
import com.vulniq.client.securityanalyzer.oval.error.NonExistentWMIQueryError;
import com.vulniq.client.securityanalyzer.oval.error.OSCommandTimedOutError;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedPowerShellError;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.WmiObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.WmiState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemFieldType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WmiObjectImpl extends OVALObjectImplBase
{

    private static Logger logger = LoggerFactory.getLogger(WmiObjectImpl.class);

    protected String queryResult;

    protected String wmiQuery;
    protected String namespace;
    private String objectId;
    protected WmiObject wmiObjectDefinition;
    
    public WmiObjectImpl(OVALInterpreter interpreter, WmiObject objectDefinition)
    {
        super(interpreter);
        this.wmiQuery = objectDefinition.getWql().getValue().toString();
        this.namespace = objectDefinition.getNamespace().getValue().toString();
        this.objectId = objectDefinition.getId();
        this.wmiObjectDefinition = objectDefinition;
        this.timeout = 8000;
    }
    
    protected WmiObjectImpl (OVALInterpreter interpreter)
    {
        super(interpreter);
        this.timeout = 8000;
    }

    protected String handleCmdOut(OSCommandOutput cmdOut) throws OSCommandTimedOutError, UnexpectedPowerShellError, NonExistentWMIQueryError
    {
        if (cmdOut.isErrorOccured())
        {
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                    "An error occured while executing the WMI Query.",
                    CollectionUtils.mapFromArgs("WMI Query: ", wmiQuery));
            throw new UnexpectedPowerShellError("An error occured in powershell session while executing the WQI query: " + wmiQuery);
        }
        else if (cmdOut.isTimedOut())
        {
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                    "Powershell timed out while executing WMI Query.",
                    CollectionUtils.mapFromArgs("WMI Query: ", wmiQuery));
            throw new OSCommandTimedOutError("PowerShell timed out.", timeout);
        }
        else
        {
            if (cmdOut.getExitCode() == 0)
            {
                String cmdOutContents = cmdOut.getStdOut();
                if (cmdOutContents != null && !cmdOutContents.trim().equals(""))
                {
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                            "Executed WMI query successfully.",
                            CollectionUtils.mapFromArgs("WMI Query: ", wmiQuery));
                    return cmdOutContents;
                }
            }
        }
        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                "WMI Query yielded no results.",
                CollectionUtils.mapFromArgs("WMI Query: ", wmiQuery));
        throw new NonExistentWMIQueryError("No result found for WMI Query: " + wmiQuery);
    }

    protected String[] getPropertiesFromQuery(String wmiQuery)
    {
        String regex = "SELECT\\s*(\\V+)FROM.*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = pattern.matcher(wmiQuery);

        try
        {
            if (m.matches())
            {
                String matchingSubstring = m.group(1);
                String[] queryProperties = matchingSubstring.trim().split("\\s*,\\s*");
                logger.debug("getPropertiesFromQuery match succeeded. Returning: " + queryProperties);
                return queryProperties;
            }
            else
            {
                logger.debug("getPropertiesFromQuery match failed. Returning null");
                return null;
            }
        }
        catch (Exception ex)
        {
            logger.error("getPropertiesFromQuery unexpected error", ex);
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                    "An error occured while obtaining properties from WMI Query.",
                    CollectionUtils.mapFromArgs("WMI Query: ", wmiQuery,
                            "error", ex.getMessage()));
            return null;
        }
    }

    protected String callWMIQuery(DataCollectionTarget dataCollectionTarget) throws Exception
    {
        ArrayList<String> argumentList = new ArrayList<>();
        String command;
        String wmiQuery = this.wmiQuery.replaceAll("'", "''");

        if (dataCollectionTarget.getTargetType() == DataCollectionTargetType.Docker)
        {
            command = TerziConfiguration.getDockerCommand();
            argumentList.add("exec");
            argumentList.add(dataCollectionTarget.getTargetName());
            argumentList.add("powershell");
        }
        else
        {
            command = "powershell";
        }

        argumentList.add("\"Get-WmiObject");
        argumentList.add("-Namespace");
        argumentList.add("'" + namespace + "'");
        argumentList.add("-Query");
        //TODO escape wmiQuery
        argumentList.add("'" + wmiQuery + "'\"");

        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            return handleCmdOut(cmdOut);
        }
        catch (OSCommandTimedOutError | UnexpectedPowerShellError | NonExistentWMIQueryError ex)
        {
            throw ex;
        }
    }

    @Override
    protected StatusEnumeration checkExistence(DataCollectionTarget dataCollectionTarget)
    {
        try
        {
            this.queryResult = callWMIQuery(dataCollectionTarget);
            return StatusEnumeration.EXISTS;
        }
        catch (NonExistentWMIQueryError nonExistentQueryEx)
        {
            return StatusEnumeration.DOES_NOT_EXIST;
        }
        catch (Exception ex)
        {
            logger.error("checkExistence unexpected error. Returning ERROR", ex);
            return StatusEnumeration.ERROR;
        }
    }

    protected List<CollectedWmiInfo> parseQueryResult(String queryResult, String[] queryProperties)
    {
        if (queryResult == null || queryProperties == null)
        {
            return null;
        }
        ArrayList<EntityItemFieldType> results = new ArrayList<>();
        ArrayList<CollectedWmiInfo> collectedInfoList = new ArrayList<>();
        CollectedWmiInfo collectedInfo = new CollectedWmiInfo();

        try (Scanner scanner = new Scanner(queryResult.trim()))
        {
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                if (line.equals(""))
                {
                    collectedInfo.setResults(results);
                    collectedInfoList.add(collectedInfo);
                    collectedInfo = new CollectedWmiInfo();
                    results = new ArrayList<>();
                    continue;
                }
                for (String queryProperty : queryProperties)
                {
                    Pattern pattern = Pattern.compile(queryProperty + "\\s*:\\s*(\\V+)", Pattern.CASE_INSENSITIVE);
                    Matcher m = pattern.matcher(line);
                    if (m.matches())
                    {
                        String propertyValue = m.group(1);
                        EntityItemFieldType field = new EntityItemFieldType();
                        field.setName(queryProperty);
                        field.setValue(propertyValue);
                        results.add(field);
                        break;
                    }
                }
            }
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("parseQueryResult returning:" + StringUtils.toJson(collectedInfoList, false));
        }
        return collectedInfoList;
    }

    @Override
    protected ObjectCollectionResult collectValues(DataCollectionTarget dataCollectionTarget)
    {
        String[] queryProperties = getPropertiesFromQuery(wmiQuery);
        List<CollectedWmiInfo> results = parseQueryResult(queryResult, queryProperties);
        ObjectCollectionResult rv = new ObjectCollectionResult();
        if (results == null)
        {
            rv.addItemCollectionStatus(StatusEnumeration.ERROR);
        }
        else
        {
            for (CollectedWmiInfo result : results)
            {
                result.setNamespace(namespace);
                result.setWql(wmiQuery);
                rv.addCollectedValue(result, StatusEnumeration.EXISTS);
            }
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                    "WMI Properties are collected successfully.",
                    CollectionUtils.mapFromArgs("WMI Query: ", wmiQuery));
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
        CollectedWmiInfo collectedValue = (CollectedWmiInfo) individualCollectedValue;
        WmiState state = (WmiState) stateType;
        ArrayList<ResultEnumeration> rv = new ArrayList<>();

        for (EntityItemFieldType field : collectedValue.getResults())
        {
            ResultEnumeration resultOfValue = OperationAnalyzer.applyOperation(state.getResult().getOperation(), state.getResult().getDatatype(), state.getResult().getValue().toString(), field.getValue().toString());
            if(logger.isDebugEnabled())
            {
                logger.debug("State = " + state.getId() + ", State Comment = " + state.getComment() + ", Object Property = '" + field.getValue().toString() + "'"
                        + ", State Operator = '" + state.getResult().getOperation().toString() + "'"
                        + ", State Property = '" + state.getResult().getValue().toString() + "'"
                        + ", Result = '" + resultOfValue + "'");
            }
            rv.add(resultOfValue);
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
        return this.objectId;
    }

    @Override
    public Set getChildSet()
    {
        return wmiObjectDefinition.getSet();
    }
}
