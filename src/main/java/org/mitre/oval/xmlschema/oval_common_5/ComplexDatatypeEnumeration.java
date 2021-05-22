
package org.mitre.oval.xmlschema.oval_common_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComplexDatatypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComplexDatatypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="record"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComplexDatatypeEnumeration", namespace = "http://oval.mitre.org/XMLSchema/oval-common-5")
@XmlEnum
public enum ComplexDatatypeEnumeration {


    /**
     * The record datatype describes an entity with structured set of named fields and values as its content. The only allowed operation within OVAL for record values is 'equals'. Note that the record datatype is not currently allowed when using variables.
     * 
     */
    @XmlEnumValue("record")
    RECORD("record");
    private final String value;

    ComplexDatatypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComplexDatatypeEnumeration fromValue(String v) {
        for (ComplexDatatypeEnumeration c: ComplexDatatypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
