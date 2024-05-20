
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistryRecordRoutingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistryRecordRoutingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UseGeneralRouting" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DynamicRouting" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}DynamicRoutingType" minOccurs="0"/>
 *         &lt;element name="IdentifierRouting" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}IdentifierRoutingType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryRecordRoutingType", propOrder = {
    "recordId",
    "useGeneralRouting",
    "dynamicRouting",
    "identifierRouting"
})
public class RegistryRecordRoutingType {

    @XmlElement(name = "RecordId")
    protected int recordId;
    @XmlElement(name = "UseGeneralRouting")
    protected boolean useGeneralRouting;
    @XmlElement(name = "DynamicRouting")
    protected DynamicRoutingType dynamicRouting;
    @XmlElement(name = "IdentifierRouting")
    protected IdentifierRoutingType identifierRouting;

    /**
     * Gets the value of the recordId property.
     * 
     */
    public int getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     * 
     */
    public void setRecordId(int value) {
        this.recordId = value;
    }

    /**
     * Gets the value of the useGeneralRouting property.
     * 
     */
    public boolean isUseGeneralRouting() {
        return useGeneralRouting;
    }

    /**
     * Sets the value of the useGeneralRouting property.
     * 
     */
    public void setUseGeneralRouting(boolean value) {
        this.useGeneralRouting = value;
    }

    /**
     * Gets the value of the dynamicRouting property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicRoutingType }
     *     
     */
    public DynamicRoutingType getDynamicRouting() {
        return dynamicRouting;
    }

    /**
     * Sets the value of the dynamicRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicRoutingType }
     *     
     */
    public void setDynamicRouting(DynamicRoutingType value) {
        this.dynamicRouting = value;
    }

    /**
     * Gets the value of the identifierRouting property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierRoutingType }
     *     
     */
    public IdentifierRoutingType getIdentifierRouting() {
        return identifierRouting;
    }

    /**
     * Sets the value of the identifierRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierRoutingType }
     *     
     */
    public void setIdentifierRouting(IdentifierRoutingType value) {
        this.identifierRouting = value;
    }

}
