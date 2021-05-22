


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

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
 *         &lt;element name="netname" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="trustee_sid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "netname",
    "trusteeSid",
    "standardDelete",
    "standardReadControl",
    "standardWriteDac",
    "standardWriteOwner",
    "standardSynchronize",
    "accessSystemSecurity",
    "genericRead",
    "genericWrite",
    "genericExecute",
    "genericAll"
})
public class SharedresourceauditedpermissionsItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType netname;
    @XmlElement(name = "trustee_sid", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType trusteeSid;
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

    /**
     * Gets the value of the netname property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getNetname() {
        return netname;
    }

    /**
     * Sets the value of the netname property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setNetname(EntityItemStringType value) {
        this.netname = value;
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

}
