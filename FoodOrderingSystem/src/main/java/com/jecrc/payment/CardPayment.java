package com.jecrc.payment;

import org.springframework.stereotype.Component;

@Component
public class CardPayment implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Payment Method: Card");
        System.out.println("Paid Rs. " + amount + " using Card");
        System.out.println("Card Payment Successful!");
    }
}