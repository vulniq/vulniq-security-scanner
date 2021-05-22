


package org.mitre.oval.xmlschema.oval_definitions_5_linux;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateAnySimpleType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateSimpleBaseType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}StateType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="epoch" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateAnySimpleType">
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
 *         &lt;element name="version" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateAnySimpleType">
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
 *         &lt;element name="release" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateAnySimpleType">
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
 *         &lt;element name="arch" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="extended_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="size_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="mode_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="md5_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="filedigest_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="device_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="link_mismatch" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="ownership_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="group_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="mtime_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="capabilities_differ" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="configuration_file" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="documentation_file" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="ghost_file" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="license_file" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="readme_file" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "rest"
})
public class RpmverifyfileState
    extends StateType
{

    @XmlElementRefs({
        @XmlElementRef(name = "version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mode_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "device_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ownership_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "readme_file", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "filepath", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extended_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mtime_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ghost_file", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "license_file", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "link_mismatch", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "size_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arch", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "filedigest_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "configuration_file", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "epoch", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "capabilities_differ", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "group_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "md5_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "documentation_file", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends EntityStateSimpleBaseType>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Version" is used by two different parts of a schema. See: 
     * line 1989 of file:/Users/serkanozkan/Downloads/Language-5.11.2/schemas/linux-definitions-schema.xsd
     * line 497 of file:/Users/serkanozkan/Downloads/Language-5.11.2/schemas/oval-definitions-schema.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RpmverifyfileState.Version }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateRpmVerifyResultType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateRpmVerifyResultType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateRpmVerifyResultType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateBoolType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateRpmVerifyResultType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateBoolType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateBoolType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateRpmVerifyResultType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateRpmVerifyResultType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateRpmVerifyResultType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateBoolType }{@code >}
     * {@link JAXBElement }{@code <}{@link RpmverifyfileState.Epoch }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateRpmVerifyResultType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateRpmVerifyResultType }{@code >}
     * {@link JAXBElement }{@code <}{@link RpmverifyfileState.Release }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateRpmVerifyResultType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateBoolType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends EntityStateSimpleBaseType>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<? extends EntityStateSimpleBaseType>>();
        }
        return this.rest;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateAnySimpleType">
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
        extends EntityStateAnySimpleType
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
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateAnySimpleType">
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
        extends EntityStateAnySimpleType
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
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateAnySimpleType">
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
        extends EntityStateAnySimpleType
    {


    }

}
