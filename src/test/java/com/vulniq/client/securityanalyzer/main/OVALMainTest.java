
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

package com.vulniq.client.securityanalyzer.main;

import com.vulniq.client.securityanalyzer.TerziTestSetup;
import com.vulniq.client.securityanalyzer.TerziTestUtilizingDocker;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import java.io.File;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

/**
 *
 * 
 */
public class OVALMainTest extends TerziTestUtilizingDocker
{
    @Mock
    TerziOutputWriter outputConsumer;
    
    @Mock
    TerziOptions terziOptions = new TerziOptions(TerziOptions.MainClassType.OVAL, outputConsumer);
    
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    /**
     * Test of run method, of class OVALMain.
     */
    @Test
    public void testRun()
    { 
        OVALMain ovalMain = new OVALMain(outputConsumer);
        DataCollectionTarget target = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-debian10");
        
        Mockito.when(terziOptions.getOptionValue(TerziOptions.OPTION_OVALID)).thenReturn("oval:org.debian:def:20208177");
        String absolutePath = new File("").getAbsolutePath();
        String ovalXMLPath = absolutePath + "/src/main/resources/unit-test-xml/oval-org.debian-def-20208177.xml";
        Mockito.when(terziOptions.getOptionValue(TerziOptions.OPTION_OVAL_FILEURL)).thenReturn(ovalXMLPath);
        Mockito.when( terziOptions.getDataCollectionTarget()).thenReturn(target);

        ovalMain.run(terziOptions);
    }

}