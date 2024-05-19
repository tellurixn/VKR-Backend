//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.05.19 at 01:58:34 PM GMT+07:00 
//


package generated.types._4_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о выданном Свидетельстве
 * 
 * <p>Java class for СведСвидетТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СведСвидетТип"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ПрСерияСвидет"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1"&gt;
 *                 &lt;enumeration value="1"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="СерияСвидет" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-10"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ПрНомерСвидет"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1"&gt;
 *                 &lt;enumeration value="1"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="НомерСвидет" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1_8"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ПрДатаВыдСвидет"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1"&gt;
 *                 &lt;enumeration value="1"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ДатаВыдСвидет" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;element name="ДатаВыдСвидетДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ДатаДокТип"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ТипСвидет" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1"&gt;
 *             &lt;enumeration value="1"/&gt;
 *             &lt;enumeration value="2"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "СведСвидетТип", propOrder = {
    "прСерияСвидет",
    "серияСвидет",
    "прНомерСвидет",
    "номерСвидет",
    "прДатаВыдСвидет",
    "датаВыдСвидет",
    "датаВыдСвидетДок"
})
public class СведСвидетТип {

    @XmlElement(name = "ПрСерияСвидет")
    protected String прСерияСвидет;
    @XmlElement(name = "СерияСвидет")
    protected String серияСвидет;
    @XmlElement(name = "ПрНомерСвидет")
    protected String прНомерСвидет;
    @XmlElement(name = "НомерСвидет")
    protected String номерСвидет;
    @XmlElement(name = "ПрДатаВыдСвидет")
    protected String прДатаВыдСвидет;
    @XmlElement(name = "ДатаВыдСвидет")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаВыдСвидет;
    @XmlElement(name = "ДатаВыдСвидетДок")
    protected ДатаДокТип датаВыдСвидетДок;
    @XmlAttribute(name = "ТипСвидет", required = true)
    protected String типСвидет;

    /**
     * Gets the value of the прСерияСвидет property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПрСерияСвидет() {
        return прСерияСвидет;
    }

    /**
     * Sets the value of the прСерияСвидет property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПрСерияСвидет(String value) {
        this.прСерияСвидет = value;
    }

    /**
     * Gets the value of the серияСвидет property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getСерияСвидет() {
        return серияСвидет;
    }

    /**
     * Sets the value of the серияСвидет property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setСерияСвидет(String value) {
        this.серияСвидет = value;
    }

    /**
     * Gets the value of the прНомерСвидет property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПрНомерСвидет() {
        return прНомерСвидет;
    }

    /**
     * Sets the value of the прНомерСвидет property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПрНомерСвидет(String value) {
        this.прНомерСвидет = value;
    }

    /**
     * Gets the value of the номерСвидет property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНомерСвидет() {
        return номерСвидет;
    }

    /**
     * Sets the value of the номерСвидет property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНомерСвидет(String value) {
        this.номерСвидет = value;
    }

    /**
     * Gets the value of the прДатаВыдСвидет property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПрДатаВыдСвидет() {
        return прДатаВыдСвидет;
    }

    /**
     * Sets the value of the прДатаВыдСвидет property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПрДатаВыдСвидет(String value) {
        this.прДатаВыдСвидет = value;
    }

    /**
     * Gets the value of the датаВыдСвидет property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаВыдСвидет() {
        return датаВыдСвидет;
    }

    /**
     * Sets the value of the датаВыдСвидет property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаВыдСвидет(XMLGregorianCalendar value) {
        this.датаВыдСвидет = value;
    }

    /**
     * Gets the value of the датаВыдСвидетДок property.
     * 
     * @return
     *     possible object is
     *     {@link ДатаДокТип }
     *     
     */
    public ДатаДокТип getДатаВыдСвидетДок() {
        return датаВыдСвидетДок;
    }

    /**
     * Sets the value of the датаВыдСвидетДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link ДатаДокТип }
     *     
     */
    public void setДатаВыдСвидетДок(ДатаДокТип value) {
        this.датаВыдСвидетДок = value;
    }

    /**
     * Gets the value of the типСвидет property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getТипСвидет() {
        return типСвидет;
    }

    /**
     * Sets the value of the типСвидет property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setТипСвидет(String value) {
        this.типСвидет = value;
    }

}
