


package org.mitre.oval.xmlschema.oval_definitions_5_hpux;

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
 *         &lt;element name="username" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="account_owner" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="boot_auth" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="audit_id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="audit_flag" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pw_change_min" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pw_max_size" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="pw_expiration" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="pw_life" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pw_change_s" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pw_change_u" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="acct_expire" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="max_llogin" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="exp_warning" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="usr_chg_pw" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="gen_pw" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pw_restrict" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pw_null" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pw_gen_char" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pw_gen_let" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="login_time" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pw_changer" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="login_time_s" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="login_time_u" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="login_tty_s" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="login_tty_u" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="num_u_logins" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="max_u_logins" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="lock_flag" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "username",
    "uid",
    "password",
    "accountOwner",
    "bootAuth",
    "auditId",
    "auditFlag",
    "pwChangeMin",
    "pwMaxSize",
    "pwExpiration",
    "pwLife",
    "pwChangeS",
    "pwChangeU",
    "acctExpire",
    "maxLlogin",
    "expWarning",
    "usrChgPw",
    "genPw",
    "pwRestrict",
    "pwNull",
    "pwGenChar",
    "pwGenLet",
    "loginTime",
    "pwChanger",
    "loginTimeS",
    "loginTimeU",
    "loginTtyS",
    "loginTtyU",
    "numULogins",
    "maxULogins",
    "lockFlag"
})
public class TrustedState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType username;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateIntType uid;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType password;
    @XmlElement(name = "account_owner", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateIntType accountOwner;
    @XmlElement(name = "boot_auth", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType bootAuth;
    @XmlElement(name = "audit_id", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType auditId;
    @XmlElement(name = "audit_flag", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType auditFlag;
    @XmlElement(name = "pw_change_min", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType pwChangeMin;
    @XmlElement(name = "pw_max_size", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateIntType pwMaxSize;
    @XmlElement(name = "pw_expiration", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateIntType pwExpiration;
    @XmlElement(name = "pw_life", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType pwLife;
    @XmlElement(name = "pw_change_s", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType pwChangeS;
    @XmlElement(name = "pw_change_u", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType pwChangeU;
    @XmlElement(name = "acct_expire", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateIntType acctExpire;
    @XmlElement(name = "max_llogin", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType maxLlogin;
    @XmlElement(name = "exp_warning", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateIntType expWarning;
    @XmlElement(name = "usr_chg_pw", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType usrChgPw;
    @XmlElement(name = "gen_pw", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType genPw;
    @XmlElement(name = "pw_restrict", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType pwRestrict;
    @XmlElement(name = "pw_null", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType pwNull;
    @XmlElement(name = "pw_gen_char", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType pwGenChar;
    @XmlElement(name = "pw_gen_let", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType pwGenLet;
    @XmlElement(name = "login_time", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType loginTime;
    @XmlElement(name = "pw_changer", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateIntType pwChanger;
    @XmlElement(name = "login_time_s", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType loginTimeS;
    @XmlElement(name = "login_time_u", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType loginTimeU;
    @XmlElement(name = "login_tty_s", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType loginTtyS;
    @XmlElement(name = "login_tty_u", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType loginTtyU;
    @XmlElement(name = "num_u_logins", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateIntType numULogins;
    @XmlElement(name = "max_u_logins", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateIntType maxULogins;
    @XmlElement(name = "lock_flag", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateBoolType lockFlag;

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
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setUid(EntityStateIntType value) {
        this.uid = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPassword(EntityStateStringType value) {
        this.password = value;
    }

    /**
     * Gets the value of the accountOwner property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getAccountOwner() {
        return accountOwner;
    }

    /**
     * Sets the value of the accountOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setAccountOwner(EntityStateIntType value) {
        this.accountOwner = value;
    }

    /**
     * Gets the value of the bootAuth property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getBootAuth() {
        return bootAuth;
    }

    /**
     * Sets the value of the bootAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setBootAuth(EntityStateStringType value) {
        this.bootAuth = value;
    }

    /**
     * Gets the value of the auditId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getAuditId() {
        return auditId;
    }

    /**
     * Sets the value of the auditId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setAuditId(EntityStateStringType value) {
        this.auditId = value;
    }

    /**
     * Gets the value of the auditFlag property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getAuditFlag() {
        return auditFlag;
    }

    /**
     * Sets the value of the auditFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setAuditFlag(EntityStateStringType value) {
        this.auditFlag = value;
    }

    /**
     * Gets the value of the pwChangeMin property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPwChangeMin() {
        return pwChangeMin;
    }

    /**
     * Sets the value of the pwChangeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPwChangeMin(EntityStateStringType value) {
        this.pwChangeMin = value;
    }

    /**
     * Gets the value of the pwMaxSize property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPwMaxSize() {
        return pwMaxSize;
    }

    /**
     * Sets the value of the pwMaxSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPwMaxSize(EntityStateIntType value) {
        this.pwMaxSize = value;
    }

    /**
     * Gets the value of the pwExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPwExpiration() {
        return pwExpiration;
    }

    /**
     * Sets the value of the pwExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPwExpiration(EntityStateIntType value) {
        this.pwExpiration = value;
    }

    /**
     * Gets the value of the pwLife property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPwLife() {
        return pwLife;
    }

    /**
     * Sets the value of the pwLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPwLife(EntityStateStringType value) {
        this.pwLife = value;
    }

    /**
     * Gets the value of the pwChangeS property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPwChangeS() {
        return pwChangeS;
    }

    /**
     * Sets the value of the pwChangeS property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPwChangeS(EntityStateStringType value) {
        this.pwChangeS = value;
    }

    /**
     * Gets the value of the pwChangeU property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPwChangeU() {
        return pwChangeU;
    }

    /**
     * Sets the value of the pwChangeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPwChangeU(EntityStateStringType value) {
        this.pwChangeU = value;
    }

    /**
     * Gets the value of the acctExpire property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getAcctExpire() {
        return acctExpire;
    }

    /**
     * Sets the value of the acctExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setAcctExpire(EntityStateIntType value) {
        this.acctExpire = value;
    }

    /**
     * Gets the value of the maxLlogin property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getMaxLlogin() {
        return maxLlogin;
    }

    /**
     * Sets the value of the maxLlogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setMaxLlogin(EntityStateStringType value) {
        this.maxLlogin = value;
    }

    /**
     * Gets the value of the expWarning property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getExpWarning() {
        return expWarning;
    }

    /**
     * Sets the value of the expWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setExpWarning(EntityStateIntType value) {
        this.expWarning = value;
    }

    /**
     * Gets the value of the usrChgPw property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUsrChgPw() {
        return usrChgPw;
    }

    /**
     * Sets the value of the usrChgPw property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUsrChgPw(EntityStateStringType value) {
        this.usrChgPw = value;
    }

    /**
     * Gets the value of the genPw property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getGenPw() {
        return genPw;
    }

    /**
     * Sets the value of the genPw property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setGenPw(EntityStateStringType value) {
        this.genPw = value;
    }

    /**
     * Gets the value of the pwRestrict property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPwRestrict() {
        return pwRestrict;
    }

    /**
     * Sets the value of the pwRestrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPwRestrict(EntityStateStringType value) {
        this.pwRestrict = value;
    }

    /**
     * Gets the value of the pwNull property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPwNull() {
        return pwNull;
    }

    /**
     * Sets the value of the pwNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPwNull(EntityStateStringType value) {
        this.pwNull = value;
    }

    /**
     * Gets the value of the pwGenChar property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPwGenChar() {
        return pwGenChar;
    }

    /**
     * Sets the value of the pwGenChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPwGenChar(EntityStateStringType value) {
        this.pwGenChar = value;
    }

    /**
     * Gets the value of the pwGenLet property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPwGenLet() {
        return pwGenLet;
    }

    /**
     * Sets the value of the pwGenLet property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPwGenLet(EntityStateStringType value) {
        this.pwGenLet = value;
    }

    /**
     * Gets the value of the loginTime property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLoginTime() {
        return loginTime;
    }

    /**
     * Sets the value of the loginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLoginTime(EntityStateStringType value) {
        this.loginTime = value;
    }

    /**
     * Gets the value of the pwChanger property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPwChanger() {
        return pwChanger;
    }

    /**
     * Sets the value of the pwChanger property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPwChanger(EntityStateIntType value) {
        this.pwChanger = value;
    }

    /**
     * Gets the value of the loginTimeS property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLoginTimeS() {
        return loginTimeS;
    }

    /**
     * Sets the value of the loginTimeS property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLoginTimeS(EntityStateStringType value) {
        this.loginTimeS = value;
    }

    /**
     * Gets the value of the loginTimeU property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLoginTimeU() {
        return loginTimeU;
    }

    /**
     * Sets the value of the loginTimeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLoginTimeU(EntityStateStringType value) {
        this.loginTimeU = value;
    }

    /**
     * Gets the value of the loginTtyS property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLoginTtyS() {
        return loginTtyS;
    }

    /**
     * Sets the value of the loginTtyS property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLoginTtyS(EntityStateStringType value) {
        this.loginTtyS = value;
    }

    /**
     * Gets the value of the loginTtyU property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLoginTtyU() {
        return loginTtyU;
    }

    /**
     * Sets the value of the loginTtyU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLoginTtyU(EntityStateStringType value) {
        this.loginTtyU = value;
    }

    /**
     * Gets the value of the numULogins property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getNumULogins() {
        return numULogins;
    }

    /**
     * Sets the value of the numULogins property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setNumULogins(EntityStateIntType value) {
        this.numULogins = value;
    }

    /**
     * Gets the value of the maxULogins property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxULogins() {
        return maxULogins;
    }

    /**
     * Sets the value of the maxULogins property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxULogins(EntityStateIntType value) {
        this.maxULogins = value;
    }

    /**
     * Gets the value of the lockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setLockFlag(EntityStateBoolType value) {
        this.lockFlag = value;
    }

}
