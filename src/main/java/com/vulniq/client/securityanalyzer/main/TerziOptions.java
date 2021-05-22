

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
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.MissingOptionException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TerziOptions
{
    public static Logger logger = LoggerFactory.getLogger(TerziOptions.class);

    public enum MainClassType {OVAL, INFO, SCAN};
    public enum OutputFormat {TEXT, JSON};

    public static final String OPTION_TARGET = "t";
    public static final String OPTION_TARGET_LONG = "target";

    public static final String OPTION_TARGETNAME = "n";
    public static final String OPTION_TARGETNAME_LONG = "targetName";

    public static final String OPTION_OVALID = "o";
    public static final String OPTION_OVALID_LONG = "ovalId";

    public static final String OPTION_OVAL_FILEURL = "f";
    public static final String OPTION_OVAL_FILEURL_LONG = "ovalFile";

    public static final String OPTION_OVAL_DSGUID = "d";
    public static final String OPTION_OVAL_DSGUID_LONG = "dataSource";

    public static final String OPTION_OUTPUTFORMAT = "x";
    public static final String OPTION_OUTPUTFORMAT_LONG = "outputFormat";

    public static final String OPTION_OUTPUT_FILE = "w";
    public static final String OPTION_OUTPUT_FILE_LONG = "outputFile";

    public static final String OPTION_OVAL_VERBOSITY = "v";
    public static final String OPTION_OVAL_VERBOSITY_LONG = "verbosity";

    public static final String OPTION_PUSH_TO_VULNIQ = "p";
    public static final String OPTION_PUSH_TO_VULNIQ_LONG = "pushResults";

    public static final String OPTION_PUSH_TO_VULNIQ_MSG = "m";
    public static final String OPTION_PUSH_TO_VULNIQ_MSG_LONG = "pushMessage";

    public static final String OPTION_PACKAGE_FILTER = "q";
    public static final String OPTION_PACKAGE_FILTER_LONG = "packageFilter";


    private MainClassType mainClassType;
    private Options commandLineOptions = new Options();
    private CommandLine actualCommandLineParameters;

    private DataCollectionTarget dataCollectionTarget;
    private TerziOutputWriter outputConsumer;

    public TerziOptions(MainClassType mainType, TerziOutputWriter outputConsumer)
    {
        this.mainClassType = mainType;
        this.outputConsumer = outputConsumer;

        addOutputOptions();
        switch (mainType)
        {
            case INFO:
                addPushToEngineOptions();
                break;
            case OVAL:
                addOVALOptions();
                break;
            case SCAN:
                addPushToEngineOptions();
                addPackageFilterOptions();
                break;
        }
    }

    public DataCollectionTarget getDataCollectionTarget()
    {
        return dataCollectionTarget;
    }

    public String getOptionValue(String optionName)
    {
        String optionValue = actualCommandLineParameters.getOptionValue(optionName);
        return optionValue;
    }

    public boolean wasBooleanOptionProvided(String optionName)
    {
        boolean rv = actualCommandLineParameters.hasOption(optionName);
        return rv;
    }

    public void printHelp()
    {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("VulnIQ Security Scanner, Terzi", commandLineOptions);
    }

    public boolean parseCommandLine(String[] args)
    {
        addTargetOptions(true);

        actualCommandLineParameters = parseCommandLineOptions(commandLineOptions, args);
        if(actualCommandLineParameters ==null)
        {
            return false;
        }
        DataCollectionTargetType targetType = DataCollectionTargetType.fromString(actualCommandLineParameters.getOptionValue(OPTION_TARGET));
        if(targetType == DataCollectionTargetType.Host)
        {
            dataCollectionTarget = new DataCollectionTarget(targetType, "");
        }
        else
        {
            String targetName = actualCommandLineParameters.getOptionValue(OPTION_TARGETNAME);
            if(targetName==null || targetName.isBlank())
            {
                outputConsumer.printErrorMessage("Target name is required when target type is not Host");
                return false;
            }
            dataCollectionTarget = new DataCollectionTarget(targetType, targetName);
        }
        return true;
    }

    private CommandLine parseCommandLineOptions(Options commandLineOptions, String[] args)
    {
        try
        {
            CommandLineParser parser = new DefaultParser();
            CommandLine commandLine = parser.parse(commandLineOptions, args);
            return commandLine;
        }
        catch (MissingOptionException optEx)
        {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("VulnIQ Security Scanner, Terzi", commandLineOptions);
            outputConsumer.emptySeparator();
            outputConsumer.printInfoMessage("Missing required options:");
            for(Object missingOptionObj : optEx.getMissingOptions())
            {
                Option missingOption = commandLineOptions.getOption(String.valueOf(missingOptionObj));
                if(missingOption!=null)
                {
                    outputConsumer.printInfoMessage("  -" + missingOption.getOpt() + " or --" + missingOption.getLongOpt());
                }
            }
        }
        catch (Exception ex)
        {
            logger.error("parseCommandLineOptions: args=" + StringUtils.toJson(args, false), ex);
            outputConsumer.printErrorMessage("Error parsing command line options: %s", ex.getMessage());
        }
        return null;
    }

    private void addOutputOptions()
    {
        {
            Option ofOption = new Option(OPTION_OUTPUTFORMAT, OPTION_OUTPUTFORMAT_LONG, true,
                    "Output format. Allowed values are text,json. Defaults to text.");
            ofOption.setRequired(false);
            commandLineOptions.addOption(ofOption);
        }
        {
            Option ofOption = new Option(OPTION_OUTPUT_FILE, OPTION_OUTPUT_FILE_LONG, true,
                    "Output filename. Findings (not logs) will be written into this file.");
            ofOption.setRequired(false);
            commandLineOptions.addOption(ofOption);
        }
    }

    private void addPushToEngineOptions()
    {
        {
            Option option = new Option(OPTION_PUSH_TO_VULNIQ, OPTION_PUSH_TO_VULNIQ_LONG,false,
                    "Push collected results to VulnIQ server." +
                            " Collected system info or scan results will be pushed to the VulnIQ server.");
            option.setRequired(false);
            commandLineOptions.addOption(option);
        }
        {
            Option option = new Option(OPTION_PUSH_TO_VULNIQ_MSG, OPTION_PUSH_TO_VULNIQ_MSG_LONG, true,
                    "Push message, free format optional text message that will be attached to pushed data.");
            option.setRequired(false);
            commandLineOptions.addOption(option);
        }
    }

    private void addTargetOptions(boolean isTargetRequired)
    {
        {
            Option collectionTargetOption = new Option(OPTION_TARGET, OPTION_TARGET_LONG,true,
                    "Data collection target. Supported values are 'Docker', 'Host' (without the quotes)." +
                            " Defaults to 'Host' which means that the data will be collected from the current operating system.");
            collectionTargetOption.setRequired(isTargetRequired);
            commandLineOptions.addOption(collectionTargetOption);
        }
        {
            Option targetNameOption = new Option(OPTION_TARGETNAME, OPTION_TARGETNAME_LONG, true,
                    "Name of the data collection target. " +
                            "Used when target is 'Docker', name of the target container. The container MUST be running.");
            targetNameOption.setRequired(false);
            commandLineOptions.addOption(targetNameOption);
        }
    }

    private void addOVALOptions()
    {
        {
            Option ovalIdOption = new Option(OPTION_OVALID, OPTION_OVALID_LONG, true,
                    "OVAL id of a definition or test.");
            ovalIdOption.setRequired(false);
            commandLineOptions.addOption(ovalIdOption);
        }
        {
            Option ovalFileOption = new Option(OPTION_OVAL_FILEURL, OPTION_OVAL_FILEURL_LONG, true,
                    "Path or URL to a single OVAL oval_definitions file that contains all required definitions, tests, objects, states, variables." +
                            " Do not run OVAL definitions from untrusted sources!");
            ovalFileOption.setRequired(false);
            commandLineOptions.addOption(ovalFileOption);
        }
        {
            Option ovalIdOption = new Option(OPTION_OVAL_DSGUID, OPTION_OVAL_DSGUID_LONG, true,
                    "VulnIQ data source guid. Only needed if your VulnIQ instance contains" +
                            " items with the same id from different data sources (e.g definitions from Debian).");
            ovalIdOption.setRequired(false);
            commandLineOptions.addOption(ovalIdOption);
        }
        {
            Option verbosityOption = new Option(OPTION_OVAL_VERBOSITY, OPTION_OVAL_VERBOSITY_LONG, true,
                    "Verbosity. Allowed values are 0,1,2,3,4 where 0=None, 1=Error, 2=Warn, 3=Info, 4=Debug. " +
                            "0 means no OVAL evaluation logging and " +
                            "4 means full details of OVAL evaluations.");
            verbosityOption.setRequired(false);
            commandLineOptions.addOption(verbosityOption);
        }
    }

    private void addPackageFilterOptions()
    {
        {
            Option option = new Option(OPTION_PACKAGE_FILTER, OPTION_PACKAGE_FILTER_LONG,true,
                    "Regex for filtering processed package names." +
                            " If set, only package names matching this regex will be processed." +
                            " The expression MUST match the entire package name." +
                            " MUST be a valid java regular expression.");
            option.setRequired(false);
            commandLineOptions.addOption(option);
        }
    }

    public boolean isPushResultsToVulnIQ()
    {
        boolean isPushing = wasBooleanOptionProvided(OPTION_PUSH_TO_VULNIQ);
        return isPushing;
    }

    public OutputFormat getOutputFormat()
    {
        if(actualCommandLineParameters.hasOption(OPTION_OUTPUTFORMAT))
        {
            String optionValue = actualCommandLineParameters.getOptionValue(OPTION_OUTPUTFORMAT);
            if("json".equals(optionValue))
            {
                return OutputFormat.JSON;
            }
        }
        return OutputFormat.TEXT;
    }

    public String getOutputFileName()
    {
        if(actualCommandLineParameters.hasOption(OPTION_OUTPUT_FILE))
        {
            String optionValue = actualCommandLineParameters.getOptionValue(OPTION_OUTPUT_FILE);
            return optionValue;
        }
        return null;
    }

}
