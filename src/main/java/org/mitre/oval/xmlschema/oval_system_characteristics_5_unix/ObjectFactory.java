
package org.mitre.oval.xmlschema.oval_system_characteristics_5_unix;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_system_characteristics_5_unix package. 
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

    private final static QName _UnameItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "uname_item");
    private final static QName _InetdItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "inetd_item");
    private final static QName _ProcessItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "process_item");
    private final static QName _ShadowItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "shadow_item");
    private final static QName _XinetdItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "xinetd_item");
    private final static QName _GconfItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "gconf_item");
    private final static QName _DnscacheItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "dnscache_item");
    private final static QName _RoutingtableItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "routingtable_item");
    private final static QName _SymlinkItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "symlink_item");
    private final static QName _Process58Item_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "process58_item");
    private final static QName _InterfaceItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "interface_item");
    private final static QName _SccsItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "sccs_item");
    private final static QName _FileextendedattributeItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "fileextendedattribute_item");
    private final static QName _FileItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "file_item");
    private final static QName _PasswordItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "password_item");
    private final static QName _SysctlItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "sysctl_item");
    private final static QName _RunlevelItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "runlevel_item");
    private final static QName _GconfItemSource_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "source");
    private final static QName _FileextendedattributeItemFilename_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", "filename");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_system_characteristics_5_unix
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShadowItem }
     * 
     */
    public ShadowItem createShadowItem() {
        return new ShadowItem();
    }

    /**
     * Create an instance of {@link PasswordItem }
     * 
     */
    public PasswordItem createPasswordItem() {
        return new PasswordItem();
    }

    /**
     * Create an instance of {@link FileItem }
     * 
     */
    public FileItem createFileItem() {
        return new FileItem();
    }

    /**
     * Create an instance of {@link InetdItem }
     * 
     */
    public InetdItem createInetdItem() {
        return new InetdItem();
    }

    /**
     * Create an instance of {@link SymlinkItem }
     * 
     */
    public SymlinkItem createSymlinkItem() {
        return new SymlinkItem();
    }

    /**
     * Create an instance of {@link UnameItem }
     * 
     */
    public UnameItem createUnameItem() {
        return new UnameItem();
    }

    /**
     * Create an instance of {@link ProcessItem }
     * 
     */
    public ProcessItem createProcessItem() {
        return new ProcessItem();
    }

    /**
     * Create an instance of {@link FileextendedattributeItem }
     * 
     */
    public FileextendedattributeItem createFileextendedattributeItem() {
        return new FileextendedattributeItem();
    }

    /**
     * Create an instance of {@link GconfItem }
     * 
     */
    public GconfItem createGconfItem() {
        return new GconfItem();
    }

    /**
     * Create an instance of {@link SysctlItem }
     * 
     */
    public SysctlItem createSysctlItem() {
        return new SysctlItem();
    }

    /**
     * Create an instance of {@link InterfaceItem }
     * 
     */
    public InterfaceItem createInterfaceItem() {
        return new InterfaceItem();
    }

    /**
     * Create an instance of {@link DnscacheItem }
     * 
     */
    public DnscacheItem createDnscacheItem() {
        return new DnscacheItem();
    }

    /**
     * Create an instance of {@link XinetdItem }
     * 
     */
    public XinetdItem createXinetdItem() {
        return new XinetdItem();
    }

    /**
     * Create an instance of {@link SccsItem }
     * 
     */
    public SccsItem createSccsItem() {
        return new SccsItem();
    }

    /**
     * Create an instance of {@link RunlevelItem }
     * 
     */
    public RunlevelItem createRunlevelItem() {
        return new RunlevelItem();
    }

    /**
     * Create an instance of {@link RoutingtableItem }
     * 
     */
    public RoutingtableItem createRoutingtableItem() {
        return new RoutingtableItem();
    }

    /**
     * Create an instance of {@link Process58Item }
     * 
     */
    public Process58Item createProcess58Item() {
        return new Process58Item();
    }

    /**
     * Create an instance of {@link EntityItemCapabilityType }
     * 
     */
    public EntityItemCapabilityType createEntityItemCapabilityType() {
        return new EntityItemCapabilityType();
    }

    /**
     * Create an instance of {@link EntityItemWaitStatusType }
     * 
     */
    public EntityItemWaitStatusType createEntityItemWaitStatusType() {
        return new EntityItemWaitStatusType();
    }

    /**
     * Create an instance of {@link EntityItemEndpointType }
     * 
     */
    public EntityItemEndpointType createEntityItemEndpointType() {
        return new EntityItemEndpointType();
    }

    /**
     * Create an instance of {@link EntityItemEncryptMethodType }
     * 
     */
    public EntityItemEncryptMethodType createEntityItemEncryptMethodType() {
        return new EntityItemEncryptMethodType();
    }

    /**
     * Create an instance of {@link EntityItemRoutingTableFlagsType }
     * 
     */
    public EntityItemRoutingTableFlagsType createEntityItemRoutingTableFlagsType() {
        return new EntityItemRoutingTableFlagsType();
    }

    /**
     * Create an instance of {@link EntityItemInterfaceType }
     * 
     */
    public EntityItemInterfaceType createEntityItemInterfaceType() {
        return new EntityItemInterfaceType();
    }

    /**
     * Create an instance of {@link EntityItemXinetdTypeStatusType }
     * 
     */
    public EntityItemXinetdTypeStatusType createEntityItemXinetdTypeStatusType() {
        return new EntityItemXinetdTypeStatusType();
    }

    /**
     * Create an instance of {@link EntityItemGconfTypeType }
     * 
     */
    public EntityItemGconfTypeType createEntityItemGconfTypeType() {
        return new EntityItemGconfTypeType();
    }

    /**
     * Create an instance of {@link ShadowItem.ChgLst }
     * 
     */
    public ShadowItem.ChgLst createShadowItemChgLst() {
        return new ShadowItem.ChgLst();
    }

    /**
     * Create an instance of {@link ShadowItem.ChgAllow }
     * 
     */
    public ShadowItem.ChgAllow createShadowItemChgAllow() {
        return new ShadowItem.ChgAllow();
    }

    /**
     * Create an instance of {@link ShadowItem.ChgReq }
     * 
     */
    public ShadowItem.ChgReq createShadowItemChgReq() {
        return new ShadowItem.ChgReq();
    }

    /**
     * Create an instance of {@link ShadowItem.ExpWarn }
     * 
     */
    public ShadowItem.ExpWarn createShadowItemExpWarn() {
        return new ShadowItem.ExpWarn();
    }

    /**
     * Create an instance of {@link ShadowItem.ExpInact }
     * 
     */
    public ShadowItem.ExpInact createShadowItemExpInact() {
        return new ShadowItem.ExpInact();
    }

    /**
     * Create an instance of {@link ShadowItem.ExpDate }
     * 
     */
    public ShadowItem.ExpDate createShadowItemExpDate() {
        return new ShadowItem.ExpDate();
    }

    /**
     * Create an instance of {@link ShadowItem.Flag }
     * 
     */
    public ShadowItem.Flag createShadowItemFlag() {
        return new ShadowItem.Flag();
    }

    /**
     * Create an instance of {@link PasswordItem.UserId }
     * 
     */
    public PasswordItem.UserId createPasswordItemUserId() {
        return new PasswordItem.UserId();
    }

    /**
     * Create an instance of {@link PasswordItem.GroupId }
     * 
     */
    public PasswordItem.GroupId createPasswordItemGroupId() {
        return new PasswordItem.GroupId();
    }

    /**
     * Create an instance of {@link FileItem.GroupId }
     * 
     */
    public FileItem.GroupId createFileItemGroupId() {
        return new FileItem.GroupId();
    }

    /**
     * Create an instance of {@link FileItem.UserId }
     * 
     */
    public FileItem.UserId createFileItemUserId() {
        return new FileItem.UserId();
    }

    /**
     * Create an instance of {@link FileItem.ATime }
     * 
     */
    public FileItem.ATime createFileItemATime() {
        return new FileItem.ATime();
    }

    /**
     * Create an instance of {@link FileItem.CTime }
     * 
     */
    public FileItem.CTime createFileItemCTime() {
        return new FileItem.CTime();
    }

    /**
     * Create an instance of {@link FileItem.MTime }
     * 
     */
    public FileItem.MTime createFileItemMTime() {
        return new FileItem.MTime();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnameItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "uname_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<UnameItem> createUnameItem(UnameItem value) {
        return new JAXBElement<UnameItem>(_UnameItem_QNAME, UnameItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InetdItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "inetd_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<InetdItem> createInetdItem(InetdItem value) {
        return new JAXBElement<InetdItem>(_InetdItem_QNAME, InetdItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "process_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<ProcessItem> createProcessItem(ProcessItem value) {
        return new JAXBElement<ProcessItem>(_ProcessItem_QNAME, ProcessItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShadowItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "shadow_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<ShadowItem> createShadowItem(ShadowItem value) {
        return new JAXBElement<ShadowItem>(_ShadowItem_QNAME, ShadowItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XinetdItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "xinetd_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<XinetdItem> createXinetdItem(XinetdItem value) {
        return new JAXBElement<XinetdItem>(_XinetdItem_QNAME, XinetdItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GconfItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "gconf_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<GconfItem> createGconfItem(GconfItem value) {
        return new JAXBElement<GconfItem>(_GconfItem_QNAME, GconfItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DnscacheItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "dnscache_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<DnscacheItem> createDnscacheItem(DnscacheItem value) {
        return new JAXBElement<DnscacheItem>(_DnscacheItem_QNAME, DnscacheItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingtableItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "routingtable_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<RoutingtableItem> createRoutingtableItem(RoutingtableItem value) {
        return new JAXBElement<RoutingtableItem>(_RoutingtableItem_QNAME, RoutingtableItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SymlinkItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "symlink_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SymlinkItem> createSymlinkItem(SymlinkItem value) {
        return new JAXBElement<SymlinkItem>(_SymlinkItem_QNAME, SymlinkItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Process58Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "process58_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<Process58Item> createProcess58Item(Process58Item value) {
        return new JAXBElement<Process58Item>(_Process58Item_QNAME, Process58Item.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "interface_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<InterfaceItem> createInterfaceItem(InterfaceItem value) {
        return new JAXBElement<InterfaceItem>(_InterfaceItem_QNAME, InterfaceItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SccsItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "sccs_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SccsItem> createSccsItem(SccsItem value) {
        return new JAXBElement<SccsItem>(_SccsItem_QNAME, SccsItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileextendedattributeItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "fileextendedattribute_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<FileextendedattributeItem> createFileextendedattributeItem(FileextendedattributeItem value) {
        return new JAXBElement<FileextendedattributeItem>(_FileextendedattributeItem_QNAME, FileextendedattributeItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "file_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<FileItem> createFileItem(FileItem value) {
        return new JAXBElement<FileItem>(_FileItem_QNAME, FileItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "password_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<PasswordItem> createPasswordItem(PasswordItem value) {
        return new JAXBElement<PasswordItem>(_PasswordItem_QNAME, PasswordItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SysctlItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "sysctl_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SysctlItem> createSysctlItem(SysctlItem value) {
        return new JAXBElement<SysctlItem>(_SysctlItem_QNAME, SysctlItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunlevelItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "runlevel_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<RunlevelItem> createRunlevelItem(RunlevelItem value) {
        return new JAXBElement<RunlevelItem>(_RunlevelItem_QNAME, RunlevelItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "source", scope = GconfItem.class)
    public JAXBElement<EntityItemStringType> createGconfItemSource(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_GconfItemSource_QNAME, EntityItemStringType.class, GconfItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "filename", scope = FileextendedattributeItem.class)
    public JAXBElement<EntityItemStringType> createFileextendedattributeItemFilename(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_FileextendedattributeItemFilename_QNAME, EntityItemStringType.class, FileextendedattributeItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", name = "filename", scope = FileItem.class)
    public JAXBElement<EntityItemStringType> createFileItemFilename(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_FileextendedattributeItemFilename_QNAME, EntityItemStringType.class, FileItem.class, value);
    }

}
