

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

package com.vulniq.client.securityanalyzer.main;

import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.oval.DefinitionEvaluationResult;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;

import java.util.HashMap;
import java.util.Map;

public class OVALMain
{
    private TerziOutputWriter outputWriter;

    public OVALMain(TerziOutputWriter outputWriter)
    {
        this.outputWriter = outputWriter;
    }

    public void run(TerziOptions options)
    {
        String ovalId = options.getOptionValue(TerziOptions.OPTION_OVALID);
        String ovalFileUrl = options.getOptionValue(TerziOptions.OPTION_OVAL_FILEURL);
        if(ovalId==null && ovalFileUrl==null)
        {
            outputWriter.printInfoMessage("Either OVAL id or OVAL file url (or both) is required");
            options.printHelp();
            return;
        }
        String vulnIQDataSourceGuid = options.getOptionValue(TerziOptions.OPTION_OVAL_DSGUID);

        DataCollectionTarget dataCollectionTarget = options.getDataCollectionTarget();
        OSInfo osInfo = OSInfoCollector.getOSInfo(options.getDataCollectionTarget());
        OVALInterpreter interpreter = new OVALInterpreter(vulnIQDataSourceGuid, dataCollectionTarget, osInfo, true);

        int ovalLogLevelOption = StringUtils.parseInt(options.getOptionValue(TerziOptions.OPTION_OVAL_VERBOSITY), OVALInterpreter.LOG_LEVEL_DEBUG);
        interpreter.setOvalLogLevel(ovalLogLevelOption);


        if(ovalFileUrl!=null)
        {
            evaluateOVALFile(interpreter, ovalFileUrl, ovalId, options);
        }
        else if(ovalId!=null)
        {
            evaluateOVALItemById(interpreter, ovalId, options);
        }
        else
        {
            outputWriter.printInfoMessage("Missing required options. Either OVAL id or OVAL file url (or both) is required");
            return;
        }
    }

    public void evaluateOVALItemById(OVALInterpreter interpreter, String ovalId, TerziOptions options)
    {
        ResultEnumeration resultEnumeration = interpreter.evaluateOVALItem(ovalId);
        if(options.getOutputFormat() == TerziOptions.OutputFormat.JSON)
        {
            Map<String, Object> tmpMap = new HashMap<>();
            tmpMap.put("ovalId", ovalId);
            tmpMap.put("result", resultEnumeration);
            outputWriter.printResultObjectAsJson(tmpMap);
        }
        else
        {
            outputWriter.printInfoMessage("Evaluation result for " + ovalId + ": " + resultEnumeration);
            if(resultEnumeration!=ResultEnumeration.TRUE && resultEnumeration!=ResultEnumeration.FALSE)
            {
                //TODO display the error properly. don't ask user to view logs.
                outputWriter.printInfoMessage("Please see logs for more information");
            }
        }
    }

    public void evaluateOVALFile(OVALInterpreter interpreter, String ovalFileUrl, String ovalId, TerziOptions options)
    {
        Map<String, DefinitionEvaluationResult> evaluationResults = interpreter.loadAndEvaluateOVALFile(ovalFileUrl, ovalId);
        if(evaluationResults!=null)
        {
            if(options.getOutputFormat() == TerziOptions.OutputFormat.JSON)
            {
                outputWriter.printResultObjectAsJson(evaluationResults);
            }
            else
            {
                outputWriter.beginSection("RESULTS");

                StringBuilder headerStr = new StringBuilder();
                headerStr.append(StringUtils.rightPad("OVAL id", 40, " "));
                headerStr.append("\t");
                headerStr.append(StringUtils.rightPad("OVAL Class", 15, " "));
                headerStr.append("\t");
                headerStr.append(StringUtils.rightPad("Result", 8, " "));
                headerStr.append("\t");
                headerStr.append(StringUtils.rightPad("Name", 50, " "));
                headerStr.append("\t");
                headerStr.append(StringUtils.rightPad("Description", 40, " "));
                headerStr.append("\t");
                headerStr.append("CVEs");
                outputWriter.printInfoMessage(headerStr.toString());

                for (String tmpDefinitionId : evaluationResults.keySet())
                {
                    DefinitionEvaluationResult evaluationResult = evaluationResults.get(tmpDefinitionId);
                    StringBuilder resultStr = new StringBuilder();
                    String resultAsString = String.valueOf(evaluationResult.getResult());
                    String ovalClassName = String.valueOf(evaluationResult.getOvalClass());
                    resultStr.append(StringUtils.rightPad(evaluationResult.getOvalId(), 40, " "));
                    resultStr.append("\t");
                    resultStr.append(StringUtils.rightPad(ovalClassName, 15, " "));
                    resultStr.append("\t");
                    resultStr.append(StringUtils.rightPad(resultAsString, 8, " "));
                    resultStr.append("\t");
                    resultStr.append(StringUtils.rightPad(StringUtils.trim(evaluationResult.getName()), 50, " "));
                    resultStr.append("\t");
                    resultStr.append(StringUtils.rightPad(evaluationResult.getResultDescription(), 40, " "));
                    resultStr.append("\t");
                    if(evaluationResult.getCves()!=null && !evaluationResult.getCves().isEmpty())
                    {
                        resultStr.append(StringUtils.toJson(evaluationResult.getCves(), false));
                    }
                    outputWriter.printInfoMessage(resultStr.toString());
                }
                outputWriter.endSection();
            }
        }
    }
}
