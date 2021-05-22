


package org.mitre.oval.xmlschema.oval_system_characteristics_5_apple_ios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_system_characteristics_5_apple_ios package. 
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

    private final static QName _GlobalrestrictionsItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios", "globalrestrictions_item");
    private final static QName _ProfileItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios", "profile_item");
    private final static QName _PasscodepolicyItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios", "passcodepolicy_item");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_system_characteristics_5_apple_ios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GlobalrestrictionsItem }
     * 
     */
    public GlobalrestrictionsItem createGlobalrestrictionsItem() {
        return new GlobalrestrictionsItem();
    }

    /**
     * Create an instance of {@link PasscodepolicyItem }
     * 
     */
    public PasscodepolicyItem createPasscodepolicyItem() {
        return new PasscodepolicyItem();
    }

    /**
     * Create an instance of {@link ProfileItem }
     * 
     */
    public ProfileItem createProfileItem() {
        return new ProfileItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalrestrictionsItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios", name = "globalrestrictions_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<GlobalrestrictionsItem> createGlobalrestrictionsItem(GlobalrestrictionsItem value) {
        return new JAXBElement<GlobalrestrictionsItem>(_GlobalrestrictionsItem_QNAME, GlobalrestrictionsItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios", name = "profile_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<ProfileItem> createProfileItem(ProfileItem value) {
        return new JAXBElement<ProfileItem>(_ProfileItem_QNAME, ProfileItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasscodepolicyItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios", name = "passcodepolicy_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<PasscodepolicyItem> createPasscodepolicyItem(PasscodepolicyItem value) {
        return new JAXBElement<PasscodepolicyItem>(_PasscodepolicyItem_QNAME, PasscodepolicyItem.class, null, value);
    }

}
