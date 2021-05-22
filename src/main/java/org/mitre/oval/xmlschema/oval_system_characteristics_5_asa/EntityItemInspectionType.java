


package org.mitre.oval.xmlschema.oval_system_characteristics_5_asa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemInspectionType complex type restricts a string
 *                 value to a specific set of values. These values describe the MPF inspection types of
 *                 class-map and policy-map configurations in Cisco ASA MPF configurations. The empty
 *                 string is also allowed to support empty element associated with error
 *                 conditions.
 * 
 * <p>Java class for EntityItemInspectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemInspectionType">
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
@XmlType(name = "EntityItemInspectionType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
public class EntityItemInspectionType
    extends EntityItemStringType
{


}
