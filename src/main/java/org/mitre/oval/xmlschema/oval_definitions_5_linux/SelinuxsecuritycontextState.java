


package org.mitre.oval.xmlschema.oval_definitions_5_linux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
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
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="path" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="filename" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="user" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="role" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="low_sensitivity" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="low_category" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="high_sensitivity" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="high_category" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="rawlow_sensitivity" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="rawlow_category" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="rawhigh_sensitivity" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="rawhigh_category" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "filepath",
    "path",
    "filename",
    "pid",
    "user",
    "role",
    "type",
    "lowSensitivity",
    "lowCategory",
    "highSensitivity",
    "highCategory",
    "rawlowSensitivity",
    "rawlowCategory",
    "rawhighSensitivity",
    "rawhighCategory"
})
public class SelinuxsecuritycontextState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType filepath;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType path;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType filename;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIntType pid;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType user;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType role;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType type;
    @XmlElement(name = "low_sensitivity", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType lowSensitivity;
    @XmlElement(name = "low_category", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType lowCategory;
    @XmlElement(name = "high_sensitivity", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType highSensitivity;
    @XmlElement(name = "high_category", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType highCategory;
    @XmlElement(name = "rawlow_sensitivity", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType rawlowSensitivity;
    @XmlElement(name = "rawlow_category", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType rawlowCategory;
    @XmlElement(name = "rawhigh_sensitivity", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType rawhighSensitivity;
    @XmlElement(name = "rawhigh_category", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType rawhighCategory;

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
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPath(EntityStateStringType value) {
        this.path = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setFilename(EntityStateStringType value) {
        this.filename = value;
    }

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPid() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPid(EntityStateIntType value) {
        this.pid = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUser(EntityStateStringType value) {
        this.user = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setRole(EntityStateStringType value) {
        this.role = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setType(EntityStateStringType value) {
        this.type = value;
    }

    /**
     * Gets the value of the lowSensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLowSensitivity() {
        return lowSensitivity;
    }

    /**
     * Sets the value of the lowSensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLowSensitivity(EntityStateStringType value) {
        this.lowSensitivity = value;
    }

    /**
     * Gets the value of the lowCategory property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLowCategory() {
        return lowCategory;
    }

    /**
     * Sets the value of the lowCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLowCategory(EntityStateStringType value) {
        this.lowCategory = value;
    }

    /**
     * Gets the value of the highSensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getHighSensitivity() {
        return highSensitivity;
    }

    /**
     * Sets the value of the highSensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setHighSensitivity(EntityStateStringType value) {
        this.highSensitivity = value;
    }

    /**
     * Gets the value of the highCategory property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getHighCategory() {
        return highCategory;
    }

    /**
     * Sets the value of the highCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setHighCategory(EntityStateStringType value) {
        this.highCategory = value;
    }

    /**
     * Gets the value of the rawlowSensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getRawlowSensitivity() {
        return rawlowSensitivity;
    }

    /**
     * Sets the value of the rawlowSensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setRawlowSensitivity(EntityStateStringType value) {
        this.rawlowSensitivity = value;
    }

    /**
     * Gets the value of the rawlowCategory property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getRawlowCategory() {
        return rawlowCategory;
    }

    /**
     * Sets the value of the rawlowCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setRawlowCategory(EntityStateStringType value) {
        this.rawlowCategory = value;
    }

    /**
     * Gets the value of the rawhighSensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getRawhighSensitivity() {
        return rawhighSensitivity;
    }

    /**
     * Sets the value of the rawhighSensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setRawhighSensitivity(EntityStateStringType value) {
        this.rawhighSensitivity = value;
    }

    /**
     * Gets the value of the rawhighCategory property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getRawhighCategory() {
        return rawhighCategory;
    }

    /**
     * Sets the value of the rawhighCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setRawhighCategory(EntityStateStringType value) {
        this.rawhighCategory = value;
    }

}
