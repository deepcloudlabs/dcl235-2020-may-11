package org.example;

import org.example.config.AppConfig;
import org.example.service.BusinessService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext container =
                new AnnotationConfigApplicationContext(AppConfig.class);// Eager
        System.err.println("Started...");
        BusinessService bs = container.getBean(BusinessService.class); // Lazy
        bs.fun();
    }
}
