package com.example.demo.controllers;


import com.example.demo.models.db.InfoType;
import com.example.demo.models.db.ServiceMessage;
import com.example.demo.models.db.User;
import com.example.demo.models.xmls.root.FATALINFRequest;
import com.example.demo.models.xmls.types.ОрганЗАГСНТип;
import com.example.demo.models.xmls.types.УдЛичнФЛСНТип;
import com.example.demo.models.xmls.types.ФИОПрТип;
import com.example.demo.repositories.InfoTypeRepository;
import com.example.demo.repositories.ServiceMessageRepository;

import com.example.demo.repositories.UserInfoTypeRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.Principal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

import com.example.demo.models.jsons.JsonSendRequest;
import com.example.demo.models.jsons.JsonSendRequest.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/")
public class MainController {
    public static final String SERVICE_NAME = "AdapterSMEV";
    public static final String IS_NAME = "WebService";
    public static final String FATALINF = "Предоставление из ЕГР ЗАГС по запросу сведений о смерти";
    public static final String SEND_URL = "http://localhost:7590/ws/send";
    public static final String GET_URL = "http://localhost:7590/ws/get";
    public static final String FIND_URL = "http://localhost:7590/ws/find";

    @Autowired
    ServiceMessageRepository serviceRequestRepository;
    @Autowired
    InfoTypeRepository infoTypeRepository;
    @Autowired
    UserInfoTypeRepository userInfoTypeRepository;
    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String index(
            Model model,
            Principal principal
    ) {
        boolean isAdapterRunning = checkIfServiceRunning(SERVICE_NAME);
        boolean isAdapterStarted = true;
        if (!isAdapterRunning)
            isAdapterStarted = startService(SERVICE_NAME);


        User current_user = userRepository.findByUsername(principal.getName());

        List<InfoType> allowedTypes = current_user.getTypes();
        model.addAttribute("types", allowedTypes);

        model.addAttribute("isAdapterRunning", isAdapterRunning);
        return "index";
    }

    @GetMapping("/history")
    public String history(
            Model model,
            Principal principal
    ) {
        boolean isAdapterRunning = checkIfServiceRunning(SERVICE_NAME);
        boolean isAdapterStarted = true;
        if (!isAdapterRunning)
            isAdapterStarted = startService(SERVICE_NAME);

        User user = userRepository.findByUsername(principal.getName());
        Iterable<ServiceMessage> messages = user.getHistory();

        model.addAttribute("messages", messages);
        model.addAttribute("isAdapterRunning", isAdapterRunning);
        return "history";
    }

    @GetMapping("/egr_zags")
    public String egr_zags(
            Model model,
            Principal principal
    ) {
        boolean isAdapterRunning = checkIfServiceRunning(SERVICE_NAME);
        boolean isAdapterStarted = true;
        if (!isAdapterRunning)
            isAdapterStarted = startService(SERVICE_NAME);

        model.addAttribute("isAdapterRunning", isAdapterRunning);
        return "EGR_ZAGS_Request";
    }

    @PostMapping("/egr_zags")
    public RedirectView sendEgrZagsRequest(
            @RequestParam Map<String, String> requestParams,
            Principal principal
    )
            throws DatatypeConfigurationException {

        FATALINFRequest request = new FATALINFRequest();

        /*Атрибуты запроса*/
        request.setИдЗапрос(UUID.randomUUID().toString());
        request.setКолДок(BigInteger.ONE);
        request.setТипАГС("07");

        /*Сведения о нормативно-правовых основаниях запрашивающей стороны для получения сведений
        из ЕГР ЗАГС об актах гражданского состояния о смерти*/
        FATALINFRequest.СведОсн svedOsn = new FATALINFRequest.СведОсн();
        if (requestParams.get("ogrRaspDoc") != null) {
            svedOsn.setПрСведДокОсн("1");
            svedOsn.setСведДокОсн(requestParams.get("orgRaspDoc"));
        } else {
            svedOsn.setПрСведДокОсн("0");
        }
        svedOsn.setКодНормОсн(requestParams.get("codeOsn"));
        request.setСведОсн(svedOsn);

        FATALINFRequest.СведЗапрос svedZapros = new FATALINFRequest.СведЗапрос();
        //svedZapros.setИдДок(requestParams.get("documentId"));
        svedZapros.setИдДок(UUID.randomUUID().toString());
        if (requestParams.get("subjectName") == null)
            svedZapros.setПрРегионРегАГС("0");
        else {
            svedZapros.setПрРегионРегАГС("1");
            svedZapros.setРегионРегАГС(requestParams.get("subjectName"));
        }


        /*Сведения о государственной регистрации АГС о смерти, в отношении которого сформирован запрос*/
        FATALINFRequest.СведЗапрос.СведАГС svedAGS = new FATALINFRequest.СведЗапрос.СведАГС();
        svedAGS.setНомерЗапис(requestParams.get("actNumber"));
        LocalDate localDocCreatedDate = LocalDate.parse(requestParams.get("docCreatedDate"));
        XMLGregorianCalendar xmlDocCreatedDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(localDocCreatedDate.toString());
        svedAGS.setДатаЗапис(xmlDocCreatedDate);
        ОрганЗАГСНТип zags = new ОрганЗАГСНТип();
        zags.setНаимЗАГС(requestParams.get("ZAGS"));
        zags.setКодЗАГС(requestParams.get("ZAGSCode"));
        svedAGS.setОрганЗАГС(zags);
        svedZapros.setСведАГС(svedAGS);

        /*Сведения о физическом лице*/
        FATALINFRequest.СведЗапрос.СведФЛ svedFL = new FATALINFRequest.СведЗапрос.СведФЛ();
        svedFL.setСНИЛС(requestParams.get("SNILS"));

        ФИОПрТип fio = new ФИОПрТип();
        if (requestParams.get("LastName") == null) {
            fio.setПрФамилия("0");
        } else {
            fio.setПрФамилия("1");
            fio.setФамилия(requestParams.get("LastName"));
        }
        if (requestParams.get("FirstName") == null) {
            fio.setПрИмя("0");
        } else {
            fio.setПрИмя("1");
            fio.setИмя(requestParams.get("FirstName"));
        }
        if (requestParams.get("Patronymic") == null) {
            fio.setПрОтчество("0");
        } else {
            fio.setПрОтчество("1");
            fio.setОтчество(requestParams.get("Patronymic"));
        }
        svedFL.setФИО(fio);

        if (requestParams.get("birthday").isEmpty()) {
            svedFL.setПрДатаРожд("0");
        } else {
            svedFL.setПрДатаРожд("1");
            LocalDate localBirthday = LocalDate.parse(requestParams.get("birthday"));
            XMLGregorianCalendar xmlBirthday = DatatypeFactory.newInstance().newXMLGregorianCalendar(localBirthday.toString());
            svedFL.setДатаРождКаленд(xmlBirthday);
        }


        /*Документ, удостоверяющий личность*/
        if (!requestParams.get("docCode").isEmpty()) {
            УдЛичнФЛСНТип udLich = new УдЛичнФЛСНТип();
            udLich.setКодВидДок(requestParams.get("docCode"));
            udLich.setСерДок(requestParams.get("docSeries"));
            udLich.setНомДок(requestParams.get("docNumber"));
            LocalDate localDocDate = LocalDate.parse(requestParams.get("docDate"));
            XMLGregorianCalendar xmlDocDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(localDocDate.toString());
            udLich.setДатаДок(xmlDocDate);
            udLich.setВыдДок(requestParams.get("orgName"));
            udLich.setКодВыдДок(requestParams.get("orgCode"));
            svedFL.setУдЛичнФЛ(udLich);
        }

        svedZapros.setСведФЛ(svedFL);



        /*Добавление сведений в запрос*/
        request.getСведЗапрос().add(svedZapros);


        try {
            String clientId = UUID.randomUUID().toString();

            //Преобразование объекта запроса в xml-строку
            JAXBContext context = JAXBContext.newInstance(FATALINFRequest.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter originalXmlContent = new StringWriter();
            marshaller.marshal(request, originalXmlContent);


            //Формирование конверта сообщения
            String requestToSend = new JsonSendRequest(
                    "WebService",
                    new RequestMessage(
                            "RequestMessageType",
                            new RequestMetadata(clientId, false),
                            new RequestContent(
                                    new Content(
                                            new MessagePrimaryContent(originalXmlContent.toString()
                                                    .replaceAll("\n", "")
                                                    .replaceAll("\t", "")
                                                    .replaceAll("\"", "\\\"")
                                            )
                                    )
                            )
                    )
            ).toJson();


            //Сохранение запроса в БД
            ServiceMessage newFATALINFRequest = new ServiceMessage(
                    clientId,
                    requestToSend,
                    originalXmlContent.toString(),
                    "Новый",
                    LocalDateTime.now(),
                    FATALINF,
                    "Запрос"
            );
            serviceRequestRepository.save(newFATALINFRequest);
            User user = userRepository.findByUsername(principal.getName());
            user.getHistory().add(newFATALINFRequest);
            userRepository.save(user);

            //Отправка сообщения в ИУА
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            RestTemplate restTemplate = new RestTemplate();
            HttpEntity<String> requestEntity = new HttpEntity<>(
                    requestToSend,
                    headers);
            String response = restTemplate.postForObject(SEND_URL, requestEntity, String.class);

            System.out.println("Sync response: " + response);

        } catch (javax.xml.bind.JAXBException e) {
            e.printStackTrace();
        }

        return new RedirectView("/history");
    }

    @GetMapping("/egr_zags_etalon")
    public RedirectView sendEgrZagsEtalonRequest(
            Principal principal
    ) {

        /* Эталонный запрос
         *
         *       <?xml version="1.0" encoding="UTF-8"?>
         *         <ns1:FATALINFRequest xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:fns="urn://x-artefacts-zags-fatalinf/types/4.0.1" xmlns:ns1="urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1" ИдЗапрос="0bde2079-eded-11ea-952d-00155d01aa22" КолДок="1" ТипАГС="07" xsi:schemaLocation="urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1 zags-fatalinf-ru-root.xsd">
         *             <ns1:СведОсн КодНормОсн="01">
         *                   <ns1:ПрСведДокОсн>1</ns1:ПрСведДокОсн>
         *             </ns1:СведОсн>
         *             <ns1:СведЗапрос ИдДок="0bde2079-eded-11ea-952d-00155d01aa21">
         *                 <ns1:СведАГС НомерЗапис="1234">
         *                     <ns1:ДатаЗапис>2020-05-01</ns1:ДатаЗапис>
         *                     <ns1:ОрганЗАГС НаимЗАГС="Отдел Государственной службы записи актов гражданского состояния Республики Ингушетия Джейрахского района" КодЗАГС="R0600004"/>
         *                 </ns1:СведАГС>
         *                 <ns1:СведФЛ >
         *                     <ns1:ФИО>
         *                         <fns:Фамилия>Иванова</fns:Фамилия>
         *                         <fns:Имя>Мария</fns:Имя>
         *                         <fns:Отчество>Петровна</fns:Отчество>
         *                     </ns1:ФИО>
         *                     <ns1:ПрДатаРожд>1</ns1:ПрДатаРожд>
         *                 </ns1:СведФЛ>
         *                 <ns1:ПрРегионРегАГС>1</ns1:ПрРегионРегАГС>
         *             </ns1:СведЗапрос>
         *         </ns1:FATALINFRequest>}
         *
         */

        String etalon = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<!--Sample XML file generated by XMLSpy v2017 rel. 3 sp1 (x64) (http://www.altova.com)-->\n" +
                "<ns1:FATALINFRequest xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:fns=\"urn://x-artefacts-zags-fatalinf/types/4.0.1\" xmlns:ns1=\"urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1\" ИдЗапрос=\"0bde2079-eded-11ea-952d-00155d01aa22\" КолДок=\"1\" ТипАГС=\"07\" xsi:schemaLocation=\"urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1 zags-fatalinf-ru-root.xsd\">\n" +
                "\t<ns1:СведОсн КодНормОсн=\"01\">\n" +
                "\t\t<ns1:ПрСведДокОсн>1</ns1:ПрСведДокОсн>\n" +
                "\t</ns1:СведОсн>\n" +
                "\t<ns1:СведЗапрос ИдДок=\"0bde2079-eded-11ea-952d-00155d01aa21\">\n" +
                "\t\t<ns1:СведАГС НомерЗапис=\"1234\">\n" +
                "\t\t\t<ns1:ДатаЗапис>2020-05-01</ns1:ДатаЗапис>\n" +
                "\t\t\t<ns1:ОрганЗАГС НаимЗАГС=\"Отдел Государственной службы записи актов гражданского состояния Республики Ингушетия Джейрахского района\" КодЗАГС=\"R0600004\"/>\n" +
                "\t\t</ns1:СведАГС>\n" +
                "\t\t<ns1:СведФЛ >\n" +
                "\t\t\t<ns1:ФИО>\n" +
                "\t\t\t\t<fns:Фамилия>Иванова</fns:Фамилия>\n" +
                "\t\t\t\t<fns:Имя>Мария</fns:Имя>\n" +
                "\t\t\t\t<fns:Отчество>Петровна</fns:Отчество>\n" +
                "\t\t\t</ns1:ФИО>\n" +
                "\t\t\t<ns1:ПрДатаРожд>1</ns1:ПрДатаРожд>\n" +
                "\t\t</ns1:СведФЛ>\n" +
                "\t\t<ns1:ПрРегионРегАГС>1</ns1:ПрРегионРегАГС>\n" +
                "\t</ns1:СведЗапрос>\n" +
                "</ns1:FATALINFRequest>\n";


        String clientId = UUID.randomUUID().toString();


        //Формирование конверта сообщения
        String requestToSend = new JsonSendRequest(
                "WebService",
                new RequestMessage(
                        "RequestMessageType",
                        new RequestMetadata(clientId, true),
                        new RequestContent(
                                new Content(
                                        new MessagePrimaryContent(etalon
                                                .replaceAll("\n", "")
                                                .replaceAll("\t","")
                                                .replaceAll("\"", "\\\"")
                                        )
                                )
                        )
                )
        ).toJson();


        //Сохранение запроса в БД
        ServiceMessage newFATALINFRequest = new ServiceMessage(
                clientId,
                requestToSend,
                etalon,
                "Новый",
                LocalDateTime.now(),
                "Эталонный запрос | " + FATALINF,
                "Запрос"
        );
        serviceRequestRepository.save(newFATALINFRequest);

        ServiceMessage message = serviceRequestRepository.findByClientId(newFATALINFRequest.getId());
        User user = userRepository.findByUsername(principal.getName());
        user.getHistory().add(message);
        userRepository.save(user);

        //Отправка сообщения в ИУА
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> requestEntity = new HttpEntity<>(
                requestToSend,
                headers);
        String response = restTemplate.postForObject(SEND_URL, requestEntity, String.class);

        System.out.println("Sync response: " + response);


        return new RedirectView("/history");
    }


    /**
     * Функция для проверки состояния службы ИУА СМЭВ3
     *
     * @param serviceName название службы
     * @return true, если служба адаптера запущена, false, если не запущена
     */
    public static final boolean checkIfServiceRunning(String serviceName) {
        Process process;
        try {
            process = Runtime.getRuntime().exec("sc query " + serviceName);
            Scanner reader = new Scanner(process.getInputStream(), "UTF-8");
            while (reader.hasNextLine()) {
                if (reader.nextLine().contains("RUNNING")) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Функция для запуска службы ИУА СМЭВ3
     *
     * @param serviceName название службы
     * @return true, если служба адаптера смогла запуститься, false - в противном случае
     */
    public static final boolean startService(String serviceName) {
        try {
            Process process = Runtime.getRuntime().exec("sc start " + serviceName);
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("Service '" + serviceName + "' started successfully.");
                return true;
            } else {
                System.out.println("Failed to start service '" + serviceName + "'.");
                return false;
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }

}
