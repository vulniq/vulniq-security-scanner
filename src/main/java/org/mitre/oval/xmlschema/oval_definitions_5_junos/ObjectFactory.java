


package org.mitre.oval.xmlschema.oval_definitions_5_junos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_definitions_5_junos package. 
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

    private final static QName _VersionTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", "version_test");
    private final static QName _XmlShowObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", "xml_show_object");
    private final static QName _ShowTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", "show_test");
    private final static QName _ShowObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", "show_object");
    private final static QName _XmlConfigObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", "xml_config_object");
    private final static QName _XmlConfigTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", "xml_config_test");
    private final static QName _XmlConfigState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", "xml_config_state");
    private final static QName _ShowState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", "show_state");
    private final static QName _VersionObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", "version_object");
    private final static QName _XmlShowTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", "xml_show_test");
    private final static QName _VersionState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", "version_state");
    private final static QName _XmlShowState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", "xml_show_state");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_definitions_5_junos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XmlConfigTest }
     * 
     */
    public XmlConfigTest createXmlConfigTest() {
        return new XmlConfigTest();
    }

    /**
     * Create an instance of {@link VersionState }
     * 
     */
    public VersionState createVersionState() {
        return new VersionState();
    }

    /**
     * Create an instance of {@link XmlShowTest }
     * 
     */
    public XmlShowTest createXmlShowTest() {
        return new XmlShowTest();
    }

    /**
     * Create an instance of {@link ShowState }
     * 
     */
    public ShowState createShowState() {
        return new ShowState();
    }

    /**
     * Create an instance of {@link VersionObject }
     * 
     */
    public VersionObject createVersionObject() {
        return new VersionObject();
    }

    /**
     * Create an instance of {@link ShowTest }
     * 
     */
    public ShowTest createShowTest() {
        return new ShowTest();
    }

    /**
     * Create an instance of {@link XmlConfigObject }
     * 
     */
    public XmlConfigObject createXmlConfigObject() {
        return new XmlConfigObject();
    }

    /**
     * Create an instance of {@link ShowObject }
     * 
     */
    public ShowObject createShowObject() {
        return new ShowObject();
    }

    /**
     * Create an instance of {@link XmlConfigState }
     * 
     */
    public XmlConfigState createXmlConfigState() {
        return new XmlConfigState();
    }

    /**
     * Create an instance of {@link VersionTest }
     * 
     */
    public VersionTest createVersionTest() {
        return new VersionTest();
    }

    /**
     * Create an instance of {@link XmlShowState }
     * 
     */
    public XmlShowState createXmlShowState() {
        return new XmlShowState();
    }

    /**
     * Create an instance of {@link XmlShowObject }
     * 
     */
    public XmlShowObject createXmlShowObject() {
        return new XmlShowObject();
    }

    /**
     * Create an instance of {@link EntityStateJunosReleaseTypeType }
     * 
     */
    public EntityStateJunosReleaseTypeType createEntityStateJunosReleaseTypeType() {
        return new EntityStateJunosReleaseTypeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", name = "version_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<VersionTest> createVersionTest(VersionTest value) {
        return new JAXBElement<VersionTest>(_VersionTest_QNAME, VersionTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlShowObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", name = "xml_show_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<XmlShowObject> createXmlShowObject(XmlShowObject value) {
        return new JAXBElement<XmlShowObject>(_XmlShowObject_QNAME, XmlShowObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", name = "show_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<ShowTest> createShowTest(ShowTest value) {
        return new JAXBElement<ShowTest>(_ShowTest_QNAME, ShowTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", name = "show_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<ShowObject> createShowObject(ShowObject value) {
        return new JAXBElement<ShowObject>(_ShowObject_QNAME, ShowObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlConfigObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", name = "xml_config_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<XmlConfigObject> createXmlConfigObject(XmlConfigObject value) {
        return new JAXBElement<XmlConfigObject>(_XmlConfigObject_QNAME, XmlConfigObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlConfigTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", name = "xml_config_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<XmlConfigTest> createXmlConfigTest(XmlConfigTest value) {
        return new JAXBElement<XmlConfigTest>(_XmlConfigTest_QNAME, XmlConfigTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlConfigState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", name = "xml_config_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<XmlConfigState> createXmlConfigState(XmlConfigState value) {
        return new JAXBElement<XmlConfigState>(_XmlConfigState_QNAME, XmlConfigState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", name = "show_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<ShowState> createShowState(ShowState value) {
        return new JAXBElement<ShowState>(_ShowState_QNAME, ShowState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", name = "version_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<VersionObject> createVersionObject(VersionObject value) {
        return new JAXBElement<VersionObject>(_VersionObject_QNAME, VersionObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlShowTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", name = "xml_show_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<XmlShowTest> createXmlShowTest(XmlShowTest value) {
        return new JAXBElement<XmlShowTest>(_XmlShowTest_QNAME, XmlShowTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", name = "version_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<VersionState> createVersionState(VersionState value) {
        return new JAXBElement<VersionState>(_VersionState_QNAME, VersionState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlShowState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos", name = "xml_show_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<XmlShowState> createXmlShowState(XmlShowState value) {
        return new JAXBElement<XmlShowState>(_XmlShowState_QNAME, XmlShowState.class, null, value);
    }

}
