package com.example.spring_boot_jwt_ttp.Controller;


import com.example.spring_boot_jwt_ttp.entity.User;
import com.example.spring_boot_jwt_ttp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    UserService userservice;

    @PostMapping("/register")
    public User createUser(@RequestBody User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return userservice.createUser(user);
    }
}
