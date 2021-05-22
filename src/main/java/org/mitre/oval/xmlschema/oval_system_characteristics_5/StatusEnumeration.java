
package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="exists"/>
 *     &lt;enumeration value="does not exist"/>
 *     &lt;enumeration value="not collected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusEnumeration", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5")
@XmlEnum
public enum StatusEnumeration {


    /**
     * A status of 'error' says that there was an error collecting information associated with an item as a whole or any specific entity. An item would have a status of 'error' if a problem occurred that prevented the item from being collected. For example, a file_item would have a status of 'error' if a handle to the file could not be opened because the handle was already in use by another program. See the documentation for ItemType for information about when an item entity status of 'error' should propagate up to the item status level.
     * 
     */
    @XmlEnumValue("error")
    ERROR("error"),

    /**
     * A status of 'exists' says that the item or specific piece of information exists on the system and has been collected.
     * 
     */
    @XmlEnumValue("exists")
    EXISTS("exists"),

    /**
     * A status of 'does not exist' says that the item or specific piece of information does not exist and therefore has not been collected. This status assumes that an attempt was made to collect the information, but the information just does not exist. This can happen when a certain entity is only pertinent to particular instances or if the information for that entity is not set.
     * 
     */
    @XmlEnumValue("does not exist")
    DOES_NOT_EXIST("does not exist"),

    /**
     * A status of 'not collected' says that no attempt was made to collect the item or specific piece of information so it is unknown what the value is and if it even exists.
     * 
     */
    @XmlEnumValue("not collected")
    NOT_COLLECTED("not collected");
    private final String value;

    StatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusEnumeration fromValue(String v) {
        for (StatusEnumeration c: StatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
