
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistryRoutingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistryRoutingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegistryRecordRouting" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}RegistryRecordRoutingType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryRoutingType", propOrder = {
    "registryRecordRouting"
})
public class RegistryRoutingType {

    @XmlElement(name = "RegistryRecordRouting", required = true)
    protected List<RegistryRecordRoutingType> registryRecordRouting;

    /**
     * Gets the value of the registryRecordRouting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registryRecordRouting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistryRecordRouting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistryRecordRoutingType }
     * 
     * 
     */
    public List<RegistryRecordRoutingType> getRegistryRecordRouting() {
        if (registryRecordRouting == null) {
            registryRecordRouting = new ArrayList<RegistryRecordRoutingType>();
        }
        return this.registryRecordRouting;
    }

}
