
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

package com.vulniq.client.securityanalyzer.datacollection.windows;

import java.util.List;

public class CollectedWindowsFileInfo
{

    private String filepath;
    private String path;
    private String filename;
    private String owner;
    private String size;
    private String aTime;
    private String cTime;
    private String mTime;
    private String msChecksum;
    private String version;
    private String type;
    private List<String> attribute;
    private String developmentClass;
    private String company;
    private String internalName;
    private String language;
    private String originalFilename;
    private String productName;
    private String productVersion;
    private String windowsView;
    
    @Override
    public boolean equals(Object o) //TODO: For now this method ignores aTime property since the access time is not possible to be equal most likely.
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        
        CollectedWindowsFileInfo that = (CollectedWindowsFileInfo) o;
        
        if (filepath != null ? !filepath.equals(that.filepath) : that.filepath != null)
        {
            return false;
        }
        if (path != null ? !path.equals(that.path) : that.path != null)
        {
            return false;
        }
        if (filename != null ? !filename.equals(that.filename) : that.filename != null)
        {
            return false;
        }
        if (owner != null ? !owner.equals(that.owner) : that.owner != null)
        {
            return false;
        }
        if (size != null ? !size.equals(that.size) : that.size != null)
        {
            return false;
        }
        if (cTime != null ? !cTime.equals(that.cTime) : that.cTime != null)
        {
            return false;
        }
        if (mTime != null ? !mTime.equals(that.mTime) : that.mTime != null)
        {
            return false;
        }
        if (msChecksum != null ? !msChecksum.equals(that.msChecksum) : that.msChecksum != null)
        {
            return false;
        }
        if (version != null ? !version.equals(that.version) : that.version != null)
        {
            return false;
        }
        if (type != null ? !type.equals(that.type) : that.type != null)
        {
            return false;
        }
        if (attribute != null ? !attribute.equals(that.attribute) : that.attribute != null)
        {
            return false;
        }
        if (developmentClass != null ? !developmentClass.equals(that.developmentClass) : that.developmentClass != null)
        {
            return false;
        }
        if (company != null ? !company.equals(that.company) : that.company != null)
        {
            return false;
        }
        if (internalName != null ? !internalName.equals(that.internalName) : that.internalName != null)
        {
            return false;
        }
        if (language != null ? !language.equals(that.language) : that.language != null)
        {
            return false;
        }
        if (originalFilename != null ? !originalFilename.equals(that.originalFilename) : that.originalFilename != null)
        {
            return false;
        }
        if (productName != null ? !productName.equals(that.productName) : that.productName != null)
        {
            return false;
        }
        if (productVersion != null ? !productVersion.equals(that.productVersion) : that.productVersion != null)
        {
            return false;
        }
        return windowsView != null ? windowsView.equals(that.windowsView) : that.windowsView == null;
    }
    
    @Override
    public String toString()
    {
        if(filepath == null || filepath.trim().equals(""))
        {
            return "File path: " + path + ", name: " + filename;
        }
        else
        {
            return "File filepath: " + filepath;
        }
    }
    
    @Override
    public int hashCode() //TODO: For now this method ignores aTime property since the access time property is assumed to not affect hashCode behavior.
    {
        int result = filepath != null ? filepath.hashCode() : 0;
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (cTime != null ? cTime.hashCode() : 0);
        result = 31 * result + (mTime != null ? mTime.hashCode() : 0);
        result = 31 * result + (msChecksum != null ? msChecksum.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (attribute != null ? attribute.hashCode() : 0);
        result = 31 * result + (developmentClass != null ? developmentClass.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (internalName != null ? internalName.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (originalFilename != null ? originalFilename.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productVersion != null ? productVersion.hashCode() : 0);
        result = 31 * result + (windowsView != null ? windowsView.hashCode() : 0);
        return result;
    }
    
    public String getFilepath()
    {
        return filepath;
    }

    public void setFilepath(String filepath)
    {
        this.filepath = filepath;
    }

    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }

    public String getFilename()
    {
        return filename;
    }

    public void setFilename(String filename)
    {
        this.filename = filename;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public String getaTime()
    {
        return aTime;
    }

    public void setaTime(String aTime)
    {
        this.aTime = aTime;
    }

    public String getcTime()
    {
        return cTime;
    }

    public void setcTime(String cTime)
    {
        this.cTime = cTime;
    }

    public String getmTime()
    {
        return mTime;
    }

    public void setmTime(String mTime)
    {
        this.mTime = mTime;
    }

    public String getMsChecksum()
    {
        return msChecksum;
    }

    public void setMsChecksum(String msChecksum)
    {
        this.msChecksum = msChecksum;
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public List<String> getAttribute()
    {
        return attribute;
    }

    public void setAttribute(List<String> attribute)
    {
        this.attribute = attribute;
    }

    public String getDevelopmentClass()
    {
        return developmentClass;
    }

    public void setDevelopmentClass(String developmentClass)
    {
        this.developmentClass = developmentClass;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public String getInternalName()
    {
        return internalName;
    }

    public void setInternalName(String internalName)
    {
        this.internalName = internalName;
    }

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage(String language)
    {
        this.language = language;
    }

    public String getOriginalFilename()
    {
        return originalFilename;
    }

    public void setOriginalFilename(String originalFilename)
    {
        this.originalFilename = originalFilename;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getProductVersion()
    {
        return productVersion;
    }

    public void setProductVersion(String productVersion)
    {
        this.productVersion = productVersion;
    }

    public String getWindowsView()
    {
        return windowsView;
    }

    public void setWindowsView(String windowsView)
    {
        this.windowsView = windowsView;
    }

}
