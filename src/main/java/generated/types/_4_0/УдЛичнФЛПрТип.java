//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.05.19 at 01:58:34 PM GMT+07:00 
//


package generated.types._4_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о документе, удостоверяющем личность физического лица (с признаком отсутствия)
 * 
 * <p>Java class for УдЛичнФЛПрТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="УдЛичнФЛПрТип"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ПрКодВидДок"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1"&gt;
 *                 &lt;enumeration value="1"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="КодВидДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}СПДУЛТип"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ПрСерДок"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1"&gt;
 *                 &lt;enumeration value="1"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="СерДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1_40"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ПрНомДок"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1"&gt;
 *                 &lt;enumeration value="1"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="НомДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1_40"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ПрДатаДок"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1"&gt;
 *                 &lt;enumeration value="1"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ДатаДокКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;element name="ДатаДокНеполн" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ДатаДокТип"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ПрВыдДок"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1"&gt;
 *                 &lt;enumeration value="1"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ВыдДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1000"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ПрКодВыдДок"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1"&gt;
 *                 &lt;enumeration value="1"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="КодВыдДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-7"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b\u041f\u0440\u0422\u0438\u043f", propOrder = {
    "\u043f\u0440\u041a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a",
    "\u043a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a",
    "\u043f\u0440\u0421\u0435\u0440\u0414\u043e\u043a",
    "\u0441\u0435\u0440\u0414\u043e\u043a",
    "\u043f\u0440\u041d\u043e\u043c\u0414\u043e\u043a",
    "\u043d\u043e\u043c\u0414\u043e\u043a",
    "\u043f\u0440\u0414\u0430\u0442\u0430\u0414\u043e\u043a",
    "\u0434\u0430\u0442\u0430\u0414\u043e\u043a\u041a\u0430\u043b\u0435\u043d\u0434",
    "\u0434\u0430\u0442\u0430\u0414\u043e\u043a\u041d\u0435\u043f\u043e\u043b\u043d",
    "\u043f\u0440\u0412\u044b\u0434\u0414\u043e\u043a",
    "\u0432\u044b\u0434\u0414\u043e\u043a",
    "\u043f\u0440\u041a\u043e\u0434\u0412\u044b\u0434\u0414\u043e\u043a",
    "\u043a\u043e\u0434\u0412\u044b\u0434\u0414\u043e\u043a"
})
public class УдЛичнФЛПрТип {

    @XmlElement(name = "\u041f\u0440\u041a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a")
    protected String прКодВидДок;
    @XmlElement(name = "\u041a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a")
    protected String кодВидДок;
    @XmlElement(name = "\u041f\u0440\u0421\u0435\u0440\u0414\u043e\u043a")
    protected String прСерДок;
    @XmlElement(name = "\u0421\u0435\u0440\u0414\u043e\u043a")
    protected String серДок;
    @XmlElement(name = "\u041f\u0440\u041d\u043e\u043c\u0414\u043e\u043a")
    protected String прНомДок;
    @XmlElement(name = "\u041d\u043e\u043c\u0414\u043e\u043a")
    protected String номДок;
    @XmlElement(name = "\u041f\u0440\u0414\u0430\u0442\u0430\u0414\u043e\u043a")
    protected String прДатаДок;
    @XmlElement(name = "\u0414\u0430\u0442\u0430\u0414\u043e\u043a\u041a\u0430\u043b\u0435\u043d\u0434")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаДокКаленд;
    @XmlElement(name = "\u0414\u0430\u0442\u0430\u0414\u043e\u043a\u041d\u0435\u043f\u043e\u043b\u043d")
    protected ДатаДокТип датаДокНеполн;
    @XmlElement(name = "\u041f\u0440\u0412\u044b\u0434\u0414\u043e\u043a")
    protected String прВыдДок;
    @XmlElement(name = "\u0412\u044b\u0434\u0414\u043e\u043a")
    protected String выдДок;
    @XmlElement(name = "\u041f\u0440\u041a\u043e\u0434\u0412\u044b\u0434\u0414\u043e\u043a")
    protected String прКодВыдДок;
    @XmlElement(name = "\u041a\u043e\u0434\u0412\u044b\u0434\u0414\u043e\u043a")
    protected String кодВыдДок;

    /**
     * Gets the value of the прКодВидДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПрКодВидДок() {
        return прКодВидДок;
    }

    /**
     * Sets the value of the прКодВидДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПрКодВидДок(String value) {
        this.прКодВидДок = value;
    }

    /**
     * Gets the value of the кодВидДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодВидДок() {
        return кодВидДок;
    }

    /**
     * Sets the value of the кодВидДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодВидДок(String value) {
        this.кодВидДок = value;
    }

    /**
     * Gets the value of the прСерДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПрСерДок() {
        return прСерДок;
    }

    /**
     * Sets the value of the прСерДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПрСерДок(String value) {
        this.прСерДок = value;
    }

    /**
     * Gets the value of the серДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getСерДок() {
        return серДок;
    }

    /**
     * Sets the value of the серДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setСерДок(String value) {
        this.серДок = value;
    }

    /**
     * Gets the value of the прНомДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПрНомДок() {
        return прНомДок;
    }

    /**
     * Sets the value of the прНомДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПрНомДок(String value) {
        this.прНомДок = value;
    }

    /**
     * Gets the value of the номДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНомДок() {
        return номДок;
    }

    /**
     * Sets the value of the номДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНомДок(String value) {
        this.номДок = value;
    }

    /**
     * Gets the value of the прДатаДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПрДатаДок() {
        return прДатаДок;
    }

    /**
     * Sets the value of the прДатаДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПрДатаДок(String value) {
        this.прДатаДок = value;
    }

    /**
     * Gets the value of the датаДокКаленд property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаДокКаленд() {
        return датаДокКаленд;
    }

    /**
     * Sets the value of the датаДокКаленд property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаДокКаленд(XMLGregorianCalendar value) {
        this.датаДокКаленд = value;
    }

    /**
     * Gets the value of the датаДокНеполн property.
     * 
     * @return
     *     possible object is
     *     {@link ДатаДокТип }
     *     
     */
    public ДатаДокТип getДатаДокНеполн() {
        return датаДокНеполн;
    }

    /**
     * Sets the value of the датаДокНеполн property.
     * 
     * @param value
     *     allowed object is
     *     {@link ДатаДокТип }
     *     
     */
    public void setДатаДокНеполн(ДатаДокТип value) {
        this.датаДокНеполн = value;
    }

    /**
     * Gets the value of the прВыдДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПрВыдДок() {
        return прВыдДок;
    }

    /**
     * Sets the value of the прВыдДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПрВыдДок(String value) {
        this.прВыдДок = value;
    }

    /**
     * Gets the value of the выдДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВыдДок() {
        return выдДок;
    }

    /**
     * Sets the value of the выдДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВыдДок(String value) {
        this.выдДок = value;
    }

    /**
     * Gets the value of the прКодВыдДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПрКодВыдДок() {
        return прКодВыдДок;
    }

    /**
     * Sets the value of the прКодВыдДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПрКодВыдДок(String value) {
        this.прКодВыдДок = value;
    }

    /**
     * Gets the value of the кодВыдДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодВыдДок() {
        return кодВыдДок;
    }

    /**
     * Sets the value of the кодВыдДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодВыдДок(String value) {
        this.кодВыдДок = value;
    }

}
