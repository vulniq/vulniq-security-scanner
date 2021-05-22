
package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArithmeticEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ArithmeticEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="add"/>
 *     &lt;enumeration value="multiply"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ArithmeticEnumeration", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
@XmlEnum
public enum ArithmeticEnumeration {

    @XmlEnumValue("add")
    ADD("add"),
    @XmlEnumValue("multiply")
    MULTIPLY("multiply");
    private final String value;

    ArithmeticEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArithmeticEnumeration fromValue(String v) {
        for (ArithmeticEnumeration c: ArithmeticEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
