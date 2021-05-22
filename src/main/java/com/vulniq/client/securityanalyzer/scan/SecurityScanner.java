

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

package com.vulniq.client.securityanalyzer.scan;

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.InstalledSoftware;
import com.vulniq.client.securityanalyzer.datacollection.InstalledSoftwareCollector;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.ResultsToVulnIQPusher;
import com.vulniq.client.securityanalyzer.main.TerziOutputWriter;
import com.vulniq.client.securityanalyzer.scan.finding.ScanFinding;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public class SecurityScanner
{
    public enum ScanStatus{STARTED, IN_PROGRESS, FINISHED};
    private transient Logger logger = LoggerFactory.getLogger(SecurityScanner.class);
    private DataCollectionTarget target;
    private OSInfo osInfo;
    private List<InstalledSoftware> installedSoftwares;
    private List<String> errors = new LinkedList<>();

    /**
     * Number of concurrent threads used for scanning
     */
    private int maxNumberOfThreads = 2;
    private int sleepIntervalMS = 1000;
    private List<ScanHandlerBase> scanHandlers;
    private int maxThreadExecutionTimeMS = 300000;
    private int maxTotalExecutionTimeMS = 600000;

    private transient Map<String, ScanHandlerBase> currentScanHandlers;
    private transient Map<String, Thread> currentThreads;

    private String dataCollectionGuid;
    private transient TerziOutputWriter outputConsumer;
    private boolean pushResultsToVulnIQ;

    public SecurityScanner(DataCollectionTarget target, OSInfo osInfo, int threadCount, boolean pushResultsToVulnIQ, TerziOutputWriter outputConsumer)
    {
        this.target = target;
        this.osInfo = osInfo;
        this.outputConsumer = outputConsumer;
        this.pushResultsToVulnIQ = pushResultsToVulnIQ;
        this.maxNumberOfThreads = threadCount;
        this.currentThreads = new ConcurrentHashMap<>(maxNumberOfThreads);
        this.currentScanHandlers = new ConcurrentHashMap<>(maxNumberOfThreads);
        this.scanHandlers = new LinkedList<>();
    }

    /**
     * prepareToScan MUST be called before the scan is started
     * calling scan without before calling this first will fail
     * @param softwareList
     */
    public void prepareToScan(List<InstalledSoftware> softwareList)
    {
        this.installedSoftwares = softwareList;
    }

    /**
     * prepareToScan MUST be called before the scan is started
     * calling scan without before calling this first will fail
     * @param softwareFilterRegex if not null only packages that match this regex will be processed
     * @return
     */
    public boolean prepareToScan(String softwareFilterRegex)
    {
        List<InstalledSoftware> foundSoftwareList = InstalledSoftwareCollector.getInstalledSoftware(this.target, this.osInfo);
        if(foundSoftwareList==null)
        {
            logger.warn("SecurityScanner.scan InstalledSoftwareCollector.getInstalledSoftware(" + this.target+ ","+ this.osInfo +") returned null");
            errors.add("Failed to list installed software");
            return false;
        }
        if(softwareFilterRegex!=null)
        {
            //filter out software that does not match the given regex
            Pattern pattern = Pattern.compile(softwareFilterRegex);
            ListIterator<InstalledSoftware> iterator = foundSoftwareList.listIterator();
            while(iterator.hasNext())
            {
                InstalledSoftware tmpSoftware = iterator.next();
                if(!pattern.matcher(tmpSoftware.getName()).matches())
                {
                    iterator.remove();
                }
            }
        }
        this.installedSoftwares = foundSoftwareList;
        return true;
    }

    /**
     * - first scan the OS itself (windows only for now)
     * - get list of installed software
     * - foreach software start a ScanHandler thread
     * -
     * @return
     */
    public boolean scan(String dataCollectionGuidFromAPIResponse)
    {
        long scanStartTime = System.currentTimeMillis();
        this.dataCollectionGuid = dataCollectionGuidFromAPIResponse;
        //run scan for the OS itself
        if(osInfo.getOsType()== OSInfo.OSType.Windows)
        {
            scanWindowsOS();
        }
        Iterator<InstalledSoftware> installedSoftwareIterator = installedSoftwares.iterator();
        //while there are still things to process and total execution time has not been exceeded
        while(true && installedSoftwareIterator.hasNext() && ((System.currentTimeMillis()-scanStartTime)<maxTotalExecutionTimeMS))
        {
            //first manage threads. kill the ones that exceed the timeout
            try
            {
                for (String threadName : currentScanHandlers.keySet())
                {
                    ScanHandlerBase handler = currentScanHandlers.get(threadName);
                    if (handler != null)
                    {
                        logger.debug("SecurityScanner.scan: ScanHandler= " + handler);
                        long startTime = handler.getStartTimestampMillis();
                        long now = System.currentTimeMillis();
                        if ((now - startTime) > maxThreadExecutionTimeMS)
                        {
                            logger.info("Killing ScanHandler because it has exceeded the timeout: software='"
                                    + handler.getDisplayName() +
                                    "' threadName='" +handler.getThreadName()+ "'");
                            errors.add("Scan thread '"+handler.getThreadName()+"' terminated due to a timeout");
                            //expired. remove
                            stopScanThread(threadName);
                        }
                    }
                }
            }
            catch (Exception ex)
            {
                logger.error("Error in SecurityScanner.scan", ex);
                errors.add("Unexpected error while managing scan threads: " + ex.getMessage() + " (Feel free to pen a support ticket if the error persists)");
            }
            //start scan thread
            while(installedSoftwareIterator.hasNext() && currentThreads.size()<maxNumberOfThreads)
            {
                InstalledSoftware software = installedSoftwareIterator.next();
                //set a user friendly thread name
                String newThreadName = TerziConfiguration.getThreadNamePrefix() + "-scan-" + System.currentTimeMillis() +
                        StringUtils.convertToAlnumUnderscore(software.getName() +" "+ software.getVersion() );
                InstalledSoftwareScanHandler scanHandler = new InstalledSoftwareScanHandler(this, newThreadName, software, osInfo, this.target);
                scanHandlers.add(scanHandler);
                Thread newScanThread = new Thread(scanHandler, newThreadName);
                currentThreads.put(newThreadName, newScanThread);
                currentScanHandlers.put(newThreadName, scanHandler);
                newScanThread.start();
                logger.info("SecurityScanner.scan started thread '" + newThreadName + "' to process " + software.getName());
                outputConsumer.printInfoMessage("Starting to process: '" + software.getName() + "'");
            }

            try
            {
                Thread.sleep(getSleepIntervalMS());
            }
            catch(Exception ex)
            {
                logger.error("SecurityScanner.scan thread was interrupted", ex);
                errors.add("Scan thread was interrupted: " + ex.getMessage());
                break;
            }
        }   //while

        //we started threads for all installed software.
        //wait for running threads
        while(currentThreads.size()>0)
        {
            if((System.currentTimeMillis()-scanStartTime)>maxTotalExecutionTimeMS)
            {
                logger.error("SecurityScanner.scan timed out, stopping all running threads");
                outputConsumer.printInfoMessage("Scan timed out, stopping all running scan threads");
                for(Thread t : currentThreads.values())
                {
                    t.interrupt();
                }
                break;
            }
            try
            {
                Thread.sleep(getSleepIntervalMS());
            }
            catch(Exception ex)
            {
                logger.error("SecurityScanner.scan thread was interrupted while waiting for pending scan handler threads", ex);
                errors.add("Interrupted while waiting for threads to finish: " + ex.getMessage());
                break;
            }
        }

        return true;
    }

    public void scanWindowsOS()
    {
        String osScanThreadName = TerziConfiguration.getThreadNamePrefix() + "-scan-OS-" + System.currentTimeMillis();
        OSScanHandler osScanHandler = new OSScanHandler(this, osScanThreadName, osInfo, target);
        scanHandlers.add(osScanHandler);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future future = executor.submit(osScanHandler);
        try
        {
            future.get(maxTotalExecutionTimeMS, TimeUnit.MILLISECONDS);
        }
        catch (TimeoutException e)
        {
            future.cancel(true);
            logger.warn("scanWindowsOS timedout. maxTotalExecutionTimeMS=" + maxTotalExecutionTimeMS);
        }
        catch (Exception e)
        {
            logger.error("scanWindowsOS unexpected error", e);
        }
        finally
        {
            executor.shutdownNow();
        }
    }

    public int getSleepIntervalMS()
    {
        return sleepIntervalMS;
    }

    public void setSleepIntervalMS(int sleepIntervalMS)
    {
        this.sleepIntervalMS = sleepIntervalMS;
    }

    /**
     * stop a scan thread
     * @param threadName
     */
    public void stopScanThread(String threadName)
    {
        Thread thread = currentThreads.get(threadName);
        logger.debug("stopScanThread called for: '" + threadName +"' threadState=" + thread.getState());

        switch(thread.getState())
        {
            case RUNNABLE:
            case NEW:
            case BLOCKED:
            case TIMED_WAITING:
            case WAITING:
                thread.interrupt();
                break;
            case TERMINATED:
                //already terminated
                break;
        }
        this.currentThreads.remove(threadName);
        this.currentScanHandlers.remove(threadName);
    }

    /**
     * Called when a scan handler thread is finished
     * @param scanHandler
     * @param threadName
     */
    public synchronized void scanHandlerFinishedCallback(ScanHandlerBase scanHandler, String threadName)
    {
        currentThreads.remove(threadName);
        currentScanHandlers.remove(threadName);

        if(scanHandler instanceof InstalledSoftwareScanHandler)
        {
            scanHandlerFinishedCallbackInstalledSoftware((InstalledSoftwareScanHandler)scanHandler, threadName);
        }
        else if(scanHandler instanceof OSScanHandler)
        {
            scanHandlerFinishedCallbackOS((OSScanHandler) scanHandler, threadName);
        }

        if(scanHandler.getFindings()!=null && !scanHandler.getFindings().isEmpty())
        {
            for(ScanFinding finding : scanHandler.getFindings())
            {
                outputConsumer.printScanFindingSummary(finding);
            }
        }
        //push results to VulnIQ server
        if(this.dataCollectionGuid!=null && pushResultsToVulnIQ)
        {
            ResultsToVulnIQPusher.addResultToScan(dataCollectionGuid, scanHandler, this.outputConsumer);
        }
    }

    private synchronized void scanHandlerFinishedCallbackInstalledSoftware(InstalledSoftwareScanHandler scanHandler, String threadName)
    {
        logger.info("ScanHandler finished for threadName='" +scanHandler.getThreadName()+ "' " +
                "software='" +
                scanHandler.getInstalledSoftware().getName() + " " + scanHandler.getInstalledSoftware().getVersion() +
                "'");
        outputConsumer.printInfoMessage("Finished processing: '" +
                scanHandler.getInstalledSoftware().getName() +"' '"+ scanHandler.getInstalledSoftware().getVersion() +
                "' " + "Scan Status: " + "'" + scanHandler.getStatus() + "' " + scanHandler.getStatusDescription());
    }

    private synchronized void scanHandlerFinishedCallbackOS(OSScanHandler scanHandler, String threadName)
    {
        logger.info("OSScanHandler finished for threadName='" +scanHandler.getThreadName()+ "' " +
                "Operating System='" +
                scanHandler.getOsInfo().getDisplayName() + " " + scanHandler.getOsInfo().getDisplayVersion() +
                "'");
        outputConsumer.printInfoMessage("Finished processing operating system: '" +
                scanHandler.getOsInfo().getDisplayName() + " " + scanHandler.getOsInfo().getDisplayVersion() +
                "' " + scanHandler.getStatus() + " " + scanHandler.getStatusDescription());
    }



    public List<ScanHandlerBase> getResults()
    {
        return scanHandlers;
    }

    public OSInfo getOsInfo()
    {
        return osInfo;
    }

    public List<InstalledSoftware> getInstalledSoftwares()
    {
        return installedSoftwares;
    }
}
