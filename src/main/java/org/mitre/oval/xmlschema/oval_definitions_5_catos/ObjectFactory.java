


package org.mitre.oval.xmlschema.oval_definitions_5_catos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_definitions_5_catos package. 
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

    private final static QName _ModuleObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", "module_object");
    private final static QName _VersionTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", "version_test");
    private final static QName _Version55Object_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", "version55_object");
    private final static QName _Version55Test_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", "version55_test");
    private final static QName _LineObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", "line_object");
    private final static QName _ModuleState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", "module_state");
    private final static QName _ModuleTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", "module_test");
    private final static QName _LineTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", "line_test");
    private final static QName _LineState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", "line_state");
    private final static QName _VersionObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", "version_object");
    private final static QName _Version55State_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", "version55_state");
    private final static QName _VersionState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", "version_state");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_definitions_5_catos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModuleState }
     * 
     */
    public ModuleState createModuleState() {
        return new ModuleState();
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
     * Create an instance of {@link Version55Test }
     * 
     */
    public Version55Test createVersion55Test() {
        return new Version55Test();
    }

    /**
     * Create an instance of {@link VersionObject }
     * 
     */
    public VersionObject createVersionObject() {
        return new VersionObject();
    }

    /**
     * Create an instance of {@link Version55State }
     * 
     */
    public Version55State createVersion55State() {
        return new Version55State();
    }

    /**
     * Create an instance of {@link LineState }
     * 
     */
    public LineState createLineState() {
        return new LineState();
    }

    /**
     * Create an instance of {@link ModuleTest }
     * 
     */
    public ModuleTest createModuleTest() {
        return new ModuleTest();
    }

    /**
     * Create an instance of {@link Version55Object }
     * 
     */
    public Version55Object createVersion55Object() {
        return new Version55Object();
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
     * Create an instance of {@link ModuleObject }
     * 
     */
    public ModuleObject createModuleObject() {
        return new ModuleObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModuleObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", name = "module_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<ModuleObject> createModuleObject(ModuleObject value) {
        return new JAXBElement<ModuleObject>(_ModuleObject_QNAME, ModuleObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", name = "version_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<VersionTest> createVersionTest(VersionTest value) {
        return new JAXBElement<VersionTest>(_VersionTest_QNAME, VersionTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Version55Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", name = "version55_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<Version55Object> createVersion55Object(Version55Object value) {
        return new JAXBElement<Version55Object>(_Version55Object_QNAME, Version55Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Version55Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", name = "version55_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<Version55Test> createVersion55Test(Version55Test value) {
        return new JAXBElement<Version55Test>(_Version55Test_QNAME, Version55Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", name = "line_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<LineObject> createLineObject(LineObject value) {
        return new JAXBElement<LineObject>(_LineObject_QNAME, LineObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModuleState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", name = "module_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<ModuleState> createModuleState(ModuleState value) {
        return new JAXBElement<ModuleState>(_ModuleState_QNAME, ModuleState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModuleTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", name = "module_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<ModuleTest> createModuleTest(ModuleTest value) {
        return new JAXBElement<ModuleTest>(_ModuleTest_QNAME, ModuleTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", name = "line_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<LineTest> createLineTest(LineTest value) {
        return new JAXBElement<LineTest>(_LineTest_QNAME, LineTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", name = "line_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<LineState> createLineState(LineState value) {
        return new JAXBElement<LineState>(_LineState_QNAME, LineState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", name = "version_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<VersionObject> createVersionObject(VersionObject value) {
        return new JAXBElement<VersionObject>(_VersionObject_QNAME, VersionObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Version55State }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", name = "version55_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<Version55State> createVersion55State(Version55State value) {
        return new JAXBElement<Version55State>(_Version55State_QNAME, Version55State.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos", name = "version_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<VersionState> createVersionState(VersionState value) {
        return new JAXBElement<VersionState>(_VersionState_QNAME, VersionState.class, null, value);
    }

}
