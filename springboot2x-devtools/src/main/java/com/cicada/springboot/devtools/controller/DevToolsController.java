package com.cicada.springboot.devtools.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevToolsController {
    @RequestMapping("/indexDev")
    public String indexDev() {
        String v = "springboot-5.x";
        return v;
    }
    
    @RequestMapping("/myDev")
    public String myDev() {
        String v = "springboot-2.x";
        return v;
    }
}
