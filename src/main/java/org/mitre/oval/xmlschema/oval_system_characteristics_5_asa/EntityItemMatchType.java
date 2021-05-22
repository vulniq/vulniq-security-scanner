


package org.mitre.oval.xmlschema.oval_system_characteristics_5_asa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemMatchType complex type restricts a string value
 *                 to a specific set of values: ANY, ALL. These values describe the match type of a
 *                 class-map in a Cisco ASA MPF configuration. The empty string is also allowed to
 *                 support empty element associated with error conditions.
 * 
 * <p>Java class for EntityItemMatchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemMatchType">
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
@XmlType(name = "EntityItemMatchType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
public class EntityItemMatchType
    extends EntityItemStringType
{


}
