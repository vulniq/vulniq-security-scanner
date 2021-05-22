
package org.mitre.oval.xmlschema.oval_common_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExistenceEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExistenceEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="all_exist"/>
 *     &lt;enumeration value="any_exist"/>
 *     &lt;enumeration value="at_least_one_exists"/>
 *     &lt;enumeration value="none_exist"/>
 *     &lt;enumeration value="only_one_exists"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExistenceEnumeration", namespace = "http://oval.mitre.org/XMLSchema/oval-common-5")
@XmlEnum
public enum ExistenceEnumeration {


    /**
     * When used in the context of an OVAL state entity's check_existence attribute, a value of 'all_exist' means that every item entity for an object defined by the description exists on the system. When used in the context of an OVAL test's check_existence attribute, this value is equivalent to 'at_least_one_exists' because non-existent items have no impact upon evaluation.
     * 
     */
    @XmlEnumValue("all_exist")
    ALL_EXIST("all_exist"),

    /**
     * A value of 'any_exist' means that zero or more objects defined by the description exist on the system.
     * 
     */
    @XmlEnumValue("any_exist")
    ANY_EXIST("any_exist"),

    /**
     * A value of 'at_least_one_exists' means that at least one object defined by the description exists on the system.
     * 
     */
    @XmlEnumValue("at_least_one_exists")
    AT_LEAST_ONE_EXISTS("at_least_one_exists"),

    /**
     * A value of 'none_exist' means that none of the objects defined by the description exist on the system.
     * 
     */
    @XmlEnumValue("none_exist")
    NONE_EXIST("none_exist"),

    /**
     * A value of 'only_one_exists' means that only one object defined by the description exists on the system.
     * 
     */
    @XmlEnumValue("only_one_exists")
    ONLY_ONE_EXISTS("only_one_exists");
    private final String value;

    ExistenceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExistenceEnumeration fromValue(String v) {
        for (ExistenceEnumeration c: ExistenceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
