


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlagEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlagEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="complete"/>
 *     &lt;enumeration value="incomplete"/>
 *     &lt;enumeration value="does not exist"/>
 *     &lt;enumeration value="not collected"/>
 *     &lt;enumeration value="not applicable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlagEnumeration", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5")
@XmlEnum
public enum FlagEnumeration {


    /**
     * A flag of 'error' indicates that there was an error trying to identify items on the system that match the specified object declaration. This flag is not meant to be used when there was an error retrieving a specific entity, but rather when it could not be determined if an item exists or not. Any error in retrieving a specific entity should be represented by setting the status of that specific entity to 'error'.
     * 
     */
    @XmlEnumValue("error")
    ERROR("error"),

    /**
     * A flag of 'complete' indicates that every matching item on the system has been identified and is represented in the system characteristics file. It can be assumed that no additional matching items exist on the system.
     * 
     */
    @XmlEnumValue("complete")
    COMPLETE("complete"),

    /**
     * A flag of 'incomplete' indicates that a matching item exists on the system, but only some of the matching items have been identified and are represented in the system characteristics file. It is unknown if additional matching items also exist. Note that with a flag of 'incomplete', each item that has been identified  matches the object declaration, but additional items might also exist on the system.
     * 
     */
    @XmlEnumValue("incomplete")
    INCOMPLETE("incomplete"),

    /**
     * A flag of 'does not exist' indicates that the underlying structure is installed on the system but no matching item was found. For example, the Windows metabase is installed but there were no items that matched the metabase_object. In this example, if the metabase itself was not installed, then the flag would have been 'not applicable'.
     * 
     */
    @XmlEnumValue("does not exist")
    DOES_NOT_EXIST("does not exist"),

    /**
     * A flag of 'not collected' indicates that no attempt was made to collect items on the system. An object with this flag will produce an 'unknown' result during analysis since it is unknown if matching items exists on the system or not. This is different from an 'error' flag because an 'error' flag indicates that an attempt was made to collect items on system whereas a 'not collected' flag indicates that an attempt was not made to collect items on the system.
     * 
     */
    @XmlEnumValue("not collected")
    NOT_COLLECTED("not collected"),

    /**
     * A flag of 'not applicable' indicates that the specified object is not applicable to the system being characterized. This could be because the data repository is not installed or that the object structure is for a different flavor of systems. An example would be trying to collect objects related to a Red Hat system off of a Windows system. Another example would be trying to collect an rpminfo_object on a Linux system if the rpm packaging system is not installed. If the rpm packaging system is installed and the specified rpminfo_object could not be found, then the flag would be 'does not exist'.
     * 
     */
    @XmlEnumValue("not applicable")
    NOT_APPLICABLE("not applicable");
    private final String value;

    FlagEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlagEnumeration fromValue(String v) {
        for (FlagEnumeration c: FlagEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
