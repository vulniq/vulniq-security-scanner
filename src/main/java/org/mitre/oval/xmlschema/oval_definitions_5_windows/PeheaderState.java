
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
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="path" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="filename" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="header_signature" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="target_machine_type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStatePeTargetMachineType" minOccurs="0"/>
 *         &lt;element name="number_of_sections" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="time_date_stamp" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="pointer_to_symbol_table" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="number_of_symbols" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_optional_header" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="image_file_relocs_stripped" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_executable_image" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_line_nums_stripped" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_local_syms_stripped" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_aggresive_ws_trim" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_large_address_aware" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_16bit_machine" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_bytes_reversed_lo" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_32bit_machine" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_debug_stripped" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_removable_run_from_swap" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_system" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_dll" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_up_system_only" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_bytes_reveresed_hi" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="magic_number" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="major_linker_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="minor_linker_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_code" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_initialized_data" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_uninitialized_data" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="address_of_entry_point" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="base_of_code" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="base_of_data" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="image_base_address" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="section_alignment" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="file_alignment" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="major_operating_system_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="minor_operating_system_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="major_image_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="minor_image_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="major_subsystem_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="minor_susbsystem_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_image" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_headers" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="checksum" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="subsystem" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStatePeSubsystemType" minOccurs="0"/>
 *         &lt;element name="dll_characteristics" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_stack_reserve" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_stack_commit" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_heap_reserve" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_heap_commit" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="loader_flags" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="number_of_rva_and_sizes" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="real_number_of_directory_entries" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
    "filepath",
    "path",
    "filename",
    "headerSignature",
    "targetMachineType",
    "numberOfSections",
    "timeDateStamp",
    "pointerToSymbolTable",
    "numberOfSymbols",
    "sizeOfOptionalHeader",
    "imageFileRelocsStripped",
    "imageFileExecutableImage",
    "imageFileLineNumsStripped",
    "imageFileLocalSymsStripped",
    "imageFileAggresiveWsTrim",
    "imageFileLargeAddressAware",
    "imageFile16BitMachine",
    "imageFileBytesReversedLo",
    "imageFile32BitMachine",
    "imageFileDebugStripped",
    "imageFileRemovableRunFromSwap",
    "imageFileSystem",
    "imageFileDll",
    "imageFileUpSystemOnly",
    "imageFileBytesReveresedHi",
    "magicNumber",
    "majorLinkerVersion",
    "minorLinkerVersion",
    "sizeOfCode",
    "sizeOfInitializedData",
    "sizeOfUninitializedData",
    "addressOfEntryPoint",
    "baseOfCode",
    "baseOfData",
    "imageBaseAddress",
    "sectionAlignment",
    "fileAlignment",
    "majorOperatingSystemVersion",
    "minorOperatingSystemVersion",
    "majorImageVersion",
    "minorImageVersion",
    "majorSubsystemVersion",
    "minorSusbsystemVersion",
    "sizeOfImage",
    "sizeOfHeaders",
    "checksum",
    "subsystem",
    "dllCharacteristics",
    "sizeOfStackReserve",
    "sizeOfStackCommit",
    "sizeOfHeapReserve",
    "sizeOfHeapCommit",
    "loaderFlags",
    "numberOfRvaAndSizes",
    "realNumberOfDirectoryEntries",
    "windowsView"
})
public class PeheaderState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType filepath;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType path;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType filename;
    @XmlElement(name = "header_signature", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType headerSignature;
    @XmlElement(name = "target_machine_type", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStatePeTargetMachineType targetMachineType;
    @XmlElement(name = "number_of_sections", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType numberOfSections;
    @XmlElement(name = "time_date_stamp", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType timeDateStamp;
    @XmlElement(name = "pointer_to_symbol_table", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType pointerToSymbolTable;
    @XmlElement(name = "number_of_symbols", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType numberOfSymbols;
    @XmlElement(name = "size_of_optional_header", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType sizeOfOptionalHeader;
    @XmlElement(name = "image_file_relocs_stripped", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", defaultValue = "false")
    protected EntityStateBoolType imageFileRelocsStripped;
    @XmlElement(name = "image_file_executable_image", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", defaultValue = "false")
    protected EntityStateBoolType imageFileExecutableImage;
    @XmlElement(name = "image_file_line_nums_stripped", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", defaultValue = "false")
    protected EntityStateBoolType imageFileLineNumsStripped;
    @XmlElement(name = "image_file_local_syms_stripped", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", defaultValue = "false")
    protected EntityStateBoolType imageFileLocalSymsStripped;
    @XmlElement(name = "image_file_aggresive_ws_trim", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", defaultValue = "false")
    protected EntityStateBoolType imageFileAggresiveWsTrim;
    @XmlElement(name = "image_file_large_address_aware", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", defaultValue = "false")
    protected EntityStateBoolType imageFileLargeAddressAware;
    @XmlElement(name = "image_file_16bit_machine", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", defaultValue = "false")
    protected EntityStateBoolType imageFile16BitMachine;
    @XmlElement(name = "image_file_bytes_reversed_lo", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", defaultValue = "false")
    protected EntityStateBoolType imageFileBytesReversedLo;
    @XmlElement(name = "image_file_32bit_machine", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", defaultValue = "false")
    protected EntityStateBoolType imageFile32BitMachine;
    @XmlElement(name = "image_file_debug_stripped", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", defaultValue = "false")
    protected EntityStateBoolType imageFileDebugStripped;
    @XmlElement(name = "image_file_removable_run_from_swap", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", defaultValue = "false")
    protected EntityStateBoolType imageFileRemovableRunFromSwap;
    @XmlElement(name = "image_file_system", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", defaultValue = "false")
    protected EntityStateBoolType imageFileSystem;
    @XmlElement(name = "image_file_dll", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", defaultValue = "false")
    protected EntityStateBoolType imageFileDll;
    @XmlElement(name = "image_file_up_system_only", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", defaultValue = "false")
    protected EntityStateBoolType imageFileUpSystemOnly;
    @XmlElement(name = "image_file_bytes_reveresed_hi", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", defaultValue = "false")
    protected EntityStateBoolType imageFileBytesReveresedHi;
    @XmlElement(name = "magic_number", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType magicNumber;
    @XmlElement(name = "major_linker_version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType majorLinkerVersion;
    @XmlElement(name = "minor_linker_version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType minorLinkerVersion;
    @XmlElement(name = "size_of_code", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType sizeOfCode;
    @XmlElement(name = "size_of_initialized_data", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType sizeOfInitializedData;
    @XmlElement(name = "size_of_uninitialized_data", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType sizeOfUninitializedData;
    @XmlElement(name = "address_of_entry_point", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType addressOfEntryPoint;
    @XmlElement(name = "base_of_code", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType baseOfCode;
    @XmlElement(name = "base_of_data", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType baseOfData;
    @XmlElement(name = "image_base_address", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType imageBaseAddress;
    @XmlElement(name = "section_alignment", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType sectionAlignment;
    @XmlElement(name = "file_alignment", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType fileAlignment;
    @XmlElement(name = "major_operating_system_version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType majorOperatingSystemVersion;
    @XmlElement(name = "minor_operating_system_version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType minorOperatingSystemVersion;
    @XmlElement(name = "major_image_version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType majorImageVersion;
    @XmlElement(name = "minor_image_version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType minorImageVersion;
    @XmlElement(name = "major_subsystem_version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType majorSubsystemVersion;
    @XmlElement(name = "minor_susbsystem_version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType minorSusbsystemVersion;
    @XmlElement(name = "size_of_image", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType sizeOfImage;
    @XmlElement(name = "size_of_headers", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType sizeOfHeaders;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType checksum;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStatePeSubsystemType subsystem;
    @XmlElement(name = "dll_characteristics", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType dllCharacteristics;
    @XmlElement(name = "size_of_stack_reserve", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType sizeOfStackReserve;
    @XmlElement(name = "size_of_stack_commit", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType sizeOfStackCommit;
    @XmlElement(name = "size_of_heap_reserve", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType sizeOfHeapReserve;
    @XmlElement(name = "size_of_heap_commit", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType sizeOfHeapCommit;
    @XmlElement(name = "loader_flags", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType loaderFlags;
    @XmlElement(name = "number_of_rva_and_sizes", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType numberOfRvaAndSizes;
    @XmlElement(name = "real_number_of_directory_entries", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType realNumberOfDirectoryEntries;
    @XmlElement(name = "windows_view", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateWindowsViewType windowsView;

    /**
     * Gets the value of the filepath property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getFilepath() {
        return filepath;
    }

    /**
     * Sets the value of the filepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setFilepath(EntityStateStringType value) {
        this.filepath = value;
    }

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
     * Gets the value of the headerSignature property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getHeaderSignature() {
        return headerSignature;
    }

    /**
     * Sets the value of the headerSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setHeaderSignature(EntityStateStringType value) {
        this.headerSignature = value;
    }

    /**
     * Gets the value of the targetMachineType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePeTargetMachineType }
     *     
     */
    public EntityStatePeTargetMachineType getTargetMachineType() {
        return targetMachineType;
    }

    /**
     * Sets the value of the targetMachineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePeTargetMachineType }
     *     
     */
    public void setTargetMachineType(EntityStatePeTargetMachineType value) {
        this.targetMachineType = value;
    }

    /**
     * Gets the value of the numberOfSections property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getNumberOfSections() {
        return numberOfSections;
    }

    /**
     * Sets the value of the numberOfSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setNumberOfSections(EntityStateIntType value) {
        this.numberOfSections = value;
    }

    /**
     * Gets the value of the timeDateStamp property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getTimeDateStamp() {
        return timeDateStamp;
    }

    /**
     * Sets the value of the timeDateStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setTimeDateStamp(EntityStateIntType value) {
        this.timeDateStamp = value;
    }

    /**
     * Gets the value of the pointerToSymbolTable property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPointerToSymbolTable() {
        return pointerToSymbolTable;
    }

    /**
     * Sets the value of the pointerToSymbolTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPointerToSymbolTable(EntityStateIntType value) {
        this.pointerToSymbolTable = value;
    }

    /**
     * Gets the value of the numberOfSymbols property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getNumberOfSymbols() {
        return numberOfSymbols;
    }

    /**
     * Sets the value of the numberOfSymbols property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setNumberOfSymbols(EntityStateIntType value) {
        this.numberOfSymbols = value;
    }

    /**
     * Gets the value of the sizeOfOptionalHeader property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfOptionalHeader() {
        return sizeOfOptionalHeader;
    }

    /**
     * Sets the value of the sizeOfOptionalHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfOptionalHeader(EntityStateIntType value) {
        this.sizeOfOptionalHeader = value;
    }

    /**
     * Gets the value of the imageFileRelocsStripped property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileRelocsStripped() {
        return imageFileRelocsStripped;
    }

    /**
     * Sets the value of the imageFileRelocsStripped property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileRelocsStripped(EntityStateBoolType value) {
        this.imageFileRelocsStripped = value;
    }

    /**
     * Gets the value of the imageFileExecutableImage property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileExecutableImage() {
        return imageFileExecutableImage;
    }

    /**
     * Sets the value of the imageFileExecutableImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileExecutableImage(EntityStateBoolType value) {
        this.imageFileExecutableImage = value;
    }

    /**
     * Gets the value of the imageFileLineNumsStripped property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileLineNumsStripped() {
        return imageFileLineNumsStripped;
    }

    /**
     * Sets the value of the imageFileLineNumsStripped property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileLineNumsStripped(EntityStateBoolType value) {
        this.imageFileLineNumsStripped = value;
    }

    /**
     * Gets the value of the imageFileLocalSymsStripped property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileLocalSymsStripped() {
        return imageFileLocalSymsStripped;
    }

    /**
     * Sets the value of the imageFileLocalSymsStripped property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileLocalSymsStripped(EntityStateBoolType value) {
        this.imageFileLocalSymsStripped = value;
    }

    /**
     * Gets the value of the imageFileAggresiveWsTrim property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileAggresiveWsTrim() {
        return imageFileAggresiveWsTrim;
    }

    /**
     * Sets the value of the imageFileAggresiveWsTrim property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileAggresiveWsTrim(EntityStateBoolType value) {
        this.imageFileAggresiveWsTrim = value;
    }

    /**
     * Gets the value of the imageFileLargeAddressAware property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileLargeAddressAware() {
        return imageFileLargeAddressAware;
    }

    /**
     * Sets the value of the imageFileLargeAddressAware property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileLargeAddressAware(EntityStateBoolType value) {
        this.imageFileLargeAddressAware = value;
    }

    /**
     * Gets the value of the imageFile16BitMachine property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFile16BitMachine() {
        return imageFile16BitMachine;
    }

    /**
     * Sets the value of the imageFile16BitMachine property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFile16BitMachine(EntityStateBoolType value) {
        this.imageFile16BitMachine = value;
    }

    /**
     * Gets the value of the imageFileBytesReversedLo property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileBytesReversedLo() {
        return imageFileBytesReversedLo;
    }

    /**
     * Sets the value of the imageFileBytesReversedLo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileBytesReversedLo(EntityStateBoolType value) {
        this.imageFileBytesReversedLo = value;
    }

    /**
     * Gets the value of the imageFile32BitMachine property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFile32BitMachine() {
        return imageFile32BitMachine;
    }

    /**
     * Sets the value of the imageFile32BitMachine property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFile32BitMachine(EntityStateBoolType value) {
        this.imageFile32BitMachine = value;
    }

    /**
     * Gets the value of the imageFileDebugStripped property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileDebugStripped() {
        return imageFileDebugStripped;
    }

    /**
     * Sets the value of the imageFileDebugStripped property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileDebugStripped(EntityStateBoolType value) {
        this.imageFileDebugStripped = value;
    }

    /**
     * Gets the value of the imageFileRemovableRunFromSwap property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileRemovableRunFromSwap() {
        return imageFileRemovableRunFromSwap;
    }

    /**
     * Sets the value of the imageFileRemovableRunFromSwap property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileRemovableRunFromSwap(EntityStateBoolType value) {
        this.imageFileRemovableRunFromSwap = value;
    }

    /**
     * Gets the value of the imageFileSystem property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileSystem() {
        return imageFileSystem;
    }

    /**
     * Sets the value of the imageFileSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileSystem(EntityStateBoolType value) {
        this.imageFileSystem = value;
    }

    /**
     * Gets the value of the imageFileDll property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileDll() {
        return imageFileDll;
    }

    /**
     * Sets the value of the imageFileDll property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileDll(EntityStateBoolType value) {
        this.imageFileDll = value;
    }

    /**
     * Gets the value of the imageFileUpSystemOnly property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileUpSystemOnly() {
        return imageFileUpSystemOnly;
    }

    /**
     * Sets the value of the imageFileUpSystemOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileUpSystemOnly(EntityStateBoolType value) {
        this.imageFileUpSystemOnly = value;
    }

    /**
     * Gets the value of the imageFileBytesReveresedHi property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileBytesReveresedHi() {
        return imageFileBytesReveresedHi;
    }

    /**
     * Sets the value of the imageFileBytesReveresedHi property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileBytesReveresedHi(EntityStateBoolType value) {
        this.imageFileBytesReveresedHi = value;
    }

    /**
     * Gets the value of the magicNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMagicNumber() {
        return magicNumber;
    }

    /**
     * Sets the value of the magicNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMagicNumber(EntityStateIntType value) {
        this.magicNumber = value;
    }

    /**
     * Gets the value of the majorLinkerVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMajorLinkerVersion() {
        return majorLinkerVersion;
    }

    /**
     * Sets the value of the majorLinkerVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMajorLinkerVersion(EntityStateIntType value) {
        this.majorLinkerVersion = value;
    }

    /**
     * Gets the value of the minorLinkerVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinorLinkerVersion() {
        return minorLinkerVersion;
    }

    /**
     * Sets the value of the minorLinkerVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinorLinkerVersion(EntityStateIntType value) {
        this.minorLinkerVersion = value;
    }

    /**
     * Gets the value of the sizeOfCode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfCode() {
        return sizeOfCode;
    }

    /**
     * Sets the value of the sizeOfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfCode(EntityStateIntType value) {
        this.sizeOfCode = value;
    }

    /**
     * Gets the value of the sizeOfInitializedData property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfInitializedData() {
        return sizeOfInitializedData;
    }

    /**
     * Sets the value of the sizeOfInitializedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfInitializedData(EntityStateIntType value) {
        this.sizeOfInitializedData = value;
    }

    /**
     * Gets the value of the sizeOfUninitializedData property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfUninitializedData() {
        return sizeOfUninitializedData;
    }

    /**
     * Sets the value of the sizeOfUninitializedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfUninitializedData(EntityStateIntType value) {
        this.sizeOfUninitializedData = value;
    }

    /**
     * Gets the value of the addressOfEntryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getAddressOfEntryPoint() {
        return addressOfEntryPoint;
    }

    /**
     * Sets the value of the addressOfEntryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setAddressOfEntryPoint(EntityStateIntType value) {
        this.addressOfEntryPoint = value;
    }

    /**
     * Gets the value of the baseOfCode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getBaseOfCode() {
        return baseOfCode;
    }

    /**
     * Sets the value of the baseOfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setBaseOfCode(EntityStateIntType value) {
        this.baseOfCode = value;
    }

    /**
     * Gets the value of the baseOfData property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getBaseOfData() {
        return baseOfData;
    }

    /**
     * Sets the value of the baseOfData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setBaseOfData(EntityStateIntType value) {
        this.baseOfData = value;
    }

    /**
     * Gets the value of the imageBaseAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getImageBaseAddress() {
        return imageBaseAddress;
    }

    /**
     * Sets the value of the imageBaseAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setImageBaseAddress(EntityStateIntType value) {
        this.imageBaseAddress = value;
    }

    /**
     * Gets the value of the sectionAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSectionAlignment() {
        return sectionAlignment;
    }

    /**
     * Sets the value of the sectionAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSectionAlignment(EntityStateIntType value) {
        this.sectionAlignment = value;
    }

    /**
     * Gets the value of the fileAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getFileAlignment() {
        return fileAlignment;
    }

    /**
     * Sets the value of the fileAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setFileAlignment(EntityStateIntType value) {
        this.fileAlignment = value;
    }

    /**
     * Gets the value of the majorOperatingSystemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMajorOperatingSystemVersion() {
        return majorOperatingSystemVersion;
    }

    /**
     * Sets the value of the majorOperatingSystemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMajorOperatingSystemVersion(EntityStateIntType value) {
        this.majorOperatingSystemVersion = value;
    }

    /**
     * Gets the value of the minorOperatingSystemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinorOperatingSystemVersion() {
        return minorOperatingSystemVersion;
    }

    /**
     * Sets the value of the minorOperatingSystemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinorOperatingSystemVersion(EntityStateIntType value) {
        this.minorOperatingSystemVersion = value;
    }

    /**
     * Gets the value of the majorImageVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMajorImageVersion() {
        return majorImageVersion;
    }

    /**
     * Sets the value of the majorImageVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMajorImageVersion(EntityStateIntType value) {
        this.majorImageVersion = value;
    }

    /**
     * Gets the value of the minorImageVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinorImageVersion() {
        return minorImageVersion;
    }

    /**
     * Sets the value of the minorImageVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinorImageVersion(EntityStateIntType value) {
        this.minorImageVersion = value;
    }

    /**
     * Gets the value of the majorSubsystemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMajorSubsystemVersion() {
        return majorSubsystemVersion;
    }

    /**
     * Sets the value of the majorSubsystemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMajorSubsystemVersion(EntityStateIntType value) {
        this.majorSubsystemVersion = value;
    }

    /**
     * Gets the value of the minorSusbsystemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinorSusbsystemVersion() {
        return minorSusbsystemVersion;
    }

    /**
     * Sets the value of the minorSusbsystemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinorSusbsystemVersion(EntityStateIntType value) {
        this.minorSusbsystemVersion = value;
    }

    /**
     * Gets the value of the sizeOfImage property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfImage() {
        return sizeOfImage;
    }

    /**
     * Sets the value of the sizeOfImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfImage(EntityStateIntType value) {
        this.sizeOfImage = value;
    }

    /**
     * Gets the value of the sizeOfHeaders property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfHeaders() {
        return sizeOfHeaders;
    }

    /**
     * Sets the value of the sizeOfHeaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfHeaders(EntityStateIntType value) {
        this.sizeOfHeaders = value;
    }

    /**
     * Gets the value of the checksum property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getChecksum() {
        return checksum;
    }

    /**
     * Sets the value of the checksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setChecksum(EntityStateIntType value) {
        this.checksum = value;
    }

    /**
     * Gets the value of the subsystem property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePeSubsystemType }
     *     
     */
    public EntityStatePeSubsystemType getSubsystem() {
        return subsystem;
    }

    /**
     * Sets the value of the subsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePeSubsystemType }
     *     
     */
    public void setSubsystem(EntityStatePeSubsystemType value) {
        this.subsystem = value;
    }

    /**
     * Gets the value of the dllCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getDllCharacteristics() {
        return dllCharacteristics;
    }

    /**
     * Sets the value of the dllCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setDllCharacteristics(EntityStateIntType value) {
        this.dllCharacteristics = value;
    }

    /**
     * Gets the value of the sizeOfStackReserve property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfStackReserve() {
        return sizeOfStackReserve;
    }

    /**
     * Sets the value of the sizeOfStackReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfStackReserve(EntityStateIntType value) {
        this.sizeOfStackReserve = value;
    }

    /**
     * Gets the value of the sizeOfStackCommit property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfStackCommit() {
        return sizeOfStackCommit;
    }

    /**
     * Sets the value of the sizeOfStackCommit property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfStackCommit(EntityStateIntType value) {
        this.sizeOfStackCommit = value;
    }

    /**
     * Gets the value of the sizeOfHeapReserve property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfHeapReserve() {
        return sizeOfHeapReserve;
    }

    /**
     * Sets the value of the sizeOfHeapReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfHeapReserve(EntityStateIntType value) {
        this.sizeOfHeapReserve = value;
    }

    /**
     * Gets the value of the sizeOfHeapCommit property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfHeapCommit() {
        return sizeOfHeapCommit;
    }

    /**
     * Sets the value of the sizeOfHeapCommit property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfHeapCommit(EntityStateIntType value) {
        this.sizeOfHeapCommit = value;
    }

    /**
     * Gets the value of the loaderFlags property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getLoaderFlags() {
        return loaderFlags;
    }

    /**
     * Sets the value of the loaderFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setLoaderFlags(EntityStateIntType value) {
        this.loaderFlags = value;
    }

    /**
     * Gets the value of the numberOfRvaAndSizes property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getNumberOfRvaAndSizes() {
        return numberOfRvaAndSizes;
    }

    /**
     * Sets the value of the numberOfRvaAndSizes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setNumberOfRvaAndSizes(EntityStateIntType value) {
        this.numberOfRvaAndSizes = value;
    }

    /**
     * Gets the value of the realNumberOfDirectoryEntries property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getRealNumberOfDirectoryEntries() {
        return realNumberOfDirectoryEntries;
    }

    /**
     * Sets the value of the realNumberOfDirectoryEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setRealNumberOfDirectoryEntries(EntityStateIntType value) {
        this.realNumberOfDirectoryEntries = value;
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
