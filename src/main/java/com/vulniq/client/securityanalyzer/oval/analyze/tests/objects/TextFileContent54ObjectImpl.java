

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

import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo.OSType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALUtils;
import com.vulniq.client.securityanalyzer.oval.analyze.CheckEnumerationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.OperationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.OperatorAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.filesearch.FileSearchUtils;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.textfilecontent54.TextFileContent54Item;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windows.PowerShellFileSearchUtils;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windowsfiletest.PowerShellFilePropertiesUtils;
import com.vulniq.client.securityanalyzer.oval.error.OSCommandTimedOutError;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Textfilecontent54Behaviors;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Textfilecontent54Object;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Textfilecontent54State;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TODO add variable support
 */
public class TextFileContent54ObjectImpl extends OVALObjectImplBase
{
    private Logger logger = LoggerFactory.getLogger(TextFileContent54ObjectImpl.class);
    private Textfilecontent54Object objectDefinition;
            
    public TextFileContent54ObjectImpl(OVALInterpreter interpreter, Textfilecontent54Object textfilecontent54Object)
    {
        super(interpreter);
        this.objectDefinition = textfilecontent54Object;
    }
    
    private String getFilePath(DataCollectionTarget target)
    {
        String pathSeparator;
        OSType osType = ovalInterpreter.getOsInfo().getOsType();
        if (osType == null)
        {
            osType = OSInfoCollector.getOSInfo(target).getOsType();
        }
        if (osType == OSType.Windows)
        {
            pathSeparator = "\\";
        }
        else
        {
            pathSeparator = "/";
        }
        String filePath = objectDefinition.getFilepath()!=null ?
                OVALUtils.getStringValue(objectDefinition.getFilepath()) :
                OVALUtils.getStringValue(objectDefinition.getPath()) + pathSeparator + OVALUtils.getStringValue(objectDefinition.getFilename());
        logger.debug("getFilePath returning " + filePath);
        return filePath;
    }

    /**
     * always returns StatusEnumeration.NOT_COLLECTED because actual existence status is set in collectValue
     *
     * @param dataCollectionTarget
     * @return
     */
    @Override
    protected StatusEnumeration checkExistence(DataCollectionTarget dataCollectionTarget)
    {
        return StatusEnumeration.NOT_COLLECTED;
    }

    /**
     * collected value is a List<String> containing the captured groups from the regex match
     * @return
     * 
     */
    @Override
    protected ObjectCollectionResult collectValues(DataCollectionTarget dataCollectionTarget)
    {
        ObjectCollectionResult rv = new ObjectCollectionResult();
        String fileContents = null;
        List<TextFileContent54Item> ovalItemList = new ArrayList<TextFileContent54Item>();
        OSType osType = ovalInterpreter.getOsInfo().getOsType();
        try
        {
            if (osType == OSInfo.OSType.Windows)
            {
                PowerShellFileSearchUtils fileUtils = new PowerShellFileSearchUtils(dataCollectionTarget, objectDefinition);
                String searchResults = fileUtils.getFileSearchResults();
                String[] paths = fileUtils.convertFileSearchResultsToAbsolutePath(searchResults);

                StringBuilder sb = new StringBuilder();
                for (String path : paths)
                {
                    String fileContent = PowerShellFilePropertiesUtils.getFileContent(dataCollectionTarget, path);
                    sb.append(fileContent);
                    sb.append("\n");
                }
                fileContents = sb.toString();
            }
            else
            {
                FileSearchUtils fileUtils = new FileSearchUtils(dataCollectionTarget, objectDefinition, ovalInterpreter);
                fileContents = fileUtils.getFileContents();
                //fileContents = FileUtils.getFileContents(dataCollectionTarget, filePath, TerziConfiguration.getCommandTimeoutDefaultMS());
            }
        }
        catch (FileNotFoundException ex)
        {
            logger.error("collectValues file not found", ex);
            addFailedLog(ex);
            rv.addItemCollectionStatus(StatusEnumeration.ERROR);
            return rv;
        }
        catch (OSCommandTimedOutError ex)
        {
            logger.error("collectValues OS command timed out", ex);
            addFailedLog(ex);
            rv.addItemCollectionStatus(StatusEnumeration.ERROR);
            return rv;
        }
        catch (Exception ex)
        {
            logger.error("collectValues unexpected error occured", ex);
            addFailedLog(ex);
            rv.addItemCollectionStatus(StatusEnumeration.ERROR);
            return rv;
        }

        if(fileContents!=null)
        {
            if (fileContents.isBlank())
            {
                logger.debug("collectValues fileContents is empty/blank, returning DOES_NOT_EXIST");
                rv.addItemCollectionStatus(StatusEnumeration.DOES_NOT_EXIST);
                return rv;
            }
            //operation is always pattern match
            String regexStr = OVALUtils.getStringValue(objectDefinition.getPattern());
            Pattern pattern = compilePatternWithObjectBehaviors(regexStr,objectDefinition); 

            int objectInstanceValue = OVALUtils.getIntValue(objectDefinition.getInstance(), 1);
            OperationEnumeration instanceOperation = objectDefinition.getInstance().getOperation();
            
            Matcher matcher = pattern.matcher(fileContents);
            int findCounter = 0;

            // If instance is defined with a negative value, it should be converted to a positive value and operation should be reversed.
            if (objectInstanceValue < 0)
            {
                int matchCount = 0;
                while (matcher.find())
                {
                    matchCount++;
                }
                objectInstanceValue = matchCount + 1 + objectInstanceValue;
                instanceOperation = reverseOperationEnum(instanceOperation);
                logger.debug("collectValues objectInstanceValue is negative, reversed the operation:" + instanceOperation);
                matcher.reset();
            }
            
            while (matcher.find()) 
            {
                findCounter++;
                try
                {
                    ResultEnumeration operationResult = OperationAnalyzer.applyOperationInt(instanceOperation, objectInstanceValue, findCounter);
                    if (operationResult == ResultEnumeration.TRUE)
                    {
                        TextFileContent54Item ovalItem = new TextFileContent54Item();
                        int groupCount = matcher.groupCount();
                        if (groupCount == 0)
                        {
                            ovalItem.setText(matcher.group(0));
                            ovalItemList.add(ovalItem);    
                        }
                        else
                        {
                            ovalItem.setText(matcher.group(0));
                            for (int i = 1; i <= matcher.groupCount(); i++) //note the less than or equals
                            {
                               ovalItem.getSubexpression().add(matcher.group(i));
                            }
                            ovalItemList.add(ovalItem);
                        }
                    }
                }
                catch (UnexpectedOVALEvaluationError ex)
                {
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                            "Unexpected OVAL Operation", CollectionUtils.mapFromArgs(instanceOperation, objectDefinition.getFilename()));
                }
            }
            if(ovalItemList.isEmpty())
            {
                rv.addItemCollectionStatus(StatusEnumeration.DOES_NOT_EXIST);
            }
            else
            {
                rv.addCollectedValue(ovalItemList, StatusEnumeration.EXISTS);
            }

        }
        else
        {
            rv.addItemCollectionStatus(StatusEnumeration.ERROR);
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("collectValues returning:" + StringUtils.toJson(rv, false));
        }
        return rv;
    }

    @Override
    public String getId()
    {
        return this.objectDefinition.getId();
    }

    @Override
    public Set getChildSet()
    {
        return objectDefinition.getSet();
    }

    /**
     *
     * @param individualCollectedValue this is a captured string
     * @param stateType this is a {@link org.mitre.oval.xmlschema.oval_definitions_5_independent.Textfilecontent54State}
     * @return
     * @throws Exception
     */
    @Override
    protected List<ResultEnumeration> evaluateSingleValueVsState(Object individualCollectedValue, StateType stateType) throws Exception
    {
        List<TextFileContent54Item> ovalItemList = (List<TextFileContent54Item>) individualCollectedValue;
        Textfilecontent54State state = (Textfilecontent54State) stateType;

        List<ResultEnumeration> resultsToBeCombined = new LinkedList<>();

        for (TextFileContent54Item ovalItem : ovalItemList)
        {
            List<ResultEnumeration> resultsForSingleOvalItem = new LinkedList<>();
            List<ResultEnumeration> resultsForSubexpressions = new LinkedList<>();
            if (state.getSubexpression() != null)
            {
                for (String collectedSubexpression : ovalItem.getSubexpression())
                {
                    String subexpression = String.valueOf(state.getSubexpression().getValue());
                    ResultEnumeration result = OperationAnalyzer.applyOperation(state.getSubexpression().getOperation(), state.getSubexpression().getDatatype(), subexpression, collectedSubexpression);
                    resultsForSubexpressions.add(result);
                }
                ResultEnumeration entityCheckResult = CheckEnumerationAnalyzer.evaluate(state.getSubexpression().getEntityCheck(), resultsForSubexpressions);
                resultsForSingleOvalItem.add(entityCheckResult);
            }
            if (state.getText() != null)
            {
                String text = String.valueOf(state.getText().getValue());
                ResultEnumeration result = OperationAnalyzer.applyOperation(state.getText().getOperation(), state.getText().getDatatype(), text, ovalItem.getText());
                resultsForSingleOvalItem.add(result);
            }
            ResultEnumeration resultForSingleOvalItem = OperatorAnalyzer.evaluate(state.getOperator(), resultsForSingleOvalItem);
            resultsToBeCombined.add(resultForSingleOvalItem);
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
    
    private Pattern compilePatternWithObjectBehaviors (String regex, Textfilecontent54Object ovalObject)
    {
        Textfilecontent54Behaviors behaviors = ovalObject.getBehaviors();
        int flags = 0;
        if(behaviors == null)
        {
            //TODO check if this is correct: xsd reads 'attribute name="multiline" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true"' for multiline hence the flag
            return Pattern.compile(regex, Pattern.MULTILINE);
        }
        if(behaviors.isMultiline())
        {
            flags = flags | Pattern.MULTILINE;
        }
        if(behaviors.isIgnoreCase())
        {
            flags = flags | Pattern.CASE_INSENSITIVE;
        }
        if (behaviors.isSingleline())
        {
            flags = flags | Pattern.DOTALL;
        }
        return Pattern.compile(regex,flags);
    }
    
    private OperationEnumeration reverseOperationEnum(OperationEnumeration operationEnum)
    {
        switch (operationEnum)
        {
            case GREATER_THAN:
                return OperationEnumeration.LESS_THAN;
            case GREATER_THAN_OR_EQUAL:
                return OperationEnumeration.LESS_THAN_OR_EQUAL;
            case LESS_THAN:
                return OperationEnumeration.GREATER_THAN;
            case LESS_THAN_OR_EQUAL:
                return OperationEnumeration.GREATER_THAN_OR_EQUAL;
            default:
                return operationEnum;        
        }
    }
}
