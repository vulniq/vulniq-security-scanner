


package org.mitre.oval.xmlschema.oval_system_characteristics_5_linux;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_system_characteristics_5_linux package. 
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

    private final static QName _DpkginfoItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", "dpkginfo_item");
    private final static QName _ApparmorstatusItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", "apparmorstatus_item");
    private final static QName _SlackwarepkginfoItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", "slackwarepkginfo_item");
    private final static QName _SystemdunitpropertyItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", "systemdunitproperty_item");
    private final static QName _InetlisteningserverItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", "inetlisteningserver_item");
    private final static QName _SystemdunitdependencyItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", "systemdunitdependency_item");
    private final static QName _RpmverifyItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", "rpmverify_item");
    private final static QName _IflistenersItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", "iflisteners_item");
    private final static QName _PartitionItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", "partition_item");
    private final static QName _RpmverifypackageItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", "rpmverifypackage_item");
    private final static QName _SelinuxbooleanItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", "selinuxboolean_item");
    private final static QName _RpminfoItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", "rpminfo_item");
    private final static QName _SelinuxsecuritycontextItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", "selinuxsecuritycontext_item");
    private final static QName _RpmverifyfileItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", "rpmverifyfile_item");
    private final static QName _SelinuxsecuritycontextItemFilename_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", "filename");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_system_characteristics_5_linux
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SlackwarepkginfoItem }
     * 
     */
    public SlackwarepkginfoItem createSlackwarepkginfoItem() {
        return new SlackwarepkginfoItem();
    }

    /**
     * Create an instance of {@link RpmverifyfileItem }
     * 
     */
    public RpmverifyfileItem createRpmverifyfileItem() {
        return new RpmverifyfileItem();
    }

    /**
     * Create an instance of {@link DpkginfoItem }
     * 
     */
    public DpkginfoItem createDpkginfoItem() {
        return new DpkginfoItem();
    }

    /**
     * Create an instance of {@link RpminfoItem }
     * 
     */
    public RpminfoItem createRpminfoItem() {
        return new RpminfoItem();
    }

    /**
     * Create an instance of {@link RpmverifypackageItem }
     * 
     */
    public RpmverifypackageItem createRpmverifypackageItem() {
        return new RpmverifypackageItem();
    }

    /**
     * Create an instance of {@link ApparmorstatusItem }
     * 
     */
    public ApparmorstatusItem createApparmorstatusItem() {
        return new ApparmorstatusItem();
    }

    /**
     * Create an instance of {@link SystemdunitpropertyItem }
     * 
     */
    public SystemdunitpropertyItem createSystemdunitpropertyItem() {
        return new SystemdunitpropertyItem();
    }

    /**
     * Create an instance of {@link InetlisteningserverItem }
     * 
     */
    public InetlisteningserverItem createInetlisteningserverItem() {
        return new InetlisteningserverItem();
    }

    /**
     * Create an instance of {@link SelinuxsecuritycontextItem }
     * 
     */
    public SelinuxsecuritycontextItem createSelinuxsecuritycontextItem() {
        return new SelinuxsecuritycontextItem();
    }

    /**
     * Create an instance of {@link PartitionItem }
     * 
     */
    public PartitionItem createPartitionItem() {
        return new PartitionItem();
    }

    /**
     * Create an instance of {@link IflistenersItem }
     * 
     */
    public IflistenersItem createIflistenersItem() {
        return new IflistenersItem();
    }

    /**
     * Create an instance of {@link SelinuxbooleanItem }
     * 
     */
    public SelinuxbooleanItem createSelinuxbooleanItem() {
        return new SelinuxbooleanItem();
    }

    /**
     * Create an instance of {@link SystemdunitdependencyItem }
     * 
     */
    public SystemdunitdependencyItem createSystemdunitdependencyItem() {
        return new SystemdunitdependencyItem();
    }

    /**
     * Create an instance of {@link RpmverifyItem }
     * 
     */
    public RpmverifyItem createRpmverifyItem() {
        return new RpmverifyItem();
    }

    /**
     * Create an instance of {@link EntityItemRpmVerifyResultType }
     * 
     */
    public EntityItemRpmVerifyResultType createEntityItemRpmVerifyResultType() {
        return new EntityItemRpmVerifyResultType();
    }

    /**
     * Create an instance of {@link EntityItemProtocolType }
     * 
     */
    public EntityItemProtocolType createEntityItemProtocolType() {
        return new EntityItemProtocolType();
    }

    /**
     * Create an instance of {@link SlackwarepkginfoItem.Version }
     * 
     */
    public SlackwarepkginfoItem.Version createSlackwarepkginfoItemVersion() {
        return new SlackwarepkginfoItem.Version();
    }

    /**
     * Create an instance of {@link RpmverifyfileItem.Epoch }
     * 
     */
    public RpmverifyfileItem.Epoch createRpmverifyfileItemEpoch() {
        return new RpmverifyfileItem.Epoch();
    }

    /**
     * Create an instance of {@link RpmverifyfileItem.Version }
     * 
     */
    public RpmverifyfileItem.Version createRpmverifyfileItemVersion() {
        return new RpmverifyfileItem.Version();
    }

    /**
     * Create an instance of {@link RpmverifyfileItem.Release }
     * 
     */
    public RpmverifyfileItem.Release createRpmverifyfileItemRelease() {
        return new RpmverifyfileItem.Release();
    }

    /**
     * Create an instance of {@link DpkginfoItem.Epoch }
     * 
     */
    public DpkginfoItem.Epoch createDpkginfoItemEpoch() {
        return new DpkginfoItem.Epoch();
    }

    /**
     * Create an instance of {@link DpkginfoItem.Release }
     * 
     */
    public DpkginfoItem.Release createDpkginfoItemRelease() {
        return new DpkginfoItem.Release();
    }

    /**
     * Create an instance of {@link DpkginfoItem.Version }
     * 
     */
    public DpkginfoItem.Version createDpkginfoItemVersion() {
        return new DpkginfoItem.Version();
    }

    /**
     * Create an instance of {@link DpkginfoItem.Evr }
     * 
     */
    public DpkginfoItem.Evr createDpkginfoItemEvr() {
        return new DpkginfoItem.Evr();
    }

    /**
     * Create an instance of {@link RpminfoItem.Epoch }
     * 
     */
    public RpminfoItem.Epoch createRpminfoItemEpoch() {
        return new RpminfoItem.Epoch();
    }

    /**
     * Create an instance of {@link RpminfoItem.Release }
     * 
     */
    public RpminfoItem.Release createRpminfoItemRelease() {
        return new RpminfoItem.Release();
    }

    /**
     * Create an instance of {@link RpminfoItem.Version }
     * 
     */
    public RpminfoItem.Version createRpminfoItemVersion() {
        return new RpminfoItem.Version();
    }

    /**
     * Create an instance of {@link RpmverifypackageItem.Epoch }
     * 
     */
    public RpmverifypackageItem.Epoch createRpmverifypackageItemEpoch() {
        return new RpmverifypackageItem.Epoch();
    }

    /**
     * Create an instance of {@link RpmverifypackageItem.Version }
     * 
     */
    public RpmverifypackageItem.Version createRpmverifypackageItemVersion() {
        return new RpmverifypackageItem.Version();
    }

    /**
     * Create an instance of {@link RpmverifypackageItem.Release }
     * 
     */
    public RpmverifypackageItem.Release createRpmverifypackageItemRelease() {
        return new RpmverifypackageItem.Release();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DpkginfoItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", name = "dpkginfo_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<DpkginfoItem> createDpkginfoItem(DpkginfoItem value) {
        return new JAXBElement<DpkginfoItem>(_DpkginfoItem_QNAME, DpkginfoItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApparmorstatusItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", name = "apparmorstatus_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<ApparmorstatusItem> createApparmorstatusItem(ApparmorstatusItem value) {
        return new JAXBElement<ApparmorstatusItem>(_ApparmorstatusItem_QNAME, ApparmorstatusItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlackwarepkginfoItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", name = "slackwarepkginfo_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SlackwarepkginfoItem> createSlackwarepkginfoItem(SlackwarepkginfoItem value) {
        return new JAXBElement<SlackwarepkginfoItem>(_SlackwarepkginfoItem_QNAME, SlackwarepkginfoItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemdunitpropertyItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", name = "systemdunitproperty_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SystemdunitpropertyItem> createSystemdunitpropertyItem(SystemdunitpropertyItem value) {
        return new JAXBElement<SystemdunitpropertyItem>(_SystemdunitpropertyItem_QNAME, SystemdunitpropertyItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InetlisteningserverItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", name = "inetlisteningserver_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<InetlisteningserverItem> createInetlisteningserverItem(InetlisteningserverItem value) {
        return new JAXBElement<InetlisteningserverItem>(_InetlisteningserverItem_QNAME, InetlisteningserverItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemdunitdependencyItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", name = "systemdunitdependency_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SystemdunitdependencyItem> createSystemdunitdependencyItem(SystemdunitdependencyItem value) {
        return new JAXBElement<SystemdunitdependencyItem>(_SystemdunitdependencyItem_QNAME, SystemdunitdependencyItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RpmverifyItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", name = "rpmverify_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<RpmverifyItem> createRpmverifyItem(RpmverifyItem value) {
        return new JAXBElement<RpmverifyItem>(_RpmverifyItem_QNAME, RpmverifyItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IflistenersItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", name = "iflisteners_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<IflistenersItem> createIflistenersItem(IflistenersItem value) {
        return new JAXBElement<IflistenersItem>(_IflistenersItem_QNAME, IflistenersItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartitionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", name = "partition_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<PartitionItem> createPartitionItem(PartitionItem value) {
        return new JAXBElement<PartitionItem>(_PartitionItem_QNAME, PartitionItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RpmverifypackageItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", name = "rpmverifypackage_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<RpmverifypackageItem> createRpmverifypackageItem(RpmverifypackageItem value) {
        return new JAXBElement<RpmverifypackageItem>(_RpmverifypackageItem_QNAME, RpmverifypackageItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelinuxbooleanItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", name = "selinuxboolean_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SelinuxbooleanItem> createSelinuxbooleanItem(SelinuxbooleanItem value) {
        return new JAXBElement<SelinuxbooleanItem>(_SelinuxbooleanItem_QNAME, SelinuxbooleanItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RpminfoItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", name = "rpminfo_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<RpminfoItem> createRpminfoItem(RpminfoItem value) {
        return new JAXBElement<RpminfoItem>(_RpminfoItem_QNAME, RpminfoItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelinuxsecuritycontextItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", name = "selinuxsecuritycontext_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SelinuxsecuritycontextItem> createSelinuxsecuritycontextItem(SelinuxsecuritycontextItem value) {
        return new JAXBElement<SelinuxsecuritycontextItem>(_SelinuxsecuritycontextItem_QNAME, SelinuxsecuritycontextItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RpmverifyfileItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", name = "rpmverifyfile_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<RpmverifyfileItem> createRpmverifyfileItem(RpmverifyfileItem value) {
        return new JAXBElement<RpmverifyfileItem>(_RpmverifyfileItem_QNAME, RpmverifyfileItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux", name = "filename", scope = SelinuxsecuritycontextItem.class)
    public JAXBElement<EntityItemStringType> createSelinuxsecuritycontextItemFilename(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_SelinuxsecuritycontextItemFilename_QNAME, EntityItemStringType.class, SelinuxsecuritycontextItem.class, value);
    }

}
