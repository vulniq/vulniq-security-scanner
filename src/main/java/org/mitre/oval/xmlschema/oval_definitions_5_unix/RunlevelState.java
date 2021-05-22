


package org.mitre.oval.xmlschema.oval_definitions_5_unix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
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
 *         &lt;element name="service_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="runlevel" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="start" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="kill" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "serviceName",
    "runlevel",
    "start",
    "kill"
})
public class RunlevelState
    extends StateType
{

    @XmlElement(name = "service_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateStringType serviceName;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateStringType runlevel;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateBoolType start;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateBoolType kill;

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setServiceName(EntityStateStringType value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the runlevel property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getRunlevel() {
        return runlevel;
    }

    /**
     * Sets the value of the runlevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setRunlevel(EntityStateStringType value) {
        this.runlevel = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setStart(EntityStateBoolType value) {
        this.start = value;
    }

    /**
     * Gets the value of the kill property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getKill() {
        return kill;
    }

    /**
     * Sets the value of the kill property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setKill(EntityStateBoolType value) {
        this.kill = value;
    }

}
