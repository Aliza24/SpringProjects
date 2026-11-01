package com.example.demo.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Operations {
    @Autowired
    Arithmetic atm;

    @Autowired
    Boolean bool;

    @Autowired
    Logical log;

    public void code()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("These are the operations: ");
        atm.code1(sc);
        bool.code2(sc);
        log.code3(sc);
        sc.close();
    }
}
