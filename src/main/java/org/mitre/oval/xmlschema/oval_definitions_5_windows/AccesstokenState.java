


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

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
 *         &lt;element name="security_principle" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="seassignprimarytokenprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seauditprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sebackupprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sechangenotifyprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="secreateglobalprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="secreatepagefileprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="secreatepermanentprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="secreatesymboliclinkprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="secreatetokenprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sedebugprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seenabledelegationprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seimpersonateprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seincreasebasepriorityprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seincreasequotaprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seincreaseworkingsetprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seloaddriverprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="selockmemoryprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="semachineaccountprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="semanagevolumeprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seprofilesingleprocessprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="serelabelprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seremoteshutdownprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="serestoreprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sesecurityprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seshutdownprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sesyncagentprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sesystemenvironmentprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sesystemprofileprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sesystemtimeprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="setakeownershipprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="setcbprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="setimezoneprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seundockprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seunsolicitedinputprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sebatchlogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seinteractivelogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="senetworklogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seremoteinteractivelogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seservicelogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sedenybatchLogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sedenyinteractivelogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sedenynetworklogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sedenyremoteInteractivelogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sedenyservicelogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="setrustedcredmanaccessnameright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
public class AccesstokenState
    extends StateType
{

    @XmlElement(name = "security_principle", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType securityPrinciple;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType seassignprimarytokenprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType seauditprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType sebackupprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType sechangenotifyprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType secreateglobalprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType secreatepagefileprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType secreatepermanentprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType secreatesymboliclinkprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType secreatetokenprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType sedebugprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType seenabledelegationprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType seimpersonateprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType seincreasebasepriorityprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType seincreasequotaprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType seincreaseworkingsetprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType seloaddriverprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType selockmemoryprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType semachineaccountprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType semanagevolumeprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType seprofilesingleprocessprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType serelabelprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType seremoteshutdownprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType serestoreprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType sesecurityprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType seshutdownprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType sesyncagentprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType sesystemenvironmentprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType sesystemprofileprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType sesystemtimeprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType setakeownershipprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType setcbprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType setimezoneprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType seundockprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType seunsolicitedinputprivilege;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType sebatchlogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType seinteractivelogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType senetworklogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType seremoteinteractivelogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType seservicelogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType sedenybatchLogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType sedenyinteractivelogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType sedenynetworklogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType sedenyremoteInteractivelogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType sedenyservicelogonright;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType setrustedcredmanaccessnameright;

    /**
     * Gets the value of the securityPrinciple property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSecurityPrinciple() {
        return securityPrinciple;
    }

    /**
     * Sets the value of the securityPrinciple property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSecurityPrinciple(EntityStateStringType value) {
        this.securityPrinciple = value;
    }

    /**
     * Gets the value of the seassignprimarytokenprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeassignprimarytokenprivilege() {
        return seassignprimarytokenprivilege;
    }

    /**
     * Sets the value of the seassignprimarytokenprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeassignprimarytokenprivilege(EntityStateBoolType value) {
        this.seassignprimarytokenprivilege = value;
    }

    /**
     * Gets the value of the seauditprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeauditprivilege() {
        return seauditprivilege;
    }

    /**
     * Sets the value of the seauditprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeauditprivilege(EntityStateBoolType value) {
        this.seauditprivilege = value;
    }

    /**
     * Gets the value of the sebackupprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSebackupprivilege() {
        return sebackupprivilege;
    }

    /**
     * Sets the value of the sebackupprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSebackupprivilege(EntityStateBoolType value) {
        this.sebackupprivilege = value;
    }

    /**
     * Gets the value of the sechangenotifyprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSechangenotifyprivilege() {
        return sechangenotifyprivilege;
    }

    /**
     * Sets the value of the sechangenotifyprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSechangenotifyprivilege(EntityStateBoolType value) {
        this.sechangenotifyprivilege = value;
    }

    /**
     * Gets the value of the secreateglobalprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSecreateglobalprivilege() {
        return secreateglobalprivilege;
    }

    /**
     * Sets the value of the secreateglobalprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSecreateglobalprivilege(EntityStateBoolType value) {
        this.secreateglobalprivilege = value;
    }

    /**
     * Gets the value of the secreatepagefileprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSecreatepagefileprivilege() {
        return secreatepagefileprivilege;
    }

    /**
     * Sets the value of the secreatepagefileprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSecreatepagefileprivilege(EntityStateBoolType value) {
        this.secreatepagefileprivilege = value;
    }

    /**
     * Gets the value of the secreatepermanentprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSecreatepermanentprivilege() {
        return secreatepermanentprivilege;
    }

    /**
     * Sets the value of the secreatepermanentprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSecreatepermanentprivilege(EntityStateBoolType value) {
        this.secreatepermanentprivilege = value;
    }

    /**
     * Gets the value of the secreatesymboliclinkprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSecreatesymboliclinkprivilege() {
        return secreatesymboliclinkprivilege;
    }

    /**
     * Sets the value of the secreatesymboliclinkprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSecreatesymboliclinkprivilege(EntityStateBoolType value) {
        this.secreatesymboliclinkprivilege = value;
    }

    /**
     * Gets the value of the secreatetokenprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSecreatetokenprivilege() {
        return secreatetokenprivilege;
    }

    /**
     * Sets the value of the secreatetokenprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSecreatetokenprivilege(EntityStateBoolType value) {
        this.secreatetokenprivilege = value;
    }

    /**
     * Gets the value of the sedebugprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSedebugprivilege() {
        return sedebugprivilege;
    }

    /**
     * Sets the value of the sedebugprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSedebugprivilege(EntityStateBoolType value) {
        this.sedebugprivilege = value;
    }

    /**
     * Gets the value of the seenabledelegationprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeenabledelegationprivilege() {
        return seenabledelegationprivilege;
    }

    /**
     * Sets the value of the seenabledelegationprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeenabledelegationprivilege(EntityStateBoolType value) {
        this.seenabledelegationprivilege = value;
    }

    /**
     * Gets the value of the seimpersonateprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeimpersonateprivilege() {
        return seimpersonateprivilege;
    }

    /**
     * Sets the value of the seimpersonateprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeimpersonateprivilege(EntityStateBoolType value) {
        this.seimpersonateprivilege = value;
    }

    /**
     * Gets the value of the seincreasebasepriorityprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeincreasebasepriorityprivilege() {
        return seincreasebasepriorityprivilege;
    }

    /**
     * Sets the value of the seincreasebasepriorityprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeincreasebasepriorityprivilege(EntityStateBoolType value) {
        this.seincreasebasepriorityprivilege = value;
    }

    /**
     * Gets the value of the seincreasequotaprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeincreasequotaprivilege() {
        return seincreasequotaprivilege;
    }

    /**
     * Sets the value of the seincreasequotaprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeincreasequotaprivilege(EntityStateBoolType value) {
        this.seincreasequotaprivilege = value;
    }

    /**
     * Gets the value of the seincreaseworkingsetprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeincreaseworkingsetprivilege() {
        return seincreaseworkingsetprivilege;
    }

    /**
     * Sets the value of the seincreaseworkingsetprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeincreaseworkingsetprivilege(EntityStateBoolType value) {
        this.seincreaseworkingsetprivilege = value;
    }

    /**
     * Gets the value of the seloaddriverprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeloaddriverprivilege() {
        return seloaddriverprivilege;
    }

    /**
     * Sets the value of the seloaddriverprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeloaddriverprivilege(EntityStateBoolType value) {
        this.seloaddriverprivilege = value;
    }

    /**
     * Gets the value of the selockmemoryprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSelockmemoryprivilege() {
        return selockmemoryprivilege;
    }

    /**
     * Sets the value of the selockmemoryprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSelockmemoryprivilege(EntityStateBoolType value) {
        this.selockmemoryprivilege = value;
    }

    /**
     * Gets the value of the semachineaccountprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSemachineaccountprivilege() {
        return semachineaccountprivilege;
    }

    /**
     * Sets the value of the semachineaccountprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSemachineaccountprivilege(EntityStateBoolType value) {
        this.semachineaccountprivilege = value;
    }

    /**
     * Gets the value of the semanagevolumeprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSemanagevolumeprivilege() {
        return semanagevolumeprivilege;
    }

    /**
     * Sets the value of the semanagevolumeprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSemanagevolumeprivilege(EntityStateBoolType value) {
        this.semanagevolumeprivilege = value;
    }

    /**
     * Gets the value of the seprofilesingleprocessprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeprofilesingleprocessprivilege() {
        return seprofilesingleprocessprivilege;
    }

    /**
     * Sets the value of the seprofilesingleprocessprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeprofilesingleprocessprivilege(EntityStateBoolType value) {
        this.seprofilesingleprocessprivilege = value;
    }

    /**
     * Gets the value of the serelabelprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSerelabelprivilege() {
        return serelabelprivilege;
    }

    /**
     * Sets the value of the serelabelprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSerelabelprivilege(EntityStateBoolType value) {
        this.serelabelprivilege = value;
    }

    /**
     * Gets the value of the seremoteshutdownprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeremoteshutdownprivilege() {
        return seremoteshutdownprivilege;
    }

    /**
     * Sets the value of the seremoteshutdownprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeremoteshutdownprivilege(EntityStateBoolType value) {
        this.seremoteshutdownprivilege = value;
    }

    /**
     * Gets the value of the serestoreprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSerestoreprivilege() {
        return serestoreprivilege;
    }

    /**
     * Sets the value of the serestoreprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSerestoreprivilege(EntityStateBoolType value) {
        this.serestoreprivilege = value;
    }

    /**
     * Gets the value of the sesecurityprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSesecurityprivilege() {
        return sesecurityprivilege;
    }

    /**
     * Sets the value of the sesecurityprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSesecurityprivilege(EntityStateBoolType value) {
        this.sesecurityprivilege = value;
    }

    /**
     * Gets the value of the seshutdownprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeshutdownprivilege() {
        return seshutdownprivilege;
    }

    /**
     * Sets the value of the seshutdownprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeshutdownprivilege(EntityStateBoolType value) {
        this.seshutdownprivilege = value;
    }

    /**
     * Gets the value of the sesyncagentprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSesyncagentprivilege() {
        return sesyncagentprivilege;
    }

    /**
     * Sets the value of the sesyncagentprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSesyncagentprivilege(EntityStateBoolType value) {
        this.sesyncagentprivilege = value;
    }

    /**
     * Gets the value of the sesystemenvironmentprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSesystemenvironmentprivilege() {
        return sesystemenvironmentprivilege;
    }

    /**
     * Sets the value of the sesystemenvironmentprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSesystemenvironmentprivilege(EntityStateBoolType value) {
        this.sesystemenvironmentprivilege = value;
    }

    /**
     * Gets the value of the sesystemprofileprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSesystemprofileprivilege() {
        return sesystemprofileprivilege;
    }

    /**
     * Sets the value of the sesystemprofileprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSesystemprofileprivilege(EntityStateBoolType value) {
        this.sesystemprofileprivilege = value;
    }

    /**
     * Gets the value of the sesystemtimeprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSesystemtimeprivilege() {
        return sesystemtimeprivilege;
    }

    /**
     * Sets the value of the sesystemtimeprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSesystemtimeprivilege(EntityStateBoolType value) {
        this.sesystemtimeprivilege = value;
    }

    /**
     * Gets the value of the setakeownershipprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSetakeownershipprivilege() {
        return setakeownershipprivilege;
    }

    /**
     * Sets the value of the setakeownershipprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSetakeownershipprivilege(EntityStateBoolType value) {
        this.setakeownershipprivilege = value;
    }

    /**
     * Gets the value of the setcbprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSetcbprivilege() {
        return setcbprivilege;
    }

    /**
     * Sets the value of the setcbprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSetcbprivilege(EntityStateBoolType value) {
        this.setcbprivilege = value;
    }

    /**
     * Gets the value of the setimezoneprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSetimezoneprivilege() {
        return setimezoneprivilege;
    }

    /**
     * Sets the value of the setimezoneprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSetimezoneprivilege(EntityStateBoolType value) {
        this.setimezoneprivilege = value;
    }

    /**
     * Gets the value of the seundockprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeundockprivilege() {
        return seundockprivilege;
    }

    /**
     * Sets the value of the seundockprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeundockprivilege(EntityStateBoolType value) {
        this.seundockprivilege = value;
    }

    /**
     * Gets the value of the seunsolicitedinputprivilege property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeunsolicitedinputprivilege() {
        return seunsolicitedinputprivilege;
    }

    /**
     * Sets the value of the seunsolicitedinputprivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeunsolicitedinputprivilege(EntityStateBoolType value) {
        this.seunsolicitedinputprivilege = value;
    }

    /**
     * Gets the value of the sebatchlogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSebatchlogonright() {
        return sebatchlogonright;
    }

    /**
     * Sets the value of the sebatchlogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSebatchlogonright(EntityStateBoolType value) {
        this.sebatchlogonright = value;
    }

    /**
     * Gets the value of the seinteractivelogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeinteractivelogonright() {
        return seinteractivelogonright;
    }

    /**
     * Sets the value of the seinteractivelogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeinteractivelogonright(EntityStateBoolType value) {
        this.seinteractivelogonright = value;
    }

    /**
     * Gets the value of the senetworklogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSenetworklogonright() {
        return senetworklogonright;
    }

    /**
     * Sets the value of the senetworklogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSenetworklogonright(EntityStateBoolType value) {
        this.senetworklogonright = value;
    }

    /**
     * Gets the value of the seremoteinteractivelogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeremoteinteractivelogonright() {
        return seremoteinteractivelogonright;
    }

    /**
     * Sets the value of the seremoteinteractivelogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeremoteinteractivelogonright(EntityStateBoolType value) {
        this.seremoteinteractivelogonright = value;
    }

    /**
     * Gets the value of the seservicelogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeservicelogonright() {
        return seservicelogonright;
    }

    /**
     * Sets the value of the seservicelogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeservicelogonright(EntityStateBoolType value) {
        this.seservicelogonright = value;
    }

    /**
     * Gets the value of the sedenybatchLogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSedenybatchLogonright() {
        return sedenybatchLogonright;
    }

    /**
     * Sets the value of the sedenybatchLogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSedenybatchLogonright(EntityStateBoolType value) {
        this.sedenybatchLogonright = value;
    }

    /**
     * Gets the value of the sedenyinteractivelogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSedenyinteractivelogonright() {
        return sedenyinteractivelogonright;
    }

    /**
     * Sets the value of the sedenyinteractivelogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSedenyinteractivelogonright(EntityStateBoolType value) {
        this.sedenyinteractivelogonright = value;
    }

    /**
     * Gets the value of the sedenynetworklogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSedenynetworklogonright() {
        return sedenynetworklogonright;
    }

    /**
     * Sets the value of the sedenynetworklogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSedenynetworklogonright(EntityStateBoolType value) {
        this.sedenynetworklogonright = value;
    }

    /**
     * Gets the value of the sedenyremoteInteractivelogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSedenyremoteInteractivelogonright() {
        return sedenyremoteInteractivelogonright;
    }

    /**
     * Sets the value of the sedenyremoteInteractivelogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSedenyremoteInteractivelogonright(EntityStateBoolType value) {
        this.sedenyremoteInteractivelogonright = value;
    }

    /**
     * Gets the value of the sedenyservicelogonright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSedenyservicelogonright() {
        return sedenyservicelogonright;
    }

    /**
     * Sets the value of the sedenyservicelogonright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSedenyservicelogonright(EntityStateBoolType value) {
        this.sedenyservicelogonright = value;
    }

    /**
     * Gets the value of the setrustedcredmanaccessnameright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSetrustedcredmanaccessnameright() {
        return setrustedcredmanaccessnameright;
    }

    /**
     * Sets the value of the setrustedcredmanaccessnameright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSetrustedcredmanaccessnameright(EntityStateBoolType value) {
        this.setrustedcredmanaccessnameright = value;
    }

}
