


package org.mitre.oval.xmlschema.oval_definitions_5_linux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The RpmVerifyBehaviors complex type defines a set of behaviors that for controlling
 *                     how installed rpms are verified. These behaviors align with the verify-options of the rpm command
 *                     with the addition of two behaviors that will indicate that a file with a given attribute marker
 *                     should not be collected.
 *                
 * 
 * <p>Java class for RpmVerifyBehaviors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RpmVerifyBehaviors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="nodeps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nodigest" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nofiles" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="noscripts" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nosignature" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RpmVerifyBehaviors", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
public class RpmVerifyBehaviors {

    @XmlAttribute(name = "nodeps")
    protected Boolean nodeps;
    @XmlAttribute(name = "nodigest")
    protected Boolean nodigest;
    @XmlAttribute(name = "nofiles")
    protected Boolean nofiles;
    @XmlAttribute(name = "noscripts")
    protected Boolean noscripts;
    @XmlAttribute(name = "nosignature")
    protected Boolean nosignature;
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

    /**
     * Gets the value of the nodeps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNodeps() {
        if (nodeps == null) {
            return false;
        } else {
            return nodeps;
        }
    }

    /**
     * Sets the value of the nodeps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNodeps(Boolean value) {
        this.nodeps = value;
    }

    /**
     * Gets the value of the nodigest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNodigest() {
        if (nodigest == null) {
            return false;
        } else {
            return nodigest;
        }
    }

    /**
     * Sets the value of the nodigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNodigest(Boolean value) {
        this.nodigest = value;
    }

    /**
     * Gets the value of the nofiles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNofiles() {
        if (nofiles == null) {
            return false;
        } else {
            return nofiles;
        }
    }

    /**
     * Sets the value of the nofiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNofiles(Boolean value) {
        this.nofiles = value;
    }

    /**
     * Gets the value of the noscripts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNoscripts() {
        if (noscripts == null) {
            return false;
        } else {
            return noscripts;
        }
    }

    /**
     * Sets the value of the noscripts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoscripts(Boolean value) {
        this.noscripts = value;
    }

    /**
     * Gets the value of the nosignature property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNosignature() {
        if (nosignature == null) {
            return false;
        } else {
            return nosignature;
        }
    }

    /**
     * Sets the value of the nosignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNosignature(Boolean value) {
        this.nosignature = value;
    }

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

}
