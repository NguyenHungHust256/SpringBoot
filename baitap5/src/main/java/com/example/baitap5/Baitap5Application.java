package com.example.baitap5;

import com.example.baitap5.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Baitap5Application {

    public static void main(String[] args) {
        SpringApplication.run(Baitap5Application.class, args);
    }

    @Bean
    User getUser(){
        return new User("NguyenHung", "123456789");
    }
}
