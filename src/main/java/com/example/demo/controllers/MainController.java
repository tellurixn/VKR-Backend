package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.Scanner;

@Controller
public class MainController {

    private final String serviceName = "AdapterSMEV";

    @GetMapping("/")
    public String index(Model model){
        boolean isAdapterRunning = checkIfServiceRunning(serviceName);

        model.addAttribute("isAdapterRunning", isAdapterRunning);
        return "index";
    }

    @GetMapping("/history")
    public String history(Model model){
        boolean isAdapterRunning = checkIfServiceRunning(serviceName);

        model.addAttribute("isAdapterRunning", isAdapterRunning);
        return "history";
    }

    @GetMapping("/egr_zags")
    public String egr_zags(Model model){
        boolean isAdapterRunning = checkIfServiceRunning(serviceName);

        model.addAttribute("isAdapterRunning", isAdapterRunning);
        return "EGR_ZAGS_Request";
    }


    public boolean checkIfServiceRunning(String serviceName) {
        Process process;
        try {
            process = Runtime.getRuntime().exec("sc query " + serviceName);
            Scanner reader = new Scanner(process.getInputStream(), "UTF-8");
            while(reader.hasNextLine()) {
                if(reader.nextLine().contains("RUNNING")) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
