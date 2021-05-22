
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

import com.vulniq.client.securityanalyzer.TerziMain;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.apache.commons.lang3.SystemUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

/**
 * metadata information about the host on which a scan or info collection was run
 * when it started, ended
 * info about the host that the scan was run on
 */
public class DataCollectionMetadata
{
    public enum DataCollectionStatus {Scheduled, Started, Finished, Failed};
    private transient Logger logger = LoggerFactory.getLogger(DataCollectionMetadata.class);
    private long startTimestamp;
    private long endTimestamp;
    private DataCollectionStatus status;
    private String hostname;
    private String userName;
    private String javaVersion;
    private String javaVendor;
    private String javaVMName;
    private String operatingSystem;
    private String dataCollectionGuid;
    private String commandLineArguments = TerziMain.commandLineArgsDoNOTModify;
    /**
     * IP => network interface name
     */
    private List<HostNetworkInterface> networkInterfaces = new LinkedList<>();

    public DataCollectionMetadata()
    {
        this.hostname = SystemUtils.getHostName();
        if(this.hostname==null || this.hostname.isEmpty())
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(1000, "hostname");
            this.hostname = cmdOut.getStdOut();
            if(this.hostname!=null)
            {
                this.hostname = this.hostname.trim();
            }
        }
        this.operatingSystem = SystemUtils.OS_NAME;
        try
        {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            if(interfaces!=null)
            {
                while(interfaces.hasMoreElements())
                {
                    NetworkInterface ne = interfaces.nextElement();
                    this.networkInterfaces.add(new HostNetworkInterface(ne));
                }
            }
        }
        catch (Exception ex)
        {
            logger.error("Error getting NetworkInterfaces in DataCollectionMetadata", ex);
        }
        this.userName = SystemUtils.USER_NAME;
        this.javaVendor = SystemUtils.JAVA_VENDOR;
        this.javaVersion = SystemUtils.JAVA_VERSION;
        this.javaVMName = SystemUtils.JAVA_VM_NAME;
    }

    public void start()
    {
        this.startTimestamp = System.currentTimeMillis();
        this.setStatus(DataCollectionStatus.Started);
    }

    public DataCollectionStatus getStatus()
    {
        return status;
    }

    public void setStatus(DataCollectionStatus status)
    {
        this.status = status;
    }

    public String getDataCollectionGuid()
    {
        return dataCollectionGuid;
    }

    public void setDataCollectionGuid(String dataCollectionGuid)
    {
        this.dataCollectionGuid = dataCollectionGuid;
    }

    public long getStartTimestamp()
    {
        return startTimestamp;
    }

    public void setStartTimestamp(long startTimestamp)
    {
        this.startTimestamp = startTimestamp;
    }

    public long getEndTimestamp()
    {
        return endTimestamp;
    }

    public void setEndTimestamp(long endTimestamp)
    {
        this.endTimestamp = endTimestamp;
    }

    public String getHostname()
    {
        return hostname;
    }

    public void setHostname(String hostname)
    {
        this.hostname = hostname;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getJavaVersion()
    {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion)
    {
        this.javaVersion = javaVersion;
    }

    public String getJavaVendor()
    {
        return javaVendor;
    }

    public void setJavaVendor(String javaVendor)
    {
        this.javaVendor = javaVendor;
    }

    public String getJavaVMName()
    {
        return javaVMName;
    }

    public void setJavaVMName(String javaVMName)
    {
        this.javaVMName = javaVMName;
    }

    public String getOperatingSystem()
    {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem)
    {
        this.operatingSystem = operatingSystem;
    }

    public List<HostNetworkInterface> getNetworkInterfaces()
    {
        return networkInterfaces;
    }

    public void setNetworkInterfaces(List<HostNetworkInterface> networkInterfaces)
    {
        this.networkInterfaces = networkInterfaces;
    }

    /**
     *
     * @param succeeded
     * @param dataCollectionGuid pass null if it was not a multi step push
     */
    public void end(boolean succeeded, String dataCollectionGuid)
    {
        this.endTimestamp = System.currentTimeMillis();
        this.dataCollectionGuid = dataCollectionGuid;
        if(succeeded)
        {
            this.setStatus(DataCollectionStatus.Finished);
        }
        else
        {
            this.setStatus(DataCollectionStatus.Failed);
        }
    }

    public static class HostNetworkInterface
    {
        private transient Logger hniLogger = LoggerFactory.getLogger(HostNetworkInterface.class);
        private List<String> ipAddresses;
        private String interfaceName;
        private String macAddress;
        private String parentName;


        public HostNetworkInterface(NetworkInterface ne)
        {
            this.interfaceName = ne.getDisplayName();
            this.ipAddresses = new ArrayList<>();
            Enumeration<InetAddress> inetAddressEnumeration = ne.getInetAddresses();
            if (inetAddressEnumeration != null)
            {
                while (inetAddressEnumeration.hasMoreElements())
                {
                    InetAddress addr = inetAddressEnumeration.nextElement();
                    this.ipAddresses.add(addr.getHostAddress());
                }
            }
            try
            {
                this.macAddress = formatMacAddress(ne.getHardwareAddress());
            }
            catch (Exception ex)
            {
                hniLogger.error("Error getting host mac address", ex);
            }
            this.interfaceName = ne.getName();
            this.parentName = (ne.getParent()!=null?ne.getParent().getName():null);
        }


        public List<String> getIpAddresses()
        {
            return ipAddresses;
        }

        public void setIpAddresses(List<String> ipAddresses)
        {
            this.ipAddresses = ipAddresses;
        }

        public String getInterfaceName()
        {
            return interfaceName;
        }

        public void setInterfaceName(String interfaceName)
        {
            this.interfaceName = interfaceName;
        }

        public String getMacAddress()
        {
            return macAddress;
        }

        public void setMacAddress(String macAddress)
        {
            this.macAddress = macAddress;
        }

        public String getParentName()
        {
            return parentName;
        }

        public void setParentName(String parentName)
        {
            this.parentName = parentName;
        }

        public String formatMacAddress(byte[] macBytes)
        {
            if(macBytes==null || macBytes.length<1)
            {
                return "";
            }
            StringBuilder sb = new StringBuilder(18);
            for (byte b : macBytes) {
                if (sb.length() > 0)
                    sb.append(':');
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        }
    }

}
