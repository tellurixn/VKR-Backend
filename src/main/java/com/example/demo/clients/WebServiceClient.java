package com.example.demo.clients;

import org.springframework.stereotype.Service;

@Service
public class WebServiceClient {

//    private SMEVServiceAdapterService smevServiceAdapterService;
//    private String endpoint;
//
//    public void setSMEVServiceAdapterService(SMEVServiceAdapterService smevServiceAdapterService) {
//        this.smevServiceAdapterService = smevServiceAdapterService;
//    }
//
//    public void setEndpoint(String endpoint) {
//        this.endpoint = endpoint;
//    }

//    public String sendData(String data) {
//        try {
//            // Создаем клиентский объект для работы с веб-сервисом
//            SMEVServiceAdapter port = smevServiceAdapterService.getSMEVServiceTaskImplPort();
//
//            // Устанавливаем конечную точку (endpoint) для обращения к веб-сервису
//            BindingProvider bp = (BindingProvider) port;
//            Map<String, Object> context = bp.getRequestContext();
//            context.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
//
//            // Отправляем запрос в веб-сервис
//            String response = port.sendData(data);
//
//            return response;
//        } catch (Exception e) {
//            // Обработка ошибок
//            e.printStackTrace();
//            return "Error occurred: " + e.getMessage();
//        }
//    }
}
