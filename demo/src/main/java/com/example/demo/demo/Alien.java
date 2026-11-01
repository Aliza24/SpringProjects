package com.example.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Autowired
    Desktop dtp;
    @Autowired
    Laptop lap;
    public void code()
    {
        System.out.println("---Hello from Alien---");
        dtp.code1();
        lap.code2();
    }
}