
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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windows;

import java.util.ArrayList;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemFieldType;

public class CollectedWmiInfo
{
    private ArrayList<EntityItemFieldType> results;
    private String namespace;
    private String wql;

    public String getNamespace()
    {
        return namespace;
    }

    public void setNamespace(String namespace)
    {
        this.namespace = namespace;
    }

    public String getWql()
    {
        return wql;
    }

    public void setWql(String wql)
    {
        this.wql = wql;
    }

    public ArrayList<EntityItemFieldType> getResults()
    {
        if (results == null)
        {
            return new ArrayList<EntityItemFieldType>();
        }
        else
        {
            return results;
        }
    }

    public void setResults(ArrayList<EntityItemFieldType> results)
    {
        this.results = results;
    }

}
