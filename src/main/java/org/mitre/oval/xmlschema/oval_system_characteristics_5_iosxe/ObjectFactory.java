


package org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe package. 
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

    private final static QName _AclItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "acl_item");
    private final static QName _SnmphostItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "snmphost_item");
    private final static QName _SnmpviewItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "snmpview_item");
    private final static QName _BgpneighborItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "bgpneighbor_item");
    private final static QName _VersionItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "version_item");
    private final static QName _RouterItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "router_item");
    private final static QName _SnmpuserItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "snmpuser_item");
    private final static QName _RoutingprotocolauthintfItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "routingprotocolauthintf_item");
    private final static QName _SectionItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "section_item");
    private final static QName _SnmpgroupItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "snmpgroup_item");
    private final static QName _GlobalItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "global_item");
    private final static QName _LineItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "line_item");
    private final static QName _InterfaceItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "interface_item");
    private final static QName _SnmpcommunityItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "snmpcommunity_item");
    private final static QName _RoutingprotocolauthintfItemId_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "id");
    private final static QName _RoutingprotocolauthintfItemInterface_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "interface");
    private final static QName _RoutingprotocolauthintfItemProtocol_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "protocol");
    private final static QName _RoutingprotocolauthintfItemAuthType_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "auth_type");
    private final static QName _RoutingprotocolauthintfItemKeyChain_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "key_chain");
    private final static QName _RoutingprotocolauthintfItemOspfArea_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "ospf_area");
    private final static QName _RouterItemBgpNeighbor_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "bgp_neighbor");
    private final static QName _RouterItemNetwork_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "network");
    private final static QName _RouterItemRouterConfigLines_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "router_config_lines");
    private final static QName _RouterItemOspfAuthenticationArea_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", "ospf_authentication_area");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InterfaceItem }
     * 
     */
    public InterfaceItem createInterfaceItem() {
        return new InterfaceItem();
    }

    /**
     * Create an instance of {@link RoutingprotocolauthintfItem }
     * 
     */
    public RoutingprotocolauthintfItem createRoutingprotocolauthintfItem() {
        return new RoutingprotocolauthintfItem();
    }

    /**
     * Create an instance of {@link RouterItem }
     * 
     */
    public RouterItem createRouterItem() {
        return new RouterItem();
    }

    /**
     * Create an instance of {@link SnmphostItem }
     * 
     */
    public SnmphostItem createSnmphostItem() {
        return new SnmphostItem();
    }

    /**
     * Create an instance of {@link SnmpcommunityItem }
     * 
     */
    public SnmpcommunityItem createSnmpcommunityItem() {
        return new SnmpcommunityItem();
    }

    /**
     * Create an instance of {@link SnmpuserItem }
     * 
     */
    public SnmpuserItem createSnmpuserItem() {
        return new SnmpuserItem();
    }

    /**
     * Create an instance of {@link SnmpviewItem }
     * 
     */
    public SnmpviewItem createSnmpviewItem() {
        return new SnmpviewItem();
    }

    /**
     * Create an instance of {@link VersionItem }
     * 
     */
    public VersionItem createVersionItem() {
        return new VersionItem();
    }

    /**
     * Create an instance of {@link SectionItem }
     * 
     */
    public SectionItem createSectionItem() {
        return new SectionItem();
    }

    /**
     * Create an instance of {@link LineItem }
     * 
     */
    public LineItem createLineItem() {
        return new LineItem();
    }

    /**
     * Create an instance of {@link BgpneighborItem }
     * 
     */
    public BgpneighborItem createBgpneighborItem() {
        return new BgpneighborItem();
    }

    /**
     * Create an instance of {@link AclItem }
     * 
     */
    public AclItem createAclItem() {
        return new AclItem();
    }

    /**
     * Create an instance of {@link GlobalItem }
     * 
     */
    public GlobalItem createGlobalItem() {
        return new GlobalItem();
    }

    /**
     * Create an instance of {@link SnmpgroupItem }
     * 
     */
    public SnmpgroupItem createSnmpgroupItem() {
        return new SnmpgroupItem();
    }

    /**
     * Create an instance of {@link EntityItemTrunkEncapType }
     * 
     */
    public EntityItemTrunkEncapType createEntityItemTrunkEncapType() {
        return new EntityItemTrunkEncapType();
    }

    /**
     * Create an instance of {@link EntityItemSNMPPrivStringType }
     * 
     */
    public EntityItemSNMPPrivStringType createEntityItemSNMPPrivStringType() {
        return new EntityItemSNMPPrivStringType();
    }

    /**
     * Create an instance of {@link EntityItemAccessListUseType }
     * 
     */
    public EntityItemAccessListUseType createEntityItemAccessListUseType() {
        return new EntityItemAccessListUseType();
    }

    /**
     * Create an instance of {@link EntityItemSNMPModeStringType }
     * 
     */
    public EntityItemSNMPModeStringType createEntityItemSNMPModeStringType() {
        return new EntityItemSNMPModeStringType();
    }

    /**
     * Create an instance of {@link EntityItemAccessListInterfaceDirectionType }
     * 
     */
    public EntityItemAccessListInterfaceDirectionType createEntityItemAccessListInterfaceDirectionType() {
        return new EntityItemAccessListInterfaceDirectionType();
    }

    /**
     * Create an instance of {@link EntityItemSNMPVersionStringType }
     * 
     */
    public EntityItemSNMPVersionStringType createEntityItemSNMPVersionStringType() {
        return new EntityItemSNMPVersionStringType();
    }

    /**
     * Create an instance of {@link EntityItemRoutingAuthTypeStringType }
     * 
     */
    public EntityItemRoutingAuthTypeStringType createEntityItemRoutingAuthTypeStringType() {
        return new EntityItemRoutingAuthTypeStringType();
    }

    /**
     * Create an instance of {@link EntityItemSNMPSecLevelStringType }
     * 
     */
    public EntityItemSNMPSecLevelStringType createEntityItemSNMPSecLevelStringType() {
        return new EntityItemSNMPSecLevelStringType();
    }

    /**
     * Create an instance of {@link EntityItemAccessListIPVersionType }
     * 
     */
    public EntityItemAccessListIPVersionType createEntityItemAccessListIPVersionType() {
        return new EntityItemAccessListIPVersionType();
    }

    /**
     * Create an instance of {@link EntityItemSNMPAuthStringType }
     * 
     */
    public EntityItemSNMPAuthStringType createEntityItemSNMPAuthStringType() {
        return new EntityItemSNMPAuthStringType();
    }

    /**
     * Create an instance of {@link EntityItemSwitchportModeType }
     * 
     */
    public EntityItemSwitchportModeType createEntityItemSwitchportModeType() {
        return new EntityItemSwitchportModeType();
    }

    /**
     * Create an instance of {@link EntityItemRoutingProtocolType }
     * 
     */
    public EntityItemRoutingProtocolType createEntityItemRoutingProtocolType() {
        return new EntityItemRoutingProtocolType();
    }

    /**
     * Create an instance of {@link InterfaceItem.SwitchportNativeVlan }
     * 
     */
    public InterfaceItem.SwitchportNativeVlan createInterfaceItemSwitchportNativeVlan() {
        return new InterfaceItem.SwitchportNativeVlan();
    }

    /**
     * Create an instance of {@link InterfaceItem.SwitchportAccessVlan }
     * 
     */
    public InterfaceItem.SwitchportAccessVlan createInterfaceItemSwitchportAccessVlan() {
        return new InterfaceItem.SwitchportAccessVlan();
    }

    /**
     * Create an instance of {@link RoutingprotocolauthintfItem.OspfArea }
     * 
     */
    public RoutingprotocolauthintfItem.OspfArea createRoutingprotocolauthintfItemOspfArea() {
        return new RoutingprotocolauthintfItem.OspfArea();
    }

    /**
     * Create an instance of {@link RouterItem.OspfAuthenticationArea }
     * 
     */
    public RouterItem.OspfAuthenticationArea createRouterItemOspfAuthenticationArea() {
        return new RouterItem.OspfAuthenticationArea();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AclItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "acl_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<AclItem> createAclItem(AclItem value) {
        return new JAXBElement<AclItem>(_AclItem_QNAME, AclItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmphostItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "snmphost_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SnmphostItem> createSnmphostItem(SnmphostItem value) {
        return new JAXBElement<SnmphostItem>(_SnmphostItem_QNAME, SnmphostItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpviewItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "snmpview_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SnmpviewItem> createSnmpviewItem(SnmpviewItem value) {
        return new JAXBElement<SnmpviewItem>(_SnmpviewItem_QNAME, SnmpviewItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BgpneighborItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "bgpneighbor_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<BgpneighborItem> createBgpneighborItem(BgpneighborItem value) {
        return new JAXBElement<BgpneighborItem>(_BgpneighborItem_QNAME, BgpneighborItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "version_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<VersionItem> createVersionItem(VersionItem value) {
        return new JAXBElement<VersionItem>(_VersionItem_QNAME, VersionItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "router_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<RouterItem> createRouterItem(RouterItem value) {
        return new JAXBElement<RouterItem>(_RouterItem_QNAME, RouterItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpuserItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "snmpuser_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SnmpuserItem> createSnmpuserItem(SnmpuserItem value) {
        return new JAXBElement<SnmpuserItem>(_SnmpuserItem_QNAME, SnmpuserItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingprotocolauthintfItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "routingprotocolauthintf_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<RoutingprotocolauthintfItem> createRoutingprotocolauthintfItem(RoutingprotocolauthintfItem value) {
        return new JAXBElement<RoutingprotocolauthintfItem>(_RoutingprotocolauthintfItem_QNAME, RoutingprotocolauthintfItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "section_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SectionItem> createSectionItem(SectionItem value) {
        return new JAXBElement<SectionItem>(_SectionItem_QNAME, SectionItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpgroupItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "snmpgroup_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SnmpgroupItem> createSnmpgroupItem(SnmpgroupItem value) {
        return new JAXBElement<SnmpgroupItem>(_SnmpgroupItem_QNAME, SnmpgroupItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "global_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<GlobalItem> createGlobalItem(GlobalItem value) {
        return new JAXBElement<GlobalItem>(_GlobalItem_QNAME, GlobalItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "line_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<LineItem> createLineItem(LineItem value) {
        return new JAXBElement<LineItem>(_LineItem_QNAME, LineItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "interface_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<InterfaceItem> createInterfaceItem(InterfaceItem value) {
        return new JAXBElement<InterfaceItem>(_InterfaceItem_QNAME, InterfaceItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpcommunityItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "snmpcommunity_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SnmpcommunityItem> createSnmpcommunityItem(SnmpcommunityItem value) {
        return new JAXBElement<SnmpcommunityItem>(_SnmpcommunityItem_QNAME, SnmpcommunityItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "id", scope = RoutingprotocolauthintfItem.class)
    public JAXBElement<EntityItemIntType> createRoutingprotocolauthintfItemId(EntityItemIntType value) {
        return new JAXBElement<EntityItemIntType>(_RoutingprotocolauthintfItemId_QNAME, EntityItemIntType.class, RoutingprotocolauthintfItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "interface", scope = RoutingprotocolauthintfItem.class)
    public JAXBElement<EntityItemStringType> createRoutingprotocolauthintfItemInterface(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_RoutingprotocolauthintfItemInterface_QNAME, EntityItemStringType.class, RoutingprotocolauthintfItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemRoutingProtocolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "protocol", scope = RoutingprotocolauthintfItem.class)
    public JAXBElement<EntityItemRoutingProtocolType> createRoutingprotocolauthintfItemProtocol(EntityItemRoutingProtocolType value) {
        return new JAXBElement<EntityItemRoutingProtocolType>(_RoutingprotocolauthintfItemProtocol_QNAME, EntityItemRoutingProtocolType.class, RoutingprotocolauthintfItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemRoutingAuthTypeStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "auth_type", scope = RoutingprotocolauthintfItem.class)
    public JAXBElement<EntityItemRoutingAuthTypeStringType> createRoutingprotocolauthintfItemAuthType(EntityItemRoutingAuthTypeStringType value) {
        return new JAXBElement<EntityItemRoutingAuthTypeStringType>(_RoutingprotocolauthintfItemAuthType_QNAME, EntityItemRoutingAuthTypeStringType.class, RoutingprotocolauthintfItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "key_chain", scope = RoutingprotocolauthintfItem.class)
    public JAXBElement<EntityItemStringType> createRoutingprotocolauthintfItemKeyChain(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_RoutingprotocolauthintfItemKeyChain_QNAME, EntityItemStringType.class, RoutingprotocolauthintfItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingprotocolauthintfItem.OspfArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "ospf_area", scope = RoutingprotocolauthintfItem.class)
    public JAXBElement<RoutingprotocolauthintfItem.OspfArea> createRoutingprotocolauthintfItemOspfArea(RoutingprotocolauthintfItem.OspfArea value) {
        return new JAXBElement<RoutingprotocolauthintfItem.OspfArea>(_RoutingprotocolauthintfItemOspfArea_QNAME, RoutingprotocolauthintfItem.OspfArea.class, RoutingprotocolauthintfItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "id", scope = RouterItem.class)
    public JAXBElement<EntityItemIntType> createRouterItemId(EntityItemIntType value) {
        return new JAXBElement<EntityItemIntType>(_RoutingprotocolauthintfItemId_QNAME, EntityItemIntType.class, RouterItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "bgp_neighbor", scope = RouterItem.class)
    public JAXBElement<EntityItemStringType> createRouterItemBgpNeighbor(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_RouterItemBgpNeighbor_QNAME, EntityItemStringType.class, RouterItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "network", scope = RouterItem.class)
    public JAXBElement<EntityItemStringType> createRouterItemNetwork(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_RouterItemNetwork_QNAME, EntityItemStringType.class, RouterItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemRoutingProtocolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "protocol", scope = RouterItem.class)
    public JAXBElement<EntityItemRoutingProtocolType> createRouterItemProtocol(EntityItemRoutingProtocolType value) {
        return new JAXBElement<EntityItemRoutingProtocolType>(_RoutingprotocolauthintfItemProtocol_QNAME, EntityItemRoutingProtocolType.class, RouterItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "router_config_lines", scope = RouterItem.class)
    public JAXBElement<EntityItemStringType> createRouterItemRouterConfigLines(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_RouterItemRouterConfigLines_QNAME, EntityItemStringType.class, RouterItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterItem.OspfAuthenticationArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe", name = "ospf_authentication_area", scope = RouterItem.class)
    public JAXBElement<RouterItem.OspfAuthenticationArea> createRouterItemOspfAuthenticationArea(RouterItem.OspfAuthenticationArea value) {
        return new JAXBElement<RouterItem.OspfAuthenticationArea>(_RouterItemOspfAuthenticationArea_QNAME, RouterItem.OspfAuthenticationArea.class, RouterItem.class, value);
    }

}
