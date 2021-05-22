
package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

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
 *         &lt;element name="security_principle" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="seassignprimarytokenprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seauditprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sebackupprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sechangenotifyprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="secreateglobalprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="secreatepagefileprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="secreatepermanentprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="secreatesymboliclinkprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="secreatetokenprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sedebugprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seenabledelegationprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seimpersonateprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seincreasebasepriorityprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seincreasequotaprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seincreaseworkingsetprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seloaddriverprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="selockmemoryprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="semachineaccountprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="semanagevolumeprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seprofilesingleprocessprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="serelabelprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seremoteshutdownprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="serestoreprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sesecurityprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seshutdownprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sesyncagentprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sesystemenvironmentprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sesystemprofileprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sesystemtimeprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="setakeownershipprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="setcbprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="setimezoneprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seundockprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seunsolicitedinputprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sebatchlogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seinteractivelogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="senetworklogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seremoteinteractivelogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seservicelogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sedenybatchLogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sedenyinteractivelogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sedenynetworklogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sedenyremoteInteractivelogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sedenyservicelogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="setrustedcredmanaccessnameright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "securityPrinciple",
    "seassignprimarytokenprivilege",
    "seauditprivilege",
    "sebackupprivilege",
    "sechangenotifyprivilege",
    "secreateglobalprivilege",
    "secreatepagefileprivilege",
    "secreatepermanentprivilege",
    "secreatesymboliclinkprivilege",
    "secreatetokenprivilege",
    "sedebugprivilege",
    "seenabledelegationprivilege",
    "seimpersonateprivilege",
    "seincreasebasepriorityprivilege",
    "seincreasequotaprivilege",
    "seincreaseworkingsetprivilege",
    "seloaddriverprivilege",
    "selockmemoryprivilege",
    "semachineaccountprivilege",
    "semanagevolumeprivilege",
    "seprofilesingleprocessprivilege",
    "serelabelprivilege",
    "seremoteshutdownprivilege",
    "serestoreprivilege",
    "sesecurityprivilege",
    "seshutdownprivilege",
    "sesyncagentprivilege",
    "sesystemenvironmentprivilege",
    "sesystemprofileprivilege",
    "sesystemtimeprivilege",
    "setakeownershipprivilege",
    "setcbprivilege",
    "setimezoneprivilege",
    "seundockprivilege",
    "seunsolicitedinputprivilege",
    "sebatchlogonright",
    "seinteractivelogonright",
    "senetworklogonright",
    "seremoteinteractivelogonright",
    "seservicelogonright",
    "sedenybatchLogonright",
    "sedenyinteractivelogonright",
    "sedenynetworklogonright",
    "sedenyremoteInteractivelogonright",
    "sedenyservicelogonright",
    "setrustedcredmanaccessnameright"
})
public class AccesstokenItem
    extends ItemType
{

    @XmlElement(name = "security_principle", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType securityPrinciple;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType seassignprimarytokenprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType seauditprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType sebackupprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType sechangenotifyprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType secreateglobalprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType secreatepagefileprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType secreatepermanentprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType secreatesymboliclinkprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType secreatetokenprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType sedebugprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType seenabledelegationprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType seimpersonateprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType seincreasebasepriorityprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType seincreasequotaprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType seincreaseworkingsetprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType seloaddriverprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType selockmemoryprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType semachineaccountprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType semanagevolumeprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType seprofilesingleprocessprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType serelabelprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType seremoteshutdownprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType serestoreprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType sesecurityprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType seshutdownprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType sesyncagentprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType sesystemenvironmentprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType sesystemprofileprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType sesystemtimeprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType setakeownershipprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType setcbprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType setimezoneprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType seundockprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType seunsolicitedinputprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType sebatchlogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType seinteractivelogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType senetworklogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType seremoteinteractivelogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType seservicelogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType sedenybatchLogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType sedenyinteractivelogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType sedenynetworklogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType sedenyremoteInteractivelogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType sedenyservicelogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType setrustedcredmanaccessnameright;

    /**
     * Gets the value of the securityPrinciple property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSecurityPrinciple() {
        return securityPrinciple;
    }

    /**
     * Sets the value of the securityPrinciple property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSecurityPrinciple(EntityItemStringType value) {
        this.securityPrinciple = value;
    }

    /**
     * Gets the value of the seassignprimarytokenprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeassignprimarytokenprivilege() {
        return seassignprimarytokenprivilege;
    }

    /**
     * Sets the value of the seassignprimarytokenprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeassignprimarytokenprivilege(EntityItemBoolType value) {
        this.seassignprimarytokenprivilege = value;
    }

    /**
     * Gets the value of the seauditprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeauditprivilege() {
        return seauditprivilege;
    }

    /**
     * Sets the value of the seauditprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeauditprivilege(EntityItemBoolType value) {
        this.seauditprivilege = value;
    }

    /**
     * Gets the value of the sebackupprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSebackupprivilege() {
        return sebackupprivilege;
    }

    /**
     * Sets the value of the sebackupprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSebackupprivilege(EntityItemBoolType value) {
        this.sebackupprivilege = value;
    }

    /**
     * Gets the value of the sechangenotifyprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSechangenotifyprivilege() {
        return sechangenotifyprivilege;
    }

    /**
     * Sets the value of the sechangenotifyprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSechangenotifyprivilege(EntityItemBoolType value) {
        this.sechangenotifyprivilege = value;
    }

    /**
     * Gets the value of the secreateglobalprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSecreateglobalprivilege() {
        return secreateglobalprivilege;
    }

    /**
     * Sets the value of the secreateglobalprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSecreateglobalprivilege(EntityItemBoolType value) {
        this.secreateglobalprivilege = value;
    }

    /**
     * Gets the value of the secreatepagefileprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSecreatepagefileprivilege() {
        return secreatepagefileprivilege;
    }

    /**
     * Sets the value of the secreatepagefileprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSecreatepagefileprivilege(EntityItemBoolType value) {
        this.secreatepagefileprivilege = value;
    }

    /**
     * Gets the value of the secreatepermanentprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSecreatepermanentprivilege() {
        return secreatepermanentprivilege;
    }

    /**
     * Sets the value of the secreatepermanentprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSecreatepermanentprivilege(EntityItemBoolType value) {
        this.secreatepermanentprivilege = value;
    }

    /**
     * Gets the value of the secreatesymboliclinkprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSecreatesymboliclinkprivilege() {
        return secreatesymboliclinkprivilege;
    }

    /**
     * Sets the value of the secreatesymboliclinkprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSecreatesymboliclinkprivilege(EntityItemBoolType value) {
        this.secreatesymboliclinkprivilege = value;
    }

    /**
     * Gets the value of the secreatetokenprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSecreatetokenprivilege() {
        return secreatetokenprivilege;
    }

    /**
     * Sets the value of the secreatetokenprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSecreatetokenprivilege(EntityItemBoolType value) {
        this.secreatetokenprivilege = value;
    }

    /**
     * Gets the value of the sedebugprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSedebugprivilege() {
        return sedebugprivilege;
    }

    /**
     * Sets the value of the sedebugprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSedebugprivilege(EntityItemBoolType value) {
        this.sedebugprivilege = value;
    }

    /**
     * Gets the value of the seenabledelegationprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeenabledelegationprivilege() {
        return seenabledelegationprivilege;
    }

    /**
     * Sets the value of the seenabledelegationprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeenabledelegationprivilege(EntityItemBoolType value) {
        this.seenabledelegationprivilege = value;
    }

    /**
     * Gets the value of the seimpersonateprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeimpersonateprivilege() {
        return seimpersonateprivilege;
    }

    /**
     * Sets the value of the seimpersonateprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeimpersonateprivilege(EntityItemBoolType value) {
        this.seimpersonateprivilege = value;
    }

    /**
     * Gets the value of the seincreasebasepriorityprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeincreasebasepriorityprivilege() {
        return seincreasebasepriorityprivilege;
    }

    /**
     * Sets the value of the seincreasebasepriorityprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeincreasebasepriorityprivilege(EntityItemBoolType value) {
        this.seincreasebasepriorityprivilege = value;
    }

    /**
     * Gets the value of the seincreasequotaprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeincreasequotaprivilege() {
        return seincreasequotaprivilege;
    }

    /**
     * Sets the value of the seincreasequotaprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeincreasequotaprivilege(EntityItemBoolType value) {
        this.seincreasequotaprivilege = value;
    }

    /**
     * Gets the value of the seincreaseworkingsetprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeincreaseworkingsetprivilege() {
        return seincreaseworkingsetprivilege;
    }

    /**
     * Sets the value of the seincreaseworkingsetprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeincreaseworkingsetprivilege(EntityItemBoolType value) {
        this.seincreaseworkingsetprivilege = value;
    }

    /**
     * Gets the value of the seloaddriverprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeloaddriverprivilege() {
        return seloaddriverprivilege;
    }

    /**
     * Sets the value of the seloaddriverprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeloaddriverprivilege(EntityItemBoolType value) {
        this.seloaddriverprivilege = value;
    }

    /**
     * Gets the value of the selockmemoryprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSelockmemoryprivilege() {
        return selockmemoryprivilege;
    }

    /**
     * Sets the value of the selockmemoryprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSelockmemoryprivilege(EntityItemBoolType value) {
        this.selockmemoryprivilege = value;
    }

    /**
     * Gets the value of the semachineaccountprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSemachineaccountprivilege() {
        return semachineaccountprivilege;
    }

    /**
     * Sets the value of the semachineaccountprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSemachineaccountprivilege(EntityItemBoolType value) {
        this.semachineaccountprivilege = value;
    }

    /**
     * Gets the value of the semanagevolumeprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSemanagevolumeprivilege() {
        return semanagevolumeprivilege;
    }

    /**
     * Sets the value of the semanagevolumeprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSemanagevolumeprivilege(EntityItemBoolType value) {
        this.semanagevolumeprivilege = value;
    }

    /**
     * Gets the value of the seprofilesingleprocessprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeprofilesingleprocessprivilege() {
        return seprofilesingleprocessprivilege;
    }

    /**
     * Sets the value of the seprofilesingleprocessprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeprofilesingleprocessprivilege(EntityItemBoolType value) {
        this.seprofilesingleprocessprivilege = value;
    }

    /**
     * Gets the value of the serelabelprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSerelabelprivilege() {
        return serelabelprivilege;
    }

    /**
     * Sets the value of the serelabelprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSerelabelprivilege(EntityItemBoolType value) {
        this.serelabelprivilege = value;
    }

    /**
     * Gets the value of the seremoteshutdownprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeremoteshutdownprivilege() {
        return seremoteshutdownprivilege;
    }

    /**
     * Sets the value of the seremoteshutdownprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeremoteshutdownprivilege(EntityItemBoolType value) {
        this.seremoteshutdownprivilege = value;
    }

    /**
     * Gets the value of the serestoreprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSerestoreprivilege() {
        return serestoreprivilege;
    }

    /**
     * Sets the value of the serestoreprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSerestoreprivilege(EntityItemBoolType value) {
        this.serestoreprivilege = value;
    }

    /**
     * Gets the value of the sesecurityprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSesecurityprivilege() {
        return sesecurityprivilege;
    }

    /**
     * Sets the value of the sesecurityprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSesecurityprivilege(EntityItemBoolType value) {
        this.sesecurityprivilege = value;
    }

    /**
     * Gets the value of the seshutdownprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeshutdownprivilege() {
        return seshutdownprivilege;
    }

    /**
     * Sets the value of the seshutdownprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeshutdownprivilege(EntityItemBoolType value) {
        this.seshutdownprivilege = value;
    }

    /**
     * Gets the value of the sesyncagentprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSesyncagentprivilege() {
        return sesyncagentprivilege;
    }

    /**
     * Sets the value of the sesyncagentprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSesyncagentprivilege(EntityItemBoolType value) {
        this.sesyncagentprivilege = value;
    }

    /**
     * Gets the value of the sesystemenvironmentprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSesystemenvironmentprivilege() {
        return sesystemenvironmentprivilege;
    }

    /**
     * Sets the value of the sesystemenvironmentprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSesystemenvironmentprivilege(EntityItemBoolType value) {
        this.sesystemenvironmentprivilege = value;
    }

    /**
     * Gets the value of the sesystemprofileprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSesystemprofileprivilege() {
        return sesystemprofileprivilege;
    }

    /**
     * Sets the value of the sesystemprofileprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSesystemprofileprivilege(EntityItemBoolType value) {
        this.sesystemprofileprivilege = value;
    }

    /**
     * Gets the value of the sesystemtimeprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSesystemtimeprivilege() {
        return sesystemtimeprivilege;
    }

    /**
     * Sets the value of the sesystemtimeprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSesystemtimeprivilege(EntityItemBoolType value) {
        this.sesystemtimeprivilege = value;
    }

    /**
     * Gets the value of the setakeownershipprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSetakeownershipprivilege() {
        return setakeownershipprivilege;
    }

    /**
     * Sets the value of the setakeownershipprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSetakeownershipprivilege(EntityItemBoolType value) {
        this.setakeownershipprivilege = value;
    }

    /**
     * Gets the value of the setcbprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSetcbprivilege() {
        return setcbprivilege;
    }

    /**
     * Sets the value of the setcbprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSetcbprivilege(EntityItemBoolType value) {
        this.setcbprivilege = value;
    }

    /**
     * Gets the value of the setimezoneprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSetimezoneprivilege() {
        return setimezoneprivilege;
    }

    /**
     * Sets the value of the setimezoneprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSetimezoneprivilege(EntityItemBoolType value) {
        this.setimezoneprivilege = value;
    }

    /**
     * Gets the value of the seundockprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeundockprivilege() {
        return seundockprivilege;
    }

    /**
     * Sets the value of the seundockprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeundockprivilege(EntityItemBoolType value) {
        this.seundockprivilege = value;
    }

    /**
     * Gets the value of the seunsolicitedinputprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeunsolicitedinputprivilege() {
        return seunsolicitedinputprivilege;
    }

    /**
     * Sets the value of the seunsolicitedinputprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeunsolicitedinputprivilege(EntityItemBoolType value) {
        this.seunsolicitedinputprivilege = value;
    }

    /**
     * Gets the value of the sebatchlogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSebatchlogonright() {
        return sebatchlogonright;
    }

    /**
     * Sets the value of the sebatchlogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSebatchlogonright(EntityItemBoolType value) {
        this.sebatchlogonright = value;
    }

    /**
     * Gets the value of the seinteractivelogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeinteractivelogonright() {
        return seinteractivelogonright;
    }

    /**
     * Sets the value of the seinteractivelogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeinteractivelogonright(EntityItemBoolType value) {
        this.seinteractivelogonright = value;
    }

    /**
     * Gets the value of the senetworklogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSenetworklogonright() {
        return senetworklogonright;
    }

    /**
     * Sets the value of the senetworklogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSenetworklogonright(EntityItemBoolType value) {
        this.senetworklogonright = value;
    }

    /**
     * Gets the value of the seremoteinteractivelogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeremoteinteractivelogonright() {
        return seremoteinteractivelogonright;
    }

    /**
     * Sets the value of the seremoteinteractivelogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeremoteinteractivelogonright(EntityItemBoolType value) {
        this.seremoteinteractivelogonright = value;
    }

    /**
     * Gets the value of the seservicelogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeservicelogonright() {
        return seservicelogonright;
    }

    /**
     * Sets the value of the seservicelogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeservicelogonright(EntityItemBoolType value) {
        this.seservicelogonright = value;
    }

    /**
     * Gets the value of the sedenybatchLogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSedenybatchLogonright() {
        return sedenybatchLogonright;
    }

    /**
     * Sets the value of the sedenybatchLogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSedenybatchLogonright(EntityItemBoolType value) {
        this.sedenybatchLogonright = value;
    }

    /**
     * Gets the value of the sedenyinteractivelogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSedenyinteractivelogonright() {
        return sedenyinteractivelogonright;
    }

    /**
     * Sets the value of the sedenyinteractivelogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSedenyinteractivelogonright(EntityItemBoolType value) {
        this.sedenyinteractivelogonright = value;
    }

    /**
     * Gets the value of the sedenynetworklogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSedenynetworklogonright() {
        return sedenynetworklogonright;
    }

    /**
     * Sets the value of the sedenynetworklogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSedenynetworklogonright(EntityItemBoolType value) {
        this.sedenynetworklogonright = value;
    }

    /**
     * Gets the value of the sedenyremoteInteractivelogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSedenyremoteInteractivelogonright() {
        return sedenyremoteInteractivelogonright;
    }

    /**
     * Sets the value of the sedenyremoteInteractivelogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSedenyremoteInteractivelogonright(EntityItemBoolType value) {
        this.sedenyremoteInteractivelogonright = value;
    }

    /**
     * Gets the value of the sedenyservicelogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSedenyservicelogonright() {
        return sedenyservicelogonright;
    }

    /**
     * Sets the value of the sedenyservicelogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSedenyservicelogonright(EntityItemBoolType value) {
        this.sedenyservicelogonright = value;
    }

    /**
     * Gets the value of the setrustedcredmanaccessnameright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSetrustedcredmanaccessnameright() {
        return setrustedcredmanaccessnameright;
    }

    /**
     * Sets the value of the setrustedcredmanaccessnameright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSetrustedcredmanaccessnameright(EntityItemBoolType value) {
        this.setrustedcredmanaccessnameright = value;
    }

}
