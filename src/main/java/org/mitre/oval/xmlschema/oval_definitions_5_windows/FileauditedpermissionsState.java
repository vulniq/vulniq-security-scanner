


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
 *         &lt;element name="path" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="filename" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
 *         &lt;element name="file_read_data" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_write_data" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_append_data" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_read_ea" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_write_ea" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_execute" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_delete_child" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_read_attributes" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_write_attributes" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
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
    "path",
    "filename",
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
public class FileauditedpermissionsState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType path;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType filename;
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
    @XmlElement(name = "file_read_data", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType fileReadData;
    @XmlElement(name = "file_write_data", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType fileWriteData;
    @XmlElement(name = "file_append_data", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType fileAppendData;
    @XmlElement(name = "file_read_ea", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType fileReadEa;
    @XmlElement(name = "file_write_ea", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType fileWriteEa;
    @XmlElement(name = "file_execute", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType fileExecute;
    @XmlElement(name = "file_delete_child", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType fileDeleteChild;
    @XmlElement(name = "file_read_attributes", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType fileReadAttributes;
    @XmlElement(name = "file_write_attributes", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType fileWriteAttributes;
    @XmlElement(name = "windows_view", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateWindowsViewType windowsView;

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPath(EntityStateStringType value) {
        this.path = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setFilename(EntityStateStringType value) {
        this.filename = value;
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
     * Gets the value of the fileReadData property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileReadData() {
        return fileReadData;
    }

    /**
     * Sets the value of the fileReadData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileReadData(EntityStateAuditType value) {
        this.fileReadData = value;
    }

    /**
     * Gets the value of the fileWriteData property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileWriteData() {
        return fileWriteData;
    }

    /**
     * Sets the value of the fileWriteData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileWriteData(EntityStateAuditType value) {
        this.fileWriteData = value;
    }

    /**
     * Gets the value of the fileAppendData property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileAppendData() {
        return fileAppendData;
    }

    /**
     * Sets the value of the fileAppendData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileAppendData(EntityStateAuditType value) {
        this.fileAppendData = value;
    }

    /**
     * Gets the value of the fileReadEa property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileReadEa() {
        return fileReadEa;
    }

    /**
     * Sets the value of the fileReadEa property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileReadEa(EntityStateAuditType value) {
        this.fileReadEa = value;
    }

    /**
     * Gets the value of the fileWriteEa property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileWriteEa() {
        return fileWriteEa;
    }

    /**
     * Sets the value of the fileWriteEa property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileWriteEa(EntityStateAuditType value) {
        this.fileWriteEa = value;
    }

    /**
     * Gets the value of the fileExecute property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileExecute() {
        return fileExecute;
    }

    /**
     * Sets the value of the fileExecute property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileExecute(EntityStateAuditType value) {
        this.fileExecute = value;
    }

    /**
     * Gets the value of the fileDeleteChild property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileDeleteChild() {
        return fileDeleteChild;
    }

    /**
     * Sets the value of the fileDeleteChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileDeleteChild(EntityStateAuditType value) {
        this.fileDeleteChild = value;
    }

    /**
     * Gets the value of the fileReadAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileReadAttributes() {
        return fileReadAttributes;
    }

    /**
     * Sets the value of the fileReadAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileReadAttributes(EntityStateAuditType value) {
        this.fileReadAttributes = value;
    }

    /**
     * Gets the value of the fileWriteAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileWriteAttributes() {
        return fileWriteAttributes;
    }

    /**
     * Sets the value of the fileWriteAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileWriteAttributes(EntityStateAuditType value) {
        this.fileWriteAttributes = value;
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
