


package org.mitre.oval.xmlschema.oval_definitions_5_sharepoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * The EntityStateTraceSeverityType restricts a string value to a set of values that describe the different states that can be configured for a diagnostics level trace severity level property of the diagnostics service.
 * 
 * <p>Java class for EntityStateTraceSeverityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityStateTraceSeverityType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateStringType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityStateTraceSeverityType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
public class EntityStateTraceSeverityType
    extends EntityStateStringType
{


}
