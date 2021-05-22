
package org.mitre.oval.xmlschema.oval_definitions_5_ios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectRefType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateRefType;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}TestType">
 *       &lt;sequence>
 *         &lt;element name="object" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}ObjectRefType"/>
 *         &lt;element name="state" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}StateRefType" maxOccurs="unbounded" minOccurs="0"/>
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
    "object",
    "state"
})
public class RouterTest
    extends TestType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios", required = true)
    protected ObjectRefType object;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected List<StateRefType> state;

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setObject(ObjectRefType value) {
        this.object = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the state property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StateRefType }
     * 
     * 
     */
    public List<StateRefType> getState() {
        if (state == null) {
            state = new ArrayList<StateRefType>();
        }
        return this.state;
    }

}
