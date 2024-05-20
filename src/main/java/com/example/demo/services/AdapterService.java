package com.example.demo.services;

import com.example.demo.clients.WebServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdapterService {

    @Autowired
    private WebServiceClient myWebServiceClient;

   /* public String sendDataToSMEV(String data) {
        // Отправляем данные веб-сервису через ИУА
        String response = myWebServiceClient.sendData(data);
        return response;
    }*/
}
