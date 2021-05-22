


package org.mitre.oval.xmlschema.oval_definitions_5_asa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_definitions_5_asa package. 
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

    private final static QName _SnmpUserTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "snmp_user_test");
    private final static QName _PolicyMapTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "policy_map_test");
    private final static QName _ClassMapState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "class_map_state");
    private final static QName _InterfaceState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "interface_state");
    private final static QName _SnmpGroupState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "snmp_group_state");
    private final static QName _ClassMapObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "class_map_object");
    private final static QName _ServicePolicyState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "service_policy_state");
    private final static QName _VersionTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "version_test");
    private final static QName _ServicePolicyObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "service_policy_object");
    private final static QName _PolicyMapState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "policy_map_state");
    private final static QName _TcpMapState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "tcp_map_state");
    private final static QName _LineObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "line_object");
    private final static QName _PolicyMapObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "policy_map_object");
    private final static QName _AclObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "acl_object");
    private final static QName _SnmpHostTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "snmp_host_test");
    private final static QName _SnmpGroupTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "snmp_group_test");
    private final static QName _AclTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "acl_test");
    private final static QName _ServicePolicyTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "service_policy_test");
    private final static QName _AclState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "acl_state");
    private final static QName _InterfaceObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "interface_object");
    private final static QName _SnmpUserObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "snmp_user_object");
    private final static QName _ClassMapTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "class_map_test");
    private final static QName _SnmpHostObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "snmp_host_object");
    private final static QName _SnmpUserState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "snmp_user_state");
    private final static QName _LineState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "line_state");
    private final static QName _InterfaceTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "interface_test");
    private final static QName _TcpMapObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "tcp_map_object");
    private final static QName _SnmpGroupObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "snmp_group_object");
    private final static QName _TcpMapTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "tcp_map_test");
    private final static QName _LineTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "line_test");
    private final static QName _SnmpHostState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "snmp_host_state");
    private final static QName _VersionState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "version_state");
    private final static QName _VersionObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "version_object");
    private final static QName _SnmpHostStateInterface_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "interface");
    private final static QName _SnmpHostStateVersion_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "version");
    private final static QName _SnmpHostStatePoll_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "poll");
    private final static QName _SnmpHostStateHost_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "host");
    private final static QName _SnmpHostStateUdpPort_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "udp_port");
    private final static QName _SnmpHostStateSnmpv3User_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "snmpv3_user");
    private final static QName _SnmpHostStateTraps_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", "traps");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_definitions_5_asa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InterfaceTest }
     * 
     */
    public InterfaceTest createInterfaceTest() {
        return new InterfaceTest();
    }

    /**
     * Create an instance of {@link PolicyMapState }
     * 
     */
    public PolicyMapState createPolicyMapState() {
        return new PolicyMapState();
    }

    /**
     * Create an instance of {@link SnmpUserObject }
     * 
     */
    public SnmpUserObject createSnmpUserObject() {
        return new SnmpUserObject();
    }

    /**
     * Create an instance of {@link SnmpHostObject }
     * 
     */
    public SnmpHostObject createSnmpHostObject() {
        return new SnmpHostObject();
    }

    /**
     * Create an instance of {@link PolicyMapTest }
     * 
     */
    public PolicyMapTest createPolicyMapTest() {
        return new PolicyMapTest();
    }

    /**
     * Create an instance of {@link VersionObject }
     * 
     */
    public VersionObject createVersionObject() {
        return new VersionObject();
    }

    /**
     * Create an instance of {@link ServicePolicyObject }
     * 
     */
    public ServicePolicyObject createServicePolicyObject() {
        return new ServicePolicyObject();
    }

    /**
     * Create an instance of {@link TcpMapObject }
     * 
     */
    public TcpMapObject createTcpMapObject() {
        return new TcpMapObject();
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
     * Create an instance of {@link TcpMapTest }
     * 
     */
    public TcpMapTest createTcpMapTest() {
        return new TcpMapTest();
    }

    /**
     * Create an instance of {@link InterfaceState }
     * 
     */
    public InterfaceState createInterfaceState() {
        return new InterfaceState();
    }

    /**
     * Create an instance of {@link SnmpGroupObject }
     * 
     */
    public SnmpGroupObject createSnmpGroupObject() {
        return new SnmpGroupObject();
    }

    /**
     * Create an instance of {@link AclState }
     * 
     */
    public AclState createAclState() {
        return new AclState();
    }

    /**
     * Create an instance of {@link ClassMapState }
     * 
     */
    public ClassMapState createClassMapState() {
        return new ClassMapState();
    }

    /**
     * Create an instance of {@link SnmpUserTest }
     * 
     */
    public SnmpUserTest createSnmpUserTest() {
        return new SnmpUserTest();
    }

    /**
     * Create an instance of {@link ServicePolicyTest }
     * 
     */
    public ServicePolicyTest createServicePolicyTest() {
        return new ServicePolicyTest();
    }

    /**
     * Create an instance of {@link ClassMapTest }
     * 
     */
    public ClassMapTest createClassMapTest() {
        return new ClassMapTest();
    }

    /**
     * Create an instance of {@link ClassMapObject }
     * 
     */
    public ClassMapObject createClassMapObject() {
        return new ClassMapObject();
    }

    /**
     * Create an instance of {@link InterfaceObject }
     * 
     */
    public InterfaceObject createInterfaceObject() {
        return new InterfaceObject();
    }

    /**
     * Create an instance of {@link SnmpGroupTest }
     * 
     */
    public SnmpGroupTest createSnmpGroupTest() {
        return new SnmpGroupTest();
    }

    /**
     * Create an instance of {@link LineObject }
     * 
     */
    public LineObject createLineObject() {
        return new LineObject();
    }

    /**
     * Create an instance of {@link TcpMapState }
     * 
     */
    public TcpMapState createTcpMapState() {
        return new TcpMapState();
    }

    /**
     * Create an instance of {@link SnmpHostTest }
     * 
     */
    public SnmpHostTest createSnmpHostTest() {
        return new SnmpHostTest();
    }

    /**
     * Create an instance of {@link AclObject }
     * 
     */
    public AclObject createAclObject() {
        return new AclObject();
    }

    /**
     * Create an instance of {@link PolicyMapObject }
     * 
     */
    public PolicyMapObject createPolicyMapObject() {
        return new PolicyMapObject();
    }

    /**
     * Create an instance of {@link SnmpUserState }
     * 
     */
    public SnmpUserState createSnmpUserState() {
        return new SnmpUserState();
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
     * Create an instance of {@link ServicePolicyState }
     * 
     */
    public ServicePolicyState createServicePolicyState() {
        return new ServicePolicyState();
    }

    /**
     * Create an instance of {@link SnmpHostState }
     * 
     */
    public SnmpHostState createSnmpHostState() {
        return new SnmpHostState();
    }

    /**
     * Create an instance of {@link SnmpGroupState }
     * 
     */
    public SnmpGroupState createSnmpGroupState() {
        return new SnmpGroupState();
    }

    /**
     * Create an instance of {@link VersionTest }
     * 
     */
    public VersionTest createVersionTest() {
        return new VersionTest();
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
     * Create an instance of {@link EntityStateInspectionType }
     * 
     */
    public EntityStateInspectionType createEntityStateInspectionType() {
        return new EntityStateInspectionType();
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
     * Create an instance of {@link EntityStateAccessListInterfaceDirectionType }
     * 
     */
    public EntityStateAccessListInterfaceDirectionType createEntityStateAccessListInterfaceDirectionType() {
        return new EntityStateAccessListInterfaceDirectionType();
    }

    /**
     * Create an instance of {@link EntityStateSNMPSecLevelStringType }
     * 
     */
    public EntityStateSNMPSecLevelStringType createEntityStateSNMPSecLevelStringType() {
        return new EntityStateSNMPSecLevelStringType();
    }

    /**
     * Create an instance of {@link EntityStateMatchType }
     * 
     */
    public EntityStateMatchType createEntityStateMatchType() {
        return new EntityStateMatchType();
    }

    /**
     * Create an instance of {@link EntityStateAccessListUseType }
     * 
     */
    public EntityStateAccessListUseType createEntityStateAccessListUseType() {
        return new EntityStateAccessListUseType();
    }

    /**
     * Create an instance of {@link EntityStateClassMapType }
     * 
     */
    public EntityStateClassMapType createEntityStateClassMapType() {
        return new EntityStateClassMapType();
    }

    /**
     * Create an instance of {@link EntityStateAccessListIPVersionType }
     * 
     */
    public EntityStateAccessListIPVersionType createEntityStateAccessListIPVersionType() {
        return new EntityStateAccessListIPVersionType();
    }

    /**
     * Create an instance of {@link EntityStateApplyServicePolicyType }
     * 
     */
    public EntityStateApplyServicePolicyType createEntityStateApplyServicePolicyType() {
        return new EntityStateApplyServicePolicyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpUserTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "snmp_user_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<SnmpUserTest> createSnmpUserTest(SnmpUserTest value) {
        return new JAXBElement<SnmpUserTest>(_SnmpUserTest_QNAME, SnmpUserTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyMapTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "policy_map_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<PolicyMapTest> createPolicyMapTest(PolicyMapTest value) {
        return new JAXBElement<PolicyMapTest>(_PolicyMapTest_QNAME, PolicyMapTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassMapState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "class_map_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<ClassMapState> createClassMapState(ClassMapState value) {
        return new JAXBElement<ClassMapState>(_ClassMapState_QNAME, ClassMapState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "interface_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<InterfaceState> createInterfaceState(InterfaceState value) {
        return new JAXBElement<InterfaceState>(_InterfaceState_QNAME, InterfaceState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpGroupState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "snmp_group_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<SnmpGroupState> createSnmpGroupState(SnmpGroupState value) {
        return new JAXBElement<SnmpGroupState>(_SnmpGroupState_QNAME, SnmpGroupState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassMapObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "class_map_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<ClassMapObject> createClassMapObject(ClassMapObject value) {
        return new JAXBElement<ClassMapObject>(_ClassMapObject_QNAME, ClassMapObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePolicyState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "service_policy_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<ServicePolicyState> createServicePolicyState(ServicePolicyState value) {
        return new JAXBElement<ServicePolicyState>(_ServicePolicyState_QNAME, ServicePolicyState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "version_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<VersionTest> createVersionTest(VersionTest value) {
        return new JAXBElement<VersionTest>(_VersionTest_QNAME, VersionTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePolicyObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "service_policy_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<ServicePolicyObject> createServicePolicyObject(ServicePolicyObject value) {
        return new JAXBElement<ServicePolicyObject>(_ServicePolicyObject_QNAME, ServicePolicyObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyMapState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "policy_map_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<PolicyMapState> createPolicyMapState(PolicyMapState value) {
        return new JAXBElement<PolicyMapState>(_PolicyMapState_QNAME, PolicyMapState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TcpMapState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "tcp_map_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<TcpMapState> createTcpMapState(TcpMapState value) {
        return new JAXBElement<TcpMapState>(_TcpMapState_QNAME, TcpMapState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "line_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<LineObject> createLineObject(LineObject value) {
        return new JAXBElement<LineObject>(_LineObject_QNAME, LineObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyMapObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "policy_map_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<PolicyMapObject> createPolicyMapObject(PolicyMapObject value) {
        return new JAXBElement<PolicyMapObject>(_PolicyMapObject_QNAME, PolicyMapObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AclObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "acl_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<AclObject> createAclObject(AclObject value) {
        return new JAXBElement<AclObject>(_AclObject_QNAME, AclObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpHostTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "snmp_host_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<SnmpHostTest> createSnmpHostTest(SnmpHostTest value) {
        return new JAXBElement<SnmpHostTest>(_SnmpHostTest_QNAME, SnmpHostTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpGroupTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "snmp_group_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<SnmpGroupTest> createSnmpGroupTest(SnmpGroupTest value) {
        return new JAXBElement<SnmpGroupTest>(_SnmpGroupTest_QNAME, SnmpGroupTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AclTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "acl_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<AclTest> createAclTest(AclTest value) {
        return new JAXBElement<AclTest>(_AclTest_QNAME, AclTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePolicyTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "service_policy_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<ServicePolicyTest> createServicePolicyTest(ServicePolicyTest value) {
        return new JAXBElement<ServicePolicyTest>(_ServicePolicyTest_QNAME, ServicePolicyTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AclState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "acl_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<AclState> createAclState(AclState value) {
        return new JAXBElement<AclState>(_AclState_QNAME, AclState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "interface_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<InterfaceObject> createInterfaceObject(InterfaceObject value) {
        return new JAXBElement<InterfaceObject>(_InterfaceObject_QNAME, InterfaceObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpUserObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "snmp_user_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<SnmpUserObject> createSnmpUserObject(SnmpUserObject value) {
        return new JAXBElement<SnmpUserObject>(_SnmpUserObject_QNAME, SnmpUserObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassMapTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "class_map_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<ClassMapTest> createClassMapTest(ClassMapTest value) {
        return new JAXBElement<ClassMapTest>(_ClassMapTest_QNAME, ClassMapTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpHostObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "snmp_host_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<SnmpHostObject> createSnmpHostObject(SnmpHostObject value) {
        return new JAXBElement<SnmpHostObject>(_SnmpHostObject_QNAME, SnmpHostObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpUserState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "snmp_user_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<SnmpUserState> createSnmpUserState(SnmpUserState value) {
        return new JAXBElement<SnmpUserState>(_SnmpUserState_QNAME, SnmpUserState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "line_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<LineState> createLineState(LineState value) {
        return new JAXBElement<LineState>(_LineState_QNAME, LineState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "interface_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<InterfaceTest> createInterfaceTest(InterfaceTest value) {
        return new JAXBElement<InterfaceTest>(_InterfaceTest_QNAME, InterfaceTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TcpMapObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "tcp_map_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<TcpMapObject> createTcpMapObject(TcpMapObject value) {
        return new JAXBElement<TcpMapObject>(_TcpMapObject_QNAME, TcpMapObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpGroupObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "snmp_group_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<SnmpGroupObject> createSnmpGroupObject(SnmpGroupObject value) {
        return new JAXBElement<SnmpGroupObject>(_SnmpGroupObject_QNAME, SnmpGroupObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TcpMapTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "tcp_map_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<TcpMapTest> createTcpMapTest(TcpMapTest value) {
        return new JAXBElement<TcpMapTest>(_TcpMapTest_QNAME, TcpMapTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "line_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<LineTest> createLineTest(LineTest value) {
        return new JAXBElement<LineTest>(_LineTest_QNAME, LineTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpHostState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "snmp_host_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<SnmpHostState> createSnmpHostState(SnmpHostState value) {
        return new JAXBElement<SnmpHostState>(_SnmpHostState_QNAME, SnmpHostState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "version_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<VersionState> createVersionState(VersionState value) {
        return new JAXBElement<VersionState>(_VersionState_QNAME, VersionState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "version_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<VersionObject> createVersionObject(VersionObject value) {
        return new JAXBElement<VersionObject>(_VersionObject_QNAME, VersionObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "interface", scope = SnmpHostState.class)
    public JAXBElement<EntityStateStringType> createSnmpHostStateInterface(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SnmpHostStateInterface_QNAME, EntityStateStringType.class, SnmpHostState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateSNMPVersionStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "version", scope = SnmpHostState.class)
    public JAXBElement<EntityStateSNMPVersionStringType> createSnmpHostStateVersion(EntityStateSNMPVersionStringType value) {
        return new JAXBElement<EntityStateSNMPVersionStringType>(_SnmpHostStateVersion_QNAME, EntityStateSNMPVersionStringType.class, SnmpHostState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateBoolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "poll", scope = SnmpHostState.class)
    public JAXBElement<EntityStateBoolType> createSnmpHostStatePoll(EntityStateBoolType value) {
        return new JAXBElement<EntityStateBoolType>(_SnmpHostStatePoll_QNAME, EntityStateBoolType.class, SnmpHostState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "host", scope = SnmpHostState.class)
    public JAXBElement<EntityStateStringType> createSnmpHostStateHost(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SnmpHostStateHost_QNAME, EntityStateStringType.class, SnmpHostState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "udp_port", scope = SnmpHostState.class)
    public JAXBElement<EntityStateIntType> createSnmpHostStateUdpPort(EntityStateIntType value) {
        return new JAXBElement<EntityStateIntType>(_SnmpHostStateUdpPort_QNAME, EntityStateIntType.class, SnmpHostState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "snmpv3_user", scope = SnmpHostState.class)
    public JAXBElement<EntityStateStringType> createSnmpHostStateSnmpv3User(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SnmpHostStateSnmpv3User_QNAME, EntityStateStringType.class, SnmpHostState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateBoolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", name = "traps", scope = SnmpHostState.class)
    public JAXBElement<EntityStateBoolType> createSnmpHostStateTraps(EntityStateBoolType value) {
        return new JAXBElement<EntityStateBoolType>(_SnmpHostStateTraps_QNAME, EntityStateBoolType.class, SnmpHostState.class, value);
    }

}
