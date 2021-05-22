


package org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemSmfServiceStateType defines the different values that are valid for the service_state entity of a smf_item.  The empty string is also allowed as a valid value to support empty emlements associated with error conditions.
 * 
 * <p>Java class for EntityItemSmfServiceStateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemSmfServiceStateType">
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
@XmlType(name = "EntityItemSmfServiceStateType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
public class EntityItemSmfServiceStateType
    extends EntityItemStringType
{


}
