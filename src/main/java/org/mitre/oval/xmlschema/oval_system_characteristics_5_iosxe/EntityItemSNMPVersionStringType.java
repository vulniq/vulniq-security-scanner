


package org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemSNMPVersionStringType complex type restricts a string
 *                 value to a specific set of values: 1, 2c, 3. These values describe the SNMP version
 *                 in a Cisco IOS-XE configuration. The empty string is also allowed to support empty
 *                 element associated with error conditions.
 * 
 * <p>Java class for EntityItemSNMPVersionStringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemSNMPVersionStringType">
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
@XmlType(name = "EntityItemSNMPVersionStringType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
public class EntityItemSNMPVersionStringType
    extends EntityItemStringType
{


}
