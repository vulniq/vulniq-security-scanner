

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

package com.vulniq.client.securityanalyzer.config;

import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Properties;
import java.util.UUID;

/**
 * VulnIQ config
 */
public class TerziConfiguration
{
    public static final String ENV_TERZI_CONFIG_FOLDER = "TERZI_CONFIG_FOLDER";
    public static final String ENV_TERZI_CONFIGURATION_FILE = "TERZI_CONFIGURATION_FILE";
    public static final String ENV_TERZI_ACTION = "TERZI_ACTION";
    public static final String ENV_TERZI_GUID_DAT_FILE_NAME = "terziInstanceGuid.dat";
    private static Logger logger = LoggerFactory.getLogger(TerziConfiguration.class);
    private static String terziInstanceGuid = UUID.randomUUID().toString();
    private static String vulnIQEngineBaseUrl = "";
    private static String vulnIQVMBaseUrl = "";
    private static String vulnIQEngineAccessToken = "";
    private static String vulnIQVMAccessToken = "";
    private static String vulnIQOVALXMLUrl = "/api/oval/xml";
    private static String vulnIQVulnsByPackageUrl = "/api/vulnerability/list-by-package";
    private static String vulnIQVulnsByVendorProductUrl = "/api/vulnerability/list-by-vendor-product";
    private static String vulnIQVulnsByVPVUrl = "/api/vulnerability/list-by-vpv";
    private static String vulnIQScannerDataUrl = "/api/vulnerability/scanner-data";
    private static String vulnIQPushScanResultsUrl = "/api/terzi/push-scan-results";
    private static String vulnIQPushSystemInfoUrl = "/api/terzi/push-system-info";
    private static String vulnIQScanStartNewUrl = "/api/terzi/scan-start-new";
    private static String vulnIQScanResultAddUrl = "/api/terzi/scan/add-result";
    private static String vulnIQScanEndUrl = "/api/terzi/scan/end";
    private static String threadNamePrefix = "viq-";
    private static String dockerCommand = "docker";
    private static int commandTimeoutDefaultMS = 30000;

    public static boolean loadConfigurationFile(String filePath)
    {
        try (InputStream input = new FileInputStream(filePath))
        {
            Properties props = new Properties();
            props.load(input);
            {
                String instanceGuidFromFile = loadTerziInstanceGuidFromDatFile();
                if(instanceGuidFromFile!=null && !instanceGuidFromFile.isEmpty())
                {
                    terziInstanceGuid = instanceGuidFromFile;
                }
                else
                {
                    terziInstanceGuid = props.getProperty("terziInstanceGuid", terziInstanceGuid);
                    saveTerziInstanceGuidToDatFile();
                }
                vulnIQEngineBaseUrl = props.getProperty("vulnIQEngineBaseUrl", vulnIQEngineBaseUrl);
                vulnIQVMBaseUrl = props.getProperty("vulnIQVMBaseUrl", vulnIQVMBaseUrl);
                vulnIQEngineAccessToken = props.getProperty("vulnIQEngineAccessToken");
                vulnIQVMAccessToken = props.getProperty("vulnIQVMAccessToken");
                vulnIQOVALXMLUrl = props.getProperty("vulnIQOVALXMLUrl", vulnIQOVALXMLUrl);
                threadNamePrefix = props.getProperty("threadNamePrefix", threadNamePrefix);
                dockerCommand = props.getProperty("dockerCommand", dockerCommand);
                commandTimeoutDefaultMS = StringUtils.parseInt(props.getProperty("commandTimeoutDefaultMS"), commandTimeoutDefaultMS);

                vulnIQVulnsByPackageUrl = props.getProperty("vulnIQVulnsByPackageUrl", vulnIQVulnsByPackageUrl);
                vulnIQVulnsByVendorProductUrl = props.getProperty("vulnIQVulnsByVendorProductUrl", vulnIQVulnsByVendorProductUrl);
                vulnIQVulnsByVPVUrl = props.getProperty("vulnIQVulnsByVPVUrl", vulnIQVulnsByVPVUrl);
                vulnIQPushScanResultsUrl = props.getProperty("vulnIQPushScanResultsUrl", vulnIQPushScanResultsUrl);
                vulnIQPushSystemInfoUrl = props.getProperty("vulnIQPushSystemInfoUrl", vulnIQPushSystemInfoUrl);
                vulnIQScanStartNewUrl = props.getProperty("vulnIQScanStartNewUrl", vulnIQScanStartNewUrl);
                vulnIQScanResultAddUrl = props.getProperty("vulnIQScanResultAddUrl", vulnIQScanResultAddUrl);
                vulnIQScanEndUrl = props.getProperty("vulnIQScanEndUrl", vulnIQScanEndUrl);
            }
            return true;
        }
        catch (Exception ex)
        {
            logger.error("Error loading configuration file:'" + filePath + "'", ex);
            return false;
        }
    }

    private static void saveTerziInstanceGuidToDatFile()
    {
        String confFolder = System.getProperty(ENV_TERZI_CONFIG_FOLDER);
        Path datFile = Path.of(confFolder, ENV_TERZI_GUID_DAT_FILE_NAME);
        try
        {
            Files.writeString(datFile, terziInstanceGuid, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        }
        catch (Exception ex)
        {
            logger.error("Error writing " + ENV_TERZI_GUID_DAT_FILE_NAME, ex);
        }
    }

    private static String loadTerziInstanceGuidFromDatFile()
    {
        String confFolder = System.getProperty(ENV_TERZI_CONFIG_FOLDER);
        Path datFile = Path.of(confFolder, ENV_TERZI_GUID_DAT_FILE_NAME);
        try
        {
            return Files.readString(datFile);
        }
        catch (Exception ex)
        {
            logger.error("Error reading " + ENV_TERZI_GUID_DAT_FILE_NAME, ex);
            return null;
        }
    }

    public static String getVulnIQEngineBaseUrl()
    {
        return vulnIQEngineBaseUrl;
    }

    public static String getVulnIQVMBaseUrl()
    {
        return vulnIQVMBaseUrl;
    }

    public static String getVulnIQEngineAccessToken()
    {
        return vulnIQEngineAccessToken;
    }

    /**
     * /oval/view?dataSourceGuid=cisoval&ovalId=oval%3Aorg.cisecurity%3Adef%3A6131
     * @return
     */
    public static String getVulnIQOVALXMLUrl()
    {
        return vulnIQOVALXMLUrl;
    }


    public static String getThreadNamePrefix()
    {
        return threadNamePrefix;
    }

    public static String getDockerCommand()
    {
        return dockerCommand;
    }

    public static int getCommandTimeoutDefaultMS()
    {
        return commandTimeoutDefaultMS;
    }

    public static String getVulnIQVulnsByPackageUrl()
    {
        return vulnIQVulnsByPackageUrl;
    }
    public static String getVulnIQScannerDataUrl()
    {
        return vulnIQScannerDataUrl;
    }

    public static String getVulnIQPushScanResultsUrl()
    {
        return vulnIQPushScanResultsUrl;
    }

    public static String getVulnIQPushSystemInfoUrl()
    {
        return vulnIQPushSystemInfoUrl;
    }

    public static String getTerziInstanceGuid()
    {
        return terziInstanceGuid;
    }

    public static void setTerziInstanceGuid(String terziInstanceGuid)
    {
        TerziConfiguration.terziInstanceGuid = terziInstanceGuid;
    }

    public static String getVulnIQScanStartNewUrl()
    {
        return vulnIQScanStartNewUrl;
    }

    public static String getVulnIQScanResultAddUrl()
    {
        return vulnIQScanResultAddUrl;
    }

    public static String getVulnIQScanEndUrl()
    {
        return vulnIQScanEndUrl;
    }

    public static String getVulnIQVulnsByVendorProductUrl()
    {
        return vulnIQVulnsByVendorProductUrl;
    }

    public static String getVulnIQVulnsByVPVUrl()
    {
        return vulnIQVulnsByVPVUrl;
    }

    public static String getVulnIQVMAccessToken()
    {
        return vulnIQVMAccessToken;
    }
}
