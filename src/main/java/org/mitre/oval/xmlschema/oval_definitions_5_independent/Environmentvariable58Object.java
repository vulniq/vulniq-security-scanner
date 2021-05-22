


package org.mitre.oval.xmlschema.oval_definitions_5_independent;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.Filter;
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
 *             &lt;element name="pid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectIntType"/>
 *             &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
 *             &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}filter" maxOccurs="unbounded" minOccurs="0"/>
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
    "pid",
    "name",
    "filter"
})
public class Environmentvariable58Object
    extends ObjectType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected Set set;
    @XmlElementRef(name = "pid", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityObjectIntType> pid;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
    protected EntityObjectStringType name;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected List<Filter> filter;

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
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityObjectIntType }{@code >}
     *     
     */
    public JAXBElement<EntityObjectIntType> getPid() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityObjectIntType }{@code >}
     *     
     */
    public void setPid(JAXBElement<EntityObjectIntType> value) {
        this.pid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link EntityObjectStringType }
     *     
     */
    public EntityObjectStringType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityObjectStringType }
     *     
     */
    public void setName(EntityObjectStringType value) {
        this.name = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Filter }
     * 
     * 
     */
    public List<Filter> getFilter() {
        if (filter == null) {
            filter = new ArrayList<Filter>();
        }
        return this.filter;
    }

}
