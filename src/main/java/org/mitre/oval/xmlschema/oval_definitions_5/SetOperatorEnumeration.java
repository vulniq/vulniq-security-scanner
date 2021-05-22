


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetOperatorEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SetOperatorEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMPLEMENT"/>
 *     &lt;enumeration value="INTERSECTION"/>
 *     &lt;enumeration value="UNION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SetOperatorEnumeration", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
@XmlEnum
public enum SetOperatorEnumeration {


    /**
     * The complement operator is defined in OVAL as a relative complement. The resulting unique set contains everything that belongs to the first declared set that is not part of the second declared set. If A and B are sets (with A being the first declared set), then the relative complement is the set of elements in A, but not in B, with the duplicates removed.
     * 
     */
    COMPLEMENT,

    /**
     * The intersection of two sets in OVAL results in a unique set that contains everything that belongs to both sets in the collection, but nothing else. If A and B are sets, then the intersection of A and B contains all the elements of A that also belong to B, but no other elements, with the duplicates removed.
     * 
     */
    INTERSECTION,

    /**
     * The union of two sets in OVAL results in a unique set that contains everything that belongs to either of the original sets. If A and B are sets, then the union of A and B contains all the elements of A and all elements of B, with the duplicates removed.
     * 
     */
    UNION;

    public String value() {
        return name();
    }

    public static SetOperatorEnumeration fromValue(String v) {
        return valueOf(v);
    }

}
