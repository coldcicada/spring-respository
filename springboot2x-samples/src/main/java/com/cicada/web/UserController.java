package com.cicada.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cicada.domain.User;
import com.cicada.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/show/{id}")
    public String showUser(@PathVariable int id, Model model) {
        User user = userService.selectUserById(id);
        model.addAttribute("user", user);
        return "index";
    }

}
