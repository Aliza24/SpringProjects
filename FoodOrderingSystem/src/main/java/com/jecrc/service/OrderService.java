package com.jecrc.service;

import com.jecrc.model.*;
import com.jecrc.menu.MenuProvider;
import com.jecrc.payment.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private Restaurant restaurant;
    private MenuProvider menuProvider;
    private OrderTotalService orderTotalService;
    private PaymentService paymentService;

    public OrderService(Restaurant restaurant,
                        MenuProvider menuProvider,
                        OrderTotalService orderTotalService,
                        PaymentService paymentService) {

        this.restaurant = restaurant;
        this.menuProvider = menuProvider;
        this.orderTotalService = orderTotalService;
        this.paymentService = paymentService;
    }

    public void placeOrder(Order order) {

        System.out.println("===== FOOD ORDERING SYSTEM =====");

        restaurant.display();

        System.out.println("\nAvailable Menu:");

        for (Menu item : menuProvider.getMenu()) {
            System.out.println(item.getName()
                    + " - Rs. " + item.getPrice());
        }

        System.out.println("\nCustomer Details:");
        order.getCustomer().display();

        System.out.println("\nOrder Summary:");

        for (Cart item : order.getItems()) {

            System.out.println(
                    item.getSelectedItem().getName()
                            + " x " + item.getQuantity()
                            + " = Rs. " + item.getSubtotal()
            );
        }

        double total = orderTotalService.getOrderTotal(order);

        System.out.println("------------------------------");
        System.out.println("Total Bill: Rs. " + total);

        paymentService.pay(total);

        System.out.println("Order placed successfully!");
    }
}