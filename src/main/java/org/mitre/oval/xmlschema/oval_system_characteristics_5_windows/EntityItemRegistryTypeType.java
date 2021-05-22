


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemRegistryTypeType defines the different values that are valid for the type entity of a registry item. These values describe the possible types of data stored in a registry key. restricts a string value to a specific set of values that describe the different registry types. The empty string is also allowed as a valid value to support empty emlements associated with error conditions. Please note that the values identified are for the type entity and are not valid values for the datatype attribute. For information about how to encode registry data in OVAL for each of the different types, please visit the registry_item documentation.
 * 
 * <p>Java class for EntityItemRegistryTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemRegistryTypeType">
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
@XmlType(name = "EntityItemRegistryTypeType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
public class EntityItemRegistryTypeType
    extends EntityItemStringType
{


}
