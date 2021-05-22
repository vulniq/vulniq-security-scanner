


package org.mitre.oval.xmlschema.oval_definitions_5_iosxe;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_definitions_5_iosxe package. 
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

    private final static QName _BgpneighborTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "bgpneighbor_test");
    private final static QName _AclTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "acl_test");
    private final static QName _SnmpcommunityObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "snmpcommunity_object");
    private final static QName _SnmpviewTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "snmpview_test");
    private final static QName _SnmpviewState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "snmpview_state");
    private final static QName _AclObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "acl_object");
    private final static QName _RoutingprotocolauthintfState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "routingprotocolauthintf_state");
    private final static QName _LineObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "line_object");
    private final static QName _VersionTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "version_test");
    private final static QName _RouterTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "router_test");
    private final static QName _SnmpgroupState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "snmpgroup_state");
    private final static QName _BgpneighborObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "bgpneighbor_object");
    private final static QName _InterfaceState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "interface_state");
    private final static QName _SectionState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "section_state");
    private final static QName _RouterState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "router_state");
    private final static QName _VersionObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "version_object");
    private final static QName _SnmpcommunityTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "snmpcommunity_test");
    private final static QName _RoutingprotocolauthintfObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "routingprotocolauthintf_object");
    private final static QName _SnmpgroupTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "snmpgroup_test");
    private final static QName _VersionState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "version_state");
    private final static QName _SnmpgroupObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "snmpgroup_object");
    private final static QName _SnmphostTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "snmphost_test");
    private final static QName _SectionObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "section_object");
    private final static QName _SnmpviewObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "snmpview_object");
    private final static QName _GlobalObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "global_object");
    private final static QName _LineTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "line_test");
    private final static QName _GlobalState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "global_state");
    private final static QName _SnmphostObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "snmphost_object");
    private final static QName _BgpneighborState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "bgpneighbor_state");
    private final static QName _SnmpuserTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "snmpuser_test");
    private final static QName _LineState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "line_state");
    private final static QName _InterfaceTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "interface_test");
    private final static QName _GlobalTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "global_test");
    private final static QName _SnmpuserState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "snmpuser_state");
    private final static QName _SnmpcommunityState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "snmpcommunity_state");
    private final static QName _SnmphostState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "snmphost_state");
    private final static QName _SectionTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "section_test");
    private final static QName _AclState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "acl_state");
    private final static QName _InterfaceObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "interface_object");
    private final static QName _RouterObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "router_object");
    private final static QName _RoutingprotocolauthintfTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "routingprotocolauthintf_test");
    private final static QName _SnmpuserObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "snmpuser_object");
    private final static QName _SnmphostStateHost_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "host");
    private final static QName _SnmphostStateCommunityOrUser_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "community_or_user");
    private final static QName _SnmphostStateVersion_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "version");
    private final static QName _SnmphostStateSnmpv3SecLevel_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "snmpv3_sec_level");
    private final static QName _SnmphostStateTraps_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "traps");
    private final static QName _RoutingprotocolauthintfStateId_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "id");
    private final static QName _RoutingprotocolauthintfStateInterface_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "interface");
    private final static QName _RoutingprotocolauthintfStateProtocol_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "protocol");
    private final static QName _RoutingprotocolauthintfStateAuthType_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "auth_type");
    private final static QName _RoutingprotocolauthintfStateKeyChain_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "key_chain");
    private final static QName _RoutingprotocolauthintfStateOspfArea_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "ospf_area");
    private final static QName _SnmpgroupStateNotifyView_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "notify_view");
    private final static QName _SnmpgroupStateName_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "name");
    private final static QName _SnmpgroupStateIpv4Acl_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "ipv4_acl");
    private final static QName _SnmpgroupStateReadView_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "read_view");
    private final static QName _SnmpgroupStateWriteView_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "write_view");
    private final static QName _SnmpgroupStateIpv6Acl_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "ipv6_acl");
    private final static QName _SnmpuserStatePriv_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "priv");
    private final static QName _SnmpuserStateGroup_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "group");
    private final static QName _SnmpuserStateAuth_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "auth");
    private final static QName _RouterStateBgpNeighbor_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "bgp_neighbor");
    private final static QName _RouterStateNetwork_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "network");
    private final static QName _RouterStateRouterConfigLines_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "router_config_lines");
    private final static QName _RouterStateOspfAuthenticationArea_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", "ospf_authentication_area");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_definitions_5_iosxe
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RoutingprotocolauthintfState }
     * 
     */
    public RoutingprotocolauthintfState createRoutingprotocolauthintfState() {
        return new RoutingprotocolauthintfState();
    }

    /**
     * Create an instance of {@link InterfaceState }
     * 
     */
    public InterfaceState createInterfaceState() {
        return new InterfaceState();
    }

    /**
     * Create an instance of {@link RouterState }
     * 
     */
    public RouterState createRouterState() {
        return new RouterState();
    }

    /**
     * Create an instance of {@link SnmpcommunityObject }
     * 
     */
    public SnmpcommunityObject createSnmpcommunityObject() {
        return new SnmpcommunityObject();
    }

    /**
     * Create an instance of {@link SnmpgroupTest }
     * 
     */
    public SnmpgroupTest createSnmpgroupTest() {
        return new SnmpgroupTest();
    }

    /**
     * Create an instance of {@link InterfaceTest }
     * 
     */
    public InterfaceTest createInterfaceTest() {
        return new InterfaceTest();
    }

    /**
     * Create an instance of {@link SectionState }
     * 
     */
    public SectionState createSectionState() {
        return new SectionState();
    }

    /**
     * Create an instance of {@link RouterTest }
     * 
     */
    public RouterTest createRouterTest() {
        return new RouterTest();
    }

    /**
     * Create an instance of {@link VersionObject }
     * 
     */
    public VersionObject createVersionObject() {
        return new VersionObject();
    }

    /**
     * Create an instance of {@link SnmpgroupObject }
     * 
     */
    public SnmpgroupObject createSnmpgroupObject() {
        return new SnmpgroupObject();
    }

    /**
     * Create an instance of {@link SnmpcommunityState }
     * 
     */
    public SnmpcommunityState createSnmpcommunityState() {
        return new SnmpcommunityState();
    }

    /**
     * Create an instance of {@link LineState }
     * 
     */
    public LineState createLineState() {
        return new LineState();
    }

    /**
     * Create an instance of {@link LineTest }
     * 
     */
    public LineTest createLineTest() {
        return new LineTest();
    }

    /**
     * Create an instance of {@link RoutingprotocolauthintfTest }
     * 
     */
    public RoutingprotocolauthintfTest createRoutingprotocolauthintfTest() {
        return new RoutingprotocolauthintfTest();
    }

    /**
     * Create an instance of {@link GlobalObject }
     * 
     */
    public GlobalObject createGlobalObject() {
        return new GlobalObject();
    }

    /**
     * Create an instance of {@link AclState }
     * 
     */
    public AclState createAclState() {
        return new AclState();
    }

    /**
     * Create an instance of {@link RouterObject }
     * 
     */
    public RouterObject createRouterObject() {
        return new RouterObject();
    }

    /**
     * Create an instance of {@link InterfaceObject }
     * 
     */
    public InterfaceObject createInterfaceObject() {
        return new InterfaceObject();
    }

    /**
     * Create an instance of {@link SnmpgroupState }
     * 
     */
    public SnmpgroupState createSnmpgroupState() {
        return new SnmpgroupState();
    }

    /**
     * Create an instance of {@link SnmpviewTest }
     * 
     */
    public SnmpviewTest createSnmpviewTest() {
        return new SnmpviewTest();
    }

    /**
     * Create an instance of {@link SnmpviewObject }
     * 
     */
    public SnmpviewObject createSnmpviewObject() {
        return new SnmpviewObject();
    }

    /**
     * Create an instance of {@link BgpneighborState }
     * 
     */
    public BgpneighborState createBgpneighborState() {
        return new BgpneighborState();
    }

    /**
     * Create an instance of {@link LineObject }
     * 
     */
    public LineObject createLineObject() {
        return new LineObject();
    }

    /**
     * Create an instance of {@link RoutingprotocolauthintfObject }
     * 
     */
    public RoutingprotocolauthintfObject createRoutingprotocolauthintfObject() {
        return new RoutingprotocolauthintfObject();
    }

    /**
     * Create an instance of {@link BgpneighborTest }
     * 
     */
    public BgpneighborTest createBgpneighborTest() {
        return new BgpneighborTest();
    }

    /**
     * Create an instance of {@link SnmpuserTest }
     * 
     */
    public SnmpuserTest createSnmpuserTest() {
        return new SnmpuserTest();
    }

    /**
     * Create an instance of {@link SnmpuserState }
     * 
     */
    public SnmpuserState createSnmpuserState() {
        return new SnmpuserState();
    }

    /**
     * Create an instance of {@link SectionTest }
     * 
     */
    public SectionTest createSectionTest() {
        return new SectionTest();
    }

    /**
     * Create an instance of {@link BgpneighborObject }
     * 
     */
    public BgpneighborObject createBgpneighborObject() {
        return new BgpneighborObject();
    }

    /**
     * Create an instance of {@link GlobalState }
     * 
     */
    public GlobalState createGlobalState() {
        return new GlobalState();
    }

    /**
     * Create an instance of {@link SnmpcommunityTest }
     * 
     */
    public SnmpcommunityTest createSnmpcommunityTest() {
        return new SnmpcommunityTest();
    }

    /**
     * Create an instance of {@link SnmpuserObject }
     * 
     */
    public SnmpuserObject createSnmpuserObject() {
        return new SnmpuserObject();
    }

    /**
     * Create an instance of {@link AclObject }
     * 
     */
    public AclObject createAclObject() {
        return new AclObject();
    }

    /**
     * Create an instance of {@link SnmphostObject }
     * 
     */
    public SnmphostObject createSnmphostObject() {
        return new SnmphostObject();
    }

    /**
     * Create an instance of {@link AclTest }
     * 
     */
    public AclTest createAclTest() {
        return new AclTest();
    }

    /**
     * Create an instance of {@link VersionState }
     * 
     */
    public VersionState createVersionState() {
        return new VersionState();
    }

    /**
     * Create an instance of {@link GlobalTest }
     * 
     */
    public GlobalTest createGlobalTest() {
        return new GlobalTest();
    }

    /**
     * Create an instance of {@link SnmphostTest }
     * 
     */
    public SnmphostTest createSnmphostTest() {
        return new SnmphostTest();
    }

    /**
     * Create an instance of {@link SnmpviewState }
     * 
     */
    public SnmpviewState createSnmpviewState() {
        return new SnmpviewState();
    }

    /**
     * Create an instance of {@link SnmphostState }
     * 
     */
    public SnmphostState createSnmphostState() {
        return new SnmphostState();
    }

    /**
     * Create an instance of {@link VersionTest }
     * 
     */
    public VersionTest createVersionTest() {
        return new VersionTest();
    }

    /**
     * Create an instance of {@link SectionObject }
     * 
     */
    public SectionObject createSectionObject() {
        return new SectionObject();
    }

    /**
     * Create an instance of {@link EntityStateRoutingProtocolType }
     * 
     */
    public EntityStateRoutingProtocolType createEntityStateRoutingProtocolType() {
        return new EntityStateRoutingProtocolType();
    }

    /**
     * Create an instance of {@link EntityStateSNMPModeStringType }
     * 
     */
    public EntityStateSNMPModeStringType createEntityStateSNMPModeStringType() {
        return new EntityStateSNMPModeStringType();
    }

    /**
     * Create an instance of {@link EntityStateSNMPPrivStringType }
     * 
     */
    public EntityStateSNMPPrivStringType createEntityStateSNMPPrivStringType() {
        return new EntityStateSNMPPrivStringType();
    }

    /**
     * Create an instance of {@link EntityObjectAccessListIPVersionType }
     * 
     */
    public EntityObjectAccessListIPVersionType createEntityObjectAccessListIPVersionType() {
        return new EntityObjectAccessListIPVersionType();
    }

    /**
     * Create an instance of {@link EntityStateSNMPSecLevelStringType }
     * 
     */
    public EntityStateSNMPSecLevelStringType createEntityStateSNMPSecLevelStringType() {
        return new EntityStateSNMPSecLevelStringType();
    }

    /**
     * Create an instance of {@link EntityObjectRoutingProtocolType }
     * 
     */
    public EntityObjectRoutingProtocolType createEntityObjectRoutingProtocolType() {
        return new EntityObjectRoutingProtocolType();
    }

    /**
     * Create an instance of {@link EntityStateAccessListUseType }
     * 
     */
    public EntityStateAccessListUseType createEntityStateAccessListUseType() {
        return new EntityStateAccessListUseType();
    }

    /**
     * Create an instance of {@link EntityStateSwitchportModeType }
     * 
     */
    public EntityStateSwitchportModeType createEntityStateSwitchportModeType() {
        return new EntityStateSwitchportModeType();
    }

    /**
     * Create an instance of {@link EntityStateRoutingAuthTypeStringType }
     * 
     */
    public EntityStateRoutingAuthTypeStringType createEntityStateRoutingAuthTypeStringType() {
        return new EntityStateRoutingAuthTypeStringType();
    }

    /**
     * Create an instance of {@link EntityStateSNMPVersionStringType }
     * 
     */
    public EntityStateSNMPVersionStringType createEntityStateSNMPVersionStringType() {
        return new EntityStateSNMPVersionStringType();
    }

    /**
     * Create an instance of {@link EntityStateSNMPAuthStringType }
     * 
     */
    public EntityStateSNMPAuthStringType createEntityStateSNMPAuthStringType() {
        return new EntityStateSNMPAuthStringType();
    }

    /**
     * Create an instance of {@link EntityStateAccessListInterfaceDirectionType }
     * 
     */
    public EntityStateAccessListInterfaceDirectionType createEntityStateAccessListInterfaceDirectionType() {
        return new EntityStateAccessListInterfaceDirectionType();
    }

    /**
     * Create an instance of {@link EntityStateTrunkEncapType }
     * 
     */
    public EntityStateTrunkEncapType createEntityStateTrunkEncapType() {
        return new EntityStateTrunkEncapType();
    }

    /**
     * Create an instance of {@link EntityStateAccessListIPVersionType }
     * 
     */
    public EntityStateAccessListIPVersionType createEntityStateAccessListIPVersionType() {
        return new EntityStateAccessListIPVersionType();
    }

    /**
     * Create an instance of {@link RoutingprotocolauthintfState.OspfArea }
     * 
     */
    public RoutingprotocolauthintfState.OspfArea createRoutingprotocolauthintfStateOspfArea() {
        return new RoutingprotocolauthintfState.OspfArea();
    }

    /**
     * Create an instance of {@link InterfaceState.SwitchportNativeVlan }
     * 
     */
    public InterfaceState.SwitchportNativeVlan createInterfaceStateSwitchportNativeVlan() {
        return new InterfaceState.SwitchportNativeVlan();
    }

    /**
     * Create an instance of {@link InterfaceState.SwitchportAccessVlan }
     * 
     */
    public InterfaceState.SwitchportAccessVlan createInterfaceStateSwitchportAccessVlan() {
        return new InterfaceState.SwitchportAccessVlan();
    }

    /**
     * Create an instance of {@link RouterState.OspfAuthenticationArea }
     * 
     */
    public RouterState.OspfAuthenticationArea createRouterStateOspfAuthenticationArea() {
        return new RouterState.OspfAuthenticationArea();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BgpneighborTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "bgpneighbor_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<BgpneighborTest> createBgpneighborTest(BgpneighborTest value) {
        return new JAXBElement<BgpneighborTest>(_BgpneighborTest_QNAME, BgpneighborTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AclTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "acl_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<AclTest> createAclTest(AclTest value) {
        return new JAXBElement<AclTest>(_AclTest_QNAME, AclTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpcommunityObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "snmpcommunity_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<SnmpcommunityObject> createSnmpcommunityObject(SnmpcommunityObject value) {
        return new JAXBElement<SnmpcommunityObject>(_SnmpcommunityObject_QNAME, SnmpcommunityObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpviewTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "snmpview_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<SnmpviewTest> createSnmpviewTest(SnmpviewTest value) {
        return new JAXBElement<SnmpviewTest>(_SnmpviewTest_QNAME, SnmpviewTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpviewState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "snmpview_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<SnmpviewState> createSnmpviewState(SnmpviewState value) {
        return new JAXBElement<SnmpviewState>(_SnmpviewState_QNAME, SnmpviewState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AclObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "acl_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<AclObject> createAclObject(AclObject value) {
        return new JAXBElement<AclObject>(_AclObject_QNAME, AclObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingprotocolauthintfState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "routingprotocolauthintf_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<RoutingprotocolauthintfState> createRoutingprotocolauthintfState(RoutingprotocolauthintfState value) {
        return new JAXBElement<RoutingprotocolauthintfState>(_RoutingprotocolauthintfState_QNAME, RoutingprotocolauthintfState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "line_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<LineObject> createLineObject(LineObject value) {
        return new JAXBElement<LineObject>(_LineObject_QNAME, LineObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "version_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<VersionTest> createVersionTest(VersionTest value) {
        return new JAXBElement<VersionTest>(_VersionTest_QNAME, VersionTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "router_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<RouterTest> createRouterTest(RouterTest value) {
        return new JAXBElement<RouterTest>(_RouterTest_QNAME, RouterTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpgroupState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "snmpgroup_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<SnmpgroupState> createSnmpgroupState(SnmpgroupState value) {
        return new JAXBElement<SnmpgroupState>(_SnmpgroupState_QNAME, SnmpgroupState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BgpneighborObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "bgpneighbor_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<BgpneighborObject> createBgpneighborObject(BgpneighborObject value) {
        return new JAXBElement<BgpneighborObject>(_BgpneighborObject_QNAME, BgpneighborObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "interface_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<InterfaceState> createInterfaceState(InterfaceState value) {
        return new JAXBElement<InterfaceState>(_InterfaceState_QNAME, InterfaceState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "section_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<SectionState> createSectionState(SectionState value) {
        return new JAXBElement<SectionState>(_SectionState_QNAME, SectionState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "router_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<RouterState> createRouterState(RouterState value) {
        return new JAXBElement<RouterState>(_RouterState_QNAME, RouterState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "version_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<VersionObject> createVersionObject(VersionObject value) {
        return new JAXBElement<VersionObject>(_VersionObject_QNAME, VersionObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpcommunityTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "snmpcommunity_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<SnmpcommunityTest> createSnmpcommunityTest(SnmpcommunityTest value) {
        return new JAXBElement<SnmpcommunityTest>(_SnmpcommunityTest_QNAME, SnmpcommunityTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingprotocolauthintfObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "routingprotocolauthintf_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<RoutingprotocolauthintfObject> createRoutingprotocolauthintfObject(RoutingprotocolauthintfObject value) {
        return new JAXBElement<RoutingprotocolauthintfObject>(_RoutingprotocolauthintfObject_QNAME, RoutingprotocolauthintfObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpgroupTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "snmpgroup_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<SnmpgroupTest> createSnmpgroupTest(SnmpgroupTest value) {
        return new JAXBElement<SnmpgroupTest>(_SnmpgroupTest_QNAME, SnmpgroupTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "version_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<VersionState> createVersionState(VersionState value) {
        return new JAXBElement<VersionState>(_VersionState_QNAME, VersionState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpgroupObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "snmpgroup_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<SnmpgroupObject> createSnmpgroupObject(SnmpgroupObject value) {
        return new JAXBElement<SnmpgroupObject>(_SnmpgroupObject_QNAME, SnmpgroupObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmphostTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "snmphost_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<SnmphostTest> createSnmphostTest(SnmphostTest value) {
        return new JAXBElement<SnmphostTest>(_SnmphostTest_QNAME, SnmphostTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "section_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<SectionObject> createSectionObject(SectionObject value) {
        return new JAXBElement<SectionObject>(_SectionObject_QNAME, SectionObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpviewObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "snmpview_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<SnmpviewObject> createSnmpviewObject(SnmpviewObject value) {
        return new JAXBElement<SnmpviewObject>(_SnmpviewObject_QNAME, SnmpviewObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "global_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<GlobalObject> createGlobalObject(GlobalObject value) {
        return new JAXBElement<GlobalObject>(_GlobalObject_QNAME, GlobalObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "line_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<LineTest> createLineTest(LineTest value) {
        return new JAXBElement<LineTest>(_LineTest_QNAME, LineTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "global_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<GlobalState> createGlobalState(GlobalState value) {
        return new JAXBElement<GlobalState>(_GlobalState_QNAME, GlobalState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmphostObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "snmphost_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<SnmphostObject> createSnmphostObject(SnmphostObject value) {
        return new JAXBElement<SnmphostObject>(_SnmphostObject_QNAME, SnmphostObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BgpneighborState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "bgpneighbor_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<BgpneighborState> createBgpneighborState(BgpneighborState value) {
        return new JAXBElement<BgpneighborState>(_BgpneighborState_QNAME, BgpneighborState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpuserTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "snmpuser_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<SnmpuserTest> createSnmpuserTest(SnmpuserTest value) {
        return new JAXBElement<SnmpuserTest>(_SnmpuserTest_QNAME, SnmpuserTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "line_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<LineState> createLineState(LineState value) {
        return new JAXBElement<LineState>(_LineState_QNAME, LineState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "interface_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<InterfaceTest> createInterfaceTest(InterfaceTest value) {
        return new JAXBElement<InterfaceTest>(_InterfaceTest_QNAME, InterfaceTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "global_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<GlobalTest> createGlobalTest(GlobalTest value) {
        return new JAXBElement<GlobalTest>(_GlobalTest_QNAME, GlobalTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpuserState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "snmpuser_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<SnmpuserState> createSnmpuserState(SnmpuserState value) {
        return new JAXBElement<SnmpuserState>(_SnmpuserState_QNAME, SnmpuserState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpcommunityState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "snmpcommunity_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<SnmpcommunityState> createSnmpcommunityState(SnmpcommunityState value) {
        return new JAXBElement<SnmpcommunityState>(_SnmpcommunityState_QNAME, SnmpcommunityState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmphostState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "snmphost_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<SnmphostState> createSnmphostState(SnmphostState value) {
        return new JAXBElement<SnmphostState>(_SnmphostState_QNAME, SnmphostState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "section_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<SectionTest> createSectionTest(SectionTest value) {
        return new JAXBElement<SectionTest>(_SectionTest_QNAME, SectionTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AclState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "acl_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<AclState> createAclState(AclState value) {
        return new JAXBElement<AclState>(_AclState_QNAME, AclState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "interface_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<InterfaceObject> createInterfaceObject(InterfaceObject value) {
        return new JAXBElement<InterfaceObject>(_InterfaceObject_QNAME, InterfaceObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "router_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<RouterObject> createRouterObject(RouterObject value) {
        return new JAXBElement<RouterObject>(_RouterObject_QNAME, RouterObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingprotocolauthintfTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "routingprotocolauthintf_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<RoutingprotocolauthintfTest> createRoutingprotocolauthintfTest(RoutingprotocolauthintfTest value) {
        return new JAXBElement<RoutingprotocolauthintfTest>(_RoutingprotocolauthintfTest_QNAME, RoutingprotocolauthintfTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpuserObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "snmpuser_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<SnmpuserObject> createSnmpuserObject(SnmpuserObject value) {
        return new JAXBElement<SnmpuserObject>(_SnmpuserObject_QNAME, SnmpuserObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "host", scope = SnmphostState.class)
    public JAXBElement<EntityStateStringType> createSnmphostStateHost(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SnmphostStateHost_QNAME, EntityStateStringType.class, SnmphostState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "community_or_user", scope = SnmphostState.class)
    public JAXBElement<EntityStateStringType> createSnmphostStateCommunityOrUser(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SnmphostStateCommunityOrUser_QNAME, EntityStateStringType.class, SnmphostState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateSNMPVersionStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "version", scope = SnmphostState.class)
    public JAXBElement<EntityStateSNMPVersionStringType> createSnmphostStateVersion(EntityStateSNMPVersionStringType value) {
        return new JAXBElement<EntityStateSNMPVersionStringType>(_SnmphostStateVersion_QNAME, EntityStateSNMPVersionStringType.class, SnmphostState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateSNMPSecLevelStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "snmpv3_sec_level", scope = SnmphostState.class)
    public JAXBElement<EntityStateSNMPSecLevelStringType> createSnmphostStateSnmpv3SecLevel(EntityStateSNMPSecLevelStringType value) {
        return new JAXBElement<EntityStateSNMPSecLevelStringType>(_SnmphostStateSnmpv3SecLevel_QNAME, EntityStateSNMPSecLevelStringType.class, SnmphostState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "traps", scope = SnmphostState.class)
    public JAXBElement<EntityStateStringType> createSnmphostStateTraps(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SnmphostStateTraps_QNAME, EntityStateStringType.class, SnmphostState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "id", scope = RoutingprotocolauthintfState.class)
    public JAXBElement<EntityStateIntType> createRoutingprotocolauthintfStateId(EntityStateIntType value) {
        return new JAXBElement<EntityStateIntType>(_RoutingprotocolauthintfStateId_QNAME, EntityStateIntType.class, RoutingprotocolauthintfState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "interface", scope = RoutingprotocolauthintfState.class)
    public JAXBElement<EntityStateStringType> createRoutingprotocolauthintfStateInterface(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_RoutingprotocolauthintfStateInterface_QNAME, EntityStateStringType.class, RoutingprotocolauthintfState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateRoutingProtocolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "protocol", scope = RoutingprotocolauthintfState.class)
    public JAXBElement<EntityStateRoutingProtocolType> createRoutingprotocolauthintfStateProtocol(EntityStateRoutingProtocolType value) {
        return new JAXBElement<EntityStateRoutingProtocolType>(_RoutingprotocolauthintfStateProtocol_QNAME, EntityStateRoutingProtocolType.class, RoutingprotocolauthintfState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateRoutingAuthTypeStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "auth_type", scope = RoutingprotocolauthintfState.class)
    public JAXBElement<EntityStateRoutingAuthTypeStringType> createRoutingprotocolauthintfStateAuthType(EntityStateRoutingAuthTypeStringType value) {
        return new JAXBElement<EntityStateRoutingAuthTypeStringType>(_RoutingprotocolauthintfStateAuthType_QNAME, EntityStateRoutingAuthTypeStringType.class, RoutingprotocolauthintfState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "key_chain", scope = RoutingprotocolauthintfState.class)
    public JAXBElement<EntityStateStringType> createRoutingprotocolauthintfStateKeyChain(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_RoutingprotocolauthintfStateKeyChain_QNAME, EntityStateStringType.class, RoutingprotocolauthintfState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingprotocolauthintfState.OspfArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "ospf_area", scope = RoutingprotocolauthintfState.class)
    public JAXBElement<RoutingprotocolauthintfState.OspfArea> createRoutingprotocolauthintfStateOspfArea(RoutingprotocolauthintfState.OspfArea value) {
        return new JAXBElement<RoutingprotocolauthintfState.OspfArea>(_RoutingprotocolauthintfStateOspfArea_QNAME, RoutingprotocolauthintfState.OspfArea.class, RoutingprotocolauthintfState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "notify_view", scope = SnmpgroupState.class)
    public JAXBElement<EntityStateStringType> createSnmpgroupStateNotifyView(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SnmpgroupStateNotifyView_QNAME, EntityStateStringType.class, SnmpgroupState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "name", scope = SnmpgroupState.class)
    public JAXBElement<EntityStateStringType> createSnmpgroupStateName(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SnmpgroupStateName_QNAME, EntityStateStringType.class, SnmpgroupState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "ipv4_acl", scope = SnmpgroupState.class)
    public JAXBElement<EntityStateStringType> createSnmpgroupStateIpv4Acl(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SnmpgroupStateIpv4Acl_QNAME, EntityStateStringType.class, SnmpgroupState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateSNMPVersionStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "version", scope = SnmpgroupState.class)
    public JAXBElement<EntityStateSNMPVersionStringType> createSnmpgroupStateVersion(EntityStateSNMPVersionStringType value) {
        return new JAXBElement<EntityStateSNMPVersionStringType>(_SnmphostStateVersion_QNAME, EntityStateSNMPVersionStringType.class, SnmpgroupState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "read_view", scope = SnmpgroupState.class)
    public JAXBElement<EntityStateStringType> createSnmpgroupStateReadView(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SnmpgroupStateReadView_QNAME, EntityStateStringType.class, SnmpgroupState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateSNMPSecLevelStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "snmpv3_sec_level", scope = SnmpgroupState.class)
    public JAXBElement<EntityStateSNMPSecLevelStringType> createSnmpgroupStateSnmpv3SecLevel(EntityStateSNMPSecLevelStringType value) {
        return new JAXBElement<EntityStateSNMPSecLevelStringType>(_SnmphostStateSnmpv3SecLevel_QNAME, EntityStateSNMPSecLevelStringType.class, SnmpgroupState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "write_view", scope = SnmpgroupState.class)
    public JAXBElement<EntityStateStringType> createSnmpgroupStateWriteView(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SnmpgroupStateWriteView_QNAME, EntityStateStringType.class, SnmpgroupState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "ipv6_acl", scope = SnmpgroupState.class)
    public JAXBElement<EntityStateStringType> createSnmpgroupStateIpv6Acl(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SnmpgroupStateIpv6Acl_QNAME, EntityStateStringType.class, SnmpgroupState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "id", scope = RouterObject.class)
    public JAXBElement<EntityObjectIntType> createRouterObjectId(EntityObjectIntType value) {
        return new JAXBElement<EntityObjectIntType>(_RoutingprotocolauthintfStateId_QNAME, EntityObjectIntType.class, RouterObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectRoutingProtocolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "protocol", scope = RouterObject.class)
    public JAXBElement<EntityObjectRoutingProtocolType> createRouterObjectProtocol(EntityObjectRoutingProtocolType value) {
        return new JAXBElement<EntityObjectRoutingProtocolType>(_RoutingprotocolauthintfStateProtocol_QNAME, EntityObjectRoutingProtocolType.class, RouterObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "name", scope = SnmpuserState.class)
    public JAXBElement<EntityStateStringType> createSnmpuserStateName(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SnmpgroupStateName_QNAME, EntityStateStringType.class, SnmpuserState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateSNMPPrivStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "priv", scope = SnmpuserState.class)
    public JAXBElement<EntityStateSNMPPrivStringType> createSnmpuserStatePriv(EntityStateSNMPPrivStringType value) {
        return new JAXBElement<EntityStateSNMPPrivStringType>(_SnmpuserStatePriv_QNAME, EntityStateSNMPPrivStringType.class, SnmpuserState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "ipv4_acl", scope = SnmpuserState.class)
    public JAXBElement<EntityStateStringType> createSnmpuserStateIpv4Acl(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SnmpgroupStateIpv4Acl_QNAME, EntityStateStringType.class, SnmpuserState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateSNMPVersionStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "version", scope = SnmpuserState.class)
    public JAXBElement<EntityStateSNMPVersionStringType> createSnmpuserStateVersion(EntityStateSNMPVersionStringType value) {
        return new JAXBElement<EntityStateSNMPVersionStringType>(_SnmphostStateVersion_QNAME, EntityStateSNMPVersionStringType.class, SnmpuserState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "group", scope = SnmpuserState.class)
    public JAXBElement<EntityStateStringType> createSnmpuserStateGroup(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SnmpuserStateGroup_QNAME, EntityStateStringType.class, SnmpuserState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateSNMPAuthStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "auth", scope = SnmpuserState.class)
    public JAXBElement<EntityStateSNMPAuthStringType> createSnmpuserStateAuth(EntityStateSNMPAuthStringType value) {
        return new JAXBElement<EntityStateSNMPAuthStringType>(_SnmpuserStateAuth_QNAME, EntityStateSNMPAuthStringType.class, SnmpuserState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "ipv6_acl", scope = SnmpuserState.class)
    public JAXBElement<EntityStateStringType> createSnmpuserStateIpv6Acl(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SnmpgroupStateIpv6Acl_QNAME, EntityStateStringType.class, SnmpuserState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "id", scope = RouterState.class)
    public JAXBElement<EntityStateIntType> createRouterStateId(EntityStateIntType value) {
        return new JAXBElement<EntityStateIntType>(_RoutingprotocolauthintfStateId_QNAME, EntityStateIntType.class, RouterState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "bgp_neighbor", scope = RouterState.class)
    public JAXBElement<EntityStateStringType> createRouterStateBgpNeighbor(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_RouterStateBgpNeighbor_QNAME, EntityStateStringType.class, RouterState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "network", scope = RouterState.class)
    public JAXBElement<EntityStateStringType> createRouterStateNetwork(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_RouterStateNetwork_QNAME, EntityStateStringType.class, RouterState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "router_config_lines", scope = RouterState.class)
    public JAXBElement<EntityStateStringType> createRouterStateRouterConfigLines(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_RouterStateRouterConfigLines_QNAME, EntityStateStringType.class, RouterState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateRoutingProtocolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "protocol", scope = RouterState.class)
    public JAXBElement<EntityStateRoutingProtocolType> createRouterStateProtocol(EntityStateRoutingProtocolType value) {
        return new JAXBElement<EntityStateRoutingProtocolType>(_RoutingprotocolauthintfStateProtocol_QNAME, EntityStateRoutingProtocolType.class, RouterState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterState.OspfAuthenticationArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe", name = "ospf_authentication_area", scope = RouterState.class)
    public JAXBElement<RouterState.OspfAuthenticationArea> createRouterStateOspfAuthenticationArea(RouterState.OspfAuthenticationArea value) {
        return new JAXBElement<RouterState.OspfAuthenticationArea>(_RouterStateOspfAuthenticationArea_QNAME, RouterState.OspfAuthenticationArea.class, RouterState.class, value);
    }

}
