


package org.mitre.oval.xmlschema.oval_definitions_5_independent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * The EntityStateFamilyType complex type defines a string entity value that is restricted to a set of enumerations. Each valid enumeration is a high-level family of system operating system. The empty string is also allowed to support empty elements associated with variable references.
 * 
 * <p>Java class for EntityStateFamilyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityStateFamilyType">
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
@XmlType(name = "EntityStateFamilyType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
public class EntityStateFamilyType
    extends EntityStateStringType
{


}
