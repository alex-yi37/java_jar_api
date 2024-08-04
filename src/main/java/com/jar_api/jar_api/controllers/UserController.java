package com.jar_api.jar_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.jar_api.jar_api.repositories.UserRepository;
import com.jar_api.jar_api.models.User;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/api/v1/users")
    public String getAllUsers() {
        Iterable<User> allUsers = userRepository.findAll();

        for (User user : allUsers) {
            System.out.println(user);
        }

        // how can I transform the iterable of allUsers into an object with fewer fields in case
        // I don't want to provide the whole list of columns from the users table?

        System.out.println("get point");

        return "Greetings from Spring Boot!";
    }
}

