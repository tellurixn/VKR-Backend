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
import javax.xml.bind.annotation.XmlType;


/**
 * Адрес места жительства
 * 
 * <p>Java class for АдрМЖТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="АдрМЖТип"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="АдрМЖРФ"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="АдрРФФИАС" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}АдрРФТип"/&gt;
 *                   &lt;element name="АдрРФНеФИАС" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}АдрРФТип"/&gt;
 *                   &lt;element name="АдрТекст" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-512"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="АдрМЖИн"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="ПрОКСМ"&gt;
 *                       &lt;simpleType&gt;
 *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1"&gt;
 *                           &lt;enumeration value="1"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/simpleType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="ОКСМ" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ОКСМТип"/&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="АдрТекст" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-512"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="АдрМЖКонв" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-512"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0410\u0434\u0440\u041c\u0416\u0422\u0438\u043f", propOrder = {
    "\u0430\u0434\u0440\u041c\u0416\u0420\u0424",
    "\u0430\u0434\u0440\u041c\u0416\u0418\u043d",
    "\u0430\u0434\u0440\u041c\u0416\u041a\u043e\u043d\u0432"
})
public class АдрМЖТип {

    @XmlElement(name = "\u0410\u0434\u0440\u041c\u0416\u0420\u0424")
    protected АдрМЖТип.АдрМЖРФ адрМЖРФ;
    @XmlElement(name = "\u0410\u0434\u0440\u041c\u0416\u0418\u043d")
    protected АдрМЖТип.АдрМЖИн адрМЖИн;
    @XmlElement(name = "\u0410\u0434\u0440\u041c\u0416\u041a\u043e\u043d\u0432")
    protected String адрМЖКонв;

    /**
     * Gets the value of the адрМЖРФ property.
     * 
     * @return
     *     possible object is
     *     {@link АдрМЖТип.АдрМЖРФ }
     *     
     */
    public АдрМЖТип.АдрМЖРФ getАдрМЖРФ() {
        return адрМЖРФ;
    }

    /**
     * Sets the value of the адрМЖРФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link АдрМЖТип.АдрМЖРФ }
     *     
     */
    public void setАдрМЖРФ(АдрМЖТип.АдрМЖРФ value) {
        this.адрМЖРФ = value;
    }

    /**
     * Gets the value of the адрМЖИн property.
     * 
     * @return
     *     possible object is
     *     {@link АдрМЖТип.АдрМЖИн }
     *     
     */
    public АдрМЖТип.АдрМЖИн getАдрМЖИн() {
        return адрМЖИн;
    }

    /**
     * Sets the value of the адрМЖИн property.
     * 
     * @param value
     *     allowed object is
     *     {@link АдрМЖТип.АдрМЖИн }
     *     
     */
    public void setАдрМЖИн(АдрМЖТип.АдрМЖИн value) {
        this.адрМЖИн = value;
    }

    /**
     * Gets the value of the адрМЖКонв property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getАдрМЖКонв() {
        return адрМЖКонв;
    }

    /**
     * Sets the value of the адрМЖКонв property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setАдрМЖКонв(String value) {
        this.адрМЖКонв = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;choice&gt;
     *           &lt;element name="ПрОКСМ"&gt;
     *             &lt;simpleType&gt;
     *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1"&gt;
     *                 &lt;enumeration value="1"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/simpleType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="ОКСМ" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ОКСМТип"/&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="АдрТекст" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-512"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u043f\u0440\u041e\u041a\u0421\u041c",
        "\u043e\u043a\u0441\u043c",
        "\u0430\u0434\u0440\u0422\u0435\u043a\u0441\u0442"
    })
    public static class АдрМЖИн {

        @XmlElement(name = "\u041f\u0440\u041e\u041a\u0421\u041c")
        protected String прОКСМ;
        @XmlElement(name = "\u041e\u041a\u0421\u041c")
        protected String оксм;
        @XmlElement(name = "\u0410\u0434\u0440\u0422\u0435\u043a\u0441\u0442", required = true)
        protected String адрТекст;

        /**
         * Gets the value of the прОКСМ property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getПрОКСМ() {
            return прОКСМ;
        }

        /**
         * Sets the value of the прОКСМ property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setПрОКСМ(String value) {
            this.прОКСМ = value;
        }

        /**
         * Gets the value of the оксм property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getОКСМ() {
            return оксм;
        }

        /**
         * Sets the value of the оксм property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setОКСМ(String value) {
            this.оксм = value;
        }

        /**
         * Gets the value of the адрТекст property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getАдрТекст() {
            return адрТекст;
        }

        /**
         * Sets the value of the адрТекст property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setАдрТекст(String value) {
            this.адрТекст = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="АдрРФФИАС" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}АдрРФТип"/&gt;
     *         &lt;element name="АдрРФНеФИАС" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}АдрРФТип"/&gt;
     *         &lt;element name="АдрТекст" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-512"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0430\u0434\u0440\u0420\u0424\u0424\u0418\u0410\u0421",
        "\u0430\u0434\u0440\u0420\u0424\u041d\u0435\u0424\u0418\u0410\u0421",
        "\u0430\u0434\u0440\u0422\u0435\u043a\u0441\u0442"
    })
    public static class АдрМЖРФ {

        @XmlElement(name = "\u0410\u0434\u0440\u0420\u0424\u0424\u0418\u0410\u0421")
        protected АдрРФТип адрРФФИАС;
        @XmlElement(name = "\u0410\u0434\u0440\u0420\u0424\u041d\u0435\u0424\u0418\u0410\u0421")
        protected АдрРФТип адрРФНеФИАС;
        @XmlElement(name = "\u0410\u0434\u0440\u0422\u0435\u043a\u0441\u0442")
        protected String адрТекст;

        /**
         * Gets the value of the адрРФФИАС property.
         * 
         * @return
         *     possible object is
         *     {@link АдрРФТип }
         *     
         */
        public АдрРФТип getАдрРФФИАС() {
            return адрРФФИАС;
        }

        /**
         * Sets the value of the адрРФФИАС property.
         * 
         * @param value
         *     allowed object is
         *     {@link АдрРФТип }
         *     
         */
        public void setАдрРФФИАС(АдрРФТип value) {
            this.адрРФФИАС = value;
        }

        /**
         * Gets the value of the адрРФНеФИАС property.
         * 
         * @return
         *     possible object is
         *     {@link АдрРФТип }
         *     
         */
        public АдрРФТип getАдрРФНеФИАС() {
            return адрРФНеФИАС;
        }

        /**
         * Sets the value of the адрРФНеФИАС property.
         * 
         * @param value
         *     allowed object is
         *     {@link АдрРФТип }
         *     
         */
        public void setАдрРФНеФИАС(АдрРФТип value) {
            this.адрРФНеФИАС = value;
        }

        /**
         * Gets the value of the адрТекст property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getАдрТекст() {
            return адрТекст;
        }

        /**
         * Sets the value of the адрТекст property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setАдрТекст(String value) {
            this.адрТекст = value;
        }

    }

}
