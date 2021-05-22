


package org.mitre.oval.xmlschema.oval_system_characteristics_5_hpux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="patch_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="swtype" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="area_patched" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="patch_base" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "patchName",
    "swtype",
    "areaPatched",
    "patchBase"
})
public class PatchItem
    extends ItemType
{

    @XmlElement(name = "patch_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType patchName;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType swtype;
    @XmlElement(name = "area_patched", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType areaPatched;
    @XmlElement(name = "patch_base", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType patchBase;

    /**
     * Gets the value of the patchName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPatchName() {
        return patchName;
    }

    /**
     * Sets the value of the patchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPatchName(EntityItemStringType value) {
        this.patchName = value;
    }

    /**
     * Gets the value of the swtype property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSwtype() {
        return swtype;
    }

    /**
     * Sets the value of the swtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSwtype(EntityItemStringType value) {
        this.swtype = value;
    }

    /**
     * Gets the value of the areaPatched property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getAreaPatched() {
        return areaPatched;
    }

    /**
     * Sets the value of the areaPatched property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setAreaPatched(EntityItemStringType value) {
        this.areaPatched = value;
    }

    /**
     * Gets the value of the patchBase property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPatchBase() {
        return patchBase;
    }

    /**
     * Sets the value of the patchBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPatchBase(EntityItemStringType value) {
        this.patchBase = value;
    }

}
