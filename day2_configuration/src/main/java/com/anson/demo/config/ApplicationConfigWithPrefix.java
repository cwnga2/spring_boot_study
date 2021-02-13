package com.anson.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "prefix")
@Data
public class ApplicationConfigWithPrefix {
    public String string1;
    public int int1;
}