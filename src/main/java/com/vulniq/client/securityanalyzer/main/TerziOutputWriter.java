

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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vulniq.client.securityanalyzer.scan.InstalledSoftwareScanHandler;
import com.vulniq.client.securityanalyzer.scan.ScanHandlerBase;
import com.vulniq.client.securityanalyzer.scan.finding.ScanFinding;
import com.vulniq.client.securityanalyzer.utils.DateTimeUtils;
import org.apache.commons.text.WordUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;

public class TerziOutputWriter
{
    private Logger logger = LoggerFactory.getLogger(TerziOutputWriter.class);

    private boolean logToStdout = true;
    private boolean logViaLogger = true;
    private TerziOptions.OutputFormat outputFormat;
    private String outFilename;
    private Gson gson;


    public TerziOutputWriter(boolean logToStdout, boolean logViaLogger)
    {
        this.logToStdout = logToStdout;
        this.logViaLogger = logViaLogger;
        this.gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
    }

    public void setOptions(TerziOptions options)
    {
        this.outputFormat = options.getOutputFormat();
        this.outFilename = options.getOutputFileName();
    }

    public void printInfoMessage(String msg)
    {
        if(logToStdout)
        {
            System.out.println(msg);
        }
        if(logViaLogger)
        {
            logger.info(msg);
        }
    }

    public void printScanHandler(ScanHandlerBase scanHandler)
    {
        if(logToStdout)
        {
            System.out.println(scanHandler.getDisplayName());
            System.out.println("  Status  : " + scanHandler.getStatus());
            System.out.println("  Started : " + DateTimeUtils.formatDateTime(new Date(scanHandler.getStartTimestampMillis())));
            System.out.println("  Finished: " + DateTimeUtils.formatDateTime(new Date(scanHandler.getEndTimestampMillis())));
        }
        if(scanHandler.getFindings()!=null)
        {
            for(ScanFinding finding : scanHandler.getFindings())
            {
                printScanFindingSummary(finding);
            }
        }
    }

    public void printScanFindingSummary(ScanFinding finding)
    {
        if(logToStdout)
        {
            System.out.println("  - " + finding.getFindingType() + "\t" + finding.getScore()
                    + "\t" + finding.getVerificationStatus() + "\t" + finding.getTitle());
            if(finding.getVerificationStatus() != ScanFinding.VerificationStatus.Unverified)
            {
                System.out.println("    " + finding.getVerificationDescription());
            }
            System.out.println("    " + WordUtils.wrap(finding.getDescription(), 80, System.lineSeparator() + "    ", true));
        }
    }

    public void emptySeparator()
    {
        if(logToStdout)
        {
            System.out.println("");
        }
    }
    public void separatorLine()
    {
        if(logToStdout)
        {
            System.out.println("=========================================================");
        }
    }

    public void printErrorMessage(String msg, Throwable ex, String... msgFormatStrings)
    {
        if(msgFormatStrings!=null)
        {
            if(logToStdout)
            {
                System.out.println(String.format(msg, (Object) msgFormatStrings));
            }
            if(logViaLogger)
            {
                logger.error(String.format(msg, (Object) msgFormatStrings), ex);
            }
        }
        else
        {
            if(logToStdout)
            {
                System.out.println(msg);
            }
            if(logViaLogger)
            {
                logger.error(msg, ex);
            }
        }
        if(logToStdout)
        {
            if (ex != null)
            {
                ex.printStackTrace();
            }
        }
    }

    public void printErrorMessage(String msg, String... msgFormatStrings)
    {
        printErrorMessage(msg, null, msgFormatStrings);
    }

    public void beginSection(String msg, String... msgFormatStrings)
    {
        if(logToStdout)
        {
            separatorLine();
            if(msgFormatStrings!=null)
            {
                System.out.println(String.format(msg, (Object)msgFormatStrings));
            }
            else
            {
                System.out.println(msg);
            }
            separatorLine();
        }
    }

    public void endSection()
    {
        if(logToStdout)
        {
            separatorLine();
        }
    }

    public void printAsJson(Object objectToDump)
    {
        if(logToStdout)
        {
            System.out.println(gson.toJson(objectToDump));
        }
    }

    public void printResultObjectAsJson(Object collectedResultAsObject)
    {
        if(outFilename!=null && !outFilename.isEmpty())
        {
            try
            {
                File outfile = new File(outFilename);
                FileWriter fileWriter = new FileWriter(outfile);
                gson.toJson(collectedResultAsObject, fileWriter);
                fileWriter.close();
            }
            catch (Exception ex)
            {
                logger.error("Failed to write collected results to out file '"+outFilename+"'", ex);
                System.out.println("Failed to write collected results to out file '"+outFilename+"'. Error:" + ex.getMessage());
            }
        }
        else
        {
            gson.toJson(collectedResultAsObject, System.out);
        }
    }
}
