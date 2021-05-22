


package org.mitre.oval.xmlschema.oval_definitions_5_esx;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_definitions_5_esx package. 
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

    private final static QName _PatchTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", "patch_test");
    private final static QName _VersionTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", "version_test");
    private final static QName _PatchObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", "patch_object");
    private final static QName _PatchState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", "patch_state");
    private final static QName _Patch56Object_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", "patch56_object");
    private final static QName _VisdkmanagedobjectTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", "visdkmanagedobject_test");
    private final static QName _VisdkmanagedobjectState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", "visdkmanagedobject_state");
    private final static QName _Patch56Test_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", "patch56_test");
    private final static QName _VisdkmanagedobjectObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", "visdkmanagedobject_object");
    private final static QName _Patch56State_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", "patch56_state");
    private final static QName _VersionObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", "version_object");
    private final static QName _VersionState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", "version_state");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_definitions_5_esx
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PatchTest }
     * 
     */
    public PatchTest createPatchTest() {
        return new PatchTest();
    }

    /**
     * Create an instance of {@link Patch56Test }
     * 
     */
    public Patch56Test createPatch56Test() {
        return new Patch56Test();
    }

    /**
     * Create an instance of {@link VersionState }
     * 
     */
    public VersionState createVersionState() {
        return new VersionState();
    }

    /**
     * Create an instance of {@link VisdkmanagedobjectState }
     * 
     */
    public VisdkmanagedobjectState createVisdkmanagedobjectState() {
        return new VisdkmanagedobjectState();
    }

    /**
     * Create an instance of {@link Patch56State }
     * 
     */
    public Patch56State createPatch56State() {
        return new Patch56State();
    }

    /**
     * Create an instance of {@link VersionObject }
     * 
     */
    public VersionObject createVersionObject() {
        return new VersionObject();
    }

    /**
     * Create an instance of {@link VisdkmanagedobjectObject }
     * 
     */
    public VisdkmanagedobjectObject createVisdkmanagedobjectObject() {
        return new VisdkmanagedobjectObject();
    }

    /**
     * Create an instance of {@link Patch56Object }
     * 
     */
    public Patch56Object createPatch56Object() {
        return new Patch56Object();
    }

    /**
     * Create an instance of {@link PatchState }
     * 
     */
    public PatchState createPatchState() {
        return new PatchState();
    }

    /**
     * Create an instance of {@link VersionTest }
     * 
     */
    public VersionTest createVersionTest() {
        return new VersionTest();
    }

    /**
     * Create an instance of {@link VisdkmanagedobjectTest }
     * 
     */
    public VisdkmanagedobjectTest createVisdkmanagedobjectTest() {
        return new VisdkmanagedobjectTest();
    }

    /**
     * Create an instance of {@link PatchObject }
     * 
     */
    public PatchObject createPatchObject() {
        return new PatchObject();
    }

    /**
     * Create an instance of {@link ViSdkManagedEntityBehaviors }
     * 
     */
    public ViSdkManagedEntityBehaviors createViSdkManagedEntityBehaviors() {
        return new ViSdkManagedEntityBehaviors();
    }

    /**
     * Create an instance of {@link EntityStateSupportLevelType }
     * 
     */
    public EntityStateSupportLevelType createEntityStateSupportLevelType() {
        return new EntityStateSupportLevelType();
    }

    /**
     * Create an instance of {@link Patch56Behaviors }
     * 
     */
    public Patch56Behaviors createPatch56Behaviors() {
        return new Patch56Behaviors();
    }

    /**
     * Create an instance of {@link EntityStateClassificationType }
     * 
     */
    public EntityStateClassificationType createEntityStateClassificationType() {
        return new EntityStateClassificationType();
    }

    /**
     * Create an instance of {@link PatchBehaviors }
     * 
     */
    public PatchBehaviors createPatchBehaviors() {
        return new PatchBehaviors();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatchTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", name = "patch_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<PatchTest> createPatchTest(PatchTest value) {
        return new JAXBElement<PatchTest>(_PatchTest_QNAME, PatchTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", name = "version_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<VersionTest> createVersionTest(VersionTest value) {
        return new JAXBElement<VersionTest>(_VersionTest_QNAME, VersionTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatchObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", name = "patch_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<PatchObject> createPatchObject(PatchObject value) {
        return new JAXBElement<PatchObject>(_PatchObject_QNAME, PatchObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatchState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", name = "patch_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<PatchState> createPatchState(PatchState value) {
        return new JAXBElement<PatchState>(_PatchState_QNAME, PatchState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Patch56Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", name = "patch56_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<Patch56Object> createPatch56Object(Patch56Object value) {
        return new JAXBElement<Patch56Object>(_Patch56Object_QNAME, Patch56Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VisdkmanagedobjectTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", name = "visdkmanagedobject_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<VisdkmanagedobjectTest> createVisdkmanagedobjectTest(VisdkmanagedobjectTest value) {
        return new JAXBElement<VisdkmanagedobjectTest>(_VisdkmanagedobjectTest_QNAME, VisdkmanagedobjectTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VisdkmanagedobjectState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", name = "visdkmanagedobject_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<VisdkmanagedobjectState> createVisdkmanagedobjectState(VisdkmanagedobjectState value) {
        return new JAXBElement<VisdkmanagedobjectState>(_VisdkmanagedobjectState_QNAME, VisdkmanagedobjectState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Patch56Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", name = "patch56_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<Patch56Test> createPatch56Test(Patch56Test value) {
        return new JAXBElement<Patch56Test>(_Patch56Test_QNAME, Patch56Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VisdkmanagedobjectObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", name = "visdkmanagedobject_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<VisdkmanagedobjectObject> createVisdkmanagedobjectObject(VisdkmanagedobjectObject value) {
        return new JAXBElement<VisdkmanagedobjectObject>(_VisdkmanagedobjectObject_QNAME, VisdkmanagedobjectObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Patch56State }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", name = "patch56_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<Patch56State> createPatch56State(Patch56State value) {
        return new JAXBElement<Patch56State>(_Patch56State_QNAME, Patch56State.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", name = "version_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<VersionObject> createVersionObject(VersionObject value) {
        return new JAXBElement<VersionObject>(_VersionObject_QNAME, VersionObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx", name = "version_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<VersionState> createVersionState(VersionState value) {
        return new JAXBElement<VersionState>(_VersionState_QNAME, VersionState.class, null, value);
    }

}
