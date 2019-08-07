package com.ecicada.springboot.value.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {
    @Value("${name}")
    private String name;

    @RequestMapping("/getName")
    public String getName() {
        System.out.println("张三");
        System.out.println(name);
        return name;
    }
}
