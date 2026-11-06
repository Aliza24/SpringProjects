package com.jecrc.payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class UPIPayment implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Payment Method: UPI");
        System.out.println("Paid Rs. " + amount + " using UPI");
        System.out.println("UPI Payment Successful!");
    }
}