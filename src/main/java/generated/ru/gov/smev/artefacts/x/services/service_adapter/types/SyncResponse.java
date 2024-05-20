
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smevMetadata" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}SmevMetadata"/>
 *         &lt;element name="Message" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}Message"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncResponse", propOrder = {
    "smevMetadata",
    "message"
})
public class SyncResponse {

    @XmlElement(required = true)
    protected SmevMetadata smevMetadata;
    @XmlElement(name = "Message", required = true)
    protected Message message;

    /**
     * Gets the value of the smevMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link SmevMetadata }
     *     
     */
    public SmevMetadata getSmevMetadata() {
        return smevMetadata;
    }

    /**
     * Sets the value of the smevMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmevMetadata }
     *     
     */
    public void setSmevMetadata(SmevMetadata value) {
        this.smevMetadata = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link Message }
     *     
     */
    public Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link Message }
     *     
     */
    public void setMessage(Message value) {
        this.message = value;
    }

}
