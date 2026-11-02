package com.jecrc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() { // Entry point
        System.out.println("Hello");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       // ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();

        // Hence, String is taken as the bean class
//        String beanValue = context.getBean(String.class);
//        System.out.println(beanValue);
//
//        Integer beanValue1 = context.getBean(Integer.class);
//        System.out.println(beanValue1);
//
////        Integer beanValue2 = context.getBean(Integer.class);
////        System.out.println(beanValue2);
//        // why error
//
//
//        AppConfig obj = context.getBean(AppConfig.class);
//        obj.demo();

        CartService cart = context.getBean(CartService.class);
////        cart.getValue(1);
        System.out.println(cart.getValue(1));

        //context.close();
    }
}
