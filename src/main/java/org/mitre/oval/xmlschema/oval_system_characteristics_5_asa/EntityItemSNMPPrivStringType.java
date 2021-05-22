


package org.mitre.oval.xmlschema.oval_system_characteristics_5_asa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemSNMPPrivStringType complex type restricts a
 *                 string value to a specific set of values: DES, 3DES, AES128, AES192, and AES256.
 *                 These values describe the encryption algorithm in a Cisco ASA SNMPv3 related
 *                 configurations. The empty string is also allowed to support empty element associated
 *                 with error conditions.
 * 
 * <p>Java class for EntityItemSNMPPrivStringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemSNMPPrivStringType">
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
@XmlType(name = "EntityItemSNMPPrivStringType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
public class EntityItemSNMPPrivStringType
    extends EntityItemStringType
{


}
