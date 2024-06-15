package com.example.demo.controllers;

import com.example.demo.models.db.InfoType;
import com.example.demo.models.db.ServiceMessage;
import com.example.demo.models.db.User;
import com.example.demo.models.db.UserInfoType;
import com.example.demo.models.dto.UserDto;
import com.example.demo.repositories.InfoTypeRepository;
import com.example.demo.repositories.UserInfoTypeRepository;
import com.example.demo.repositories.UserRepository;
import com.example.demo.service.MappingUtils;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.AccountNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.example.demo.controllers.MainController.*;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final MappingUtils mappingUtils;


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private InfoTypeRepository infoTypeRepository;
    @Autowired
    UserInfoTypeRepository userInfoTypeRepository;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        List<User> users = userRepository.findAll();
        List<UserDto> dto = mappingUtils.mapToUserDto(users);

        boolean isAdapterRunning = checkIfServiceRunning(SERVICE_NAME);
        boolean isAdapterStarted = true;
        if (!isAdapterRunning)
            isAdapterStarted = startService(SERVICE_NAME);

        model.addAttribute("isAdapterRunning", isAdapterRunning);

        model.addAttribute("users", dto);
        return "admin";
    }

    @GetMapping("/edit_user/{id}")
    public String edit_user(
            @PathVariable String id,
            Model model
    ) throws AccountNotFoundException {

        boolean isAdapterRunning = checkIfServiceRunning(SERVICE_NAME);
        boolean isAdapterStarted = true;
        if (!isAdapterRunning)
            isAdapterStarted = startService(SERVICE_NAME);

        model.addAttribute("isAdapterRunning", isAdapterRunning);

        Optional<User> user = userRepository.findById(Long.parseLong(id));
        if(user.isPresent())
            model.addAttribute("user", user.get());
        else throw new AccountNotFoundException();


        List<InfoType> all = infoTypeRepository.findAll();
        List<InfoType> allowed = user.get().getTypes();
        List<InfoType> notAllowed = new ArrayList<>();
        if(!allowed.isEmpty()) {
            for (InfoType type : allowed) {
                if (!all.contains(type))
                    notAllowed.add(type);
            }
        }
        else notAllowed = all;

        model.addAttribute("allowed", allowed);
        model.addAttribute("notAllowed", notAllowed);



        return "edit_user";
    }

    @GetMapping("/user_create")
    public String user_create() {
        return "user_create";
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

    @PostMapping("/user_create")
    public String create(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String role
    ){
        if(role.equals("admin"))
            userService.createAdmin(username,password);
        else
            userService.createUser(username, password);


        return "redirect:/admin";
    }

    @GetMapping("/delete_user/{id}")
    public String delete_user(
            @PathVariable String id
    ){
        userRepository.deleteById(Long.parseLong(id));
        return "redirect:/admin";
    }

    @GetMapping("/allow/{user_id}/{type_id}")
    public String allow(
            @PathVariable String user_id,
            @PathVariable String type_id
    ){

        Optional<User> user = userRepository.findById(Long.parseLong(user_id));
        Optional<InfoType> type = infoTypeRepository.findById(Long.parseLong(type_id));

        user.get().getTypes().add(type.get());
        userRepository.save(user.get());


        String redirectUrl = "/edit_user/" + user_id;
        return "redirect:" + redirectUrl;
    }

    @GetMapping("/delete_type/{user_id}/{type_id}")
    public String delete_type(
            @PathVariable String user_id,
            @PathVariable String type_id
    ){

        Optional<User> user = userRepository.findById(Long.parseLong(user_id));
        Optional<InfoType> type = infoTypeRepository.findById(Long.parseLong(type_id));

        user.get().getTypes().remove(type.get());
        userRepository.save(user.get());


        String redirectUrl = "/edit_user/" + user_id;
        return "redirect:" + redirectUrl;
    }
}