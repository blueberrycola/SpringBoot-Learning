package com.example.demo.api;

import com.example.demo.service.UserService;
import com.example.demo.model.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("register/user") //Define endpoint in rest api
@RestController //Expose endpoints clients can consume
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {this.userService = userService;}

    @PostMapping
    public void addUser(@RequestBody User user) {userService.addUser(user);}
}
