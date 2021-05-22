


package org.mitre.oval.xmlschema.oval_definitions_5_apple_ios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateRecordType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_definitions_5_apple_ios package. 
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

    private final static QName _PasscodepolicyObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "passcodepolicy_object");
    private final static QName _PasscodepolicyState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "passcodepolicy_state");
    private final static QName _ProfileTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "profile_test");
    private final static QName _GlobalrestrictionsTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "globalrestrictions_test");
    private final static QName _GlobalrestrictionsObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "globalrestrictions_object");
    private final static QName _ProfileState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "profile_state");
    private final static QName _PasscodepolicyTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "passcodepolicy_test");
    private final static QName _GlobalrestrictionsState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "globalrestrictions_state");
    private final static QName _ProfileObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "profile_object");
    private final static QName _ProfileStateHasRemovalPasscode_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "has_removal_passcode");
    private final static QName _ProfileStateDescription_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "description");
    private final static QName _ProfileStateDisplayName_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "display_name");
    private final static QName _ProfileStateRemovalDisallowed_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "removal_disallowed");
    private final static QName _ProfileStateUuid_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "uuid");
    private final static QName _ProfileStateVersion_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "version");
    private final static QName _ProfileStateIdentifier_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "identifier");
    private final static QName _ProfileStateIsEncrypted_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "is_encrypted");
    private final static QName _ProfileStatePayload_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "payload");
    private final static QName _ProfileStateOrganization_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", "organization");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_definitions_5_apple_ios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GlobalrestrictionsObject }
     * 
     */
    public GlobalrestrictionsObject createGlobalrestrictionsObject() {
        return new GlobalrestrictionsObject();
    }

    /**
     * Create an instance of {@link GlobalrestrictionsState }
     * 
     */
    public GlobalrestrictionsState createGlobalrestrictionsState() {
        return new GlobalrestrictionsState();
    }

    /**
     * Create an instance of {@link PasscodepolicyState }
     * 
     */
    public PasscodepolicyState createPasscodepolicyState() {
        return new PasscodepolicyState();
    }

    /**
     * Create an instance of {@link ProfileState }
     * 
     */
    public ProfileState createProfileState() {
        return new ProfileState();
    }

    /**
     * Create an instance of {@link PasscodepolicyTest }
     * 
     */
    public PasscodepolicyTest createPasscodepolicyTest() {
        return new PasscodepolicyTest();
    }

    /**
     * Create an instance of {@link GlobalrestrictionsTest }
     * 
     */
    public GlobalrestrictionsTest createGlobalrestrictionsTest() {
        return new GlobalrestrictionsTest();
    }

    /**
     * Create an instance of {@link ProfileObject }
     * 
     */
    public ProfileObject createProfileObject() {
        return new ProfileObject();
    }

    /**
     * Create an instance of {@link ProfileTest }
     * 
     */
    public ProfileTest createProfileTest() {
        return new ProfileTest();
    }

    /**
     * Create an instance of {@link PasscodepolicyObject }
     * 
     */
    public PasscodepolicyObject createPasscodepolicyObject() {
        return new PasscodepolicyObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasscodepolicyObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "passcodepolicy_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<PasscodepolicyObject> createPasscodepolicyObject(PasscodepolicyObject value) {
        return new JAXBElement<PasscodepolicyObject>(_PasscodepolicyObject_QNAME, PasscodepolicyObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasscodepolicyState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "passcodepolicy_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<PasscodepolicyState> createPasscodepolicyState(PasscodepolicyState value) {
        return new JAXBElement<PasscodepolicyState>(_PasscodepolicyState_QNAME, PasscodepolicyState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "profile_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<ProfileTest> createProfileTest(ProfileTest value) {
        return new JAXBElement<ProfileTest>(_ProfileTest_QNAME, ProfileTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalrestrictionsTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "globalrestrictions_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<GlobalrestrictionsTest> createGlobalrestrictionsTest(GlobalrestrictionsTest value) {
        return new JAXBElement<GlobalrestrictionsTest>(_GlobalrestrictionsTest_QNAME, GlobalrestrictionsTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalrestrictionsObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "globalrestrictions_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<GlobalrestrictionsObject> createGlobalrestrictionsObject(GlobalrestrictionsObject value) {
        return new JAXBElement<GlobalrestrictionsObject>(_GlobalrestrictionsObject_QNAME, GlobalrestrictionsObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "profile_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<ProfileState> createProfileState(ProfileState value) {
        return new JAXBElement<ProfileState>(_ProfileState_QNAME, ProfileState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasscodepolicyTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "passcodepolicy_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<PasscodepolicyTest> createPasscodepolicyTest(PasscodepolicyTest value) {
        return new JAXBElement<PasscodepolicyTest>(_PasscodepolicyTest_QNAME, PasscodepolicyTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalrestrictionsState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "globalrestrictions_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<GlobalrestrictionsState> createGlobalrestrictionsState(GlobalrestrictionsState value) {
        return new JAXBElement<GlobalrestrictionsState>(_GlobalrestrictionsState_QNAME, GlobalrestrictionsState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "profile_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<ProfileObject> createProfileObject(ProfileObject value) {
        return new JAXBElement<ProfileObject>(_ProfileObject_QNAME, ProfileObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateBoolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "has_removal_passcode", scope = ProfileState.class)
    public JAXBElement<EntityStateBoolType> createProfileStateHasRemovalPasscode(EntityStateBoolType value) {
        return new JAXBElement<EntityStateBoolType>(_ProfileStateHasRemovalPasscode_QNAME, EntityStateBoolType.class, ProfileState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "description", scope = ProfileState.class)
    public JAXBElement<EntityStateStringType> createProfileStateDescription(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_ProfileStateDescription_QNAME, EntityStateStringType.class, ProfileState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "display_name", scope = ProfileState.class)
    public JAXBElement<EntityStateStringType> createProfileStateDisplayName(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_ProfileStateDisplayName_QNAME, EntityStateStringType.class, ProfileState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateBoolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "removal_disallowed", scope = ProfileState.class)
    public JAXBElement<EntityStateBoolType> createProfileStateRemovalDisallowed(EntityStateBoolType value) {
        return new JAXBElement<EntityStateBoolType>(_ProfileStateRemovalDisallowed_QNAME, EntityStateBoolType.class, ProfileState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "uuid", scope = ProfileState.class)
    public JAXBElement<EntityStateStringType> createProfileStateUuid(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_ProfileStateUuid_QNAME, EntityStateStringType.class, ProfileState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "version", scope = ProfileState.class)
    public JAXBElement<EntityStateIntType> createProfileStateVersion(EntityStateIntType value) {
        return new JAXBElement<EntityStateIntType>(_ProfileStateVersion_QNAME, EntityStateIntType.class, ProfileState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "identifier", scope = ProfileState.class)
    public JAXBElement<EntityStateStringType> createProfileStateIdentifier(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_ProfileStateIdentifier_QNAME, EntityStateStringType.class, ProfileState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateBoolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "is_encrypted", scope = ProfileState.class)
    public JAXBElement<EntityStateBoolType> createProfileStateIsEncrypted(EntityStateBoolType value) {
        return new JAXBElement<EntityStateBoolType>(_ProfileStateIsEncrypted_QNAME, EntityStateBoolType.class, ProfileState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateRecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "payload", scope = ProfileState.class)
    public JAXBElement<EntityStateRecordType> createProfileStatePayload(EntityStateRecordType value) {
        return new JAXBElement<EntityStateRecordType>(_ProfileStatePayload_QNAME, EntityStateRecordType.class, ProfileState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", name = "organization", scope = ProfileState.class)
    public JAXBElement<EntityStateStringType> createProfileStateOrganization(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_ProfileStateOrganization_QNAME, EntityStateStringType.class, ProfileState.class, value);
    }

}
