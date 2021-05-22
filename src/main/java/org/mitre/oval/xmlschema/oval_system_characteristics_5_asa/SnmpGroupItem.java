


package org.mitre.oval.xmlschema.oval_system_characteristics_5_asa;

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
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="snmpv3_sec_level" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa}EntityItemSNMPSecLevelStringType" minOccurs="0"/>
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
    "name",
    "snmpv3SecLevel"
})
public class SnmpGroupItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemStringType name;
    @XmlElement(name = "snmpv3_sec_level", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemSNMPSecLevelStringType snmpv3SecLevel;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setName(EntityItemStringType value) {
        this.name = value;
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

}
