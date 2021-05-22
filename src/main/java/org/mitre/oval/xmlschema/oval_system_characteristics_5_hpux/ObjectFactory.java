


package org.mitre.oval.xmlschema.oval_system_characteristics_5_hpux;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_system_characteristics_5_hpux package. 
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

    private final static QName _PatchItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux", "patch_item");
    private final static QName _SwlistItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux", "swlist_item");
    private final static QName _NddItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux", "ndd_item");
    private final static QName _GetconfItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux", "getconf_item");
    private final static QName _TrustedItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux", "trusted_item");
    private final static QName _GetconfItemPathname_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux", "pathname");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_system_characteristics_5_hpux
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SwlistItem }
     * 
     */
    public SwlistItem createSwlistItem() {
        return new SwlistItem();
    }

    /**
     * Create an instance of {@link GetconfItem }
     * 
     */
    public GetconfItem createGetconfItem() {
        return new GetconfItem();
    }

    /**
     * Create an instance of {@link NddItem }
     * 
     */
    public NddItem createNddItem() {
        return new NddItem();
    }

    /**
     * Create an instance of {@link TrustedItem }
     * 
     */
    public TrustedItem createTrustedItem() {
        return new TrustedItem();
    }

    /**
     * Create an instance of {@link PatchItem }
     * 
     */
    public PatchItem createPatchItem() {
        return new PatchItem();
    }

    /**
     * Create an instance of {@link SwlistItem.Version }
     * 
     */
    public SwlistItem.Version createSwlistItemVersion() {
        return new SwlistItem.Version();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatchItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux", name = "patch_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<PatchItem> createPatchItem(PatchItem value) {
        return new JAXBElement<PatchItem>(_PatchItem_QNAME, PatchItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SwlistItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux", name = "swlist_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SwlistItem> createSwlistItem(SwlistItem value) {
        return new JAXBElement<SwlistItem>(_SwlistItem_QNAME, SwlistItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NddItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux", name = "ndd_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<NddItem> createNddItem(NddItem value) {
        return new JAXBElement<NddItem>(_NddItem_QNAME, NddItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetconfItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux", name = "getconf_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<GetconfItem> createGetconfItem(GetconfItem value) {
        return new JAXBElement<GetconfItem>(_GetconfItem_QNAME, GetconfItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrustedItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux", name = "trusted_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<TrustedItem> createTrustedItem(TrustedItem value) {
        return new JAXBElement<TrustedItem>(_TrustedItem_QNAME, TrustedItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux", name = "pathname", scope = GetconfItem.class)
    public JAXBElement<EntityItemStringType> createGetconfItemPathname(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_GetconfItemPathname_QNAME, EntityItemStringType.class, GetconfItem.class, value);
    }

}
