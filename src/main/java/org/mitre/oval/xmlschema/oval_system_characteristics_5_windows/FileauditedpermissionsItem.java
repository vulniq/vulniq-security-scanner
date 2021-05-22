


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
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="path" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="filename" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
 *         &lt;element name="file_read_data" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="file_write_data" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="file_append_data" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="file_read_ea" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="file_write_ea" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="file_execute" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="file_delete_child" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="file_read_attributes" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="file_write_attributes" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
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
    "filepath",
    "path",
    "filename",
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
    "fileReadData",
    "fileWriteData",
    "fileAppendData",
    "fileReadEa",
    "fileWriteEa",
    "fileExecute",
    "fileDeleteChild",
    "fileReadAttributes",
    "fileWriteAttributes",
    "windowsView"
})
public class FileauditedpermissionsItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType filepath;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType path;
    @XmlElementRef(name = "filename", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemStringType> filename;
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
    @XmlElement(name = "file_read_data", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType fileReadData;
    @XmlElement(name = "file_write_data", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType fileWriteData;
    @XmlElement(name = "file_append_data", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType fileAppendData;
    @XmlElement(name = "file_read_ea", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType fileReadEa;
    @XmlElement(name = "file_write_ea", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType fileWriteEa;
    @XmlElement(name = "file_execute", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType fileExecute;
    @XmlElement(name = "file_delete_child", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType fileDeleteChild;
    @XmlElement(name = "file_read_attributes", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType fileReadAttributes;
    @XmlElement(name = "file_write_attributes", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType fileWriteAttributes;
    @XmlElement(name = "windows_view", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemWindowsViewType windowsView;

    /**
     * Gets the value of the filepath property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getFilepath() {
        return filepath;
    }

    /**
     * Sets the value of the filepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setFilepath(EntityItemStringType value) {
        this.filepath = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPath(EntityItemStringType value) {
        this.path = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public JAXBElement<EntityItemStringType> getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public void setFilename(JAXBElement<EntityItemStringType> value) {
        this.filename = value;
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
     * Gets the value of the fileReadData property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFileReadData() {
        return fileReadData;
    }

    /**
     * Sets the value of the fileReadData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFileReadData(EntityItemAuditType value) {
        this.fileReadData = value;
    }

    /**
     * Gets the value of the fileWriteData property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFileWriteData() {
        return fileWriteData;
    }

    /**
     * Sets the value of the fileWriteData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFileWriteData(EntityItemAuditType value) {
        this.fileWriteData = value;
    }

    /**
     * Gets the value of the fileAppendData property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFileAppendData() {
        return fileAppendData;
    }

    /**
     * Sets the value of the fileAppendData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFileAppendData(EntityItemAuditType value) {
        this.fileAppendData = value;
    }

    /**
     * Gets the value of the fileReadEa property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFileReadEa() {
        return fileReadEa;
    }

    /**
     * Sets the value of the fileReadEa property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFileReadEa(EntityItemAuditType value) {
        this.fileReadEa = value;
    }

    /**
     * Gets the value of the fileWriteEa property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFileWriteEa() {
        return fileWriteEa;
    }

    /**
     * Sets the value of the fileWriteEa property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFileWriteEa(EntityItemAuditType value) {
        this.fileWriteEa = value;
    }

    /**
     * Gets the value of the fileExecute property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFileExecute() {
        return fileExecute;
    }

    /**
     * Sets the value of the fileExecute property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFileExecute(EntityItemAuditType value) {
        this.fileExecute = value;
    }

    /**
     * Gets the value of the fileDeleteChild property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFileDeleteChild() {
        return fileDeleteChild;
    }

    /**
     * Sets the value of the fileDeleteChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFileDeleteChild(EntityItemAuditType value) {
        this.fileDeleteChild = value;
    }

    /**
     * Gets the value of the fileReadAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFileReadAttributes() {
        return fileReadAttributes;
    }

    /**
     * Sets the value of the fileReadAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFileReadAttributes(EntityItemAuditType value) {
        this.fileReadAttributes = value;
    }

    /**
     * Gets the value of the fileWriteAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFileWriteAttributes() {
        return fileWriteAttributes;
    }

    /**
     * Sets the value of the fileWriteAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFileWriteAttributes(EntityItemAuditType value) {
        this.fileWriteAttributes = value;
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
