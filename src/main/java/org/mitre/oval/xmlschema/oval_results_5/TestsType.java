
package org.mitre.oval.xmlschema.oval_results_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The TestsType complex type is a container for one or more test elements. Each test element holds the result of the evaluation of an OVAL Test. Please refer to the description of TestType for more information about an individual test element.
 * 
 * <p>Java class for TestsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="test" type="{http://oval.mitre.org/XMLSchema/oval-results-5}TestType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestsType", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", propOrder = {
    "test"
})
public class TestsType {

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", required = true)
    protected List<TestType> test;

    /**
     * Gets the value of the test property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the test property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestType }
     * 
     * 
     */
    public List<TestType> getTest() {
        if (test == null) {
            test = new ArrayList<TestType>();
        }
        return this.test;
    }

}
