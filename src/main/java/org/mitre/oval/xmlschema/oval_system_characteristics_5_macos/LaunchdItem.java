


package org.mitre.oval.xmlschema.oval_system_characteristics_5_macos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemSimpleBaseType;
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
 *         &lt;element name="label" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType"/>
 *         &lt;element name="pid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="status" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
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
public class LaunchdItem
    extends ItemType
{

    @XmlElementRefs({
        @XmlElementRef(name = "label", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "status", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pid", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends EntityItemSimpleBaseType>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Status" is used by two different parts of a schema. See: 
     * line 474 of file:/Users/serkanozkan/Downloads/Language-5.11.2/schemas/macos-system-characteristics-schema.xsd
     * line 255 of file:/Users/serkanozkan/Downloads/Language-5.11.2/schemas/oval-system-characteristics-schema.xsd
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
     * {@link JAXBElement }{@code <}{@link EntityItemIntType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityItemIntType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends EntityItemSimpleBaseType>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<? extends EntityItemSimpleBaseType>>();
        }
        return this.rest;
    }

}
