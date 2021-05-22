
package org.mitre.oval.xmlschema.oval_common_5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_common_5 package. 
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

    private final static QName _DeprecatedInfo_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-common-5", "deprecated_info");
    private final static QName _Notes_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-common-5", "notes");
    private final static QName _ElementMapping_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-common-5", "element_mapping");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_common_5
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeneratorType }
     * 
     */
    public GeneratorType createGeneratorType() {
        return new GeneratorType();
    }

    /**
     * Create an instance of {@link NotesType }
     * 
     */
    public NotesType createNotesType() {
        return new NotesType();
    }

    /**
     * Create an instance of {@link ElementMapType }
     * 
     */
    public ElementMapType createElementMapType() {
        return new ElementMapType();
    }

    /**
     * Create an instance of {@link DeprecatedInfoType }
     * 
     */
    public DeprecatedInfoType createDeprecatedInfoType() {
        return new DeprecatedInfoType();
    }

    /**
     * Create an instance of {@link SchemaVersionType }
     * 
     */
    public SchemaVersionType createSchemaVersionType() {
        return new SchemaVersionType();
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link ElementMapItemType }
     * 
     */
    public ElementMapItemType createElementMapItemType() {
        return new ElementMapItemType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeprecatedInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-common-5", name = "deprecated_info")
    public JAXBElement<DeprecatedInfoType> createDeprecatedInfo(DeprecatedInfoType value) {
        return new JAXBElement<DeprecatedInfoType>(_DeprecatedInfo_QNAME, DeprecatedInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-common-5", name = "notes")
    public JAXBElement<NotesType> createNotes(NotesType value) {
        return new JAXBElement<NotesType>(_Notes_QNAME, NotesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElementMapType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-common-5", name = "element_mapping")
    public JAXBElement<ElementMapType> createElementMapping(ElementMapType value) {
        return new JAXBElement<ElementMapType>(_ElementMapping_QNAME, ElementMapType.class, null, value);
    }

}
