


package org.mitre.oval.xmlschema.oval_system_characteristics_5_macos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemPermissionCompareType complex type restricts a string value to more, less, or same which specifies if an actual permission is different than the expected permission (more or less restrictive) or if the permission is the same. The empty string is also allowed to support empty elements associated with error conditions.
 * 
 * <p>Java class for EntityItemPermissionCompareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemPermissionCompareType">
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
@XmlType(name = "EntityItemPermissionCompareType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
public class EntityItemPermissionCompareType
    extends EntityItemStringType
{


}
