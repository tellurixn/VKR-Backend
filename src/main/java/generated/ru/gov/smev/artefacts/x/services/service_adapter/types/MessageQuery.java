
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routerExtraQueue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specificQuery" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}QueryTypeCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageQuery", propOrder = {
    "itSystem",
    "nodeId",
    "routerExtraQueue",
    "specificQuery"
})
public class MessageQuery {

    @XmlElement(required = true)
    protected String itSystem;
    protected String nodeId;
    protected String routerExtraQueue;
    protected QueryTypeCriteria specificQuery;

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
     * Gets the value of the nodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Sets the value of the nodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeId(String value) {
        this.nodeId = value;
    }

    /**
     * Gets the value of the routerExtraQueue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouterExtraQueue() {
        return routerExtraQueue;
    }

    /**
     * Sets the value of the routerExtraQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouterExtraQueue(String value) {
        this.routerExtraQueue = value;
    }

    /**
     * Gets the value of the specificQuery property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTypeCriteria }
     *     
     */
    public QueryTypeCriteria getSpecificQuery() {
        return specificQuery;
    }

    /**
     * Sets the value of the specificQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTypeCriteria }
     *     
     */
    public void setSpecificQuery(QueryTypeCriteria value) {
        this.specificQuery = value;
    }

}
