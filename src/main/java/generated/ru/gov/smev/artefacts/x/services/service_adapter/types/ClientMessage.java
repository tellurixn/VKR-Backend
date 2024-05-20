
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="replyToQueue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestMessage" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}RequestMessageType" minOccurs="0"/>
 *         &lt;element name="ResponseMessage" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}ResponseMessageType" minOccurs="0"/>
 *         &lt;element name="QueryMessage" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}QueryMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientMessage", propOrder = {
    "itSystem",
    "replyToQueue",
    "requestMessage",
    "responseMessage",
    "queryMessage"
})
public class ClientMessage {

    @XmlElement(required = true)
    protected String itSystem;
    protected String replyToQueue;
    @XmlElement(name = "RequestMessage")
    protected RequestMessageType requestMessage;
    @XmlElement(name = "ResponseMessage")
    protected ResponseMessageType responseMessage;
    @XmlElement(name = "QueryMessage")
    protected QueryMessageType queryMessage;

    /**
     * Gets the value of the itSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItSystem() {
        return itSystem;
    }

    /**
     * Sets the value of the itSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItSystem(String value) {
        this.itSystem = value;
    }

    /**
     * Gets the value of the replyToQueue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyToQueue() {
        return replyToQueue;
    }

    /**
     * Sets the value of the replyToQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyToQueue(String value) {
        this.replyToQueue = value;
    }

    /**
     * Gets the value of the requestMessage property.
     * 
     * @return
     *     possible object is
     *     {@link RequestMessageType }
     *     
     */
    public RequestMessageType getRequestMessage() {
        return requestMessage;
    }

    /**
     * Sets the value of the requestMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestMessageType }
     *     
     */
    public void setRequestMessage(RequestMessageType value) {
        this.requestMessage = value;
    }

    /**
     * Gets the value of the responseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMessageType }
     *     
     */
    public ResponseMessageType getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMessageType }
     *     
     */
    public void setResponseMessage(ResponseMessageType value) {
        this.responseMessage = value;
    }

    /**
     * Gets the value of the queryMessage property.
     * 
     * @return
     *     possible object is
     *     {@link QueryMessageType }
     *     
     */
    public QueryMessageType getQueryMessage() {
        return queryMessage;
    }

    /**
     * Sets the value of the queryMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryMessageType }
     *     
     */
    public void setQueryMessage(QueryMessageType value) {
        this.queryMessage = value;
    }

}
