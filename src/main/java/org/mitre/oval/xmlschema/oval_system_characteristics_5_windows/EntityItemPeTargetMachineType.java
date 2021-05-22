


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemPeTargetMachineType enumeration identifies the valid machine targets that can be specified in the PE file header. The empty string is also allowed to support empty elements associated with error conditions.
 * 
 * <p>Java class for EntityItemPeTargetMachineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemPeTargetMachineType">
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
@XmlType(name = "EntityItemPeTargetMachineType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
public class EntityItemPeTargetMachineType
    extends EntityItemStringType
{


}
