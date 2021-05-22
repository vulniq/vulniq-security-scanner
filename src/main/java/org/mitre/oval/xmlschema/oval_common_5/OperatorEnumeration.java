
package org.mitre.oval.xmlschema.oval_common_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AND"/>
 *     &lt;enumeration value="ONE"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="XOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperatorEnumeration", namespace = "http://oval.mitre.org/XMLSchema/oval-common-5")
@XmlEnum
public enum OperatorEnumeration {


    /**
     * The AND operator produces a true result if every argument is true. If one or more arguments are false, the result of the AND is false. If one or more of the arguments are unknown, and if none of the arguments are false, then the AND operator produces a result of unknown.
     * 
     */
    AND,

    /**
     * The ONE operator produces a true result if one and only one argument is true. If there are more than argument is true (or if there are no true arguments), the result of the ONE is false. If one or more of the arguments are unknown, then the ONE operator produces a result of unknown.
     * 
     */
    ONE,

    /**
     * The OR operator produces a true result if one or more arguments is true. If every argument is false, the result of the OR is false. If one or more of the arguments are unknown and if none of arguments are true, then the OR operator produces a result of unknown.
     * 
     */
    OR,

    /**
     * XOR is defined to be true if an odd number of its arguments are true, and false otherwise. If any of the arguments are unknown, then the XOR operator produces a result of unknown.
     * 
     */
    XOR;

    public String value() {
        return name();
    }

    public static OperatorEnumeration fromValue(String v) {
        return valueOf(v);
    }

}
