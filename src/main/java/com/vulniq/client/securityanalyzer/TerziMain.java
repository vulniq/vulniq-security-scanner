

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

package com.vulniq.client.securityanalyzer;

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.main.InfoMain;
import com.vulniq.client.securityanalyzer.main.OVALMain;
import com.vulniq.client.securityanalyzer.main.ScanMain;
import com.vulniq.client.securityanalyzer.main.TerziOptions;
import com.vulniq.client.securityanalyzer.main.TerziOutputWriter;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is the main entry point to the application
 */
public class TerziMain
{
    public static Logger logger = LoggerFactory.getLogger(TerziMain.class);

    /**
     * for easier access while passing command line arguments to DataCollectionMetadata
     */
    public static String commandLineArgsDoNOTModify = null;

    public static void main(String[] args)
    {
        TerziOutputWriter outputWriter = new TerziOutputWriter(true, true);
        if(args!=null)
        {
            TerziMain.commandLineArgsDoNOTModify = String.join(" ", args);
        }
        String configFilePath = System.getProperty(TerziConfiguration.ENV_TERZI_CONFIGURATION_FILE);
        TerziConfiguration.loadConfigurationFile(configFilePath);
        TerziMain terziMain = new TerziMain();
        String action = System.getProperty(TerziConfiguration.ENV_TERZI_ACTION);
        if(action==null || action.isEmpty() || action.isBlank())
        {
            //error
            outputWriter.printErrorMessage("Unknown action. You MUST use one of the scripts under the bin folder to start the application." +
                    " Do NOT run the jar directly.");
            return;
        }
        /*
        " oval   : Executes an OVAL definition, test or object against the given target.\n" +
        " info   : Collects system info (OS, installed software etc)\n" +
        " scan   : Runs a full security scan\n"
        " agent  : Starts in agent mode, without inbound https listeners\n"
        " server : Starts the agent with https server enabled"
         */
        switch (action)
        {
            case "oval":
                terziMain.ovalMain(args);
                break;
            case "info":
                terziMain.infoMain(args);
                break;
            case "scan":
                terziMain.scanMain(args);
                break;
            default:
                outputWriter.printErrorMessage("Unknown action '%s'. Please use one of the scripts under the bin folder to start the application.", action);
                break;
        }
        OSCommandUtils.shutdown();
    }

    private void scanMain(String[] args)
    {
        try
        {
            TerziOutputWriter outputWriter = new TerziOutputWriter(true, true);
            TerziOptions options = new TerziOptions(TerziOptions.MainClassType.SCAN, outputWriter);
            if(!options.parseCommandLine(args))
            {
                System.out.println(String.format("Invalid command line: %s", TerziMain.commandLineArgsDoNOTModify));
                return;
            }
            outputWriter.setOptions(options);
            ScanMain scanMain = new ScanMain(outputWriter);
            scanMain.run(options);
        }
        catch (Exception ex)
        {
            System.out.println("Unexpected error occured, cannot continue");
            logger.error("Unexpected error occured, cannot continue", ex);
            ex.printStackTrace();
        }
    }

    private void infoMain(String[] args)
    {
        TerziOutputWriter outputWriter = new TerziOutputWriter(true, true);
        try
        {
            TerziOptions options = new TerziOptions(TerziOptions.MainClassType.INFO, outputWriter);
            if(!options.parseCommandLine(args))
            {
                return;
            }
            InfoMain infoMain = new InfoMain(outputWriter);
            infoMain.run(options);
        }
        catch (Exception ex)
        {
            outputWriter.printErrorMessage("Error occured during system information collection. Program arguments: %s", ex, commandLineArgsDoNOTModify);
        }
    }

    private void ovalMain(String[] args)
    {
        TerziOutputWriter outputWriter = new TerziOutputWriter(true, true);
        try
        {
            TerziOptions options = new TerziOptions(TerziOptions.MainClassType.OVAL, outputWriter);
            if(!options.parseCommandLine(args))
            {
                return;
            }
            OVALMain ovalMain = new OVALMain(outputWriter);
            ovalMain.run(options);
        }
        catch (Exception ex)
        {
            outputWriter.printErrorMessage("Error occured during OVAL evaluation. Program arguments: %s", ex, commandLineArgsDoNOTModify);
        }
    }


}
