package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class DemoController {
    @GetMapping("/test")
    public HashMap test(){
        HashMap<String, String> a = new HashMap<>();
        a.put("hihi", "value");
        return a;
    }
}