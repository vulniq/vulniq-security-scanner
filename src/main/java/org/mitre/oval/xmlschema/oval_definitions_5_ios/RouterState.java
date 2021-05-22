
package org.mitre.oval.xmlschema.oval_definitions_5_ios;

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
 *         &lt;element name="protocol" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#ios}EntityStateRoutingProtocolType"/>
 *         &lt;element name="id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="network" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="bgp_neighbor" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="ospf_authentication_area" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateAnySimpleType">
 *                 &lt;attribute name="datatype" default="int">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                       &lt;enumeration value="int"/>
 *                       &lt;enumeration value="ipv4_address"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="router_config_lines" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
public class RouterState
    extends StateType
{

    @XmlElementRefs({
        @XmlElementRef(name = "network", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ospf_authentication_area", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bgp_neighbor", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "id", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "protocol", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "router_config_lines", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends EntityStateSimpleBaseType>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Id" is used by two different parts of a schema. See: 
     * line 812 of file:/Users/serkanozkan/Downloads/Language-5.11.2/schemas/ios-definitions-schema.xsd
     * line 496 of file:/Users/serkanozkan/Downloads/Language-5.11.2/schemas/oval-definitions-schema.xsd
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
     * {@link JAXBElement }{@code <}{@link EntityStateIntType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouterState.OspfAuthenticationArea }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateRoutingProtocolType }{@code >}
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
     *       &lt;attribute name="datatype" default="int">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
     *             &lt;enumeration value="int"/>
     *             &lt;enumeration value="ipv4_address"/>
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
    public static class OspfAuthenticationArea
        extends EntityStateAnySimpleType
    {


    }

}
