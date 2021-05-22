


package org.mitre.oval.xmlschema.oval_system_characteristics_5_aix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityStateFixInstallationStatusType defines the different values that are valid for the installation_status entity of a fix_state item.  The empty string is also allowed as a valid value to support empty emlements associated with error conditions.
 * 
 * <p>Java class for EntityItemFixInstallationStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemFixInstallationStatusType">
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
@XmlType(name = "EntityItemFixInstallationStatusType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix")
public class EntityItemFixInstallationStatusType
    extends EntityItemStringType
{


}
