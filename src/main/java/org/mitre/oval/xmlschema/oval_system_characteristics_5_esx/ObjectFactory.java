


package org.mitre.oval.xmlschema.oval_system_characteristics_5_esx;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_system_characteristics_5_esx package. 
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

    private final static QName _VisdkmanagedobjectItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", "visdkmanagedobject_item");
    private final static QName _PatchItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", "patch_item");
    private final static QName _VersionItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", "version_item");
    private final static QName _PatchItemKnowledgeBaseId_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", "knowledge_base_id");
    private final static QName _PatchItemClassification_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", "classification");
    private final static QName _PatchItemStatus_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", "status");
    private final static QName _PatchItemSupportLevel_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", "support_level");
    private final static QName _PatchItemPatchName_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", "patch_name");
    private final static QName _PatchItemBundleId_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", "bundle_id");
    private final static QName _PatchItemPatchNumber_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", "patch_number");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_system_characteristics_5_esx
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
     * Create an instance of {@link VisdkmanagedobjectItem }
     * 
     */
    public VisdkmanagedobjectItem createVisdkmanagedobjectItem() {
        return new VisdkmanagedobjectItem();
    }

    /**
     * Create an instance of {@link PatchItem }
     * 
     */
    public PatchItem createPatchItem() {
        return new PatchItem();
    }

    /**
     * Create an instance of {@link EntityItemClassificationType }
     * 
     */
    public EntityItemClassificationType createEntityItemClassificationType() {
        return new EntityItemClassificationType();
    }

    /**
     * Create an instance of {@link EntityItemSupportLevelType }
     * 
     */
    public EntityItemSupportLevelType createEntityItemSupportLevelType() {
        return new EntityItemSupportLevelType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VisdkmanagedobjectItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", name = "visdkmanagedobject_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<VisdkmanagedobjectItem> createVisdkmanagedobjectItem(VisdkmanagedobjectItem value) {
        return new JAXBElement<VisdkmanagedobjectItem>(_VisdkmanagedobjectItem_QNAME, VisdkmanagedobjectItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatchItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", name = "patch_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<PatchItem> createPatchItem(PatchItem value) {
        return new JAXBElement<PatchItem>(_PatchItem_QNAME, PatchItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", name = "version_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<VersionItem> createVersionItem(VersionItem value) {
        return new JAXBElement<VersionItem>(_VersionItem_QNAME, VersionItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", name = "knowledge_base_id", scope = PatchItem.class)
    public JAXBElement<EntityItemIntType> createPatchItemKnowledgeBaseId(EntityItemIntType value) {
        return new JAXBElement<EntityItemIntType>(_PatchItemKnowledgeBaseId_QNAME, EntityItemIntType.class, PatchItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemClassificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", name = "classification", scope = PatchItem.class)
    public JAXBElement<EntityItemClassificationType> createPatchItemClassification(EntityItemClassificationType value) {
        return new JAXBElement<EntityItemClassificationType>(_PatchItemClassification_QNAME, EntityItemClassificationType.class, PatchItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemBoolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", name = "status", scope = PatchItem.class)
    public JAXBElement<EntityItemBoolType> createPatchItemStatus(EntityItemBoolType value) {
        return new JAXBElement<EntityItemBoolType>(_PatchItemStatus_QNAME, EntityItemBoolType.class, PatchItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemSupportLevelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", name = "support_level", scope = PatchItem.class)
    public JAXBElement<EntityItemSupportLevelType> createPatchItemSupportLevel(EntityItemSupportLevelType value) {
        return new JAXBElement<EntityItemSupportLevelType>(_PatchItemSupportLevel_QNAME, EntityItemSupportLevelType.class, PatchItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", name = "patch_name", scope = PatchItem.class)
    public JAXBElement<EntityItemStringType> createPatchItemPatchName(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_PatchItemPatchName_QNAME, EntityItemStringType.class, PatchItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", name = "bundle_id", scope = PatchItem.class)
    public JAXBElement<EntityItemIntType> createPatchItemBundleId(EntityItemIntType value) {
        return new JAXBElement<EntityItemIntType>(_PatchItemBundleId_QNAME, EntityItemIntType.class, PatchItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#esx", name = "patch_number", scope = PatchItem.class)
    public JAXBElement<EntityItemStringType> createPatchItemPatchNumber(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_PatchItemPatchNumber_QNAME, EntityItemStringType.class, PatchItem.class, value);
    }

}
