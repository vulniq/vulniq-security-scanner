
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
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ScanMainTest extends TerziTestUtilizingDocker
{


    @Test
    public void runDebian10()
    {
        TerziOutputWriter outputWriter = new TerziOutputWriter(true, false);
        ScanMain scanMain = new ScanMain(outputWriter);
        PrintStream originalSystemOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        TerziOptions options = new TerziOptions(TerziOptions.MainClassType.SCAN, outputWriter);
        String[] args = new String[]{"-t", "Docker", "-n", "terzi-debian10", "-q", "curl.*", "-x", "json"};
        options.parseCommandLine(args);
        outputWriter.setOptions(options);
        scanMain.run(options);

        System.setOut(originalSystemOut);
        assertTrue(baos.toString().length()>0);
    }


    @Test
    public void runRhel7()
    {
        TerziOutputWriter outputWriter = new TerziOutputWriter(true, false);
        ScanMain scanMain = new ScanMain(outputWriter);
        PrintStream originalSystemOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        TerziOptions options = new TerziOptions(TerziOptions.MainClassType.SCAN, outputWriter);
        String[] args = new String[]{"-t", "Docker", "-n", "terzi-rhel7", "-q", "openssl.*", "-x", "json"};
        options.parseCommandLine(args);
        outputWriter.setOptions(options);
        scanMain.run(options);

        System.setOut(originalSystemOut);
        System.out.println(baos.toString());
        assertTrue(baos.toString().length()>0);
    }
}