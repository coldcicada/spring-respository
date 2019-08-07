package com.ecicada.springboot.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JSPController {
    @RequestMapping("/jspIndex")
    public String jspIndex() {
        return "jspIndex";
    }
}
