
package org.mitre.oval.xmlschema.oval_common_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageLevelEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageLevelEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="debug"/>
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="fatal"/>
 *     &lt;enumeration value="info"/>
 *     &lt;enumeration value="warning"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageLevelEnumeration", namespace = "http://oval.mitre.org/XMLSchema/oval-common-5")
@XmlEnum
public enum MessageLevelEnumeration {


    /**
     * Debug messages should only be displayed by a tool when run in some sort of verbose mode.
     * 
     */
    @XmlEnumValue("debug")
    DEBUG("debug"),

    /**
     * Error messages should be recorded when there was an error that did not allow the collection of specific data.
     * 
     */
    @XmlEnumValue("error")
    ERROR("error"),

    /**
     * A fatal message should be recorded when an error causes the failure of more than just a single piece of data.
     * 
     */
    @XmlEnumValue("fatal")
    FATAL("fatal"),

    /**
     * Info messages are used to pass useful information about the data collection to a user.
     * 
     */
    @XmlEnumValue("info")
    INFO("info"),

    /**
     * A warning message reports something that might not correct but information was still collected.
     * 
     */
    @XmlEnumValue("warning")
    WARNING("warning");
    private final String value;

    MessageLevelEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageLevelEnumeration fromValue(String v) {
        for (MessageLevelEnumeration c: MessageLevelEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
