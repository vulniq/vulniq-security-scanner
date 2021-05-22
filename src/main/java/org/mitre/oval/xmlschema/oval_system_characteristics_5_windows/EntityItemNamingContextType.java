


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemNamingContextType restricts a string value to a specific set of values: domain, configuration, and schema. These values describe the different naming context found withing Active Directory. The empty string is also allowed to support empty elements associated with error conditions.
 * 
 * <p>Java class for EntityItemNamingContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemNamingContextType">
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
@XmlType(name = "EntityItemNamingContextType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
public class EntityItemNamingContextType
    extends EntityItemStringType
{


}
