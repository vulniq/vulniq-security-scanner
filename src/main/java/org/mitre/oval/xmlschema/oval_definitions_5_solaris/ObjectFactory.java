


package org.mitre.oval.xmlschema.oval_definitions_5_solaris;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectVersionType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateVersionType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_definitions_5_solaris package. 
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

    private final static QName _PackagepublisherTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "packagepublisher_test");
    private final static QName _VariantTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "variant_test");
    private final static QName _PackagepublisherObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "packagepublisher_object");
    private final static QName _SmfState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "smf_state");
    private final static QName _IsainfoTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "isainfo_test");
    private final static QName _PackagefreezelistState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "packagefreezelist_state");
    private final static QName _SmfpropertyState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "smfproperty_state");
    private final static QName _VirtualizationinfoTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "virtualizationinfo_test");
    private final static QName _PackagecheckTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "packagecheck_test");
    private final static QName _PackagecheckState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "packagecheck_state");
    private final static QName _SmfObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "smf_object");
    private final static QName _FacetTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "facet_test");
    private final static QName _SmfpropertyTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "smfproperty_test");
    private final static QName _NddObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "ndd_object");
    private final static QName _Patch54Test_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "patch54_test");
    private final static QName _IsainfoObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "isainfo_object");
    private final static QName _PackageavoidlistState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "packageavoidlist_state");
    private final static QName _Package511Test_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "package511_test");
    private final static QName _Package511Object_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "package511_object");
    private final static QName _SmfpropertyObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "smfproperty_object");
    private final static QName _PackagefreezelistObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "packagefreezelist_object");
    private final static QName _NddState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "ndd_state");
    private final static QName _PackageavoidlistObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "packageavoidlist_object");
    private final static QName _PackageState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "package_state");
    private final static QName _VirtualizationinfoState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "virtualizationinfo_state");
    private final static QName _PatchState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "patch_state");
    private final static QName _PackageTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "package_test");
    private final static QName _PackageObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "package_object");
    private final static QName _PackageavoidlistTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "packageavoidlist_test");
    private final static QName _SmfTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "smf_test");
    private final static QName _VariantState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "variant_state");
    private final static QName _NddTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "ndd_test");
    private final static QName _VirtualizationinfoObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "virtualizationinfo_object");
    private final static QName _PackagefreezelistTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "packagefreezelist_test");
    private final static QName _FacetObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "facet_object");
    private final static QName _IsainfoState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "isainfo_state");
    private final static QName _PatchObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "patch_object");
    private final static QName _Package511State_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "package511_state");
    private final static QName _PackagecheckObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "packagecheck_object");
    private final static QName _ImageState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "image_state");
    private final static QName _ImageTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "image_test");
    private final static QName _PatchTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "patch_test");
    private final static QName _FacetState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "facet_state");
    private final static QName _PackagepublisherState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "packagepublisher_state");
    private final static QName _ImageObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "image_object");
    private final static QName _VariantObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "variant_object");
    private final static QName _Patch54Object_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "patch54_object");
    private final static QName _Patch54ObjectVersion_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "version");
    private final static QName _Patch54ObjectBase_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "base");
    private final static QName _Patch54ObjectBehaviors_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "behaviors");
    private final static QName _Package511ObjectName_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "name");
    private final static QName _Package511ObjectPublisher_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "publisher");
    private final static QName _Package511ObjectTimestamp_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "timestamp");
    private final static QName _Package511StateDescription_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "description");
    private final static QName _Package511StateCategory_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "category");
    private final static QName _Package511StateFmri_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "fmri");
    private final static QName _Package511StateSummary_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "summary");
    private final static QName _Package511StateUpdatesAvailable_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "updates_available");
    private final static QName _PackageStatePkginst_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "pkginst");
    private final static QName _PackageStateVendor_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", "vendor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_definitions_5_solaris
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NddObject }
     * 
     */
    public NddObject createNddObject() {
        return new NddObject();
    }

    /**
     * Create an instance of {@link VariantState }
     * 
     */
    public VariantState createVariantState() {
        return new VariantState();
    }

    /**
     * Create an instance of {@link ImageObject }
     * 
     */
    public ImageObject createImageObject() {
        return new ImageObject();
    }

    /**
     * Create an instance of {@link PackageObject }
     * 
     */
    public PackageObject createPackageObject() {
        return new PackageObject();
    }

    /**
     * Create an instance of {@link VariantObject }
     * 
     */
    public VariantObject createVariantObject() {
        return new VariantObject();
    }

    /**
     * Create an instance of {@link NddTest }
     * 
     */
    public NddTest createNddTest() {
        return new NddTest();
    }

    /**
     * Create an instance of {@link Patch54Test }
     * 
     */
    public Patch54Test createPatch54Test() {
        return new Patch54Test();
    }

    /**
     * Create an instance of {@link PackageavoidlistObject }
     * 
     */
    public PackageavoidlistObject createPackageavoidlistObject() {
        return new PackageavoidlistObject();
    }

    /**
     * Create an instance of {@link FacetObject }
     * 
     */
    public FacetObject createFacetObject() {
        return new FacetObject();
    }

    /**
     * Create an instance of {@link SmfTest }
     * 
     */
    public SmfTest createSmfTest() {
        return new SmfTest();
    }

    /**
     * Create an instance of {@link PackagepublisherState }
     * 
     */
    public PackagepublisherState createPackagepublisherState() {
        return new PackagepublisherState();
    }

    /**
     * Create an instance of {@link SmfpropertyObject }
     * 
     */
    public SmfpropertyObject createSmfpropertyObject() {
        return new SmfpropertyObject();
    }

    /**
     * Create an instance of {@link PackagefreezelistState }
     * 
     */
    public PackagefreezelistState createPackagefreezelistState() {
        return new PackagefreezelistState();
    }

    /**
     * Create an instance of {@link IsainfoObject }
     * 
     */
    public IsainfoObject createIsainfoObject() {
        return new IsainfoObject();
    }

    /**
     * Create an instance of {@link PackageState }
     * 
     */
    public PackageState createPackageState() {
        return new PackageState();
    }

    /**
     * Create an instance of {@link PackagefreezelistObject }
     * 
     */
    public PackagefreezelistObject createPackagefreezelistObject() {
        return new PackagefreezelistObject();
    }

    /**
     * Create an instance of {@link IsainfoState }
     * 
     */
    public IsainfoState createIsainfoState() {
        return new IsainfoState();
    }

    /**
     * Create an instance of {@link Patch54Object }
     * 
     */
    public Patch54Object createPatch54Object() {
        return new Patch54Object();
    }

    /**
     * Create an instance of {@link SmfObject }
     * 
     */
    public SmfObject createSmfObject() {
        return new SmfObject();
    }

    /**
     * Create an instance of {@link SmfState }
     * 
     */
    public SmfState createSmfState() {
        return new SmfState();
    }

    /**
     * Create an instance of {@link PatchObject }
     * 
     */
    public PatchObject createPatchObject() {
        return new PatchObject();
    }

    /**
     * Create an instance of {@link PatchTest }
     * 
     */
    public PatchTest createPatchTest() {
        return new PatchTest();
    }

    /**
     * Create an instance of {@link PackageavoidlistState }
     * 
     */
    public PackageavoidlistState createPackageavoidlistState() {
        return new PackageavoidlistState();
    }

    /**
     * Create an instance of {@link FacetTest }
     * 
     */
    public FacetTest createFacetTest() {
        return new FacetTest();
    }

    /**
     * Create an instance of {@link Package511State }
     * 
     */
    public Package511State createPackage511State() {
        return new Package511State();
    }

    /**
     * Create an instance of {@link Package511Test }
     * 
     */
    public Package511Test createPackage511Test() {
        return new Package511Test();
    }

    /**
     * Create an instance of {@link VirtualizationinfoTest }
     * 
     */
    public VirtualizationinfoTest createVirtualizationinfoTest() {
        return new VirtualizationinfoTest();
    }

    /**
     * Create an instance of {@link VirtualizationinfoObject }
     * 
     */
    public VirtualizationinfoObject createVirtualizationinfoObject() {
        return new VirtualizationinfoObject();
    }

    /**
     * Create an instance of {@link VirtualizationinfoState }
     * 
     */
    public VirtualizationinfoState createVirtualizationinfoState() {
        return new VirtualizationinfoState();
    }

    /**
     * Create an instance of {@link PackageavoidlistTest }
     * 
     */
    public PackageavoidlistTest createPackageavoidlistTest() {
        return new PackageavoidlistTest();
    }

    /**
     * Create an instance of {@link PackagefreezelistTest }
     * 
     */
    public PackagefreezelistTest createPackagefreezelistTest() {
        return new PackagefreezelistTest();
    }

    /**
     * Create an instance of {@link SmfpropertyState }
     * 
     */
    public SmfpropertyState createSmfpropertyState() {
        return new SmfpropertyState();
    }

    /**
     * Create an instance of {@link FacetState }
     * 
     */
    public FacetState createFacetState() {
        return new FacetState();
    }

    /**
     * Create an instance of {@link NddState }
     * 
     */
    public NddState createNddState() {
        return new NddState();
    }

    /**
     * Create an instance of {@link PackagepublisherObject }
     * 
     */
    public PackagepublisherObject createPackagepublisherObject() {
        return new PackagepublisherObject();
    }

    /**
     * Create an instance of {@link PackageTest }
     * 
     */
    public PackageTest createPackageTest() {
        return new PackageTest();
    }

    /**
     * Create an instance of {@link ImageTest }
     * 
     */
    public ImageTest createImageTest() {
        return new ImageTest();
    }

    /**
     * Create an instance of {@link PackagecheckState }
     * 
     */
    public PackagecheckState createPackagecheckState() {
        return new PackagecheckState();
    }

    /**
     * Create an instance of {@link PackagecheckTest }
     * 
     */
    public PackagecheckTest createPackagecheckTest() {
        return new PackagecheckTest();
    }

    /**
     * Create an instance of {@link PackagecheckObject }
     * 
     */
    public PackagecheckObject createPackagecheckObject() {
        return new PackagecheckObject();
    }

    /**
     * Create an instance of {@link IsainfoTest }
     * 
     */
    public IsainfoTest createIsainfoTest() {
        return new IsainfoTest();
    }

    /**
     * Create an instance of {@link ImageState }
     * 
     */
    public ImageState createImageState() {
        return new ImageState();
    }

    /**
     * Create an instance of {@link Package511Object }
     * 
     */
    public Package511Object createPackage511Object() {
        return new Package511Object();
    }

    /**
     * Create an instance of {@link PackagepublisherTest }
     * 
     */
    public PackagepublisherTest createPackagepublisherTest() {
        return new PackagepublisherTest();
    }

    /**
     * Create an instance of {@link PatchState }
     * 
     */
    public PatchState createPatchState() {
        return new PatchState();
    }

    /**
     * Create an instance of {@link SmfpropertyTest }
     * 
     */
    public SmfpropertyTest createSmfpropertyTest() {
        return new SmfpropertyTest();
    }

    /**
     * Create an instance of {@link VariantTest }
     * 
     */
    public VariantTest createVariantTest() {
        return new VariantTest();
    }

    /**
     * Create an instance of {@link EntityStateSmfServiceStateType }
     * 
     */
    public EntityStateSmfServiceStateType createEntityStateSmfServiceStateType() {
        return new EntityStateSmfServiceStateType();
    }

    /**
     * Create an instance of {@link EntityStatePermissionCompareType }
     * 
     */
    public EntityStatePermissionCompareType createEntityStatePermissionCompareType() {
        return new EntityStatePermissionCompareType();
    }

    /**
     * Create an instance of {@link EntityObjectPublisherTypeType }
     * 
     */
    public EntityObjectPublisherTypeType createEntityObjectPublisherTypeType() {
        return new EntityObjectPublisherTypeType();
    }

    /**
     * Create an instance of {@link EntityStateClientUUIDType }
     * 
     */
    public EntityStateClientUUIDType createEntityStateClientUUIDType() {
        return new EntityStateClientUUIDType();
    }

    /**
     * Create an instance of {@link PackageCheckBehaviors }
     * 
     */
    public PackageCheckBehaviors createPackageCheckBehaviors() {
        return new PackageCheckBehaviors();
    }

    /**
     * Create an instance of {@link EntityStateLDOMRoleType }
     * 
     */
    public EntityStateLDOMRoleType createEntityStateLDOMRoleType() {
        return new EntityStateLDOMRoleType();
    }

    /**
     * Create an instance of {@link PatchBehaviors }
     * 
     */
    public PatchBehaviors createPatchBehaviors() {
        return new PatchBehaviors();
    }

    /**
     * Create an instance of {@link EntityStatePublisherTypeType }
     * 
     */
    public EntityStatePublisherTypeType createEntityStatePublisherTypeType() {
        return new EntityStatePublisherTypeType();
    }

    /**
     * Create an instance of {@link EntityStateV12NEnvType }
     * 
     */
    public EntityStateV12NEnvType createEntityStateV12NEnvType() {
        return new EntityStateV12NEnvType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagepublisherTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "packagepublisher_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<PackagepublisherTest> createPackagepublisherTest(PackagepublisherTest value) {
        return new JAXBElement<PackagepublisherTest>(_PackagepublisherTest_QNAME, PackagepublisherTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariantTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "variant_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<VariantTest> createVariantTest(VariantTest value) {
        return new JAXBElement<VariantTest>(_VariantTest_QNAME, VariantTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagepublisherObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "packagepublisher_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<PackagepublisherObject> createPackagepublisherObject(PackagepublisherObject value) {
        return new JAXBElement<PackagepublisherObject>(_PackagepublisherObject_QNAME, PackagepublisherObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmfState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "smf_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<SmfState> createSmfState(SmfState value) {
        return new JAXBElement<SmfState>(_SmfState_QNAME, SmfState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsainfoTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "isainfo_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<IsainfoTest> createIsainfoTest(IsainfoTest value) {
        return new JAXBElement<IsainfoTest>(_IsainfoTest_QNAME, IsainfoTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagefreezelistState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "packagefreezelist_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<PackagefreezelistState> createPackagefreezelistState(PackagefreezelistState value) {
        return new JAXBElement<PackagefreezelistState>(_PackagefreezelistState_QNAME, PackagefreezelistState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmfpropertyState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "smfproperty_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<SmfpropertyState> createSmfpropertyState(SmfpropertyState value) {
        return new JAXBElement<SmfpropertyState>(_SmfpropertyState_QNAME, SmfpropertyState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirtualizationinfoTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "virtualizationinfo_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<VirtualizationinfoTest> createVirtualizationinfoTest(VirtualizationinfoTest value) {
        return new JAXBElement<VirtualizationinfoTest>(_VirtualizationinfoTest_QNAME, VirtualizationinfoTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagecheckTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "packagecheck_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<PackagecheckTest> createPackagecheckTest(PackagecheckTest value) {
        return new JAXBElement<PackagecheckTest>(_PackagecheckTest_QNAME, PackagecheckTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagecheckState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "packagecheck_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<PackagecheckState> createPackagecheckState(PackagecheckState value) {
        return new JAXBElement<PackagecheckState>(_PackagecheckState_QNAME, PackagecheckState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmfObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "smf_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<SmfObject> createSmfObject(SmfObject value) {
        return new JAXBElement<SmfObject>(_SmfObject_QNAME, SmfObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacetTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "facet_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<FacetTest> createFacetTest(FacetTest value) {
        return new JAXBElement<FacetTest>(_FacetTest_QNAME, FacetTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmfpropertyTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "smfproperty_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<SmfpropertyTest> createSmfpropertyTest(SmfpropertyTest value) {
        return new JAXBElement<SmfpropertyTest>(_SmfpropertyTest_QNAME, SmfpropertyTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NddObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "ndd_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<NddObject> createNddObject(NddObject value) {
        return new JAXBElement<NddObject>(_NddObject_QNAME, NddObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Patch54Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "patch54_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<Patch54Test> createPatch54Test(Patch54Test value) {
        return new JAXBElement<Patch54Test>(_Patch54Test_QNAME, Patch54Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsainfoObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "isainfo_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<IsainfoObject> createIsainfoObject(IsainfoObject value) {
        return new JAXBElement<IsainfoObject>(_IsainfoObject_QNAME, IsainfoObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageavoidlistState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "packageavoidlist_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<PackageavoidlistState> createPackageavoidlistState(PackageavoidlistState value) {
        return new JAXBElement<PackageavoidlistState>(_PackageavoidlistState_QNAME, PackageavoidlistState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Package511Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "package511_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<Package511Test> createPackage511Test(Package511Test value) {
        return new JAXBElement<Package511Test>(_Package511Test_QNAME, Package511Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Package511Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "package511_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<Package511Object> createPackage511Object(Package511Object value) {
        return new JAXBElement<Package511Object>(_Package511Object_QNAME, Package511Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmfpropertyObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "smfproperty_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<SmfpropertyObject> createSmfpropertyObject(SmfpropertyObject value) {
        return new JAXBElement<SmfpropertyObject>(_SmfpropertyObject_QNAME, SmfpropertyObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagefreezelistObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "packagefreezelist_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<PackagefreezelistObject> createPackagefreezelistObject(PackagefreezelistObject value) {
        return new JAXBElement<PackagefreezelistObject>(_PackagefreezelistObject_QNAME, PackagefreezelistObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NddState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "ndd_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<NddState> createNddState(NddState value) {
        return new JAXBElement<NddState>(_NddState_QNAME, NddState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageavoidlistObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "packageavoidlist_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<PackageavoidlistObject> createPackageavoidlistObject(PackageavoidlistObject value) {
        return new JAXBElement<PackageavoidlistObject>(_PackageavoidlistObject_QNAME, PackageavoidlistObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "package_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<PackageState> createPackageState(PackageState value) {
        return new JAXBElement<PackageState>(_PackageState_QNAME, PackageState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirtualizationinfoState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "virtualizationinfo_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<VirtualizationinfoState> createVirtualizationinfoState(VirtualizationinfoState value) {
        return new JAXBElement<VirtualizationinfoState>(_VirtualizationinfoState_QNAME, VirtualizationinfoState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatchState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "patch_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<PatchState> createPatchState(PatchState value) {
        return new JAXBElement<PatchState>(_PatchState_QNAME, PatchState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "package_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<PackageTest> createPackageTest(PackageTest value) {
        return new JAXBElement<PackageTest>(_PackageTest_QNAME, PackageTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "package_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<PackageObject> createPackageObject(PackageObject value) {
        return new JAXBElement<PackageObject>(_PackageObject_QNAME, PackageObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageavoidlistTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "packageavoidlist_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<PackageavoidlistTest> createPackageavoidlistTest(PackageavoidlistTest value) {
        return new JAXBElement<PackageavoidlistTest>(_PackageavoidlistTest_QNAME, PackageavoidlistTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmfTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "smf_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<SmfTest> createSmfTest(SmfTest value) {
        return new JAXBElement<SmfTest>(_SmfTest_QNAME, SmfTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariantState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "variant_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<VariantState> createVariantState(VariantState value) {
        return new JAXBElement<VariantState>(_VariantState_QNAME, VariantState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NddTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "ndd_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<NddTest> createNddTest(NddTest value) {
        return new JAXBElement<NddTest>(_NddTest_QNAME, NddTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirtualizationinfoObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "virtualizationinfo_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<VirtualizationinfoObject> createVirtualizationinfoObject(VirtualizationinfoObject value) {
        return new JAXBElement<VirtualizationinfoObject>(_VirtualizationinfoObject_QNAME, VirtualizationinfoObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagefreezelistTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "packagefreezelist_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<PackagefreezelistTest> createPackagefreezelistTest(PackagefreezelistTest value) {
        return new JAXBElement<PackagefreezelistTest>(_PackagefreezelistTest_QNAME, PackagefreezelistTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacetObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "facet_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<FacetObject> createFacetObject(FacetObject value) {
        return new JAXBElement<FacetObject>(_FacetObject_QNAME, FacetObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsainfoState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "isainfo_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<IsainfoState> createIsainfoState(IsainfoState value) {
        return new JAXBElement<IsainfoState>(_IsainfoState_QNAME, IsainfoState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatchObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "patch_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<PatchObject> createPatchObject(PatchObject value) {
        return new JAXBElement<PatchObject>(_PatchObject_QNAME, PatchObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Package511State }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "package511_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<Package511State> createPackage511State(Package511State value) {
        return new JAXBElement<Package511State>(_Package511State_QNAME, Package511State.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagecheckObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "packagecheck_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<PackagecheckObject> createPackagecheckObject(PackagecheckObject value) {
        return new JAXBElement<PackagecheckObject>(_PackagecheckObject_QNAME, PackagecheckObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "image_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<ImageState> createImageState(ImageState value) {
        return new JAXBElement<ImageState>(_ImageState_QNAME, ImageState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "image_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<ImageTest> createImageTest(ImageTest value) {
        return new JAXBElement<ImageTest>(_ImageTest_QNAME, ImageTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatchTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "patch_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<PatchTest> createPatchTest(PatchTest value) {
        return new JAXBElement<PatchTest>(_PatchTest_QNAME, PatchTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacetState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "facet_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<FacetState> createFacetState(FacetState value) {
        return new JAXBElement<FacetState>(_FacetState_QNAME, FacetState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagepublisherState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "packagepublisher_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<PackagepublisherState> createPackagepublisherState(PackagepublisherState value) {
        return new JAXBElement<PackagepublisherState>(_PackagepublisherState_QNAME, PackagepublisherState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "image_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<ImageObject> createImageObject(ImageObject value) {
        return new JAXBElement<ImageObject>(_ImageObject_QNAME, ImageObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariantObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "variant_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<VariantObject> createVariantObject(VariantObject value) {
        return new JAXBElement<VariantObject>(_VariantObject_QNAME, VariantObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Patch54Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "patch54_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<Patch54Object> createPatch54Object(Patch54Object value) {
        return new JAXBElement<Patch54Object>(_Patch54Object_QNAME, Patch54Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "version", scope = Patch54Object.class)
    public JAXBElement<EntityObjectIntType> createPatch54ObjectVersion(EntityObjectIntType value) {
        return new JAXBElement<EntityObjectIntType>(_Patch54ObjectVersion_QNAME, EntityObjectIntType.class, Patch54Object.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "base", scope = Patch54Object.class)
    public JAXBElement<EntityObjectIntType> createPatch54ObjectBase(EntityObjectIntType value) {
        return new JAXBElement<EntityObjectIntType>(_Patch54ObjectBase_QNAME, EntityObjectIntType.class, Patch54Object.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatchBehaviors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "behaviors", scope = Patch54Object.class)
    public JAXBElement<PatchBehaviors> createPatch54ObjectBehaviors(PatchBehaviors value) {
        return new JAXBElement<PatchBehaviors>(_Patch54ObjectBehaviors_QNAME, PatchBehaviors.class, Patch54Object.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "name", scope = Package511Object.class)
    public JAXBElement<EntityObjectStringType> createPackage511ObjectName(EntityObjectStringType value) {
        return new JAXBElement<EntityObjectStringType>(_Package511ObjectName_QNAME, EntityObjectStringType.class, Package511Object.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "publisher", scope = Package511Object.class)
    public JAXBElement<EntityObjectStringType> createPackage511ObjectPublisher(EntityObjectStringType value) {
        return new JAXBElement<EntityObjectStringType>(_Package511ObjectPublisher_QNAME, EntityObjectStringType.class, Package511Object.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectVersionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "version", scope = Package511Object.class)
    public JAXBElement<EntityObjectVersionType> createPackage511ObjectVersion(EntityObjectVersionType value) {
        return new JAXBElement<EntityObjectVersionType>(_Patch54ObjectVersion_QNAME, EntityObjectVersionType.class, Package511Object.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "timestamp", scope = Package511Object.class)
    public JAXBElement<EntityObjectStringType> createPackage511ObjectTimestamp(EntityObjectStringType value) {
        return new JAXBElement<EntityObjectStringType>(_Package511ObjectTimestamp_QNAME, EntityObjectStringType.class, Package511Object.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "version", scope = PatchState.class)
    public JAXBElement<EntityStateIntType> createPatchStateVersion(EntityStateIntType value) {
        return new JAXBElement<EntityStateIntType>(_Patch54ObjectVersion_QNAME, EntityStateIntType.class, PatchState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "base", scope = PatchState.class)
    public JAXBElement<EntityStateIntType> createPatchStateBase(EntityStateIntType value) {
        return new JAXBElement<EntityStateIntType>(_Patch54ObjectBase_QNAME, EntityStateIntType.class, PatchState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "name", scope = Package511State.class)
    public JAXBElement<EntityStateStringType> createPackage511StateName(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_Package511ObjectName_QNAME, EntityStateStringType.class, Package511State.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "publisher", scope = Package511State.class)
    public JAXBElement<EntityStateStringType> createPackage511StatePublisher(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_Package511ObjectPublisher_QNAME, EntityStateStringType.class, Package511State.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "description", scope = Package511State.class)
    public JAXBElement<EntityStateStringType> createPackage511StateDescription(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_Package511StateDescription_QNAME, EntityStateStringType.class, Package511State.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "category", scope = Package511State.class)
    public JAXBElement<EntityStateStringType> createPackage511StateCategory(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_Package511StateCategory_QNAME, EntityStateStringType.class, Package511State.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateVersionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "version", scope = Package511State.class)
    public JAXBElement<EntityStateVersionType> createPackage511StateVersion(EntityStateVersionType value) {
        return new JAXBElement<EntityStateVersionType>(_Patch54ObjectVersion_QNAME, EntityStateVersionType.class, Package511State.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "fmri", scope = Package511State.class)
    public JAXBElement<EntityStateStringType> createPackage511StateFmri(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_Package511StateFmri_QNAME, EntityStateStringType.class, Package511State.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "timestamp", scope = Package511State.class)
    public JAXBElement<EntityStateStringType> createPackage511StateTimestamp(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_Package511ObjectTimestamp_QNAME, EntityStateStringType.class, Package511State.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "summary", scope = Package511State.class)
    public JAXBElement<EntityStateStringType> createPackage511StateSummary(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_Package511StateSummary_QNAME, EntityStateStringType.class, Package511State.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateBoolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "updates_available", scope = Package511State.class)
    public JAXBElement<EntityStateBoolType> createPackage511StateUpdatesAvailable(EntityStateBoolType value) {
        return new JAXBElement<EntityStateBoolType>(_Package511StateUpdatesAvailable_QNAME, EntityStateBoolType.class, Package511State.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "name", scope = PackageState.class)
    public JAXBElement<EntityStateStringType> createPackageStateName(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_Package511ObjectName_QNAME, EntityStateStringType.class, PackageState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "description", scope = PackageState.class)
    public JAXBElement<EntityStateStringType> createPackageStateDescription(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_Package511StateDescription_QNAME, EntityStateStringType.class, PackageState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "category", scope = PackageState.class)
    public JAXBElement<EntityStateStringType> createPackageStateCategory(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_Package511StateCategory_QNAME, EntityStateStringType.class, PackageState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "version", scope = PackageState.class)
    public JAXBElement<EntityStateStringType> createPackageStateVersion(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_Patch54ObjectVersion_QNAME, EntityStateStringType.class, PackageState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "pkginst", scope = PackageState.class)
    public JAXBElement<EntityStateStringType> createPackageStatePkginst(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_PackageStatePkginst_QNAME, EntityStateStringType.class, PackageState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris", name = "vendor", scope = PackageState.class)
    public JAXBElement<EntityStateStringType> createPackageStateVendor(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_PackageStateVendor_QNAME, EntityStateStringType.class, PackageState.class, value);
    }

}
