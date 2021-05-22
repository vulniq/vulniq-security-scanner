


package org.mitre.oval.xmlschema.oval_system_characteristics_5_unix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemWaitStatusType complex type restricts a string value to two values, either wait or nowait, that specify whether the server that is invoked by inetd will take over the listening socket associated with the service, and whether once launched, inetd will wait for that server to exit, if ever, before it resumes listening for new service requests. The empty string is also allowed to support empty elements associated with error conditions.
 * 
 * <p>Java class for EntityItemWaitStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemWaitStatusType">
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
@XmlType(name = "EntityItemWaitStatusType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
public class EntityItemWaitStatusType
    extends EntityItemStringType
{


}
