

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

package com.vulniq.client.securityanalyzer.oval;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.vulniqapi.VulnIQAPIClient;
import com.vulniq.client.securityanalyzer.oval.analyze.DefinitionAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.TestImplBase;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.mitre.oval.xmlschema.oval_definitions_5.DefinitionType;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Must be used from a single thread, not thread safe
 * OVAL language interpreter
 *
 */
public class OVALInterpreter
{
    /**
     * 0 to 4
     */
    private int ovalLogLevel = 4;
    public static final int LOG_LEVEL_NONE = 0;
    public static final int LOG_LEVEL_ERROR = 1;
    public static final int LOG_LEVEL_WARN = 2;
    public static final int LOG_LEVEL_INFO = 3;
    public static final int LOG_LEVEL_DEBUG = 4;
    private transient Logger logger = LoggerFactory.getLogger(OVALInterpreter.class);
    private String dataSourceGuid;
    private DataCollectionTarget dataCollectionTarget;

    private List<OVALLogEntry> logs;
    public enum OVALTypesForLog {OVALDefinitions, ExtendedDefinition, Definition, Test, Criteria, Criterion, Object, State, IncreaseIndent, DecreaseIndent, Variable};


    private boolean writeLogsToStdOut = false;
    private OSInfo osInfo;

    public OVALInterpreter(String dataSourceGuid, DataCollectionTarget target, OSInfo osInfo)
    {
        this.dataSourceGuid = dataSourceGuid;
        this.dataCollectionTarget = target;
        this.osInfo = osInfo;
    }

    public OVALInterpreter(String dataSourceGuid, DataCollectionTarget target, OSInfo osInfo, boolean logToStdOut)
    {
        this(dataSourceGuid, target, osInfo);
        this.writeLogsToStdOut = logToStdOut;
    }

    public OSInfo getOsInfo()
    {
        return osInfo;
    }

    public void setOsInfo(OSInfo osInfo)
    {
        this.osInfo = osInfo;
    }

    /**
     * Evaluates and OVAL definition
     * @param definitionId
     * @return
     */
    public ResultEnumeration evaluateDefinition(String definitionId)
    {
        ResultEnumeration cachedResult = OVALInterpreterCache.getCachedDefinitionResult(dataCollectionTarget, definitionId);
        if(cachedResult!=null)
        {
            addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALTypesForLog.Definition, definitionId, "Already evaluated. Returning cached result",
                    CollectionUtils.mapFromArgs("Result", cachedResult));
            return cachedResult;
        }
        addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALTypesForLog.Definition, definitionId, "Starting to evaluate definition", null);
        if(osInfo==null)
        {
            addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALTypesForLog.Definition, definitionId,
                    "Failed to evaluate definition due to missing operating system info",
                    CollectionUtils.mapFromArgs("definitionId", definitionId));
            return ResultEnumeration.ERROR;
        }
        DefinitionType ovalDefinition = OVALXMLLoader.loadDefinition(dataSourceGuid, definitionId, osInfo.getDisplayVersion(), null);
        ResultEnumeration rv = null;
        if(ovalDefinition!=null)
        {
            String definitionName = StringUtils.trim(ovalDefinition.getMetadata().getTitle());

            addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALTypesForLog.Definition, definitionId, "Loaded definition",
                    CollectionUtils.mapFromArgs("name", definitionName, "class", ovalDefinition.getClazz()));
            DefinitionAnalyzer analyzer = new DefinitionAnalyzer(this, ovalDefinition);
            analyzer.analyze();
            ResultEnumeration result = analyzer.getResult();
            addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALTypesForLog.Definition, definitionId, "Finished evaluating definition",
                    CollectionUtils.mapFromArgs("name", definitionName, "result", result));
            rv = result;
        }
        else
        {
            addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALTypesForLog.Definition, definitionId, "Failed to load definition", null);
            rv = ResultEnumeration.UNKNOWN;
        }
        OVALInterpreterCache.addDefinitionResultToCache(dataCollectionTarget, definitionId, rv);
        return rv;
    }

    /**
     * Evaluates a test
     * @param testId
     * @return
     */
    public ResultEnumeration evaluateTest(String testId)
    {
        ResultEnumeration rv = null;
        ResultEnumeration cachedResult = OVALInterpreterCache.getCachedTestResult(dataCollectionTarget, testId);
        if(cachedResult!=null)
        {
            rv = cachedResult;
            addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALTypesForLog.Test, testId, "Already evaluated. Returning cached result",
                    CollectionUtils.mapFromArgs("Result", rv));
            return rv;
        }
        addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALTypesForLog.Test, testId, "Starting to evaluate test", null);
        TestType test = OVALXMLLoader.loadTest(dataSourceGuid, testId, osInfo.getDisplayVersion(), null);

        if(test!=null)
        {
            addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALTypesForLog.Test, testId, "Loaded test", CollectionUtils.mapFromArgs("comment", test.getComment()));
            TestImplBase testImplBase = TestImplBase.getInstance(this, test);
            ResultEnumeration result = testImplBase.getResult();
            addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALTypesForLog.Test, testId, "Finished evaluating test", CollectionUtils.mapFromArgs(
                    "comment", test.getComment(),
                    "result", result));
            rv = result;
        }
        else
        {
            addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALTypesForLog.Test, testId, "Failed to load test", null);
            rv = ResultEnumeration.UNKNOWN;
        }
        OVALInterpreterCache.addTestResultToCache(dataCollectionTarget, testId, rv);
        return rv;
    }

    /**
     * Loads an oval_definitions file (an OVAL XML with an oval_definitions top level element)
     * Automatically downloads the file if ovalFileUrl starts with http:// or https://
     * @param ovalFileUrl
     * @return
     */
    public OvalDefinitions loadDefinitionsFile(String ovalFileUrl)
    {
        if(ovalFileUrl==null)
        {
            return null;
        }
        File targetFile = null;
        boolean isUsingTemporaryFile = false;
        if(ovalFileUrl.startsWith("http://") || ovalFileUrl.startsWith("https://"))
        {
            try
            {
                targetFile = File.createTempFile("oval-", "xml");
                isUsingTemporaryFile = true;
            }
            catch (IOException e)
            {
                addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALTypesForLog.OVALDefinitions, null, "Failed create temporary file for downloading",
                        CollectionUtils.mapFromArgs("url", ovalFileUrl));
                logger.error("loadDefinitionsFile failed to create temporary file. ovalFileUrl=" + ovalFileUrl, e);
                return null;
            }
            int downloadedBytes = VulnIQAPIClient.downloadToFile(ovalFileUrl, targetFile);
            if(downloadedBytes<1)
            {
                addLog(OVALInterpreter.LOG_LEVEL_WARN, OVALTypesForLog.OVALDefinitions, null, "Failed to download OVAL definitions file",
                        CollectionUtils.mapFromArgs("url", ovalFileUrl));
                return null;
            }
            else
            {
                addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALTypesForLog.OVALDefinitions, null, "Downloaded definitions to a temporary file",
                        CollectionUtils.mapFromArgs("url", ovalFileUrl, "bytes", downloadedBytes));
            }
        }
        else
        {
            targetFile = new File(ovalFileUrl);
        }
        addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALTypesForLog.OVALDefinitions, null, "Loading definitions", null);
        OvalDefinitions definitions = OVALXMLLoader.loadOVALDefinitionsFile(targetFile);

        //delete the file
        if(isUsingTemporaryFile)
        {
            targetFile.delete();
        }
        if(definitions==null)
        {
            addLog(OVALInterpreter.LOG_LEVEL_WARN, OVALTypesForLog.OVALDefinitions, null, "Failed to load OVAL definitions file", null);
            return null;
        }
        else
        {
            addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALTypesForLog.OVALDefinitions, null, "Finished loading definitions", null);
        }
        return definitions;
    }

    public Map<String, DefinitionEvaluationResult> loadAndEvaluateOVALFile(String ovalFileUrl, String targetDefinitionId)
    {
        OvalDefinitions definitions = loadDefinitionsFile(ovalFileUrl);
        if(definitions==null)
        {
            return null;
        }
        Map<String, DefinitionEvaluationResult> definitionIdResultMap = new LinkedHashMap<>();
        for(DefinitionType tmpDefinitionType : definitions.getDefinitions().getDefinition())
        {
            if(targetDefinitionId!=null)
            {
                if(!targetDefinitionId.equals(tmpDefinitionType.getId()))
                {
                    continue;
                }
            }
            ResultEnumeration resultForDefinition = evaluateDefinition(tmpDefinitionType.getId());
            definitionIdResultMap.put(tmpDefinitionType.getId(), new DefinitionEvaluationResult(tmpDefinitionType, resultForDefinition));
        }
        return definitionIdResultMap;
    }

    /**
     * Evaluates a definition or test
     * @param ovalId
     * @return
     */
    public ResultEnumeration evaluateOVALItem(String ovalId)
    {
        if(ovalId==null || ovalId.isEmpty())
        {
            return ResultEnumeration.ERROR;
        }
        if(ovalId.contains(":def:"))
        {
            return evaluateDefinition(ovalId);
        }
        if(ovalId.contains(":tst:"))
        {
            return evaluateTest(ovalId);
        }
        return ResultEnumeration.NOT_EVALUATED;
    }

    public int getOvalLogLevel()
    {
        return ovalLogLevel;
    }

    public void setOvalLogLevel(int ovalLogLevel)
    {
        if(ovalLogLevel>LOG_LEVEL_DEBUG)
        {
            this.ovalLogLevel = LOG_LEVEL_DEBUG;
        }
        if(ovalLogLevel<LOG_LEVEL_NONE)
        {
            this.ovalLogLevel = LOG_LEVEL_NONE;
        }
        this.ovalLogLevel = ovalLogLevel;
    }

    public String getDataSourceGuid()
    {
        return dataSourceGuid;
    }

    public DataCollectionTarget getDataCollectionTarget()
    {
        return dataCollectionTarget;
    }

    public void setDataCollectionTarget(DataCollectionTarget dataCollectionTarget)
    {
        this.dataCollectionTarget = dataCollectionTarget;
    }

    public void beginLogging()
    {
        logs = new LinkedList<>();
    }

    /**
     * Adds an entry to logs
     * @param ovalType
     * @param ovalId
     * @param msg
     * @param details
     */
    public void addLog(int level, OVALTypesForLog ovalType, String ovalId, String msg, Map<String, Object> details)
    {
        if(level>getOvalLogLevel())
        {
            return;
        }
        if(logs==null)
        {
            beginLogging();
        }
        OVALLogEntry newLogEntry = new OVALLogEntry(ovalType, ovalId, msg, details);
        logs.add(newLogEntry);
        if(writeLogsToStdOut)
        {
            if(logger.isDebugEnabled())
            {
                logger.debug("OVAL interpreter event:" + newLogEntry);
            }
            List<OVALLogEntry> singleLogList = new ArrayList<>(1);
            singleLogList.add(newLogEntry);
            printLogsPlainText(System.out, singleLogList);
        }
    }

    public void increaseLogIndent()
    {
        logs.add(new OVALLogEntry(OVALTypesForLog.IncreaseIndent, null, null, null));
    }

    public void decreaseLogIndent()
    {
        logs.add(new OVALLogEntry(OVALTypesForLog.DecreaseIndent, null, null, null));
    }

    public List<OVALLogEntry> getLogs()
    {
        return logs;
    }


    public void printLogsPlainText(OutputStream outputStream)
    {
        printLogsPlainText(outputStream, this.logs);
    }
    public void printLogsPlainText(OutputStream outputStream, List<OVALLogEntry> logsList)
    {
        try
        {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            if (logsList == null)
            {
                writer.write("No logs found");
                writer.newLine();
                return;
            }

            String indent = "";
            int indentCounter = 0;
            OVALLogEntry previousEntry = null;
            for(OVALLogEntry logEntry : logsList)
            {
                if (logEntry.getOvalType() == OVALTypesForLog.DecreaseIndent)
                {
                    writer.newLine();
                    previousEntry = logEntry;
                    indentCounter--;
                    if(indentCounter>0)
                    {
                        for(int i=0;i<indentCounter;i++)
                        {
                            indent = indent + "    ";
                        }
                    }
                    else
                    {
                        indent = "";
                    }
                    continue;
                }
                else if (logEntry.getOvalType() == OVALTypesForLog.IncreaseIndent)
                {
                    writer.newLine();
                    previousEntry = logEntry;
                    indentCounter++;
                    for(int i=0;i<indentCounter;i++)
                    {
                        indent = indent + "    ";
                    }
                    continue;
                }
                if(previousEntry!=null &&
                        previousEntry.getOvalType().equals(logEntry.getOvalType()) &&
                        (logEntry.getSourceOVALId()!=null && previousEntry.getSourceOVALId()!=null) &&
                        previousEntry.getSourceOVALId().equals(logEntry.getSourceOVALId())
                )
                {
                    //nothing
                }
                else
                {
                    writer.write(indent);
                    if (logEntry.getOvalType() != null)
                    {
                        writer.write(StringUtils.rightPad(logEntry.getOvalType().name(), 12, " "));
                    }
                    if(logEntry.getSourceOVALId()!=null)
                    {
                        writer.write(StringUtils.rightPad(logEntry.getSourceOVALId(), 36, " "));
                    }
                    else
                    {
                        writer.write("                                    ");
                    }
                    writer.newLine();
                }
                writer.write(indent);
                writer.write("    ");
                writer.write(logEntry.getMessage());
                writer.newLine();

                if(logEntry.getDetails()!=null)
                {
                    for(String k : logEntry.getDetails().keySet())
                    {
                        if(logEntry.getDetails().get(k) == null)
                        {
                            continue;
                        }
                        writer.write(indent);
                        writer.write("      - ");
                        writer.write(StringUtils.rightPad(k, 18, " "));
                        writer.write(String.valueOf(logEntry.getDetails().get(k)));
                        writer.newLine();
                    }
                }
                writer.flush();
                previousEntry = logEntry;
            }
            writer.flush();
        }
        catch (Exception ex)
        {
            logger.error("Error writing logs", ex);
            ex.printStackTrace();
        }
    }

    public class OVALLogEntry
    {
        private OVALTypesForLog ovalType;
        private String sourceOVALId;
        private String message;
        private Map<String, Object> details;
        private transient OVALLogEntry parent;

        public OVALLogEntry(OVALTypesForLog ovalType, String sourceOVALId, String message, Map<String, Object> details)
        {
            this.ovalType = ovalType;
            this.sourceOVALId = sourceOVALId;
            this.message = message;
            this.details = details;
        }

        @Override
        public String toString()
        {
            Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
            return gson.toJson(this);
        }

        public String getSourceOVALId()
        {
            return sourceOVALId;
        }

        public void setSourceOVALId(String sourceOVALId)
        {
            this.sourceOVALId = sourceOVALId;
        }

        public String getMessage()
        {
            return message;
        }

        public void setMessage(String message)
        {
            this.message = message;
        }

        public Map<String, Object> getDetails()
        {
            return details;
        }

        public void setDetails(Map<String, Object> details)
        {
            this.details = details;
        }

        public OVALLogEntry getParent()
        {
            return parent;
        }

        public void setParent(OVALLogEntry parent)
        {
            this.parent = parent;
        }

        public OVALTypesForLog getOvalType()
        {
            return ovalType;
        }

        public void setOvalType(OVALTypesForLog ovalType)
        {
            this.ovalType = ovalType;
        }
    }
}
