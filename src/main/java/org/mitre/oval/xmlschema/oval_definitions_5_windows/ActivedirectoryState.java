


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateAnySimpleType;
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
 *         &lt;element name="naming_context" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateNamingContextType" minOccurs="0"/>
 *         &lt;element name="relative_dn" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="object_class" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="adstype" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAdstypeType" minOccurs="0"/>
 *         &lt;element name="value" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateAnySimpleType" minOccurs="0"/>
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
    "namingContext",
    "relativeDn",
    "attribute",
    "objectClass",
    "adstype",
    "value"
})
public class ActivedirectoryState
    extends StateType
{

    @XmlElement(name = "naming_context", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateNamingContextType namingContext;
    @XmlElement(name = "relative_dn", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType relativeDn;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType attribute;
    @XmlElement(name = "object_class", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType objectClass;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAdstypeType adstype;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAnySimpleType value;

    /**
     * Gets the value of the namingContext property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateNamingContextType }
     *     
     */
    public EntityStateNamingContextType getNamingContext() {
        return namingContext;
    }

    /**
     * Sets the value of the namingContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateNamingContextType }
     *     
     */
    public void setNamingContext(EntityStateNamingContextType value) {
        this.namingContext = value;
    }

    /**
     * Gets the value of the relativeDn property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getRelativeDn() {
        return relativeDn;
    }

    /**
     * Sets the value of the relativeDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setRelativeDn(EntityStateStringType value) {
        this.relativeDn = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setAttribute(EntityStateStringType value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the objectClass property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getObjectClass() {
        return objectClass;
    }

    /**
     * Sets the value of the objectClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setObjectClass(EntityStateStringType value) {
        this.objectClass = value;
    }

    /**
     * Gets the value of the adstype property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAdstypeType }
     *     
     */
    public EntityStateAdstypeType getAdstype() {
        return adstype;
    }

    /**
     * Sets the value of the adstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAdstypeType }
     *     
     */
    public void setAdstype(EntityStateAdstypeType value) {
        this.adstype = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAnySimpleType }
     *     
     */
    public EntityStateAnySimpleType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAnySimpleType }
     *     
     */
    public void setValue(EntityStateAnySimpleType value) {
        this.value = value;
    }

}
