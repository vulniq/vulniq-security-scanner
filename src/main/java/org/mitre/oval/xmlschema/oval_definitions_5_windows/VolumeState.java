


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

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
 *         &lt;element name="rootpath" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="file_system" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="drive_type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateDriveTypeType" minOccurs="0"/>
 *         &lt;element name="volume_max_component_length" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="serial_number" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="file_case_sensitive_search" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_case_preserved_names" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_unicode_on_disk" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_persistent_acls" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_file_compression" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_volume_quotas" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_sparse_files" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_reparse_points" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_remote_storage" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_volume_is_compressed" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_object_ids" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_encryption" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_named_streams" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_read_only_volume" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_sequential_write_once" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_transactions" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_hard_links" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_extended_attributes" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_open_by_file_id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_usn_journal" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
public class VolumeState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType rootpath;
    @XmlElement(name = "file_system", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType fileSystem;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType name;
    @XmlElement(name = "drive_type", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateDriveTypeType driveType;
    @XmlElement(name = "volume_max_component_length", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType volumeMaxComponentLength;
    @XmlElement(name = "serial_number", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType serialNumber;
    @XmlElement(name = "file_case_sensitive_search", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileCaseSensitiveSearch;
    @XmlElement(name = "file_case_preserved_names", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileCasePreservedNames;
    @XmlElement(name = "file_unicode_on_disk", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileUnicodeOnDisk;
    @XmlElement(name = "file_persistent_acls", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType filePersistentAcls;
    @XmlElement(name = "file_file_compression", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileFileCompression;
    @XmlElement(name = "file_volume_quotas", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileVolumeQuotas;
    @XmlElement(name = "file_supports_sparse_files", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileSupportsSparseFiles;
    @XmlElement(name = "file_supports_reparse_points", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileSupportsReparsePoints;
    @XmlElement(name = "file_supports_remote_storage", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileSupportsRemoteStorage;
    @XmlElement(name = "file_volume_is_compressed", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileVolumeIsCompressed;
    @XmlElement(name = "file_supports_object_ids", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileSupportsObjectIds;
    @XmlElement(name = "file_supports_encryption", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileSupportsEncryption;
    @XmlElement(name = "file_named_streams", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileNamedStreams;
    @XmlElement(name = "file_read_only_volume", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileReadOnlyVolume;
    @XmlElement(name = "file_sequential_write_once", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileSequentialWriteOnce;
    @XmlElement(name = "file_supports_transactions", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileSupportsTransactions;
    @XmlElement(name = "file_supports_hard_links", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileSupportsHardLinks;
    @XmlElement(name = "file_supports_extended_attributes", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileSupportsExtendedAttributes;
    @XmlElement(name = "file_supports_open_by_file_id", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileSupportsOpenByFileId;
    @XmlElement(name = "file_supports_usn_journal", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType fileSupportsUsnJournal;

    /**
     * Gets the value of the rootpath property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getRootpath() {
        return rootpath;
    }

    /**
     * Sets the value of the rootpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setRootpath(EntityStateStringType value) {
        this.rootpath = value;
    }

    /**
     * Gets the value of the fileSystem property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getFileSystem() {
        return fileSystem;
    }

    /**
     * Sets the value of the fileSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setFileSystem(EntityStateStringType value) {
        this.fileSystem = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setName(EntityStateStringType value) {
        this.name = value;
    }

    /**
     * Gets the value of the driveType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateDriveTypeType }
     *     
     */
    public EntityStateDriveTypeType getDriveType() {
        return driveType;
    }

    /**
     * Sets the value of the driveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateDriveTypeType }
     *     
     */
    public void setDriveType(EntityStateDriveTypeType value) {
        this.driveType = value;
    }

    /**
     * Gets the value of the volumeMaxComponentLength property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getVolumeMaxComponentLength() {
        return volumeMaxComponentLength;
    }

    /**
     * Sets the value of the volumeMaxComponentLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setVolumeMaxComponentLength(EntityStateIntType value) {
        this.volumeMaxComponentLength = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSerialNumber(EntityStateIntType value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the fileCaseSensitiveSearch property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileCaseSensitiveSearch() {
        return fileCaseSensitiveSearch;
    }

    /**
     * Sets the value of the fileCaseSensitiveSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileCaseSensitiveSearch(EntityStateBoolType value) {
        this.fileCaseSensitiveSearch = value;
    }

    /**
     * Gets the value of the fileCasePreservedNames property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileCasePreservedNames() {
        return fileCasePreservedNames;
    }

    /**
     * Sets the value of the fileCasePreservedNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileCasePreservedNames(EntityStateBoolType value) {
        this.fileCasePreservedNames = value;
    }

    /**
     * Gets the value of the fileUnicodeOnDisk property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileUnicodeOnDisk() {
        return fileUnicodeOnDisk;
    }

    /**
     * Sets the value of the fileUnicodeOnDisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileUnicodeOnDisk(EntityStateBoolType value) {
        this.fileUnicodeOnDisk = value;
    }

    /**
     * Gets the value of the filePersistentAcls property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFilePersistentAcls() {
        return filePersistentAcls;
    }

    /**
     * Sets the value of the filePersistentAcls property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFilePersistentAcls(EntityStateBoolType value) {
        this.filePersistentAcls = value;
    }

    /**
     * Gets the value of the fileFileCompression property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileFileCompression() {
        return fileFileCompression;
    }

    /**
     * Sets the value of the fileFileCompression property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileFileCompression(EntityStateBoolType value) {
        this.fileFileCompression = value;
    }

    /**
     * Gets the value of the fileVolumeQuotas property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileVolumeQuotas() {
        return fileVolumeQuotas;
    }

    /**
     * Sets the value of the fileVolumeQuotas property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileVolumeQuotas(EntityStateBoolType value) {
        this.fileVolumeQuotas = value;
    }

    /**
     * Gets the value of the fileSupportsSparseFiles property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsSparseFiles() {
        return fileSupportsSparseFiles;
    }

    /**
     * Sets the value of the fileSupportsSparseFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsSparseFiles(EntityStateBoolType value) {
        this.fileSupportsSparseFiles = value;
    }

    /**
     * Gets the value of the fileSupportsReparsePoints property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsReparsePoints() {
        return fileSupportsReparsePoints;
    }

    /**
     * Sets the value of the fileSupportsReparsePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsReparsePoints(EntityStateBoolType value) {
        this.fileSupportsReparsePoints = value;
    }

    /**
     * Gets the value of the fileSupportsRemoteStorage property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsRemoteStorage() {
        return fileSupportsRemoteStorage;
    }

    /**
     * Sets the value of the fileSupportsRemoteStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsRemoteStorage(EntityStateBoolType value) {
        this.fileSupportsRemoteStorage = value;
    }

    /**
     * Gets the value of the fileVolumeIsCompressed property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileVolumeIsCompressed() {
        return fileVolumeIsCompressed;
    }

    /**
     * Sets the value of the fileVolumeIsCompressed property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileVolumeIsCompressed(EntityStateBoolType value) {
        this.fileVolumeIsCompressed = value;
    }

    /**
     * Gets the value of the fileSupportsObjectIds property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsObjectIds() {
        return fileSupportsObjectIds;
    }

    /**
     * Sets the value of the fileSupportsObjectIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsObjectIds(EntityStateBoolType value) {
        this.fileSupportsObjectIds = value;
    }

    /**
     * Gets the value of the fileSupportsEncryption property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsEncryption() {
        return fileSupportsEncryption;
    }

    /**
     * Sets the value of the fileSupportsEncryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsEncryption(EntityStateBoolType value) {
        this.fileSupportsEncryption = value;
    }

    /**
     * Gets the value of the fileNamedStreams property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileNamedStreams() {
        return fileNamedStreams;
    }

    /**
     * Sets the value of the fileNamedStreams property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileNamedStreams(EntityStateBoolType value) {
        this.fileNamedStreams = value;
    }

    /**
     * Gets the value of the fileReadOnlyVolume property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileReadOnlyVolume() {
        return fileReadOnlyVolume;
    }

    /**
     * Sets the value of the fileReadOnlyVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileReadOnlyVolume(EntityStateBoolType value) {
        this.fileReadOnlyVolume = value;
    }

    /**
     * Gets the value of the fileSequentialWriteOnce property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSequentialWriteOnce() {
        return fileSequentialWriteOnce;
    }

    /**
     * Sets the value of the fileSequentialWriteOnce property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSequentialWriteOnce(EntityStateBoolType value) {
        this.fileSequentialWriteOnce = value;
    }

    /**
     * Gets the value of the fileSupportsTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsTransactions() {
        return fileSupportsTransactions;
    }

    /**
     * Sets the value of the fileSupportsTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsTransactions(EntityStateBoolType value) {
        this.fileSupportsTransactions = value;
    }

    /**
     * Gets the value of the fileSupportsHardLinks property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsHardLinks() {
        return fileSupportsHardLinks;
    }

    /**
     * Sets the value of the fileSupportsHardLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsHardLinks(EntityStateBoolType value) {
        this.fileSupportsHardLinks = value;
    }

    /**
     * Gets the value of the fileSupportsExtendedAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsExtendedAttributes() {
        return fileSupportsExtendedAttributes;
    }

    /**
     * Sets the value of the fileSupportsExtendedAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsExtendedAttributes(EntityStateBoolType value) {
        this.fileSupportsExtendedAttributes = value;
    }

    /**
     * Gets the value of the fileSupportsOpenByFileId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsOpenByFileId() {
        return fileSupportsOpenByFileId;
    }

    /**
     * Sets the value of the fileSupportsOpenByFileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsOpenByFileId(EntityStateBoolType value) {
        this.fileSupportsOpenByFileId = value;
    }

    /**
     * Gets the value of the fileSupportsUsnJournal property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsUsnJournal() {
        return fileSupportsUsnJournal;
    }

    /**
     * Sets the value of the fileSupportsUsnJournal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsUsnJournal(EntityStateBoolType value) {
        this.fileSupportsUsnJournal = value;
    }

}
