package com.anson.demo.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConfigController {
    @Resource
    ApplicationConfig applicationConfig;
    @Resource
    ApplicationConfigWithPrefix applicationConfigWithPrefix;
    @Resource
    OtherConfig otherConfig;

    @Resource
    User user;


    @GetMapping("/config")
    public Object test() {

        System.out.println(applicationConfig.string1);
        System.out.println(applicationConfig.int1);
        System.out.println(applicationConfigWithPrefix.string1);
        System.out.println(applicationConfigWithPrefix.int1);
        System.out.println(otherConfig.string1);
        System.out.println(otherConfig.int1);

        System.out.println(user.getName1());
        System.out.println(user.getPassword());
        return "done";
    }

}