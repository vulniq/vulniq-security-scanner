


package org.mitre.oval.xmlschema.oval_system_characteristics_5_android;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBinaryType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}ItemType">
 *       &lt;sequence>
 *         &lt;element name="trusted_certificate" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBinaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "trustedCertificate"
})
public class CertificateItem
    extends ItemType
{

    @XmlElement(name = "trusted_certificate", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected List<EntityItemBinaryType> trustedCertificate;

    /**
     * Gets the value of the trustedCertificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trustedCertificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrustedCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemBinaryType }
     * 
     * 
     */
    public List<EntityItemBinaryType> getTrustedCertificate() {
        if (trustedCertificate == null) {
            trustedCertificate = new ArrayList<EntityItemBinaryType>();
        }
        return this.trustedCertificate;
    }

}
