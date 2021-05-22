


package org.mitre.oval.xmlschema.oval_definitions_5_apache;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateVersionType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_definitions_5_apache package. 
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

    private final static QName _HttpdTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apache", "httpd_test");
    private final static QName _HttpdObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apache", "httpd_object");
    private final static QName _HttpdState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apache", "httpd_state");
    private final static QName _HttpdStateBinaryName_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apache", "binary_name");
    private final static QName _HttpdStateVersion_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apache", "version");
    private final static QName _HttpdStatePath_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apache", "path");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_definitions_5_apache
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HttpdState }
     * 
     */
    public HttpdState createHttpdState() {
        return new HttpdState();
    }

    /**
     * Create an instance of {@link HttpdTest }
     * 
     */
    public HttpdTest createHttpdTest() {
        return new HttpdTest();
    }

    /**
     * Create an instance of {@link HttpdObject }
     * 
     */
    public HttpdObject createHttpdObject() {
        return new HttpdObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HttpdTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apache", name = "httpd_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<HttpdTest> createHttpdTest(HttpdTest value) {
        return new JAXBElement<HttpdTest>(_HttpdTest_QNAME, HttpdTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HttpdObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apache", name = "httpd_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<HttpdObject> createHttpdObject(HttpdObject value) {
        return new JAXBElement<HttpdObject>(_HttpdObject_QNAME, HttpdObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HttpdState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apache", name = "httpd_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<HttpdState> createHttpdState(HttpdState value) {
        return new JAXBElement<HttpdState>(_HttpdState_QNAME, HttpdState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apache", name = "binary_name", scope = HttpdState.class)
    public JAXBElement<EntityStateStringType> createHttpdStateBinaryName(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_HttpdStateBinaryName_QNAME, EntityStateStringType.class, HttpdState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateVersionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apache", name = "version", scope = HttpdState.class)
    public JAXBElement<EntityStateVersionType> createHttpdStateVersion(EntityStateVersionType value) {
        return new JAXBElement<EntityStateVersionType>(_HttpdStateVersion_QNAME, EntityStateVersionType.class, HttpdState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apache", name = "path", scope = HttpdState.class)
    public JAXBElement<EntityStateStringType> createHttpdStatePath(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_HttpdStatePath_QNAME, EntityStateStringType.class, HttpdState.class, value);
    }

}
