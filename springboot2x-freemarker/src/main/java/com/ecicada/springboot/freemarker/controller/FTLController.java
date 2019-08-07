package com.ecicada.springboot.freemarker.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FTLController {
    @RequestMapping("/ftlIndex")
    public String ftlIndex(Map<String, Object> map) {
        map.put("username", "白晗");
        map.put("sex", 1);
        map.put("age", 23);
        return "ftlIndex";
    }
}
