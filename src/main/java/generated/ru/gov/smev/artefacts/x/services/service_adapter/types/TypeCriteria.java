
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeCriteria.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeCriteria">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RESPONSE"/>
 *     &lt;enumeration value="REQUEST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeCriteria")
@XmlEnum
public enum TypeCriteria {

    RESPONSE,
    REQUEST;

    public String value() {
        return name();
    }

    public static TypeCriteria fromValue(String v) {
        return valueOf(v);
    }

}
