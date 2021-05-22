


package org.mitre.oval.xmlschema.oval_system_characteristics_5_independent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemFamilyType complex type defines a string entity value that is restricted to a set of enumerations. Each valid enumeration is a high-level family of system operating system.
 * 
 * <p>Java class for EntityItemFamilyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemFamilyType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemStringType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityItemFamilyType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#independent")
public class EntityItemFamilyType
    extends EntityItemStringType
{


}
