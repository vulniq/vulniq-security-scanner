


package org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
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
 *         &lt;element name="webappuri" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="urlzone" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint}EntityItemUrlZoneType" minOccurs="0"/>
 *         &lt;element name="displayname" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="issystemuser" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="username" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="policyroletype" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint}EntityItemPolicyRoleType" minOccurs="0"/>
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
    "webappuri",
    "urlzone",
    "displayname",
    "issystemuser",
    "username",
    "policyroletype"
})
public class SppolicyItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemStringType webappuri;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemUrlZoneType urlzone;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemStringType displayname;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType issystemuser;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemStringType username;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemPolicyRoleType policyroletype;

    /**
     * Gets the value of the webappuri property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getWebappuri() {
        return webappuri;
    }

    /**
     * Sets the value of the webappuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setWebappuri(EntityItemStringType value) {
        this.webappuri = value;
    }

    /**
     * Gets the value of the urlzone property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemUrlZoneType }
     *     
     */
    public EntityItemUrlZoneType getUrlzone() {
        return urlzone;
    }

    /**
     * Sets the value of the urlzone property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemUrlZoneType }
     *     
     */
    public void setUrlzone(EntityItemUrlZoneType value) {
        this.urlzone = value;
    }

    /**
     * Gets the value of the displayname property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getDisplayname() {
        return displayname;
    }

    /**
     * Sets the value of the displayname property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setDisplayname(EntityItemStringType value) {
        this.displayname = value;
    }

    /**
     * Gets the value of the issystemuser property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getIssystemuser() {
        return issystemuser;
    }

    /**
     * Sets the value of the issystemuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setIssystemuser(EntityItemBoolType value) {
        this.issystemuser = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setUsername(EntityItemStringType value) {
        this.username = value;
    }

    /**
     * Gets the value of the policyroletype property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPolicyRoleType }
     *     
     */
    public EntityItemPolicyRoleType getPolicyroletype() {
        return policyroletype;
    }

    /**
     * Sets the value of the policyroletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPolicyRoleType }
     *     
     */
    public void setPolicyroletype(EntityItemPolicyRoleType value) {
        this.policyroletype = value;
    }

}
