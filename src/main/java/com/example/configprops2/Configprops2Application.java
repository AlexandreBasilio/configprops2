package com.example.configprops2;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableConfigurationProperties(KKJavaTutorials.class)
@PropertySource(value = {"classpath:kkjava.properties"})
public class Configprops2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext appContext = SpringApplication.run(Configprops2Application.class, args);
        KKJavaTutorials bean = appContext.getBean(KKJavaTutorials.class);

        System.out.println(bean);
    }

//    @Bean
//    @ConfigurationProperties(prefix = "kk")
//    public KKJavaTutorials kkJavaTutorials() {
//        return new KKJavaTutorials();
//    }

    @Bean
    public ApplicationRunner applicationRunner(KKJavaTutorials kkJavaTutorials) {
        return args -> {
            System.out.println(kkJavaTutorials);
        };
    }

}
