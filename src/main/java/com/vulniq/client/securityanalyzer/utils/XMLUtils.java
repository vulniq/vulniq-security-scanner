
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

package com.vulniq.client.securityanalyzer.utils;

import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.events.Attribute;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.util.Iterator;
import javax.xml.xpath.XPathEvaluationResult;

public class XMLUtils
{

    private static Logger logger = LoggerFactory.getLogger(XMLUtils.class);

    /**
     * taken from
     * https://www.owasp.org/index.php/XML_External_Entity_(XXE)_Prevention_Cheat_Sheet#JAXP_DocumentBuilderFactory.2C_SAXParserFactory_and_DOM4J
     */
    public static DocumentBuilderFactory getSafeDocumentBuilderFactory()
    {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        String FEATURE = null;
        try
        {
            // This is the PRIMARY defense. If DTDs (doctypes) are disallowed, almost all XML entity attacks are prevented
            // Xerces 2 only - http://xerces.apache.org/xerces2-j/features.html#disallow-doctype-decl
            FEATURE = "http://apache.org/xml/features/disallow-doctype-decl";
            dbf.setFeature(FEATURE, true);
            /*
            // If you can't completely disable DTDs, then at least do the following:
            // Xerces 1 - http://xerces.apache.org/xerces-j/features.html#external-general-entities
            // Xerces 2 - http://xerces.apache.org/xerces2-j/features.html#external-general-entities
            // JDK7+ - http://xml.org/sax/features/external-general-entities
            FEATURE = "http://xml.org/sax/features/external-general-entities";
            dbf.setFeature(FEATURE, false);

            // Xerces 1 - http://xerces.apache.org/xerces-j/features.html#external-parameter-entities
            // Xerces 2 - http://xerces.apache.org/xerces2-j/features.html#external-parameter-entities
            // JDK7+ - http://xml.org/sax/features/external-parameter-entities
            FEATURE = "http://xml.org/sax/features/external-parameter-entities";
            dbf.setFeature(FEATURE, false);

            // Disable external DTDs as well
            FEATURE = "http://apache.org/xml/features/nonvalidating/load-external-dtd";
            dbf.setFeature(FEATURE, false);

            // and these as well, per Timothy Morgan's 2014 paper: "XML Schema, DTD, and Entity Attacks"
            dbf.setXIncludeAware(false);
            dbf.setExpandEntityReferences(false);

            // And, per Timothy Morgan: "If for some reason support for inline DOCTYPEs are a requirement, then
            // ensure the entity settings are disabled (as shown above) and beware that SSRF attacks
            // (http://cwe.mitre.org/data/definitions/918.html) and denial
            // of service attacks (such as billion laughs or decompression bombs via "jar:") are a risk."
             */

            return dbf;
        }
        catch (ParserConfigurationException e)
        {
            // This should catch a failed setFeature feature
            logger.info("ParserConfigurationException was thrown. The feature '" + FEATURE + "' is probably not supported by your XML processor.");
        }
        return null;
    }

    public static XPath getXPathInstance()
    {
        return XPathFactory.newInstance().newXPath();
    }

    /**
     * returns a string from a query that returns a single node
     *
     * @param xpathInstanceOrNull
     * @param xpathQuery
     * @param xmlNode
     * @return
     */
    public static String getXPathQueryResult(XPath xpathInstanceOrNull, String xpathQuery, Node xmlNode)
    {
        if (xpathInstanceOrNull == null)
        {
            xpathInstanceOrNull = getXPathInstance();
        }
        try
        {
            Node node = (Node) xpathInstanceOrNull.compile(xpathQuery).evaluate(xmlNode, XPathConstants.NODE);
            if (node == null)
            {
                return null;
            }
            return node.getTextContent();
        }
        catch (XPathExpressionException e)
        {
            logger.error("Xpath error: xpathQuery='" + xpathQuery + "'", e);
        }
        return null;
    }

    public static NodeList getXPathQueryResultNodes(XPath xpathInstanceOrNull, String xpathQuery, Node xmlNode)
    {
        if (xpathInstanceOrNull == null)
        {
            xpathInstanceOrNull = getXPathInstance();
        }
        try
        {
            NodeList nodes = (NodeList) xpathInstanceOrNull.compile(xpathQuery).evaluate(xmlNode, XPathConstants.NODESET);
            return nodes;
        }
        catch (XPathExpressionException e)
        {
            logger.error("Xpath error: xpathQuery='" + xpathQuery + "'", e);
        }
        return null;
    }

    public static String getXPathQueryResultMerged(XPath xpathInstanceOrNull, String xpathQuery, Node xmlNode, String glueString)
    {
        if (xpathInstanceOrNull == null)
        {
            xpathInstanceOrNull = getXPathInstance();
        }
        try
        {
            NodeList nodes = (NodeList) xpathInstanceOrNull.compile(xpathQuery).evaluate(xmlNode, XPathConstants.NODESET);
            if (nodes == null)
            {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < nodes.getLength(); i++)
            {
                sb.append(nodes.item(i).getTextContent());
                if (i + 1 < nodes.getLength())
                {
                    sb.append(glueString);
                }
            }
            return sb.toString();
        }
        catch (XPathExpressionException e)
        {
            logger.error("Xpath error: xpathQuery='" + xpathQuery + "'", e);
        }
        return null;
    }
    
    public static String getXPathQueryResultTypeIndependentMerged(XPath xpathInstanceOrNull, String xpathQuery, Node xmlNode, String glueString)
    {
        if (xpathInstanceOrNull == null)
        {
            xpathInstanceOrNull = getXPathInstance();
        }
        try
        {
            XPathEvaluationResult xPathEvaluationResult = xpathInstanceOrNull.compile(xpathQuery).evaluateExpression(xmlNode);
            if (xPathEvaluationResult == null)
            {
                return null;
            }
            if (xPathEvaluationResult.type() == XPathEvaluationResult.XPathResultType.NUMBER)
            {
                BigDecimal strippedValue = new BigDecimal(String.valueOf(xPathEvaluationResult.value())).stripTrailingZeros();
                return strippedValue.toPlainString();
            }
            if (xPathEvaluationResult.type() == XPathEvaluationResult.XPathResultType.STRING)
            {
                return String.valueOf(xPathEvaluationResult.value());
            }
            if (xPathEvaluationResult.type() == XPathEvaluationResult.XPathResultType.BOOLEAN)
            {
                return String.valueOf(xPathEvaluationResult.value());
            }
            else
            {
                NodeList nodes = (NodeList) xpathInstanceOrNull.compile(xpathQuery).evaluate(xmlNode, XPathConstants.NODESET);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < nodes.getLength(); i++)
                {
                    sb.append(nodes.item(i).getTextContent());
                    if (i + 1 < nodes.getLength())
                    {
                        sb.append(glueString);
                    }
                }
                return sb.toString();

            }

        }
        catch (XPathExpressionException e)
        {
            logger.error("Xpath error: xpathQuery='" + xpathQuery + "'", e);
        }
        return null;
    }

    /**
     * returns the textcontents of the first child with the given tag name
     *
     * @param xmlNode
     * @param childTagName
     * @return
     */
    public static String getValueOfChild(Node xmlNode, String childTagName)
    {
        if (xmlNode == null || childTagName == null)
        {
            return null;
        }
        NodeList children = xmlNode.getChildNodes();
        if (children == null || children.getLength() < 1)
        {
            return null;
        }
        for (int i = 0; i < children.getLength(); i++)
        {
            Node child = children.item(i);
            String nodeTagName = child.getLocalName();
            if (nodeTagName == null)
            {
                nodeTagName = child.getNodeName();
            }
            if (childTagName.equals(nodeTagName))
            {
                String rv = child.getTextContent();
                return rv;
            }
        }
        return null;
    }

    public static String getAttributeValue(Node xmlNode, String attributeName)
    {
        if (xmlNode == null || attributeName == null)
        {
            return null;
        }
        NamedNodeMap attrs = xmlNode.getAttributes();
        if (attrs != null)
        {
            Node attributeNode = attrs.getNamedItem(attributeName);
            if (attributeNode != null)
            {
                return attributeNode.getNodeValue();
            }
        }
        return null;
    }

    public static String getAttributeValue(javax.xml.stream.events.StartElement startElement, String attributeName)
    {
        if (startElement == null)
        {
            return null;
        }
        Iterator<Attribute> attrIter = startElement.getAttributes();
        if (attrIter == null)
        {
            return null;
        }
        while (attrIter.hasNext())
        {
            Attribute attribute = attrIter.next();
            if (attributeName.equals(attribute.getName().getLocalPart()))
            {
                return attribute.getValue();
            }
        }
        return null;
    }
}
