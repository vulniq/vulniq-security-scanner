
package org.mitre.oval.xmlschema.oval_common_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The MessageType complex type defines the structure for which messages are relayed from the data collection engine. Each message is a text string that has an associated level attribute identifying the type of message being sent. These messages could be error messages, warning messages, debug messages, etc. How the messages are used by tools and whether or not they are displayed to the user is up to the specific implementation. Please refer to the description of the MessageLevelEnumeration for more information about each type of message.
 * 
 * <p>Java class for MessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="level" type="{http://oval.mitre.org/XMLSchema/oval-common-5}MessageLevelEnumeration" default="info" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageType", namespace = "http://oval.mitre.org/XMLSchema/oval-common-5", propOrder = {
    "value"
})
public class MessageType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "level")
    protected MessageLevelEnumeration level;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link MessageLevelEnumeration }
     *     
     */
    public MessageLevelEnumeration getLevel() {
        if (level == null) {
            return MessageLevelEnumeration.INFO;
        } else {
            return level;
        }
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageLevelEnumeration }
     *     
     */
    public void setLevel(MessageLevelEnumeration value) {
        this.level = value;
    }

}
