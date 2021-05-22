


package org.mitre.oval.xmlschema.oval_definitions_5_solaris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateRecordType;
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
 *         &lt;element name="current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="supported" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStateV12NEnvType" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStateV12NEnvType" minOccurs="0"/>
 *         &lt;element name="ldom-role" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStateLDOMRoleType" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateRecordType" minOccurs="0"/>
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
    "current",
    "supported",
    "parent",
    "ldomRole",
    "properties"
})
public class VirtualizationinfoState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateStringType current;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateV12NEnvType supported;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateV12NEnvType parent;
    @XmlElement(name = "ldom-role", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateLDOMRoleType ldomRole;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateRecordType properties;

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setCurrent(EntityStateStringType value) {
        this.current = value;
    }

    /**
     * Gets the value of the supported property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateV12NEnvType }
     *     
     */
    public EntityStateV12NEnvType getSupported() {
        return supported;
    }

    /**
     * Sets the value of the supported property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateV12NEnvType }
     *     
     */
    public void setSupported(EntityStateV12NEnvType value) {
        this.supported = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateV12NEnvType }
     *     
     */
    public EntityStateV12NEnvType getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateV12NEnvType }
     *     
     */
    public void setParent(EntityStateV12NEnvType value) {
        this.parent = value;
    }

    /**
     * Gets the value of the ldomRole property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateLDOMRoleType }
     *     
     */
    public EntityStateLDOMRoleType getLdomRole() {
        return ldomRole;
    }

    /**
     * Sets the value of the ldomRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateLDOMRoleType }
     *     
     */
    public void setLdomRole(EntityStateLDOMRoleType value) {
        this.ldomRole = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRecordType }
     *     
     */
    public EntityStateRecordType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRecordType }
     *     
     */
    public void setProperties(EntityStateRecordType value) {
        this.properties = value;
    }

}
