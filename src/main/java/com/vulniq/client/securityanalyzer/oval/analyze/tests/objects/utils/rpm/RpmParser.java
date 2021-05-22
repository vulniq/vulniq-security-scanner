
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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.rpm;

import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.EntityItemRpmVerifyResultType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpmverifyfileItem;

public class RpmParser
{

    /** Expected input format: "redhat-release-server	(none)	7.5	8.el7	x86_64"
     * 
     */
    public static RpmverifyfileItem parseObjectPackageName(String packageName)
    {
        RpmverifyfileItem rpmVerifyFileItem = new RpmverifyfileItem();
        EntityItemStringType name = new EntityItemStringType();
        RpmverifyfileItem.Epoch epoch = new RpmverifyfileItem.Epoch();
        RpmverifyfileItem.Version version = new RpmverifyfileItem.Version();
        RpmverifyfileItem.Release release = new RpmverifyfileItem.Release();
        EntityItemStringType arch = new EntityItemStringType();
        EntityItemStringType extendedName = new EntityItemStringType();

        String[] splittedPackageName = packageName.split("\\t");

        name.setValue(splittedPackageName[0]);
        rpmVerifyFileItem.setName(name);

        if (splittedPackageName.length == 1)
        {
            rpmVerifyFileItem.setExtendedName(name);
            epoch.setValue("(none)");   //TODO test this. epoch should default to 0?
            version.setValue("");
            release.setValue("");
            arch.setValue("");
        }
        else
        {
            epoch.setValue(splittedPackageName[1]);
            version.setValue(splittedPackageName[2]);
            release.setValue(splittedPackageName[3]);
            arch.setValue(splittedPackageName[4]);

            // Extended name should have a format of: "NAME-EPOCH:VERSION-RELEASE.ARCHITECTURE"
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(splittedPackageName[0]).append("-");
            if ("(none)".equals(splittedPackageName[1]))
            {
                stringBuilder.append("0");
            }
            else
            {
                stringBuilder.append(splittedPackageName[1]);
            }
            stringBuilder.append(":").append(splittedPackageName[2]);
            stringBuilder.append("-").append(splittedPackageName[3]);
            stringBuilder.append(".").append(splittedPackageName[4]);

            extendedName.setValue(stringBuilder.toString().trim());
            rpmVerifyFileItem.setExtendedName(extendedName);
        }
        rpmVerifyFileItem.setEpoch(epoch);
        rpmVerifyFileItem.setVersion(version);
        rpmVerifyFileItem.setRelease(release);
        rpmVerifyFileItem.setArch(arch);
        

        return rpmVerifyFileItem;
    }
    private static RpmverifyfileItem processEmptyCmdOut(RpmverifyfileItem rpmVerifyFileItem)
    {
        if(rpmVerifyFileItem.getFilepath() == null || rpmVerifyFileItem.getFilepath().getValue() == null )
        {
            EntityItemStringType filepathEntity = new EntityItemStringType();
            filepathEntity.setValue("");
            rpmVerifyFileItem.setFilepath(filepathEntity);    
        }  
        
        EntityItemBoolType entityBoolean = new EntityItemBoolType();
        entityBoolean.setValue(false);

        rpmVerifyFileItem.setGhostFile(entityBoolean);
        rpmVerifyFileItem.setConfigurationFile(entityBoolean);
        rpmVerifyFileItem.setDocumentationFile(entityBoolean);
        rpmVerifyFileItem.setLicenseFile(entityBoolean);
        rpmVerifyFileItem.setReadmeFile(entityBoolean);
        
        EntityItemRpmVerifyResultType tempRpmVerifyResult = new EntityItemRpmVerifyResultType();
        tempRpmVerifyResult.setValue("pass");
        rpmVerifyFileItem.setSizeDiffers(tempRpmVerifyResult);
        rpmVerifyFileItem.setModeDiffers(tempRpmVerifyResult);
        rpmVerifyFileItem.setMd5Differs(tempRpmVerifyResult);
        rpmVerifyFileItem.setDeviceDiffers(tempRpmVerifyResult);
        rpmVerifyFileItem.setLinkMismatch(tempRpmVerifyResult);
        rpmVerifyFileItem.setOwnershipDiffers(tempRpmVerifyResult);
        rpmVerifyFileItem.setGroupDiffers(tempRpmVerifyResult);
        rpmVerifyFileItem.setMtimeDiffers(tempRpmVerifyResult);
        rpmVerifyFileItem.setCapabilitiesDiffer(tempRpmVerifyResult);
        rpmVerifyFileItem.setFiledigestDiffers(tempRpmVerifyResult);
        
        return rpmVerifyFileItem;
    }

    /** Expected input: "S.5....T.  c /etc/yum.conf"
     * 
     */
    public static RpmverifyfileItem parseRpmVerifyOutput(String rpmVerifyOutput, RpmverifyfileItem rpmVerifyFileItem) 
    {
        if ("".equals(rpmVerifyOutput))
        {
            return processEmptyCmdOut(rpmVerifyFileItem);
        }
        String filename = null;
        String comparisonResult = null;
        String fileType = null;

        String regex = "\\s+";

        String[] rpmArray = rpmVerifyOutput.split(regex);

        if (rpmArray.length == 3)
        {
            comparisonResult = rpmArray[0];
            fileType = rpmArray[1];
            filename = rpmArray[2];
        }
        else
        {
            comparisonResult = rpmArray[0];
            filename = rpmArray[1];
        }

        rpmVerifyFileItem = parseComparisonResult(comparisonResult, rpmVerifyFileItem);

        rpmVerifyFileItem = parseFileType(fileType, rpmVerifyFileItem);

        if (rpmVerifyFileItem.getFilepath() == null || filename != null)
        {
            EntityItemStringType entityFilename = new EntityItemStringType();
            entityFilename.setValue(filename);
            rpmVerifyFileItem.setFilepath(entityFilename);
        }

        return rpmVerifyFileItem;
    }

    /** 
     * S file Size differs
     * M Mode differs (includes permissions and file type)
     * 5 digest (formerly MD5 sum) differs
     * D Device major/minor number mismatch
     * L readlink(2) path mismatch
     * U User ownership differs
     * G Group ownership differs
     * T mTime differs
     * P caPabilities differ
     * TODO --> When does verifyResult become an empty string ""
     */
    private static RpmverifyfileItem parseComparisonResult(String comparisonResult, RpmverifyfileItem rpmVerifyFileItem)
    {
        EntityItemRpmVerifyResultType tempRpmVerifyResult = new EntityItemRpmVerifyResultType();
        if ("missing".equals(comparisonResult))
        {
            tempRpmVerifyResult.setValue("not performed");
            rpmVerifyFileItem.setSizeDiffers(tempRpmVerifyResult);
            rpmVerifyFileItem.setModeDiffers(tempRpmVerifyResult);
            rpmVerifyFileItem.setMd5Differs(tempRpmVerifyResult);
            rpmVerifyFileItem.setDeviceDiffers(tempRpmVerifyResult);
            rpmVerifyFileItem.setLinkMismatch(tempRpmVerifyResult);
            rpmVerifyFileItem.setOwnershipDiffers(tempRpmVerifyResult);
            rpmVerifyFileItem.setGroupDiffers(tempRpmVerifyResult);
            rpmVerifyFileItem.setMtimeDiffers(tempRpmVerifyResult);
            rpmVerifyFileItem.setCapabilitiesDiffer(tempRpmVerifyResult);
            rpmVerifyFileItem.setFiledigestDiffers(tempRpmVerifyResult);
            return rpmVerifyFileItem;
        }
        char[] comparisonArray = comparisonResult.toCharArray();

        if (comparisonArray[0] == 'S')
        {
            tempRpmVerifyResult.setValue("fail");
            rpmVerifyFileItem.setSizeDiffers(tempRpmVerifyResult);
        }
        else if (comparisonArray[0] == '.')
        {
            tempRpmVerifyResult.setValue("pass");
            rpmVerifyFileItem.setSizeDiffers(tempRpmVerifyResult);
        }
        else
        {
            tempRpmVerifyResult.setValue("not performed");
            rpmVerifyFileItem.setSizeDiffers(tempRpmVerifyResult);
        }

        if (comparisonArray[1] == 'M')
        {
            tempRpmVerifyResult.setValue("fail");
            rpmVerifyFileItem.setModeDiffers(tempRpmVerifyResult);
        }
        else if (comparisonArray[1] == '.')
        {
            tempRpmVerifyResult.setValue("pass");
            rpmVerifyFileItem.setModeDiffers(tempRpmVerifyResult);
        }
        else
        {
            tempRpmVerifyResult.setValue("not performed");
            rpmVerifyFileItem.setModeDiffers(tempRpmVerifyResult);
        }

        if (comparisonArray[2] == '5')
        {
            tempRpmVerifyResult.setValue("fail");
            rpmVerifyFileItem.setMd5Differs(tempRpmVerifyResult);
            rpmVerifyFileItem.setFiledigestDiffers(tempRpmVerifyResult);
        }
        else if (comparisonArray[2] == '.')
        {
            tempRpmVerifyResult.setValue("pass");
            rpmVerifyFileItem.setMd5Differs(tempRpmVerifyResult);
            rpmVerifyFileItem.setFiledigestDiffers(tempRpmVerifyResult);
        }
        else
        {
            tempRpmVerifyResult.setValue("not performed");
            rpmVerifyFileItem.setMd5Differs(tempRpmVerifyResult);
            rpmVerifyFileItem.setFiledigestDiffers(tempRpmVerifyResult);
        }

        if (comparisonArray[3] == 'D')
        {
            tempRpmVerifyResult.setValue("fail");
            rpmVerifyFileItem.setDeviceDiffers(tempRpmVerifyResult);
        }
        else if (comparisonArray[3] == '.')
        {
            tempRpmVerifyResult.setValue("pass");
            rpmVerifyFileItem.setDeviceDiffers(tempRpmVerifyResult);
        }
        else
        {
            tempRpmVerifyResult.setValue("not performed");
            rpmVerifyFileItem.setDeviceDiffers(tempRpmVerifyResult);
        }

        if (comparisonArray[4] == 'L')
        {
            tempRpmVerifyResult.setValue("fail");
            rpmVerifyFileItem.setLinkMismatch(tempRpmVerifyResult);
        }
        else if (comparisonArray[4] == '.')
        {
            tempRpmVerifyResult.setValue("pass");
            rpmVerifyFileItem.setLinkMismatch(tempRpmVerifyResult);
        }
        else
        {
            tempRpmVerifyResult.setValue("not performed");
            rpmVerifyFileItem.setLinkMismatch(tempRpmVerifyResult);
        }

        if (comparisonArray[5] == 'U')
        {
            tempRpmVerifyResult.setValue("fail");
            rpmVerifyFileItem.setOwnershipDiffers(tempRpmVerifyResult);
        }
        else if (comparisonArray[5] == '.')
        {
            tempRpmVerifyResult.setValue("pass");
            rpmVerifyFileItem.setOwnershipDiffers(tempRpmVerifyResult);
        }
        else
        {
            tempRpmVerifyResult.setValue("not performed");
            rpmVerifyFileItem.setOwnershipDiffers(tempRpmVerifyResult);
        }

        if (comparisonArray[6] == 'G')
        {
            tempRpmVerifyResult.setValue("fail");
            rpmVerifyFileItem.setGroupDiffers(tempRpmVerifyResult);
        }
        else if (comparisonArray[6] == '.')
        {
            tempRpmVerifyResult.setValue("pass");
            rpmVerifyFileItem.setGroupDiffers(tempRpmVerifyResult);
        }
        else
        {
            tempRpmVerifyResult.setValue("not performed");
            rpmVerifyFileItem.setGroupDiffers(tempRpmVerifyResult);
        }

        if (comparisonArray[7] == 'T')
        {
            tempRpmVerifyResult.setValue("fail");
            rpmVerifyFileItem.setMtimeDiffers(tempRpmVerifyResult);
        }
        else if (comparisonArray[7] == '.')
        {
            tempRpmVerifyResult.setValue("pass");
            rpmVerifyFileItem.setMtimeDiffers(tempRpmVerifyResult);
        }
        else
        {
            tempRpmVerifyResult.setValue("not performed");
            rpmVerifyFileItem.setMtimeDiffers(tempRpmVerifyResult);
        }

        if (comparisonArray[8] == 'P')
        {
            tempRpmVerifyResult.setValue("fail");
            rpmVerifyFileItem.setCapabilitiesDiffer(tempRpmVerifyResult);
        }
        else if (comparisonArray[8] == '.')
        {
            tempRpmVerifyResult.setValue("pass");
            rpmVerifyFileItem.setCapabilitiesDiffer(tempRpmVerifyResult);
        }
        else
        {
            tempRpmVerifyResult.setValue("not performed");
            rpmVerifyFileItem.setCapabilitiesDiffer(tempRpmVerifyResult);
        }

        return rpmVerifyFileItem;
    }

    /**
     * c %config configuration file.
     * d %doc documentation file.
     * g %ghost file (i.e. the file contents are not included in the package payload).
     * l %license license file.
     * r %readme readme file.
     */
    private static RpmverifyfileItem parseFileType(String fileType, RpmverifyfileItem rpmVerifyFileItem)
    {
        EntityItemBoolType entityBoolean = new EntityItemBoolType();
        entityBoolean.setValue(false);

        rpmVerifyFileItem.setGhostFile(entityBoolean);
        rpmVerifyFileItem.setConfigurationFile(entityBoolean);
        rpmVerifyFileItem.setDocumentationFile(entityBoolean);
        rpmVerifyFileItem.setLicenseFile(entityBoolean);
        rpmVerifyFileItem.setReadmeFile(entityBoolean);

        if (fileType == null)
        {
            return rpmVerifyFileItem;
        }
        entityBoolean.setValue(true);
        switch (fileType)
        {
            case "c":
                rpmVerifyFileItem.setConfigurationFile(entityBoolean);
                break;
            case "d":
                rpmVerifyFileItem.setDocumentationFile(entityBoolean);
                break;
            case "g":
                rpmVerifyFileItem.setGhostFile(entityBoolean);
                break;
            case "l":
                rpmVerifyFileItem.setLicenseFile(entityBoolean);
                break;
            case "r":
                rpmVerifyFileItem.setReadmeFile(entityBoolean);
                break;
        }

        return rpmVerifyFileItem;
    }

}
