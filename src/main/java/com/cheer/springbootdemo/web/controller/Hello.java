package com.cheer.springbootdemo.web.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Log4j2
@Controller
public class Hello {
    @GetMapping("/hello")
    public String hello(Model model){
        log.traceEntry();
        model.addAttribute("message","Hello World");
        return "hello";
    }
}
