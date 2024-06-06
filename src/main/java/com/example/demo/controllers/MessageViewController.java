package com.example.demo.controllers;

import com.example.demo.models.db.ServiceMessage;
import com.example.demo.models.xmls.root.FATALINFRequest;
import com.example.demo.models.xmls.root.FATALINFResponse;
import com.example.demo.repositories.ServiceMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

import static com.example.demo.controllers.MainController.*;

@Controller
@RequestMapping("/message")
public class MessageViewController {

    @Autowired
    ServiceMessageRepository serviceMessageRepository;

    @GetMapping("/{id}")
    public String requestView(@PathVariable String id, Model model){
        boolean isAdapterRunning = checkIfServiceRunning(SERVICE_NAME);
        boolean isAdapterStarted = true;
        if(!isAdapterRunning) {
            isAdapterStarted = startService(SERVICE_NAME);
            isAdapterRunning = checkIfServiceRunning(SERVICE_NAME);
        }
        model.addAttribute("isAdapterRunning", isAdapterRunning);

        ServiceMessage request = serviceMessageRepository.findByClientId(id);
        String body = request.getOriginal_content();


        if (request.getMessage_type().equals("Запрос")) {
        /*-------------------------------------Запрос--------------------------------------------------*/
            try {
                StringReader reader = new StringReader(body);
                JAXBContext context = JAXBContext.newInstance(FATALINFRequest.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();
                FATALINFRequest requestObject = (FATALINFRequest) unmarshaller.unmarshal(reader);


                model.addAttribute("request", request);
                model.addAttribute("message", requestObject);

                return "request_view";
            } catch (javax.xml.bind.JAXBException e) {
                e.printStackTrace();
            }
        }

        /*-------------------------------------Ответ--------------------------------------------------*/
        else {
            try {
                StringReader reader = new StringReader(body);
                JAXBContext context = JAXBContext.newInstance(FATALINFResponse.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();
                FATALINFResponse responseObject = (FATALINFResponse) unmarshaller.unmarshal(reader);

                model.addAttribute("request", request);
                model.addAttribute("message", responseObject);

                return "response_view";
            } catch (javax.xml.bind.JAXBException e) {
                e.printStackTrace();
            }
        }

        return "";
    }
}
