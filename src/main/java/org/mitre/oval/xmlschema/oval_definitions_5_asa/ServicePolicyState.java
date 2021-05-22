
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
 *         &lt;element name="applied" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#asa}EntityStateApplyServicePolicyType" minOccurs="0"/>
 *         &lt;element name="interface" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
public class ServicePolicyState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateStringType name;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateApplyServicePolicyType applied;
    @XmlElement(name = "interface", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateStringType _interface;

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
     * Gets the value of the applied property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateApplyServicePolicyType }
     *     
     */
    public EntityStateApplyServicePolicyType getApplied() {
        return applied;
    }

    /**
     * Sets the value of the applied property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateApplyServicePolicyType }
     *     
     */
    public void setApplied(EntityStateApplyServicePolicyType value) {
        this.applied = value;
    }

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setInterface(EntityStateStringType value) {
        this._interface = value;
    }

}
