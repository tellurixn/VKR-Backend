
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedGroupIdentity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedGroupIdentity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refClientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedGroupIdentity", propOrder = {
    "refClientId",
    "refGroupId"
})
public class LinkedGroupIdentity {

    protected String refClientId;
    protected String refGroupId;

    /**
     * Gets the value of the refClientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefClientId() {
        return refClientId;
    }

    /**
     * Sets the value of the refClientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefClientId(String value) {
        this.refClientId = value;
    }

    /**
     * Gets the value of the refGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefGroupId() {
        return refGroupId;
    }

    /**
     * Sets the value of the refGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefGroupId(String value) {
        this.refGroupId = value;
    }

}
