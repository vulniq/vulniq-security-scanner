
package org.mitre.oval.xmlschema.oval_system_characteristics_5_catos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_system_characteristics_5_catos package. 
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

    private final static QName _VersionItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos", "version_item");
    private final static QName _LineItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos", "line_item");
    private final static QName _ModuleItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos", "module_item");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_system_characteristics_5_catos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LineItem }
     * 
     */
    public LineItem createLineItem() {
        return new LineItem();
    }

    /**
     * Create an instance of {@link ModuleItem }
     * 
     */
    public ModuleItem createModuleItem() {
        return new ModuleItem();
    }

    /**
     * Create an instance of {@link VersionItem }
     * 
     */
    public VersionItem createVersionItem() {
        return new VersionItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos", name = "version_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<VersionItem> createVersionItem(VersionItem value) {
        return new JAXBElement<VersionItem>(_VersionItem_QNAME, VersionItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos", name = "line_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<LineItem> createLineItem(LineItem value) {
        return new JAXBElement<LineItem>(_LineItem_QNAME, LineItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModuleItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos", name = "module_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<ModuleItem> createModuleItem(ModuleItem value) {
        return new JAXBElement<ModuleItem>(_ModuleItem_QNAME, ModuleItem.class, null, value);
    }

}
