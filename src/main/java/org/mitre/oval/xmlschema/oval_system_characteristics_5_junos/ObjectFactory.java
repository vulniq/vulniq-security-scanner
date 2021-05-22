


package org.mitre.oval.xmlschema.oval_system_characteristics_5_junos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_system_characteristics_5_junos package. 
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

    private final static QName _XmlConfigItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#junos", "xml_config_item");
    private final static QName _ShowItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#junos", "show_item");
    private final static QName _XmlShowItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#junos", "xml_show_item");
    private final static QName _VersionItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#junos", "version_item");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_system_characteristics_5_junos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VersionItem }
     * 
     */
    public VersionItem createVersionItem() {
        return new VersionItem();
    }

    /**
     * Create an instance of {@link XmlConfigItem }
     * 
     */
    public XmlConfigItem createXmlConfigItem() {
        return new XmlConfigItem();
    }

    /**
     * Create an instance of {@link ShowItem }
     * 
     */
    public ShowItem createShowItem() {
        return new ShowItem();
    }

    /**
     * Create an instance of {@link XmlShowItem }
     * 
     */
    public XmlShowItem createXmlShowItem() {
        return new XmlShowItem();
    }

    /**
     * Create an instance of {@link EntityItemJunosReleaseTypeType }
     * 
     */
    public EntityItemJunosReleaseTypeType createEntityItemJunosReleaseTypeType() {
        return new EntityItemJunosReleaseTypeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlConfigItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#junos", name = "xml_config_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<XmlConfigItem> createXmlConfigItem(XmlConfigItem value) {
        return new JAXBElement<XmlConfigItem>(_XmlConfigItem_QNAME, XmlConfigItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#junos", name = "show_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<ShowItem> createShowItem(ShowItem value) {
        return new JAXBElement<ShowItem>(_ShowItem_QNAME, ShowItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlShowItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#junos", name = "xml_show_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<XmlShowItem> createXmlShowItem(XmlShowItem value) {
        return new JAXBElement<XmlShowItem>(_XmlShowItem_QNAME, XmlShowItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#junos", name = "version_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<VersionItem> createVersionItem(VersionItem value) {
        return new JAXBElement<VersionItem>(_VersionItem_QNAME, VersionItem.class, null, value);
    }

}
