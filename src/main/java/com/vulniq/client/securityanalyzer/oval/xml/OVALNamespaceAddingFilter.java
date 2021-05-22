

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

package com.vulniq.client.securityanalyzer.oval.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

public class OVALNamespaceAddingFilter extends XMLFilterImpl
{
    public static final String OVAL_DEFINITIONS_5_NAMESPACE = "http://oval.mitre.org/XMLSchema/oval-definitions-5";

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException
    {
        if(uri==null || uri.isEmpty() || localName.isEmpty())
        {
            String[] splitName = qName.split(":");
            if(splitName!=null && splitName.length==2)
            {
                localName = qName.split(":")[1];
            }
            super.endElement(OVAL_DEFINITIONS_5_NAMESPACE, localName, qName);
        }
        else
        {
            super.endElement(uri, localName, qName);
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException
    {
        if(uri==null || uri.isEmpty() || localName.isEmpty())
        {
            String[] splitName = qName.split(":");
            if(splitName!=null && splitName.length==2)
            {
                localName = qName.split(":")[1];
            }
            super.startElement(OVAL_DEFINITIONS_5_NAMESPACE, localName, qName, atts);
        }
        else
        {
            super.startElement(uri, localName, qName, atts);
        }
    }
}
