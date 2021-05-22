


package org.mitre.oval.xmlschema.oval_system_characteristics_5_junos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemJunosReleaseTypeType complex type defines the different values that are valid for the release_type entity of a system_metric state. These values describe the release type specified in the raw version string.
 * 
 * <p>Java class for EntityItemJunosReleaseTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemJunosReleaseTypeType">
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
@XmlType(name = "EntityItemJunosReleaseTypeType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#junos")
public class EntityItemJunosReleaseTypeType
    extends EntityItemStringType
{


}
