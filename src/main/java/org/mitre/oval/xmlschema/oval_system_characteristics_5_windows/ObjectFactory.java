


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemAnySimpleType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemRecordType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemVersionType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_system_characteristics_5_windows package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Activedirectory57Item_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "activedirectory57_item");
    private final static QName _FileItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "file_item");
    private final static QName _SharedresourceItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "sharedresource_item");
    private final static QName _GroupSidItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "group_sid_item");
    private final static QName _UserItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "user_item");
    private final static QName _WmiItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "wmi_item");
    private final static QName _ServiceItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "service_item");
    private final static QName _AuditeventpolicyItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "auditeventpolicy_item");
    private final static QName _SidItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "sid_item");
    private final static QName _Wmi57Item_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "wmi57_item");
    private final static QName _LockoutpolicyItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "lockoutpolicy_item");
    private final static QName _InterfaceItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "interface_item");
    private final static QName _LicenseItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "license_item");
    private final static QName _PeheaderItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "peheader_item");
    private final static QName _GroupItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "group_item");
    private final static QName _RegistryItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "registry_item");
    private final static QName _AuditeventpolicysubcategoriesItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "auditeventpolicysubcategories_item");
    private final static QName _FileeffectiverightsItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "fileeffectiverights_item");
    private final static QName _ServiceeffectiverightsItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "serviceeffectiverights_item");
    private final static QName _SharedresourceauditedpermissionsItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "sharedresourceauditedpermissions_item");
    private final static QName _SidSidItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "sid_sid_item");
    private final static QName _ActivedirectoryItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "activedirectory_item");
    private final static QName _WuaupdatesearcherItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "wuaupdatesearcher_item");
    private final static QName _UserrightItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "userright_item");
    private final static QName _CmdletItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "cmdlet_item");
    private final static QName _UserSidItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "user_sid_item");
    private final static QName _PortItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "port_item");
    private final static QName _DnscacheItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "dnscache_item");
    private final static QName _VolumeItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "volume_item");
    private final static QName _FileauditedpermissionsItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "fileauditedpermissions_item");
    private final static QName _PasswordpolicyItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "passwordpolicy_item");
    private final static QName _SystemmetricItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "systemmetric_item");
    private final static QName _NtuserItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "ntuser_item");
    private final static QName _ProcessItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "process_item");
    private final static QName _PrintereffectiverightsItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "printereffectiverights_item");
    private final static QName _MetabaseItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "metabase_item");
    private final static QName _JunctionItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "junction_item");
    private final static QName _UacItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "uac_item");
    private final static QName _RegkeyeffectiverightsItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "regkeyeffectiverights_item");
    private final static QName _RegkeyauditedpermissionsItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "regkeyauditedpermissions_item");
    private final static QName _SharedresourceeffectiverightsItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "sharedresourceeffectiverights_item");
    private final static QName _AccesstokenItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "accesstoken_item");
    private final static QName _Activedirectory57ItemRelativeDn_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "relative_dn");
    private final static QName _Activedirectory57ItemAttribute_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "attribute");
    private final static QName _RegkeyauditedpermissionsItemKey_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "key");
    private final static QName _RegistryItemName_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "name");
    private final static QName _MetabaseItemData_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "data");
    private final static QName _MetabaseItemUserType_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "user_type");
    private final static QName _MetabaseItemDataType_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "data_type");
    private final static QName _MetabaseItemId_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "id");
    private final static QName _FileauditedpermissionsItemFilename_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "filename");
    private final static QName _CmdletItemModuleId_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "module_id");
    private final static QName _CmdletItemSelect_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "select");
    private final static QName _CmdletItemParameters_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "parameters");
    private final static QName _CmdletItemModuleVersion_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "module_version");
    private final static QName _CmdletItemModuleName_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", "module_name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_system_characteristics_5_windows
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FileItem }
     * 
     */
    public FileItem createFileItem() {
        return new FileItem();
    }

    /**
     * Create an instance of {@link ServiceeffectiverightsItem }
     * 
     */
    public ServiceeffectiverightsItem createServiceeffectiverightsItem() {
        return new ServiceeffectiverightsItem();
    }

    /**
     * Create an instance of {@link SidItem }
     * 
     */
    public SidItem createSidItem() {
        return new SidItem();
    }

    /**
     * Create an instance of {@link NtuserItem }
     * 
     */
    public NtuserItem createNtuserItem() {
        return new NtuserItem();
    }

    /**
     * Create an instance of {@link LicenseItem }
     * 
     */
    public LicenseItem createLicenseItem() {
        return new LicenseItem();
    }

    /**
     * Create an instance of {@link PeheaderItem }
     * 
     */
    public PeheaderItem createPeheaderItem() {
        return new PeheaderItem();
    }

    /**
     * Create an instance of {@link FileauditedpermissionsItem }
     * 
     */
    public FileauditedpermissionsItem createFileauditedpermissionsItem() {
        return new FileauditedpermissionsItem();
    }

    /**
     * Create an instance of {@link UserrightItem }
     * 
     */
    public UserrightItem createUserrightItem() {
        return new UserrightItem();
    }

    /**
     * Create an instance of {@link InterfaceItem }
     * 
     */
    public InterfaceItem createInterfaceItem() {
        return new InterfaceItem();
    }

    /**
     * Create an instance of {@link Wmi57Item }
     * 
     */
    public Wmi57Item createWmi57Item() {
        return new Wmi57Item();
    }

    /**
     * Create an instance of {@link VolumeItem }
     * 
     */
    public VolumeItem createVolumeItem() {
        return new VolumeItem();
    }

    /**
     * Create an instance of {@link RegistryItem }
     * 
     */
    public RegistryItem createRegistryItem() {
        return new RegistryItem();
    }

    /**
     * Create an instance of {@link ActivedirectoryItem }
     * 
     */
    public ActivedirectoryItem createActivedirectoryItem() {
        return new ActivedirectoryItem();
    }

    /**
     * Create an instance of {@link AuditeventpolicyItem }
     * 
     */
    public AuditeventpolicyItem createAuditeventpolicyItem() {
        return new AuditeventpolicyItem();
    }

    /**
     * Create an instance of {@link CmdletItem }
     * 
     */
    public CmdletItem createCmdletItem() {
        return new CmdletItem();
    }

    /**
     * Create an instance of {@link MetabaseItem }
     * 
     */
    public MetabaseItem createMetabaseItem() {
        return new MetabaseItem();
    }

    /**
     * Create an instance of {@link PasswordpolicyItem }
     * 
     */
    public PasswordpolicyItem createPasswordpolicyItem() {
        return new PasswordpolicyItem();
    }

    /**
     * Create an instance of {@link AccesstokenItem }
     * 
     */
    public AccesstokenItem createAccesstokenItem() {
        return new AccesstokenItem();
    }

    /**
     * Create an instance of {@link WuaupdatesearcherItem }
     * 
     */
    public WuaupdatesearcherItem createWuaupdatesearcherItem() {
        return new WuaupdatesearcherItem();
    }

    /**
     * Create an instance of {@link SharedresourceauditedpermissionsItem }
     * 
     */
    public SharedresourceauditedpermissionsItem createSharedresourceauditedpermissionsItem() {
        return new SharedresourceauditedpermissionsItem();
    }

    /**
     * Create an instance of {@link RegkeyeffectiverightsItem }
     * 
     */
    public RegkeyeffectiverightsItem createRegkeyeffectiverightsItem() {
        return new RegkeyeffectiverightsItem();
    }

    /**
     * Create an instance of {@link SystemmetricItem }
     * 
     */
    public SystemmetricItem createSystemmetricItem() {
        return new SystemmetricItem();
    }

    /**
     * Create an instance of {@link SidSidItem }
     * 
     */
    public SidSidItem createSidSidItem() {
        return new SidSidItem();
    }

    /**
     * Create an instance of {@link PortItem }
     * 
     */
    public PortItem createPortItem() {
        return new PortItem();
    }

    /**
     * Create an instance of {@link ProcessItem }
     * 
     */
    public ProcessItem createProcessItem() {
        return new ProcessItem();
    }

    /**
     * Create an instance of {@link FileeffectiverightsItem }
     * 
     */
    public FileeffectiverightsItem createFileeffectiverightsItem() {
        return new FileeffectiverightsItem();
    }

    /**
     * Create an instance of {@link SharedresourceeffectiverightsItem }
     * 
     */
    public SharedresourceeffectiverightsItem createSharedresourceeffectiverightsItem() {
        return new SharedresourceeffectiverightsItem();
    }

    /**
     * Create an instance of {@link GroupSidItem }
     * 
     */
    public GroupSidItem createGroupSidItem() {
        return new GroupSidItem();
    }

    /**
     * Create an instance of {@link ServiceItem }
     * 
     */
    public ServiceItem createServiceItem() {
        return new ServiceItem();
    }

    /**
     * Create an instance of {@link SharedresourceItem }
     * 
     */
    public SharedresourceItem createSharedresourceItem() {
        return new SharedresourceItem();
    }

    /**
     * Create an instance of {@link DnscacheItem }
     * 
     */
    public DnscacheItem createDnscacheItem() {
        return new DnscacheItem();
    }

    /**
     * Create an instance of {@link UserItem }
     * 
     */
    public UserItem createUserItem() {
        return new UserItem();
    }

    /**
     * Create an instance of {@link JunctionItem }
     * 
     */
    public JunctionItem createJunctionItem() {
        return new JunctionItem();
    }

    /**
     * Create an instance of {@link LockoutpolicyItem }
     * 
     */
    public LockoutpolicyItem createLockoutpolicyItem() {
        return new LockoutpolicyItem();
    }

    /**
     * Create an instance of {@link UserSidItem }
     * 
     */
    public UserSidItem createUserSidItem() {
        return new UserSidItem();
    }

    /**
     * Create an instance of {@link WmiItem }
     * 
     */
    public WmiItem createWmiItem() {
        return new WmiItem();
    }

    /**
     * Create an instance of {@link Activedirectory57Item }
     * 
     */
    public Activedirectory57Item createActivedirectory57Item() {
        return new Activedirectory57Item();
    }

    /**
     * Create an instance of {@link AuditeventpolicysubcategoriesItem }
     * 
     */
    public AuditeventpolicysubcategoriesItem createAuditeventpolicysubcategoriesItem() {
        return new AuditeventpolicysubcategoriesItem();
    }

    /**
     * Create an instance of {@link UacItem }
     * 
     */
    public UacItem createUacItem() {
        return new UacItem();
    }

    /**
     * Create an instance of {@link PrintereffectiverightsItem }
     * 
     */
    public PrintereffectiverightsItem createPrintereffectiverightsItem() {
        return new PrintereffectiverightsItem();
    }

    /**
     * Create an instance of {@link GroupItem }
     * 
     */
    public GroupItem createGroupItem() {
        return new GroupItem();
    }

    /**
     * Create an instance of {@link RegkeyauditedpermissionsItem }
     * 
     */
    public RegkeyauditedpermissionsItem createRegkeyauditedpermissionsItem() {
        return new RegkeyauditedpermissionsItem();
    }

    /**
     * Create an instance of {@link EntityItemAdstypeType }
     * 
     */
    public EntityItemAdstypeType createEntityItemAdstypeType() {
        return new EntityItemAdstypeType();
    }

    /**
     * Create an instance of {@link EntityItemPeSubsystemType }
     * 
     */
    public EntityItemPeSubsystemType createEntityItemPeSubsystemType() {
        return new EntityItemPeSubsystemType();
    }

    /**
     * Create an instance of {@link EntityItemServiceControlsAcceptedType }
     * 
     */
    public EntityItemServiceControlsAcceptedType createEntityItemServiceControlsAcceptedType() {
        return new EntityItemServiceControlsAcceptedType();
    }

    /**
     * Create an instance of {@link EntityItemWindowsViewType }
     * 
     */
    public EntityItemWindowsViewType createEntityItemWindowsViewType() {
        return new EntityItemWindowsViewType();
    }

    /**
     * Create an instance of {@link EntityItemSharedResourceTypeType }
     * 
     */
    public EntityItemSharedResourceTypeType createEntityItemSharedResourceTypeType() {
        return new EntityItemSharedResourceTypeType();
    }

    /**
     * Create an instance of {@link EntityItemInterfaceTypeType }
     * 
     */
    public EntityItemInterfaceTypeType createEntityItemInterfaceTypeType() {
        return new EntityItemInterfaceTypeType();
    }

    /**
     * Create an instance of {@link EntityItemCmdletVerbType }
     * 
     */
    public EntityItemCmdletVerbType createEntityItemCmdletVerbType() {
        return new EntityItemCmdletVerbType();
    }

    /**
     * Create an instance of {@link EntityItemAuditType }
     * 
     */
    public EntityItemAuditType createEntityItemAuditType() {
        return new EntityItemAuditType();
    }

    /**
     * Create an instance of {@link EntityItemRegistryHiveType }
     * 
     */
    public EntityItemRegistryHiveType createEntityItemRegistryHiveType() {
        return new EntityItemRegistryHiveType();
    }

    /**
     * Create an instance of {@link EntityItemUserRightType }
     * 
     */
    public EntityItemUserRightType createEntityItemUserRightType() {
        return new EntityItemUserRightType();
    }

    /**
     * Create an instance of {@link EntityItemRegistryTypeType }
     * 
     */
    public EntityItemRegistryTypeType createEntityItemRegistryTypeType() {
        return new EntityItemRegistryTypeType();
    }

    /**
     * Create an instance of {@link EntityItemServiceTypeType }
     * 
     */
    public EntityItemServiceTypeType createEntityItemServiceTypeType() {
        return new EntityItemServiceTypeType();
    }

    /**
     * Create an instance of {@link EntityItemGUIDType }
     * 
     */
    public EntityItemGUIDType createEntityItemGUIDType() {
        return new EntityItemGUIDType();
    }

    /**
     * Create an instance of {@link EntityItemAddrTypeType }
     * 
     */
    public EntityItemAddrTypeType createEntityItemAddrTypeType() {
        return new EntityItemAddrTypeType();
    }

    /**
     * Create an instance of {@link EntityItemServiceStartTypeType }
     * 
     */
    public EntityItemServiceStartTypeType createEntityItemServiceStartTypeType() {
        return new EntityItemServiceStartTypeType();
    }

    /**
     * Create an instance of {@link EntityItemFileTypeType }
     * 
     */
    public EntityItemFileTypeType createEntityItemFileTypeType() {
        return new EntityItemFileTypeType();
    }

    /**
     * Create an instance of {@link EntityItemFileAttributeType }
     * 
     */
    public EntityItemFileAttributeType createEntityItemFileAttributeType() {
        return new EntityItemFileAttributeType();
    }

    /**
     * Create an instance of {@link EntityItemPeTargetMachineType }
     * 
     */
    public EntityItemPeTargetMachineType createEntityItemPeTargetMachineType() {
        return new EntityItemPeTargetMachineType();
    }

    /**
     * Create an instance of {@link EntityItemDriveTypeType }
     * 
     */
    public EntityItemDriveTypeType createEntityItemDriveTypeType() {
        return new EntityItemDriveTypeType();
    }

    /**
     * Create an instance of {@link EntityItemNamingContextType }
     * 
     */
    public EntityItemNamingContextType createEntityItemNamingContextType() {
        return new EntityItemNamingContextType();
    }

    /**
     * Create an instance of {@link EntityItemProtocolType }
     * 
     */
    public EntityItemProtocolType createEntityItemProtocolType() {
        return new EntityItemProtocolType();
    }

    /**
     * Create an instance of {@link EntityItemNTUserAccountTypeType }
     * 
     */
    public EntityItemNTUserAccountTypeType createEntityItemNTUserAccountTypeType() {
        return new EntityItemNTUserAccountTypeType();
    }

    /**
     * Create an instance of {@link EntityItemServiceCurrentStateType }
     * 
     */
    public EntityItemServiceCurrentStateType createEntityItemServiceCurrentStateType() {
        return new EntityItemServiceCurrentStateType();
    }

    /**
     * Create an instance of {@link EntityItemSystemMetricIndexType }
     * 
     */
    public EntityItemSystemMetricIndexType createEntityItemSystemMetricIndexType() {
        return new EntityItemSystemMetricIndexType();
    }

    /**
     * Create an instance of {@link FileItem.ProductVersion }
     * 
     */
    public FileItem.ProductVersion createFileItemProductVersion() {
        return new FileItem.ProductVersion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Activedirectory57Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "activedirectory57_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<Activedirectory57Item> createActivedirectory57Item(Activedirectory57Item value) {
        return new JAXBElement<Activedirectory57Item>(_Activedirectory57Item_QNAME, Activedirectory57Item.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "file_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<FileItem> createFileItem(FileItem value) {
        return new JAXBElement<FileItem>(_FileItem_QNAME, FileItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedresourceItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "sharedresource_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SharedresourceItem> createSharedresourceItem(SharedresourceItem value) {
        return new JAXBElement<SharedresourceItem>(_SharedresourceItem_QNAME, SharedresourceItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupSidItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "group_sid_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<GroupSidItem> createGroupSidItem(GroupSidItem value) {
        return new JAXBElement<GroupSidItem>(_GroupSidItem_QNAME, GroupSidItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "user_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<UserItem> createUserItem(UserItem value) {
        return new JAXBElement<UserItem>(_UserItem_QNAME, UserItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WmiItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "wmi_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<WmiItem> createWmiItem(WmiItem value) {
        return new JAXBElement<WmiItem>(_WmiItem_QNAME, WmiItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "service_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<ServiceItem> createServiceItem(ServiceItem value) {
        return new JAXBElement<ServiceItem>(_ServiceItem_QNAME, ServiceItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuditeventpolicyItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "auditeventpolicy_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<AuditeventpolicyItem> createAuditeventpolicyItem(AuditeventpolicyItem value) {
        return new JAXBElement<AuditeventpolicyItem>(_AuditeventpolicyItem_QNAME, AuditeventpolicyItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SidItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "sid_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SidItem> createSidItem(SidItem value) {
        return new JAXBElement<SidItem>(_SidItem_QNAME, SidItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Wmi57Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "wmi57_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<Wmi57Item> createWmi57Item(Wmi57Item value) {
        return new JAXBElement<Wmi57Item>(_Wmi57Item_QNAME, Wmi57Item.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockoutpolicyItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "lockoutpolicy_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<LockoutpolicyItem> createLockoutpolicyItem(LockoutpolicyItem value) {
        return new JAXBElement<LockoutpolicyItem>(_LockoutpolicyItem_QNAME, LockoutpolicyItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "interface_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<InterfaceItem> createInterfaceItem(InterfaceItem value) {
        return new JAXBElement<InterfaceItem>(_InterfaceItem_QNAME, InterfaceItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "license_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<LicenseItem> createLicenseItem(LicenseItem value) {
        return new JAXBElement<LicenseItem>(_LicenseItem_QNAME, LicenseItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeheaderItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "peheader_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<PeheaderItem> createPeheaderItem(PeheaderItem value) {
        return new JAXBElement<PeheaderItem>(_PeheaderItem_QNAME, PeheaderItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "group_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<GroupItem> createGroupItem(GroupItem value) {
        return new JAXBElement<GroupItem>(_GroupItem_QNAME, GroupItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "registry_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<RegistryItem> createRegistryItem(RegistryItem value) {
        return new JAXBElement<RegistryItem>(_RegistryItem_QNAME, RegistryItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuditeventpolicysubcategoriesItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "auditeventpolicysubcategories_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<AuditeventpolicysubcategoriesItem> createAuditeventpolicysubcategoriesItem(AuditeventpolicysubcategoriesItem value) {
        return new JAXBElement<AuditeventpolicysubcategoriesItem>(_AuditeventpolicysubcategoriesItem_QNAME, AuditeventpolicysubcategoriesItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileeffectiverightsItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "fileeffectiverights_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<FileeffectiverightsItem> createFileeffectiverightsItem(FileeffectiverightsItem value) {
        return new JAXBElement<FileeffectiverightsItem>(_FileeffectiverightsItem_QNAME, FileeffectiverightsItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceeffectiverightsItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "serviceeffectiverights_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<ServiceeffectiverightsItem> createServiceeffectiverightsItem(ServiceeffectiverightsItem value) {
        return new JAXBElement<ServiceeffectiverightsItem>(_ServiceeffectiverightsItem_QNAME, ServiceeffectiverightsItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedresourceauditedpermissionsItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "sharedresourceauditedpermissions_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SharedresourceauditedpermissionsItem> createSharedresourceauditedpermissionsItem(SharedresourceauditedpermissionsItem value) {
        return new JAXBElement<SharedresourceauditedpermissionsItem>(_SharedresourceauditedpermissionsItem_QNAME, SharedresourceauditedpermissionsItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SidSidItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "sid_sid_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SidSidItem> createSidSidItem(SidSidItem value) {
        return new JAXBElement<SidSidItem>(_SidSidItem_QNAME, SidSidItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivedirectoryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "activedirectory_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<ActivedirectoryItem> createActivedirectoryItem(ActivedirectoryItem value) {
        return new JAXBElement<ActivedirectoryItem>(_ActivedirectoryItem_QNAME, ActivedirectoryItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WuaupdatesearcherItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "wuaupdatesearcher_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<WuaupdatesearcherItem> createWuaupdatesearcherItem(WuaupdatesearcherItem value) {
        return new JAXBElement<WuaupdatesearcherItem>(_WuaupdatesearcherItem_QNAME, WuaupdatesearcherItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserrightItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "userright_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<UserrightItem> createUserrightItem(UserrightItem value) {
        return new JAXBElement<UserrightItem>(_UserrightItem_QNAME, UserrightItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CmdletItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "cmdlet_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<CmdletItem> createCmdletItem(CmdletItem value) {
        return new JAXBElement<CmdletItem>(_CmdletItem_QNAME, CmdletItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSidItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "user_sid_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<UserSidItem> createUserSidItem(UserSidItem value) {
        return new JAXBElement<UserSidItem>(_UserSidItem_QNAME, UserSidItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "port_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<PortItem> createPortItem(PortItem value) {
        return new JAXBElement<PortItem>(_PortItem_QNAME, PortItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DnscacheItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "dnscache_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<DnscacheItem> createDnscacheItem(DnscacheItem value) {
        return new JAXBElement<DnscacheItem>(_DnscacheItem_QNAME, DnscacheItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumeItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "volume_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<VolumeItem> createVolumeItem(VolumeItem value) {
        return new JAXBElement<VolumeItem>(_VolumeItem_QNAME, VolumeItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileauditedpermissionsItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "fileauditedpermissions_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<FileauditedpermissionsItem> createFileauditedpermissionsItem(FileauditedpermissionsItem value) {
        return new JAXBElement<FileauditedpermissionsItem>(_FileauditedpermissionsItem_QNAME, FileauditedpermissionsItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordpolicyItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "passwordpolicy_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<PasswordpolicyItem> createPasswordpolicyItem(PasswordpolicyItem value) {
        return new JAXBElement<PasswordpolicyItem>(_PasswordpolicyItem_QNAME, PasswordpolicyItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemmetricItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "systemmetric_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SystemmetricItem> createSystemmetricItem(SystemmetricItem value) {
        return new JAXBElement<SystemmetricItem>(_SystemmetricItem_QNAME, SystemmetricItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NtuserItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "ntuser_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<NtuserItem> createNtuserItem(NtuserItem value) {
        return new JAXBElement<NtuserItem>(_NtuserItem_QNAME, NtuserItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "process_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<ProcessItem> createProcessItem(ProcessItem value) {
        return new JAXBElement<ProcessItem>(_ProcessItem_QNAME, ProcessItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintereffectiverightsItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "printereffectiverights_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<PrintereffectiverightsItem> createPrintereffectiverightsItem(PrintereffectiverightsItem value) {
        return new JAXBElement<PrintereffectiverightsItem>(_PrintereffectiverightsItem_QNAME, PrintereffectiverightsItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetabaseItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "metabase_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<MetabaseItem> createMetabaseItem(MetabaseItem value) {
        return new JAXBElement<MetabaseItem>(_MetabaseItem_QNAME, MetabaseItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JunctionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "junction_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<JunctionItem> createJunctionItem(JunctionItem value) {
        return new JAXBElement<JunctionItem>(_JunctionItem_QNAME, JunctionItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UacItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "uac_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<UacItem> createUacItem(UacItem value) {
        return new JAXBElement<UacItem>(_UacItem_QNAME, UacItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegkeyeffectiverightsItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "regkeyeffectiverights_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<RegkeyeffectiverightsItem> createRegkeyeffectiverightsItem(RegkeyeffectiverightsItem value) {
        return new JAXBElement<RegkeyeffectiverightsItem>(_RegkeyeffectiverightsItem_QNAME, RegkeyeffectiverightsItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegkeyauditedpermissionsItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "regkeyauditedpermissions_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<RegkeyauditedpermissionsItem> createRegkeyauditedpermissionsItem(RegkeyauditedpermissionsItem value) {
        return new JAXBElement<RegkeyauditedpermissionsItem>(_RegkeyauditedpermissionsItem_QNAME, RegkeyauditedpermissionsItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedresourceeffectiverightsItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "sharedresourceeffectiverights_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SharedresourceeffectiverightsItem> createSharedresourceeffectiverightsItem(SharedresourceeffectiverightsItem value) {
        return new JAXBElement<SharedresourceeffectiverightsItem>(_SharedresourceeffectiverightsItem_QNAME, SharedresourceeffectiverightsItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccesstokenItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "accesstoken_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<AccesstokenItem> createAccesstokenItem(AccesstokenItem value) {
        return new JAXBElement<AccesstokenItem>(_AccesstokenItem_QNAME, AccesstokenItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "relative_dn", scope = Activedirectory57Item.class)
    public JAXBElement<EntityItemStringType> createActivedirectory57ItemRelativeDn(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_Activedirectory57ItemRelativeDn_QNAME, EntityItemStringType.class, Activedirectory57Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "attribute", scope = Activedirectory57Item.class)
    public JAXBElement<EntityItemStringType> createActivedirectory57ItemAttribute(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_Activedirectory57ItemAttribute_QNAME, EntityItemStringType.class, Activedirectory57Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "key", scope = RegkeyauditedpermissionsItem.class)
    public JAXBElement<EntityItemStringType> createRegkeyauditedpermissionsItemKey(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_RegkeyauditedpermissionsItemKey_QNAME, EntityItemStringType.class, RegkeyauditedpermissionsItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "key", scope = RegistryItem.class)
    public JAXBElement<EntityItemStringType> createRegistryItemKey(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_RegkeyauditedpermissionsItemKey_QNAME, EntityItemStringType.class, RegistryItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "name", scope = RegistryItem.class)
    public JAXBElement<EntityItemStringType> createRegistryItemName(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_RegistryItemName_QNAME, EntityItemStringType.class, RegistryItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemAnySimpleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "data", scope = MetabaseItem.class)
    public JAXBElement<EntityItemAnySimpleType> createMetabaseItemData(EntityItemAnySimpleType value) {
        return new JAXBElement<EntityItemAnySimpleType>(_MetabaseItemData_QNAME, EntityItemAnySimpleType.class, MetabaseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "user_type", scope = MetabaseItem.class)
    public JAXBElement<EntityItemStringType> createMetabaseItemUserType(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_MetabaseItemUserType_QNAME, EntityItemStringType.class, MetabaseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "key", scope = MetabaseItem.class)
    public JAXBElement<EntityItemStringType> createMetabaseItemKey(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_RegkeyauditedpermissionsItemKey_QNAME, EntityItemStringType.class, MetabaseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "name", scope = MetabaseItem.class)
    public JAXBElement<EntityItemStringType> createMetabaseItemName(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_RegistryItemName_QNAME, EntityItemStringType.class, MetabaseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "data_type", scope = MetabaseItem.class)
    public JAXBElement<EntityItemStringType> createMetabaseItemDataType(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_MetabaseItemDataType_QNAME, EntityItemStringType.class, MetabaseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "id", scope = MetabaseItem.class)
    public JAXBElement<EntityItemIntType> createMetabaseItemId(EntityItemIntType value) {
        return new JAXBElement<EntityItemIntType>(_MetabaseItemId_QNAME, EntityItemIntType.class, MetabaseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "key", scope = RegkeyeffectiverightsItem.class)
    public JAXBElement<EntityItemStringType> createRegkeyeffectiverightsItemKey(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_RegkeyauditedpermissionsItemKey_QNAME, EntityItemStringType.class, RegkeyeffectiverightsItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "filename", scope = FileauditedpermissionsItem.class)
    public JAXBElement<EntityItemStringType> createFileauditedpermissionsItemFilename(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_FileauditedpermissionsItemFilename_QNAME, EntityItemStringType.class, FileauditedpermissionsItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "name", scope = NtuserItem.class)
    public JAXBElement<EntityItemStringType> createNtuserItemName(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_RegistryItemName_QNAME, EntityItemStringType.class, NtuserItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "filename", scope = FileItem.class)
    public JAXBElement<EntityItemStringType> createFileItemFilename(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_FileauditedpermissionsItemFilename_QNAME, EntityItemStringType.class, FileItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "filename", scope = FileeffectiverightsItem.class)
    public JAXBElement<EntityItemStringType> createFileeffectiverightsItemFilename(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_FileauditedpermissionsItemFilename_QNAME, EntityItemStringType.class, FileeffectiverightsItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemGUIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "module_id", scope = CmdletItem.class)
    public JAXBElement<EntityItemGUIDType> createCmdletItemModuleId(EntityItemGUIDType value) {
        return new JAXBElement<EntityItemGUIDType>(_CmdletItemModuleId_QNAME, EntityItemGUIDType.class, CmdletItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemRecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "select", scope = CmdletItem.class)
    public JAXBElement<EntityItemRecordType> createCmdletItemSelect(EntityItemRecordType value) {
        return new JAXBElement<EntityItemRecordType>(_CmdletItemSelect_QNAME, EntityItemRecordType.class, CmdletItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemRecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "parameters", scope = CmdletItem.class)
    public JAXBElement<EntityItemRecordType> createCmdletItemParameters(EntityItemRecordType value) {
        return new JAXBElement<EntityItemRecordType>(_CmdletItemParameters_QNAME, EntityItemRecordType.class, CmdletItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemVersionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "module_version", scope = CmdletItem.class)
    public JAXBElement<EntityItemVersionType> createCmdletItemModuleVersion(EntityItemVersionType value) {
        return new JAXBElement<EntityItemVersionType>(_CmdletItemModuleVersion_QNAME, EntityItemVersionType.class, CmdletItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "module_name", scope = CmdletItem.class)
    public JAXBElement<EntityItemStringType> createCmdletItemModuleName(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_CmdletItemModuleName_QNAME, EntityItemStringType.class, CmdletItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "relative_dn", scope = ActivedirectoryItem.class)
    public JAXBElement<EntityItemStringType> createActivedirectoryItemRelativeDn(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_Activedirectory57ItemRelativeDn_QNAME, EntityItemStringType.class, ActivedirectoryItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", name = "attribute", scope = ActivedirectoryItem.class)
    public JAXBElement<EntityItemStringType> createActivedirectoryItemAttribute(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_Activedirectory57ItemAttribute_QNAME, EntityItemStringType.class, ActivedirectoryItem.class, value);
    }

}
