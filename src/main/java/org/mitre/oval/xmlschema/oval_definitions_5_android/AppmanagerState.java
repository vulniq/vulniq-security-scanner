


package org.mitre.oval.xmlschema.oval_definitions_5_android;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBinaryType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
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
 *         &lt;element name="application_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="gid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="package_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="data_directory" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="current_status" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="permission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="native_lib_dir" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="signing_certificate" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBinaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="first_install_time" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="last_update_time" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="package_file_location" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
public class AppmanagerState
    extends StateType
{

    @XmlElementRefs({
        @XmlElementRef(name = "application_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "native_lib_dir", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "signing_certificate", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "data_directory", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "last_update_time", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "current_status", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "first_install_time", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "uid", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "package_file_location", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gid", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "package_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "permission", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends EntityStateSimpleBaseType>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Version" is used by two different parts of a schema. See: 
     * line 134 of file:/Users/serkanozkan/Downloads/Language-5.11.2/schemas/android-definitions-schema.xsd
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
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateBinaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateIntType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateBoolType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateIntType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
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

}
