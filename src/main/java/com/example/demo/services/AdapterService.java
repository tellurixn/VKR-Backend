package com.example.demo.services;

import com.example.demo.clients.WebServiceClient;

import com.example.demo.models.root.FATALINFRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.StringWriter;


@Service
public class AdapterService {

    @Autowired
    private WebServiceClient myWebServiceClient;

    /*public void requestToXml(FATALINFRequest request){
        try {
            // Создаем JAXB контекст для работы с классами
            JAXBContext jaxbContext = JAXBContext.newInstance(FATALINFRequest.class);

            // Создаем Marshaller
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            StringWriter sw = new StringWriter();
            marshaller.marshal(request, sw);
            String xmlString = sw.toString();
            System.out.println("XML файл с объектом успешно создан.");

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }*/

   /* public String sendDataToSMEV(String data) {
        // Отправляем данные веб-сервису через ИУА
        String response = myWebServiceClient.sendData(data);
        return response;
    }*/
}
