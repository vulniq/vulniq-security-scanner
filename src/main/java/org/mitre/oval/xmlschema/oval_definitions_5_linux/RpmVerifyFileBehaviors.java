


package org.mitre.oval.xmlschema.oval_definitions_5_linux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The RpmVerifyFileBehaviors complex type defines a set of behaviors that for
 *                     controlling how the individual files in installed rpms are verified. These behaviors align with the
 *                     verify-options of the rpm command with the addition of two behaviors that will indicate that a file
 *                     with a given attribute marker should not be collected.
 *                
 * 
 * <p>Java class for RpmVerifyFileBehaviors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RpmVerifyFileBehaviors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="nolinkto" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nomd5" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nosize" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nouser" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nogroup" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nomtime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nomode" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nordev" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="noconfigfiles" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="noghostfiles" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nofiledigest" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nocaps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RpmVerifyFileBehaviors", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
public class RpmVerifyFileBehaviors {

    @XmlAttribute(name = "nolinkto")
    protected Boolean nolinkto;
    @XmlAttribute(name = "nomd5")
    protected Boolean nomd5;
    @XmlAttribute(name = "nosize")
    protected Boolean nosize;
    @XmlAttribute(name = "nouser")
    protected Boolean nouser;
    @XmlAttribute(name = "nogroup")
    protected Boolean nogroup;
    @XmlAttribute(name = "nomtime")
    protected Boolean nomtime;
    @XmlAttribute(name = "nomode")
    protected Boolean nomode;
    @XmlAttribute(name = "nordev")
    protected Boolean nordev;
    @XmlAttribute(name = "noconfigfiles")
    protected Boolean noconfigfiles;
    @XmlAttribute(name = "noghostfiles")
    protected Boolean noghostfiles;
    @XmlAttribute(name = "nofiledigest")
    protected Boolean nofiledigest;
    @XmlAttribute(name = "nocaps")
    protected Boolean nocaps;

    /**
     * Gets the value of the nolinkto property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNolinkto() {
        if (nolinkto == null) {
            return false;
        } else {
            return nolinkto;
        }
    }

    /**
     * Sets the value of the nolinkto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNolinkto(Boolean value) {
        this.nolinkto = value;
    }

    /**
     * Gets the value of the nomd5 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNomd5() {
        if (nomd5 == null) {
            return false;
        } else {
            return nomd5;
        }
    }

    /**
     * Sets the value of the nomd5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNomd5(Boolean value) {
        this.nomd5 = value;
    }

    /**
     * Gets the value of the nosize property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNosize() {
        if (nosize == null) {
            return false;
        } else {
            return nosize;
        }
    }

    /**
     * Sets the value of the nosize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNosize(Boolean value) {
        this.nosize = value;
    }

    /**
     * Gets the value of the nouser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNouser() {
        if (nouser == null) {
            return false;
        } else {
            return nouser;
        }
    }

    /**
     * Sets the value of the nouser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNouser(Boolean value) {
        this.nouser = value;
    }

    /**
     * Gets the value of the nogroup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNogroup() {
        if (nogroup == null) {
            return false;
        } else {
            return nogroup;
        }
    }

    /**
     * Sets the value of the nogroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNogroup(Boolean value) {
        this.nogroup = value;
    }

    /**
     * Gets the value of the nomtime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNomtime() {
        if (nomtime == null) {
            return false;
        } else {
            return nomtime;
        }
    }

    /**
     * Sets the value of the nomtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNomtime(Boolean value) {
        this.nomtime = value;
    }

    /**
     * Gets the value of the nomode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNomode() {
        if (nomode == null) {
            return false;
        } else {
            return nomode;
        }
    }

    /**
     * Sets the value of the nomode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNomode(Boolean value) {
        this.nomode = value;
    }

    /**
     * Gets the value of the nordev property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNordev() {
        if (nordev == null) {
            return false;
        } else {
            return nordev;
        }
    }

    /**
     * Sets the value of the nordev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNordev(Boolean value) {
        this.nordev = value;
    }

    /**
     * Gets the value of the noconfigfiles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNoconfigfiles() {
        if (noconfigfiles == null) {
            return false;
        } else {
            return noconfigfiles;
        }
    }

    /**
     * Sets the value of the noconfigfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoconfigfiles(Boolean value) {
        this.noconfigfiles = value;
    }

    /**
     * Gets the value of the noghostfiles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNoghostfiles() {
        if (noghostfiles == null) {
            return false;
        } else {
            return noghostfiles;
        }
    }

    /**
     * Sets the value of the noghostfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoghostfiles(Boolean value) {
        this.noghostfiles = value;
    }

    /**
     * Gets the value of the nofiledigest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNofiledigest() {
        if (nofiledigest == null) {
            return false;
        } else {
            return nofiledigest;
        }
    }

    /**
     * Sets the value of the nofiledigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNofiledigest(Boolean value) {
        this.nofiledigest = value;
    }

    /**
     * Gets the value of the nocaps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNocaps() {
        if (nocaps == null) {
            return false;
        } else {
            return nocaps;
        }
    }

    /**
     * Sets the value of the nocaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNocaps(Boolean value) {
        this.nocaps = value;
    }

}
