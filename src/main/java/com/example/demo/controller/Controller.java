package com.example.demo.controller;

import com.example.demo.repository.Repo_try1;
import com.example.demo.services.Service_try1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Service_try1 service;

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

    @GetMapping("/getcity")
    public ResponseEntity<?> getcity() {
        return service.getdetails();
    }
}
