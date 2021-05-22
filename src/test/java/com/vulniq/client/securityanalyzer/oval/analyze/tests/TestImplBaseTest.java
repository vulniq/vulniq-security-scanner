

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

import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoTest;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;

import static org.junit.Assert.*;

public class TestImplBaseTest
{

    //TODO fix or remove
    public void getResult()
    {
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "simple-secure-apache");
        OSInfo osInfo = OSInfoCollector.getOSInfo(target);
        OVALInterpreter interpreter = new OVALInterpreter("cisoval", target, osInfo);
        DpkginfoTest test = (DpkginfoTest) OVALXMLLoader.loadTest("cisoval", "oval:org.cisecurity:tst:9465", osInfo.getDisplayVersion(), null);
        DpkginfoTestImpl dpkginfoTest = new DpkginfoTestImpl(interpreter, test);
        ResultEnumeration result = dpkginfoTest.getResult();
        System.out.println(result);
    }
}