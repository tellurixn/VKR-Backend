package com.example.demo.controllers;

import com.example.demo.models.db.ServiceMessage;
import com.example.demo.models.xmls.root.FATALINFRequest;
import com.example.demo.models.xmls.root.FATALINFResponse;
import com.example.demo.repositories.ServiceMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringReader;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/message")
public class MessageViewContriller {

    @Autowired
    ServiceMessageRepository serviceMessageRepository;

    @GetMapping("/{id}")
    public String requestView(@PathVariable String id){
        ServiceMessage request = serviceMessageRepository.findByClientId(id);
        String body = request.getOriginal_content();

        if (request.getMessage_type().equals("Запрос")) {
            try {
                StringReader reader = new StringReader(body);
                JAXBContext context = JAXBContext.newInstance(FATALINFRequest.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();
                FATALINFRequest requestObject = (FATALINFRequest) unmarshaller.unmarshal(reader);
            } catch (javax.xml.bind.JAXBException e) {
                e.printStackTrace();
            }
        } else {
            try {
                StringReader reader = new StringReader(body);
                JAXBContext context = JAXBContext.newInstance(FATALINFResponse.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();
                FATALINFResponse responseObject = (FATALINFResponse) unmarshaller.unmarshal(reader);
            } catch (javax.xml.bind.JAXBException e) {
                e.printStackTrace();
            }
        }

        return "";
    }
}
