


package org.mitre.oval.xmlschema.oval_definitions_5_linux;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * It is important to note that the 'max_depth' and 'recurse_direction' attributes of the
 *                     'behaviors' element do not apply to the 'filepath' element, only to the 'path' and 'filename'
 *                     elements. This is because the 'filepath' element represents an absolute path to a particular file
 *                     and it is not possible to recurse over a file.
 *                
 * 
 * <p>Java class for FileBehaviors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileBehaviors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="max_depth" default="-1">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;fractionDigits value="0"/>
 *             &lt;minInclusive value="-1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="recurse" default="symlinks and directories">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="directories"/>
 *             &lt;enumeration value="symlinks"/>
 *             &lt;enumeration value="symlinks and directories"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="recurse_direction" default="none">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="up"/>
 *             &lt;enumeration value="down"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="recurse_file_system" default="all">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="all"/>
 *             &lt;enumeration value="local"/>
 *             &lt;enumeration value="defined"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileBehaviors", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
public class FileBehaviors {

    @XmlAttribute(name = "max_depth")
    protected BigInteger maxDepth;
    @XmlAttribute(name = "recurse")
    protected String recurse;
    @XmlAttribute(name = "recurse_direction")
    protected String recurseDirection;
    @XmlAttribute(name = "recurse_file_system")
    protected String recurseFileSystem;

    /**
     * Gets the value of the maxDepth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxDepth() {
        if (maxDepth == null) {
            return new BigInteger("-1");
        } else {
            return maxDepth;
        }
    }

    /**
     * Sets the value of the maxDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxDepth(BigInteger value) {
        this.maxDepth = value;
    }

    /**
     * Gets the value of the recurse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurse() {
        if (recurse == null) {
            return "symlinks and directories";
        } else {
            return recurse;
        }
    }

    /**
     * Sets the value of the recurse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurse(String value) {
        this.recurse = value;
    }

    /**
     * Gets the value of the recurseDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurseDirection() {
        if (recurseDirection == null) {
            return "none";
        } else {
            return recurseDirection;
        }
    }

    /**
     * Sets the value of the recurseDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurseDirection(String value) {
        this.recurseDirection = value;
    }

    /**
     * Gets the value of the recurseFileSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurseFileSystem() {
        if (recurseFileSystem == null) {
            return "all";
        } else {
            return recurseFileSystem;
        }
    }

    /**
     * Sets the value of the recurseFileSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurseFileSystem(String value) {
        this.recurseFileSystem = value;
    }

}
