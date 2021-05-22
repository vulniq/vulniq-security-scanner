


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
 *         &lt;element name="group" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="priv" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa}EntityItemSNMPPrivStringType" minOccurs="0"/>
 *         &lt;element name="auth" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa}EntityItemSNMPAuthStringType" minOccurs="0"/>
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
    "group",
    "priv",
    "auth"
})
public class SnmpUserItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemStringType name;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemStringType group;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemSNMPPrivStringType priv;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemSNMPAuthStringType auth;

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
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setGroup(EntityItemStringType value) {
        this.group = value;
    }

    /**
     * Gets the value of the priv property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemSNMPPrivStringType }
     *     
     */
    public EntityItemSNMPPrivStringType getPriv() {
        return priv;
    }

    /**
     * Sets the value of the priv property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemSNMPPrivStringType }
     *     
     */
    public void setPriv(EntityItemSNMPPrivStringType value) {
        this.priv = value;
    }

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemSNMPAuthStringType }
     *     
     */
    public EntityItemSNMPAuthStringType getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemSNMPAuthStringType }
     *     
     */
    public void setAuth(EntityItemSNMPAuthStringType value) {
        this.auth = value;
    }

}
