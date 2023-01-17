package com.hello.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class OlaSpring {
    
    @GetMapping
    public String olaSpring() {
        return "Olá Spring";
    }
}
