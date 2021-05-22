


package org.mitre.oval.xmlschema.oval_definitions_5_solaris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
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
 *         &lt;element name="bits" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="kernel_isa" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="application_isa" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "bits",
    "kernelIsa",
    "applicationIsa"
})
public class IsainfoState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateIntType bits;
    @XmlElement(name = "kernel_isa", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateStringType kernelIsa;
    @XmlElement(name = "application_isa", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateStringType applicationIsa;

    /**
     * Gets the value of the bits property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getBits() {
        return bits;
    }

    /**
     * Sets the value of the bits property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setBits(EntityStateIntType value) {
        this.bits = value;
    }

    /**
     * Gets the value of the kernelIsa property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getKernelIsa() {
        return kernelIsa;
    }

    /**
     * Sets the value of the kernelIsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setKernelIsa(EntityStateStringType value) {
        this.kernelIsa = value;
    }

    /**
     * Gets the value of the applicationIsa property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getApplicationIsa() {
        return applicationIsa;
    }

    /**
     * Sets the value of the applicationIsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setApplicationIsa(EntityStateStringType value) {
        this.applicationIsa = value;
    }

}
