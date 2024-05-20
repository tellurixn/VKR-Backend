
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindTypeCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindTypeCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messagePeriodCriteria" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}MessagePeriodCriteria" minOccurs="0"/>
 *         &lt;element name="messageClientIdCriteria" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}MessageClientIdCriteria" minOccurs="0"/>
 *         &lt;element name="informationSystemCriteria" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}InformationSystemCriteria" minOccurs="0"/>
 *         &lt;element name="MessageCountToReturn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MessageOffset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindTypeCriteria", propOrder = {
    "messagePeriodCriteria",
    "messageClientIdCriteria",
    "informationSystemCriteria",
    "messageCountToReturn",
    "messageOffset"
})
public class FindTypeCriteria {

    protected MessagePeriodCriteria messagePeriodCriteria;
    protected MessageClientIdCriteria messageClientIdCriteria;
    protected InformationSystemCriteria informationSystemCriteria;
    @XmlElement(name = "MessageCountToReturn")
    protected int messageCountToReturn;
    @XmlElement(name = "MessageOffset")
    protected int messageOffset;

    /**
     * Gets the value of the messagePeriodCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link MessagePeriodCriteria }
     *     
     */
    public MessagePeriodCriteria getMessagePeriodCriteria() {
        return messagePeriodCriteria;
    }

    /**
     * Sets the value of the messagePeriodCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagePeriodCriteria }
     *     
     */
    public void setMessagePeriodCriteria(MessagePeriodCriteria value) {
        this.messagePeriodCriteria = value;
    }

    /**
     * Gets the value of the messageClientIdCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link MessageClientIdCriteria }
     *     
     */
    public MessageClientIdCriteria getMessageClientIdCriteria() {
        return messageClientIdCriteria;
    }

    /**
     * Sets the value of the messageClientIdCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageClientIdCriteria }
     *     
     */
    public void setMessageClientIdCriteria(MessageClientIdCriteria value) {
        this.messageClientIdCriteria = value;
    }

    /**
     * Gets the value of the informationSystemCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link InformationSystemCriteria }
     *     
     */
    public InformationSystemCriteria getInformationSystemCriteria() {
        return informationSystemCriteria;
    }

    /**
     * Sets the value of the informationSystemCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationSystemCriteria }
     *     
     */
    public void setInformationSystemCriteria(InformationSystemCriteria value) {
        this.informationSystemCriteria = value;
    }

    /**
     * Gets the value of the messageCountToReturn property.
     * 
     */
    public int getMessageCountToReturn() {
        return messageCountToReturn;
    }

    /**
     * Sets the value of the messageCountToReturn property.
     * 
     */
    public void setMessageCountToReturn(int value) {
        this.messageCountToReturn = value;
    }

    /**
     * Gets the value of the messageOffset property.
     * 
     */
    public int getMessageOffset() {
        return messageOffset;
    }

    /**
     * Sets the value of the messageOffset property.
     * 
     */
    public void setMessageOffset(int value) {
        this.messageOffset = value;
    }

}
