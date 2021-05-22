


package org.mitre.oval.xmlschema.oval_results_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="thin"/>
 *     &lt;enumeration value="full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentEnumeration", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5")
@XmlEnum
public enum ContentEnumeration {


    /**
     * A value of 'thin' means only the minimal amount of information will be provided. This is the id associated with an evaluated OVAL Definition and the result of the evaluation. The criteria child element of a definition should not be present when providing thin results. In addition, system characteristic information for the objects used by the given definition should not be presented.
     * 
     */
    @XmlEnumValue("thin")
    THIN("thin"),

    /**
     * A value of 'full' means that very detailed information will be provided allowing in-depth reports to be generated from the results. In addition to the results of the evaluated definition, the results of all extended definitions and tests included in the criteria as well as the actual information collected off the system must be presented.
     * 
     */
    @XmlEnumValue("full")
    FULL("full");
    private final String value;

    ContentEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContentEnumeration fromValue(String v) {
        for (ContentEnumeration c: ContentEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
