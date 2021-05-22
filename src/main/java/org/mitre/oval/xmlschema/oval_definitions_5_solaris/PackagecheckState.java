


package org.mitre.oval.xmlschema.oval_definitions_5_solaris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
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
 *         &lt;element name="pkginst" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="checksum_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="size_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="mtime_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="uread" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="uwrite" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="uexec" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="gread" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="gwrite" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="gexec" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="oread" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="owrite" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="oexec" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStatePermissionCompareType" minOccurs="0"/>
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
public class PackagecheckState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateStringType pkginst;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateStringType filepath;
    @XmlElement(name = "checksum_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateBoolType checksumDiffers;
    @XmlElement(name = "size_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateBoolType sizeDiffers;
    @XmlElement(name = "mtime_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateBoolType mtimeDiffers;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStatePermissionCompareType uread;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStatePermissionCompareType uwrite;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStatePermissionCompareType uexec;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStatePermissionCompareType gread;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStatePermissionCompareType gwrite;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStatePermissionCompareType gexec;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStatePermissionCompareType oread;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStatePermissionCompareType owrite;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStatePermissionCompareType oexec;

    /**
     * Gets the value of the pkginst property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPkginst() {
        return pkginst;
    }

    /**
     * Sets the value of the pkginst property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPkginst(EntityStateStringType value) {
        this.pkginst = value;
    }

    /**
     * Gets the value of the filepath property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getFilepath() {
        return filepath;
    }

    /**
     * Sets the value of the filepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setFilepath(EntityStateStringType value) {
        this.filepath = value;
    }

    /**
     * Gets the value of the checksumDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getChecksumDiffers() {
        return checksumDiffers;
    }

    /**
     * Sets the value of the checksumDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setChecksumDiffers(EntityStateBoolType value) {
        this.checksumDiffers = value;
    }

    /**
     * Gets the value of the sizeDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSizeDiffers() {
        return sizeDiffers;
    }

    /**
     * Sets the value of the sizeDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSizeDiffers(EntityStateBoolType value) {
        this.sizeDiffers = value;
    }

    /**
     * Gets the value of the mtimeDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getMtimeDiffers() {
        return mtimeDiffers;
    }

    /**
     * Sets the value of the mtimeDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setMtimeDiffers(EntityStateBoolType value) {
        this.mtimeDiffers = value;
    }

    /**
     * Gets the value of the uread property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getUread() {
        return uread;
    }

    /**
     * Sets the value of the uread property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setUread(EntityStatePermissionCompareType value) {
        this.uread = value;
    }

    /**
     * Gets the value of the uwrite property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getUwrite() {
        return uwrite;
    }

    /**
     * Sets the value of the uwrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setUwrite(EntityStatePermissionCompareType value) {
        this.uwrite = value;
    }

    /**
     * Gets the value of the uexec property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getUexec() {
        return uexec;
    }

    /**
     * Sets the value of the uexec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setUexec(EntityStatePermissionCompareType value) {
        this.uexec = value;
    }

    /**
     * Gets the value of the gread property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getGread() {
        return gread;
    }

    /**
     * Sets the value of the gread property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setGread(EntityStatePermissionCompareType value) {
        this.gread = value;
    }

    /**
     * Gets the value of the gwrite property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getGwrite() {
        return gwrite;
    }

    /**
     * Sets the value of the gwrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setGwrite(EntityStatePermissionCompareType value) {
        this.gwrite = value;
    }

    /**
     * Gets the value of the gexec property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getGexec() {
        return gexec;
    }

    /**
     * Sets the value of the gexec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setGexec(EntityStatePermissionCompareType value) {
        this.gexec = value;
    }

    /**
     * Gets the value of the oread property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getOread() {
        return oread;
    }

    /**
     * Sets the value of the oread property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setOread(EntityStatePermissionCompareType value) {
        this.oread = value;
    }

    /**
     * Gets the value of the owrite property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getOwrite() {
        return owrite;
    }

    /**
     * Sets the value of the owrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setOwrite(EntityStatePermissionCompareType value) {
        this.owrite = value;
    }

    /**
     * Gets the value of the oexec property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getOexec() {
        return oexec;
    }

    /**
     * Sets the value of the oexec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setOexec(EntityStatePermissionCompareType value) {
        this.oexec = value;
    }

}
