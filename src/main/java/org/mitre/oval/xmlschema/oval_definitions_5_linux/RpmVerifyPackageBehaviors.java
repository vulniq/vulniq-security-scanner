


package org.mitre.oval.xmlschema.oval_definitions_5_linux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The RpmVerifyPackageBehaviors complex type defines a set of behaviors that for
 *                     controlling how installed rpms are verified. These behaviors align with the verify-options of the
 *                     rpm command.
 *                
 * 
 * <p>Java class for RpmVerifyPackageBehaviors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RpmVerifyPackageBehaviors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="nodeps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nodigest" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="noscripts" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nosignature" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RpmVerifyPackageBehaviors", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
public class RpmVerifyPackageBehaviors {

    @XmlAttribute(name = "nodeps")
    protected Boolean nodeps;
    @XmlAttribute(name = "nodigest")
    protected Boolean nodigest;
    @XmlAttribute(name = "noscripts")
    protected Boolean noscripts;
    @XmlAttribute(name = "nosignature")
    protected Boolean nosignature;

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

}
