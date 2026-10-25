package com.karthik.javadevsecopsapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Version 1 - DevSecOps Project";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running";
    }
}
