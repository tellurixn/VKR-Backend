package com.example.demo.controllers;

import com.example.demo.models.db.ServiceMessage;
import com.example.demo.models.db.User;
import com.example.demo.repositories.ServiceMessageRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/ajax")
public class FilterController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    ServiceMessageRepository serviceMessageRepository;

    @GetMapping("/filter")
    public @ResponseBody Iterable<ServiceMessage> filter(
            @RequestParam String vs_name,
            @RequestParam String status,
            @RequestParam String message_type,
            @RequestParam String date,
            Principal principal
    ){
        User user = userRepository.findByUsername(principal.getName());
        int numOfDays;//количество дней для отсчета начала периода
        Long userId = user.getId();

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
                    userId,
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
                    userId,
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
                    userId,
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
                    userId,
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
                    userId,
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
                    userId,
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
                        userId,
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
                    userId,
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
                    userId,
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
                    userId,
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
                    userId,
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
                    userId,
                    LocalDateTime.now().minusDays(numOfDays),
                    LocalDateTime.now()
            );
        } else if (
            !vs_name.equals("Все") &&
            status.equals("Все") &&
            message_type.equals("Все") &&
            date.equals("За все время")
        ) {
            return serviceMessageRepository.findAllByVsName(userId,vs_name);
        } else if (
            vs_name.equals("Все") &&
            !status.equals("Все") &&
            message_type.equals("Все") &&
            date.equals("За все время")
        ) {
            return serviceMessageRepository.findAllByStatus(userId, status);
        } else if (
            vs_name.equals("Все") &&
            status.equals("Все") &&
            !message_type.equals("Все") &&
            date.equals("За все время")
        ) {
            return serviceMessageRepository.findAllByMessageType( userId,message_type);
        } else if (
            vs_name.equals("Все") &&
            status.equals("Все") &&
            message_type.equals("Все") &&
            !date.equals("За все время")
        ) {
            return serviceMessageRepository.findMessagesByTimeRange(
                    userId,
                    LocalDateTime.now().minusDays(numOfDays),
                    LocalDateTime.now()
            );
        }


        return serviceMessageRepository.findAll(userId);
    }



}
