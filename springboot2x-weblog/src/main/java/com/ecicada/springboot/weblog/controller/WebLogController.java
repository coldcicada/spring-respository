package com.ecicada.springboot.weblog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebLogController {
    @RequestMapping("/webLog")
    public String webLog(String name) {
        return "Hello, " + name;
    }
}
