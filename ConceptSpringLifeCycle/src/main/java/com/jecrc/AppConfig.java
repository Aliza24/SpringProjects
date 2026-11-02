package com.jecrc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.jecrc")
public class AppConfig {
    @Bean
    public String createBean() // createBean has no class so "String" will become it's class
    {
        return "Hello from Bean";
    }

    @Bean
    public Integer createBean1()
    {
        return 6;
    }

//    @Bean
//    public Integer obj()
//    {
//        return 345;
//    }

    // method declaration without bean
//    public void demo()
//    {
//        System.out.println("Demo Return");
//    }

    @Bean(initMethod = "start")
    public CartService getCartBean()
    {
        return new CartService();
    }
//    @Bean
//    public CartService getCartBean()
//    {
//        return new CartService();
//    }
}
