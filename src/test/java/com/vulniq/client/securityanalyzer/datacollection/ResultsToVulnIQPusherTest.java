
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
import com.google.gson.reflect.TypeToken;
import com.vulniq.client.securityanalyzer.TerziTestBase;
import com.vulniq.client.securityanalyzer.TerziTestSetup;
import com.vulniq.client.securityanalyzer.datacollection.os.LinuxOSInfo;
import com.vulniq.client.securityanalyzer.main.TerziOptions;
import com.vulniq.client.securityanalyzer.main.TerziOutputWriter;
import com.vulniq.client.securityanalyzer.scan.InstalledSoftwareScanHandler;
import com.vulniq.client.securityanalyzer.scan.SecurityScanner;
import com.vulniq.client.securityanalyzer.scan.finding.ScanFinding;
import com.vulniq.client.securityanalyzer.scan.finding.VulnerabilityFinding;
import com.vulniq.client.securityanalyzer.vulniqapi.VulnIQConstants;
import com.vulniq.client.securityanalyzer.vulniqapi.VulnIQVulnerabilityData;
import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class ResultsToVulnIQPusherTest extends TerziTestBase
{

    private String viqPuppeteerOSInfo = "{\n" +
            "  \"linuxType\": \"ubuntu\",\n" +
            "  \"osType\": \"Linux\",\n" +
            "  \"osName\": \"Ubuntu\",\n" +
            "  \"versionId\": \"18.04\",\n" +
            "  \"versionCodeName\": \"bionic\",\n" +
            "  \"versionLongName\": \"18.04.1 LTS (Bionic Beaver)\",\n" +
            "  \"displayName\": \"Ubuntu 18.04.1 LTS\"\n" +
            "}";
    private String viqPuppeteerInstalledSoftware = "[  {\n" +
            "    \"name\": \"curl\",\n" +
            "    \"version\": \"7.58.0-2ubuntu3.5\",\n" +
            "    \"description\": \"command line tool for transferring data with URL syntax\",\n" +
            "    \"architecture\": \"amd64\"\n" +
            "  },{\n" +
            "    \"name\": \"apache2\",\n" +
            "    \"version\": \"2.4.29-1ubuntu4.5\",\n" +
            "    \"description\": \"Apache HTTP Server\",\n" +
            "    \"architecture\": \"amd64\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\": \"apache2-bin\",\n" +
            "    \"version\": \"2.4.29-1ubuntu4.5\",\n" +
            "    \"description\": \"Apache HTTP Server (modules and other binary files)\",\n" +
            "    \"architecture\": \"amd64\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\": \"apache2-data\",\n" +
            "    \"version\": \"2.4.29-1ubuntu4.5\",\n" +
            "    \"description\": \"Apache HTTP Server (common files)\",\n" +
            "    \"architecture\": \"all\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\": \"apache2-utils\",\n" +
            "    \"version\": \"2.4.29-1ubuntu4.5\",\n" +
            "    \"description\": \"Apache HTTP Server (utility programs for web servers)\",\n" +
            "    \"architecture\": \"amd64\"\n" +
            "  }]";


    @Mock
    TerziOptions terziOptions;

    @Mock
    TerziOutputWriter outputConsumer;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    //TODO review and enable
    //@Test
    public void startAddResultsAndEndScan()
    {
        TerziTestSetup.setupSystemProps();
        //note viq-puppeteer-1 is irrelevant, everything is mocked
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "viq-puppeteer-1");

        Mockito.when(terziOptions.isPushResultsToVulnIQ()).thenReturn(true);
        Mockito.when(terziOptions.getDataCollectionTarget()).thenReturn(target);

        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        OSInfo osInfo = gson.fromJson(viqPuppeteerOSInfo, LinuxOSInfo.class);
        List<InstalledSoftware> installedSoftware;
        Type listOfSoftwareType = new TypeToken<LinkedList<InstalledSoftware>>(){}.getType();
        installedSoftware = gson.fromJson(viqPuppeteerInstalledSoftware, listOfSoftwareType);
        DataCollectionMetadata metadata = new DataCollectionMetadata();
        metadata.start();

        SecurityScanner scanner = new SecurityScanner(target, osInfo, 1, true, outputConsumer);
        scanner.prepareToScan(installedSoftware);

        JsonObject apiResponse = ResultsToVulnIQPusher.startScan(scanner, terziOptions, metadata, outputConsumer);
        System.out.println(apiResponse.toString());
        String dataCollectionGuid = apiResponse.get("dataCollectionGuid").getAsString();
        //////
        //add Result to scan
        InstalledSoftwareScanHandler scanHandler = new InstalledSoftwareScanHandler(scanner, "test-1", installedSoftware.get(0), osInfo, target);
        List<ScanFinding> findings = new LinkedList<>();
        ScanFinding infoFinding = new ScanFinding();
        infoFinding.setFindingGuid(UUID.randomUUID().toString());
        infoFinding.setName("info 1 from test");
        infoFinding.setDescription("created by unit test");
        infoFinding.setFindingType(ScanFinding.FindingType.Info);
        infoFinding.setNeedsReview(false);
        infoFinding.setScore(ScanFinding.FindingScore.Informational);
        infoFinding.setVerificationStatus(ScanFinding.VerificationStatus.Unverified);
        findings.add(infoFinding);

        JsonObject viqVulnObj = new JsonObject();
        viqVulnObj.addProperty("guid", "cve-2020-1111");
        viqVulnObj.addProperty("dataType", 1);
        viqVulnObj.addProperty("name", "cve-2020-1111");
        viqVulnObj.addProperty("description", "created by unit test");
        VulnIQVulnerabilityData viqVulnerability = new VulnIQVulnerabilityData(viqVulnObj);

        VulnerabilityFinding vulnFinding = new VulnerabilityFinding(viqVulnerability);
        vulnFinding.setNeedsReview(true);
        vulnFinding.setScore(ScanFinding.FindingScore.High);
        vulnFinding.setViqDataType(VulnIQConstants.VIQ_DataType_CVE);
        vulnFinding.setVerificationStatus(ScanFinding.VerificationStatus.Unverified);
        findings.add(vulnFinding);


        scanHandler.setFindings(findings);

        JsonObject addResultResponse = ResultsToVulnIQPusher.addResultToScan(dataCollectionGuid, scanHandler, outputConsumer);
        System.out.println(addResultResponse.toString());
        metadata.end(true, dataCollectionGuid);
        ResultsToVulnIQPusher.endScan(terziOptions, metadata, outputConsumer, true);
    }

}