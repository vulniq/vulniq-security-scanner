


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
 *         &lt;element name="applied" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa}EntityItemApplyServicePolicyType" minOccurs="0"/>
 *         &lt;element name="interface" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "applied",
    "_interface"
})
public class ServicePolicyItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemStringType name;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemApplyServicePolicyType applied;
    @XmlElement(name = "interface", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemStringType _interface;

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
     * Gets the value of the applied property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemApplyServicePolicyType }
     *     
     */
    public EntityItemApplyServicePolicyType getApplied() {
        return applied;
    }

    /**
     * Sets the value of the applied property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemApplyServicePolicyType }
     *     
     */
    public void setApplied(EntityItemApplyServicePolicyType value) {
        this.applied = value;
    }

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setInterface(EntityItemStringType value) {
        this._interface = value;
    }

}
