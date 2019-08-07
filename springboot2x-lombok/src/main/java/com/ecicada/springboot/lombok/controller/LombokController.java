package com.ecicada.springboot.lombok.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecicada.springboot.lombok.entity.UserVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class LombokController {
    @RequestMapping("/calculate")
    public UserVO calculate(String name, Integer age) {
        UserVO user = new UserVO();
        user.setName(name);
        user.setAge(age);
        log.info(user.toString());
        return user;
    }
}
