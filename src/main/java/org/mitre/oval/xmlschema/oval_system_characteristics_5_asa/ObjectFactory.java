


package org.mitre.oval.xmlschema.oval_system_characteristics_5_asa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_system_characteristics_5_asa package. 
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

    private final static QName _LineItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", "line_item");
    private final static QName _InterfaceItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", "interface_item");
    private final static QName _AclItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", "acl_item");
    private final static QName _VersionItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", "version_item");
    private final static QName _SnmpHostItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", "snmp_host_item");
    private final static QName _TcpMapItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", "tcp_map_item");
    private final static QName _ClassMapItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", "class_map_item");
    private final static QName _SnmpUserItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", "snmp_user_item");
    private final static QName _ServicePolicyItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", "service_policy_item");
    private final static QName _SnmpGroupItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", "snmp_group_item");
    private final static QName _PolicyMapItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", "policy_map_item");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_system_characteristics_5_asa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SnmpHostItem }
     * 
     */
    public SnmpHostItem createSnmpHostItem() {
        return new SnmpHostItem();
    }

    /**
     * Create an instance of {@link LineItem }
     * 
     */
    public LineItem createLineItem() {
        return new LineItem();
    }

    /**
     * Create an instance of {@link PolicyMapItem }
     * 
     */
    public PolicyMapItem createPolicyMapItem() {
        return new PolicyMapItem();
    }

    /**
     * Create an instance of {@link VersionItem }
     * 
     */
    public VersionItem createVersionItem() {
        return new VersionItem();
    }

    /**
     * Create an instance of {@link AclItem }
     * 
     */
    public AclItem createAclItem() {
        return new AclItem();
    }

    /**
     * Create an instance of {@link TcpMapItem }
     * 
     */
    public TcpMapItem createTcpMapItem() {
        return new TcpMapItem();
    }

    /**
     * Create an instance of {@link ServicePolicyItem }
     * 
     */
    public ServicePolicyItem createServicePolicyItem() {
        return new ServicePolicyItem();
    }

    /**
     * Create an instance of {@link InterfaceItem }
     * 
     */
    public InterfaceItem createInterfaceItem() {
        return new InterfaceItem();
    }

    /**
     * Create an instance of {@link SnmpUserItem }
     * 
     */
    public SnmpUserItem createSnmpUserItem() {
        return new SnmpUserItem();
    }

    /**
     * Create an instance of {@link SnmpGroupItem }
     * 
     */
    public SnmpGroupItem createSnmpGroupItem() {
        return new SnmpGroupItem();
    }

    /**
     * Create an instance of {@link ClassMapItem }
     * 
     */
    public ClassMapItem createClassMapItem() {
        return new ClassMapItem();
    }

    /**
     * Create an instance of {@link EntityItemAccessListUseType }
     * 
     */
    public EntityItemAccessListUseType createEntityItemAccessListUseType() {
        return new EntityItemAccessListUseType();
    }

    /**
     * Create an instance of {@link EntityItemSNMPPrivStringType }
     * 
     */
    public EntityItemSNMPPrivStringType createEntityItemSNMPPrivStringType() {
        return new EntityItemSNMPPrivStringType();
    }

    /**
     * Create an instance of {@link EntityItemInspectionType }
     * 
     */
    public EntityItemInspectionType createEntityItemInspectionType() {
        return new EntityItemInspectionType();
    }

    /**
     * Create an instance of {@link EntityItemAccessListInterfaceDirectionType }
     * 
     */
    public EntityItemAccessListInterfaceDirectionType createEntityItemAccessListInterfaceDirectionType() {
        return new EntityItemAccessListInterfaceDirectionType();
    }

    /**
     * Create an instance of {@link EntityItemMatchType }
     * 
     */
    public EntityItemMatchType createEntityItemMatchType() {
        return new EntityItemMatchType();
    }

    /**
     * Create an instance of {@link EntityItemSNMPVersionStringType }
     * 
     */
    public EntityItemSNMPVersionStringType createEntityItemSNMPVersionStringType() {
        return new EntityItemSNMPVersionStringType();
    }

    /**
     * Create an instance of {@link EntityItemAccessListIPVersionType }
     * 
     */
    public EntityItemAccessListIPVersionType createEntityItemAccessListIPVersionType() {
        return new EntityItemAccessListIPVersionType();
    }

    /**
     * Create an instance of {@link EntityItemSNMPSecLevelStringType }
     * 
     */
    public EntityItemSNMPSecLevelStringType createEntityItemSNMPSecLevelStringType() {
        return new EntityItemSNMPSecLevelStringType();
    }

    /**
     * Create an instance of {@link EntityItemClassMapType }
     * 
     */
    public EntityItemClassMapType createEntityItemClassMapType() {
        return new EntityItemClassMapType();
    }

    /**
     * Create an instance of {@link EntityItemApplyServicePolicyType }
     * 
     */
    public EntityItemApplyServicePolicyType createEntityItemApplyServicePolicyType() {
        return new EntityItemApplyServicePolicyType();
    }

    /**
     * Create an instance of {@link EntityItemSNMPAuthStringType }
     * 
     */
    public EntityItemSNMPAuthStringType createEntityItemSNMPAuthStringType() {
        return new EntityItemSNMPAuthStringType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", name = "line_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<LineItem> createLineItem(LineItem value) {
        return new JAXBElement<LineItem>(_LineItem_QNAME, LineItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", name = "interface_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<InterfaceItem> createInterfaceItem(InterfaceItem value) {
        return new JAXBElement<InterfaceItem>(_InterfaceItem_QNAME, InterfaceItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AclItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", name = "acl_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<AclItem> createAclItem(AclItem value) {
        return new JAXBElement<AclItem>(_AclItem_QNAME, AclItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", name = "version_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<VersionItem> createVersionItem(VersionItem value) {
        return new JAXBElement<VersionItem>(_VersionItem_QNAME, VersionItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpHostItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", name = "snmp_host_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SnmpHostItem> createSnmpHostItem(SnmpHostItem value) {
        return new JAXBElement<SnmpHostItem>(_SnmpHostItem_QNAME, SnmpHostItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TcpMapItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", name = "tcp_map_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<TcpMapItem> createTcpMapItem(TcpMapItem value) {
        return new JAXBElement<TcpMapItem>(_TcpMapItem_QNAME, TcpMapItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassMapItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", name = "class_map_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<ClassMapItem> createClassMapItem(ClassMapItem value) {
        return new JAXBElement<ClassMapItem>(_ClassMapItem_QNAME, ClassMapItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpUserItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", name = "snmp_user_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SnmpUserItem> createSnmpUserItem(SnmpUserItem value) {
        return new JAXBElement<SnmpUserItem>(_SnmpUserItem_QNAME, SnmpUserItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePolicyItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", name = "service_policy_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<ServicePolicyItem> createServicePolicyItem(ServicePolicyItem value) {
        return new JAXBElement<ServicePolicyItem>(_ServicePolicyItem_QNAME, ServicePolicyItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpGroupItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", name = "snmp_group_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SnmpGroupItem> createSnmpGroupItem(SnmpGroupItem value) {
        return new JAXBElement<SnmpGroupItem>(_SnmpGroupItem_QNAME, SnmpGroupItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyMapItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa", name = "policy_map_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<PolicyMapItem> createPolicyMapItem(PolicyMapItem value) {
        return new JAXBElement<PolicyMapItem>(_PolicyMapItem_QNAME, PolicyMapItem.class, null, value);
    }

}
