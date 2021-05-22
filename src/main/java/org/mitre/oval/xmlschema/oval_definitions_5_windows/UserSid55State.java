


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
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
 *         &lt;element name="user_sid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="group_sid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="last_logon" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
    "userSid",
    "enabled",
    "groupSid",
    "lastLogon"
})
public class UserSid55State
    extends StateType
{

    @XmlElement(name = "user_sid", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType userSid;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType enabled;
    @XmlElement(name = "group_sid", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType groupSid;
    @XmlElement(name = "last_logon", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType lastLogon;

    /**
     * Gets the value of the userSid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUserSid() {
        return userSid;
    }

    /**
     * Sets the value of the userSid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUserSid(EntityStateStringType value) {
        this.userSid = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setEnabled(EntityStateBoolType value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the groupSid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getGroupSid() {
        return groupSid;
    }

    /**
     * Sets the value of the groupSid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setGroupSid(EntityStateStringType value) {
        this.groupSid = value;
    }

    /**
     * Gets the value of the lastLogon property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getLastLogon() {
        return lastLogon;
    }

    /**
     * Sets the value of the lastLogon property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setLastLogon(EntityStateIntType value) {
        this.lastLogon = value;
    }

}
