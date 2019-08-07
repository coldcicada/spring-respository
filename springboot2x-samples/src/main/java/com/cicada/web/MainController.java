package com.cicada.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping(path = "/")
    public String home() {
        return "Hello, world!";
    }
}
