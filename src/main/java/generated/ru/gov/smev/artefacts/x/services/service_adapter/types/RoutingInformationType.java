
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DynamicRouting" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}DynamicRoutingType" minOccurs="0"/>
 *         &lt;element name="IdentifierRouting" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}IdentifierRoutingType" minOccurs="0"/>
 *         &lt;element name="RegistryRouting" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}RegistryRoutingType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingInformationType", propOrder = {
    "dynamicRouting",
    "identifierRouting",
    "registryRouting"
})
public class RoutingInformationType {

    @XmlElement(name = "DynamicRouting")
    protected DynamicRoutingType dynamicRouting;
    @XmlElement(name = "IdentifierRouting")
    protected IdentifierRoutingType identifierRouting;
    @XmlElement(name = "RegistryRouting")
    protected RegistryRoutingType registryRouting;

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

    /**
     * Gets the value of the registryRouting property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryRoutingType }
     *     
     */
    public RegistryRoutingType getRegistryRouting() {
        return registryRouting;
    }

    /**
     * Sets the value of the registryRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryRoutingType }
     *     
     */
    public void setRegistryRouting(RegistryRoutingType value) {
        this.registryRouting = value;
    }

}
