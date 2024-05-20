
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}Message">
 *       &lt;sequence>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queryFilter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queryRootTag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMessageType", propOrder = {
    "clientId",
    "nodeId",
    "queryType",
    "queryFilter",
    "queryRootTag"
})
public class QueryMessageType
    extends Message
{

    @XmlElement(required = true)
    protected String clientId;
    protected String nodeId;
    @XmlElement(required = true)
    protected String queryType;
    @XmlElement(required = true)
    protected String queryFilter;
    @XmlElement(required = true)
    protected String queryRootTag;

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
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
     * Gets the value of the queryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryType() {
        return queryType;
    }

    /**
     * Sets the value of the queryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryType(String value) {
        this.queryType = value;
    }

    /**
     * Gets the value of the queryFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryFilter() {
        return queryFilter;
    }

    /**
     * Sets the value of the queryFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryFilter(String value) {
        this.queryFilter = value;
    }

    /**
     * Gets the value of the queryRootTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryRootTag() {
        return queryRootTag;
    }

    /**
     * Sets the value of the queryRootTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryRootTag(String value) {
        this.queryRootTag = value;
    }

}
