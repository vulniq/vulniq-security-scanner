


package org.mitre.oval.xmlschema.oval_system_characteristics_5_independent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemLdaptypeType complex type restricts a string value to a specific set of values that specify the different types of information that an ldap attribute can represent. The empty string value is permitted here to allow for detailed error reporting.
 * 
 * <p>Java class for EntityItemLdaptypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemLdaptypeType">
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
@XmlType(name = "EntityItemLdaptypeType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#independent")
public class EntityItemLdaptypeType
    extends EntityItemStringType
{


}
