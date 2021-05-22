


package org.mitre.oval.xmlschema.oval_definitions_5_linux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The RpmInfoBehaviors complex type defines a set of behaviors for controlling what
 *                     data, for installed rpms, is collected. This behavior aligns with the rpm command.
 *                
 * 
 * <p>Java class for RpmInfoBehaviors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RpmInfoBehaviors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="filepaths" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RpmInfoBehaviors", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
public class RpmInfoBehaviors {

    @XmlAttribute(name = "filepaths")
    protected Boolean filepaths;

    /**
     * Gets the value of the filepaths property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFilepaths() {
        if (filepaths == null) {
            return false;
        } else {
            return filepaths;
        }
    }

    /**
     * Sets the value of the filepaths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilepaths(Boolean value) {
        this.filepaths = value;
    }

}
