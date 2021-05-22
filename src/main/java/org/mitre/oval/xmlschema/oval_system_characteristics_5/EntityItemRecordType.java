


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Note that when the mask attribute is set to 'true', all child field elements must be masked regardless of the child field's mask attribute value.
 * 
 * <p>Java class for EntityItemRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemRecordType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemComplexBaseType">
 *       &lt;sequence>
 *         &lt;element name="field" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemFieldType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityItemRecordType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", propOrder = {
    "field"
})
public class EntityItemRecordType
    extends EntityItemComplexBaseType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5")
    protected List<EntityItemFieldType> field;

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemFieldType }
     * 
     * 
     */
    public List<EntityItemFieldType> getField() {
        if (field == null) {
            field = new ArrayList<EntityItemFieldType>();
        }
        return this.field;
    }

}
