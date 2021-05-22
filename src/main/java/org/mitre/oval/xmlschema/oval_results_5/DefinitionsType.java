
package org.mitre.oval.xmlschema.oval_results_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The DefinitionsType complex type is a container for one or more definition elements. Each definition element holds the result of the evaluation of an OVAL Definition. Please refer to the description of DefinitionType for more information about an individual definition element.
 * 
 * <p>Java class for DefinitionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefinitionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="definition" type="{http://oval.mitre.org/XMLSchema/oval-results-5}DefinitionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefinitionsType", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", propOrder = {
    "definition"
})
public class DefinitionsType {

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", required = true)
    protected List<DefinitionType> definition;

    /**
     * Gets the value of the definition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the definition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefinitionType }
     * 
     * 
     */
    public List<DefinitionType> getDefinition() {
        if (definition == null) {
            definition = new ArrayList<DefinitionType>();
        }
        return this.definition;
    }

}
