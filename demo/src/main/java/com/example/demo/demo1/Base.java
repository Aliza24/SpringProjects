package com.example.demo.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Base {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Base.class, args);
        System.out.println("Hello from the Base Class");

        Operations obj = context.getBean(Operations.class);
        obj.code();
    }
}