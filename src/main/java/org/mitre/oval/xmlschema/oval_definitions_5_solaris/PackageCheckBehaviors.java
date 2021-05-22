


package org.mitre.oval.xmlschema.oval_definitions_5_solaris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The PackageCheckBehaviors complex type defines a set of behaviors that for controlling how installed SVR4 packages are checked. These behaviors align with the options of the pkgchk command (specifically '-a', '-c', and '-n').
 * 
 * <p>Java class for PackageCheckBehaviors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageCheckBehaviors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="fileattributes_only" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="filecontents_only" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="no_volatileeditable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageCheckBehaviors", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
public class PackageCheckBehaviors {

    @XmlAttribute(name = "fileattributes_only")
    protected Boolean fileattributesOnly;
    @XmlAttribute(name = "filecontents_only")
    protected Boolean filecontentsOnly;
    @XmlAttribute(name = "no_volatileeditable")
    protected Boolean noVolatileeditable;

    /**
     * Gets the value of the fileattributesOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFileattributesOnly() {
        if (fileattributesOnly == null) {
            return false;
        } else {
            return fileattributesOnly;
        }
    }

    /**
     * Sets the value of the fileattributesOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileattributesOnly(Boolean value) {
        this.fileattributesOnly = value;
    }

    /**
     * Gets the value of the filecontentsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFilecontentsOnly() {
        if (filecontentsOnly == null) {
            return false;
        } else {
            return filecontentsOnly;
        }
    }

    /**
     * Sets the value of the filecontentsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilecontentsOnly(Boolean value) {
        this.filecontentsOnly = value;
    }

    /**
     * Gets the value of the noVolatileeditable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNoVolatileeditable() {
        if (noVolatileeditable == null) {
            return false;
        } else {
            return noVolatileeditable;
        }
    }

    /**
     * Sets the value of the noVolatileeditable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoVolatileeditable(Boolean value) {
        this.noVolatileeditable = value;
    }

}
