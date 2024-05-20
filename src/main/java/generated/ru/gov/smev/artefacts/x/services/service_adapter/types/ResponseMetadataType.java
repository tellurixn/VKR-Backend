
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}Metadata">
 *       &lt;sequence>
 *         &lt;element name="replyToClientId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="replyTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseMetadataType", propOrder = {
    "replyToClientId",
    "replyTo"
})
public class ResponseMetadataType
    extends Metadata
{

    @XmlElement(required = true)
    protected String replyToClientId;
    protected String replyTo;

    /**
     * Gets the value of the replyToClientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyToClientId() {
        return replyToClientId;
    }

    /**
     * Sets the value of the replyToClientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyToClientId(String value) {
        this.replyToClientId = value;
    }

    /**
     * Gets the value of the replyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * Sets the value of the replyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyTo(String value) {
        this.replyTo = value;
    }

}
