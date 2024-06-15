package com.example.demo.service;

import com.example.demo.models.db.*;

import com.example.demo.repositories.InfoTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;
import lombok.RequiredArgsConstructor;
import com.example.demo.repositories.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Autowired
    InfoTypeRepository infoTypeRepository;


    public boolean createUser(User user) {
        String username = user.getUsername();
        if (userRepository.findByUsername(username) != null) return false;
        user.setActive(true);
        user.getRoles().add(Role.ROLE_USER);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return true;
    }

    public boolean createAdmin(String username, String password) {
        String name = username;
        if (userRepository.findByUsername(username) != null) return false;
        User user = new User();
        user.setUsername(name);
        user.setActive(true);
        user.getRoles().add(Role.ROLE_ADMIN);
        user.setPassword(passwordEncoder.encode(password));

        List<InfoType> types = infoTypeRepository.findAll();
        user.setTypes(types);

        userRepository.save(user);

        return true;
    }

    public boolean createUser(String username, String password) {
        String name = username;
        if (userRepository.findByUsername(username) != null) return false;
        User user = new User();
        user.setUsername(name);
        user.setActive(true);
        user.getRoles().add(Role.ROLE_USER);
        user.setPassword(passwordEncoder.encode(password));
        userRepository.save(user);
        return true;
    }

}