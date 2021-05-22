


package org.mitre.oval.xmlschema.oval_definitions_5_pixos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_definitions_5_pixos package. 
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

    private final static QName _VersionObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#pixos", "version_object");
    private final static QName _VersionState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#pixos", "version_state");
    private final static QName _LineTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#pixos", "line_test");
    private final static QName _LineState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#pixos", "line_state");
    private final static QName _LineObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#pixos", "line_object");
    private final static QName _VersionTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#pixos", "version_test");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_definitions_5_pixos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LineObject }
     * 
     */
    public LineObject createLineObject() {
        return new LineObject();
    }

    /**
     * Create an instance of {@link VersionState }
     * 
     */
    public VersionState createVersionState() {
        return new VersionState();
    }

    /**
     * Create an instance of {@link VersionObject }
     * 
     */
    public VersionObject createVersionObject() {
        return new VersionObject();
    }

    /**
     * Create an instance of {@link LineState }
     * 
     */
    public LineState createLineState() {
        return new LineState();
    }

    /**
     * Create an instance of {@link VersionTest }
     * 
     */
    public VersionTest createVersionTest() {
        return new VersionTest();
    }

    /**
     * Create an instance of {@link LineTest }
     * 
     */
    public LineTest createLineTest() {
        return new LineTest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#pixos", name = "version_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<VersionObject> createVersionObject(VersionObject value) {
        return new JAXBElement<VersionObject>(_VersionObject_QNAME, VersionObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#pixos", name = "version_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<VersionState> createVersionState(VersionState value) {
        return new JAXBElement<VersionState>(_VersionState_QNAME, VersionState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#pixos", name = "line_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<LineTest> createLineTest(LineTest value) {
        return new JAXBElement<LineTest>(_LineTest_QNAME, LineTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#pixos", name = "line_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<LineState> createLineState(LineState value) {
        return new JAXBElement<LineState>(_LineState_QNAME, LineState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#pixos", name = "line_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<LineObject> createLineObject(LineObject value) {
        return new JAXBElement<LineObject>(_LineObject_QNAME, LineObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#pixos", name = "version_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<VersionTest> createVersionTest(VersionTest value) {
        return new JAXBElement<VersionTest>(_VersionTest_QNAME, VersionTest.class, null, value);
    }

}
