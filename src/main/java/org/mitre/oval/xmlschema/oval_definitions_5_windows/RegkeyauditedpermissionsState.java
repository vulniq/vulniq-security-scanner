


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

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
 *         &lt;element name="hive" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateRegistryHiveType" minOccurs="0"/>
 *         &lt;element name="key" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="trustee_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="standard_delete" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="standard_read_control" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="standard_write_dac" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="standard_write_owner" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="standard_synchronize" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="access_system_security" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="generic_read" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="generic_write" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="generic_execute" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="generic_all" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="key_query_value" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="key_set_value" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="key_create_sub_key" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="key_enumerate_sub_keys" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="key_notify" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="key_create_link" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="key_wow64_64key" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="key_wow64_32key" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="key_wow64_res" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="windows_view" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateWindowsViewType" minOccurs="0"/>
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
    "hive",
    "key",
    "trusteeName",
    "standardDelete",
    "standardReadControl",
    "standardWriteDac",
    "standardWriteOwner",
    "standardSynchronize",
    "accessSystemSecurity",
    "genericRead",
    "genericWrite",
    "genericExecute",
    "genericAll",
    "keyQueryValue",
    "keySetValue",
    "keyCreateSubKey",
    "keyEnumerateSubKeys",
    "keyNotify",
    "keyCreateLink",
    "keyWow6464Key",
    "keyWow6432Key",
    "keyWow64Res",
    "windowsView"
})
public class RegkeyauditedpermissionsState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateRegistryHiveType hive;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType key;
    @XmlElement(name = "trustee_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType trusteeName;
    @XmlElement(name = "standard_delete", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType standardDelete;
    @XmlElement(name = "standard_read_control", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType standardReadControl;
    @XmlElement(name = "standard_write_dac", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType standardWriteDac;
    @XmlElement(name = "standard_write_owner", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType standardWriteOwner;
    @XmlElement(name = "standard_synchronize", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType standardSynchronize;
    @XmlElement(name = "access_system_security", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType accessSystemSecurity;
    @XmlElement(name = "generic_read", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType genericRead;
    @XmlElement(name = "generic_write", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType genericWrite;
    @XmlElement(name = "generic_execute", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType genericExecute;
    @XmlElement(name = "generic_all", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType genericAll;
    @XmlElement(name = "key_query_value", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType keyQueryValue;
    @XmlElement(name = "key_set_value", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType keySetValue;
    @XmlElement(name = "key_create_sub_key", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType keyCreateSubKey;
    @XmlElement(name = "key_enumerate_sub_keys", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType keyEnumerateSubKeys;
    @XmlElement(name = "key_notify", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType keyNotify;
    @XmlElement(name = "key_create_link", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType keyCreateLink;
    @XmlElement(name = "key_wow64_64key", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType keyWow6464Key;
    @XmlElement(name = "key_wow64_32key", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType keyWow6432Key;
    @XmlElement(name = "key_wow64_res", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType keyWow64Res;
    @XmlElement(name = "windows_view", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateWindowsViewType windowsView;

    /**
     * Gets the value of the hive property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRegistryHiveType }
     *     
     */
    public EntityStateRegistryHiveType getHive() {
        return hive;
    }

    /**
     * Sets the value of the hive property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRegistryHiveType }
     *     
     */
    public void setHive(EntityStateRegistryHiveType value) {
        this.hive = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setKey(EntityStateStringType value) {
        this.key = value;
    }

    /**
     * Gets the value of the trusteeName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getTrusteeName() {
        return trusteeName;
    }

    /**
     * Sets the value of the trusteeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setTrusteeName(EntityStateStringType value) {
        this.trusteeName = value;
    }

    /**
     * Gets the value of the standardDelete property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getStandardDelete() {
        return standardDelete;
    }

    /**
     * Sets the value of the standardDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setStandardDelete(EntityStateAuditType value) {
        this.standardDelete = value;
    }

    /**
     * Gets the value of the standardReadControl property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getStandardReadControl() {
        return standardReadControl;
    }

    /**
     * Sets the value of the standardReadControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setStandardReadControl(EntityStateAuditType value) {
        this.standardReadControl = value;
    }

    /**
     * Gets the value of the standardWriteDac property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getStandardWriteDac() {
        return standardWriteDac;
    }

    /**
     * Sets the value of the standardWriteDac property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setStandardWriteDac(EntityStateAuditType value) {
        this.standardWriteDac = value;
    }

    /**
     * Gets the value of the standardWriteOwner property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getStandardWriteOwner() {
        return standardWriteOwner;
    }

    /**
     * Sets the value of the standardWriteOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setStandardWriteOwner(EntityStateAuditType value) {
        this.standardWriteOwner = value;
    }

    /**
     * Gets the value of the standardSynchronize property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getStandardSynchronize() {
        return standardSynchronize;
    }

    /**
     * Sets the value of the standardSynchronize property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setStandardSynchronize(EntityStateAuditType value) {
        this.standardSynchronize = value;
    }

    /**
     * Gets the value of the accessSystemSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getAccessSystemSecurity() {
        return accessSystemSecurity;
    }

    /**
     * Sets the value of the accessSystemSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setAccessSystemSecurity(EntityStateAuditType value) {
        this.accessSystemSecurity = value;
    }

    /**
     * Gets the value of the genericRead property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getGenericRead() {
        return genericRead;
    }

    /**
     * Sets the value of the genericRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setGenericRead(EntityStateAuditType value) {
        this.genericRead = value;
    }

    /**
     * Gets the value of the genericWrite property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getGenericWrite() {
        return genericWrite;
    }

    /**
     * Sets the value of the genericWrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setGenericWrite(EntityStateAuditType value) {
        this.genericWrite = value;
    }

    /**
     * Gets the value of the genericExecute property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getGenericExecute() {
        return genericExecute;
    }

    /**
     * Sets the value of the genericExecute property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setGenericExecute(EntityStateAuditType value) {
        this.genericExecute = value;
    }

    /**
     * Gets the value of the genericAll property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getGenericAll() {
        return genericAll;
    }

    /**
     * Sets the value of the genericAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setGenericAll(EntityStateAuditType value) {
        this.genericAll = value;
    }

    /**
     * Gets the value of the keyQueryValue property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKeyQueryValue() {
        return keyQueryValue;
    }

    /**
     * Sets the value of the keyQueryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKeyQueryValue(EntityStateAuditType value) {
        this.keyQueryValue = value;
    }

    /**
     * Gets the value of the keySetValue property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKeySetValue() {
        return keySetValue;
    }

    /**
     * Sets the value of the keySetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKeySetValue(EntityStateAuditType value) {
        this.keySetValue = value;
    }

    /**
     * Gets the value of the keyCreateSubKey property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKeyCreateSubKey() {
        return keyCreateSubKey;
    }

    /**
     * Sets the value of the keyCreateSubKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKeyCreateSubKey(EntityStateAuditType value) {
        this.keyCreateSubKey = value;
    }

    /**
     * Gets the value of the keyEnumerateSubKeys property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKeyEnumerateSubKeys() {
        return keyEnumerateSubKeys;
    }

    /**
     * Sets the value of the keyEnumerateSubKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKeyEnumerateSubKeys(EntityStateAuditType value) {
        this.keyEnumerateSubKeys = value;
    }

    /**
     * Gets the value of the keyNotify property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKeyNotify() {
        return keyNotify;
    }

    /**
     * Sets the value of the keyNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKeyNotify(EntityStateAuditType value) {
        this.keyNotify = value;
    }

    /**
     * Gets the value of the keyCreateLink property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKeyCreateLink() {
        return keyCreateLink;
    }

    /**
     * Sets the value of the keyCreateLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKeyCreateLink(EntityStateAuditType value) {
        this.keyCreateLink = value;
    }

    /**
     * Gets the value of the keyWow6464Key property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKeyWow6464Key() {
        return keyWow6464Key;
    }

    /**
     * Sets the value of the keyWow6464Key property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKeyWow6464Key(EntityStateAuditType value) {
        this.keyWow6464Key = value;
    }

    /**
     * Gets the value of the keyWow6432Key property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKeyWow6432Key() {
        return keyWow6432Key;
    }

    /**
     * Sets the value of the keyWow6432Key property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKeyWow6432Key(EntityStateAuditType value) {
        this.keyWow6432Key = value;
    }

    /**
     * Gets the value of the keyWow64Res property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKeyWow64Res() {
        return keyWow64Res;
    }

    /**
     * Sets the value of the keyWow64Res property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKeyWow64Res(EntityStateAuditType value) {
        this.keyWow64Res = value;
    }

    /**
     * Gets the value of the windowsView property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateWindowsViewType }
     *     
     */
    public EntityStateWindowsViewType getWindowsView() {
        return windowsView;
    }

    /**
     * Sets the value of the windowsView property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateWindowsViewType }
     *     
     */
    public void setWindowsView(EntityStateWindowsViewType value) {
        this.windowsView = value;
    }

}
