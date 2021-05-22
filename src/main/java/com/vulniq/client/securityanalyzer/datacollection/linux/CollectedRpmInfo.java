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

package com.vulniq.client.securityanalyzer.datacollection.linux;

import com.vulniq.client.securityanalyzer.datacollection.unix.UnameProperties;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import com.vulniq.client.securityanalyzer.utils.VersionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CollectedRpmInfo
{
    private transient Logger logger = LoggerFactory.getLogger(CollectedRpmInfo.class);
    /*
Name        : rpm
Version     : 4.11.1
Release     : 16.el7
Architecture: x86_64
Install Date: Wed Mar  4 12:57:59 2015
Group       : System Environment/Base
Size        : 2592315
License     : GPLv2+
Signature   : RSA/SHA256, Fri Jul  4 04:50:32 2014, Key ID 24c6a8a7f4a80eb5
Source RPM  : rpm-4.11.1-16.el7.src.rpm
Build Date  : Mon Jun  9 18:59:29 2014
Build Host  : worker1.bsys.centos.org
Relocations : (not relocatable)
Packager    : CentOS BuildSystem <http://bugs.centos.org>
Vendor      : CentOS
URL         : http://www.rpm.org/
Summary     : The RPM package management system
Description :
The RPM Package Manager (RPM) is a powerful command line driven
package management system capable of installing, uninstalling,
verifying, querying, and updating software packag....
     */
    private String name;
    private String epoch;
    private String version;
    private String release;
    private String architecture;
    private String installDate;
    private String group;
    private int size = -1;
    private String license;
    private String signatureAlg;
    private String signatureKeyId;
    private String sourceRpm;
    private String buildDate;
    private String buildHost;
    private String relocations;
    private String packager;
    private String vendor;
    private String url;
    private String summary;
    private StringBuilder description;
    private transient boolean descriptionStarted;

    public CollectedRpmInfo(UnameProperties unameProperties)
    {
        this.architecture = unameProperties.getArchitecture();
        //this.buildDate =
        //this.buildHost =
        this.epoch = VersionUtils.getEpochFromEVR(unameProperties.getEvr());
        //this.group
        //this.installDate =
        //this.license
        this.name = "linux";
        //this.packager
        this.release = unameProperties.getKernelRelease();
        //this.relocations
        //this.signatureAlg
        //this.signatureKeyId
        //this.size
        //this.sourceRpm
        //this.summary
        //this.url
        this.vendor = "Linux";
        this.version = unameProperties.getKernelVersion();
    }
    public CollectedRpmInfo(String rpmQIOutput)
    {
        try (Scanner scanner = new Scanner(rpmQIOutput))
        {
            String line = null;
            while(scanner.hasNextLine())
            {
                line = scanner.nextLine();
                if(line==null)
                {
                    continue;
                }
                if(!descriptionStarted)
                {
                    if (name == null)
                    {
                        Pattern pattern = Pattern.compile("Name\\s*:\\s*(\\S+)");
                        Matcher m = pattern.matcher(line);
                        if (m.matches())
                        {
                            this.name = m.group(1);
                        }
                    }
                    if (version == null)
                    {
                        Pattern pattern = Pattern.compile("Version\\s*:\\s*(\\S+)");
                        Matcher m = pattern.matcher(line);
                        if (m.matches())
                        {
                            this.version = m.group(1);
                        }
                    }
                    if (epoch == null)
                    {
                        Pattern pattern = Pattern.compile("Epoch\\s*:\\s*(\\S+)");
                        Matcher m = pattern.matcher(line);
                        if (m.matches())
                        {
                            this.epoch = m.group(1);
                        }
                    }
                    if (release == null)
                    {
                        Pattern pattern = Pattern.compile("Release\\s*:\\s*(\\S+)");
                        Matcher m = pattern.matcher(line);
                        if (m.matches())
                        {
                            this.release = m.group(1);
                        }
                    }
                    if (architecture == null)
                    {
                        Pattern pattern = Pattern.compile("Architecture\\s*:\\s*(\\S+)");
                        Matcher m = pattern.matcher(line);
                        if (m.matches())
                        {
                            this.architecture = m.group(1);
                        }
                    }
                    if (installDate == null)
                    {
                        Pattern pattern = Pattern.compile("Install\\s+Date\\s*:(.*)");
                        Matcher m = pattern.matcher(line);
                        if (m.matches())
                        {
                            this.installDate = m.group(1).trim();
                        }
                    }
                    if (group == null)
                    {
                        Pattern pattern = Pattern.compile("Group\\s*:(.*)");
                        Matcher m = pattern.matcher(line);
                        if (m.matches())
                        {
                            this.group = m.group(1).trim();
                        }
                    }
                    if (size == -1)
                    {
                        Pattern pattern = Pattern.compile("Size\\s*:\\s*(\\S+)");
                        Matcher m = pattern.matcher(line);
                        if (m.matches())
                        {
                            this.size = StringUtils.parseInt(m.group(1).trim(), 0);
                        }
                    }
                    if (license == null)
                    {
                        Pattern pattern = Pattern.compile("License\\s*:(.*)");
                        Matcher m = pattern.matcher(line);
                        if (m.matches())
                        {
                            this.license = m.group(1).trim();
                        }
                    }
                    if (signatureKeyId == null)
                    {
                        //Signature   : RSA/SHA256, Fri Jul  4 04:50:32 2014, Key ID 24c6a8a7f4a80eb5
                        Pattern pattern = Pattern.compile("Signature\\s*:\\s+(\\S+),(.*),\\s+Key ID\\s+(\\S+)");
                        Matcher m = pattern.matcher(line);
                        if (m.matches())
                        {
                            this.signatureAlg = m.group(1).trim();
                            this.signatureKeyId = m.group(3).trim();
                        }
                    }
                    if (sourceRpm == null)
                    {   //Source RPM  : rpm-4.11.1-16.el7.src.rpm
                        Pattern pattern = Pattern.compile("Source RPM\\s*:\\s*(\\S+)");
                        Matcher m = pattern.matcher(line);
                        if (m.matches())
                        {
                            this.sourceRpm = m.group(1);
                        }
                    }
                    if (buildDate == null)
                    {   //Build Date  : Mon Jun  9 18:59:29 2014
                        Pattern pattern = Pattern.compile("Build Date\\s*:(.*)");
                        Matcher m = pattern.matcher(line);
                        if (m.matches())
                        {
                            this.buildDate = m.group(1).trim();
                        }
                    }
                    if (buildHost == null)
                    {   //Build Host  : worker1.bsys.centos.org
                        Pattern pattern = Pattern.compile("Build Host\\s*:(.*)");
                        Matcher m = pattern.matcher(line);
                        if (m.matches())
                        {
                            this.buildHost = m.group(1).trim();
                        }
                    }
                    if (relocations == null)
                    {   //Relocations : (not relocatable)
                        Pattern pattern = Pattern.compile("Relocations\\s*:(.*)");
                        Matcher m = pattern.matcher(line);
                        if (m.matches())
                        {
                            this.relocations = m.group(1).trim();
                        }
                    }
                    if (packager == null)
                    {   //Packager    : CentOS BuildSystem <http://bugs.centos.org>
                        Pattern pattern = Pattern.compile("Packager\\s*:(.*)");
                        Matcher m = pattern.matcher(line);
                        if (m.matches())
                        {
                            this.packager = m.group(1).trim();
                        }
                    }
                    if (vendor == null)
                    {   //Vendor      : CentOS
                        Pattern pattern = Pattern.compile("Vendor\\s*:(.*)");
                        Matcher m = pattern.matcher(line);
                        if (m.matches())
                        {
                            this.vendor = m.group(1).trim();
                        }
                    }
                    if (url == null)
                    {   //Vendor      : CentOS
                        Pattern pattern = Pattern.compile("URL\\s*:(.*)");
                        Matcher m = pattern.matcher(line);
                        if (m.matches())
                        {
                            this.url = m.group(1).trim();
                        }
                    }
                    if (summary == null)
                    {   //Summary     : The RPM package management system
                        Pattern pattern = Pattern.compile("Summary\\s*:(.*)");
                        Matcher m = pattern.matcher(line);
                        if (m.matches())
                        {
                            this.summary = m.group(1).trim();
                        }
                    }
                }
                else
                {
                    this.description.append(line);
                    this.description.append("\n");
                }
                if(description==null)
                {   //Description     : and following lines
                    Pattern pattern = Pattern.compile("Description\\s*:(.*)");
                    Matcher m = pattern.matcher(line);
                    if(m.matches())
                    {
                        String firstLine = m.group(1).trim();
                        this.description = new StringBuilder();
                        this.description.append(firstLine);
                        this.description.append("\n");
                        this.descriptionStarted = true;
                    }
                }
            }
        }
        catch (Exception ex)
        {
            logger.error("Error parsing rpm -q -i output:" + rpmQIOutput, ex);
        }
    }

    public String getValueByElementName(String xmlElementName)
    {
        //name, arch, epoch, release, version, evr, signature_keyid, extended_name, filepath
        switch (xmlElementName)
        {
            case "name":
                return this.name;
            case "arch":
                return this.architecture;
            case "epoch":
                return ((this.epoch==null||this.epoch.isBlank())?"0":this.epoch);
            case "release":
                return this.release;
            case "version":
                return this.version;
            case "evr":
                return ((this.epoch==null||this.epoch.isBlank())?"0":this.epoch) + ":" + this.version + "-" + this.release;
            case "signature_keyid":
                return this.signatureKeyId;
            case "extended_name":
                return this.sourceRpm;
        }
        return null;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public String getRelease()
    {
        return release;
    }

    public void setRelease(String release)
    {
        this.release = release;
    }

    public String getArchitecture()
    {
        return architecture;
    }

    public void setArchitecture(String architecture)
    {
        this.architecture = architecture;
    }

    public String getInstallDate()
    {
        return installDate;
    }

    public void setInstallDate(String installDate)
    {
        this.installDate = installDate;
    }

    public String getGroup()
    {
        return group;
    }

    public void setGroup(String group)
    {
        this.group = group;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public String getLicense()
    {
        return license;
    }

    public void setLicense(String license)
    {
        this.license = license;
    }

    public String getSignatureAlg()
    {
        return signatureAlg;
    }

    public void setSignatureAlg(String signatureAlg)
    {
        this.signatureAlg = signatureAlg;
    }

    public String getSignatureKeyId()
    {
        return signatureKeyId;
    }

    public void setSignatureKeyId(String signatureKeyId)
    {
        this.signatureKeyId = signatureKeyId;
    }

    public String getSourceRpm()
    {
        return sourceRpm;
    }

    public void setSourceRpm(String sourceRpm)
    {
        this.sourceRpm = sourceRpm;
    }

    public String getBuildDate()
    {
        return buildDate;
    }

    public void setBuildDate(String buildDate)
    {
        this.buildDate = buildDate;
    }

    public String getBuildHost()
    {
        return buildHost;
    }

    public void setBuildHost(String buildHost)
    {
        this.buildHost = buildHost;
    }

    public String getRelocations()
    {
        return relocations;
    }

    public void setRelocations(String relocations)
    {
        this.relocations = relocations;
    }

    public String getPackager()
    {
        return packager;
    }

    public void setPackager(String packager)
    {
        this.packager = packager;
    }

    public String getVendor()
    {
        return vendor;
    }

    public void setVendor(String vendor)
    {
        this.vendor = vendor;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getSummary()
    {
        return summary;
    }

    public void setSummary(String summary)
    {
        this.summary = summary;
    }

    public StringBuilder getDescription()
    {
        return description;
    }

    public void setDescription(StringBuilder description)
    {
        this.description = description;
    }

    public String getEvr()
    {
        return getValueByElementName("evr");
    }
    @Override
    public String toString()
    {
        return this.name + " " + this.getValueByElementName("evr") + " " + this.vendor;
    }
}
