package com.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Example {

    @GetMapping("/not-free")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello world Spring Security");
    }

    @GetMapping("/free")
    public ResponseEntity<String>sayHelloEveryOne(){
        return ResponseEntity.ok("Hello world!");
    }
}
