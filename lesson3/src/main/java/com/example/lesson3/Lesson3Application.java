package com.example.lesson3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Lesson3Application {

    public static void main(String[] args) {
        SpringApplication.run(Lesson3Application.class, args);
    }

}
