
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

package com.vulniq.client.securityanalyzer.datacollection.unix;

import com.vulniq.client.securityanalyzer.utils.StringUtils;

public class ProcessProperties
{
    private String cpuTime;
    private String pid;
    private String ppid;
    private String pri;
    private String ruid;
    private String start;
    private String tty;
    private String uid;
    private String sess;
    private String cls;
    private String label;
    private String command;
    private String execShield;
    private String loginuid;
    private String posixCapability;

    public String getPosixCapability()
    {
        return posixCapability;
    }

    public void setPosixCapability(String posixCapability)
    {
        this.posixCapability = posixCapability;
    }

    public String getLoginuid()
    {
        return loginuid;
    }

    public void setLoginuid(String Loginuid)
    {
        this.loginuid = Loginuid;
    }

    public String getExecShield()
    {
        return execShield;
    }

    public void setExecShield(String execShield)
    {
        this.execShield = execShield;
    }

    public String getCommand()
    {
        return command;
    }

    public void setCommand(String command)
    {
        this.command = command;
    }

    public String getCls()
    {
        return cls;
    }

    public void setCls(String cls)
    {
        this.cls = cls;
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel(String label)
    {
        this.label = label;
    }
    

    public String getSess()
    {
        return sess;
    }

    public void setSess(String Sess)
    {
        this.sess = Sess;
    }
    

    public void setCpuTime(String CpuTime)
    {
        this.cpuTime = CpuTime;
    }

    public void setPid(String Pid)
    {
        this.pid = Pid;
    }

    public void setPpid(String Ppid)
    {
        this.ppid = Ppid;
    }

    public void setPri(String Pri)
    {
        this.pri = Pri;
    }

    public void setRuid(String Ruid)
    {
        this.ruid = Ruid;
    }

    public void setStart(String Start)
    {
        this.start = Start;
    }

    public void setTty(String Tty)
    {
        this.tty = Tty;
    }

    public void setUid(String Uid)
    {
        this.uid = Uid;
    }

    public String getCpuTime()
    {
        return cpuTime;
    }

    public String getPid()
    {
        return pid;
    }

    public String getPpid()
    {
        return ppid;
    }

    public String getPri()
    {
        return pri;
    }

    public String getRuid()
    {
        return ruid;
    }

    public String getStart()
    {
        return start;
    }

    public String getTty()
    {
        return tty;
    }

    public String getUid()
    {
        return uid;
    }

    @Override
    public String toString()
    {
        return "Process pid:" + this.pid + " command:" + this.command;
    }

    public String toJson()
    {
        return StringUtils.toJson(this, true);
    }
}
