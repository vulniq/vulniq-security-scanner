
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
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.analyze.OperationAnalyzer;
import com.vulniq.client.securityanalyzer.datacollection.unix.UnameProperties;
import com.vulniq.client.securityanalyzer.datacollection.unix.UnameRunner;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.UnameObject;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.UnameState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * The uname_state element defines the information about the hardware the
 * machine is running on.
 *
 */
public class UnameObjectImpl extends OVALObjectImplBase
{

    private static Logger logger = LoggerFactory.getLogger(UnameObjectImpl.class);

    private UnameObject unameObjectDefinition;

    public UnameObjectImpl(OVALInterpreter interpreter, UnameObject unameObjectDef)
    {
        super(interpreter);
        this.unameObjectDefinition = unameObjectDef;
    }



    /**
     * always returns StatusEnumeration.NOT_COLLECTED because actual existence
     * status is set in collectValue
     *
     * @param dataCollectionTarget
     * @return
     */
    @Override
    protected StatusEnumeration checkExistence(DataCollectionTarget dataCollectionTarget)
    {
        return StatusEnumeration.NOT_COLLECTED;
    }

    @Override
    protected ObjectCollectionResult collectValues(DataCollectionTarget dataCollectionTarget)
    {
        ObjectCollectionResult objectCollectionResult = new ObjectCollectionResult();

        List<OSCommandOutput> cmdOutList = UnameRunner.runUname(dataCollectionTarget, timeout);
        UnameProperties unameProperties = UnameRunner.convertCommandOutputsToUnameProperties(cmdOutList);

        if(unameProperties==null)
        {
            objectCollectionResult.addItemCollectionStatus(StatusEnumeration.ERROR);
        }
        else
        {
            objectCollectionResult.addCollectedValue(unameProperties, StatusEnumeration.EXISTS);
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("collectValues returning: " + StringUtils.toJson(objectCollectionResult, false));
        }
        return objectCollectionResult;
    }

    @Override
    public String getId()
    {
        return unameObjectDefinition.getId();
    }

    @Override
    public Set getChildSet()
    {
        return null;
    }


    @Override
    protected List<ResultEnumeration> evaluateSingleValueVsState(Object individualCollectedValue, StateType stateType) throws Exception
    {
        UnameState unameState = (UnameState) stateType;


        UnameProperties collectedProcessProperties = (UnameProperties)(individualCollectedValue);
        List<ResultEnumeration> resultsToBeCombined = new LinkedList<>();
        
        if(unameState.getMachineClass() != null)
        { 
            ResultEnumeration resultForMachineClass = OperationAnalyzer.applyOperation(
                    unameState.getMachineClass().getOperation(),
                    unameState.getMachineClass().getDatatype(),
                    unameState.getMachineClass().getValue(),
                    collectedProcessProperties.getMachineClass());
            resultsToBeCombined.add(resultForMachineClass);
        }
        if(unameState.getNodeName()!= null)
        { 
            ResultEnumeration resultForNodeName = OperationAnalyzer.applyOperation(
                    unameState.getNodeName().getOperation(),
                    unameState.getNodeName().getDatatype(),
                    unameState.getNodeName().getValue(),
                    collectedProcessProperties.getNodeName());
            resultsToBeCombined.add(resultForNodeName);
        }
        if(unameState.getOsName() != null)
        { 
            ResultEnumeration resultForOsName = OperationAnalyzer.applyOperation(
                    unameState.getOsName().getOperation(),
                    unameState.getOsName().getDatatype(),
                    unameState.getOsName().getValue(),
                    collectedProcessProperties.getMachineClass());
            resultsToBeCombined.add(resultForOsName);
        }
        if(unameState.getOsRelease() != null)
        { 
            ResultEnumeration resultForOsRelease = OperationAnalyzer.applyOperation(
                    unameState.getOsRelease().getOperation(),
                    unameState.getOsRelease().getDatatype(),
                    unameState.getOsRelease().getValue(),
                    collectedProcessProperties.getOsRelease());
            resultsToBeCombined.add(resultForOsRelease);
        }
        if(unameState.getOsVersion() != null)
        { 
            ResultEnumeration resultForOsVersion = OperationAnalyzer.applyOperation(
                    unameState.getOsVersion().getOperation(),
                    unameState.getOsVersion().getDatatype(),
                    unameState.getOsVersion().getValue(),
                    collectedProcessProperties.getOsVersion());
            resultsToBeCombined.add(resultForOsVersion);
        }
        if(unameState.getProcessorType() != null)
        { 
            ResultEnumeration resultForProcessorType = OperationAnalyzer.applyOperation(
                    unameState.getProcessorType().getOperation(),
                    unameState.getProcessorType().getDatatype(),
                    unameState.getProcessorType().getValue(),
                    collectedProcessProperties.getOsVersion());
            resultsToBeCombined.add(resultForProcessorType);
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("evaluateSingleValueVsState returning: " + resultsToBeCombined);
        }
        return resultsToBeCombined;
    }
    
    @Override
    public Map<String, List<String>> getCollectedItems()
    {
        return null;
    }
}
