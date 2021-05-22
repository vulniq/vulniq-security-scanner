

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

package com.vulniq.client.securityanalyzer.datacollection;

import com.vulniq.client.securityanalyzer.datacollection.docker.DockerInfoCollector;
import com.vulniq.client.securityanalyzer.datacollection.host.HostInfoCollector;
import com.vulniq.client.securityanalyzer.datacollection.os.LinuxOSInfo;
import com.vulniq.client.securityanalyzer.datacollection.os.MacOSInfo;
import com.vulniq.client.securityanalyzer.datacollection.os.WindowsOSInfo;
import com.vulniq.client.securityanalyzer.datacollection.windows.WindowsInstalledSoftwareCollector;
import com.vulniq.client.securityanalyzer.logging.TerziLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InstalledSoftwareCollector
{
    private static Logger logger = LoggerFactory.getLogger(InstalledSoftwareCollector.class);

    public static List<InstalledSoftware> getInstalledSoftware(DataCollectionTarget target, OSInfo osInfo)
    {

        switch (target.getTargetType())
        {
            case Docker:
                if(osInfo instanceof LinuxOSInfo)
                {
                    LinuxOSInfo linuxOSInfo = (LinuxOSInfo) osInfo;
                    if (linuxOSInfo.isDebian() || linuxOSInfo.isUbuntu())
                    {
                        return getInstalledSoftwareFromDpkg(target);
                    }
                    else if(linuxOSInfo.isRedHat())
                    {
                        return getInstalledSoftwareFromYum(target);
                    }
                }
                else if (osInfo instanceof WindowsOSInfo)
                {
                    WindowsInstalledSoftwareCollector windowsInstalledSoftwareCollector = new WindowsInstalledSoftwareCollector();
                    return windowsInstalledSoftwareCollector.collectSoftware(target);
                }
                //note we don't have Mac here
            case Host:
                if (osInfo instanceof MacOSInfo)
                {
                    return getInstalledSoftwareFromMac(target);
                }
                else if (osInfo instanceof LinuxOSInfo)
                {
                    LinuxOSInfo linuxOSInfo = (LinuxOSInfo) osInfo;
                    if (linuxOSInfo.isDebian() || linuxOSInfo.isUbuntu())
                    {
                        return getInstalledSoftwareFromDpkg(target);
                    }
                    else if (linuxOSInfo.isRedHat())
                    {
                        return getInstalledSoftwareFromYum(target);
                    }
                }
                else if (osInfo instanceof WindowsOSInfo)
                {
                    WindowsInstalledSoftwareCollector windowsInstalledSoftwareCollector = new WindowsInstalledSoftwareCollector();
                    return windowsInstalledSoftwareCollector.collectSoftware(target);
                }
                break;
        }
        return null;
    }

    /**
     * Get installed software list by running "dpkg -l"
     * @param target
     * @return
     */
    public static List<InstalledSoftware> getInstalledSoftwareFromDpkg(DataCollectionTarget target)
    {
        String dpkgL = "";
        switch (target.getTargetType())
        {
            case Docker:
                dpkgL = DockerInfoCollector.runCommandOnDockerLinux(target.getTargetName(), "dpkg -l");
                break;
            case Host:
                dpkgL = HostInfoCollector.runDataCollectionCommand("dpkg", "-l");
                break;
        }

        Scanner scanner = new Scanner(dpkgL);
        boolean foundHeaderLine = false;
        List<Integer> columnWidths = new ArrayList<>();
        List<InstalledSoftware> rv = new LinkedList<>();
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            if(line!=null)
            {
                if(foundHeaderLine)
                {
                    int substrIndex = 0;
                    InstalledSoftware software = new InstalledSoftware();

                    String col1 = line.substring(substrIndex, columnWidths.get(0));
                    substrIndex = substrIndex + columnWidths.get(0);

                    String packageName = line.substring(substrIndex, substrIndex+columnWidths.get(1)).trim();
                    software.setName(packageName);

                    substrIndex = substrIndex+columnWidths.get(1);
                    String version = line.substring(substrIndex, substrIndex+columnWidths.get(2)).trim();
                    software.setVersion(version);

                    substrIndex = substrIndex+columnWidths.get(2);
                    String architecture = line.substring(substrIndex, substrIndex+columnWidths.get(3)).trim();
                    software.setArchitecture(architecture);
                    //now remove architecture from package name
                    if(software.getName()!=null && software.getName().endsWith(":"+software.getArchitecture()))
                    {
                        int colonArchLen = (":"+software.getArchitecture()).length();
                        int endIndex = software.getName().length() - colonArchLen;
                        software.setName(software.getName().substring(0, endIndex));
                    }


                    substrIndex = substrIndex+columnWidths.get(3);
                    String description = line.substring(substrIndex);
                    software.setDescription(description);

                    rv.add(software);
                }

                if(line.startsWith("+"))
                {
                    //header line
                    foundHeaderLine = true;
                    String[] splitLineByDash = line.trim().split("-");

                    for(int colCounter = 0; colCounter < splitLineByDash.length; colCounter++)
                    {
                        if(colCounter < (splitLineByDash.length-1))
                        {
                            columnWidths.add(splitLineByDash[colCounter].length()+1);
                        }
                        else
                        {
                            columnWidths.add(splitLineByDash[colCounter].length());
                        }
                    }
                }

            }
        }
        scanner.close();
        return rv;
    }

    /**
     * Parse a single line from "yum list installed" output
     * @param line
     * @param isMergedMultilineEntry
     * @return
     */
    public static InstalledSoftware parseYumOutputLine(String line, boolean isMergedMultilineEntry)
    {
        //systemd.x86_64                               219-57.el7            @anaconda/7.5
        Pattern regex = Pattern.compile("^(\\S+)\\.(\\S+)\\s+(\\S+)\\s+(\\S+)$");
        InstalledSoftware software = new InstalledSoftware();
        Matcher matcher = regex.matcher(line);
        if(matcher.matches())
        {
            software.setName(matcher.group(1));
            software.setArchitecture(matcher.group(2));
            software.setVersion(matcher.group(3));
            return software;
        }
        else
        {
            if(isMergedMultilineEntry)
            {
                TerziLog.supportCase("InstalledSoftwareCollector.parseYumOutputLine",
                        "ParseError",
                        "Regex did not match: '" + line + "'",
                        "Open a support ticket and please include target operating system version",
                        null);
            }
        }
        return null;
    }

    public static String getYumListInstalledOutput(DataCollectionTarget target)
    {
        String rv = null;
        switch (target.getTargetType())
        {
            case Docker:
                rv = DockerInfoCollector.runCommandOnDockerLinux(target.getTargetName(), "yum list installed");
                break;
            case Host:
                rv = HostInfoCollector.runDataCollectionCommand("yum", "list", "installed");
                break;
        }
        return rv;
    }

    public static List<InstalledSoftware> processYumListInstalledOutput(String yumOutput)
    {
        Scanner scanner = new Scanner(yumOutput);
        boolean foundHeaderLine = false;
        List<InstalledSoftware> rv = new LinkedList<>();
        String pendingLine = null;
        boolean isMergedMultilineEntry = false;
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            if(line!=null)
            {
                if(foundHeaderLine)
                {
                    if(pendingLine!=null && (line.startsWith(" ")|| line.startsWith("\t")))
                    {
                        line = (pendingLine.trim() + line).trim();
                        isMergedMultilineEntry = true;
                        pendingLine = null;
                    }
                    InstalledSoftware software = parseYumOutputLine(line, isMergedMultilineEntry);
                    isMergedMultilineEntry = false;
                    if(software!=null)
                    {
                        rv.add(software);
                        pendingLine = null;
                    }
                    else
                    {
                        pendingLine = line;
                    }
                }

                if(line.startsWith("Installed Packages"))
                {
                    //header line
                    foundHeaderLine = true;
                }

            }
        }
        scanner.close();
        return rv;
    }

    public static List<InstalledSoftware> getInstalledSoftwareFromYum(DataCollectionTarget target)
    {
        String yumOutput = getYumListInstalledOutput(target);
        List<InstalledSoftware> rv = processYumListInstalledOutput(yumOutput);
        return rv;
    }

    public static List<InstalledSoftware> getInstalledSoftwareFromMac(DataCollectionTarget target)
    {
        List<InstalledSoftware> rv = new LinkedList<>();
        List<InstalledSoftware> pkg = getInstalledSoftwareFromMacPkgutil(target);
        if(pkg!=null)
        {
            rv.addAll(pkg);
        }
        List<InstalledSoftware> brew = getInstalledSoftwareFromMacBrewList(target);
        if(brew!=null)
        {
            rv.addAll(brew);
        }
        List<InstalledSoftware> macports = getInstalledSoftwareFromMacPortInstalled(target);
        if(macports!=null)
        {
            rv.addAll(macports);
        }
        return rv;
    }

    public static List<InstalledSoftware> getInstalledSoftwareFromMacPkgutil(DataCollectionTarget target)
    {
        String cmdOutput = "";
        switch (target.getTargetType())
        {
            case Docker:
                //TODO add docker support ?
                break;
            case Host:
                cmdOutput = HostInfoCollector.runDataCollectionCommand("/bin/sh", "-c", "pkgutil --pkgs|xargs -L1 pkgutil --pkg-info $1");
                break;
        }

        /* like. we are only interested in package-id, version, install-time:
package-id: com.apple.pkg.MRTConfigData_10_15.16U4153
version: 1.76.1.1615492272
volume: /
location: /
install-time: 1616179214
groups: com.apple.FindSystemFiles.pkg-group
package-id: com.apple.pkg.MRTConfigData_10_15.16U4150
...
         */
        Scanner scanner = new Scanner(cmdOutput);
        List<InstalledSoftware> rv = new LinkedList<>();
        String currentPackageId = null;
        String currentVersion = null;
        String currentInstallTime = null;
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            if(line!=null)
            {
                if(line.startsWith("package-id:"))
                {
                    if(currentPackageId!=null)
                    {
                        InstalledSoftware software = new InstalledSoftware();
                        software.setName(currentPackageId);
                        software.setVersion(currentVersion);
                        software.setInstallTimeUnixTimestamp(currentInstallTime);
                        rv.add(software);
                    }
                    currentPackageId = line.substring(11).trim();
                    currentVersion = "";
                    currentInstallTime = "";
                }
                else if(line.startsWith("version:"))
                {
                    currentVersion = line.substring(8).trim();
                }
                else if(line.startsWith("install-time:"))
                {
                    currentInstallTime = line.substring(13).trim();
                }
            }
        }
        if(currentPackageId!=null)
        {
            InstalledSoftware software = new InstalledSoftware();
            software.setName(currentPackageId);
            software.setVersion(currentVersion);
            software.setInstallTimeUnixTimestamp(currentInstallTime);
            rv.add(software);
        }
        scanner.close();
        return rv;
    }

    public static List<InstalledSoftware> getInstalledSoftwareFromMacBrewList(DataCollectionTarget target)
    {
        String cmdOutput = "";
        switch (target.getTargetType())
        {
            case Docker:
                //TODO add docker support ?
                break;
            case Host:
                cmdOutput = HostInfoCollector.runDataCollectionCommand("/bin/sh", "-c", " brew list --versions");
                break;
        }

        /*
apr 1.7.0
apr-util 1.6.1_3
argon2 20190702_1
aspell 0.60.8
autoconf 2.69
brotli 1.0.7
c-ares 1.16.0
curl-openssl 7.69.1
...
         */
        Scanner scanner = new Scanner(cmdOutput);
        List<InstalledSoftware> rv = new LinkedList<>();
        String currentPackageName = null;
        String currentVersion = null;
        Pattern parsePattern = Pattern.compile("^(.*)\\s+(.*)$");
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            if(line!=null)
            {
                Matcher matcher = parsePattern.matcher(line);
                if(matcher.find())
                {
                    String packageName = matcher.group(1).trim();
                    String version = matcher.group(2).trim();
                    InstalledSoftware software = new InstalledSoftware();
                    software.setName(packageName);
                    software.setVersion(version);
                    rv.add(software);
                }
            }
        }
        scanner.close();
        return rv;
    }

    public static List<InstalledSoftware> getInstalledSoftwareFromMacPortInstalled(DataCollectionTarget target)
    {
        String cmdOutput = "";
        switch (target.getTargetType())
        {
            case Docker:
                //TODO add docker support ?
                break;
            case Host:
                cmdOutput = HostInfoCollector.runDataCollectionCommand("/bin/sh", "-c", "port installed");
                break;
        }
        return parseInstalledSoftwareFromMacPortInstalled(cmdOutput);
    }

    /**
     expected output format:<pre>
      a52dec @0.7.4_0 (active)
      adns @1.4_0 (active)
      apache2 @2.2.27_0+preforkmpm (active)
      ...</pre>
     */

    public static List<InstalledSoftware> parseInstalledSoftwareFromMacPortInstalled(String cmdOutput)
    {
        Scanner scanner = new Scanner(cmdOutput);
        List<InstalledSoftware> rv = new LinkedList<>();
        Pattern parsePattern = Pattern.compile("^(\\s*\\S+)\\s+@(.*)\\s");
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            if(line!=null)
            {
                Matcher matcher = parsePattern.matcher(line);
                if(matcher.find())
                {
                    String packageName = matcher.group(1).trim();
                    String version = matcher.group(2).trim();
                    InstalledSoftware software = new InstalledSoftware();
                    software.setName(packageName);
                    software.setVersion(version);
                    rv.add(software);
                }
            }
        }
        scanner.close();
        return rv;
    }
}
