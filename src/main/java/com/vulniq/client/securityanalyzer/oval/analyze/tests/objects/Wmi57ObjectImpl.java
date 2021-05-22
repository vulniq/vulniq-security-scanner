
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

import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.analyze.CheckEnumerationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.OperationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windows.CollectedWmiInfo;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateFieldType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Wmi57Object;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Wmi57State;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemFieldType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wmi57ObjectImpl extends WmiObjectImpl
{

    private Wmi57Object objectDefinition;
    private static Logger logger = LoggerFactory.getLogger(Wmi57ObjectImpl.class);

    public Wmi57ObjectImpl(OVALInterpreter interpreter, Wmi57Object objectDefinition)
    {
        super(interpreter);
        namespace = objectDefinition.getNamespace().getValue().toString();
        wmiQuery = objectDefinition.getWql().getValue().toString();
        this.objectDefinition = objectDefinition;
        this.timeout = 8000;
    }

    @Override
    public String getId()
    {
        return this.objectDefinition.getId();
    }

    @Override
    protected List<ResultEnumeration> evaluateSingleValueVsState(Object individualCollectedValue, StateType stateType) throws Exception
    {
        CollectedWmiInfo collectedValue = (CollectedWmiInfo) individualCollectedValue;
        Wmi57State state = (Wmi57State) stateType;
        ArrayList<ResultEnumeration> rv = new ArrayList<>();

        ArrayList<ResultEnumeration> tempResults = new ArrayList<>();
        for (EntityStateFieldType stateField : state.getResult().getField())
        {
            for (EntityItemFieldType collectedField : collectedValue.getResults())
            {
                if (collectedField.getName().toLowerCase().equals(stateField.getName().toLowerCase()))
                {
                    ResultEnumeration resultOfValue = OperationAnalyzer.applyOperation(stateField.getOperation(), stateField.getDatatype(), stateField.getValue().toString(), collectedField.getValue().toString());
                    logger.debug("State = " + state.getId() + ", State Comment = " + state.getComment() + ", Object Property = '" + collectedField.getValue().toString() + "'"
                            + ", State Property = '" + stateField.getValue().toString() + "'"
                            + ", Result = '" + resultOfValue + "'");
                    tempResults.add(resultOfValue);
                }
            }
        }
        if (tempResults.isEmpty())
        {
            rv.add(ResultEnumeration.ERROR);
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                    "No collected property can be associated with WMI State.",
                    CollectionUtils.mapFromArgs("WMI Query: ", wmiQuery));
        }
        else
        {
            ResultEnumeration result = CheckEnumerationAnalyzer.evaluate(state.getResult().getEntityCheck(), tempResults);
            rv.add(result);
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("evaluateSingleValueVsState returning: " + rv);
        }
        return rv;
    }

    @Override
    public Set getChildSet()
    {
        return objectDefinition.getSet();
    }
}
