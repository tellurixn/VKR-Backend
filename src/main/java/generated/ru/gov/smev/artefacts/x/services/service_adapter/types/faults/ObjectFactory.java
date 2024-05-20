
package generated.ru.gov.smev.artefacts.x.services.service_adapter.types.faults;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.gov.smev.artefacts.x.services.service_adapter.types.faults package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidationFault_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/service-adapter/types/faults", "ValidationFault");
    private final static QName _SystemFault_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/service-adapter/types/faults", "SystemFault");
    private final static QName _SyncFault_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/service-adapter/types/faults", "SyncFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.gov.smev.artefacts.x.services.service_adapter.types.faults
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidationFault }
     * 
     */
    public ValidationFault createValidationFault() {
        return new ValidationFault();
    }

    /**
     * Create an instance of {@link SystemFault }
     * 
     */
    public SystemFault createSystemFault() {
        return new SystemFault();
    }

    /**
     * Create an instance of {@link SyncFault }
     * 
     */
    public SyncFault createSyncFault() {
        return new SyncFault();
    }

    /**
     * Create an instance of {@link Fault }
     * 
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types/faults", name = "ValidationFault")
    public JAXBElement<ValidationFault> createValidationFault(ValidationFault value) {
        return new JAXBElement<ValidationFault>(_ValidationFault_QNAME, ValidationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types/faults", name = "SystemFault")
    public JAXBElement<SystemFault> createSystemFault(SystemFault value) {
        return new JAXBElement<SystemFault>(_SystemFault_QNAME, SystemFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types/faults", name = "SyncFault")
    public JAXBElement<SyncFault> createSyncFault(SyncFault value) {
        return new JAXBElement<SyncFault>(_SyncFault_QNAME, SyncFault.class, null, value);
    }

}
