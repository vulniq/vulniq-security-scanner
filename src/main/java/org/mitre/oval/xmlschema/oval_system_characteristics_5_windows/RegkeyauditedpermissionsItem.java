


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="hive" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemRegistryHiveType" minOccurs="0"/>
 *         &lt;element name="key" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="trustee_sid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="trustee_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="standard_delete" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="standard_read_control" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="standard_write_dac" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="standard_write_owner" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="standard_synchronize" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="access_system_security" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="generic_read" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="generic_write" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="generic_execute" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="generic_all" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="key_query_value" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="key_set_value" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="key_create_sub_key" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="key_enumerate_sub_keys" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="key_notify" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="key_create_link" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="key_wow64_64key" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="key_wow64_32key" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="key_wow64_res" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="windows_view" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemWindowsViewType" minOccurs="0"/>
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
    "trusteeSid",
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
public class RegkeyauditedpermissionsItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemRegistryHiveType hive;
    @XmlElementRef(name = "key", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemStringType> key;
    @XmlElement(name = "trustee_sid", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType trusteeSid;
    @XmlElement(name = "trustee_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType trusteeName;
    @XmlElement(name = "standard_delete", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType standardDelete;
    @XmlElement(name = "standard_read_control", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType standardReadControl;
    @XmlElement(name = "standard_write_dac", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType standardWriteDac;
    @XmlElement(name = "standard_write_owner", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType standardWriteOwner;
    @XmlElement(name = "standard_synchronize", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType standardSynchronize;
    @XmlElement(name = "access_system_security", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType accessSystemSecurity;
    @XmlElement(name = "generic_read", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType genericRead;
    @XmlElement(name = "generic_write", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType genericWrite;
    @XmlElement(name = "generic_execute", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType genericExecute;
    @XmlElement(name = "generic_all", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType genericAll;
    @XmlElement(name = "key_query_value", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType keyQueryValue;
    @XmlElement(name = "key_set_value", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType keySetValue;
    @XmlElement(name = "key_create_sub_key", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType keyCreateSubKey;
    @XmlElement(name = "key_enumerate_sub_keys", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType keyEnumerateSubKeys;
    @XmlElement(name = "key_notify", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType keyNotify;
    @XmlElement(name = "key_create_link", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType keyCreateLink;
    @XmlElement(name = "key_wow64_64key", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType keyWow6464Key;
    @XmlElement(name = "key_wow64_32key", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType keyWow6432Key;
    @XmlElement(name = "key_wow64_res", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType keyWow64Res;
    @XmlElement(name = "windows_view", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemWindowsViewType windowsView;

    /**
     * Gets the value of the hive property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRegistryHiveType }
     *     
     */
    public EntityItemRegistryHiveType getHive() {
        return hive;
    }

    /**
     * Sets the value of the hive property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRegistryHiveType }
     *     
     */
    public void setHive(EntityItemRegistryHiveType value) {
        this.hive = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public JAXBElement<EntityItemStringType> getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public void setKey(JAXBElement<EntityItemStringType> value) {
        this.key = value;
    }

    /**
     * Gets the value of the trusteeSid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getTrusteeSid() {
        return trusteeSid;
    }

    /**
     * Sets the value of the trusteeSid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setTrusteeSid(EntityItemStringType value) {
        this.trusteeSid = value;
    }

    /**
     * Gets the value of the trusteeName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getTrusteeName() {
        return trusteeName;
    }

    /**
     * Sets the value of the trusteeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setTrusteeName(EntityItemStringType value) {
        this.trusteeName = value;
    }

    /**
     * Gets the value of the standardDelete property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getStandardDelete() {
        return standardDelete;
    }

    /**
     * Sets the value of the standardDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setStandardDelete(EntityItemAuditType value) {
        this.standardDelete = value;
    }

    /**
     * Gets the value of the standardReadControl property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getStandardReadControl() {
        return standardReadControl;
    }

    /**
     * Sets the value of the standardReadControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setStandardReadControl(EntityItemAuditType value) {
        this.standardReadControl = value;
    }

    /**
     * Gets the value of the standardWriteDac property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getStandardWriteDac() {
        return standardWriteDac;
    }

    /**
     * Sets the value of the standardWriteDac property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setStandardWriteDac(EntityItemAuditType value) {
        this.standardWriteDac = value;
    }

    /**
     * Gets the value of the standardWriteOwner property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getStandardWriteOwner() {
        return standardWriteOwner;
    }

    /**
     * Sets the value of the standardWriteOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setStandardWriteOwner(EntityItemAuditType value) {
        this.standardWriteOwner = value;
    }

    /**
     * Gets the value of the standardSynchronize property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getStandardSynchronize() {
        return standardSynchronize;
    }

    /**
     * Sets the value of the standardSynchronize property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setStandardSynchronize(EntityItemAuditType value) {
        this.standardSynchronize = value;
    }

    /**
     * Gets the value of the accessSystemSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getAccessSystemSecurity() {
        return accessSystemSecurity;
    }

    /**
     * Sets the value of the accessSystemSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setAccessSystemSecurity(EntityItemAuditType value) {
        this.accessSystemSecurity = value;
    }

    /**
     * Gets the value of the genericRead property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getGenericRead() {
        return genericRead;
    }

    /**
     * Sets the value of the genericRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setGenericRead(EntityItemAuditType value) {
        this.genericRead = value;
    }

    /**
     * Gets the value of the genericWrite property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getGenericWrite() {
        return genericWrite;
    }

    /**
     * Sets the value of the genericWrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setGenericWrite(EntityItemAuditType value) {
        this.genericWrite = value;
    }

    /**
     * Gets the value of the genericExecute property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getGenericExecute() {
        return genericExecute;
    }

    /**
     * Sets the value of the genericExecute property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setGenericExecute(EntityItemAuditType value) {
        this.genericExecute = value;
    }

    /**
     * Gets the value of the genericAll property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getGenericAll() {
        return genericAll;
    }

    /**
     * Sets the value of the genericAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setGenericAll(EntityItemAuditType value) {
        this.genericAll = value;
    }

    /**
     * Gets the value of the keyQueryValue property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getKeyQueryValue() {
        return keyQueryValue;
    }

    /**
     * Sets the value of the keyQueryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setKeyQueryValue(EntityItemAuditType value) {
        this.keyQueryValue = value;
    }

    /**
     * Gets the value of the keySetValue property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getKeySetValue() {
        return keySetValue;
    }

    /**
     * Sets the value of the keySetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setKeySetValue(EntityItemAuditType value) {
        this.keySetValue = value;
    }

    /**
     * Gets the value of the keyCreateSubKey property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getKeyCreateSubKey() {
        return keyCreateSubKey;
    }

    /**
     * Sets the value of the keyCreateSubKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setKeyCreateSubKey(EntityItemAuditType value) {
        this.keyCreateSubKey = value;
    }

    /**
     * Gets the value of the keyEnumerateSubKeys property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getKeyEnumerateSubKeys() {
        return keyEnumerateSubKeys;
    }

    /**
     * Sets the value of the keyEnumerateSubKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setKeyEnumerateSubKeys(EntityItemAuditType value) {
        this.keyEnumerateSubKeys = value;
    }

    /**
     * Gets the value of the keyNotify property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getKeyNotify() {
        return keyNotify;
    }

    /**
     * Sets the value of the keyNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setKeyNotify(EntityItemAuditType value) {
        this.keyNotify = value;
    }

    /**
     * Gets the value of the keyCreateLink property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getKeyCreateLink() {
        return keyCreateLink;
    }

    /**
     * Sets the value of the keyCreateLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setKeyCreateLink(EntityItemAuditType value) {
        this.keyCreateLink = value;
    }

    /**
     * Gets the value of the keyWow6464Key property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getKeyWow6464Key() {
        return keyWow6464Key;
    }

    /**
     * Sets the value of the keyWow6464Key property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setKeyWow6464Key(EntityItemAuditType value) {
        this.keyWow6464Key = value;
    }

    /**
     * Gets the value of the keyWow6432Key property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getKeyWow6432Key() {
        return keyWow6432Key;
    }

    /**
     * Sets the value of the keyWow6432Key property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setKeyWow6432Key(EntityItemAuditType value) {
        this.keyWow6432Key = value;
    }

    /**
     * Gets the value of the keyWow64Res property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getKeyWow64Res() {
        return keyWow64Res;
    }

    /**
     * Sets the value of the keyWow64Res property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setKeyWow64Res(EntityItemAuditType value) {
        this.keyWow64Res = value;
    }

    /**
     * Gets the value of the windowsView property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemWindowsViewType }
     *     
     */
    public EntityItemWindowsViewType getWindowsView() {
        return windowsView;
    }

    /**
     * Sets the value of the windowsView property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemWindowsViewType }
     *     
     */
    public void setWindowsView(EntityItemWindowsViewType value) {
        this.windowsView = value;
    }

}
