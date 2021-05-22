


package org.mitre.oval.xmlschema.oval_definitions_5_hpux;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_definitions_5_hpux package. 
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

    private final static QName _NddObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "ndd_object");
    private final static QName _NddState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "ndd_state");
    private final static QName _PatchState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "patch_state");
    private final static QName _Patch53State_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "patch53_state");
    private final static QName _NddTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "ndd_test");
    private final static QName _GetconfState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "getconf_state");
    private final static QName _PatchObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "patch_object");
    private final static QName _SwlistState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "swlist_state");
    private final static QName _SwlistTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "swlist_test");
    private final static QName _PatchTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "patch_test");
    private final static QName _TrustedObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "trusted_object");
    private final static QName _GetconfTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "getconf_test");
    private final static QName _SwlistObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "swlist_object");
    private final static QName _TrustedTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "trusted_test");
    private final static QName _TrustedState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "trusted_state");
    private final static QName _Patch53Test_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "patch53_test");
    private final static QName _GetconfObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "getconf_object");
    private final static QName _Patch53Object_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "patch53_object");
    private final static QName _SwlistStateVendor_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "vendor");
    private final static QName _SwlistStateSwlist_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "swlist");
    private final static QName _SwlistStateFileset_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "fileset");
    private final static QName _SwlistStateTitle_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "title");
    private final static QName _SwlistStateBundle_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "bundle");
    private final static QName _SwlistStateVersion_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "version");
    private final static QName _GetconfObjectPathname_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", "pathname");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_definitions_5_hpux
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SwlistState }
     * 
     */
    public SwlistState createSwlistState() {
        return new SwlistState();
    }

    /**
     * Create an instance of {@link NddObject }
     * 
     */
    public NddObject createNddObject() {
        return new NddObject();
    }

    /**
     * Create an instance of {@link PatchTest }
     * 
     */
    public PatchTest createPatchTest() {
        return new PatchTest();
    }

    /**
     * Create an instance of {@link GetconfObject }
     * 
     */
    public GetconfObject createGetconfObject() {
        return new GetconfObject();
    }

    /**
     * Create an instance of {@link Patch53State }
     * 
     */
    public Patch53State createPatch53State() {
        return new Patch53State();
    }

    /**
     * Create an instance of {@link TrustedTest }
     * 
     */
    public TrustedTest createTrustedTest() {
        return new TrustedTest();
    }

    /**
     * Create an instance of {@link TrustedState }
     * 
     */
    public TrustedState createTrustedState() {
        return new TrustedState();
    }

    /**
     * Create an instance of {@link NddTest }
     * 
     */
    public NddTest createNddTest() {
        return new NddTest();
    }

    /**
     * Create an instance of {@link SwlistTest }
     * 
     */
    public SwlistTest createSwlistTest() {
        return new SwlistTest();
    }

    /**
     * Create an instance of {@link GetconfState }
     * 
     */
    public GetconfState createGetconfState() {
        return new GetconfState();
    }

    /**
     * Create an instance of {@link Patch53Test }
     * 
     */
    public Patch53Test createPatch53Test() {
        return new Patch53Test();
    }

    /**
     * Create an instance of {@link NddState }
     * 
     */
    public NddState createNddState() {
        return new NddState();
    }

    /**
     * Create an instance of {@link Patch53Object }
     * 
     */
    public Patch53Object createPatch53Object() {
        return new Patch53Object();
    }

    /**
     * Create an instance of {@link TrustedObject }
     * 
     */
    public TrustedObject createTrustedObject() {
        return new TrustedObject();
    }

    /**
     * Create an instance of {@link GetconfTest }
     * 
     */
    public GetconfTest createGetconfTest() {
        return new GetconfTest();
    }

    /**
     * Create an instance of {@link PatchState }
     * 
     */
    public PatchState createPatchState() {
        return new PatchState();
    }

    /**
     * Create an instance of {@link SwlistObject }
     * 
     */
    public SwlistObject createSwlistObject() {
        return new SwlistObject();
    }

    /**
     * Create an instance of {@link PatchObject }
     * 
     */
    public PatchObject createPatchObject() {
        return new PatchObject();
    }

    /**
     * Create an instance of {@link Patch53Behaviors }
     * 
     */
    public Patch53Behaviors createPatch53Behaviors() {
        return new Patch53Behaviors();
    }

    /**
     * Create an instance of {@link SwlistState.Version }
     * 
     */
    public SwlistState.Version createSwlistStateVersion() {
        return new SwlistState.Version();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NddObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "ndd_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<NddObject> createNddObject(NddObject value) {
        return new JAXBElement<NddObject>(_NddObject_QNAME, NddObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NddState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "ndd_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<NddState> createNddState(NddState value) {
        return new JAXBElement<NddState>(_NddState_QNAME, NddState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatchState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "patch_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<PatchState> createPatchState(PatchState value) {
        return new JAXBElement<PatchState>(_PatchState_QNAME, PatchState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Patch53State }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "patch53_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<Patch53State> createPatch53State(Patch53State value) {
        return new JAXBElement<Patch53State>(_Patch53State_QNAME, Patch53State.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NddTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "ndd_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<NddTest> createNddTest(NddTest value) {
        return new JAXBElement<NddTest>(_NddTest_QNAME, NddTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetconfState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "getconf_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<GetconfState> createGetconfState(GetconfState value) {
        return new JAXBElement<GetconfState>(_GetconfState_QNAME, GetconfState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatchObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "patch_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<PatchObject> createPatchObject(PatchObject value) {
        return new JAXBElement<PatchObject>(_PatchObject_QNAME, PatchObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SwlistState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "swlist_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<SwlistState> createSwlistState(SwlistState value) {
        return new JAXBElement<SwlistState>(_SwlistState_QNAME, SwlistState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SwlistTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "swlist_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<SwlistTest> createSwlistTest(SwlistTest value) {
        return new JAXBElement<SwlistTest>(_SwlistTest_QNAME, SwlistTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatchTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "patch_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<PatchTest> createPatchTest(PatchTest value) {
        return new JAXBElement<PatchTest>(_PatchTest_QNAME, PatchTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrustedObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "trusted_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<TrustedObject> createTrustedObject(TrustedObject value) {
        return new JAXBElement<TrustedObject>(_TrustedObject_QNAME, TrustedObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetconfTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "getconf_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<GetconfTest> createGetconfTest(GetconfTest value) {
        return new JAXBElement<GetconfTest>(_GetconfTest_QNAME, GetconfTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SwlistObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "swlist_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<SwlistObject> createSwlistObject(SwlistObject value) {
        return new JAXBElement<SwlistObject>(_SwlistObject_QNAME, SwlistObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrustedTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "trusted_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<TrustedTest> createTrustedTest(TrustedTest value) {
        return new JAXBElement<TrustedTest>(_TrustedTest_QNAME, TrustedTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrustedState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "trusted_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<TrustedState> createTrustedState(TrustedState value) {
        return new JAXBElement<TrustedState>(_TrustedState_QNAME, TrustedState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Patch53Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "patch53_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<Patch53Test> createPatch53Test(Patch53Test value) {
        return new JAXBElement<Patch53Test>(_Patch53Test_QNAME, Patch53Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetconfObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "getconf_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<GetconfObject> createGetconfObject(GetconfObject value) {
        return new JAXBElement<GetconfObject>(_GetconfObject_QNAME, GetconfObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Patch53Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "patch53_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<Patch53Object> createPatch53Object(Patch53Object value) {
        return new JAXBElement<Patch53Object>(_Patch53Object_QNAME, Patch53Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "vendor", scope = SwlistState.class)
    public JAXBElement<EntityStateStringType> createSwlistStateVendor(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SwlistStateVendor_QNAME, EntityStateStringType.class, SwlistState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "swlist", scope = SwlistState.class)
    public JAXBElement<EntityStateStringType> createSwlistStateSwlist(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SwlistStateSwlist_QNAME, EntityStateStringType.class, SwlistState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "fileset", scope = SwlistState.class)
    public JAXBElement<EntityStateStringType> createSwlistStateFileset(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SwlistStateFileset_QNAME, EntityStateStringType.class, SwlistState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "title", scope = SwlistState.class)
    public JAXBElement<EntityStateStringType> createSwlistStateTitle(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SwlistStateTitle_QNAME, EntityStateStringType.class, SwlistState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "bundle", scope = SwlistState.class)
    public JAXBElement<EntityStateStringType> createSwlistStateBundle(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SwlistStateBundle_QNAME, EntityStateStringType.class, SwlistState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SwlistState.Version }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "version", scope = SwlistState.class)
    public JAXBElement<SwlistState.Version> createSwlistStateVersion(SwlistState.Version value) {
        return new JAXBElement<SwlistState.Version>(_SwlistStateVersion_QNAME, SwlistState.Version.class, SwlistState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux", name = "pathname", scope = GetconfObject.class)
    public JAXBElement<EntityObjectStringType> createGetconfObjectPathname(EntityObjectStringType value) {
        return new JAXBElement<EntityObjectStringType>(_GetconfObjectPathname_QNAME, EntityObjectStringType.class, GetconfObject.class, value);
    }

}
