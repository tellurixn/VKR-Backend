
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passportId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignaturePKCS7" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="TransferMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReusableAttachment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Archive" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}ArchiveType" minOccurs="0"/>
 *         &lt;element name="RegistryRecords" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}RegistryRecordsType" minOccurs="0"/>
 *         &lt;element name="NamespaceUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentHeaderType", propOrder = {
    "id",
    "filePath",
    "passportId",
    "signaturePKCS7",
    "transferMethod",
    "reusableAttachment",
    "archive",
    "registryRecords",
    "namespaceUri"
})
public class AttachmentHeaderType {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(required = true)
    protected String filePath;
    protected String passportId;
    @XmlElement(name = "SignaturePKCS7")
    protected byte[] signaturePKCS7;
    @XmlElement(name = "TransferMethod")
    protected String transferMethod;
    @XmlElement(name = "ReusableAttachment")
    protected Boolean reusableAttachment;
    @XmlElement(name = "Archive")
    protected ArchiveType archive;
    @XmlElement(name = "RegistryRecords")
    protected RegistryRecordsType registryRecords;
    @XmlElement(name = "NamespaceUri")
    protected String namespaceUri;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the filePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the value of the filePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePath(String value) {
        this.filePath = value;
    }

    /**
     * Gets the value of the passportId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportId() {
        return passportId;
    }

    /**
     * Sets the value of the passportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportId(String value) {
        this.passportId = value;
    }

    /**
     * Gets the value of the signaturePKCS7 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignaturePKCS7() {
        return signaturePKCS7;
    }

    /**
     * Sets the value of the signaturePKCS7 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignaturePKCS7(byte[] value) {
        this.signaturePKCS7 = value;
    }

    /**
     * Gets the value of the transferMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferMethod() {
        return transferMethod;
    }

    /**
     * Sets the value of the transferMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferMethod(String value) {
        this.transferMethod = value;
    }

    /**
     * Gets the value of the reusableAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReusableAttachment() {
        return reusableAttachment;
    }

    /**
     * Sets the value of the reusableAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReusableAttachment(Boolean value) {
        this.reusableAttachment = value;
    }

    /**
     * Gets the value of the archive property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveType }
     *     
     */
    public ArchiveType getArchive() {
        return archive;
    }

    /**
     * Sets the value of the archive property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveType }
     *     
     */
    public void setArchive(ArchiveType value) {
        this.archive = value;
    }

    /**
     * Gets the value of the registryRecords property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryRecordsType }
     *     
     */
    public RegistryRecordsType getRegistryRecords() {
        return registryRecords;
    }

    /**
     * Sets the value of the registryRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryRecordsType }
     *     
     */
    public void setRegistryRecords(RegistryRecordsType value) {
        this.registryRecords = value;
    }

    /**
     * Gets the value of the namespaceUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespaceUri() {
        return namespaceUri;
    }

    /**
     * Sets the value of the namespaceUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespaceUri(String value) {
        this.namespaceUri = value;
    }

}
