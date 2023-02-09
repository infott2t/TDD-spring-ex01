package com.example.tddspringex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TddSpringEx01Application {

    public static void main(String[] args) {
        SpringApplication.run(TddSpringEx01Application.class, args);
    }

}
