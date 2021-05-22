


package org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
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
 *         &lt;element name="bits" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="kernel_isa" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="application_isa" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
public class IsainfoItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemIntType bits;
    @XmlElement(name = "kernel_isa", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemStringType kernelIsa;
    @XmlElement(name = "application_isa", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemStringType applicationIsa;

    /**
     * Gets the value of the bits property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getBits() {
        return bits;
    }

    /**
     * Sets the value of the bits property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setBits(EntityItemIntType value) {
        this.bits = value;
    }

    /**
     * Gets the value of the kernelIsa property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getKernelIsa() {
        return kernelIsa;
    }

    /**
     * Sets the value of the kernelIsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setKernelIsa(EntityItemStringType value) {
        this.kernelIsa = value;
    }

    /**
     * Gets the value of the applicationIsa property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getApplicationIsa() {
        return applicationIsa;
    }

    /**
     * Sets the value of the applicationIsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setApplicationIsa(EntityItemStringType value) {
        this.applicationIsa = value;
    }

}
