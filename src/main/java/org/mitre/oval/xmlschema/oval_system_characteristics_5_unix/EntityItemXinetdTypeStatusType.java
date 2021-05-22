


package org.mitre.oval.xmlschema.oval_system_characteristics_5_unix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemXinetdTypeStatusType complex type restricts a string value to five values, either RPC, INTERNAL, UNLISTED, TCPMUX, or TCPMUXPLUS that specify the type of service registered in xinetd. The empty string is also allowed to support empty elements associated with error conditions.
 * 
 * <p>Java class for EntityItemXinetdTypeStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemXinetdTypeStatusType">
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
@XmlType(name = "EntityItemXinetdTypeStatusType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
public class EntityItemXinetdTypeStatusType
    extends EntityItemStringType
{


}
