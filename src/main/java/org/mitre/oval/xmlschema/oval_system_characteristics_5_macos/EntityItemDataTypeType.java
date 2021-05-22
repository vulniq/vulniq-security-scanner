


package org.mitre.oval.xmlschema.oval_system_characteristics_5_macos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemDataTypeType complex type defines the different values that are valid for the data_type entity of a system_profiler item. These values describe the system_profiler XML data to be retrieved. The empty string is also allowed as a valid value to support an empty element that is found when a variable reference is used within the index entity. Note that when using pattern matches and variables care must be taken to ensure that the regular expression and variable values align with the enumerated values. Please note that the values identified are for the data_type entity and are not valid values for the datatype attribute.
 * 
 * <p>Java class for EntityItemDataTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemDataTypeType">
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
@XmlType(name = "EntityItemDataTypeType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
public class EntityItemDataTypeType
    extends EntityItemStringType
{


}
