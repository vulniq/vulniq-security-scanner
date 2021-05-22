


package org.mitre.oval.xmlschema.oval_definitions_5_netconf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_definitions_5_netconf package. 
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

    private final static QName _ConfigObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#netconf", "config_object");
    private final static QName _ConfigTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#netconf", "config_test");
    private final static QName _ConfigState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#netconf", "config_state");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_definitions_5_netconf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConfigTest }
     * 
     */
    public ConfigTest createConfigTest() {
        return new ConfigTest();
    }

    /**
     * Create an instance of {@link ConfigState }
     * 
     */
    public ConfigState createConfigState() {
        return new ConfigState();
    }

    /**
     * Create an instance of {@link ConfigObject }
     * 
     */
    public ConfigObject createConfigObject() {
        return new ConfigObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#netconf", name = "config_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<ConfigObject> createConfigObject(ConfigObject value) {
        return new JAXBElement<ConfigObject>(_ConfigObject_QNAME, ConfigObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#netconf", name = "config_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<ConfigTest> createConfigTest(ConfigTest value) {
        return new JAXBElement<ConfigTest>(_ConfigTest_QNAME, ConfigTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#netconf", name = "config_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<ConfigState> createConfigState(ConfigState value) {
        return new JAXBElement<ConfigState>(_ConfigState_QNAME, ConfigState.class, null, value);
    }

}
