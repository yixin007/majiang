package com.majiang.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello( String name, Model model ){
        model.addAttribute("name",name);
        return "hello";

    }
}
