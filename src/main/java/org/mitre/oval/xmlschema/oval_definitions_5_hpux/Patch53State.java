


package org.mitre.oval.xmlschema.oval_definitions_5_hpux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="swtype" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="area_patched" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="patch_base" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "swtype",
    "areaPatched",
    "patchBase"
})
public class Patch53State
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType swtype;
    @XmlElement(name = "area_patched", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType areaPatched;
    @XmlElement(name = "patch_base", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType patchBase;

    /**
     * Gets the value of the swtype property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSwtype() {
        return swtype;
    }

    /**
     * Sets the value of the swtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSwtype(EntityStateStringType value) {
        this.swtype = value;
    }

    /**
     * Gets the value of the areaPatched property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getAreaPatched() {
        return areaPatched;
    }

    /**
     * Sets the value of the areaPatched property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setAreaPatched(EntityStateStringType value) {
        this.areaPatched = value;
    }

    /**
     * Gets the value of the patchBase property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPatchBase() {
        return patchBase;
    }

    /**
     * Sets the value of the patchBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPatchBase(EntityStateStringType value) {
        this.patchBase = value;
    }

}
