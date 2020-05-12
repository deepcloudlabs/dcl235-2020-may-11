package org.example.config;

import org.example.service.BusinessService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ComponentScan("org.example.service")
public class AppConfig {
    @Bean
    @Scope("singleton")
    public BusinessService businessService(){
        System.err.println("creating business service...");
        return new BusinessService();
    }
}
