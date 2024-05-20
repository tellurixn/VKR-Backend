
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RequestMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}Metadata">
 *       &lt;sequence>
 *         &lt;element name="linkedGroupIdentity" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}LinkedGroupIdentity" minOccurs="0"/>
 *         &lt;element name="createGroupIdentity" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}CreateGroupIdentity" minOccurs="0"/>
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eol" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="testMessage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessProcessMetadata" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}BusinessProcessMetadata" minOccurs="0"/>
 *         &lt;element name="RoutingInformation" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}RoutingInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMetadataType", propOrder = {
    "linkedGroupIdentity",
    "createGroupIdentity",
    "nodeId",
    "eol",
    "testMessage",
    "transactionCode",
    "businessProcessMetadata",
    "routingInformation"
})
public class RequestMetadataType
    extends Metadata
{

    protected LinkedGroupIdentity linkedGroupIdentity;
    protected CreateGroupIdentity createGroupIdentity;
    protected String nodeId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eol;
    protected Boolean testMessage;
    @XmlElement(name = "TransactionCode")
    protected String transactionCode;
    @XmlElement(name = "BusinessProcessMetadata")
    protected BusinessProcessMetadata businessProcessMetadata;
    @XmlElement(name = "RoutingInformation")
    protected RoutingInformationType routingInformation;

    /**
     * Gets the value of the linkedGroupIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedGroupIdentity }
     *     
     */
    public LinkedGroupIdentity getLinkedGroupIdentity() {
        return linkedGroupIdentity;
    }

    /**
     * Sets the value of the linkedGroupIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedGroupIdentity }
     *     
     */
    public void setLinkedGroupIdentity(LinkedGroupIdentity value) {
        this.linkedGroupIdentity = value;
    }

    /**
     * Gets the value of the createGroupIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link CreateGroupIdentity }
     *     
     */
    public CreateGroupIdentity getCreateGroupIdentity() {
        return createGroupIdentity;
    }

    /**
     * Sets the value of the createGroupIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateGroupIdentity }
     *     
     */
    public void setCreateGroupIdentity(CreateGroupIdentity value) {
        this.createGroupIdentity = value;
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
     * Gets the value of the eol property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEol() {
        return eol;
    }

    /**
     * Sets the value of the eol property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEol(XMLGregorianCalendar value) {
        this.eol = value;
    }

    /**
     * Gets the value of the testMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTestMessage() {
        return testMessage;
    }

    /**
     * Sets the value of the testMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTestMessage(Boolean value) {
        this.testMessage = value;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the businessProcessMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessProcessMetadata }
     *     
     */
    public BusinessProcessMetadata getBusinessProcessMetadata() {
        return businessProcessMetadata;
    }

    /**
     * Sets the value of the businessProcessMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessProcessMetadata }
     *     
     */
    public void setBusinessProcessMetadata(BusinessProcessMetadata value) {
        this.businessProcessMetadata = value;
    }

    /**
     * Gets the value of the routingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingInformationType }
     *     
     */
    public RoutingInformationType getRoutingInformation() {
        return routingInformation;
    }

    /**
     * Sets the value of the routingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingInformationType }
     *     
     */
    public void setRoutingInformation(RoutingInformationType value) {
        this.routingInformation = value;
    }

}
