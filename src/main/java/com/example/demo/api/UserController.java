package com.example.demo.api;

import com.example.demo.service.UserService;
import com.example.demo.model.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("user") //Define endpoint in rest api
@RestController //Expose endpoints clients can consume
@CrossOrigin("http://localhost:3000") //Reference the origin of frontend app
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {this.userService = userService;}

    @PostMapping("/register")
    public void addUser(@RequestBody User user) {userService.addUser(user);}

    @GetMapping("/allusers")
    public List<User> getAllUsers() {
        List<User> u = userService.retAllUsers();
        return u;
    }
    @GetMapping("/{user}")
    public User getUserById(@PathVariable("user") String username) {
        return userService.getUserById(username)
                .orElse(null);
    }
}
