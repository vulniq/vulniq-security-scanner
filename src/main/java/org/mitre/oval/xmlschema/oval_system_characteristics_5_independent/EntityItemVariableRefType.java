


package org.mitre.oval.xmlschema.oval_system_characteristics_5_independent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemVariableRefType complex type defines a string item entity that has a valid OVAL variable id as the value.
 * 
 * <p>Java class for EntityItemVariableRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemVariableRefType">
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
@XmlType(name = "EntityItemVariableRefType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#independent")
public class EntityItemVariableRefType
    extends EntityItemStringType
{


}
