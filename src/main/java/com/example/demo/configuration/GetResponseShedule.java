package com.example.demo.configuration;

import com.example.demo.models.db.ServiceMessage;
import com.example.demo.models.jsons.JsonGetRequest;
import com.example.demo.repositories.ServiceMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.UUID;

import static com.example.demo.controllers.MainController.*;

@Configuration
@EnableScheduling
public class GetResponseShedule {


    @Autowired
    private ServiceMessageRepository serviceMessageRepository;

    /**
     * Получение ответа из специальной очереди
     * раз в минуту
     */
    @Scheduled(cron = "0 * * * * *")
    public void getResponseFromExtraQueue() {

        JsonGetRequest getRequest = new JsonGetRequest(
                IS_NAME,
                "FATALINFResponse",
                new JsonGetRequest.SpecificQuery("RESPONSE")
                );


        //Отправка сообщения в ИУА
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> requestEntity = new HttpEntity<>(getRequest.toJson(), headers);
        String response = restTemplate.postForObject(GET_URL, requestEntity, String.class);

        System.out.println("Get: " + response);


        if (response != null && !response.isEmpty()) {
            ServiceMessage message = new ServiceMessage(
                    UUID.randomUUID().toString(),
                    response,
                    "Получено",
                    LocalDateTime.now(),
                    FATALINF,
                    "Ответ"
            );
            serviceMessageRepository.save(message);
        }

    }
}
