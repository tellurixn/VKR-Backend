package com.example.demo.configuration;

import com.example.demo.clients.WebServiceClient;
import generated.ru.gov.smev.artefacts.x.services.service_adapter.SMEVServiceAdapterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class WSConfig {

    @Bean
    public SMEVServiceAdapterService getSMEVServiceAdapterService() {
        return new SMEVServiceAdapterService();
    }

    @Bean
    public WebServiceClient myWebServiceClient(SMEVServiceAdapterService service) {
        WebServiceClient client = new WebServiceClient();
        client.setSMEVServiceAdapterService(service);
        client.setEndpoint("http://localhost:7575/ws/SMEVServiceAdapterService");
        return client;
    }
}

