
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
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.analyze.OperationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.error.UnsupportedOVALItemError;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.EntityStateFamilyType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FamilyObjectImpl extends OVALObjectImplBase
{
    private FamilyObject objectDefinition;
    private static final Logger logger = LoggerFactory.getLogger(FamilyObjectImpl.class);
    private final static HashMap<OSInfo.OSType, String> acceptedFamilies;
    
    static
    {
        acceptedFamilies= new HashMap<>();
        acceptedFamilies.put(OSInfo.OSType.Windows, "windows");
        acceptedFamilies.put(OSInfo.OSType.Linux, "unix");
        acceptedFamilies.put(OSInfo.OSType.Mac, "macos");
        acceptedFamilies.put(OSInfo.OSType.Unknown, "unknown");
    }
    
    public FamilyObjectImpl(OVALInterpreter interpreter, FamilyObject objectDefinition)
    {
        super(interpreter);
        this.objectDefinition = objectDefinition;
    }
    
    /**
     * Always returns StatusEnumeration.EXISTS since the OS always exists.
     * @param dataCollectionTarget
     * @return
     */
    @Override
    protected StatusEnumeration checkExistence(DataCollectionTarget dataCollectionTarget)
    {
        return StatusEnumeration.EXISTS;
    }
    
    /**
     * Always returns the before collected OSType and a collectionStatus of StatusEnumeration.EXISTS.
     * @param dataCollectionTarget
     * @return
     */
    @Override
    protected ObjectCollectionResult collectValues(DataCollectionTarget dataCollectionTarget)
    {
        ObjectCollectionResult collectionResult = new ObjectCollectionResult();
        OSInfo.OSType osType = ovalInterpreter.getOsInfo().getOsType();
        String family = acceptedFamilies.get(osType);
        collectionResult.addCollectedValue(family, StatusEnumeration.EXISTS);
        logger.debug("Collected item from the OVAL Object definition with Id: " + this.getId() + " family=" + family);
        return collectionResult;
    }
    
    @Override
    protected List<ResultEnumeration> evaluateSingleValueVsState(Object individualCollectedValue, StateType stateType) throws Exception
    {
        String objectFamily = (String) individualCollectedValue;
        FamilyState state = (FamilyState) stateType;
        EntityStateFamilyType stateFamily = state.getFamily();
        List<ResultEnumeration> results = new ArrayList<>();
        if(objectFamily == null || "unknown".equals(objectFamily))
        {
            throw new UnsupportedOVALItemError("Either Terzi does not support this OS or there was an error collecting OS information. Encountered while comparing OVAL State with ID: " + state.getId());
        }
        else
        {
            logger.debug("Started to compare the family of the system with OVAL State which has an ID of: " + state.getId() + ", with comment: " + state.getComment());
            ResultEnumeration result = OperationAnalyzer.applyOperation(stateFamily.getOperation(), stateFamily.getDatatype(), stateFamily.getValue().toString(), objectFamily);
            logger.debug("Object Property = '" + objectFamily + "'" + ", State Property = '" + stateFamily.getValue().toString() + "'" + ", Result = '" + result + "'");
            results.add(result);
            return results;
        }
    }
    
    @Override
    public Map<String, List<String>> getCollectedItems()
    {
        return null;
    }
    
    @Override
    public String getId()
    {
        return objectDefinition.getId();
    }

    @Override
    public Set getChildSet()
    {
        return null;
    }
}
