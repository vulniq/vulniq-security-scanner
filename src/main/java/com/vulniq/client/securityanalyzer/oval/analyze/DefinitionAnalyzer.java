

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

package com.vulniq.client.securityanalyzer.oval.analyze;

import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.error.UnsupportedOVALItemError;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import org.mitre.oval.xmlschema.oval_definitions_5.DefinitionType;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * analyze a single definition
 */
public class DefinitionAnalyzer
{
    private Logger logger = LoggerFactory.getLogger(DefinitionAnalyzer.class);

    private DefinitionType definition;
    private ResultEnumeration result;
    private CriteriaAnalyzer criteriaAnalyzer;
    private OVALInterpreter ovalInterpreter;
    private String definitionNameForLogs;

    public DefinitionAnalyzer(OVALInterpreter interpreter, DefinitionType deftype)
    {
        this.definition = deftype;
        this.definitionNameForLogs = "[" + this.definition.getMetadata().getTitle() + "]";
        this.ovalInterpreter = interpreter;
    }

    public void analyze()
    {
        logger.debug("DefinitionDefinitionAnalyzer.analyze definition.id=" + definition.getId() + this.definitionNameForLogs +"  begin");
        try
        {
            if (definition.getCriteria() == null)
            {
                logger.debug("Definition has no criteria");
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Definition, definition.getId(),
                        "Definition has no criteria. Setting result to NOT_EVALUATED", null);
                this.result = ResultEnumeration.NOT_EVALUATED;
            }
            else
            {
                this.result = analyzeCriteria();
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Definition, definition.getId(),
                        "Evaluated definition criteria", CollectionUtils.mapFromArgs("result", this.result));
            }
        }
        catch (UnsupportedOVALItemError ex)
        {
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Definition, definition.getId(),
                    "Unsupported OVAL Item", CollectionUtils.mapFromArgs("error", ex.getMessage()));
            logger.error("Unsupported OVAL item evaluating definition: " + definition.getId() + " " + definitionNameForLogs, ex);
        }
        catch (Exception ex)
        {
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Definition, definition.getId(),
                    "Unexpected error. See logs for details", CollectionUtils.mapFromArgs("error", ex.getMessage()));
            logger.error("Unexpected error evaluating definition: " + definition.getId() + " " + definitionNameForLogs, ex);
        }
    }

    public ResultEnumeration analyzeCriteria()
    {
        logger.debug("DefinitionDefinitionAnalyzer.analyzeCriteria definition.id=" + definition.getId() + " begin");
        criteriaAnalyzer = new CriteriaAnalyzer(ovalInterpreter, definition.getCriteria());
        ResultEnumeration criteriaResult = criteriaAnalyzer.getFinalResult();
        logger.debug("DefinitionDefinitionAnalyzer.analyzeCriteria definition.id=" + definition.getId() + " criteriaResult=" + criteriaResult);
        return criteriaResult;
    }

    public ResultEnumeration getResult()
    {
        return this.result;
    }
}
