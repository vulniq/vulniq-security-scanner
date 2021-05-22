


package org.mitre.oval.xmlschema.oval_system_characteristics_5_unix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemEncryptMethodType complex type restricts a string value to a set that corresponds to the allowed encrypt methods used for protected passwords in a shadow file. The empty string is also allowed to support empty elements associated with error conditions.
 * 
 * <p>Java class for EntityItemEncryptMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemEncryptMethodType">
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
@XmlType(name = "EntityItemEncryptMethodType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
public class EntityItemEncryptMethodType
    extends EntityItemStringType
{


}
