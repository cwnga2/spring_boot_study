package com.anson.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource({"classpath:other.properties"})
@ConfigurationProperties(prefix = "other")
@Data
public class OtherConfig {
    public String string1;
    public int int1;
}