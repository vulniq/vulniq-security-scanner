
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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.xml;

import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.EntityStateWindowsViewType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FileBehaviors;

public class XMLFileContentProperties
{

    private FileBehaviors behaviors;
    private EntityObjectStringType filePath;
    private EntityObjectStringType path;
    private EntityObjectStringType xpath;
    private EntityObjectStringType filename;
    private EntityStateWindowsViewType windowsView;
    protected String valueOf;

    public FileBehaviors getBehaviors()
    {
        return behaviors;
    }

    public void setBehaviors(FileBehaviors behaviors)
    {
        this.behaviors = behaviors;
    }

    public EntityObjectStringType getFilePath()
    {
        return filePath;
    }

    public void setFilePath(EntityObjectStringType filepath)
    {
        this.filePath = filepath;
    }

    public EntityObjectStringType getPath()
    {
        return path;
    }

    public void setPath(EntityObjectStringType path)
    {
        this.path = path;
    }

    public EntityObjectStringType getXpath()
    {
        return xpath;
    }

    public void setXpath(EntityObjectStringType xpath)
    {
        this.xpath = xpath;
    }

    public EntityObjectStringType getFilename()
    {
        return filename;
    }

    public void setFilename(EntityObjectStringType filename)
    {
        this.filename = filename;
    }

    public EntityStateWindowsViewType getWindowsView()
    {
        return windowsView;
    }

    public void setWindowsView(EntityStateWindowsViewType windowsView)
    {
        this.windowsView = windowsView;
    }

    public String getValueOf()
    {
        return valueOf;
    }

    public void setValueOf(String valueOf)
    {
        this.valueOf = valueOf;
    }

    @Override
    public String toString()
    {
        if (filePath != null && filePath.getValue() != null)
        {
            return "Filepath: " + filePath.getValue().toString().trim();
            
        }
        else if (path != null  && path.getValue() != null && filename != null && filename.getValue() != null)
        {
            return "Path: " + path.getValue().toString().trim() + " "
                    +"Filename: " + filename.getValue().toString().trim();
        }
        else
        {
            return "";
        }
    }
}
