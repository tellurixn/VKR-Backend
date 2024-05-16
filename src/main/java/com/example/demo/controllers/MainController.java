package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(){

        return "index";
    }

    @GetMapping("/history")
    public String history(){

        return "history";
    }

    @GetMapping("/egr_zags")
    public String egr_zags(){

        return "EGR_ZAGS_Request";
    }
}
