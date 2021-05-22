


package org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
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
 *         &lt;element name="pkginst" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="checksum_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="size_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="mtime_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="uread" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="uwrite" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="uexec" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="gread" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="gwrite" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="gexec" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="oread" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="owrite" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="oexec" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemPermissionCompareType" minOccurs="0"/>
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
    "pkginst",
    "filepath",
    "checksumDiffers",
    "sizeDiffers",
    "mtimeDiffers",
    "uread",
    "uwrite",
    "uexec",
    "gread",
    "gwrite",
    "gexec",
    "oread",
    "owrite",
    "oexec"
})
public class PackagecheckItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemStringType pkginst;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemStringType filepath;
    @XmlElement(name = "checksum_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemBoolType checksumDiffers;
    @XmlElement(name = "size_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemBoolType sizeDiffers;
    @XmlElement(name = "mtime_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemBoolType mtimeDiffers;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemPermissionCompareType uread;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemPermissionCompareType uwrite;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemPermissionCompareType uexec;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemPermissionCompareType gread;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemPermissionCompareType gwrite;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemPermissionCompareType gexec;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemPermissionCompareType oread;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemPermissionCompareType owrite;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemPermissionCompareType oexec;

    /**
     * Gets the value of the pkginst property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPkginst() {
        return pkginst;
    }

    /**
     * Sets the value of the pkginst property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPkginst(EntityItemStringType value) {
        this.pkginst = value;
    }

    /**
     * Gets the value of the filepath property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getFilepath() {
        return filepath;
    }

    /**
     * Sets the value of the filepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setFilepath(EntityItemStringType value) {
        this.filepath = value;
    }

    /**
     * Gets the value of the checksumDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getChecksumDiffers() {
        return checksumDiffers;
    }

    /**
     * Sets the value of the checksumDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setChecksumDiffers(EntityItemBoolType value) {
        this.checksumDiffers = value;
    }

    /**
     * Gets the value of the sizeDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSizeDiffers() {
        return sizeDiffers;
    }

    /**
     * Sets the value of the sizeDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSizeDiffers(EntityItemBoolType value) {
        this.sizeDiffers = value;
    }

    /**
     * Gets the value of the mtimeDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getMtimeDiffers() {
        return mtimeDiffers;
    }

    /**
     * Sets the value of the mtimeDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setMtimeDiffers(EntityItemBoolType value) {
        this.mtimeDiffers = value;
    }

    /**
     * Gets the value of the uread property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getUread() {
        return uread;
    }

    /**
     * Sets the value of the uread property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setUread(EntityItemPermissionCompareType value) {
        this.uread = value;
    }

    /**
     * Gets the value of the uwrite property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getUwrite() {
        return uwrite;
    }

    /**
     * Sets the value of the uwrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setUwrite(EntityItemPermissionCompareType value) {
        this.uwrite = value;
    }

    /**
     * Gets the value of the uexec property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getUexec() {
        return uexec;
    }

    /**
     * Sets the value of the uexec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setUexec(EntityItemPermissionCompareType value) {
        this.uexec = value;
    }

    /**
     * Gets the value of the gread property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getGread() {
        return gread;
    }

    /**
     * Sets the value of the gread property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setGread(EntityItemPermissionCompareType value) {
        this.gread = value;
    }

    /**
     * Gets the value of the gwrite property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getGwrite() {
        return gwrite;
    }

    /**
     * Sets the value of the gwrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setGwrite(EntityItemPermissionCompareType value) {
        this.gwrite = value;
    }

    /**
     * Gets the value of the gexec property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getGexec() {
        return gexec;
    }

    /**
     * Sets the value of the gexec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setGexec(EntityItemPermissionCompareType value) {
        this.gexec = value;
    }

    /**
     * Gets the value of the oread property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getOread() {
        return oread;
    }

    /**
     * Sets the value of the oread property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setOread(EntityItemPermissionCompareType value) {
        this.oread = value;
    }

    /**
     * Gets the value of the owrite property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getOwrite() {
        return owrite;
    }

    /**
     * Sets the value of the owrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setOwrite(EntityItemPermissionCompareType value) {
        this.owrite = value;
    }

    /**
     * Gets the value of the oexec property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getOexec() {
        return oexec;
    }

    /**
     * Sets the value of the oexec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setOexec(EntityItemPermissionCompareType value) {
        this.oexec = value;
    }

}
