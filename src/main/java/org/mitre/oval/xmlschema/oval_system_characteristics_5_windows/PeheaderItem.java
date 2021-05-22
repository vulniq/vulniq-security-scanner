


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="path" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="filename" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="header_signature" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="target_machine_type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemPeTargetMachineType" minOccurs="0"/>
 *         &lt;element name="number_of_sections" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="time_date_stamp" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="pointer_to_symbol_table" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="number_of_symbols" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="size_of_optional_header" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="image_file_relocs_stripped" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_executable_image" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_line_nums_stripped" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_local_syms_stripped" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_aggresive_ws_trim" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_large_address_aware" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_16bit_machine" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_bytes_reversed_lo" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_32bit_machine" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_debug_stripped" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_removable_run_from_swap" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_system" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_dll" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_up_system_only" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_bytes_reveresed_hi" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="magic_number" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="major_linker_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="minor_linker_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="size_of_code" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="size_of_initialized_data" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="size_of_uninitialized_data" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="address_of_entry_point" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="base_of_code" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="base_of_data" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="image_base_address" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="section_alignment" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="file_alignment" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="major_operating_system_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="minor_operating_system_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="major_image_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="minor_image_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="major_subsystem_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="minor_susbsystem_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="size_of_image" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="size_of_headers" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="checksum" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="subsystem" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemPeSubsystemType" minOccurs="0"/>
 *         &lt;element name="dll_characteristics" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="size_of_stack_reserve" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="size_of_stack_commit" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="size_of_heap_reserve" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="size_of_heap_commit" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="loader_flags" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="number_of_rva_and_sizes" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="real_number_of_directory_entries" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
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
public class PeheaderItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType filepath;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType path;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType filename;
    @XmlElement(name = "header_signature", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType headerSignature;
    @XmlElement(name = "target_machine_type", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemPeTargetMachineType targetMachineType;
    @XmlElement(name = "number_of_sections", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType numberOfSections;
    @XmlElement(name = "time_date_stamp", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType timeDateStamp;
    @XmlElement(name = "pointer_to_symbol_table", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType pointerToSymbolTable;
    @XmlElement(name = "number_of_symbols", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType numberOfSymbols;
    @XmlElement(name = "size_of_optional_header", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType sizeOfOptionalHeader;
    @XmlElement(name = "image_file_relocs_stripped", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", defaultValue = "false")
    protected EntityItemBoolType imageFileRelocsStripped;
    @XmlElement(name = "image_file_executable_image", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", defaultValue = "false")
    protected EntityItemBoolType imageFileExecutableImage;
    @XmlElement(name = "image_file_line_nums_stripped", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", defaultValue = "false")
    protected EntityItemBoolType imageFileLineNumsStripped;
    @XmlElement(name = "image_file_local_syms_stripped", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", defaultValue = "false")
    protected EntityItemBoolType imageFileLocalSymsStripped;
    @XmlElement(name = "image_file_aggresive_ws_trim", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", defaultValue = "false")
    protected EntityItemBoolType imageFileAggresiveWsTrim;
    @XmlElement(name = "image_file_large_address_aware", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", defaultValue = "false")
    protected EntityItemBoolType imageFileLargeAddressAware;
    @XmlElement(name = "image_file_16bit_machine", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", defaultValue = "false")
    protected EntityItemBoolType imageFile16BitMachine;
    @XmlElement(name = "image_file_bytes_reversed_lo", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", defaultValue = "false")
    protected EntityItemBoolType imageFileBytesReversedLo;
    @XmlElement(name = "image_file_32bit_machine", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", defaultValue = "false")
    protected EntityItemBoolType imageFile32BitMachine;
    @XmlElement(name = "image_file_debug_stripped", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", defaultValue = "false")
    protected EntityItemBoolType imageFileDebugStripped;
    @XmlElement(name = "image_file_removable_run_from_swap", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", defaultValue = "false")
    protected EntityItemBoolType imageFileRemovableRunFromSwap;
    @XmlElement(name = "image_file_system", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", defaultValue = "false")
    protected EntityItemBoolType imageFileSystem;
    @XmlElement(name = "image_file_dll", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", defaultValue = "false")
    protected EntityItemBoolType imageFileDll;
    @XmlElement(name = "image_file_up_system_only", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", defaultValue = "false")
    protected EntityItemBoolType imageFileUpSystemOnly;
    @XmlElement(name = "image_file_bytes_reveresed_hi", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", defaultValue = "false")
    protected EntityItemBoolType imageFileBytesReveresedHi;
    @XmlElement(name = "magic_number", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType magicNumber;
    @XmlElement(name = "major_linker_version", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType majorLinkerVersion;
    @XmlElement(name = "minor_linker_version", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType minorLinkerVersion;
    @XmlElement(name = "size_of_code", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType sizeOfCode;
    @XmlElement(name = "size_of_initialized_data", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType sizeOfInitializedData;
    @XmlElement(name = "size_of_uninitialized_data", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType sizeOfUninitializedData;
    @XmlElement(name = "address_of_entry_point", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType addressOfEntryPoint;
    @XmlElement(name = "base_of_code", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType baseOfCode;
    @XmlElement(name = "base_of_data", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType baseOfData;
    @XmlElement(name = "image_base_address", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType imageBaseAddress;
    @XmlElement(name = "section_alignment", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType sectionAlignment;
    @XmlElement(name = "file_alignment", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType fileAlignment;
    @XmlElement(name = "major_operating_system_version", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType majorOperatingSystemVersion;
    @XmlElement(name = "minor_operating_system_version", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType minorOperatingSystemVersion;
    @XmlElement(name = "major_image_version", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType majorImageVersion;
    @XmlElement(name = "minor_image_version", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType minorImageVersion;
    @XmlElement(name = "major_subsystem_version", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType majorSubsystemVersion;
    @XmlElement(name = "minor_susbsystem_version", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType minorSusbsystemVersion;
    @XmlElement(name = "size_of_image", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType sizeOfImage;
    @XmlElement(name = "size_of_headers", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType sizeOfHeaders;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType checksum;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemPeSubsystemType subsystem;
    @XmlElement(name = "dll_characteristics", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected List<EntityItemIntType> dllCharacteristics;
    @XmlElement(name = "size_of_stack_reserve", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType sizeOfStackReserve;
    @XmlElement(name = "size_of_stack_commit", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType sizeOfStackCommit;
    @XmlElement(name = "size_of_heap_reserve", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType sizeOfHeapReserve;
    @XmlElement(name = "size_of_heap_commit", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType sizeOfHeapCommit;
    @XmlElement(name = "loader_flags", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType loaderFlags;
    @XmlElement(name = "number_of_rva_and_sizes", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType numberOfRvaAndSizes;
    @XmlElement(name = "real_number_of_directory_entries", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType realNumberOfDirectoryEntries;
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
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setFilename(EntityItemStringType value) {
        this.filename = value;
    }

    /**
     * Gets the value of the headerSignature property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getHeaderSignature() {
        return headerSignature;
    }

    /**
     * Sets the value of the headerSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setHeaderSignature(EntityItemStringType value) {
        this.headerSignature = value;
    }

    /**
     * Gets the value of the targetMachineType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPeTargetMachineType }
     *     
     */
    public EntityItemPeTargetMachineType getTargetMachineType() {
        return targetMachineType;
    }

    /**
     * Sets the value of the targetMachineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPeTargetMachineType }
     *     
     */
    public void setTargetMachineType(EntityItemPeTargetMachineType value) {
        this.targetMachineType = value;
    }

    /**
     * Gets the value of the numberOfSections property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getNumberOfSections() {
        return numberOfSections;
    }

    /**
     * Sets the value of the numberOfSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setNumberOfSections(EntityItemIntType value) {
        this.numberOfSections = value;
    }

    /**
     * Gets the value of the timeDateStamp property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getTimeDateStamp() {
        return timeDateStamp;
    }

    /**
     * Sets the value of the timeDateStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setTimeDateStamp(EntityItemIntType value) {
        this.timeDateStamp = value;
    }

    /**
     * Gets the value of the pointerToSymbolTable property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPointerToSymbolTable() {
        return pointerToSymbolTable;
    }

    /**
     * Sets the value of the pointerToSymbolTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPointerToSymbolTable(EntityItemIntType value) {
        this.pointerToSymbolTable = value;
    }

    /**
     * Gets the value of the numberOfSymbols property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getNumberOfSymbols() {
        return numberOfSymbols;
    }

    /**
     * Sets the value of the numberOfSymbols property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setNumberOfSymbols(EntityItemIntType value) {
        this.numberOfSymbols = value;
    }

    /**
     * Gets the value of the sizeOfOptionalHeader property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfOptionalHeader() {
        return sizeOfOptionalHeader;
    }

    /**
     * Sets the value of the sizeOfOptionalHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfOptionalHeader(EntityItemIntType value) {
        this.sizeOfOptionalHeader = value;
    }

    /**
     * Gets the value of the imageFileRelocsStripped property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileRelocsStripped() {
        return imageFileRelocsStripped;
    }

    /**
     * Sets the value of the imageFileRelocsStripped property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileRelocsStripped(EntityItemBoolType value) {
        this.imageFileRelocsStripped = value;
    }

    /**
     * Gets the value of the imageFileExecutableImage property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileExecutableImage() {
        return imageFileExecutableImage;
    }

    /**
     * Sets the value of the imageFileExecutableImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileExecutableImage(EntityItemBoolType value) {
        this.imageFileExecutableImage = value;
    }

    /**
     * Gets the value of the imageFileLineNumsStripped property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileLineNumsStripped() {
        return imageFileLineNumsStripped;
    }

    /**
     * Sets the value of the imageFileLineNumsStripped property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileLineNumsStripped(EntityItemBoolType value) {
        this.imageFileLineNumsStripped = value;
    }

    /**
     * Gets the value of the imageFileLocalSymsStripped property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileLocalSymsStripped() {
        return imageFileLocalSymsStripped;
    }

    /**
     * Sets the value of the imageFileLocalSymsStripped property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileLocalSymsStripped(EntityItemBoolType value) {
        this.imageFileLocalSymsStripped = value;
    }

    /**
     * Gets the value of the imageFileAggresiveWsTrim property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileAggresiveWsTrim() {
        return imageFileAggresiveWsTrim;
    }

    /**
     * Sets the value of the imageFileAggresiveWsTrim property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileAggresiveWsTrim(EntityItemBoolType value) {
        this.imageFileAggresiveWsTrim = value;
    }

    /**
     * Gets the value of the imageFileLargeAddressAware property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileLargeAddressAware() {
        return imageFileLargeAddressAware;
    }

    /**
     * Sets the value of the imageFileLargeAddressAware property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileLargeAddressAware(EntityItemBoolType value) {
        this.imageFileLargeAddressAware = value;
    }

    /**
     * Gets the value of the imageFile16BitMachine property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFile16BitMachine() {
        return imageFile16BitMachine;
    }

    /**
     * Sets the value of the imageFile16BitMachine property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFile16BitMachine(EntityItemBoolType value) {
        this.imageFile16BitMachine = value;
    }

    /**
     * Gets the value of the imageFileBytesReversedLo property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileBytesReversedLo() {
        return imageFileBytesReversedLo;
    }

    /**
     * Sets the value of the imageFileBytesReversedLo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileBytesReversedLo(EntityItemBoolType value) {
        this.imageFileBytesReversedLo = value;
    }

    /**
     * Gets the value of the imageFile32BitMachine property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFile32BitMachine() {
        return imageFile32BitMachine;
    }

    /**
     * Sets the value of the imageFile32BitMachine property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFile32BitMachine(EntityItemBoolType value) {
        this.imageFile32BitMachine = value;
    }

    /**
     * Gets the value of the imageFileDebugStripped property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileDebugStripped() {
        return imageFileDebugStripped;
    }

    /**
     * Sets the value of the imageFileDebugStripped property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileDebugStripped(EntityItemBoolType value) {
        this.imageFileDebugStripped = value;
    }

    /**
     * Gets the value of the imageFileRemovableRunFromSwap property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileRemovableRunFromSwap() {
        return imageFileRemovableRunFromSwap;
    }

    /**
     * Sets the value of the imageFileRemovableRunFromSwap property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileRemovableRunFromSwap(EntityItemBoolType value) {
        this.imageFileRemovableRunFromSwap = value;
    }

    /**
     * Gets the value of the imageFileSystem property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileSystem() {
        return imageFileSystem;
    }

    /**
     * Sets the value of the imageFileSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileSystem(EntityItemBoolType value) {
        this.imageFileSystem = value;
    }

    /**
     * Gets the value of the imageFileDll property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileDll() {
        return imageFileDll;
    }

    /**
     * Sets the value of the imageFileDll property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileDll(EntityItemBoolType value) {
        this.imageFileDll = value;
    }

    /**
     * Gets the value of the imageFileUpSystemOnly property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileUpSystemOnly() {
        return imageFileUpSystemOnly;
    }

    /**
     * Sets the value of the imageFileUpSystemOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileUpSystemOnly(EntityItemBoolType value) {
        this.imageFileUpSystemOnly = value;
    }

    /**
     * Gets the value of the imageFileBytesReveresedHi property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileBytesReveresedHi() {
        return imageFileBytesReveresedHi;
    }

    /**
     * Sets the value of the imageFileBytesReveresedHi property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileBytesReveresedHi(EntityItemBoolType value) {
        this.imageFileBytesReveresedHi = value;
    }

    /**
     * Gets the value of the magicNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMagicNumber() {
        return magicNumber;
    }

    /**
     * Sets the value of the magicNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMagicNumber(EntityItemIntType value) {
        this.magicNumber = value;
    }

    /**
     * Gets the value of the majorLinkerVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMajorLinkerVersion() {
        return majorLinkerVersion;
    }

    /**
     * Sets the value of the majorLinkerVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMajorLinkerVersion(EntityItemIntType value) {
        this.majorLinkerVersion = value;
    }

    /**
     * Gets the value of the minorLinkerVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinorLinkerVersion() {
        return minorLinkerVersion;
    }

    /**
     * Sets the value of the minorLinkerVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinorLinkerVersion(EntityItemIntType value) {
        this.minorLinkerVersion = value;
    }

    /**
     * Gets the value of the sizeOfCode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfCode() {
        return sizeOfCode;
    }

    /**
     * Sets the value of the sizeOfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfCode(EntityItemIntType value) {
        this.sizeOfCode = value;
    }

    /**
     * Gets the value of the sizeOfInitializedData property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfInitializedData() {
        return sizeOfInitializedData;
    }

    /**
     * Sets the value of the sizeOfInitializedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfInitializedData(EntityItemIntType value) {
        this.sizeOfInitializedData = value;
    }

    /**
     * Gets the value of the sizeOfUninitializedData property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfUninitializedData() {
        return sizeOfUninitializedData;
    }

    /**
     * Sets the value of the sizeOfUninitializedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfUninitializedData(EntityItemIntType value) {
        this.sizeOfUninitializedData = value;
    }

    /**
     * Gets the value of the addressOfEntryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getAddressOfEntryPoint() {
        return addressOfEntryPoint;
    }

    /**
     * Sets the value of the addressOfEntryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setAddressOfEntryPoint(EntityItemIntType value) {
        this.addressOfEntryPoint = value;
    }

    /**
     * Gets the value of the baseOfCode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getBaseOfCode() {
        return baseOfCode;
    }

    /**
     * Sets the value of the baseOfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setBaseOfCode(EntityItemIntType value) {
        this.baseOfCode = value;
    }

    /**
     * Gets the value of the baseOfData property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getBaseOfData() {
        return baseOfData;
    }

    /**
     * Sets the value of the baseOfData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setBaseOfData(EntityItemIntType value) {
        this.baseOfData = value;
    }

    /**
     * Gets the value of the imageBaseAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getImageBaseAddress() {
        return imageBaseAddress;
    }

    /**
     * Sets the value of the imageBaseAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setImageBaseAddress(EntityItemIntType value) {
        this.imageBaseAddress = value;
    }

    /**
     * Gets the value of the sectionAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSectionAlignment() {
        return sectionAlignment;
    }

    /**
     * Sets the value of the sectionAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSectionAlignment(EntityItemIntType value) {
        this.sectionAlignment = value;
    }

    /**
     * Gets the value of the fileAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getFileAlignment() {
        return fileAlignment;
    }

    /**
     * Sets the value of the fileAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setFileAlignment(EntityItemIntType value) {
        this.fileAlignment = value;
    }

    /**
     * Gets the value of the majorOperatingSystemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMajorOperatingSystemVersion() {
        return majorOperatingSystemVersion;
    }

    /**
     * Sets the value of the majorOperatingSystemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMajorOperatingSystemVersion(EntityItemIntType value) {
        this.majorOperatingSystemVersion = value;
    }

    /**
     * Gets the value of the minorOperatingSystemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinorOperatingSystemVersion() {
        return minorOperatingSystemVersion;
    }

    /**
     * Sets the value of the minorOperatingSystemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinorOperatingSystemVersion(EntityItemIntType value) {
        this.minorOperatingSystemVersion = value;
    }

    /**
     * Gets the value of the majorImageVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMajorImageVersion() {
        return majorImageVersion;
    }

    /**
     * Sets the value of the majorImageVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMajorImageVersion(EntityItemIntType value) {
        this.majorImageVersion = value;
    }

    /**
     * Gets the value of the minorImageVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinorImageVersion() {
        return minorImageVersion;
    }

    /**
     * Sets the value of the minorImageVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinorImageVersion(EntityItemIntType value) {
        this.minorImageVersion = value;
    }

    /**
     * Gets the value of the majorSubsystemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMajorSubsystemVersion() {
        return majorSubsystemVersion;
    }

    /**
     * Sets the value of the majorSubsystemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMajorSubsystemVersion(EntityItemIntType value) {
        this.majorSubsystemVersion = value;
    }

    /**
     * Gets the value of the minorSusbsystemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinorSusbsystemVersion() {
        return minorSusbsystemVersion;
    }

    /**
     * Sets the value of the minorSusbsystemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinorSusbsystemVersion(EntityItemIntType value) {
        this.minorSusbsystemVersion = value;
    }

    /**
     * Gets the value of the sizeOfImage property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfImage() {
        return sizeOfImage;
    }

    /**
     * Sets the value of the sizeOfImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfImage(EntityItemIntType value) {
        this.sizeOfImage = value;
    }

    /**
     * Gets the value of the sizeOfHeaders property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfHeaders() {
        return sizeOfHeaders;
    }

    /**
     * Sets the value of the sizeOfHeaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfHeaders(EntityItemIntType value) {
        this.sizeOfHeaders = value;
    }

    /**
     * Gets the value of the checksum property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getChecksum() {
        return checksum;
    }

    /**
     * Sets the value of the checksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setChecksum(EntityItemIntType value) {
        this.checksum = value;
    }

    /**
     * Gets the value of the subsystem property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPeSubsystemType }
     *     
     */
    public EntityItemPeSubsystemType getSubsystem() {
        return subsystem;
    }

    /**
     * Sets the value of the subsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPeSubsystemType }
     *     
     */
    public void setSubsystem(EntityItemPeSubsystemType value) {
        this.subsystem = value;
    }

    /**
     * Gets the value of the dllCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dllCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDllCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemIntType }
     * 
     * 
     */
    public List<EntityItemIntType> getDllCharacteristics() {
        if (dllCharacteristics == null) {
            dllCharacteristics = new ArrayList<EntityItemIntType>();
        }
        return this.dllCharacteristics;
    }

    /**
     * Gets the value of the sizeOfStackReserve property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfStackReserve() {
        return sizeOfStackReserve;
    }

    /**
     * Sets the value of the sizeOfStackReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfStackReserve(EntityItemIntType value) {
        this.sizeOfStackReserve = value;
    }

    /**
     * Gets the value of the sizeOfStackCommit property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfStackCommit() {
        return sizeOfStackCommit;
    }

    /**
     * Sets the value of the sizeOfStackCommit property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfStackCommit(EntityItemIntType value) {
        this.sizeOfStackCommit = value;
    }

    /**
     * Gets the value of the sizeOfHeapReserve property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfHeapReserve() {
        return sizeOfHeapReserve;
    }

    /**
     * Sets the value of the sizeOfHeapReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfHeapReserve(EntityItemIntType value) {
        this.sizeOfHeapReserve = value;
    }

    /**
     * Gets the value of the sizeOfHeapCommit property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfHeapCommit() {
        return sizeOfHeapCommit;
    }

    /**
     * Sets the value of the sizeOfHeapCommit property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfHeapCommit(EntityItemIntType value) {
        this.sizeOfHeapCommit = value;
    }

    /**
     * Gets the value of the loaderFlags property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getLoaderFlags() {
        return loaderFlags;
    }

    /**
     * Sets the value of the loaderFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setLoaderFlags(EntityItemIntType value) {
        this.loaderFlags = value;
    }

    /**
     * Gets the value of the numberOfRvaAndSizes property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getNumberOfRvaAndSizes() {
        return numberOfRvaAndSizes;
    }

    /**
     * Sets the value of the numberOfRvaAndSizes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setNumberOfRvaAndSizes(EntityItemIntType value) {
        this.numberOfRvaAndSizes = value;
    }

    /**
     * Gets the value of the realNumberOfDirectoryEntries property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getRealNumberOfDirectoryEntries() {
        return realNumberOfDirectoryEntries;
    }

    /**
     * Sets the value of the realNumberOfDirectoryEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setRealNumberOfDirectoryEntries(EntityItemIntType value) {
        this.realNumberOfDirectoryEntries = value;
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
