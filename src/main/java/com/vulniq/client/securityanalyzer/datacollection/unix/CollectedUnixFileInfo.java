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

import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.UnixFileObjectImpl;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class CollectedUnixFileInfo
{
    private transient Logger logger = LoggerFactory.getLogger(CollectedUnixFileInfo.class);
    private boolean exists;
    private String path;
    private String filepath;
    private String filename;
    private String accessRights; //%A   access rights in human readable format
    private String ownerGroupId;    //%g   group ID of owner
    private String ownerGroupName;  // %G   group name of owner
    private String ownerUserId;     //%u   user ID of owner
    private String ownerUserName;   //%U   user name of owner
    private String fileType;    //%F   file type
    private long sizeInBytes;   //%s   total size, in bytes
    private long createdTimestamp;  //%W   time of file birth, seconds since Epoch; 0 if unknown
    private long lastAccessTimestamp;   //%X   time of last access, seconds since Epoch
    private long lastModificationTimestamp;     // %Y   time of last data modification, seconds since Epoch
    private long lastStatusChangeTimestamp;     //%Z   time of last status change, seconds since Epoch

    public CollectedUnixFileInfo()
    {

    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("File:");
        sb.append(filepath);
        if(exists)
        {
            sb.append(" (exists)");
        }
        else
        {
            sb.append(" (not found)");
        }
        sb.append(" (" + sizeInBytes + " bytes)");

        return sb.toString();
    }

    /**
     * "%a\n%F\n%g\n%G\n%n\n%s\n%u\n%U\n%W\n%X\n%Y\n%Z
     * @param cmdOutput
     */
    public CollectedUnixFileInfo(String cmdOutput)
    {
        if(cmdOutput==null || cmdOutput.isEmpty())
        {
            return;
        }
        String[] lines = cmdOutput.split("\\n");
        if(lines.length!=12)
        {
            logger.warn("stat output does not contain 11 lines. Unparsable format.");
            return;
        }
        this.exists = true;
        this.accessRights = lines[0].trim();
        this.fileType = lines[1].trim();
        this.ownerGroupId = lines[2].trim();
        this.ownerGroupName = lines[3].trim();
        if(this.fileType.equals("directory"))
        {
            this.filepath = lines[4].trim();
            this.filename = null;
            this.path = this.filepath;
        }
        else
        {
            this.filepath = lines[4].trim();
            this.filename = this.filepath.substring(this.filepath.lastIndexOf('/') + 1);
            this.path = this.filepath.substring(0, this.filepath.lastIndexOf('/'));
            if(path.equals(""))
            {
                path = lines[4];
            }
        }
        this.sizeInBytes = StringUtils.parseLong(lines[5], 0);
        this.ownerUserId = lines[6];
        this.ownerUserName = lines[7];
        this.createdTimestamp = StringUtils.parseLong(lines[8], 0);
        this.lastAccessTimestamp = StringUtils.parseLong(lines[9], 0);
        this.lastModificationTimestamp = StringUtils.parseLong(lines[10], 0);
        this.lastStatusChangeTimestamp = StringUtils.parseLong(lines[11], 0);

    }

    /**
     * WARNING supports only 'regular file' and 'directory'
     * @param fileObj
     * @param fileAttributes
     */
    public CollectedUnixFileInfo(File fileObj, PosixFileAttributes fileAttributes)
    {
        this.exists = true;
        Set<PosixFilePermission> filePermissionSet = fileAttributes.permissions();
        this.accessRights = PosixFilePermissions.toString(filePermissionSet);
        if(fileObj.isDirectory())
        {
            this.fileType = "directory";
            this.path = fileObj.getAbsolutePath();
            this.filepath = this.path;
        }
        else if(fileObj.isFile())
        {
            this.fileType = "regular file";
            this.path = fileObj.getParent();
            this.filename = fileObj.getName();
            this.filepath = fileObj.getAbsolutePath();
        }
        else
        {
            logger.warn("Unexpected file type at FileInfo constructor for local file=" + fileObj);
        }
        try
        {
            this.ownerGroupId = String.valueOf(Files.getAttribute(fileObj.toPath(), "unix:gid"));
        }
        catch (Exception ex)
        {
            logger.error("Error getting owner group id for file=" + fileObj, ex);
        }
        this.ownerGroupName = fileAttributes.group().getName();
        try
        {
            this.ownerUserId = String.valueOf(Files.getAttribute(fileObj.toPath(), "unix:uid"));
        }
        catch (Exception ex)
        {
            logger.error("Error getting user group id for file=" + fileObj, ex);
        }
        this.ownerUserName = fileAttributes.owner().getName();
        this.sizeInBytes = fileObj.length();
        this.createdTimestamp = fileAttributes.creationTime().toMillis()/1000;
        this.lastAccessTimestamp = fileAttributes.lastAccessTime().toMillis()/1000;
        this.lastModificationTimestamp = fileAttributes.lastModifiedTime().toMillis()/1000;
        try
        {
            this.lastStatusChangeTimestamp = ((FileTime) Files.getAttribute(fileObj.toPath(), "unix:ctime")).toMillis()/1000;
        }
        catch (Exception ex)
        {
            logger.error("Error getting user group id for file=" + fileObj, ex);
        }

    }

    public Boolean getGroupExec()
    {
        if(this.accessRights==null)
        {
            return null;
        }
        if(this.accessRights.length()<10)
        {
            return null;
        }
        if('x'==this.accessRights.charAt(6) || 's'==this.accessRights.charAt(6))
        {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean getGroupRead()
    {
        if(this.accessRights==null)
        {
            return null;
        }
        if(this.accessRights.length()<10)
        {
            return null;
        }
        if('r'==this.accessRights.charAt(4))
        {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean getGroupWrite()
    {
        if(this.accessRights==null)
        {
            return null;
        }
        if(this.accessRights.length()<10)
        {
            return null;
        }
        if('w'==this.accessRights.charAt(5))
        {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean getOtherExec()
    {
        if(this.accessRights==null)
        {
            return null;
        }
        if(this.accessRights.length()<10)
        {
            return null;
        }
        if('x'==this.accessRights.charAt(9))
        {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean getOtherRead()
    {
        if(this.accessRights==null)
        {
            return null;
        }
        if(this.accessRights.length()<10)
        {
            return null;
        }
        if('r'==this.accessRights.charAt(7))
        {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
    public Boolean getOtherWrite()
    {
        if(this.accessRights==null)
        {
            return null;
        }
        if(this.accessRights.length()<10)
        {
            return null;
        }
        if('w'==this.accessRights.charAt(8))
        {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
    public Boolean getSticky()
    {
        if(this.accessRights==null)
        {
            return null;
        }
        if(this.accessRights.length()<10)
        {
            return null;
        }
        if('t'==this.accessRights.charAt(9))
        {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
    public Boolean getSuid()
    {
        if(this.accessRights==null)
        {
            return null;
        }
        if(this.accessRights.length()<10)
        {
            return null;
        }
        if('s'==this.accessRights.charAt(3) || 'S'==this.accessRights.charAt(3))
        {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean getGuid()
    {
        if(this.accessRights==null)
        {
            return null;
        }
        if(this.accessRights.length()<10)
        {
            return null;
        }
        if('s'==this.accessRights.charAt(6) || 'S'==this.accessRights.charAt(6))
        {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean getUExec()
    {
        if(this.accessRights==null)
        {
            return null;
        }
        if(this.accessRights.length()<10)
        {
            return null;
        }
        if('x'==this.accessRights.charAt(3) || 's'==this.accessRights.charAt(3))
        {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean getUread()
    {
        if(this.accessRights==null)
        {
            return null;
        }
        if(this.accessRights.length()<10)
        {
            return null;
        }
        if('r'==this.accessRights.charAt(1))
        {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean getUwrite()
    {
        if(this.accessRights==null)
        {
            return null;
        }
        if(this.accessRights.length()<10)
        {
            return null;
        }
        if('w'==this.accessRights.charAt(2))
        {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public boolean isExists()
    {
        return exists;
    }

    public void setExists(boolean exists)
    {
        this.exists = exists;
    }

    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }

    public String getAccessRights()
    {
        return accessRights;
    }

    public void setAccessRights(String accessRights)
    {
        this.accessRights = accessRights;
    }

    public String getOwnerGroupId()
    {
        return ownerGroupId;
    }

    public void setOwnerGroupId(String ownerGroupId)
    {
        this.ownerGroupId = ownerGroupId;
    }

    public String getOwnerGroupName()
    {
        return ownerGroupName;
    }

    public void setOwnerGroupName(String ownerGroupName)
    {
        this.ownerGroupName = ownerGroupName;
    }

    public String getOwnerUserId()
    {
        return ownerUserId;
    }

    public void setOwnerUserId(String ownerUserId)
    {
        this.ownerUserId = ownerUserId;
    }

    public String getOwnerUserName()
    {
        return ownerUserName;
    }

    public void setOwnerUserName(String ownerUserName)
    {
        this.ownerUserName = ownerUserName;
    }

    public String getFileType()
    {
        return fileType;
    }

    public void setFileType(String fileType)
    {
        this.fileType = fileType;
    }

    public long getSizeInBytes()
    {
        return sizeInBytes;
    }

    public void setSizeInBytes(long sizeInBytes)
    {
        this.sizeInBytes = sizeInBytes;
    }

    public long getCreatedTimestamp()
    {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(long createdTimestamp)
    {
        this.createdTimestamp = createdTimestamp;
    }

    public long getLastAccessTimestamp()
    {
        return lastAccessTimestamp;
    }

    public void setLastAccessTimestamp(long lastAccessTimestamp)
    {
        this.lastAccessTimestamp = lastAccessTimestamp;
    }

    public long getLastModificationTimestamp()
    {
        return lastModificationTimestamp;
    }

    public void setLastModificationTimestamp(long lastModificationTimestamp)
    {
        this.lastModificationTimestamp = lastModificationTimestamp;
    }

    public long getLastStatusChangeTimestamp()
    {
        return lastStatusChangeTimestamp;
    }

    public void setLastStatusChangeTimestamp(long lastStatusChangeTimestamp)
    {
        this.lastStatusChangeTimestamp = lastStatusChangeTimestamp;
    }

    public String getFilepath()
    {
        return filepath;
    }

    public void setFilepath(String filepath)
    {
        this.filepath = filepath;
    }

    public String getFilename()
    {
        return filename;
    }

    public void setFilename(String filename)
    {
        this.filename = filename;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)
        {
            return false;
        }
        if(!(obj instanceof CollectedUnixFileInfo))
        {
            return false;
        }
        if(obj == this)
        {
            return true;
        }
        CollectedUnixFileInfo otherObj = (CollectedUnixFileInfo) obj;
        //if absolute paths are the same then they are the same
        return this.filepath.equals(otherObj.getFilepath());
    }
}
