

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

import com.google.gson.JsonObject;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionMetadata;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.datacollection.ResultsToVulnIQPusher;
import com.vulniq.client.securityanalyzer.datacollection.os.WindowsOSInfo;
import com.vulniq.client.securityanalyzer.datacollection.windows.WindowsHotFix;
import com.vulniq.client.securityanalyzer.datacollection.windows.WindowsHotFixCollector;
import com.vulniq.client.securityanalyzer.scan.ScanHandlerBase;
import com.vulniq.client.securityanalyzer.scan.SecurityScanner;
import com.vulniq.client.securityanalyzer.scan.finding.ScanFinding;

import java.util.List;

public class ScanMain
{
    private TerziOutputWriter outputConsumer;

    public ScanMain(TerziOutputWriter outputConsumer)
    {
        this.outputConsumer = outputConsumer;
    }

    public boolean run(TerziOptions options)
    {
        outputConsumer.printInfoMessage("Starting scan");
        DataCollectionMetadata dataCollectionMetadata = new DataCollectionMetadata();
        OSInfo osInfo = OSInfoCollector.getOSInfo(options.getDataCollectionTarget());
        if(osInfo.getOsType() == OSInfo.OSType.Windows)
        {
            //collect installed hotfixes
            WindowsOSInfo windowsOSInfo = (WindowsOSInfo) osInfo;
            WindowsHotFixCollector hotFixCollector = new WindowsHotFixCollector();
            List<WindowsHotFix> windowsHotFixList = hotFixCollector.collectHotfixes(options.getDataCollectionTarget());
            windowsOSInfo.setInstalledHotfixes(windowsHotFixList);
        }
        SecurityScanner scanner = new SecurityScanner(options.getDataCollectionTarget(), osInfo, 1, options.isPushResultsToVulnIQ(), outputConsumer);
        dataCollectionMetadata.start();
        if(!scanner.prepareToScan(options.getOptionValue(TerziOptions.OPTION_PACKAGE_FILTER)))
        {
            //something went wrong. it won't work.
            return false;
        }
        String dataCollectionGuid = null;
        if(options.isPushResultsToVulnIQ())
        {
            JsonObject apiResponse = ResultsToVulnIQPusher.startScan(scanner, options, dataCollectionMetadata, outputConsumer);
            if(apiResponse!=null && apiResponse.has("dataCollectionGuid"))
            {
                dataCollectionGuid = apiResponse.get("dataCollectionGuid").getAsString();
            }
        }

        boolean scanSucceeded = scanner.scan(dataCollectionGuid);
        dataCollectionMetadata.end(scanSucceeded, dataCollectionGuid);
        if(options.isPushResultsToVulnIQ())
        {
            ResultsToVulnIQPusher.endScan(options, dataCollectionMetadata, outputConsumer, scanSucceeded);
        }
        outputConsumer.printInfoMessage("Finished scan");
        if(options.getOutputFormat() == TerziOptions.OutputFormat.TEXT && scanner.getResults()!=null)
        {
            for(ScanHandlerBase scanHandler : scanner.getResults())
            {
                outputConsumer.printScanHandler(scanHandler);
            }
            int count = 0;
            outputConsumer.separatorLine();
            outputConsumer.beginSection("Scan Summary");
            for (ScanHandlerBase scanHandler : scanner.getResults())
            {
                List<ScanFinding> findings = scanHandler.getFindings();
                
                if(findings != null && findings.size() >0)
                {
                    outputConsumer.printInfoMessage("Name: " + scanHandler.getDisplayName());
                    count++;
                    for (ScanFinding finding : findings)
                    {
                        outputConsumer.printScanFindingSummary(finding);
                    }
                
                }
            }
            if(count == 0)
            {
                outputConsumer.printInfoMessage("No vulnerabilities were found.");
            }
        }
        if(options.getOutputFormat() == TerziOptions.OutputFormat.JSON)
        {
            outputConsumer.printResultObjectAsJson(scanner);
        }
        return true;
    }
}
