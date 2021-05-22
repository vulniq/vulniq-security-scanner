


package org.mitre.oval.xmlschema.oval_definitions_5_asa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}StateType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="snmpv3_sec_level" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#asa}EntityStateSNMPSecLevelStringType" minOccurs="0"/>
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
public class SnmpGroupState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateStringType name;
    @XmlElement(name = "snmpv3_sec_level", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateSNMPSecLevelStringType snmpv3SecLevel;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setName(EntityStateStringType value) {
        this.name = value;
    }

    /**
     * Gets the value of the snmpv3SecLevel property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateSNMPSecLevelStringType }
     *     
     */
    public EntityStateSNMPSecLevelStringType getSnmpv3SecLevel() {
        return snmpv3SecLevel;
    }

    /**
     * Sets the value of the snmpv3SecLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateSNMPSecLevelStringType }
     *     
     */
    public void setSnmpv3SecLevel(EntityStateSNMPSecLevelStringType value) {
        this.snmpv3SecLevel = value;
    }

}
