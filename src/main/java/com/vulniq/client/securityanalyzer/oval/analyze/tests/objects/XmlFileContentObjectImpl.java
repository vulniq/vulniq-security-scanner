
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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects;

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo.OSType;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.analyze.OperationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.xml.XMLFileContentProperties;
import com.vulniq.client.securityanalyzer.utils.XMLUtils;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windows.PowerShellFileSearchUtils;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.XmlfilecontentObject;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.XmlfilecontentState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * TODO add variable support
 */
public class XmlFileContentObjectImpl extends OVALObjectImplBase
{

    private static Logger logger = LoggerFactory.getLogger(XmlFileContentObjectImpl.class);
    private XmlfilecontentObject xmlFileContentObject;

    private boolean isFilepath;
    private boolean isRecursive;

    public XmlFileContentObjectImpl(OVALInterpreter interpreter, XmlfilecontentObject objectDefinition)
    {
        super(interpreter);
        this.timeout = 240000;
        this.xmlFileContentObject = objectDefinition;
    }

    public void checkFilepathOrPath()
    {
        if (xmlFileContentObject.getFilepath() == null)
        {
            isFilepath = false;
            return;
        }
        else if (xmlFileContentObject.getFilepath().getValue() == null)
        {
            isFilepath = false;
            return;
        }
        else if (xmlFileContentObject.getFilepath().getValue().toString().isEmpty() || xmlFileContentObject.getFilepath().getValue().toString().isBlank())
        {
            isFilepath = false;
            return;
        }
        else
        {
            isFilepath = true;
            isRecursive = false;
            return;
        }
    }

    public void checkRecursiveSearchEnabled()
    {
        if (xmlFileContentObject.getBehaviors() == null)
        {
            isRecursive = false;
            return;
        }
        if (xmlFileContentObject.getBehaviors().getRecurseDirection() == null)
        {
            isRecursive = false;
            return;
        }

        if ("none".equals(xmlFileContentObject.getBehaviors().getRecurseDirection()))
        {
            isRecursive = false;
            return;
        }
        else
        {
            isRecursive = true;
            return;
        }
    }

    public List<OSCommandOutput> locateFileMain(DataCollectionTarget dataCollectionTarget)
    {
        //TODO: can filepath include shell variables?

        checkRecursiveSearchEnabled();
        checkFilepathOrPath();
        List<OSCommandOutput> cmdOutList = new LinkedList<>();
        OSType osType = ovalInterpreter.getOsInfo().getOsType();

        if (osType == OSInfo.OSType.Windows)
        {
            logger.debug("locateFileMain running powershell file search on windows");
            PowerShellFileSearchUtils psSearchUtils = new PowerShellFileSearchUtils(dataCollectionTarget, xmlFileContentObject);
            OSCommandOutput cmdOut = psSearchUtils.executeSearchCommand();
            cmdOutList.add(cmdOut);
            return cmdOutList;
        }
        else
        {
            switch (dataCollectionTarget.getTargetType())
            {
                case Docker:
                    if (this.isFilepath)
                    {
                        if (xmlFileContentObject.getFilepath().getOperation() == OperationEnumeration.PATTERN_MATCH)
                        {
                            cmdOutList = locateFilepathRegexDocker(xmlFileContentObject.getFilepath().getValue().toString(), dataCollectionTarget);
                        }
                        else
                        {
                            cmdOutList = locateFilepathSimpleDocker(xmlFileContentObject.getFilepath().getValue().toString(), dataCollectionTarget);

                        }
                    }
                    else
                    {
                        if (xmlFileContentObject.getPath().getOperation() == OperationEnumeration.PATTERN_MATCH)// If the path is a regex then no recursive behavior and similar to filepath
                        {
                            String filename = xmlFileContentObject.getFilename().getValue().toString();
                            String escapedFilename = StringUtils.escapeRegex(filename);
                            String path = xmlFileContentObject.getPath().getValue().toString();
                            
                            String filePath = path.substring(0, path.length() - 1) + "/" + escapedFilename + "$";

                            cmdOutList = locateFilepathRegexDocker(filePath, dataCollectionTarget);

                        }
                        else
                        {
                            if (xmlFileContentObject.getFilename().getOperation() == OperationEnumeration.PATTERN_MATCH)
                            {
                                cmdOutList = locateFilenameAndPathRegexDocker(xmlFileContentObject.getFilename().getValue().toString(), xmlFileContentObject.getPath().getValue().toString(), dataCollectionTarget);

                            }
                            else
                            {
                                cmdOutList = locateFilenameAndPathSimpleDocker(xmlFileContentObject.getFilename().getValue().toString(), xmlFileContentObject.getPath().getValue().toString(), dataCollectionTarget);
                            }
                        }

                    }
                    break;
                case Host:
                default:
                    if (this.isFilepath)
                    {
                        if (xmlFileContentObject.getFilepath().getOperation() == OperationEnumeration.PATTERN_MATCH)
                        {
                            cmdOutList = locateFilepathRegexHost(xmlFileContentObject.getFilepath().getValue().toString(), dataCollectionTarget);
                        }
                        else
                        {
                            cmdOutList = locateFilepathSimpleHost(xmlFileContentObject.getFilepath().getValue().toString(), dataCollectionTarget);
                        }
                    }
                    else
                    {
                        if (xmlFileContentObject.getPath().getOperation() == OperationEnumeration.PATTERN_MATCH) // If the path is a regex then no recursive behavior and similar to filepath
                        {
                            String filename = xmlFileContentObject.getFilename().getValue().toString();
                            String escapedFilename = StringUtils.escapeRegex(filename);
                            String path = xmlFileContentObject.getPath().getValue().toString();

                            String filePath = path.substring(0, path.length() - 1) + "/" + escapedFilename + "$";

                            cmdOutList = locateFilepathRegexHost(filePath, dataCollectionTarget);

                        }
                        else
                        {

                            if (xmlFileContentObject.getFilename().getOperation() == OperationEnumeration.PATTERN_MATCH)
                            {
                                cmdOutList = locateFilenameAndPathRegexHost(xmlFileContentObject.getFilename().getValue().toString(), xmlFileContentObject.getPath().getValue().toString(), dataCollectionTarget);
                            }
                            else
                            {
                                cmdOutList = locateFilenameAndPathSimpleHost(xmlFileContentObject.getFilename().getValue().toString(), xmlFileContentObject.getPath().getValue().toString(), dataCollectionTarget);
                            }
                        }
                    }
                    break;
            }
        }
        return cmdOutList;
    }

    public LinkedList<Document> processCmdOutputToDocument(List<OSCommandOutput> cmdOutList, ObjectCollectionResult objectCollectionResult)
    {
        String xmlFileAsString;
        Document xmlDocument = null;
        LinkedList<Document> xmlDocumentList = new LinkedList<>();

        for (OSCommandOutput cmdOut : cmdOutList)
        {

            if (cmdOut.isErrorOccured())
            {
                addFailedLog(cmdOut.getError());
                objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR);
                return null;
            }
            else if (cmdOut.isTimedOut())
            {
                addTimedOutLog(timeout);
                objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR);
                return null;
            }
            else
            {
                //exit code is not 0 if file not found
                if (cmdOut.getExitCode() != 0 && cmdOut.getStdOut().isBlank())
                {
                    logger.debug("processCmdOutputToDocument exitCode is non-zero ("+cmdOut.getExitCode()+"), returning DOES_NOT_EXIST");
                    objectCollectionResult.addItemCollectionStatus(StatusEnumeration.DOES_NOT_EXIST);
                }
                else
                {
                    xmlFileAsString = cmdOut.getStdOut().trim();
                    if(logger.isDebugEnabled())
                    {
                        logger.debug("XML file contents:" + xmlFileAsString);
                    }
                    if (xmlFileAsString != null)
                    {
                        objectCollectionResult.addItemCollectionStatus(StatusEnumeration.EXISTS);
                        try
                        {
                            DocumentBuilderFactory dbf = XMLUtils.getSafeDocumentBuilderFactory();
                            dbf.setNamespaceAware(true);//WHY?
                            DocumentBuilder documentBuilder = dbf.newDocumentBuilder();

                            String[] splittedCmdOut = cmdOut.getStdOut().split("<\\?xml version.*\\?>"); // TODO: Handle xml split in a better way
                            for (String tempString : splittedCmdOut)
                            {
                                if (tempString.isEmpty())
                                {
                                    continue;
                                }
                                xmlDocument = documentBuilder.parse(new InputSource(new StringReader(tempString)));
                                xmlDocument.getDocumentElement().normalize();
                                xmlDocumentList.add(xmlDocument);
                            }
                        }
                        catch (Exception ex)
                        {
                            logger.error("processCmdOutputToDocument error splitting and processing xmls", ex);
                            objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR);
                            return null;
                        }
                    }
                    else
                    {
                        logger.info("processCmdOutputToDocument XML file contents is null");
                        objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR);
                        return null;
                    }
                }
            }

        }
        return xmlDocumentList;
    }

    public String processXPathQuery(LinkedList<Document> xmlDocumentList)
    {
        String xpathQuery = xmlFileContentObject.getXpath().getValue().toString();
        LinkedList<String> resultString = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (Document xmlDocument : xmlDocumentList)
        {
            String result = XMLUtils.getXPathQueryResultTypeIndependentMerged(null, xpathQuery, xmlDocument, "|");

            sb.append(result);
            sb.append("|");
        }
        String rv = sb.toString();
        if(logger.isDebugEnabled())
        {
            logger.debug("processXPathQuery returning:" + rv);
        }
        return rv;
    }

    public XMLFileContentProperties processXMLFileContentToProperties(DataCollectionTarget dataCollectionTarget, ObjectCollectionResult objectCollectionResult)
    {
        List<OSCommandOutput> cmdOutList = locateFileMain(dataCollectionTarget);
        LinkedList<Document> xmlDocumentList = processCmdOutputToDocument(cmdOutList, objectCollectionResult);
        String xPathQueryResult = processXPathQuery(xmlDocumentList);

        XMLFileContentProperties rv = new XMLFileContentProperties();

        if (isFilepath)
        {
            rv.setFilePath(xmlFileContentObject.getFilepath());
        }
        else
        {
            rv.setFilename(xmlFileContentObject.getFilename());
            rv.setPath(xmlFileContentObject.getPath());
        }

        if (isRecursive)
        {
            rv.setBehaviors(xmlFileContentObject.getBehaviors());
        }
        rv.setXpath(xmlFileContentObject.getXpath());

        rv.setValueOf(xPathQueryResult);
        if(logger.isDebugEnabled())
        {
            logger.debug("processXMLFileContentToProperties returning:" + StringUtils.toJson(rv, false));
        }
        return rv;
    }

    @Override
    protected StatusEnumeration checkExistence(DataCollectionTarget dataCollectionTarget)
    {
        return StatusEnumeration.NOT_COLLECTED;
    }

    @Override
    protected ObjectCollectionResult collectValues(DataCollectionTarget dataCollectionTarget)
    {
        ObjectCollectionResult objectCollectionResult = new ObjectCollectionResult();

        XMLFileContentProperties xmlFileContentProperties = processXMLFileContentToProperties(dataCollectionTarget, objectCollectionResult);

        if (xmlFileContentProperties.getValueOf() != null)
        {
            if (!xmlFileContentProperties.getValueOf().isEmpty() && !xmlFileContentProperties.getValueOf().isBlank())
            {
                objectCollectionResult.addCollectedValue(xmlFileContentProperties, StatusEnumeration.EXISTS);

            }
            else
            {
                objectCollectionResult.addItemCollectionStatus(StatusEnumeration.DOES_NOT_EXIST);
            }
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("collectValues returning:" + StringUtils.toJson(objectCollectionResult, false));
        }
        return objectCollectionResult;
    }

    @Override
    protected List<ResultEnumeration> evaluateSingleValueVsState(Object individualCollectedValue, StateType stateType) throws Exception
    {
        XmlfilecontentState xmlfilecontentState = (XmlfilecontentState) stateType;

        XMLFileContentProperties collectedXmlFileContentProperties = (XMLFileContentProperties) (individualCollectedValue);
        List<ResultEnumeration> resultsToBeCombined = new LinkedList<>();
        ResultEnumeration resultForValueOf = ResultEnumeration.NOT_EVALUATED;

        if (xmlfilecontentState.getValueOf().getValue() != null)
        {
            if (xmlfilecontentState.getValueOf().getOperation() == OperationEnumeration.EQUALS || xmlfilecontentState.getValueOf().getOperation() == OperationEnumeration.NOT_EQUAL)
            {
                String collectedXPathQuery = collectedXmlFileContentProperties.getValueOf();

                String[] splittedXPathQuery = collectedXPathQuery.split("|");

                for (String index : splittedXPathQuery)
                {
                    if (!"|".equals(index))
                    {
                        resultForValueOf = OperationAnalyzer.applyOperation(
                                xmlfilecontentState.getValueOf().getOperation(),
                                xmlfilecontentState.getValueOf().getDatatype(),
                                xmlfilecontentState.getValueOf().getValue(),
                                index);
                        resultsToBeCombined.add(resultForValueOf);

                    }
                }
            }
            else
            {
                resultForValueOf = OperationAnalyzer.applyOperation(
                        xmlfilecontentState.getValueOf().getOperation(),
                        xmlfilecontentState.getValueOf().getDatatype(),
                        xmlfilecontentState.getValueOf().getValue(),
                        collectedXmlFileContentProperties.getValueOf());
            }

            resultsToBeCombined.add(resultForValueOf);
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("evaluateSingleValueVsState returning:" + resultsToBeCombined);
        }
        return resultsToBeCombined;
    }
    
    @Override
    public Map<String, List<String>> getCollectedItems()
    {
        return null;
    }
    
    @Override
    public String getId()
    {
        return xmlFileContentObject.getId();
    }

    @Override
    public Set getChildSet()
    {
        return xmlFileContentObject.getSet();
    }

    /**
     * Used when the xmlfilecontent_item is defined with a filepath and regular
     * expression and when the file is located inside docker container.
     */
    public List<OSCommandOutput> locateFilepathRegexDocker(String filePath, DataCollectionTarget dataCollectionTarget)
    {

        LinkedList<OSCommandOutput> cmdOutList = new LinkedList<>();

        OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                "find / -regextype 'posix-extended' -regex " +
                        OSCommandUtils.escapeShellArg(filePath, ovalInterpreter.getOsInfo()) + " -exec cat {} +");
        cmdOutList.add(cmdOut);
        return cmdOutList;
    }

    /**
     * Used when the xmlfilecontent_item is defined with a filepath and regular
     * expression and when the file is located inside host.
     */
    public List<OSCommandOutput> locateFilepathRegexHost(String filePath, DataCollectionTarget dataCollectionTarget)
    {
        LinkedList<OSCommandOutput> cmdOutList = new LinkedList<>();
        OSCommandOutput cmdOut = null;

        switch (ovalInterpreter.getOsInfo().getOsType())
        {
            case Mac:
                cmdOut = OSCommandUtils.runCommand(timeout, "find", "-E", "/", "-regex", filePath, "-exec", "cat", "{}", "+");
                break;

            case Linux: // TODO: Verify whether the below is true
                cmdOut = OSCommandUtils.runCommand(timeout, "find", "/", "-regex", filePath, "-exec", "cat", "{}", "+");
                break;

            case Windows: // TODO: Add support for Windows
                return null;

            case Unknown: //TODO: What to do OSInfo.OSType.Unknown == hostOSInfo.getOsType()
                return null;

        }
        cmdOutList.add(cmdOut);
        return cmdOutList;
    }

    /**
     * Used when the xmlfilecontent_item is defined with a filepath and when the
     * file is located inside docker container.
     */
    public List<OSCommandOutput> locateFilepathSimpleDocker(String filePath, DataCollectionTarget dataCollectionTarget)
    {
        LinkedList<OSCommandOutput> cmdOutList = new LinkedList<>();
        int lastSlashIndex = filePath.lastIndexOf("/");

        String path = filePath.substring(0, lastSlashIndex);
        String filename = filePath.substring(lastSlashIndex + 1);

        OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                "find " + OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -maxdepth 1 -name " +
                        OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");

        cmdOutList.add(cmdOut);
        return cmdOutList;
    }

    /**
     * Used when the xmlfilecontent_item is defined with a filepath and when the
     * file is located inside host.
     */
    public List<OSCommandOutput> locateFilepathSimpleHost(String filePath, DataCollectionTarget dataCollectionTarget)
    {
        OSCommandOutput cmdOut = null;
        LinkedList<OSCommandOutput> cmdOutList = new LinkedList<>();
        int lastSlashIndex = filePath.lastIndexOf("/");

        String path = filePath.substring(0, lastSlashIndex);
        String filename = filePath.substring(lastSlashIndex + 1);

        switch (ovalInterpreter.getOsInfo().getOsType())
        {
            case Mac:
            case Linux: //TODO: Verify below expression for Linux
                cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-maxdepth", "1", "-name", filename, "-exec", "cat", "{}", "+");
                break;

            case Windows: // TODO: Add support for Windows
                return null;

            case Unknown: //TODO: What to do OSInfo.OSType.Unknown == hostOSInfo.getOsType()
                return null;

        }
        cmdOutList.add(cmdOut);
        return cmdOutList;
    }

    /**
     * Used when the xmlfilecontent_item is defined with a filename & path and
     * optional recursive behaviour and when the file is located inside docker
     * container.
     *
     * @param filename
     * @param path
     * @param dataCollectionTarget
     * @return
     */
    public List<OSCommandOutput> locateFilenameAndPathSimpleDocker(String filename, String path, DataCollectionTarget dataCollectionTarget)
    {
        LinkedList<OSCommandOutput> cmdOutList = new LinkedList<>();
        OSCommandOutput cmdOut = null;

        if (isRecursive)
        {
            if ("up".equals(xmlFileContentObject.getBehaviors().getRecurseDirection()))
            {
                int depthSize = xmlFileContentObject.getBehaviors().getMaxDepth().intValue();
                String tempPath = path;
                if (depthSize < 0) // Negative depth means no limitation on recursive depth
                {
                    while (!"".equals(tempPath))
                    {
                        int lastSlashIndex = tempPath.lastIndexOf("/");
                        tempPath = tempPath.substring(0, lastSlashIndex);
                        if ("".equals(tempPath))
                        {
                            break;
                        }
                        if (xmlFileContentObject.getFilename().getOperation() == OperationEnumeration.NOT_EQUAL)
                        {
                            cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                                    "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                                    "find " + OSCommandUtils.escapeShellArg(tempPath, ovalInterpreter.getOsInfo()) + " -maxdepth 1 ! -name " +
                                            OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");

                        }
                        else
                        {
                            cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                                    "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                                    "find " + OSCommandUtils.escapeShellArg(tempPath, ovalInterpreter.getOsInfo()) + " -maxdepth 1 -name " +
                                            OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");
                        }

                        cmdOutList.add(cmdOut);
                    }
                }
                else
                {
                    for (int index = 0; index < depthSize; index++)
                    {
                        int lastSlashIndex = tempPath.lastIndexOf("/");
                        tempPath = tempPath.substring(0, lastSlashIndex);

                        if (xmlFileContentObject.getFilename().getOperation() == OperationEnumeration.NOT_EQUAL)
                        {
                            cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                                    "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                                    "find " + OSCommandUtils.escapeShellArg(tempPath, ovalInterpreter.getOsInfo()) + " -maxdepth 1 ! -name " +
                                            OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");

                        }
                        else
                        {
                            cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                                    "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                                    "find " + OSCommandUtils.escapeShellArg(tempPath, ovalInterpreter.getOsInfo()) + " -maxdepth 1 -name " +
                                            OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");

                        }

                        cmdOutList.add(cmdOut);
                    }

                }

            }
            else if ("none".equals(xmlFileContentObject.getBehaviors().getRecurseDirection()))
            {
                if (xmlFileContentObject.getFilename().getOperation() == OperationEnumeration.NOT_EQUAL)
                {
                    cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                            "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                            "find " + OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -maxdepth 1 ! -name " +
                                    OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");

                }
                else
                {
                    cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                            "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                            "find " + OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -maxdepth 1 -name " +
                                    OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");

                }

                cmdOutList.add(cmdOut);
            }
            else // Down recurse direction into child directories
            {
                int depthSize = xmlFileContentObject.getBehaviors().getMaxDepth().intValue();

                if (depthSize < 0) //Negative depth means no limitation on recursive depth
                {
                    if (xmlFileContentObject.getFilename().getOperation() == OperationEnumeration.NOT_EQUAL)
                    {
                        cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                                "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                                "find " + OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " ! -name " +
                                        OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");

                    }
                    else
                    {
                        cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                                "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                                "find " + OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -name " +
                                        OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");

                    }

                    cmdOutList.add(cmdOut);

                }
                else
                {
                    depthSize++;
                    String depthSizeString = String.valueOf(depthSize);
                    if (xmlFileContentObject.getFilename().getOperation() == OperationEnumeration.NOT_EQUAL)
                    {
                        cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                                "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                                "find " + OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -maxdepth " + depthSizeString + " ! -name " +
                                        OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");

                    }
                    else
                    {
                        cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                                "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                                "find " + OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -maxdepth " + depthSizeString + " -name " +
                                        OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");

                    }

                    cmdOutList.add(cmdOut);
                }

            }
        }
        else // If the search is not recursive
        {
            if (xmlFileContentObject.getFilename().getOperation() == OperationEnumeration.NOT_EQUAL)
            {
                cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                        "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                        "find " + OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -maxdepth 1 ! -name " +
                                OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");

            }
            else
            {
                cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                        "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                        "find " + OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -maxdepth 1 -name " +
                                OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");

            }

            cmdOutList.add(cmdOut);
        }
        return cmdOutList;
    }

    /**
     * Used when the xmlfilecontent_item is defined with a filename & path and
     * optional recursive behaviour and when the file is located inside host.
     *
     * @param filename
     * @param path
     * @param dataCollectionTarget
     * @return
     */
    public List<OSCommandOutput> locateFilenameAndPathSimpleHost(String filename, String path, DataCollectionTarget dataCollectionTarget)
    {

        LinkedList<OSCommandOutput> cmdOutList = new LinkedList<>();
        OSCommandOutput cmdOut = null;

        switch (ovalInterpreter.getOsInfo().getOsType())
        {
            case Mac:
            case Linux:
                if (isRecursive)
                {
                    if ("up".equals(xmlFileContentObject.getBehaviors().getRecurseDirection()))
                    {
                        int depthSize = xmlFileContentObject.getBehaviors().getMaxDepth().intValue();
                        String tempPath = path;
                        if (depthSize < 0) // Negative depth means no limitation on recursive depth
                        {
                            while (!"".equals(tempPath))
                            {
                                int lastSlashIndex = tempPath.lastIndexOf("/");
                                tempPath = tempPath.substring(0, lastSlashIndex);
                                if ("".equals(tempPath))
                                {
                                    break;
                                }

                                if (xmlFileContentObject.getFilename().getOperation() == OperationEnumeration.NOT_EQUAL)
                                {
                                    cmdOut = OSCommandUtils.runCommand(timeout, "find", tempPath, "-maxdepth", "1", "!", "-name", filename, "-exec", "cat", "{}", "+");

                                }
                                else
                                {
                                    cmdOut = OSCommandUtils.runCommand(timeout, "find", tempPath, "-maxdepth", "1", "-name", filename, "-exec", "cat", "{}", "+");

                                }

                                cmdOutList.add(cmdOut);

                            }
                        }
                        else // When maxdepth > 0
                        {
                            for (int index = 0; index < depthSize; index++)
                            {
                                int lastSlashIndex = tempPath.lastIndexOf("/");
                                tempPath = tempPath.substring(0, lastSlashIndex);

                                if (xmlFileContentObject.getFilename().getOperation() == OperationEnumeration.NOT_EQUAL)
                                {
                                    cmdOut = OSCommandUtils.runCommand(timeout, "find", tempPath, "-maxdepth", "1", "!", "-name", filename, "-exec", "cat", "{}", "+");

                                }
                                else
                                {
                                    cmdOut = OSCommandUtils.runCommand(timeout, "find", tempPath, "-maxdepth", "1", "-name", filename, "-exec", "cat", "{}", "+");

                                }

                                cmdOutList.add(cmdOut);
                            }

                        }

                    }
                    else if ("none".equals(xmlFileContentObject.getBehaviors().getRecurseDirection()))
                    {
                        if (xmlFileContentObject.getFilename().getOperation() == OperationEnumeration.NOT_EQUAL)
                        {
                            cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-maxdepth", "1", "!", "-name", filename, "-exec", "cat", "{}", "+");

                        }
                        else
                        {
                            cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-maxdepth", "1", "-name", filename, "-exec", "cat", "{}", "+");

                        }

                        cmdOutList.add(cmdOut);
                    }
                    else // Down recurse direction into child directories
                    {
                        int depthSize = xmlFileContentObject.getBehaviors().getMaxDepth().intValue();

                        if (depthSize < 0) //Negative depth means no limitation on recursive depth
                        {
                            if (xmlFileContentObject.getFilename().getOperation() == OperationEnumeration.NOT_EQUAL)
                            {
                                cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "!", "-name", filename, "-exec", "cat", "{}", "+");

                            }
                            else
                            {
                                cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-name", filename, "-exec", "cat", "{}", "+");

                            }

                            cmdOutList.add(cmdOut);

                        }
                        else
                        {
                            depthSize++; // Depthsize in OVAL definitions and find command arguments is not the same.
                            String depthSizeString = String.valueOf(depthSize);
                            if (xmlFileContentObject.getFilename().getOperation() == OperationEnumeration.NOT_EQUAL)
                            {
                                cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-maxdepth", depthSizeString, "!", "-name", filename, "-exec", "cat", "{}", "+");

                            }
                            else
                            {
                                cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-maxdepth", depthSizeString, "-name", filename, "-exec", "cat", "{}", "+");

                            }

                            cmdOutList.add(cmdOut);
                        }

                    }
                }
                else // If the search is not recursive
                {
                    if (xmlFileContentObject.getFilename().getOperation() == OperationEnumeration.NOT_EQUAL)
                    {
                        cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-maxdepth", "1", "!", "-name", filename, "-exec", "cat", "{}", "+");

                    }
                    else
                    {
                        cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-maxdepth", "1", "-name", filename, "-exec", "cat", "{}", "+");

                    }

                    cmdOutList.add(cmdOut);
                }
                break;

            case Windows: // TODO: Add support for Windows
                return null;

            case Unknown: //TODO: What if OSInfo.OSType.Unknown == hostOSInfo.getOsType()
                return null;
        }
        return cmdOutList;
    }

    /**
     * Used when the xmlfilecontent_item is defined with a regex filename & path
     * and optional recursive behaviour and when the file is located inside
     * docker container.
     *
     * @param filename
     * @param path
     * @param dataCollectionTarget
     * @return
     */
    public List<OSCommandOutput> locateFilenameAndPathRegexDocker(String filename, String path, DataCollectionTarget dataCollectionTarget)
    {
        LinkedList<OSCommandOutput> cmdOutList = new LinkedList<>();
        OSCommandOutput cmdOut = null;

        filename = ".*/" + filename;

        if (isRecursive)
        {
            if ("up".equals(xmlFileContentObject.getBehaviors().getRecurseDirection()))
            {
                int depthSize = xmlFileContentObject.getBehaviors().getMaxDepth().intValue();
                String tempPath = path;
                if (depthSize < 0) // Negative depth means no limitation on recursive depth
                {
                    while (!"".equals(tempPath))
                    {
                        int lastSlashIndex = tempPath.lastIndexOf("/");
                        tempPath = tempPath.substring(0, lastSlashIndex);
                        if ("".equals(tempPath))
                        {
                            break;
                        }
                        cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                                "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                                "find " + OSCommandUtils.escapeShellArg(tempPath, ovalInterpreter.getOsInfo()) + " -maxdepth 1 -regextype 'posix-extended' -regex " +
                                        OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");
                        cmdOutList.add(cmdOut);

                    }
                }
                else
                {
                    for (int index = 0; index < depthSize; index++)
                    {
                        int lastSlashIndex = tempPath.lastIndexOf("/");
                        tempPath = tempPath.substring(0, lastSlashIndex);

                        cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                                "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                                "find " + OSCommandUtils.escapeShellArg(tempPath, ovalInterpreter.getOsInfo()) + " -maxdepth 1 -regextype 'posix-extended' -regex " +
                                        OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");
                        cmdOutList.add(cmdOut);
                    }

                }

            }
            else if ("none".equals(xmlFileContentObject.getBehaviors().getRecurseDirection()))
            {
                cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                        "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                        "find " + OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -maxdepth 1 -regextype 'posix-extended' -regex " +
                                OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");
                cmdOutList.add(cmdOut);
            }
            else // Down recurse direction into child directories
            {
                int depthSize = xmlFileContentObject.getBehaviors().getMaxDepth().intValue();

                if (depthSize < 0) //Negative depth means no limitation on recursive depth
                {
                    cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                            "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c", "find " +
                                    OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -regextype 'posix-extended' -regex " +
                                    OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");
                    cmdOutList.add(cmdOut);

                }
                else
                {
                    depthSize++;
                    String depthSizeString = String.valueOf(depthSize);
                    cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                            "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c", "find " +
                                    OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -maxdepth " + depthSizeString + " -regextype 'posix-extended' -regex " +
                                    OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");

                    cmdOutList.add(cmdOut);
                }

            }
        }
        else // If the search is not recursive
        {
            cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                    "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c", "find " +
                            OSCommandUtils.escapeShellArg(path, ovalInterpreter.getOsInfo()) + " -maxdepth 1 -regextype 'posix-extended' -regex " +
                            OSCommandUtils.escapeShellArg(filename, ovalInterpreter.getOsInfo()) + " -exec cat {} +");
            cmdOutList.add(cmdOut);
        }
        return cmdOutList;
    }

    /**
     * Used when the xmlfilecontent_item is defined with a filename & path and
     * optional recursive behaviour and when the file is located inside host.
     *
     * @param filename
     * @param path
     * @param dataCollectionTarget
     * @return
     */
    public List<OSCommandOutput> locateFilenameAndPathRegexHost(String filename, String path, DataCollectionTarget dataCollectionTarget)
    {

        filename = ".*/" + filename;
        LinkedList<OSCommandOutput> cmdOutList = new LinkedList<>();
        OSCommandOutput cmdOut = null;

        switch (ovalInterpreter.getOsInfo().getOsType())
        {
            case Mac:

                if (isRecursive)
                {
                    if ("up".equals(xmlFileContentObject.getBehaviors().getRecurseDirection()))
                    {
                        int depthSize = xmlFileContentObject.getBehaviors().getMaxDepth().intValue();
                        String tempPath = path;
                        if (depthSize < 0) // Negative depth means no limitation on recursive depth
                        {
                            while (!"".equals(tempPath))
                            {
                                int lastSlashIndex = tempPath.lastIndexOf("/");
                                tempPath = tempPath.substring(0, lastSlashIndex);
                                if ("".equals(tempPath))
                                {
                                    break;
                                }

                                cmdOut = OSCommandUtils.runCommand(timeout, "find", "-E", tempPath, "-maxdepth", "1", "-regex", filename, "-exec", "cat", "{}", "+");
                                cmdOutList.add(cmdOut);

                            }
                        }
                        else // When maxdepth > 0
                        {
                            for (int index = 0; index < depthSize; index++)
                            {
                                int lastSlashIndex = tempPath.lastIndexOf("/");
                                tempPath = tempPath.substring(0, lastSlashIndex);

                                cmdOut = OSCommandUtils.runCommand(timeout, "find", "-E", tempPath, "-maxdepth", "1", "-regex", filename, "-exec", "cat", "{}", "+");
                                cmdOutList.add(cmdOut);
                            }

                        }

                    }
                    else if ("none".equals(xmlFileContentObject.getBehaviors().getRecurseDirection()))
                    {
                        cmdOut = OSCommandUtils.runCommand(timeout, "find", "-E", path, "-maxdepth", "1", "-regex", filename, "-exec", "cat", "{}", "+");
                        cmdOutList.add(cmdOut);
                    }
                    else // Down recurse direction into child directories
                    {
                        int depthSize = xmlFileContentObject.getBehaviors().getMaxDepth().intValue();

                        if (depthSize < 0) //Negative depth means no limitation on recursive depth
                        {
                            cmdOut = OSCommandUtils.runCommand(timeout, "find", "-E", path, "-regex", filename, "-exec", "cat", "{}", "+");
                            cmdOutList.add(cmdOut);

                        }
                        else
                        {
                            depthSize++; // Depthsize in OVAL definitions and find command arguments is not the same.
                            String depthSizeString = String.valueOf(depthSize);
                            cmdOut = OSCommandUtils.runCommand(timeout, "find", "-E", path, "-maxdepth", depthSizeString, "-regex", filename, "-exec", "cat", "{}", "+");
                            cmdOutList.add(cmdOut);
                        }

                    }
                }
                else // If the search is not recursive
                {
                    cmdOut = OSCommandUtils.runCommand(timeout, "find", "-E", path, "-maxdepth", "1", "-regex", filename, "-exec", "cat", "{}", "+");
                    cmdOutList.add(cmdOut);
                }
                break;
            case Linux: //TODO: Verify whether below expressions work
                if (isRecursive)
                {
                    if ("up".equals(xmlFileContentObject.getBehaviors().getRecurseDirection()))
                    {
                        int depthSize = xmlFileContentObject.getBehaviors().getMaxDepth().intValue();
                        String tempPath = path;
                        if (depthSize < 0) // Negative depth means no limitation on recursive depth
                        {
                            while (!"".equals(tempPath))
                            {
                                int lastSlashIndex = tempPath.lastIndexOf("/");
                                tempPath = tempPath.substring(0, lastSlashIndex);
                                if ("".equals(tempPath))
                                {
                                    break;
                                }

                                cmdOut = OSCommandUtils.runCommand(timeout, "find", tempPath, "-maxdepth", "1", "-regex", filename, "-exec", "cat", "{}", "+");
                                cmdOutList.add(cmdOut);

                            }
                        }
                        else // When maxdepth > 0
                        {
                            for (int index = 0; index < depthSize; index++)
                            {
                                int lastSlashIndex = tempPath.lastIndexOf("/");
                                tempPath = tempPath.substring(0, lastSlashIndex);

                                cmdOut = OSCommandUtils.runCommand(timeout, "find", tempPath, "-maxdepth", "1", "-regex", filename, "-exec", "cat", "{}", "+");
                                cmdOutList.add(cmdOut);
                            }

                        }

                    }
                    else if ("none".equals(xmlFileContentObject.getBehaviors().getRecurseDirection()))
                    {
                        cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-maxdepth", "1", "-regex", filename, "-exec", "cat", "{}", "+");
                        cmdOutList.add(cmdOut);
                    }
                    else // Down recurse direction into child directories
                    {
                        int depthSize = xmlFileContentObject.getBehaviors().getMaxDepth().intValue();

                        if (depthSize < 0) //Negative depth means no limitation on recursive depth
                        {
                            cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-regex", filename, "-exec", "cat", "{}", "+");
                            cmdOutList.add(cmdOut);

                        }
                        else
                        {
                            depthSize++; // Depthsize in OVAL definitions and find command arguments is not the same.
                            String depthSizeString = String.valueOf(depthSize);
                            cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-maxdepth", depthSizeString, "-regex", filename, "-exec", "cat", "{}", "+");
                            cmdOutList.add(cmdOut);
                        }

                    }
                }
                else // If the search is not recursive
                {
                    cmdOut = OSCommandUtils.runCommand(timeout, "find", path, "-maxdepth", "1", "-regex", filename, "-exec", "cat", "{}", "+");
                    cmdOutList.add(cmdOut);
                }
                break;

            case Windows: // TODO: Add support for Windows
                return null;

            case Unknown: //TODO: What if OSInfo.OSType.Unknown == hostOSInfo.getOsType()
                return null;
        }
        return cmdOutList;
    }

}
