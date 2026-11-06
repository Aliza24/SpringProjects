package com.SpringBootTest2.jecrc;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private final PaymentService paymentService;

    // Constructor Injection (No import needed since they are in the same package)
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
