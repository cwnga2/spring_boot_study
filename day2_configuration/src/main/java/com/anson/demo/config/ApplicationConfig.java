package com.anson.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties()
@Data //need setter and getter for
public class ApplicationConfig {
    public String string1;
    public int int1;
}