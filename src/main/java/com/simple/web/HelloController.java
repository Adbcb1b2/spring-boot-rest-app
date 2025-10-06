package com.simple.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Define as a spring MVC controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
