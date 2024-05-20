
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="content" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}Content"/>
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
@XmlType(name = "RequestContentType", propOrder = {
    "content",
    "originalContent"
})
public class RequestContentType {

    @XmlElement(required = true)
    protected Content content;
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
