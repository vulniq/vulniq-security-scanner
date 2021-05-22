


package org.mitre.oval.xmlschema.oval_definitions_5_aix;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_definitions_5_aix package. 
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

    private final static QName _FixTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", "fix_test");
    private final static QName _InterimFixTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", "interim_fix_test");
    private final static QName _FixState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", "fix_state");
    private final static QName _NoTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", "no_test");
    private final static QName _OslevelState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", "oslevel_state");
    private final static QName _FilesetObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", "fileset_object");
    private final static QName _NoState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", "no_state");
    private final static QName _FilesetTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", "fileset_test");
    private final static QName _NoObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", "no_object");
    private final static QName _InterimFixObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", "interim_fix_object");
    private final static QName _OslevelTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", "oslevel_test");
    private final static QName _FixObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", "fix_object");
    private final static QName _FilesetState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", "fileset_state");
    private final static QName _OslevelObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", "oslevel_object");
    private final static QName _InterimFixState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", "interim_fix_state");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_definitions_5_aix
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FixTest }
     * 
     */
    public FixTest createFixTest() {
        return new FixTest();
    }

    /**
     * Create an instance of {@link OslevelObject }
     * 
     */
    public OslevelObject createOslevelObject() {
        return new OslevelObject();
    }

    /**
     * Create an instance of {@link FilesetObject }
     * 
     */
    public FilesetObject createFilesetObject() {
        return new FilesetObject();
    }

    /**
     * Create an instance of {@link InterimFixTest }
     * 
     */
    public InterimFixTest createInterimFixTest() {
        return new InterimFixTest();
    }

    /**
     * Create an instance of {@link InterimFixState }
     * 
     */
    public InterimFixState createInterimFixState() {
        return new InterimFixState();
    }

    /**
     * Create an instance of {@link NoObject }
     * 
     */
    public NoObject createNoObject() {
        return new NoObject();
    }

    /**
     * Create an instance of {@link OslevelTest }
     * 
     */
    public OslevelTest createOslevelTest() {
        return new OslevelTest();
    }

    /**
     * Create an instance of {@link FilesetState }
     * 
     */
    public FilesetState createFilesetState() {
        return new FilesetState();
    }

    /**
     * Create an instance of {@link OslevelState }
     * 
     */
    public OslevelState createOslevelState() {
        return new OslevelState();
    }

    /**
     * Create an instance of {@link NoState }
     * 
     */
    public NoState createNoState() {
        return new NoState();
    }

    /**
     * Create an instance of {@link FixState }
     * 
     */
    public FixState createFixState() {
        return new FixState();
    }

    /**
     * Create an instance of {@link NoTest }
     * 
     */
    public NoTest createNoTest() {
        return new NoTest();
    }

    /**
     * Create an instance of {@link InterimFixObject }
     * 
     */
    public InterimFixObject createInterimFixObject() {
        return new InterimFixObject();
    }

    /**
     * Create an instance of {@link FilesetTest }
     * 
     */
    public FilesetTest createFilesetTest() {
        return new FilesetTest();
    }

    /**
     * Create an instance of {@link FixObject }
     * 
     */
    public FixObject createFixObject() {
        return new FixObject();
    }

    /**
     * Create an instance of {@link EntityStateFixInstallationStatusType }
     * 
     */
    public EntityStateFixInstallationStatusType createEntityStateFixInstallationStatusType() {
        return new EntityStateFixInstallationStatusType();
    }

    /**
     * Create an instance of {@link EntityStateInterimFixStateType }
     * 
     */
    public EntityStateInterimFixStateType createEntityStateInterimFixStateType() {
        return new EntityStateInterimFixStateType();
    }

    /**
     * Create an instance of {@link EntityStateFilesetStateType }
     * 
     */
    public EntityStateFilesetStateType createEntityStateFilesetStateType() {
        return new EntityStateFilesetStateType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", name = "fix_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<FixTest> createFixTest(FixTest value) {
        return new JAXBElement<FixTest>(_FixTest_QNAME, FixTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterimFixTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", name = "interim_fix_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<InterimFixTest> createInterimFixTest(InterimFixTest value) {
        return new JAXBElement<InterimFixTest>(_InterimFixTest_QNAME, InterimFixTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", name = "fix_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<FixState> createFixState(FixState value) {
        return new JAXBElement<FixState>(_FixState_QNAME, FixState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", name = "no_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<NoTest> createNoTest(NoTest value) {
        return new JAXBElement<NoTest>(_NoTest_QNAME, NoTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OslevelState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", name = "oslevel_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<OslevelState> createOslevelState(OslevelState value) {
        return new JAXBElement<OslevelState>(_OslevelState_QNAME, OslevelState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilesetObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", name = "fileset_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<FilesetObject> createFilesetObject(FilesetObject value) {
        return new JAXBElement<FilesetObject>(_FilesetObject_QNAME, FilesetObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", name = "no_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<NoState> createNoState(NoState value) {
        return new JAXBElement<NoState>(_NoState_QNAME, NoState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilesetTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", name = "fileset_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<FilesetTest> createFilesetTest(FilesetTest value) {
        return new JAXBElement<FilesetTest>(_FilesetTest_QNAME, FilesetTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", name = "no_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<NoObject> createNoObject(NoObject value) {
        return new JAXBElement<NoObject>(_NoObject_QNAME, NoObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterimFixObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", name = "interim_fix_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<InterimFixObject> createInterimFixObject(InterimFixObject value) {
        return new JAXBElement<InterimFixObject>(_InterimFixObject_QNAME, InterimFixObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OslevelTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", name = "oslevel_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<OslevelTest> createOslevelTest(OslevelTest value) {
        return new JAXBElement<OslevelTest>(_OslevelTest_QNAME, OslevelTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", name = "fix_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<FixObject> createFixObject(FixObject value) {
        return new JAXBElement<FixObject>(_FixObject_QNAME, FixObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilesetState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", name = "fileset_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<FilesetState> createFilesetState(FilesetState value) {
        return new JAXBElement<FilesetState>(_FilesetState_QNAME, FilesetState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OslevelObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", name = "oslevel_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<OslevelObject> createOslevelObject(OslevelObject value) {
        return new JAXBElement<OslevelObject>(_OslevelObject_QNAME, OslevelObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterimFixState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", name = "interim_fix_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<InterimFixState> createInterimFixState(InterimFixState value) {
        return new JAXBElement<InterimFixState>(_InterimFixState_QNAME, InterimFixState.class, null, value);
    }

}
