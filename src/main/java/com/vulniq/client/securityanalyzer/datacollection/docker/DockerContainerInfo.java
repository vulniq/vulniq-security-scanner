

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

package com.vulniq.client.securityanalyzer.datacollection.docker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DockerContainerInfo
{
    private transient Logger logger = LoggerFactory.getLogger(DockerContainerInfo.class);

    private String id;
    private String name;
    private String platform;
    private String imageId;
    private String imageName;
    private String command;
    private List<String> commandArgs;
    private Date created;
    private Date started;
    private Date finished;
    /**
     * port/protocol => host:port
     * 8080/tcp => 0.0.0.0:80
     */
    private List<HostPortMapping> ports;

    private String ipAddress;
    private String gateway;


    public DockerContainerInfo(Map<String, Object> dockerInspectOutput)
    {
        this.id = String.valueOf(dockerInspectOutput.get("Id"));
        this.name = String.valueOf(dockerInspectOutput.get("Name"));
        this.platform = String.valueOf(dockerInspectOutput.get("Platform"));
        this.imageId = String.valueOf(dockerInspectOutput.get("Image"));
        try
        {
            this.imageName = String.valueOf(((Map<String, Object>) dockerInspectOutput.get("Config")).get("Image"));
        }
        catch (Exception ex)
        {
            logger.error("Error getting Config>Image name from docker inspect output", ex);
        }
        this.command = String.valueOf(dockerInspectOutput.get("Path"));
        this.commandArgs = (List<String>) dockerInspectOutput.get("Args");
        this.created = DockerInfoCollector.parseDockerDate(String.valueOf(dockerInspectOutput.get("Created")));
        try
        {
            this.started = DockerInfoCollector.parseDockerDate(String.valueOf(
                    ((Map<String, Object>) dockerInspectOutput.get("State")).get("StartedAt")
            ));
        }
        catch (Exception ex)
        {
            logger.error("Error getting State>StartedAt name from docker inspect output", ex);
        }
        try
        {
            this.finished = DockerInfoCollector.parseDockerDate(String.valueOf(
                    ((Map<String, Object>) dockerInspectOutput.get("State")).get("FinishedAt")
            ));
        }
        catch (Exception ex)
        {
            logger.error("Error getting State>FinishedAt name from docker inspect output", ex);
        }
        try
        {
            this.ipAddress = String.valueOf(
                    ((Map<String, Object>) dockerInspectOutput.get("NetworkSettings")).get("IPAddress")
            );
        }
        catch (Exception ex)
        {
            logger.info("Error getting NetworkSettings>IPAddress name from docker inspect output", ex);
        }
        try
        {
            Map<String, List<Map<String, String>>> portsFromInspect = (Map<String, List<Map<String, String>>>) ((Map<String, Object>) dockerInspectOutput.get("NetworkSettings")).get("Ports");
            this.ports = new LinkedList<>();
            if(portsFromInspect!=null)
            {
                //TODO we are probably losing some stuff here. by converting a list to a single value
                for(String tmpPortProtocol : portsFromInspect.keySet())
                {
                    List<Map<String, String>> detailsForPort = portsFromInspect.get(tmpPortProtocol);
                    if(detailsForPort!=null)
                    {
                        for (Map<String, String> tmpHostPort : portsFromInspect.get(tmpPortProtocol))
                        {
                            this.ports.add(new HostPortMapping(tmpPortProtocol, tmpHostPort));
                        }
                    }
                    else
                    {
                        this.ports.add(new HostPortMapping(tmpPortProtocol, null));
                    }
                }
            }

        }
        catch (Exception ex)
        {
            logger.info("Error getting NetworkSettings>Ports name from docker inspect output", ex);
        }
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPlatform()
    {
        return platform;
    }

    public void setPlatform(String platform)
    {
        this.platform = platform;
    }

    public String getImageId()
    {
        return imageId;
    }

    public void setImageId(String imageId)
    {
        this.imageId = imageId;
    }

    public String getImageName()
    {
        return imageName;
    }

    public void setImageName(String imageName)
    {
        this.imageName = imageName;
    }

    public String getCommand()
    {
        return command;
    }

    public void setCommand(String command)
    {
        this.command = command;
    }

    public List<String> getCommandArgs()
    {
        return commandArgs;
    }

    public void setCommandArgs(List<String> commandArgs)
    {
        this.commandArgs = commandArgs;
    }

    public Date getCreated()
    {
        return created;
    }

    public void setCreated(Date created)
    {
        this.created = created;
    }

    public Date getStarted()
    {
        return started;
    }

    public void setStarted(Date started)
    {
        this.started = started;
    }

    public Date getFinished()
    {
        return finished;
    }

    public void setFinished(Date finished)
    {
        this.finished = finished;
    }

    public List<HostPortMapping> getPorts()
    {
        return ports;
    }

    public void setPorts(List<HostPortMapping> ports)
    {
        this.ports = ports;
    }

    public String getIpAddress()
    {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress)
    {
        this.ipAddress = ipAddress;
    }

    public String getGateway()
    {
        return gateway;
    }

    public void setGateway(String gateway)
    {
        this.gateway = gateway;
    }

    public static class HostPortMapping
    {
        public String port;
        public String protocol;
        public String hostIP;
        public String hostPort;

        public HostPortMapping(String portProtocolSeparatedBySlash, Map<String, String> hostIpPortFromInspect)
        {
            if(portProtocolSeparatedBySlash!=null)
            {
                String[] splitPortProto = portProtocolSeparatedBySlash.split("/");
                if(splitPortProto!=null && splitPortProto.length==2)
                {
                    this.port = splitPortProto[0];
                    this.protocol = splitPortProto[1];
                }
            }
            if(hostIpPortFromInspect!=null)
            {
                this.hostIP = String.valueOf(hostIpPortFromInspect.get("HostIp"));
                this.hostPort = String.valueOf(hostIpPortFromInspect.get("HostPort"));
            }
        }

    }
}
