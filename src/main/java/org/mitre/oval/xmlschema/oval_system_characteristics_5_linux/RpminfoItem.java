


package org.mitre.oval.xmlschema.oval_system_characteristics_5_linux;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemAnySimpleType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemEVRStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}ItemType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="arch" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="epoch" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
 *                 &lt;attribute name="datatype" default="string">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                       &lt;enumeration value="string"/>
 *                       &lt;enumeration value="int"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="release" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
 *                 &lt;attribute name="datatype" default="string">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                       &lt;enumeration value="string"/>
 *                       &lt;enumeration value="version"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="version" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
 *                 &lt;attribute name="datatype" default="string">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                       &lt;enumeration value="string"/>
 *                       &lt;enumeration value="version"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="evr" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemEVRStringType" minOccurs="0"/>
 *         &lt;element name="signature_keyid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="extended_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "arch",
    "epoch",
    "release",
    "version",
    "evr",
    "signatureKeyid",
    "extendedName",
    "filepath"
})
public class RpminfoItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemStringType name;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemStringType arch;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected RpminfoItem.Epoch epoch;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected RpminfoItem.Release release;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected RpminfoItem.Version version;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemEVRStringType evr;
    @XmlElement(name = "signature_keyid", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemStringType signatureKeyid;
    @XmlElement(name = "extended_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemStringType extendedName;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected List<EntityItemStringType> filepath;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setName(EntityItemStringType value) {
        this.name = value;
    }

    /**
     * Gets the value of the arch property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getArch() {
        return arch;
    }

    /**
     * Sets the value of the arch property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setArch(EntityItemStringType value) {
        this.arch = value;
    }

    /**
     * Gets the value of the epoch property.
     * 
     * @return
     *     possible object is
     *     {@link RpminfoItem.Epoch }
     *     
     */
    public RpminfoItem.Epoch getEpoch() {
        return epoch;
    }

    /**
     * Sets the value of the epoch property.
     * 
     * @param value
     *     allowed object is
     *     {@link RpminfoItem.Epoch }
     *     
     */
    public void setEpoch(RpminfoItem.Epoch value) {
        this.epoch = value;
    }

    /**
     * Gets the value of the release property.
     * 
     * @return
     *     possible object is
     *     {@link RpminfoItem.Release }
     *     
     */
    public RpminfoItem.Release getRelease() {
        return release;
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *     allowed object is
     *     {@link RpminfoItem.Release }
     *     
     */
    public void setRelease(RpminfoItem.Release value) {
        this.release = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link RpminfoItem.Version }
     *     
     */
    public RpminfoItem.Version getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link RpminfoItem.Version }
     *     
     */
    public void setVersion(RpminfoItem.Version value) {
        this.version = value;
    }

    /**
     * Gets the value of the evr property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemEVRStringType }
     *     
     */
    public EntityItemEVRStringType getEvr() {
        return evr;
    }

    /**
     * Sets the value of the evr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemEVRStringType }
     *     
     */
    public void setEvr(EntityItemEVRStringType value) {
        this.evr = value;
    }

    /**
     * Gets the value of the signatureKeyid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSignatureKeyid() {
        return signatureKeyid;
    }

    /**
     * Sets the value of the signatureKeyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSignatureKeyid(EntityItemStringType value) {
        this.signatureKeyid = value;
    }

    /**
     * Gets the value of the extendedName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getExtendedName() {
        return extendedName;
    }

    /**
     * Sets the value of the extendedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setExtendedName(EntityItemStringType value) {
        this.extendedName = value;
    }

    /**
     * Gets the value of the filepath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filepath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilepath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getFilepath() {
        if (filepath == null) {
            filepath = new ArrayList<EntityItemStringType>();
        }
        return this.filepath;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
     *       &lt;attribute name="datatype" default="string">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
     *             &lt;enumeration value="string"/>
     *             &lt;enumeration value="int"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Epoch
        extends EntityItemAnySimpleType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
     *       &lt;attribute name="datatype" default="string">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
     *             &lt;enumeration value="string"/>
     *             &lt;enumeration value="version"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Release
        extends EntityItemAnySimpleType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
     *       &lt;attribute name="datatype" default="string">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
     *             &lt;enumeration value="string"/>
     *             &lt;enumeration value="version"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Version
        extends EntityItemAnySimpleType
    {


    }

}
