package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableReactiveMongoRepositories
@EnableWebFlux
public class StudyReactiveProgrammingSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyReactiveProgrammingSpringApplication.class, args);
    }

}
