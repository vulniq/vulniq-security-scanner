


package org.mitre.oval.xmlschema.oval_definitions_5_independent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}ObjectType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}set"/>
 *           &lt;sequence>
 *             &lt;element name="behaviors" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#independent}FileBehaviors" minOccurs="0"/>
 *             &lt;element name="path" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
 *             &lt;element name="filename" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
 *             &lt;element name="line" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
 *           &lt;/sequence>
 *         &lt;/choice>
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
    "set",
    "behaviors",
    "path",
    "filename",
    "line"
})
public class TextfilecontentObject
    extends ObjectType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected Set set;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
    protected FileBehaviors behaviors;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
    protected EntityObjectStringType path;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
    protected EntityObjectStringType filename;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
    protected EntityObjectStringType line;

    /**
     * Gets the value of the set property.
     * 
     * @return
     *     possible object is
     *     {@link Set }
     *     
     */
    public Set getSet() {
        return set;
    }

    /**
     * Sets the value of the set property.
     * 
     * @param value
     *     allowed object is
     *     {@link Set }
     *     
     */
    public void setSet(Set value) {
        this.set = value;
    }

    /**
     * Gets the value of the behaviors property.
     * 
     * @return
     *     possible object is
     *     {@link FileBehaviors }
     *     
     */
    public FileBehaviors getBehaviors() {
        return behaviors;
    }

    /**
     * Sets the value of the behaviors property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileBehaviors }
     *     
     */
    public void setBehaviors(FileBehaviors value) {
        this.behaviors = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link EntityObjectStringType }
     *     
     */
    public EntityObjectStringType getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityObjectStringType }
     *     
     */
    public void setPath(EntityObjectStringType value) {
        this.path = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link EntityObjectStringType }
     *     
     */
    public EntityObjectStringType getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityObjectStringType }
     *     
     */
    public void setFilename(EntityObjectStringType value) {
        this.filename = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link EntityObjectStringType }
     *     
     */
    public EntityObjectStringType getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityObjectStringType }
     *     
     */
    public void setLine(EntityObjectStringType value) {
        this.line = value;
    }

}
