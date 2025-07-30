package com.example.ConnecttoMysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    public String receiveUserData(@RequestBody User user) {
        userRepository.save(user);
//        return "Saved user: " + user.getName();
        return "Received user: " + user.getName() + ", " + user.getEmail();
    }
}
