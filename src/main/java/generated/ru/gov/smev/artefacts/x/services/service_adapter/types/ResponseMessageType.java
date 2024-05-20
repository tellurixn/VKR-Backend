
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}Message">
 *       &lt;sequence>
 *         &lt;element name="ResponseMetadata" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}ResponseMetadataType"/>
 *         &lt;element name="ResponseContent" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}ResponseContentType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseMessageType", propOrder = {
    "responseMetadata",
    "responseContent"
})
public class ResponseMessageType
    extends Message
{

    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "ResponseContent", required = true)
    protected ResponseContentType responseContent;

    /**
     * Gets the value of the responseMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMetadataType }
     *     
     */
    public ResponseMetadataType getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Sets the value of the responseMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMetadataType }
     *     
     */
    public void setResponseMetadata(ResponseMetadataType value) {
        this.responseMetadata = value;
    }

    /**
     * Gets the value of the responseContent property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseContentType }
     *     
     */
    public ResponseContentType getResponseContent() {
        return responseContent;
    }

    /**
     * Sets the value of the responseContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseContentType }
     *     
     */
    public void setResponseContent(ResponseContentType value) {
        this.responseContent = value;
    }

}
