
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCESS_DENIED"/>
 *     &lt;enumeration value="NO_DATA"/>
 *     &lt;enumeration value="UNKNOWN_REQUEST_DESCRIPTION"/>
 *     &lt;enumeration value="FAILURE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RejectCode")
@XmlEnum
public enum RejectCode {

    ACCESS_DENIED,
    NO_DATA,
    UNKNOWN_REQUEST_DESCRIPTION,
    FAILURE;

    public String value() {
        return name();
    }

    public static RejectCode fromValue(String v) {
        return valueOf(v);
    }

}
