
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

package com.vulniq.client.securityanalyzer.vulniqapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.datacollection.InstalledSoftware;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.http.TrustAnyTrustManager;
import com.vulniq.client.securityanalyzer.logging.TerziLog;
import com.vulniq.client.securityanalyzer.utils.EncodeDecode;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultServiceUnavailableRetryStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URI;
import java.nio.file.StandardCopyOption;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VulnIQAPIClient
{
    private static Logger logger = LoggerFactory.getLogger(VulnIQAPIClient.class);

    static boolean dontFollowRedirects = true;
    static boolean trustAnyCert = true;
    static boolean retryInCaseOfIOException = true;

    public static CloseableHttpClient createHttpClient()
    {
        HttpClientBuilder httpClientBuilder = HttpClients.custom();

        if(dontFollowRedirects)
        {
            //TODO check if this works as expected
            httpClientBuilder.disableRedirectHandling();
        }


        if(trustAnyCert)
        {
            SSLContext sslContext = null;
            try {
                sslContext = SSLContext.getInstance("TLS");
                sslContext.init(null, new TrustManager[] {new TrustAnyTrustManager()}, null);
                httpClientBuilder.setSSLContext(sslContext);
                httpClientBuilder.setSSLHostnameVerifier(new HostnameVerifier()
                {
                    @Override
                    public boolean verify(String hostname, SSLSession session)
                    {
                        return true;
                    }
                });
            }
            catch (NoSuchAlgorithmException e)
            {
                logger.error("createHttpClient Failed to create ssl context to be used for a http client (NoSuchAlgorithmException)", e);
            }
            catch (KeyManagementException e)
            {
                logger.error("createHttpClient Failed to create ssl context to be used for a http client (KeyManagementException)", e);
            }

        }
        httpClientBuilder.setServiceUnavailableRetryStrategy(new DefaultServiceUnavailableRetryStrategy(10, 1000));
        return httpClientBuilder.build();
    }
    public static String getFromVulnIQUsingAccessTokenAsString(String url, boolean isVMUrl)
    {
        CloseableHttpClient httpClient = createHttpClient();

        HttpClientContext httpClientContext = new HttpClientContext();

        for(int retryCount = 0; retryCount<10; retryCount++)
        {
            String accessTokenToUse = "";
            if(isVMUrl)
            {
                accessTokenToUse = TerziConfiguration.getVulnIQVMAccessToken();
            }
            else
            {
                accessTokenToUse = TerziConfiguration.getVulnIQEngineAccessToken();
            }
            if (accessTokenToUse == null || accessTokenToUse.isEmpty())
            {
                throw new RuntimeException("No VulnIQ access token configured in conf/terzi.properties");
            }
            HttpGet httpGet = new HttpGet(url);
            httpGet.addHeader("Authorization", "Bearer " + accessTokenToUse);
            //AppLog.debug(httpGet.getAllHeaders());
            try (CloseableHttpResponse response = httpClient.execute(httpGet, httpClientContext))
            {
                //AppLog.debug(response.getAllHeaders());
                HttpHost targetHost = httpClientContext.getTargetHost();
                List<URI> redirectLocations = httpClientContext.getRedirectLocations();
                URI finalLocation = URIUtils.resolve(httpGet.getURI(), targetHost, redirectLocations);

                logger.debug("getFromVulnIQUsingAccessTokenAsString url='" + url + "' Response: statusCode='" +
                                response.getStatusLine() + "'" + " finalUrl='" + finalLocation + "'");
                if(response.getStatusLine().getStatusCode()==429)
                {
                    System.out.println("*************************************************************");
                    System.out.println("RATE LIMIT EXCEEDED! Contact info@vulniq.com to start your VulnIQ subscription");
                    System.out.println("*************************************************************");
                    return null;
                }
                String responseBody = EntityUtils.toString(response.getEntity());
                //AppLog.debug(responseBody);
                return responseBody;
            }
            catch (IOException e)
            {
                logger.error("getFromVulnIQUsingAccessTokenAsString IOException url='" + url + "'" , e);
                if(!retryInCaseOfIOException)
                {
                    return null;
                }
            }
            catch (Exception e)
            {
                logger.error("getFromVulnIQUsingAccessTokenAsString Exception url='" + url + "'" , e);
                return null;
            }
            retryCount++;
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                logger.error("getFromVulnIQUsingAccessTokenAsString url='" + url + "' retryCount=" + retryCount, e);
            }
        }   //for
        return null;
    }

    public static String postJSONToVulnIQ(String url, String jsonBody)
    {
        CloseableHttpClient httpClient = createHttpClient();

        HttpClientContext httpClientContext = new HttpClientContext();

        for(int retryCount = 0; retryCount<10; retryCount++)
        {
            if(TerziConfiguration.getVulnIQVMAccessToken()==null || TerziConfiguration.getVulnIQVMAccessToken().isEmpty())
            {
                throw new RuntimeException("VulnIQ VM access token is not configured properly in conf/terzi.properties");
            }
            HttpPost httpPost = new HttpPost(url);
            httpPost.addHeader("Authorization", "Bearer " + TerziConfiguration.getVulnIQVMAccessToken());
            httpPost.setHeader("Content-type", "application/json");
            StringEntity jsonBodyEntity = new StringEntity(jsonBody, ContentType.APPLICATION_JSON);
            httpPost.setEntity(jsonBodyEntity);
            try (CloseableHttpResponse response = httpClient.execute(httpPost, httpClientContext))
            {
                HttpHost targetHost = httpClientContext.getTargetHost();
                List<URI> redirectLocations = httpClientContext.getRedirectLocations();
                URI finalLocation = URIUtils.resolve(httpPost.getURI(), targetHost, redirectLocations);
                logger.debug("postJSONToVulnIQ Sent request url='" + url + "' Response: statusCode='" + response.getStatusLine() + "'" +
                                " finalUrl='" + finalLocation + "'");

                String responseBody = EntityUtils.toString(response.getEntity());
                return responseBody;
            }
            catch (IOException e)
            {
                logger.error("postJSONToVulnIQ url='" + url + "'", e);
                if(!retryInCaseOfIOException)
                {
                    return null;
                }
            }
            catch (Exception e)
            {
                logger.error("postJSONToVulnIQ url='" + url + "'", e);
                return null;
            }
            retryCount++;
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                logger.error("postJSONToVulnIQ url='" + url + "' retryCount=" + retryCount, e);
            }
        }   //for
        return null;
    }

    public static String getAsString(String url)
    {
        CloseableHttpClient httpClient = createHttpClient();

        HttpClientContext httpClientContext = new HttpClientContext();

        for(int retryCount = 0; retryCount<10; retryCount++)
        {
            HttpGet httpGet = new HttpGet(url);
            try (CloseableHttpResponse response = httpClient.execute(httpGet, httpClientContext))
            {
                HttpHost targetHost = httpClientContext.getTargetHost();
                List<URI> redirectLocations = httpClientContext.getRedirectLocations();
                URI finalLocation = URIUtils.resolve(httpGet.getURI(), targetHost, redirectLocations);

                logger.debug("getAsString url='" + url + "' Response: statusCode='" + response.getStatusLine() + "'" +
                                " finalUrl='" + finalLocation + "'");
                String responseBody = EntityUtils.toString(response.getEntity());
                //AppLog.debug(responseBody);
                return responseBody;
            }
            catch (IOException e)
            {
                logger.error("getAsString url='" + url + "'", e);
                if(!retryInCaseOfIOException)
                {
                    return null;
                }
            }
            catch (Exception e)
            {
                logger.error("getAsString url='" + url + "'", e);
                return null;
            }
            retryCount++;
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                logger.error("getAsString url='" + url + "' retryCount=" + retryCount, e);
            }
        }   //for
        return null;
    }

    /**
     *
     * @return
     */
    public static List<VulnIQVulnerabilityData> getVulnerabilitiesAffectingSoftware(OSInfo osInfo, InstalledSoftware installedSoftware)
    {
        //?osName=Debian GNU/Linux 10 (buster)&packageName=curl&versionName=7.1&pageNumber=1&resultsPerPage=20
        //TODO we process only the first 100 results. if there are more vulns they will be ignored
        String url = "";

        if(osInfo.getOsType()== OSInfo.OSType.Windows)
        {
            if(installedSoftware.getVendor()!=null && installedSoftware.getVendor().startsWith("Microsoft"))
            {
                //for windows only, if vendor is Microsoft: call MS specific endpoint
                if (installedSoftware.getVendor() != null && installedSoftware.getVendor().startsWith("Microsoft"))
                {
                    url = TerziConfiguration.getVulnIQEngineBaseUrl() +
                            TerziConfiguration.getVulnIQVulnsByVendorProductUrl() +
                            "?osName=" + EncodeDecode.urlEncode(osInfo.getOsName()) +
                            "&osVersion=" + EncodeDecode.urlEncode(osInfo.getDisplayVersion()) +
                            "&vendorProductName=" + EncodeDecode.urlEncode(installedSoftware.getName()) +
                            "&vendorProductVersion=" + EncodeDecode.urlEncode(installedSoftware.getVersion()) +
                            "&vendor=Microsoft" +   //<---hardcoded
                            "&pageNumber=1&resultsPerPage=100";
                }
            }
            else
            {
                url = TerziConfiguration.getVulnIQEngineBaseUrl() +
                        TerziConfiguration.getVulnIQVulnsByVPVUrl() +
                        "?" +
                        "&vendorName=" +  EncodeDecode.urlEncode(installedSoftware.getVendor()) +
                        "&productName=" + EncodeDecode.urlEncode(installedSoftware.getName()) +
                        "&versionName=" + EncodeDecode.urlEncode(installedSoftware.getVersion()) +
                        "&pageNumber=1&resultsPerPage=100";
            }
        }
        else if(osInfo.getOsType()== OSInfo.OSType.Linux)
        {
            url = TerziConfiguration.getVulnIQEngineBaseUrl() +
                    TerziConfiguration.getVulnIQVulnsByPackageUrl() +
                    "?osName=" + EncodeDecode.urlEncode(osInfo.getOsName()) +
                    "&osVersion=" + EncodeDecode.urlEncode(osInfo.getDisplayVersion()) +
                    "&packageName=" + EncodeDecode.urlEncode(installedSoftware.getName()) +
                    "&versionName=" + EncodeDecode.urlEncode(installedSoftware.getVersion()) +
                    "&vendorName=" + EncodeDecode.urlEncode(installedSoftware.getVendor()) +
                    "&pageNumber=1&resultsPerPage=100";
        }
        else if(osInfo.getOsType()== OSInfo.OSType.Mac)
        {
            //TODO this needs to be improved
            url = TerziConfiguration.getVulnIQEngineBaseUrl() +
                    TerziConfiguration.getVulnIQVulnsByVPVUrl() +
                    "?" +
                    "&vendorName=" +  EncodeDecode.urlEncode(installedSoftware.getVendor()) +
                    "&productName=" + EncodeDecode.urlEncode(installedSoftware.getName()) +
                    "&versionName=" + EncodeDecode.urlEncode(installedSoftware.getVersion()) +
                    "&pageNumber=1&resultsPerPage=100";
        }
        else
        {
            TerziLog.supportCase("VulnIQAPIClient.getVulnerabilitiesAffectingSoftware",
                    "Unexpected OS", osInfo.toString(), "Please open a support case/ticket", null);
            return null;
        }

        String response = getFromVulnIQUsingAccessTokenAsString(url, false);
        if(logger.isDebugEnabled())
        {
            logger.debug("getVulnerabilitiesAffectingSoftware: url='"+url+"', response='"+response+"'"  );
        }
        List<VulnIQVulnerabilityData> rv = new LinkedList<>();
        if(response!=null)
        {
            JsonObject parsedResponse = new JsonParser().parse(response).getAsJsonObject();
            if(parsedResponse!=null && parsedResponse.has("results"))
            {
                JsonArray results = parsedResponse.get("results").getAsJsonArray();
                if(results!=null)
                {
                    for (JsonElement vulnElement : results)
                    {
                        JsonObject vulnObject = vulnElement.getAsJsonObject();

                        VulnIQVulnerabilityData viqVuln = null;
                        if(osInfo.getOsType()== OSInfo.OSType.Windows && installedSoftware.getVendor()!=null && installedSoftware.getVendor().startsWith("Microsoft"))
                        {
                            viqVuln = new VulnIQVulnerabilityData(vulnObject, "Microsoft");
                        }
                        else
                        {
                            viqVuln = new VulnIQVulnerabilityData(vulnObject);
                        }
                        rv.add(viqVuln);
                    }
                }
            }
            else
            {
                logger.warn("Unexpected response from VulnIQ server: " + response + " url:" + url);
            }
        }
        else
        {
            logger.warn("Response from VulnIQ server is null for " + url);
        }

        return rv;
    }

    public static List<VulnIQVulnerabilityData> getVulnerabilitiesAffectingOS(OSInfo osInfo)
    {
        //TODO we process only the first 100 results. if there are more vulns they will be ignored
        String url = "";

        if(osInfo.getOsType() == OSInfo.OSType.Windows)
        {
            url = TerziConfiguration.getVulnIQEngineBaseUrl() +
                    TerziConfiguration.getVulnIQVulnsByVendorProductUrl() +
                    "?osName=" + EncodeDecode.urlEncode(osInfo.getOsName()) +
                    "&osVersion=" + EncodeDecode.urlEncode(osInfo.getDisplayVersion()) +
                    "&vendorProductName=" + EncodeDecode.urlEncode(osInfo.getOsName()) +
                    "&vendorProductVersion=" + EncodeDecode.urlEncode(osInfo.getDisplayVersion()) +
                    "&vendor=Microsoft" +   //<---hardcoded
                    "&isProductOS=true" +
                    "&pageNumber=1&resultsPerPage=100";
        }
        else
        {
            throw new RuntimeException("getVulnerabilitiesAffectingOS - unsupported operating system: " + osInfo);
        }

        String response = getFromVulnIQUsingAccessTokenAsString(url, false);
        if(logger.isDebugEnabled())
        {
            logger.debug("getVulnerabilitiesAffectingSoftware: url='"+url+"', response='"+response+"'"  );
        }
        List<VulnIQVulnerabilityData> rv = new LinkedList<>();
        if(response!=null)
        {
            JsonObject parsedResponse = new JsonParser().parse(response).getAsJsonObject();
            if(parsedResponse!=null)
            {
                JsonArray results = parsedResponse.get("results").getAsJsonArray();
                if(results!=null)
                {
                    for (JsonElement vulnElement : results)
                    {
                        JsonObject vulnObject = vulnElement.getAsJsonObject();
                        VulnIQVulnerabilityData viqVuln = new VulnIQVulnerabilityData(vulnObject, "Microsoft");
                        rv.add(viqVuln);
                    }
                }
            }
        }
        return rv;
    }

    public static List<VulnIQVulnerabilityVerificationData> getVulnVerificationData(VulnIQVulnerabilityData vulnIQVulnerability, OSInfo osInfo, InstalledSoftware installedSoftware)
    {
        String url = TerziConfiguration.getVulnIQEngineBaseUrl() + TerziConfiguration.getVulnIQScannerDataUrl() +
                "?vulnGuid="+ EncodeDecode.urlEncode(vulnIQVulnerability.getGuid())+
                "&vulnDataType=" + vulnIQVulnerability.getDataType() +
                "&osName=" + EncodeDecode.urlEncode(osInfo.getOsName()) +
                "&osVersion=" + EncodeDecode.urlEncode(osInfo.getDisplayVersion());
        if(installedSoftware!=null)
        {
            url+="&productName=" + EncodeDecode.urlEncode(installedSoftware.getName()) +
                    "&productVendor=" + EncodeDecode.urlEncode(installedSoftware.getVendor()) +
                    "&productVersion=" + EncodeDecode.urlEncode(installedSoftware.getVersion());
        }
        else
        {
            url+="&isProductOS=true";
        }
        String response = getFromVulnIQUsingAccessTokenAsString(url, false);
        if(logger.isDebugEnabled())
        {
            logger.debug("getVulnVerificationData: url='"+url+"', response='"+response+"'"  );
        }
        List<VulnIQVulnerabilityVerificationData> rv = new LinkedList<>();
        if(response!=null)
        {
            Gson gson = new GsonBuilder().disableHtmlEscaping().create();
            Type listType = new TypeToken<List<VulnIQVulnerabilityVerificationData>>(){}.getType();
            rv = gson.fromJson(response, listType);
        }
        return rv;
    }


    public static int downloadToFile(String url, File targetFile)
    {

        CloseableHttpClient httpClient = createHttpClient();

        HttpClientContext httpClientContext = new HttpClientContext();

        ResponseHandler<Map<String, Object>> responseHandler = new ResponseHandler<Map<String, Object>>()
        {
            @Override
            public Map<String, Object> handleResponse(HttpResponse httpResponse) throws ClientProtocolException, IOException
            {
                InputStream inputStream = httpResponse.getEntity().getContent();

                long bytesCopied = java.nio.file.Files.copy(
                        inputStream,
                        targetFile.toPath(),
                        StandardCopyOption.REPLACE_EXISTING);
                Map<String, Object> rv = new HashMap<>();

                rv.put("numBytes", Long.valueOf(bytesCopied));
                rv.put("statusLine", httpResponse.getStatusLine());
                return rv;
            }
        };

        try
        {
            HttpGet httpGet = new HttpGet(url);
            Map<String, Object> downloadResult = httpClient.execute(httpGet, responseHandler,  httpClientContext);
            HttpHost targetHost = httpClientContext.getTargetHost();
            List<URI> redirectLocations = httpClientContext.getRedirectLocations();

            URI finalLocation = URIUtils.resolve(httpGet.getURI(), targetHost, redirectLocations);
            logger.debug("downloadToFile download finished. DownloadResult: '"+downloadResult+"' finalUrl='" + finalLocation+"'");
            Long numBytes = (Long) downloadResult.get("numBytes");
            if(numBytes!=null)
            {
                return numBytes.intValue();
            }
            return -1;
        }
        catch (IOException e)
        {
            logger.error("downloadToFile Url='"+url+"'", e);
            return -2;
        }
        catch (Exception e)
        {
            logger.error("downloadToFile Url='"+url+"'", e);
            return -3;
        }
    }
}
