
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}Message">
 *       &lt;sequence>
 *         &lt;element name="RequestMetadata" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}RequestMetadataType"/>
 *         &lt;element name="RequestContent" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}RequestContentType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessageType", propOrder = {
    "requestMetadata",
    "requestContent"
})
public class RequestMessageType
    extends Message
{

    @XmlElement(name = "RequestMetadata", required = true)
    protected RequestMetadataType requestMetadata;
    @XmlElement(name = "RequestContent", required = true)
    protected RequestContentType requestContent;

    /**
     * Gets the value of the requestMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link RequestMetadataType }
     *     
     */
    public RequestMetadataType getRequestMetadata() {
        return requestMetadata;
    }

    /**
     * Sets the value of the requestMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestMetadataType }
     *     
     */
    public void setRequestMetadata(RequestMetadataType value) {
        this.requestMetadata = value;
    }

    /**
     * Gets the value of the requestContent property.
     * 
     * @return
     *     possible object is
     *     {@link RequestContentType }
     *     
     */
    public RequestContentType getRequestContent() {
        return requestContent;
    }

    /**
     * Sets the value of the requestContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestContentType }
     *     
     */
    public void setRequestContent(RequestContentType value) {
        this.requestContent = value;
    }

}
