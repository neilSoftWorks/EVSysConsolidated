package com.example.applicationsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
public class ApplicationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationSystemApplication.class, args);
    }
}
