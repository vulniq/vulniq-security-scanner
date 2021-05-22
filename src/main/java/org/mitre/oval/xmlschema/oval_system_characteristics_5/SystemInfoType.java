


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Additional system information is also allowed although it is not part of the official OVAL Schema. Individual organizations can place system information that they feel is important and these will be skipped during the validation. All OVAL really cares about is that the required system information items are there.
 * 
 * <p>Java class for SystemInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="os_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="os_version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="architecture" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primary_host_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="interfaces" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}InterfacesType"/>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemInfoType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", propOrder = {
    "osName",
    "osVersion",
    "architecture",
    "primaryHostName",
    "interfaces",
    "any"
})
public class SystemInfoType {

    @XmlElement(name = "os_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", required = true)
    protected String osName;
    @XmlElement(name = "os_version", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", required = true)
    protected String osVersion;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", required = true)
    protected String architecture;
    @XmlElement(name = "primary_host_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", required = true)
    protected String primaryHostName;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", required = true)
    protected InterfacesType interfaces;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the osName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsName() {
        return osName;
    }

    /**
     * Sets the value of the osName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsName(String value) {
        this.osName = value;
    }

    /**
     * Gets the value of the osVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * Sets the value of the osVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsVersion(String value) {
        this.osVersion = value;
    }

    /**
     * Gets the value of the architecture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * Sets the value of the architecture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchitecture(String value) {
        this.architecture = value;
    }

    /**
     * Gets the value of the primaryHostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryHostName() {
        return primaryHostName;
    }

    /**
     * Sets the value of the primaryHostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryHostName(String value) {
        this.primaryHostName = value;
    }

    /**
     * Gets the value of the interfaces property.
     * 
     * @return
     *     possible object is
     *     {@link InterfacesType }
     *     
     */
    public InterfacesType getInterfaces() {
        return interfaces;
    }

    /**
     * Sets the value of the interfaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfacesType }
     *     
     */
    public void setInterfaces(InterfacesType value) {
        this.interfaces = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
