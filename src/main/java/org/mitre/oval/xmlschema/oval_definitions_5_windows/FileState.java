


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateAnySimpleType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateSimpleBaseType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateVersionType;
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
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="path" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="filename" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="size" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="a_time" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="c_time" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="m_time" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="ms_checksum" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateVersionType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateFileTypeType" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateFileAttributeType" minOccurs="0"/>
 *         &lt;element name="development_class" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="company" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="internal_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="language" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="original_filename" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="product_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="product_version" minOccurs="0">
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
 *         &lt;element name="windows_view" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateWindowsViewType" minOccurs="0"/>
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
public class FileState
    extends StateType
{

    @XmlElementRefs({
        @XmlElementRef(name = "language", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "type", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "product_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "c_time", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "product_version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "filepath", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "path", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "development_class", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ms_checksum", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "filename", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "internal_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "windows_view", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "original_filename", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "a_time", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "size", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "company", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "m_time", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "attribute", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "owner", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends EntityStateSimpleBaseType>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Version" is used by two different parts of a schema. See: 
     * line 1723 of file:/Users/serkanozkan/Downloads/Language-5.11.2/schemas/windows-definitions-schema.xsd
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
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateFileTypeType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateIntType }{@code >}
     * {@link JAXBElement }{@code <}{@link FileState.ProductVersion }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateWindowsViewType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateIntType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateIntType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateIntType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateVersionType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateFileAttributeType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
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
    public static class ProductVersion
        extends EntityStateAnySimpleType
    {


    }

}
