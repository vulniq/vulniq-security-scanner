


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The InterfacesType complex type is a container for zero or more interface elements. Each interface element is used to describe an existing network interface on the system.
 * 
 * <p>Java class for InterfacesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfacesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interface" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}InterfaceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfacesType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", propOrder = {
    "_interface"
})
public class InterfacesType {

    @XmlElement(name = "interface", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5")
    protected List<InterfaceType> _interface;

    /**
     * Gets the value of the interface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterfaceType }
     * 
     * 
     */
    public List<InterfaceType> getInterface() {
        if (_interface == null) {
            _interface = new ArrayList<InterfaceType>();
        }
        return this._interface;
    }

}
