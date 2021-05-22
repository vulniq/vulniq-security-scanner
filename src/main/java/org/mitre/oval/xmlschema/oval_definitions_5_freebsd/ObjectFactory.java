


package org.mitre.oval.xmlschema.oval_definitions_5_freebsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_definitions_5_freebsd package. 
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

    private final static QName _PortinfoState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#freebsd", "portinfo_state");
    private final static QName _PortinfoTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#freebsd", "portinfo_test");
    private final static QName _PortinfoObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#freebsd", "portinfo_object");
    private final static QName _PortinfoStateName_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#freebsd", "name");
    private final static QName _PortinfoStateDescription_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#freebsd", "description");
    private final static QName _PortinfoStateCategory_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#freebsd", "category");
    private final static QName _PortinfoStateVersion_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#freebsd", "version");
    private final static QName _PortinfoStatePkginst_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#freebsd", "pkginst");
    private final static QName _PortinfoStateVendor_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#freebsd", "vendor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_definitions_5_freebsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PortinfoState }
     * 
     */
    public PortinfoState createPortinfoState() {
        return new PortinfoState();
    }

    /**
     * Create an instance of {@link PortinfoTest }
     * 
     */
    public PortinfoTest createPortinfoTest() {
        return new PortinfoTest();
    }

    /**
     * Create an instance of {@link PortinfoObject }
     * 
     */
    public PortinfoObject createPortinfoObject() {
        return new PortinfoObject();
    }

    /**
     * Create an instance of {@link PortinfoState.Version }
     * 
     */
    public PortinfoState.Version createPortinfoStateVersion() {
        return new PortinfoState.Version();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortinfoState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#freebsd", name = "portinfo_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<PortinfoState> createPortinfoState(PortinfoState value) {
        return new JAXBElement<PortinfoState>(_PortinfoState_QNAME, PortinfoState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortinfoTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#freebsd", name = "portinfo_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<PortinfoTest> createPortinfoTest(PortinfoTest value) {
        return new JAXBElement<PortinfoTest>(_PortinfoTest_QNAME, PortinfoTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortinfoObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#freebsd", name = "portinfo_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<PortinfoObject> createPortinfoObject(PortinfoObject value) {
        return new JAXBElement<PortinfoObject>(_PortinfoObject_QNAME, PortinfoObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#freebsd", name = "name", scope = PortinfoState.class)
    public JAXBElement<EntityStateStringType> createPortinfoStateName(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_PortinfoStateName_QNAME, EntityStateStringType.class, PortinfoState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#freebsd", name = "description", scope = PortinfoState.class)
    public JAXBElement<EntityStateStringType> createPortinfoStateDescription(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_PortinfoStateDescription_QNAME, EntityStateStringType.class, PortinfoState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#freebsd", name = "category", scope = PortinfoState.class)
    public JAXBElement<EntityStateStringType> createPortinfoStateCategory(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_PortinfoStateCategory_QNAME, EntityStateStringType.class, PortinfoState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortinfoState.Version }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#freebsd", name = "version", scope = PortinfoState.class)
    public JAXBElement<PortinfoState.Version> createPortinfoStateVersion(PortinfoState.Version value) {
        return new JAXBElement<PortinfoState.Version>(_PortinfoStateVersion_QNAME, PortinfoState.Version.class, PortinfoState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#freebsd", name = "pkginst", scope = PortinfoState.class)
    public JAXBElement<EntityStateStringType> createPortinfoStatePkginst(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_PortinfoStatePkginst_QNAME, EntityStateStringType.class, PortinfoState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#freebsd", name = "vendor", scope = PortinfoState.class)
    public JAXBElement<EntityStateStringType> createPortinfoStateVendor(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_PortinfoStateVendor_QNAME, EntityStateStringType.class, PortinfoState.class, value);
    }

}
