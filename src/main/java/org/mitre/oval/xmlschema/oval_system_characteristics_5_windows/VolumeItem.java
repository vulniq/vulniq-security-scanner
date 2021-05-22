


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

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
 *         &lt;element name="rootpath" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="file_system" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="drive_type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemDriveTypeType" minOccurs="0"/>
 *         &lt;element name="volume_max_component_length" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="serial_number" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="file_case_sensitive_search" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_case_preserved_names" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_unicode_on_disk" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_persistent_acls" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_file_compression" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_volume_quotas" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_sparse_files" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_reparse_points" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_remote_storage" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_volume_is_compressed" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_object_ids" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_encryption" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_named_streams" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_read_only_volume" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_sequential_write_once" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_transactions" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_hard_links" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_extended_attributes" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_open_by_file_id" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_usn_journal" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "rootpath",
    "fileSystem",
    "name",
    "driveType",
    "volumeMaxComponentLength",
    "serialNumber",
    "fileCaseSensitiveSearch",
    "fileCasePreservedNames",
    "fileUnicodeOnDisk",
    "filePersistentAcls",
    "fileFileCompression",
    "fileVolumeQuotas",
    "fileSupportsSparseFiles",
    "fileSupportsReparsePoints",
    "fileSupportsRemoteStorage",
    "fileVolumeIsCompressed",
    "fileSupportsObjectIds",
    "fileSupportsEncryption",
    "fileNamedStreams",
    "fileReadOnlyVolume",
    "fileSequentialWriteOnce",
    "fileSupportsTransactions",
    "fileSupportsHardLinks",
    "fileSupportsExtendedAttributes",
    "fileSupportsOpenByFileId",
    "fileSupportsUsnJournal"
})
public class VolumeItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType rootpath;
    @XmlElement(name = "file_system", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType fileSystem;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType name;
    @XmlElement(name = "drive_type", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemDriveTypeType driveType;
    @XmlElement(name = "volume_max_component_length", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType volumeMaxComponentLength;
    @XmlElement(name = "serial_number", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType serialNumber;
    @XmlElement(name = "file_case_sensitive_search", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileCaseSensitiveSearch;
    @XmlElement(name = "file_case_preserved_names", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileCasePreservedNames;
    @XmlElement(name = "file_unicode_on_disk", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileUnicodeOnDisk;
    @XmlElement(name = "file_persistent_acls", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType filePersistentAcls;
    @XmlElement(name = "file_file_compression", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileFileCompression;
    @XmlElement(name = "file_volume_quotas", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileVolumeQuotas;
    @XmlElement(name = "file_supports_sparse_files", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileSupportsSparseFiles;
    @XmlElement(name = "file_supports_reparse_points", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileSupportsReparsePoints;
    @XmlElement(name = "file_supports_remote_storage", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileSupportsRemoteStorage;
    @XmlElement(name = "file_volume_is_compressed", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileVolumeIsCompressed;
    @XmlElement(name = "file_supports_object_ids", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileSupportsObjectIds;
    @XmlElement(name = "file_supports_encryption", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileSupportsEncryption;
    @XmlElement(name = "file_named_streams", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileNamedStreams;
    @XmlElement(name = "file_read_only_volume", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileReadOnlyVolume;
    @XmlElement(name = "file_sequential_write_once", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileSequentialWriteOnce;
    @XmlElement(name = "file_supports_transactions", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileSupportsTransactions;
    @XmlElement(name = "file_supports_hard_links", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileSupportsHardLinks;
    @XmlElement(name = "file_supports_extended_attributes", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileSupportsExtendedAttributes;
    @XmlElement(name = "file_supports_open_by_file_id", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileSupportsOpenByFileId;
    @XmlElement(name = "file_supports_usn_journal", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType fileSupportsUsnJournal;

    /**
     * Gets the value of the rootpath property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getRootpath() {
        return rootpath;
    }

    /**
     * Sets the value of the rootpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setRootpath(EntityItemStringType value) {
        this.rootpath = value;
    }

    /**
     * Gets the value of the fileSystem property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getFileSystem() {
        return fileSystem;
    }

    /**
     * Sets the value of the fileSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setFileSystem(EntityItemStringType value) {
        this.fileSystem = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setName(EntityItemStringType value) {
        this.name = value;
    }

    /**
     * Gets the value of the driveType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemDriveTypeType }
     *     
     */
    public EntityItemDriveTypeType getDriveType() {
        return driveType;
    }

    /**
     * Sets the value of the driveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemDriveTypeType }
     *     
     */
    public void setDriveType(EntityItemDriveTypeType value) {
        this.driveType = value;
    }

    /**
     * Gets the value of the volumeMaxComponentLength property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getVolumeMaxComponentLength() {
        return volumeMaxComponentLength;
    }

    /**
     * Sets the value of the volumeMaxComponentLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setVolumeMaxComponentLength(EntityItemIntType value) {
        this.volumeMaxComponentLength = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSerialNumber(EntityItemIntType value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the fileCaseSensitiveSearch property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileCaseSensitiveSearch() {
        return fileCaseSensitiveSearch;
    }

    /**
     * Sets the value of the fileCaseSensitiveSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileCaseSensitiveSearch(EntityItemBoolType value) {
        this.fileCaseSensitiveSearch = value;
    }

    /**
     * Gets the value of the fileCasePreservedNames property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileCasePreservedNames() {
        return fileCasePreservedNames;
    }

    /**
     * Sets the value of the fileCasePreservedNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileCasePreservedNames(EntityItemBoolType value) {
        this.fileCasePreservedNames = value;
    }

    /**
     * Gets the value of the fileUnicodeOnDisk property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileUnicodeOnDisk() {
        return fileUnicodeOnDisk;
    }

    /**
     * Sets the value of the fileUnicodeOnDisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileUnicodeOnDisk(EntityItemBoolType value) {
        this.fileUnicodeOnDisk = value;
    }

    /**
     * Gets the value of the filePersistentAcls property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFilePersistentAcls() {
        return filePersistentAcls;
    }

    /**
     * Sets the value of the filePersistentAcls property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFilePersistentAcls(EntityItemBoolType value) {
        this.filePersistentAcls = value;
    }

    /**
     * Gets the value of the fileFileCompression property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileFileCompression() {
        return fileFileCompression;
    }

    /**
     * Sets the value of the fileFileCompression property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileFileCompression(EntityItemBoolType value) {
        this.fileFileCompression = value;
    }

    /**
     * Gets the value of the fileVolumeQuotas property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileVolumeQuotas() {
        return fileVolumeQuotas;
    }

    /**
     * Sets the value of the fileVolumeQuotas property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileVolumeQuotas(EntityItemBoolType value) {
        this.fileVolumeQuotas = value;
    }

    /**
     * Gets the value of the fileSupportsSparseFiles property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsSparseFiles() {
        return fileSupportsSparseFiles;
    }

    /**
     * Sets the value of the fileSupportsSparseFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsSparseFiles(EntityItemBoolType value) {
        this.fileSupportsSparseFiles = value;
    }

    /**
     * Gets the value of the fileSupportsReparsePoints property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsReparsePoints() {
        return fileSupportsReparsePoints;
    }

    /**
     * Sets the value of the fileSupportsReparsePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsReparsePoints(EntityItemBoolType value) {
        this.fileSupportsReparsePoints = value;
    }

    /**
     * Gets the value of the fileSupportsRemoteStorage property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsRemoteStorage() {
        return fileSupportsRemoteStorage;
    }

    /**
     * Sets the value of the fileSupportsRemoteStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsRemoteStorage(EntityItemBoolType value) {
        this.fileSupportsRemoteStorage = value;
    }

    /**
     * Gets the value of the fileVolumeIsCompressed property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileVolumeIsCompressed() {
        return fileVolumeIsCompressed;
    }

    /**
     * Sets the value of the fileVolumeIsCompressed property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileVolumeIsCompressed(EntityItemBoolType value) {
        this.fileVolumeIsCompressed = value;
    }

    /**
     * Gets the value of the fileSupportsObjectIds property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsObjectIds() {
        return fileSupportsObjectIds;
    }

    /**
     * Sets the value of the fileSupportsObjectIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsObjectIds(EntityItemBoolType value) {
        this.fileSupportsObjectIds = value;
    }

    /**
     * Gets the value of the fileSupportsEncryption property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsEncryption() {
        return fileSupportsEncryption;
    }

    /**
     * Sets the value of the fileSupportsEncryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsEncryption(EntityItemBoolType value) {
        this.fileSupportsEncryption = value;
    }

    /**
     * Gets the value of the fileNamedStreams property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileNamedStreams() {
        return fileNamedStreams;
    }

    /**
     * Sets the value of the fileNamedStreams property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileNamedStreams(EntityItemBoolType value) {
        this.fileNamedStreams = value;
    }

    /**
     * Gets the value of the fileReadOnlyVolume property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileReadOnlyVolume() {
        return fileReadOnlyVolume;
    }

    /**
     * Sets the value of the fileReadOnlyVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileReadOnlyVolume(EntityItemBoolType value) {
        this.fileReadOnlyVolume = value;
    }

    /**
     * Gets the value of the fileSequentialWriteOnce property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSequentialWriteOnce() {
        return fileSequentialWriteOnce;
    }

    /**
     * Sets the value of the fileSequentialWriteOnce property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSequentialWriteOnce(EntityItemBoolType value) {
        this.fileSequentialWriteOnce = value;
    }

    /**
     * Gets the value of the fileSupportsTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsTransactions() {
        return fileSupportsTransactions;
    }

    /**
     * Sets the value of the fileSupportsTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsTransactions(EntityItemBoolType value) {
        this.fileSupportsTransactions = value;
    }

    /**
     * Gets the value of the fileSupportsHardLinks property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsHardLinks() {
        return fileSupportsHardLinks;
    }

    /**
     * Sets the value of the fileSupportsHardLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsHardLinks(EntityItemBoolType value) {
        this.fileSupportsHardLinks = value;
    }

    /**
     * Gets the value of the fileSupportsExtendedAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsExtendedAttributes() {
        return fileSupportsExtendedAttributes;
    }

    /**
     * Sets the value of the fileSupportsExtendedAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsExtendedAttributes(EntityItemBoolType value) {
        this.fileSupportsExtendedAttributes = value;
    }

    /**
     * Gets the value of the fileSupportsOpenByFileId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsOpenByFileId() {
        return fileSupportsOpenByFileId;
    }

    /**
     * Sets the value of the fileSupportsOpenByFileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsOpenByFileId(EntityItemBoolType value) {
        this.fileSupportsOpenByFileId = value;
    }

    /**
     * Gets the value of the fileSupportsUsnJournal property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsUsnJournal() {
        return fileSupportsUsnJournal;
    }

    /**
     * Sets the value of the fileSupportsUsnJournal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsUsnJournal(EntityItemBoolType value) {
        this.fileSupportsUsnJournal = value;
    }

}
