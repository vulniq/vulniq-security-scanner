


package org.mitre.oval.xmlschema.oval_results_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The ResultsType complex type is a container for one or more system elements. Each system element defines the results associated with an individual system. Please refer to the description of SystemType for more information about an individual system element.
 * 
 * <p>Java class for ResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="system" type="{http://oval.mitre.org/XMLSchema/oval-results-5}SystemType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultsType", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", propOrder = {
    "system"
})
public class ResultsType {

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", required = true)
    protected List<SystemType> system;

    /**
     * Gets the value of the system property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the system property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemType }
     * 
     * 
     */
    public List<SystemType> getSystem() {
        if (system == null) {
            system = new ArrayList<SystemType>();
        }
        return this.system;
    }

}
