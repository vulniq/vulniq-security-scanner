


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}ItemType">
 *       &lt;sequence>
 *         &lt;element name="path" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType"/>
 *         &lt;element name="canonical_path" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType"/>
 *         &lt;element name="windows_view" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemWindowsViewType" minOccurs="0"/>
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
    "path",
    "canonicalPath",
    "windowsView"
})
public class JunctionItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", required = true)
    protected EntityItemStringType path;
    @XmlElement(name = "canonical_path", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", required = true)
    protected EntityItemStringType canonicalPath;
    @XmlElement(name = "windows_view", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemWindowsViewType windowsView;

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPath(EntityItemStringType value) {
        this.path = value;
    }

    /**
     * Gets the value of the canonicalPath property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getCanonicalPath() {
        return canonicalPath;
    }

    /**
     * Sets the value of the canonicalPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setCanonicalPath(EntityItemStringType value) {
        this.canonicalPath = value;
    }

    /**
     * Gets the value of the windowsView property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemWindowsViewType }
     *     
     */
    public EntityItemWindowsViewType getWindowsView() {
        return windowsView;
    }

    /**
     * Sets the value of the windowsView property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemWindowsViewType }
     *     
     */
    public void setWindowsView(EntityItemWindowsViewType value) {
        this.windowsView = value;
    }

}
