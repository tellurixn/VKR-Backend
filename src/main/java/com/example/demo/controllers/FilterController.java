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

    @GetMapping("/filter")
    public @ResponseBody Iterable<ServiceMessage> filter(
            @RequestParam String vs_name,
            @RequestParam String status,
            @RequestParam String message_type,
            @RequestParam String date
    ){
        int numOfDays;//количество дней для отсчета начала периода

        switch (date){
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
                numOfDays = 0;
                break;
        }

        /*Фильтрация в зависимости от значения полей*/
        if(
            !vs_name.equals("Все") &&
            !status.equals("Все") &&
            !message_type.equals("Все") &&
            !date.equals("За все время")
        ){
            return serviceMessageRepository.filterByAllParams(
                    vs_name,
                    status,
                    message_type,
                    LocalDateTime.now().minusDays(numOfDays),
                    LocalDateTime.now()
            );
        } else if (
            vs_name.equals("Все") &&
            !status.equals("Все") &&
            !message_type.equals("Все") &&
            !date.equals("За все время")
        ) {
            return serviceMessageRepository.filterByStatusTypeAndDate(
                    status,
                    message_type,
                    LocalDateTime.now().minusDays(numOfDays),
                    LocalDateTime.now()
            );
        } else if (
            !vs_name.equals("Все") &&
            status.equals("Все") &&
            !message_type.equals("Все") &&
            !date.equals("За все время")
        ) {
            return serviceMessageRepository.filterByNameTypeAndDate(
                    vs_name,
                    message_type,
                    LocalDateTime.now().minusDays(numOfDays),
                    LocalDateTime.now()
            );
        } else if (
            !vs_name.equals("Все") &&
            !status.equals("Все") &&
            message_type.equals("Все") &&
            !date.equals("За все время")
        ) {
            return serviceMessageRepository.filterByNameStatusAndDate(
                    vs_name,
                    status,
                    LocalDateTime.now().minusDays(numOfDays),
                    LocalDateTime.now()
            );
        } else if (
            !vs_name.equals("Все") &&
            !status.equals("Все") &&
            !message_type.equals("Все") &&
            date.equals("За все время")
        ) {
            return serviceMessageRepository.filterByNameStatusType(
                    vs_name,
                    status,
                    message_type
            );
        } else if (
            vs_name.equals("Все") &&
            status.equals("Все") &&
            !message_type.equals("Все") &&
            !date.equals("За все время")
        ) {
            return serviceMessageRepository.filterByTypeAndDate(
                    message_type,
                    LocalDateTime.now().minusDays(numOfDays),
                    LocalDateTime.now()
            );
        } else if (
            !vs_name.equals("Все") &&
            !status.equals("Все") &&
            message_type.equals("Все") &&
            date.equals("За все время")
            ) {
                return serviceMessageRepository.filterByNameAndStatus(
                        vs_name,
                        status
                );
        } else if (
            !vs_name.equals("Все") &&
            status.equals("Все") &&
            message_type.equals("Все") &&
            !date.equals("За все время")
        ) {
            return serviceMessageRepository.filterByNameAndDate(
                    vs_name,
                    LocalDateTime.now().minusDays(numOfDays),
                    LocalDateTime.now()
            );
        } else if (
            !vs_name.equals("Все") &&
            status.equals("Все") &&
            !message_type.equals("Все") &&
            date.equals("За все время")
        ) {
            return serviceMessageRepository.filterByNameAndType(
                    vs_name,
                    message_type
            );
        } else if (
            vs_name.equals("Все") &&
            !status.equals("Все") &&
            message_type.equals("Все") &&
            !date.equals("За все время")
        ) {
            return serviceMessageRepository.filterByStatusAndDate(
                    status,
                    LocalDateTime.now().minusDays(numOfDays),
                    LocalDateTime.now()
            );
        } else if (
            vs_name.equals("Все") &&
            !status.equals("Все") &&
            !message_type.equals("Все") &&
            date.equals("За все время")
        ) {
            return serviceMessageRepository.filterByStatusAndType(
                    status,
                    message_type
            );
        } else if (
            vs_name.equals("Все") &&
            status.equals("Все") &&
            message_type.equals("Все") &&
            !date.equals("За все время")
        ) {
            return serviceMessageRepository.findMessagesByTimeRange(
                    LocalDateTime.now().minusDays(numOfDays),
                    LocalDateTime.now()
            );
        } else if (
            !vs_name.equals("Все") &&
            status.equals("Все") &&
            message_type.equals("Все") &&
            date.equals("За все время")
        ) {
            return serviceMessageRepository.findAllByVsName(vs_name);
        } else if (
            vs_name.equals("Все") &&
            !status.equals("Все") &&
            message_type.equals("Все") &&
            date.equals("За все время")
        ) {
            return serviceMessageRepository.findAllByStatus(status);
        } else if (
            vs_name.equals("Все") &&
            status.equals("Все") &&
            !message_type.equals("Все") &&
            date.equals("За все время")
        ) {
            return serviceMessageRepository.findAllByMessageType(message_type);
        } else if (
            vs_name.equals("Все") &&
            status.equals("Все") &&
            message_type.equals("Все") &&
            !date.equals("За все время")
        ) {
            return serviceMessageRepository.findMessagesByTimeRange(
                    LocalDateTime.now().minusDays(numOfDays),
                    LocalDateTime.now()
            );
        }


        return serviceMessageRepository.findAll();
    }



}
