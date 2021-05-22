


package org.mitre.oval.xmlschema.oval_system_characteristics_5_android;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemWifiKeyMgmtType complex type restricts a string value to a specific set of values that name Wi-Fi key management schemes (from android.net.wifi.WifiConfiguration.KeyMgmt). The empty string is also allowed to support empty elements associated with error conditions.
 * 
 * <p>Java class for EntityItemWifiKeyMgmtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemWifiKeyMgmtType">
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
@XmlType(name = "EntityItemWifiKeyMgmtType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
public class EntityItemWifiKeyMgmtType
    extends EntityItemStringType
{


}
