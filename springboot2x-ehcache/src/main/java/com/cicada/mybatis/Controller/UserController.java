package com.cicada.mybatis.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cicada.mybatis.pojo.User;
import com.cicada.mybatis.service.UserService;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/findUserById")
    public String findUserById() {
        System.out.println(this.userService.findUserById(1));
        System.out.println(this.userService.findUserById(1));
        return "successfully!";
    }

    @GetMapping("/findUserByPage")
    public String findUserByPage() {
        PageRequest pageable = PageRequest.of(0, 2);
        System.out.println(this.userService.findUserByPage(pageable));
        pageable = PageRequest.of(0, 3);
        System.out.println(this.userService.findUserByPage(pageable));
        return "successfully!";
    }

    @GetMapping("/findAllUsers")
    public String findAllUsers() {
        System.out.println(this.userService.findAllUsers());
        User user = new User();
        user.setPassword("12345678");
        user.setName("wahaha");
        user.setUsername("haha");
        this.userService.saveUser(user);
        System.out.println(this.userService.findAllUsers());
        return "successfully!";
    }

}
