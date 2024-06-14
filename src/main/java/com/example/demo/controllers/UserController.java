package com.example.demo.controllers;

import com.example.demo.models.db.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String registrate(
            @RequestParam String username,
            @RequestParam String password
    ){
        userService.createUser(username,password);
        return "redirect:/login";
    }

}