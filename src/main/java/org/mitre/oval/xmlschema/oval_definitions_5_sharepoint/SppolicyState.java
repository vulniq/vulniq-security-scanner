


package org.mitre.oval.xmlschema.oval_definitions_5_sharepoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
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
 *         &lt;element name="webappuri" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="urlzone" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint}EntityStateUrlZoneType" minOccurs="0"/>
 *         &lt;element name="displayname" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="issystemuser" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="username" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="policyroletype" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint}EntityStatePolicyRoleType" minOccurs="0"/>
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
public class SppolicyState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType webappuri;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateUrlZoneType urlzone;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType displayname;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType issystemuser;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType username;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStatePolicyRoleType policyroletype;

    /**
     * Gets the value of the webappuri property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getWebappuri() {
        return webappuri;
    }

    /**
     * Sets the value of the webappuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setWebappuri(EntityStateStringType value) {
        this.webappuri = value;
    }

    /**
     * Gets the value of the urlzone property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateUrlZoneType }
     *     
     */
    public EntityStateUrlZoneType getUrlzone() {
        return urlzone;
    }

    /**
     * Sets the value of the urlzone property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateUrlZoneType }
     *     
     */
    public void setUrlzone(EntityStateUrlZoneType value) {
        this.urlzone = value;
    }

    /**
     * Gets the value of the displayname property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getDisplayname() {
        return displayname;
    }

    /**
     * Sets the value of the displayname property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setDisplayname(EntityStateStringType value) {
        this.displayname = value;
    }

    /**
     * Gets the value of the issystemuser property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getIssystemuser() {
        return issystemuser;
    }

    /**
     * Sets the value of the issystemuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setIssystemuser(EntityStateBoolType value) {
        this.issystemuser = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUsername(EntityStateStringType value) {
        this.username = value;
    }

    /**
     * Gets the value of the policyroletype property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePolicyRoleType }
     *     
     */
    public EntityStatePolicyRoleType getPolicyroletype() {
        return policyroletype;
    }

    /**
     * Sets the value of the policyroletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePolicyRoleType }
     *     
     */
    public void setPolicyroletype(EntityStatePolicyRoleType value) {
        this.policyroletype = value;
    }

}
