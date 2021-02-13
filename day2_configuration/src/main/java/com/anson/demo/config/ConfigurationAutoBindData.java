package com.anson.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationAutoBindData {
    @Bean
    @ConfigurationProperties(prefix = "user")
    public User user() {
        return new User();
    }
}