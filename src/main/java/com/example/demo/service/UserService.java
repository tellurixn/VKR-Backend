package com.example.demo.service;

import com.example.demo.models.db.*;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;
import lombok.RequiredArgsConstructor;
import com.example.demo.repositories.UserRepository;
@Service

@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public boolean createUser(User user) {
        String username = user.getUsername();
        if (userRepository.findByUsername(username) != null) return false;
        user.setActive(true);
        user.getRoles().add(Role.ROLE_USER);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return true;
    }
}