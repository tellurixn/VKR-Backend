
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="content" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}Content" minOccurs="0"/>
 *         &lt;element name="rejects" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}Reject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}Status" minOccurs="0"/>
 *         &lt;element name="originalContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseContentType", propOrder = {
    "content",
    "rejects",
    "status",
    "originalContent"
})
public class ResponseContentType {

    protected Content content;
    @XmlElement(nillable = true)
    protected List<Reject> rejects;
    protected Status status;
    protected String originalContent;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    public Content getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    public void setContent(Content value) {
        this.content = value;
    }

    /**
     * Gets the value of the rejects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reject }
     * 
     * 
     */
    public List<Reject> getRejects() {
        if (rejects == null) {
            rejects = new ArrayList<Reject>();
        }
        return this.rejects;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the originalContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalContent() {
        return originalContent;
    }

    /**
     * Sets the value of the originalContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalContent(String value) {
        this.originalContent = value;
    }

}
