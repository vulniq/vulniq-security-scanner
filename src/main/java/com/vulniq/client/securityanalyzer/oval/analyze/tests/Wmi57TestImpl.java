
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

package com.vulniq.client.securityanalyzer.oval.analyze.tests;

import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import java.util.List;
import org.mitre.oval.xmlschema.oval_definitions_5.StateRefType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Wmi57Test;

/**
 *
 * 
 */
public class Wmi57TestImpl extends TestImplBase
{

    Wmi57Test testDefinition;

    public Wmi57TestImpl(OVALInterpreter interpreter, Wmi57Test wmi57Test)
    {
        super(interpreter, wmi57Test);
        this.testDefinition = wmi57Test;
    }

    @Override
    public String getObjectId()
    {
        return this.testDefinition.getObject().getObjectRef();
    }

    @Override
    public List<StateRefType> getStateRefs()
    {
        return this.testDefinition.getState();
    }
}