
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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windowsfiletest;

import com.vulniq.client.securityanalyzer.TerziTestSetup;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.datacollection.OSInfo;
import com.vulniq.client.securityanalyzer.datacollection.OSInfoCollector;
import java.util.List;
import org.junit.After;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 *
 */
public class PowerShellFilePropertiesUtilsTest
{
    private DataCollectionTarget targetHost;
    private DataCollectionTarget targetDocker;
    private PowerShellFilePropertiesUtils utilHost;
    private PowerShellFilePropertiesUtils utilDocker;
    private final String filepath = "C:\\Program Files\\Internet Explorer\\iexplore.exe";
    OSInfo hostOSInfo;
    OSInfo dockerOSInfo;

    @Before
    public void setUp()
    {
        //Run these tests only on windows
        Assume.assumeTrue(TerziTestSetup.isOnWindows());

        targetHost = new DataCollectionTarget(DataCollectionTargetType.Host, "host");
        targetDocker = new DataCollectionTarget(DataCollectionTargetType.Docker, "terzi-windows");
        
        dockerOSInfo = OSInfoCollector.getOSInfo(targetDocker);
        hostOSInfo = OSInfoCollector.getOSInfoFromHost();
        
        utilHost = new PowerShellFilePropertiesUtils(targetHost);
        utilDocker = new PowerShellFilePropertiesUtils(targetDocker);
    }



    @Test
    public void testGetSizeOfFile()
    {
        String result = utilHost.getSizeOfFile(filepath);
        assertNotNull(result);
    }

    @Test
    public void testGetSystemUsername()
    {
        String systemUsernameHost = utilHost.getSystemUsername();
        String systemUsernameDocker = utilDocker.getSystemUsername();

        assertNotNull(systemUsernameHost);
        assertNotNull(systemUsernameDocker);

        System.out.println(systemUsernameHost);
        System.out.println(systemUsernameDocker);
    }

    @Test
    public void testGetSystemUserDomain()
    {
        String systemUserDomainHost = utilHost.getSystemUserDomain();
        String systemUserDoianDocker = utilDocker.getSystemUserDomain();

        assertNotNull(systemUserDomainHost);
        assertNotNull(systemUserDoianDocker);

        System.out.println(systemUserDomainHost);
        System.out.println(systemUserDoianDocker);
    }

    @Test
    public void testGetFileCreationTime()
    {
        String fileCreationTimeHost = utilHost.getFileCreationTime(filepath);
        String fileCreationTimeDocker = utilDocker.getFileCreationTime(filepath);

        assertNotNull(fileCreationTimeHost);
        assertNotNull(fileCreationTimeDocker);

        System.out.println(fileCreationTimeHost);
        System.out.println(fileCreationTimeDocker);
    }

    @Test
    public void testGetFileLastAccessTime()
    {
        String fileTimeHost = utilHost.getFileLastAccessTime(filepath);
        String fileTimeDocker = utilDocker.getFileLastAccessTime(filepath);

        assertNotNull(fileTimeHost);
        assertNotNull(fileTimeDocker);

        System.out.println(fileTimeHost);
        System.out.println(fileTimeDocker);
    }

    @Test
    public void testGetFileModificationTime()
    {
        String fileTimeHost = utilHost.getFileModificationTime(filepath);
        String fileTimeDocker = utilDocker.getFileModificationTime(filepath);

        assertNotNull(fileTimeHost);
        assertNotNull(fileTimeDocker);

        System.out.println(fileTimeHost);
        System.out.println(fileTimeDocker);
    }

    @Test
    public void testGetFileOwner()
    {
        String ownerHost = utilHost.getFileOwner(filepath);
        String ownerDocker = utilDocker.getFileOwner(filepath);

        assertNotNull(ownerHost);
        assertNotNull(ownerDocker);

        System.out.println(ownerHost);
        System.out.println(ownerDocker);
    }

    @Test
    public void testGetFileVersion()
    {
        String alternativeFilepath = "C:\\Windows\\System32\\comctl32.dll";
        String fileVersionHost = utilHost.getFileVersion(alternativeFilepath);
        String fileVersionDocker = utilDocker.getFileVersion(alternativeFilepath);

        assertNotNull(fileVersionHost);
        assertNotNull(fileVersionDocker);

        System.out.println(fileVersionHost);
        System.out.println(fileVersionDocker);
    }

    @Test
    public void testGetFileProductVersion()
    {
        String alternativeFilepath = "C:\\Windows\\System32\\comctl32.dll";
        String productVersionHost = utilHost.getFileProductVersion(alternativeFilepath);
        String productVersionDocker = utilDocker.getFileProductVersion(alternativeFilepath);

        assertNotNull(productVersionHost);
        assertNotNull(productVersionDocker);

        System.out.println(productVersionHost);
        System.out.println(productVersionDocker);
    }

    @Test
    public void testGetCompanyName()
    {
        String companyHost = utilHost.getFileCompanyName(filepath);
        String companyDocker = utilDocker.getFileCompanyName(filepath);

        assertNotNull(companyHost);
        assertNotNull(companyDocker);

        System.out.println(companyHost);
        System.out.println(companyDocker);
    }

    @Test
    public void testGetFileAttributes()
    {
        List<String> fileAttributesHost = utilHost.getFileAttributes(filepath);
        List<String> fileAttributesDocker = utilDocker.getFileAttributes(filepath);

        assertNotNull(fileAttributesHost);
        assertNotNull(fileAttributesDocker);

        System.out.println(fileAttributesHost);
        System.out.println(fileAttributesDocker);
    }

    @Test
    public void testGetFileInternalName()
    {
        String internalNameHost = utilHost.getFileInternalName(filepath);
        String internalNameDocker = utilDocker.getFileInternalName(filepath);

        assertNotNull(internalNameHost);
        assertNotNull(internalNameDocker);

        System.out.println(internalNameHost);
        System.out.println(internalNameDocker);
    }

    @Test
    public void testGetFileLanguage()
    {
        String languageHost = utilHost.getFileLanguage(filepath);
        String languageDocker = utilDocker.getFileLanguage(filepath);

        assertNotNull(languageHost);
        assertNotNull(languageDocker);

        System.out.println(languageHost);
        System.out.println(languageDocker);
    }

    @Test
    public void testGetFileOriginalName()
    {
        String originalNameHost = utilHost.getFileOriginalName(filepath);
        String originalNameDocker = utilDocker.getFileOriginalName(filepath);

        assertNotNull(originalNameHost);
        assertNotNull(originalNameDocker);

        System.out.println(originalNameHost);
        System.out.println(originalNameDocker);
    }

    @Test
    public void testGetFileProductName()
    {
        String productNameHost = utilHost.getFileProductName(filepath);
        String productNameDocker = utilDocker.getFileProductName(filepath);

        assertNotNull(productNameHost);
        assertNotNull(productNameDocker);

        System.out.println(productNameHost);
        System.out.println(productNameDocker);
    }
    
    @Test
    public void testGetFileMsChecksum()
    {
        String checksumHost = utilHost.getFileMsChecksum(filepath);
        String checksumDocker = utilDocker.getFileMsChecksum(filepath);

        assertNotNull(checksumHost);
        assertNotNull(checksumDocker);

        System.out.println(checksumHost);
        System.out.println(checksumDocker);
    }
    
    @Test
    public void testGetFileType()
    {
        String fileTypeHost = utilHost.getFileType(filepath);
        String fileTypeDocker = utilDocker.getFileType(filepath);

        assertNotNull(fileTypeHost);
        assertNotNull(fileTypeDocker);

        System.out.println(fileTypeHost);
        System.out.println(fileTypeDocker);
    }
}
