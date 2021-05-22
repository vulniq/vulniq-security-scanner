


package org.mitre.oval.xmlschema.oval_definitions_5_independent;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}ObjectType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}set"/>
 *           &lt;sequence>
 *             &lt;element name="behaviors" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#independent}LdapBehaviors" minOccurs="0"/>
 *             &lt;element name="suffix" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
 *             &lt;element name="relative_dn" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
 *             &lt;element name="attribute" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
 *           &lt;/sequence>
 *         &lt;/choice>
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
    "set",
    "behaviors",
    "suffix",
    "relativeDn",
    "attribute"
})
public class LdapObject
    extends ObjectType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected Set set;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
    protected LdapBehaviors behaviors;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
    protected EntityObjectStringType suffix;
    @XmlElementRef(name = "relative_dn", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityObjectStringType> relativeDn;
    @XmlElementRef(name = "attribute", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityObjectStringType> attribute;

    /**
     * Gets the value of the set property.
     * 
     * @return
     *     possible object is
     *     {@link Set }
     *     
     */
    public Set getSet() {
        return set;
    }

    /**
     * Sets the value of the set property.
     * 
     * @param value
     *     allowed object is
     *     {@link Set }
     *     
     */
    public void setSet(Set value) {
        this.set = value;
    }

    /**
     * Gets the value of the behaviors property.
     * 
     * @return
     *     possible object is
     *     {@link LdapBehaviors }
     *     
     */
    public LdapBehaviors getBehaviors() {
        return behaviors;
    }

    /**
     * Sets the value of the behaviors property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapBehaviors }
     *     
     */
    public void setBehaviors(LdapBehaviors value) {
        this.behaviors = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link EntityObjectStringType }
     *     
     */
    public EntityObjectStringType getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityObjectStringType }
     *     
     */
    public void setSuffix(EntityObjectStringType value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the relativeDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}
     *     
     */
    public JAXBElement<EntityObjectStringType> getRelativeDn() {
        return relativeDn;
    }

    /**
     * Sets the value of the relativeDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}
     *     
     */
    public void setRelativeDn(JAXBElement<EntityObjectStringType> value) {
        this.relativeDn = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}
     *     
     */
    public JAXBElement<EntityObjectStringType> getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}
     *     
     */
    public void setAttribute(JAXBElement<EntityObjectStringType> value) {
        this.attribute = value;
    }

}
