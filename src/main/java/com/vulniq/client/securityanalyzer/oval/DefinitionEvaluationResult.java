

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

package com.vulniq.client.securityanalyzer.oval;

import com.vulniq.client.securityanalyzer.logging.TerziLog;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.mitre.oval.xmlschema.oval_definitions_5.DefinitionType;
import org.mitre.oval.xmlschema.oval_definitions_5.ReferenceType;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;

import java.util.HashSet;
import java.util.Set;

public class DefinitionEvaluationResult
{
    private String ovalId;
    private String name;
    private String ovalClass;
    private ResultEnumeration result;
    private Set<String> cves;

    public DefinitionEvaluationResult(DefinitionType definitionType, ResultEnumeration evaluationResult)
    {
        this.result = evaluationResult;
        this.ovalId = definitionType.getId();
        this.ovalClass = definitionType.getClazz().value();

        this.cves = new HashSet<>();
        if(definitionType.getMetadata()!=null)
        {
            this.name = definitionType.getMetadata().getTitle();
            if(definitionType.getMetadata().getReference()!=null)
            {
                for (ReferenceType referenceType : definitionType.getMetadata().getReference())
                {
                    if ("Vulnerability".equalsIgnoreCase(referenceType.getSource()))
                    {
                        this.cves.add(referenceType.getRefId());
                    }
                }
            }
        }
    }

    public String getOvalId()
    {
        return ovalId;
    }

    public void setOvalId(String ovalId)
    {
        this.ovalId = ovalId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getOvalClass()
    {
        return ovalClass;
    }

    public void setOvalClass(String ovalClass)
    {
        this.ovalClass = ovalClass;
    }

    public ResultEnumeration getResult()
    {
        return result;
    }

    public void setResult(ResultEnumeration result)
    {
        this.result = result;
    }

    public Set<String> getCves()
    {
        return cves;
    }

    public void setCves(Set<String> cves)
    {
        this.cves = cves;
    }
/*
&lt;enumeration value="compliance"/>
 *     &lt;enumeration value="inventory"/>
 *     &lt;enumeration value="miscellaneous"/>
 *     &lt;enumeration value="patch"/>
 *     &lt;enumeration value="vulnerability"/>
 */
    public String getResultDescription()
    {
        switch (result)
        {
            case TRUE:
                if("vulnerability".equals(ovalClass))
                {
                    return "Target is 'Vulnerable'";
                }
                else if("patch".equals(ovalClass))
                {
                    return "Patch is 'Missing'";
                }
                else if("compliance".equals(ovalClass))
                {
                    return "Target is 'Compliant'";
                }
                else if("inventory".equals(ovalClass))
                {
                    return "Software is 'Installed'";
                }
                else if("miscellaneous".equals(ovalClass))
                {
                    return "This definition is classified as 'miscellaneous', see definition documentation for more detail on its purpose";
                }
                else
                {
                    TerziLog.supportCase("DefinitionEvaluationResult.getResultLabel.TRUE",
                            "Unexpected OVAL Class:" + ovalClass,
                            "This is not one of the values defined in OVAL specs, " +
                                    "or the definition OVAL version might be unsupported. OVAL item id=" + ovalId,
                            "Please report this issue to VulnIQ Support", null);
                    return "Unexpected OVAL Class:" + ovalClass;
                }
            case ERROR:
                return "An error occured, please review logs";
            case FALSE:
                if("vulnerability".equals(ovalClass))
                {
                    return "Target is 'Not Vulnerable'";
                }
                else if("patch".equals(ovalClass))
                {
                    return "'Not Applicable' for target";
                }
                else if("compliance".equals(ovalClass))
                {
                    return "Target is 'Not Compliant'";
                }
                else if("inventory".equals(ovalClass))
                {
                    return "Software is 'Not Installed'";
                }
                else if("miscellaneous".equals(ovalClass))
                {
                    return "This definition is classified as 'miscellaneous', see definition documentation for more detail on its purpose";
                }
                else
                {
                    TerziLog.supportCase("DefinitionEvaluationResult.getResultLabel.FALSE",
                            "Unexpected OVAL Class:" + ovalClass,
                            "This is not one of the values defined in OVAL specs, " +
                                    "or the definition OVAL version might be unsupported. OVAL item id=" + ovalId,
                            "Please report this issue to VulnIQ Support", null);
                    return "Unexpected OVAL Class:" + ovalClass;
                }
            case UNKNOWN:
                return "Unknown (indicates a problem, review logs)";
            case NOT_EVALUATED:
                return "Not Evaluated";
            case NOT_APPLICABLE:
                return "Not Applicable";
        }
        return String.valueOf(result);
    }
}
