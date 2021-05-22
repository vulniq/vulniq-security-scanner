

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

import com.vulniq.client.securityanalyzer.datacollection.DataCollectionMetadata;
import com.vulniq.client.securityanalyzer.datacollection.InstalledSoftware;
import com.vulniq.client.securityanalyzer.datacollection.InstalledSoftwareCollector;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.datacollection.ResultsToVulnIQPusher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfoMain
{
    private TerziOutputWriter outputWriter;

    public InfoMain(TerziOutputWriter outputConsumer)
    {
        this.outputWriter = outputConsumer;
    }

    public void run(TerziOptions options)
    {
        DataCollectionMetadata metadata = new DataCollectionMetadata();
        metadata.start();
        OSInfo osInfo = OSInfoCollector.getOSInfo(options.getDataCollectionTarget());
        List<InstalledSoftware> softwareList = InstalledSoftwareCollector.getInstalledSoftware(options.getDataCollectionTarget(), osInfo);
        metadata.end(true, null);

        Map<String, Object> data = new HashMap<>();
        data.put("osInfo", osInfo);
        data.put("installedSoftwares", softwareList);

        if(options.isPushResultsToVulnIQ())
        {
            ResultsToVulnIQPusher.pushSystemInfoToVulnIQ(data, options, metadata, outputWriter);
        }
        //just print json
        outputWriter.printResultObjectAsJson(data);
    }
}
