
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientIdCriteria.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClientIdCriteria">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GET_REQUEST_BY_REQUEST_CLIENTID"/>
 *     &lt;enumeration value="GET_RESPONSE_BY_REQUEST_CLIENTID"/>
 *     &lt;enumeration value="GET_RESPONSE_BY_RESPONSE_CLIENTID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClientIdCriteria")
@XmlEnum
public enum ClientIdCriteria {

    GET_REQUEST_BY_REQUEST_CLIENTID,
    GET_RESPONSE_BY_REQUEST_CLIENTID,
    GET_RESPONSE_BY_RESPONSE_CLIENTID;

    public String value() {
        return name();
    }

    public static ClientIdCriteria fromValue(String v) {
        return valueOf(v);
    }

}
