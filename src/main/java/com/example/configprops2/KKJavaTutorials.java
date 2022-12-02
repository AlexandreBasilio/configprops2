package com.example.configprops2;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@ConfigurationProperties(prefix = "kk")
//@Configuration
//@PropertySource(value = {"classpath:kkjava.properties"})
public class KKJavaTutorials {

    private Integer channelId;
    private String channelName;
    private String webSiteUrl;
}
