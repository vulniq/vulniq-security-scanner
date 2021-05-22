


package org.mitre.oval.xmlschema.oval_system_characteristics_5_macos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemPlistTypeType complex type restricts a string value to the seven values CFString, CFNumber, CFBoolean, CFDate, CFData, CFArray, and CFDictionary that specify the type of the value associated with a property list preference key. The empty string is also allowed to support empty elements associated with error conditions.
 * 
 * <p>Java class for EntityItemPlistTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemPlistTypeType">
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
@XmlType(name = "EntityItemPlistTypeType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
public class EntityItemPlistTypeType
    extends EntityItemStringType
{


}
