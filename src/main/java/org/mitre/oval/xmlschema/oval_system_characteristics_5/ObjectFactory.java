


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_system_characteristics_5 package. 
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

    private final static QName _Item_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", "item");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_system_characteristics_5
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link OvalSystemCharacteristics }
     * 
     */
    public OvalSystemCharacteristics createOvalSystemCharacteristics() {
        return new OvalSystemCharacteristics();
    }

    /**
     * Create an instance of {@link SystemInfoType }
     * 
     */
    public SystemInfoType createSystemInfoType() {
        return new SystemInfoType();
    }

    /**
     * Create an instance of {@link CollectedObjectsType }
     * 
     */
    public CollectedObjectsType createCollectedObjectsType() {
        return new CollectedObjectsType();
    }

    /**
     * Create an instance of {@link SystemDataType }
     * 
     */
    public SystemDataType createSystemDataType() {
        return new SystemDataType();
    }

    /**
     * Create an instance of {@link EntityItemIPAddressStringType }
     * 
     */
    public EntityItemIPAddressStringType createEntityItemIPAddressStringType() {
        return new EntityItemIPAddressStringType();
    }

    /**
     * Create an instance of {@link EntityItemIOSVersionType }
     * 
     */
    public EntityItemIOSVersionType createEntityItemIOSVersionType() {
        return new EntityItemIOSVersionType();
    }

    /**
     * Create an instance of {@link EntityItemBoolType }
     * 
     */
    public EntityItemBoolType createEntityItemBoolType() {
        return new EntityItemBoolType();
    }

    /**
     * Create an instance of {@link EntityItemIntType }
     * 
     */
    public EntityItemIntType createEntityItemIntType() {
        return new EntityItemIntType();
    }

    /**
     * Create an instance of {@link EntityItemVersionType }
     * 
     */
    public EntityItemVersionType createEntityItemVersionType() {
        return new EntityItemVersionType();
    }

    /**
     * Create an instance of {@link EntityItemStringType }
     * 
     */
    public EntityItemStringType createEntityItemStringType() {
        return new EntityItemStringType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link EntityItemFilesetRevisionType }
     * 
     */
    public EntityItemFilesetRevisionType createEntityItemFilesetRevisionType() {
        return new EntityItemFilesetRevisionType();
    }

    /**
     * Create an instance of {@link ObjectType }
     * 
     */
    public ObjectType createObjectType() {
        return new ObjectType();
    }

    /**
     * Create an instance of {@link InterfaceType }
     * 
     */
    public InterfaceType createInterfaceType() {
        return new InterfaceType();
    }

    /**
     * Create an instance of {@link EntityItemEVRStringType }
     * 
     */
    public EntityItemEVRStringType createEntityItemEVRStringType() {
        return new EntityItemEVRStringType();
    }

    /**
     * Create an instance of {@link EntityItemIPAddressType }
     * 
     */
    public EntityItemIPAddressType createEntityItemIPAddressType() {
        return new EntityItemIPAddressType();
    }

    /**
     * Create an instance of {@link EntityItemRecordType }
     * 
     */
    public EntityItemRecordType createEntityItemRecordType() {
        return new EntityItemRecordType();
    }

    /**
     * Create an instance of {@link EntityItemDebianEVRStringType }
     * 
     */
    public EntityItemDebianEVRStringType createEntityItemDebianEVRStringType() {
        return new EntityItemDebianEVRStringType();
    }

    /**
     * Create an instance of {@link EntityItemFieldType }
     * 
     */
    public EntityItemFieldType createEntityItemFieldType() {
        return new EntityItemFieldType();
    }

    /**
     * Create an instance of {@link VariableValueType }
     * 
     */
    public VariableValueType createVariableValueType() {
        return new VariableValueType();
    }

    /**
     * Create an instance of {@link EntityItemBinaryType }
     * 
     */
    public EntityItemBinaryType createEntityItemBinaryType() {
        return new EntityItemBinaryType();
    }

    /**
     * Create an instance of {@link EntityItemAnySimpleType }
     * 
     */
    public EntityItemAnySimpleType createEntityItemAnySimpleType() {
        return new EntityItemAnySimpleType();
    }

    /**
     * Create an instance of {@link InterfacesType }
     * 
     */
    public InterfacesType createInterfacesType() {
        return new InterfacesType();
    }

    /**
     * Create an instance of {@link EntityItemFloatType }
     * 
     */
    public EntityItemFloatType createEntityItemFloatType() {
        return new EntityItemFloatType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", name = "item")
    public JAXBElement<ItemType> createItem(ItemType value) {
        return new JAXBElement<ItemType>(_Item_QNAME, ItemType.class, null, value);
    }

}
