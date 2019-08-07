package com.ecicada.springboot.transactional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecicada.springboot.transactional.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/insertUser")
    public Integer insertUser(String name, Integer age) {
        return userService.insertUser(name, age);
    }
}
