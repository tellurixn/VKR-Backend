
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MTOM"/>
 *     &lt;enumeration value="REFERENCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransferMethodType")
@XmlEnum
public enum TransferMethodType {

    MTOM,
    REFERENCE;

    public String value() {
        return name();
    }

    public static TransferMethodType fromValue(String v) {
        return valueOf(v);
    }

}
