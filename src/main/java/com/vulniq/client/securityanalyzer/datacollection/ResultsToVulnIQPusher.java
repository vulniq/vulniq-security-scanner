

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

package com.vulniq.client.securityanalyzer.datacollection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.vulniqapi.VulnIQAPIClient;
import com.vulniq.client.securityanalyzer.main.TerziOptions;
import com.vulniq.client.securityanalyzer.main.TerziOutputWriter;
import com.vulniq.client.securityanalyzer.scan.ScanHandlerBase;
import com.vulniq.client.securityanalyzer.scan.SecurityScanner;
import com.vulniq.client.securityanalyzer.utils.EncodeDecode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class ResultsToVulnIQPusher
{
    private static Logger logger = LoggerFactory.getLogger(ResultsToVulnIQPusher.class);
    private enum ResultType {scan, system_info};

    public static JsonObject pushScanResultsToVulnIQ(SecurityScanner scanner, TerziOptions options, DataCollectionMetadata metadata, TerziOutputWriter outputConsumer)
    {
        String pushMessage = options.getOptionValue(TerziOptions.OPTION_PUSH_TO_VULNIQ_MSG);
        Result result = new Result(ResultType.scan, metadata, pushMessage, scanner, options.getDataCollectionTarget());
        String jsonResults = result.toString();
        if(outputConsumer!=null)
        {
            outputConsumer.printInfoMessage(jsonResults);
        }
        if(options.isPushResultsToVulnIQ())
        {
            String apiUrl = TerziConfiguration.getVulnIQVMBaseUrl() + TerziConfiguration.getVulnIQPushScanResultsUrl();
            return pushToVulnIQ(apiUrl, jsonResults, outputConsumer);
        }
        return null;
    }

    /**
     * Posts a json serialized Result instance
     * @param options
     * @param metadata
     * @param outputConsumer
     * @return
     */
    public static JsonObject startScan(SecurityScanner scanner, TerziOptions options, DataCollectionMetadata metadata, TerziOutputWriter outputConsumer)
    {
        String pushMessage = options.getOptionValue(TerziOptions.OPTION_PUSH_TO_VULNIQ_MSG);
        Result result = new Result(ResultType.scan, metadata, pushMessage, scanner, options.getDataCollectionTarget());
        String jsonResults = result.toString();
        if(outputConsumer!=null)
        {
            outputConsumer.printInfoMessage(jsonResults);
        }
        if(options.isPushResultsToVulnIQ())
        {
            String apiUrl = TerziConfiguration.getVulnIQVMBaseUrl() + TerziConfiguration.getVulnIQScanStartNewUrl();
            return pushToVulnIQ(apiUrl, jsonResults, outputConsumer);
        }
        return null;
    }

    /**
     * YOU MUST HAVE ALREADY CALLED DataCollectionMetadata.end BEFORE CALLING THIS
     * posts json serialized DataCollectionMetadata
     * @param options
     * @param metadata
     * @param outputConsumer
     * @return
     */
    public static JsonObject endScan(TerziOptions options, DataCollectionMetadata metadata, TerziOutputWriter outputConsumer, boolean scanSucceeded)
    {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        Map<String, Object> mapToPost = new HashMap<>();
        mapToPost.put("dataCollectionGuid", metadata.getDataCollectionGuid());
        mapToPost.put("endTimestamp", metadata.getEndTimestamp());
        mapToPost.put("terziInstanceGuid", TerziConfiguration.getTerziInstanceGuid());
        mapToPost.put("scanSucceeded", scanSucceeded);

        String jsonResults = gson.toJson(mapToPost);
        if(outputConsumer!=null)
        {
            outputConsumer.printInfoMessage(jsonResults);
        }
        if(options.isPushResultsToVulnIQ())
        {
            String apiUrl = TerziConfiguration.getVulnIQVMBaseUrl() + TerziConfiguration.getVulnIQScanEndUrl();
            return pushToVulnIQ(apiUrl, jsonResults, outputConsumer);
        }
        return null;
    }

    /**
     * @param dataCollectionGuid
     * @param scanHandler
     * @param outputConsumer
     * @return
     */
    public static JsonObject addResultToScan(String dataCollectionGuid, ScanHandlerBase scanHandler, TerziOutputWriter outputConsumer)
    {
        String apiUrl = TerziConfiguration.getVulnIQVMBaseUrl() + TerziConfiguration.getVulnIQScanResultAddUrl() +
                            "?dataCollectionGuid=" + EncodeDecode.urlEncode(dataCollectionGuid);
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        String jsonResults = gson.toJson(scanHandler);
        return pushToVulnIQ(apiUrl, jsonResults, outputConsumer);
    }

    public static JsonObject pushSystemInfoToVulnIQ(Map<String, Object> data, TerziOptions options, DataCollectionMetadata metadata, TerziOutputWriter outputConsumer)
    {
        String pushMessage = options.getOptionValue(TerziOptions.OPTION_PUSH_TO_VULNIQ_MSG);
        Result result = new Result(ResultType.system_info, metadata, pushMessage, data, options.getDataCollectionTarget());
        String jsonResults = result.toString();
        if(outputConsumer!=null)
        {
            outputConsumer.printInfoMessage(jsonResults);
        }
        if(options.isPushResultsToVulnIQ())
        {
            String apiUrl = TerziConfiguration.getVulnIQVMBaseUrl() + TerziConfiguration.getVulnIQPushSystemInfoUrl();
            return pushToVulnIQ(apiUrl, jsonResults, outputConsumer);
        }
        return null;
    }

    private static JsonObject pushToVulnIQ(String url, String json, TerziOutputWriter outputConsumer)
    {
        String postResults = VulnIQAPIClient.postJSONToVulnIQ(url, json);
        if(outputConsumer!=null)
        {
            outputConsumer.printInfoMessage("Pushed results to VulnIQ VM:");
            outputConsumer.printInfoMessage(postResults);
        }
        if(postResults!=null)
        {
            try
            {
                Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
                JsonObject rv = gson.fromJson(postResults, JsonObject.class);
                return rv;
            }
            catch (Exception ex)
            {
                logger.error("pushToVulnIQ error parsing response from VulnIQ VM. Response:" + postResults, ex);
            }
        }
        return null;
    }

    private static class Result
    {
        private String terziInstanceGuid;
        private ResultType resultType;
        private DataCollectionMetadata dataCollectionMetadata;
        private DataCollectionTarget dataCollectionTarget;
        private String message;
        private Object data;

        public Result(ResultType resultType, DataCollectionMetadata metadata, String pushMessage, Object data, DataCollectionTarget target)
        {
            this.terziInstanceGuid = TerziConfiguration.getTerziInstanceGuid();
            this.resultType = resultType;
            this.dataCollectionMetadata = metadata;
            this.data = data;
            this.message = pushMessage;
            this.dataCollectionTarget = target;
        }

        /**
         *
         * @return
         */
        @Override
        public String toString()
        {
            Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
            return gson.toJson(this);
        }
    }
}
