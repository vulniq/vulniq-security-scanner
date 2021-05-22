


package org.mitre.oval.xmlschema.oval_definitions_5_junos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * The EntityStateJunosReleaseTypeType complex type defines the different values that are valid for the release_type entity of a system_metric state. These values describe the release type specified in the raw version string.
 * 
 * <p>Java class for EntityStateJunosReleaseTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityStateJunosReleaseTypeType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateStringType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityStateJunosReleaseTypeType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos")
public class EntityStateJunosReleaseTypeType
    extends EntityStateStringType
{


}
