package com.jecrc;

import com.jecrc.model.Order;

import com.jecrc.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService service =
                context.getBean(OrderService.class);

        Order order =
                context.getBean(Order.class);

        System.out.println("Welcome to Food Ordering System\n");

        service.placeOrder(order);

        context.close();
    }
}