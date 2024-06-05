package com.example.demo.controllers;


import com.example.demo.models.db.ServiceMessage;
import com.example.demo.models.xmls.root.FATALINFRequest;
import com.example.demo.models.xmls.types.ОрганЗАГСНТип;
import com.example.demo.models.xmls.types.УдЛичнФЛСНТип;
import com.example.demo.models.xmls.types.ФИОПрТип;
import com.example.demo.repositories.ServiceMessageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
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
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

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



    @GetMapping("/")
    public String index(Model model){
        boolean isAdapterRunning = checkIfServiceRunning(SERVICE_NAME);
        boolean isAdapterStarted = true;
        if(!isAdapterRunning)
            isAdapterStarted = startService(SERVICE_NAME);

        model.addAttribute("isAdapterRunning", isAdapterRunning);
        return "index";
    }

    @GetMapping("/history")
    public String history(Model model){
        boolean isAdapterRunning = checkIfServiceRunning(SERVICE_NAME);
        boolean isAdapterStarted = true;
        if(!isAdapterRunning)
            isAdapterStarted = startService(SERVICE_NAME);

        Iterable<ServiceMessage> messages = serviceRequestRepository.findAll();

        model.addAttribute("messages", messages);
        model.addAttribute("isAdapterRunning", isAdapterRunning);
        return "history";
    }

    @GetMapping("/egr_zags")
    public String egr_zags(Model model){
        boolean isAdapterRunning = checkIfServiceRunning(SERVICE_NAME);
        boolean isAdapterStarted = true;
        if(!isAdapterRunning)
            isAdapterStarted = startService(SERVICE_NAME);

        model.addAttribute("isAdapterRunning", isAdapterRunning);
        return "EGR_ZAGS_Request";
    }

    @PostMapping("/egr_zags")
    public RedirectView sendEgrZagsRequest(@RequestParam Map<String,String> requestParams)
            throws DatatypeConfigurationException {

        FATALINFRequest request = new FATALINFRequest();

        /*Атрибуты запроса*/
        request.setИдЗапрос(UUID.randomUUID().toString());
        request.setКолДок(new BigInteger(requestParams.get("colDoc")));
        request.setТипАГС(requestParams.get("AGSType"));

        /*Сведения о нормативно-правовых основаниях запрашивающей стороны для получения сведений
        из ЕГР ЗАГС об актах гражданского состояния о смерти*/
        FATALINFRequest.СведОсн svedOsn = new FATALINFRequest.СведОсн();
        if(requestParams.get("ogrRaspDoc") != null) {
            svedOsn.setПрСведДокОсн("1");
            svedOsn.setСведДокОсн(requestParams.get("orgRaspDoc"));
        }
        else{
            svedOsn.setПрСведДокОсн("0");
        }
        svedOsn.setКодНормОсн(requestParams.get("codeOsn"));
        request.setСведОсн(svedOsn);

        FATALINFRequest.СведЗапрос svedZapros = new FATALINFRequest.СведЗапрос();
        svedZapros.setИдДок(requestParams.get("documentId"));
        if(requestParams.get("subjectName") == null)
            svedZapros.setПрРегионРегАГС("0");
        else{
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

        if(requestParams.get("birthday") == null) {
            svedFL.setПрДатаРожд("0");
        }
        else{
            svedFL.setПрДатаРожд("1");
            LocalDate localBirthday = LocalDate.parse(requestParams.get("docCreatedDate"));
            XMLGregorianCalendar xmlBirthday = DatatypeFactory.newInstance().newXMLGregorianCalendar(localBirthday.toString());
            svedFL.setДатаРождКаленд(xmlBirthday);
        }


        /*Документ, удостоверяющий личность*/
        УдЛичнФЛСНТип udLich = new УдЛичнФЛСНТип();
        udLich.setКодВидДок(requestParams.get("docCode"));
        udLich.setСерДок(requestParams.get("docSeries"));
        udLich.setНомДок(requestParams.get("docNumber"));
        LocalDate localDocDate = LocalDate.parse(requestParams.get("docCreatedDate"));
        XMLGregorianCalendar xmlDocDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(localDocDate.toString());
        udLich.setДатаДок(xmlDocDate);
        udLich.setВыдДок(requestParams.get("orgName"));
        udLich.setКодВыдДок(requestParams.get("orgCode"));
        svedFL.setУдЛичнФЛ(udLich);
        svedZapros.setСведФЛ(svedFL);



        /*Добавление сведений в запрос*/
        request.getСведЗапрос().add(svedZapros);


        try {
            //Преобразование объекта запроса в xml-строку
            JAXBContext context = JAXBContext.newInstance(FATALINFRequest.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter sw = new StringWriter();
            marshaller.marshal(request, sw);

            //System.out.println(sw);

            //формирование конверта сообщения
            String clientId = UUID.randomUUID().toString();
            String sendRequest = new JsonSendRequest(
                    "WebService",
                    new RequestMessage(
                            "RequestMessageType",
                            new RequestMetadata(clientId, true),
                            new RequestContent(
                                    new Content(
                                            new MessagePrimaryContent(sw.toString().replaceAll("\n"," "))
                                    )
                            )
                    )
            ).toJson();



            //todo GET_RESPONSE_BY_REQUEST_CLIENTID можно найти ответ на запрос по clientId

            //Сохранение запроса в БД
            ServiceMessage newFATALINFRequest = new ServiceMessage(
                    clientId,
                    sendRequest,
                    "Новый",
                    LocalDateTime.now(),
                    FATALINF,
                    "Запрос"
            );
            serviceRequestRepository.save(newFATALINFRequest);

            //Отправка сообщения в ИУА
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            RestTemplate restTemplate = new RestTemplate();
            HttpEntity<String> requestEntity = new HttpEntity<>(sendRequest, headers);
            String response = restTemplate.postForObject(SEND_URL, requestEntity, String.class);

            System.out.println("Sync response: " + response);

        }
        catch (javax.xml.bind.JAXBException e){
            e.printStackTrace();
        }

        return new RedirectView("/");
    }


    /**
     * Функция для проверки состояния службы ИУА СМЭВ3
     * @param serviceName название службы
     * @return true, если служба адаптера запущена, false, если не запущена
     */
    public boolean checkIfServiceRunning(String serviceName) {
        Process process;
        try {
            process = Runtime.getRuntime().exec("sc query " + serviceName);
            Scanner reader = new Scanner(process.getInputStream(), "UTF-8");
            while(reader.hasNextLine()) {
                if(reader.nextLine().contains("RUNNING")) {
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
     * @param serviceName название службы
     * @return true, если служба адаптера смогла запуститься, false - в противном случае
     */
    public boolean startService(String serviceName) {
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
