
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryTypeCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryTypeCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageTypeCriteria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryTypeCriteria", propOrder = {
    "messageTypeCriteria"
})
public class QueryTypeCriteria {

    @XmlElement(required = true)
    protected String messageTypeCriteria;

    /**
     * Gets the value of the messageTypeCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageTypeCriteria() {
        return messageTypeCriteria;
    }

    /**
     * Sets the value of the messageTypeCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageTypeCriteria(String value) {
        this.messageTypeCriteria = value;
    }

}
