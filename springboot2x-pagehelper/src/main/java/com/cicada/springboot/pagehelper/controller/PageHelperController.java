package com.cicada.springboot.pagehelper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cicada.springboot.pagehelper.entity.User;
import com.cicada.springboot.pagehelper.service.UserService;
import com.github.pagehelper.PageInfo;

@RestController
public class PageHelperController {
    @Autowired
    UserService userService;

    @RequestMapping("/showPage")
    public PageInfo<User> showPage(int page, int pageSize) {
        return userService.findUserList(page, pageSize);
    }
}
