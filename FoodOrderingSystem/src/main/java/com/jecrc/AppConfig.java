package com.jecrc;

import com.jecrc.model.*;
import com.jecrc.menu.*;
import com.jecrc.payment.*;

import com.jecrc.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class AppConfig {

    @Bean
    public Customer customer() {
        return new Customer(101, "Rahul", "Jaipur");
    }

    @Bean
    public Restaurant restaurant() {
        return new Restaurant("Foodie's Hub", "Jaipur");
    }

    @Bean
    public Menu pizza() {
        return new Menu("Pizza", 250);
    }

    @Bean
    public Menu burger() {
        return new Menu("Burger", 120);
    }

    @Bean
    public Menu coldCoffee() {
        return new Menu("Cold Coffee", 80);
    }

    @Bean
    public MenuProvider menuProvider() {

        return new StaticMenu(
                Arrays.asList(pizza(), burger(), coldCoffee())
        );
    }

    @Bean
    public Order order(Customer customer) {

        return new Order(
                customer,
                Arrays.asList(
                        new Cart(pizza(), 2),
                        new Cart(burger(), 1),
                        new Cart(coldCoffee(), 2)
                )
        );
    }

    @Bean
    public BillCalculator billCalculator() {
        return new OrderTotalCalculator();
    }

    @Bean
    public OrderTotalService orderTotalService(
            BillCalculator billCalculator) {

        return new OrderTotalManager(billCalculator);
    }

    // Choose UPI payment
    @Bean
    public PaymentService paymentService() {
        return new UPIPayment();
    }

    @Bean
    public OrderService orderService(
            Restaurant restaurant,
            MenuProvider menuProvider,
            OrderTotalService orderTotalService,
            PaymentService paymentService) {

        return new OrderService(
                restaurant,
                menuProvider,
                orderTotalService,
                paymentService
        );
    }
}