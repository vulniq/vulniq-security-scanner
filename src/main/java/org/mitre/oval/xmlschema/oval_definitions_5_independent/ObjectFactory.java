


package org.mitre.oval.xmlschema.oval_definitions_5_independent;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateAnySimpleType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateRecordType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_definitions_5_independent package. 
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

    private final static QName _FilehashObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "filehash_object");
    private final static QName _Filehash58Test_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "filehash58_test");
    private final static QName _TextfilecontentTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "textfilecontent_test");
    private final static QName _SqlTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "sql_test");
    private final static QName _Textfilecontent54Object_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "textfilecontent54_object");
    private final static QName _FamilyObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "family_object");
    private final static QName _Filehash58State_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "filehash58_state");
    private final static QName _Textfilecontent54State_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "textfilecontent54_state");
    private final static QName _LdapObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "ldap_object");
    private final static QName _FilehashTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "filehash_test");
    private final static QName _VariableObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "variable_object");
    private final static QName _SqlObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "sql_object");
    private final static QName _XmlfilecontentObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "xmlfilecontent_object");
    private final static QName _Sql57Test_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "sql57_test");
    private final static QName _XmlfilecontentTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "xmlfilecontent_test");
    private final static QName _XmlfilecontentState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "xmlfilecontent_state");
    private final static QName _EnvironmentvariableObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "environmentvariable_object");
    private final static QName _EnvironmentvariableState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "environmentvariable_state");
    private final static QName _FilehashState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "filehash_state");
    private final static QName _TextfilecontentState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "textfilecontent_state");
    private final static QName _LdapTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "ldap_test");
    private final static QName _Filehash58Object_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "filehash58_object");
    private final static QName _LdapState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "ldap_state");
    private final static QName _Environmentvariable58Object_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "environmentvariable58_object");
    private final static QName _EnvironmentvariableTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "environmentvariable_test");
    private final static QName _Ldap57Test_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "ldap57_test");
    private final static QName _VariableState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "variable_state");
    private final static QName _Sql57Object_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "sql57_object");
    private final static QName _Environmentvariable58Test_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "environmentvariable58_test");
    private final static QName _Ldap57State_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "ldap57_state");
    private final static QName _FamilyTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "family_test");
    private final static QName _FamilyState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "family_state");
    private final static QName _Ldap57Object_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "ldap57_object");
    private final static QName _SqlState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "sql_state");
    private final static QName _Environmentvariable58State_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "environmentvariable58_state");
    private final static QName _VariableTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "variable_test");
    private final static QName _TextfilecontentObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "textfilecontent_object");
    private final static QName _Sql57State_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "sql57_state");
    private final static QName _Textfilecontent54Test_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "textfilecontent54_test");
    private final static QName _UnknownTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "unknown_test");
    private final static QName _Environmentvariable58ObjectPid_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "pid");
    private final static QName _SqlObjectVersion_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "version");
    private final static QName _SqlObjectConnectionString_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "connection_string");
    private final static QName _SqlObjectSql_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "sql");
    private final static QName _SqlObjectEngine_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "engine");
    private final static QName _Ldap57ObjectAttribute_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "attribute");
    private final static QName _Ldap57ObjectRelativeDn_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "relative_dn");
    private final static QName _Sql57StateResult_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", "result");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_definitions_5_independent
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Sql57State }
     * 
     */
    public Sql57State createSql57State() {
        return new Sql57State();
    }

    /**
     * Create an instance of {@link Filehash58Test }
     * 
     */
    public Filehash58Test createFilehash58Test() {
        return new Filehash58Test();
    }

    /**
     * Create an instance of {@link Ldap57Object }
     * 
     */
    public Ldap57Object createLdap57Object() {
        return new Ldap57Object();
    }

    /**
     * Create an instance of {@link VariableState }
     * 
     */
    public VariableState createVariableState() {
        return new VariableState();
    }

    /**
     * Create an instance of {@link FamilyState }
     * 
     */
    public FamilyState createFamilyState() {
        return new FamilyState();
    }

    /**
     * Create an instance of {@link LdapTest }
     * 
     */
    public LdapTest createLdapTest() {
        return new LdapTest();
    }

    /**
     * Create an instance of {@link SqlState }
     * 
     */
    public SqlState createSqlState() {
        return new SqlState();
    }

    /**
     * Create an instance of {@link Textfilecontent54Object }
     * 
     */
    public Textfilecontent54Object createTextfilecontent54Object() {
        return new Textfilecontent54Object();
    }

    /**
     * Create an instance of {@link EnvironmentvariableTest }
     * 
     */
    public EnvironmentvariableTest createEnvironmentvariableTest() {
        return new EnvironmentvariableTest();
    }

    /**
     * Create an instance of {@link VariableTest }
     * 
     */
    public VariableTest createVariableTest() {
        return new VariableTest();
    }

    /**
     * Create an instance of {@link Environmentvariable58Test }
     * 
     */
    public Environmentvariable58Test createEnvironmentvariable58Test() {
        return new Environmentvariable58Test();
    }

    /**
     * Create an instance of {@link XmlfilecontentObject }
     * 
     */
    public XmlfilecontentObject createXmlfilecontentObject() {
        return new XmlfilecontentObject();
    }

    /**
     * Create an instance of {@link LdapState }
     * 
     */
    public LdapState createLdapState() {
        return new LdapState();
    }

    /**
     * Create an instance of {@link Ldap57State }
     * 
     */
    public Ldap57State createLdap57State() {
        return new Ldap57State();
    }

    /**
     * Create an instance of {@link EnvironmentvariableState }
     * 
     */
    public EnvironmentvariableState createEnvironmentvariableState() {
        return new EnvironmentvariableState();
    }

    /**
     * Create an instance of {@link Sql57Object }
     * 
     */
    public Sql57Object createSql57Object() {
        return new Sql57Object();
    }

    /**
     * Create an instance of {@link Environmentvariable58Object }
     * 
     */
    public Environmentvariable58Object createEnvironmentvariable58Object() {
        return new Environmentvariable58Object();
    }

    /**
     * Create an instance of {@link XmlfilecontentState }
     * 
     */
    public XmlfilecontentState createXmlfilecontentState() {
        return new XmlfilecontentState();
    }

    /**
     * Create an instance of {@link EnvironmentvariableObject }
     * 
     */
    public EnvironmentvariableObject createEnvironmentvariableObject() {
        return new EnvironmentvariableObject();
    }

    /**
     * Create an instance of {@link LdapObject }
     * 
     */
    public LdapObject createLdapObject() {
        return new LdapObject();
    }

    /**
     * Create an instance of {@link Ldap57Test }
     * 
     */
    public Ldap57Test createLdap57Test() {
        return new Ldap57Test();
    }

    /**
     * Create an instance of {@link FilehashTest }
     * 
     */
    public FilehashTest createFilehashTest() {
        return new FilehashTest();
    }

    /**
     * Create an instance of {@link Filehash58Object }
     * 
     */
    public Filehash58Object createFilehash58Object() {
        return new Filehash58Object();
    }

    /**
     * Create an instance of {@link TextfilecontentTest }
     * 
     */
    public TextfilecontentTest createTextfilecontentTest() {
        return new TextfilecontentTest();
    }

    /**
     * Create an instance of {@link Filehash58State }
     * 
     */
    public Filehash58State createFilehash58State() {
        return new Filehash58State();
    }

    /**
     * Create an instance of {@link SqlTest }
     * 
     */
    public SqlTest createSqlTest() {
        return new SqlTest();
    }

    /**
     * Create an instance of {@link TextfilecontentObject }
     * 
     */
    public TextfilecontentObject createTextfilecontentObject() {
        return new TextfilecontentObject();
    }

    /**
     * Create an instance of {@link Sql57Test }
     * 
     */
    public Sql57Test createSql57Test() {
        return new Sql57Test();
    }

    /**
     * Create an instance of {@link TextfilecontentState }
     * 
     */
    public TextfilecontentState createTextfilecontentState() {
        return new TextfilecontentState();
    }

    /**
     * Create an instance of {@link VariableObject }
     * 
     */
    public VariableObject createVariableObject() {
        return new VariableObject();
    }

    /**
     * Create an instance of {@link FilehashObject }
     * 
     */
    public FilehashObject createFilehashObject() {
        return new FilehashObject();
    }

    /**
     * Create an instance of {@link SqlObject }
     * 
     */
    public SqlObject createSqlObject() {
        return new SqlObject();
    }

    /**
     * Create an instance of {@link XmlfilecontentTest }
     * 
     */
    public XmlfilecontentTest createXmlfilecontentTest() {
        return new XmlfilecontentTest();
    }

    /**
     * Create an instance of {@link FamilyTest }
     * 
     */
    public FamilyTest createFamilyTest() {
        return new FamilyTest();
    }

    /**
     * Create an instance of {@link Textfilecontent54Test }
     * 
     */
    public Textfilecontent54Test createTextfilecontent54Test() {
        return new Textfilecontent54Test();
    }

    /**
     * Create an instance of {@link Environmentvariable58State }
     * 
     */
    public Environmentvariable58State createEnvironmentvariable58State() {
        return new Environmentvariable58State();
    }

    /**
     * Create an instance of {@link Textfilecontent54State }
     * 
     */
    public Textfilecontent54State createTextfilecontent54State() {
        return new Textfilecontent54State();
    }

    /**
     * Create an instance of {@link UnknownTest }
     * 
     */
    public UnknownTest createUnknownTest() {
        return new UnknownTest();
    }

    /**
     * Create an instance of {@link FamilyObject }
     * 
     */
    public FamilyObject createFamilyObject() {
        return new FamilyObject();
    }

    /**
     * Create an instance of {@link FilehashState }
     * 
     */
    public FilehashState createFilehashState() {
        return new FilehashState();
    }

    /**
     * Create an instance of {@link EntityStateHashTypeType }
     * 
     */
    public EntityStateHashTypeType createEntityStateHashTypeType() {
        return new EntityStateHashTypeType();
    }

    /**
     * Create an instance of {@link EntityStateWindowsViewType }
     * 
     */
    public EntityStateWindowsViewType createEntityStateWindowsViewType() {
        return new EntityStateWindowsViewType();
    }

    /**
     * Create an instance of {@link EntityStateFamilyType }
     * 
     */
    public EntityStateFamilyType createEntityStateFamilyType() {
        return new EntityStateFamilyType();
    }

    /**
     * Create an instance of {@link EntityObjectVariableRefType }
     * 
     */
    public EntityObjectVariableRefType createEntityObjectVariableRefType() {
        return new EntityObjectVariableRefType();
    }

    /**
     * Create an instance of {@link LdapBehaviors }
     * 
     */
    public LdapBehaviors createLdapBehaviors() {
        return new LdapBehaviors();
    }

    /**
     * Create an instance of {@link EntityStateVariableRefType }
     * 
     */
    public EntityStateVariableRefType createEntityStateVariableRefType() {
        return new EntityStateVariableRefType();
    }

    /**
     * Create an instance of {@link Textfilecontent54Behaviors }
     * 
     */
    public Textfilecontent54Behaviors createTextfilecontent54Behaviors() {
        return new Textfilecontent54Behaviors();
    }

    /**
     * Create an instance of {@link FileBehaviors }
     * 
     */
    public FileBehaviors createFileBehaviors() {
        return new FileBehaviors();
    }

    /**
     * Create an instance of {@link EntityObjectEngineType }
     * 
     */
    public EntityObjectEngineType createEntityObjectEngineType() {
        return new EntityObjectEngineType();
    }

    /**
     * Create an instance of {@link EntityStateEngineType }
     * 
     */
    public EntityStateEngineType createEntityStateEngineType() {
        return new EntityStateEngineType();
    }

    /**
     * Create an instance of {@link EntityObjectHashTypeType }
     * 
     */
    public EntityObjectHashTypeType createEntityObjectHashTypeType() {
        return new EntityObjectHashTypeType();
    }

    /**
     * Create an instance of {@link EntityStateLdaptypeType }
     * 
     */
    public EntityStateLdaptypeType createEntityStateLdaptypeType() {
        return new EntityStateLdaptypeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilehashObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "filehash_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<FilehashObject> createFilehashObject(FilehashObject value) {
        return new JAXBElement<FilehashObject>(_FilehashObject_QNAME, FilehashObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filehash58Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "filehash58_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<Filehash58Test> createFilehash58Test(Filehash58Test value) {
        return new JAXBElement<Filehash58Test>(_Filehash58Test_QNAME, Filehash58Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextfilecontentTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "textfilecontent_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<TextfilecontentTest> createTextfilecontentTest(TextfilecontentTest value) {
        return new JAXBElement<TextfilecontentTest>(_TextfilecontentTest_QNAME, TextfilecontentTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SqlTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "sql_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<SqlTest> createSqlTest(SqlTest value) {
        return new JAXBElement<SqlTest>(_SqlTest_QNAME, SqlTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Textfilecontent54Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "textfilecontent54_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<Textfilecontent54Object> createTextfilecontent54Object(Textfilecontent54Object value) {
        return new JAXBElement<Textfilecontent54Object>(_Textfilecontent54Object_QNAME, Textfilecontent54Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FamilyObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "family_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<FamilyObject> createFamilyObject(FamilyObject value) {
        return new JAXBElement<FamilyObject>(_FamilyObject_QNAME, FamilyObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filehash58State }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "filehash58_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<Filehash58State> createFilehash58State(Filehash58State value) {
        return new JAXBElement<Filehash58State>(_Filehash58State_QNAME, Filehash58State.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Textfilecontent54State }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "textfilecontent54_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<Textfilecontent54State> createTextfilecontent54State(Textfilecontent54State value) {
        return new JAXBElement<Textfilecontent54State>(_Textfilecontent54State_QNAME, Textfilecontent54State.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LdapObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "ldap_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<LdapObject> createLdapObject(LdapObject value) {
        return new JAXBElement<LdapObject>(_LdapObject_QNAME, LdapObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilehashTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "filehash_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<FilehashTest> createFilehashTest(FilehashTest value) {
        return new JAXBElement<FilehashTest>(_FilehashTest_QNAME, FilehashTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "variable_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<VariableObject> createVariableObject(VariableObject value) {
        return new JAXBElement<VariableObject>(_VariableObject_QNAME, VariableObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SqlObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "sql_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<SqlObject> createSqlObject(SqlObject value) {
        return new JAXBElement<SqlObject>(_SqlObject_QNAME, SqlObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlfilecontentObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "xmlfilecontent_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<XmlfilecontentObject> createXmlfilecontentObject(XmlfilecontentObject value) {
        return new JAXBElement<XmlfilecontentObject>(_XmlfilecontentObject_QNAME, XmlfilecontentObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sql57Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "sql57_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<Sql57Test> createSql57Test(Sql57Test value) {
        return new JAXBElement<Sql57Test>(_Sql57Test_QNAME, Sql57Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlfilecontentTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "xmlfilecontent_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<XmlfilecontentTest> createXmlfilecontentTest(XmlfilecontentTest value) {
        return new JAXBElement<XmlfilecontentTest>(_XmlfilecontentTest_QNAME, XmlfilecontentTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlfilecontentState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "xmlfilecontent_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<XmlfilecontentState> createXmlfilecontentState(XmlfilecontentState value) {
        return new JAXBElement<XmlfilecontentState>(_XmlfilecontentState_QNAME, XmlfilecontentState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentvariableObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "environmentvariable_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<EnvironmentvariableObject> createEnvironmentvariableObject(EnvironmentvariableObject value) {
        return new JAXBElement<EnvironmentvariableObject>(_EnvironmentvariableObject_QNAME, EnvironmentvariableObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentvariableState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "environmentvariable_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<EnvironmentvariableState> createEnvironmentvariableState(EnvironmentvariableState value) {
        return new JAXBElement<EnvironmentvariableState>(_EnvironmentvariableState_QNAME, EnvironmentvariableState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilehashState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "filehash_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<FilehashState> createFilehashState(FilehashState value) {
        return new JAXBElement<FilehashState>(_FilehashState_QNAME, FilehashState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextfilecontentState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "textfilecontent_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<TextfilecontentState> createTextfilecontentState(TextfilecontentState value) {
        return new JAXBElement<TextfilecontentState>(_TextfilecontentState_QNAME, TextfilecontentState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LdapTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "ldap_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<LdapTest> createLdapTest(LdapTest value) {
        return new JAXBElement<LdapTest>(_LdapTest_QNAME, LdapTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filehash58Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "filehash58_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<Filehash58Object> createFilehash58Object(Filehash58Object value) {
        return new JAXBElement<Filehash58Object>(_Filehash58Object_QNAME, Filehash58Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LdapState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "ldap_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<LdapState> createLdapState(LdapState value) {
        return new JAXBElement<LdapState>(_LdapState_QNAME, LdapState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Environmentvariable58Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "environmentvariable58_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<Environmentvariable58Object> createEnvironmentvariable58Object(Environmentvariable58Object value) {
        return new JAXBElement<Environmentvariable58Object>(_Environmentvariable58Object_QNAME, Environmentvariable58Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentvariableTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "environmentvariable_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<EnvironmentvariableTest> createEnvironmentvariableTest(EnvironmentvariableTest value) {
        return new JAXBElement<EnvironmentvariableTest>(_EnvironmentvariableTest_QNAME, EnvironmentvariableTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ldap57Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "ldap57_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<Ldap57Test> createLdap57Test(Ldap57Test value) {
        return new JAXBElement<Ldap57Test>(_Ldap57Test_QNAME, Ldap57Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "variable_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<VariableState> createVariableState(VariableState value) {
        return new JAXBElement<VariableState>(_VariableState_QNAME, VariableState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sql57Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "sql57_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<Sql57Object> createSql57Object(Sql57Object value) {
        return new JAXBElement<Sql57Object>(_Sql57Object_QNAME, Sql57Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Environmentvariable58Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "environmentvariable58_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<Environmentvariable58Test> createEnvironmentvariable58Test(Environmentvariable58Test value) {
        return new JAXBElement<Environmentvariable58Test>(_Environmentvariable58Test_QNAME, Environmentvariable58Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ldap57State }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "ldap57_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<Ldap57State> createLdap57State(Ldap57State value) {
        return new JAXBElement<Ldap57State>(_Ldap57State_QNAME, Ldap57State.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FamilyTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "family_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<FamilyTest> createFamilyTest(FamilyTest value) {
        return new JAXBElement<FamilyTest>(_FamilyTest_QNAME, FamilyTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FamilyState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "family_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<FamilyState> createFamilyState(FamilyState value) {
        return new JAXBElement<FamilyState>(_FamilyState_QNAME, FamilyState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ldap57Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "ldap57_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<Ldap57Object> createLdap57Object(Ldap57Object value) {
        return new JAXBElement<Ldap57Object>(_Ldap57Object_QNAME, Ldap57Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SqlState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "sql_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<SqlState> createSqlState(SqlState value) {
        return new JAXBElement<SqlState>(_SqlState_QNAME, SqlState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Environmentvariable58State }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "environmentvariable58_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<Environmentvariable58State> createEnvironmentvariable58State(Environmentvariable58State value) {
        return new JAXBElement<Environmentvariable58State>(_Environmentvariable58State_QNAME, Environmentvariable58State.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "variable_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<VariableTest> createVariableTest(VariableTest value) {
        return new JAXBElement<VariableTest>(_VariableTest_QNAME, VariableTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextfilecontentObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "textfilecontent_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<TextfilecontentObject> createTextfilecontentObject(TextfilecontentObject value) {
        return new JAXBElement<TextfilecontentObject>(_TextfilecontentObject_QNAME, TextfilecontentObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sql57State }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "sql57_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<Sql57State> createSql57State(Sql57State value) {
        return new JAXBElement<Sql57State>(_Sql57State_QNAME, Sql57State.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Textfilecontent54Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "textfilecontent54_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<Textfilecontent54Test> createTextfilecontent54Test(Textfilecontent54Test value) {
        return new JAXBElement<Textfilecontent54Test>(_Textfilecontent54Test_QNAME, Textfilecontent54Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "unknown_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<UnknownTest> createUnknownTest(UnknownTest value) {
        return new JAXBElement<UnknownTest>(_UnknownTest_QNAME, UnknownTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "pid", scope = Environmentvariable58Object.class)
    public JAXBElement<EntityObjectIntType> createEnvironmentvariable58ObjectPid(EntityObjectIntType value) {
        return new JAXBElement<EntityObjectIntType>(_Environmentvariable58ObjectPid_QNAME, EntityObjectIntType.class, Environmentvariable58Object.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "version", scope = SqlObject.class)
    public JAXBElement<EntityObjectStringType> createSqlObjectVersion(EntityObjectStringType value) {
        return new JAXBElement<EntityObjectStringType>(_SqlObjectVersion_QNAME, EntityObjectStringType.class, SqlObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "connection_string", scope = SqlObject.class)
    public JAXBElement<EntityObjectStringType> createSqlObjectConnectionString(EntityObjectStringType value) {
        return new JAXBElement<EntityObjectStringType>(_SqlObjectConnectionString_QNAME, EntityObjectStringType.class, SqlObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "sql", scope = SqlObject.class)
    public JAXBElement<EntityObjectStringType> createSqlObjectSql(EntityObjectStringType value) {
        return new JAXBElement<EntityObjectStringType>(_SqlObjectSql_QNAME, EntityObjectStringType.class, SqlObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectEngineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "engine", scope = SqlObject.class)
    public JAXBElement<EntityObjectEngineType> createSqlObjectEngine(EntityObjectEngineType value) {
        return new JAXBElement<EntityObjectEngineType>(_SqlObjectEngine_QNAME, EntityObjectEngineType.class, SqlObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "attribute", scope = Ldap57Object.class)
    public JAXBElement<EntityObjectStringType> createLdap57ObjectAttribute(EntityObjectStringType value) {
        return new JAXBElement<EntityObjectStringType>(_Ldap57ObjectAttribute_QNAME, EntityObjectStringType.class, Ldap57Object.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "relative_dn", scope = Ldap57Object.class)
    public JAXBElement<EntityObjectStringType> createLdap57ObjectRelativeDn(EntityObjectStringType value) {
        return new JAXBElement<EntityObjectStringType>(_Ldap57ObjectRelativeDn_QNAME, EntityObjectStringType.class, Ldap57Object.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "attribute", scope = LdapObject.class)
    public JAXBElement<EntityObjectStringType> createLdapObjectAttribute(EntityObjectStringType value) {
        return new JAXBElement<EntityObjectStringType>(_Ldap57ObjectAttribute_QNAME, EntityObjectStringType.class, LdapObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "relative_dn", scope = LdapObject.class)
    public JAXBElement<EntityObjectStringType> createLdapObjectRelativeDn(EntityObjectStringType value) {
        return new JAXBElement<EntityObjectStringType>(_Ldap57ObjectRelativeDn_QNAME, EntityObjectStringType.class, LdapObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "version", scope = Sql57Object.class)
    public JAXBElement<EntityObjectStringType> createSql57ObjectVersion(EntityObjectStringType value) {
        return new JAXBElement<EntityObjectStringType>(_SqlObjectVersion_QNAME, EntityObjectStringType.class, Sql57Object.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "connection_string", scope = Sql57Object.class)
    public JAXBElement<EntityObjectStringType> createSql57ObjectConnectionString(EntityObjectStringType value) {
        return new JAXBElement<EntityObjectStringType>(_SqlObjectConnectionString_QNAME, EntityObjectStringType.class, Sql57Object.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "sql", scope = Sql57Object.class)
    public JAXBElement<EntityObjectStringType> createSql57ObjectSql(EntityObjectStringType value) {
        return new JAXBElement<EntityObjectStringType>(_SqlObjectSql_QNAME, EntityObjectStringType.class, Sql57Object.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectEngineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "engine", scope = Sql57Object.class)
    public JAXBElement<EntityObjectEngineType> createSql57ObjectEngine(EntityObjectEngineType value) {
        return new JAXBElement<EntityObjectEngineType>(_SqlObjectEngine_QNAME, EntityObjectEngineType.class, Sql57Object.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "version", scope = Sql57State.class)
    public JAXBElement<EntityStateStringType> createSql57StateVersion(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SqlObjectVersion_QNAME, EntityStateStringType.class, Sql57State.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "connection_string", scope = Sql57State.class)
    public JAXBElement<EntityStateStringType> createSql57StateConnectionString(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SqlObjectConnectionString_QNAME, EntityStateStringType.class, Sql57State.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "sql", scope = Sql57State.class)
    public JAXBElement<EntityStateStringType> createSql57StateSql(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SqlObjectSql_QNAME, EntityStateStringType.class, Sql57State.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateRecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "result", scope = Sql57State.class)
    public JAXBElement<EntityStateRecordType> createSql57StateResult(EntityStateRecordType value) {
        return new JAXBElement<EntityStateRecordType>(_Sql57StateResult_QNAME, EntityStateRecordType.class, Sql57State.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateEngineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "engine", scope = Sql57State.class)
    public JAXBElement<EntityStateEngineType> createSql57StateEngine(EntityStateEngineType value) {
        return new JAXBElement<EntityStateEngineType>(_SqlObjectEngine_QNAME, EntityStateEngineType.class, Sql57State.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "version", scope = SqlState.class)
    public JAXBElement<EntityStateStringType> createSqlStateVersion(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SqlObjectVersion_QNAME, EntityStateStringType.class, SqlState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "connection_string", scope = SqlState.class)
    public JAXBElement<EntityStateStringType> createSqlStateConnectionString(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SqlObjectConnectionString_QNAME, EntityStateStringType.class, SqlState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "sql", scope = SqlState.class)
    public JAXBElement<EntityStateStringType> createSqlStateSql(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_SqlObjectSql_QNAME, EntityStateStringType.class, SqlState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateAnySimpleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "result", scope = SqlState.class)
    public JAXBElement<EntityStateAnySimpleType> createSqlStateResult(EntityStateAnySimpleType value) {
        return new JAXBElement<EntityStateAnySimpleType>(_Sql57StateResult_QNAME, EntityStateAnySimpleType.class, SqlState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateEngineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", name = "engine", scope = SqlState.class)
    public JAXBElement<EntityStateEngineType> createSqlStateEngine(EntityStateEngineType value) {
        return new JAXBElement<EntityStateEngineType>(_SqlObjectEngine_QNAME, EntityStateEngineType.class, SqlState.class, value);
    }

}
