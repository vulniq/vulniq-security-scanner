


package org.mitre.oval.xmlschema.oval_definitions_5_independent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The Textfilecontent54Behaviors extend the ind-def:FileBehaviors and therefore include the behaviors defined by that type.
 * 
 * <p>Java class for Textfilecontent54Behaviors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Textfilecontent54Behaviors">
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5#independent}FileBehaviors">
 *       &lt;attribute name="ignore_case" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="multiline" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="singleline" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Textfilecontent54Behaviors", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
public class Textfilecontent54Behaviors
    extends FileBehaviors
{

    @XmlAttribute(name = "ignore_case")
    protected Boolean ignoreCase;
    @XmlAttribute(name = "multiline")
    protected Boolean multiline;
    @XmlAttribute(name = "singleline")
    protected Boolean singleline;

    /**
     * Gets the value of the ignoreCase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIgnoreCase() {
        if (ignoreCase == null) {
            return false;
        } else {
            return ignoreCase;
        }
    }

    /**
     * Sets the value of the ignoreCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreCase(Boolean value) {
        this.ignoreCase = value;
    }

    /**
     * Gets the value of the multiline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMultiline() {
        if (multiline == null) {
            return true;
        } else {
            return multiline;
        }
    }

    /**
     * Sets the value of the multiline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiline(Boolean value) {
        this.multiline = value;
    }

    /**
     * Gets the value of the singleline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSingleline() {
        if (singleline == null) {
            return false;
        } else {
            return singleline;
        }
    }

    /**
     * Sets the value of the singleline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSingleline(Boolean value) {
        this.singleline = value;
    }

}
