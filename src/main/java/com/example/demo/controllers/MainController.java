package com.example.demo.controllers;


import com.example.demo.models.root.FATALINFRequest;
import com.example.demo.models.types.ОрганЗАГСНТип;
import com.example.demo.models.types.УдЛичнФЛСНТип;
import com.example.demo.models.types.ФИОПрТип;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
import java.util.Map;
import java.util.Scanner;
import com.example.demo.models.JsonRequest;
import com.example.demo.models.JsonRequest.*;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {
    public static final String SERVICE_NAME = "AdapterSMEV";
    public static final String SEND_URL = "http://localhost:7590/ws/send";
    public static final String GET_URL = "http://localhost:7590/ws/get";
    public static final String FIND_URL = "http://localhost:7590/ws/find";

    @GetMapping("/")
    public String index(Model model){
        boolean isAdapterRunning = checkIfServiceRunning(SERVICE_NAME);

        model.addAttribute("isAdapterRunning", isAdapterRunning);
        return "index";
    }

    @GetMapping("/history")
    public String history(Model model){
        boolean isAdapterRunning = checkIfServiceRunning(SERVICE_NAME);

        model.addAttribute("isAdapterRunning", isAdapterRunning);
        return "history";
    }

    @GetMapping("/egr_zags")
    public String egr_zags(Model model){
        boolean isAdapterRunning = checkIfServiceRunning(SERVICE_NAME);

        model.addAttribute("isAdapterRunning", isAdapterRunning);
        return "EGR_ZAGS_Request";
    }

    @PostMapping("/egr_zags")
    public String sendEgrZagsRequest(@RequestParam Map<String,String> requestParams) throws DatatypeConfigurationException {


        FATALINFRequest request = new FATALINFRequest();

        /*Атрибуты запроса*/
        //todo реализовать генерацию id
        request.setИдЗапрос(requestParams.get("requestId"));
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
            System.out.println(sw.toString());

            //формирование конверта сообщения
            //todo реализовать генерацию id для сообщений
            String json = new JsonRequest(
                    "WebService",
                    new RequestMessage(
                            "RequestMessageType",
                            new RequestMetadata("00000000-0000-0000-0000-000000000000", true),
                            new RequestContent(
                                    new Content(
                                            new MessagePrimaryContent(sw.toString().replaceAll("\n"," "))
                                    )
                            )
                    )
            ).toJson();

            System.out.println(json);

            //Отправка сообщения в ИУА
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            RestTemplate restTemplate = new RestTemplate();
            HttpEntity<String> requestEntity = new HttpEntity<>(json, headers);
            String response = restTemplate.postForObject(SEND_URL, requestEntity, String.class);

            System.out.println("Response: " + response);

        }
        catch (javax.xml.bind.JAXBException e){
            e.printStackTrace();
        }








        return "index";
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
}
