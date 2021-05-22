
package org.mitre.oval.xmlschema.oval_definitions_5_asa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="interface" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="host" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="snmpv3_user" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#asa}EntityStateSNMPVersionStringType" minOccurs="0"/>
 *         &lt;element name="poll" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="traps" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="udp_port" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
public class SnmpHostState
    extends StateType
{

    @XmlElementRefs({
        @XmlElementRef(name = "version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "poll", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "traps", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "interface", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "host", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "snmpv3_user", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "udp_port", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends EntityStateSimpleBaseType>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Version" is used by two different parts of a schema. See: 
     * line 851 of file:/Users/serkanozkan/Downloads/Language-5.11.2/schemas/asa-definitions-schema.xsd
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
     * {@link JAXBElement }{@code <}{@link EntityStateSNMPVersionStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateBoolType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateBoolType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateIntType }{@code >}
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
