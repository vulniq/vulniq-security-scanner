


package org.mitre.oval.xmlschema.oval_common_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FamilyEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FamilyEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="android"/>
 *     &lt;enumeration value="asa"/>
 *     &lt;enumeration value="apple_ios"/>
 *     &lt;enumeration value="catos"/>
 *     &lt;enumeration value="ios"/>
 *     &lt;enumeration value="iosxe"/>
 *     &lt;enumeration value="junos"/>
 *     &lt;enumeration value="macos"/>
 *     &lt;enumeration value="pixos"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="unix"/>
 *     &lt;enumeration value="vmware_infrastructure"/>
 *     &lt;enumeration value="windows"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FamilyEnumeration", namespace = "http://oval.mitre.org/XMLSchema/oval-common-5")
@XmlEnum
public enum FamilyEnumeration {


    /**
     * The android value describes the Android mobile operating system.
     * 
     */
    @XmlEnumValue("android")
    ANDROID("android"),

    /**
     * The asa value describes the Cisco ASA security devices.
     * 
     */
    @XmlEnumValue("asa")
    ASA("asa"),

    /**
     * The apple_ios value describes the iOS mobile operating system.
     * 
     */
    @XmlEnumValue("apple_ios")
    APPLE_IOS("apple_ios"),

    /**
     * The catos value describes the Cisco CatOS operating system.
     * 
     */
    @XmlEnumValue("catos")
    CATOS("catos"),

    /**
     * The ios value describes the Cisco IOS operating system.
     * 
     */
    @XmlEnumValue("ios")
    IOS("ios"),

    /**
     * The iosxe value describes the Cisco IOS XE operating system.
     * 
     */
    @XmlEnumValue("iosxe")
    IOSXE("iosxe"),

    /**
     * The junos value describes the Juniper JunOS operating system.
     * 
     */
    @XmlEnumValue("junos")
    JUNOS("junos"),

    /**
     * The macos value describes the Mac operating system.
     * 
     */
    @XmlEnumValue("macos")
    MACOS("macos"),

    /**
     * The pixos value describes the Cisco PIX operating system.
     * 
     */
    @XmlEnumValue("pixos")
    PIXOS("pixos"),

    /**
     * The undefined value is to be used when the desired family is not available.
     * 
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),

    /**
     * The unix value describes the UNIX operating system.
     * 
     */
    @XmlEnumValue("unix")
    UNIX("unix"),

    /**
     * The vmware_infrastructure value describes VMWare Infrastructure.
     * 
     */
    @XmlEnumValue("vmware_infrastructure")
    VMWARE_INFRASTRUCTURE("vmware_infrastructure"),

    /**
     * The windows value describes the Microsoft Windows operating system.
     * 
     */
    @XmlEnumValue("windows")
    WINDOWS("windows");
    private final String value;

    FamilyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FamilyEnumeration fromValue(String v) {
        for (FamilyEnumeration c: FamilyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
