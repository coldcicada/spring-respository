package com.cicada.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cicada.jpa.entity.User;
import com.cicada.jpa.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/findAllUser")
    public List<User> findAllUser() {
        return userService.findAll();
    }
}
