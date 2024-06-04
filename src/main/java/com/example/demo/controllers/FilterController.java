package com.example.demo.controllers;

import com.example.demo.models.db.ServiceMessage;
import com.example.demo.repositories.ServiceMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/ajax")
public class FilterController {

    @Autowired
    ServiceMessageRepository serviceMessageRepository;

    @GetMapping("/vs_name")
    public @ResponseBody Iterable<ServiceMessage> getByVsName(
            @RequestParam String vs_name){
        switch (vs_name){
            case "Все":
                return serviceMessageRepository.findAll();
            default:
                return serviceMessageRepository.findAllByVsName(vs_name);
        }
    }
    @GetMapping("/status")
    public @ResponseBody Iterable<ServiceMessage> getByStatus(
            @RequestParam String status){
        switch (status){
            case "Новый":
                return  serviceMessageRepository.findAllByStatus("NEW");
            case "Ошибка":
                return  serviceMessageRepository.findAllByStatus("ERROR");
            case "Получено":
                return  serviceMessageRepository.findAllByStatus("RECEIVED");
            case "Отправлено":
                return  serviceMessageRepository.findAllByStatus("SENT");
            default:
                return serviceMessageRepository.findAll();

        }

    }
    @GetMapping("/message_type")
    public @ResponseBody Iterable<ServiceMessage> getByMessageType(
            @RequestParam String message_type){
        switch (message_type){
            case "Все":
                return serviceMessageRepository.findAll();
            default:
                return serviceMessageRepository.findAllByMessageType(message_type);
        }

    }
    @GetMapping("/time_range")
    public @ResponseBody Iterable<ServiceMessage> getByTimeRange(
            @RequestParam String value){

        int numOfDays;

        switch (value){
            case "Сегодня":
                numOfDays = 1;
                break;
            case "Последние 7 дней":
                numOfDays = 7;
                break;
            case "Последние 30 дней":
                numOfDays = 30;
                break;
            default:
                return serviceMessageRepository.findAll();
        }

        return serviceMessageRepository.findMessagesByTimeRange(
                LocalDateTime.now().minusDays(numOfDays),
                LocalDateTime.now()
        );
    }




}
