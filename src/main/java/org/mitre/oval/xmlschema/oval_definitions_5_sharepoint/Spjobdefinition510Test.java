


package org.mitre.oval.xmlschema.oval_definitions_5_sharepoint;

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
 *         &lt;element name="state" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}StateRefType" minOccurs="0"/>
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
public class Spjobdefinition510Test
    extends TestType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint", required = true)
    protected ObjectRefType object;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected StateRefType state;

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
     * @return
     *     possible object is
     *     {@link StateRefType }
     *     
     */
    public StateRefType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateRefType }
     *     
     */
    public void setState(StateRefType value) {
        this.state = value;
    }

}
