//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.05.31 at 01:01:39 PM GMT+07:00 
//


package com.example.demo.models.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения об органе, которым произведена государственная регистрация акта гражданского состояния
 * 
 * <p>Java class for ОрганЗАГСНТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ОрганЗАГСНТип"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="НаимЗАГС" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1000" /&gt;
 *       &lt;attribute name="КодЗАГС" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-8" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ОрганЗАГСНТип")
public class ОрганЗАГСНТип {

    @XmlAttribute(name = "НаимЗАГС", required = true)
    protected String наимЗАГС;
    @XmlAttribute(name = "КодЗАГС")
    protected String кодЗАГС;

    /**
     * Gets the value of the наимЗАГС property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимЗАГС() {
        return наимЗАГС;
    }

    /**
     * Sets the value of the наимЗАГС property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимЗАГС(String value) {
        this.наимЗАГС = value;
    }

    /**
     * Gets the value of the кодЗАГС property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодЗАГС() {
        return кодЗАГС;
    }

    /**
     * Sets the value of the кодЗАГС property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодЗАГС(String value) {
        this.кодЗАГС = value;
    }

}
