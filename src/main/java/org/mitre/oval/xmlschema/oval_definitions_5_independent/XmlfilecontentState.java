


package org.mitre.oval.xmlschema.oval_definitions_5_independent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateAnySimpleType;
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
 *         &lt;element name="xpath" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="value_of" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateAnySimpleType" minOccurs="0"/>
 *         &lt;element name="windows_view" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#independent}EntityStateWindowsViewType" minOccurs="0"/>
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
    "xpath",
    "valueOf",
    "windowsView"
})
public class XmlfilecontentState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
    protected EntityStateStringType filepath;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
    protected EntityStateStringType path;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
    protected EntityStateStringType filename;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
    protected EntityStateStringType xpath;
    @XmlElement(name = "value_of", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
    protected EntityStateAnySimpleType valueOf;
    @XmlElement(name = "windows_view", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
    protected EntityStateWindowsViewType windowsView;

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
     * Gets the value of the xpath property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getXpath() {
        return xpath;
    }

    /**
     * Sets the value of the xpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setXpath(EntityStateStringType value) {
        this.xpath = value;
    }

    /**
     * Gets the value of the valueOf property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAnySimpleType }
     *     
     */
    public EntityStateAnySimpleType getValueOf() {
        return valueOf;
    }

    /**
     * Sets the value of the valueOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAnySimpleType }
     *     
     */
    public void setValueOf(EntityStateAnySimpleType value) {
        this.valueOf = value;
    }

    /**
     * Gets the value of the windowsView property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateWindowsViewType }
     *     
     */
    public EntityStateWindowsViewType getWindowsView() {
        return windowsView;
    }

    /**
     * Sets the value of the windowsView property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateWindowsViewType }
     *     
     */
    public void setWindowsView(EntityStateWindowsViewType value) {
        this.windowsView = value;
    }

}
