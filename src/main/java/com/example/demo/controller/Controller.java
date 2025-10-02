package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hi")
    public String hi() {
        return "Hello World";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World this is hello";
    }

    @GetMapping("/hello1")
    public String hello1() {
        return "Hello World this is hello1 from updated code";
    }
}
