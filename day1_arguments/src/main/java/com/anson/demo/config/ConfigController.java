package com.anson.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Autowired
    ConfigPro configPro;

    @GetMapping("/config")
    public Object test() {
        System.out.println("config.a::::");
        System.out.println(configPro.a);
        return null;
    }

}