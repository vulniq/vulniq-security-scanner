


package org.mitre.oval.xmlschema.oval_system_characteristics_5_ios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}ItemType">
 *       &lt;sequence>
 *         &lt;element name="host" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="community_or_user" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios}EntityItemSNMPVersionStringType" minOccurs="0"/>
 *         &lt;element name="snmpv3_sec_level" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios}EntityItemSNMPSecLevelStringType" minOccurs="0"/>
 *         &lt;element name="traps" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "host",
    "communityOrUser",
    "version",
    "snmpv3SecLevel",
    "traps"
})
public class SnmphostItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemStringType host;
    @XmlElement(name = "community_or_user", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemStringType communityOrUser;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemSNMPVersionStringType version;
    @XmlElement(name = "snmpv3_sec_level", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemSNMPSecLevelStringType snmpv3SecLevel;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemStringType traps;

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setHost(EntityItemStringType value) {
        this.host = value;
    }

    /**
     * Gets the value of the communityOrUser property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getCommunityOrUser() {
        return communityOrUser;
    }

    /**
     * Sets the value of the communityOrUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setCommunityOrUser(EntityItemStringType value) {
        this.communityOrUser = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemSNMPVersionStringType }
     *     
     */
    public EntityItemSNMPVersionStringType getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemSNMPVersionStringType }
     *     
     */
    public void setVersion(EntityItemSNMPVersionStringType value) {
        this.version = value;
    }

    /**
     * Gets the value of the snmpv3SecLevel property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemSNMPSecLevelStringType }
     *     
     */
    public EntityItemSNMPSecLevelStringType getSnmpv3SecLevel() {
        return snmpv3SecLevel;
    }

    /**
     * Sets the value of the snmpv3SecLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemSNMPSecLevelStringType }
     *     
     */
    public void setSnmpv3SecLevel(EntityItemSNMPSecLevelStringType value) {
        this.snmpv3SecLevel = value;
    }

    /**
     * Gets the value of the traps property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getTraps() {
        return traps;
    }

    /**
     * Sets the value of the traps property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setTraps(EntityItemStringType value) {
        this.traps = value;
    }

}
