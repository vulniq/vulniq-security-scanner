


package org.mitre.oval.xmlschema.oval_system_characteristics_5_hpux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
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
 *         &lt;element name="username" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="account_owner" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="boot_auth" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="audit_id" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="audit_flag" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pw_change_min" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pw_max_size" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="pw_expiration" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="pw_life" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pw_change_s" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pw_change_u" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="acct_expire" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="max_llogin" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="exp_warning" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="usr_chg_pw" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="gen_pw" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pw_restrict" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pw_null" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pw_gen_char" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pw_gen_let" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="login_time" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pw_changer" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="login_time_s" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="login_time_u" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="login_tty_s" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="login_tty_u" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="num_u_logins" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="max_u_logins" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="lock_flag" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
public class TrustedItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType username;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemIntType uid;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType password;
    @XmlElement(name = "account_owner", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemIntType accountOwner;
    @XmlElement(name = "boot_auth", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType bootAuth;
    @XmlElement(name = "audit_id", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType auditId;
    @XmlElement(name = "audit_flag", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType auditFlag;
    @XmlElement(name = "pw_change_min", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType pwChangeMin;
    @XmlElement(name = "pw_max_size", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemIntType pwMaxSize;
    @XmlElement(name = "pw_expiration", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemIntType pwExpiration;
    @XmlElement(name = "pw_life", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType pwLife;
    @XmlElement(name = "pw_change_s", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType pwChangeS;
    @XmlElement(name = "pw_change_u", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType pwChangeU;
    @XmlElement(name = "acct_expire", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemIntType acctExpire;
    @XmlElement(name = "max_llogin", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType maxLlogin;
    @XmlElement(name = "exp_warning", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemIntType expWarning;
    @XmlElement(name = "usr_chg_pw", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType usrChgPw;
    @XmlElement(name = "gen_pw", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType genPw;
    @XmlElement(name = "pw_restrict", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType pwRestrict;
    @XmlElement(name = "pw_null", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType pwNull;
    @XmlElement(name = "pw_gen_char", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType pwGenChar;
    @XmlElement(name = "pw_gen_let", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType pwGenLet;
    @XmlElement(name = "login_time", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType loginTime;
    @XmlElement(name = "pw_changer", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemIntType pwChanger;
    @XmlElement(name = "login_time_s", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType loginTimeS;
    @XmlElement(name = "login_time_u", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType loginTimeU;
    @XmlElement(name = "login_tty_s", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType loginTtyS;
    @XmlElement(name = "login_tty_u", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType loginTtyU;
    @XmlElement(name = "num_u_logins", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemIntType numULogins;
    @XmlElement(name = "max_u_logins", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemIntType maxULogins;
    @XmlElement(name = "lock_flag", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemBoolType lockFlag;

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
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setUid(EntityItemIntType value) {
        this.uid = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPassword(EntityItemStringType value) {
        this.password = value;
    }

    /**
     * Gets the value of the accountOwner property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getAccountOwner() {
        return accountOwner;
    }

    /**
     * Sets the value of the accountOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setAccountOwner(EntityItemIntType value) {
        this.accountOwner = value;
    }

    /**
     * Gets the value of the bootAuth property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getBootAuth() {
        return bootAuth;
    }

    /**
     * Sets the value of the bootAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setBootAuth(EntityItemStringType value) {
        this.bootAuth = value;
    }

    /**
     * Gets the value of the auditId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getAuditId() {
        return auditId;
    }

    /**
     * Sets the value of the auditId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setAuditId(EntityItemStringType value) {
        this.auditId = value;
    }

    /**
     * Gets the value of the auditFlag property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getAuditFlag() {
        return auditFlag;
    }

    /**
     * Sets the value of the auditFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setAuditFlag(EntityItemStringType value) {
        this.auditFlag = value;
    }

    /**
     * Gets the value of the pwChangeMin property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPwChangeMin() {
        return pwChangeMin;
    }

    /**
     * Sets the value of the pwChangeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPwChangeMin(EntityItemStringType value) {
        this.pwChangeMin = value;
    }

    /**
     * Gets the value of the pwMaxSize property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPwMaxSize() {
        return pwMaxSize;
    }

    /**
     * Sets the value of the pwMaxSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPwMaxSize(EntityItemIntType value) {
        this.pwMaxSize = value;
    }

    /**
     * Gets the value of the pwExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPwExpiration() {
        return pwExpiration;
    }

    /**
     * Sets the value of the pwExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPwExpiration(EntityItemIntType value) {
        this.pwExpiration = value;
    }

    /**
     * Gets the value of the pwLife property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPwLife() {
        return pwLife;
    }

    /**
     * Sets the value of the pwLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPwLife(EntityItemStringType value) {
        this.pwLife = value;
    }

    /**
     * Gets the value of the pwChangeS property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPwChangeS() {
        return pwChangeS;
    }

    /**
     * Sets the value of the pwChangeS property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPwChangeS(EntityItemStringType value) {
        this.pwChangeS = value;
    }

    /**
     * Gets the value of the pwChangeU property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPwChangeU() {
        return pwChangeU;
    }

    /**
     * Sets the value of the pwChangeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPwChangeU(EntityItemStringType value) {
        this.pwChangeU = value;
    }

    /**
     * Gets the value of the acctExpire property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getAcctExpire() {
        return acctExpire;
    }

    /**
     * Sets the value of the acctExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setAcctExpire(EntityItemIntType value) {
        this.acctExpire = value;
    }

    /**
     * Gets the value of the maxLlogin property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getMaxLlogin() {
        return maxLlogin;
    }

    /**
     * Sets the value of the maxLlogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setMaxLlogin(EntityItemStringType value) {
        this.maxLlogin = value;
    }

    /**
     * Gets the value of the expWarning property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getExpWarning() {
        return expWarning;
    }

    /**
     * Sets the value of the expWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setExpWarning(EntityItemIntType value) {
        this.expWarning = value;
    }

    /**
     * Gets the value of the usrChgPw property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getUsrChgPw() {
        return usrChgPw;
    }

    /**
     * Sets the value of the usrChgPw property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setUsrChgPw(EntityItemStringType value) {
        this.usrChgPw = value;
    }

    /**
     * Gets the value of the genPw property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getGenPw() {
        return genPw;
    }

    /**
     * Sets the value of the genPw property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setGenPw(EntityItemStringType value) {
        this.genPw = value;
    }

    /**
     * Gets the value of the pwRestrict property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPwRestrict() {
        return pwRestrict;
    }

    /**
     * Sets the value of the pwRestrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPwRestrict(EntityItemStringType value) {
        this.pwRestrict = value;
    }

    /**
     * Gets the value of the pwNull property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPwNull() {
        return pwNull;
    }

    /**
     * Sets the value of the pwNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPwNull(EntityItemStringType value) {
        this.pwNull = value;
    }

    /**
     * Gets the value of the pwGenChar property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPwGenChar() {
        return pwGenChar;
    }

    /**
     * Sets the value of the pwGenChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPwGenChar(EntityItemStringType value) {
        this.pwGenChar = value;
    }

    /**
     * Gets the value of the pwGenLet property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPwGenLet() {
        return pwGenLet;
    }

    /**
     * Sets the value of the pwGenLet property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPwGenLet(EntityItemStringType value) {
        this.pwGenLet = value;
    }

    /**
     * Gets the value of the loginTime property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getLoginTime() {
        return loginTime;
    }

    /**
     * Sets the value of the loginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setLoginTime(EntityItemStringType value) {
        this.loginTime = value;
    }

    /**
     * Gets the value of the pwChanger property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPwChanger() {
        return pwChanger;
    }

    /**
     * Sets the value of the pwChanger property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPwChanger(EntityItemIntType value) {
        this.pwChanger = value;
    }

    /**
     * Gets the value of the loginTimeS property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getLoginTimeS() {
        return loginTimeS;
    }

    /**
     * Sets the value of the loginTimeS property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setLoginTimeS(EntityItemStringType value) {
        this.loginTimeS = value;
    }

    /**
     * Gets the value of the loginTimeU property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getLoginTimeU() {
        return loginTimeU;
    }

    /**
     * Sets the value of the loginTimeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setLoginTimeU(EntityItemStringType value) {
        this.loginTimeU = value;
    }

    /**
     * Gets the value of the loginTtyS property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getLoginTtyS() {
        return loginTtyS;
    }

    /**
     * Sets the value of the loginTtyS property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setLoginTtyS(EntityItemStringType value) {
        this.loginTtyS = value;
    }

    /**
     * Gets the value of the loginTtyU property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getLoginTtyU() {
        return loginTtyU;
    }

    /**
     * Sets the value of the loginTtyU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setLoginTtyU(EntityItemStringType value) {
        this.loginTtyU = value;
    }

    /**
     * Gets the value of the numULogins property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getNumULogins() {
        return numULogins;
    }

    /**
     * Sets the value of the numULogins property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setNumULogins(EntityItemIntType value) {
        this.numULogins = value;
    }

    /**
     * Gets the value of the maxULogins property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxULogins() {
        return maxULogins;
    }

    /**
     * Sets the value of the maxULogins property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxULogins(EntityItemIntType value) {
        this.maxULogins = value;
    }

    /**
     * Gets the value of the lockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setLockFlag(EntityItemBoolType value) {
        this.lockFlag = value;
    }

}
