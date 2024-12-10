package com.example.TwoDataSources.Controller;

import com.example.TwoDataSources.Model.UserDTO;
import com.example.TwoDataSources.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public UserDTO addUser(@RequestBody UserDTO userDTO) {
        System.out.println(userDTO);

        return userService.saveUser(userDTO);

    }
}
