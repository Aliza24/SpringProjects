package com.jecrc;

import com.jecrc.payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService paymentService;

//    //Constrcutor Injection
//    public OrderService(@Qualifier("upi") PaymentService paymentService)
//    {
//        this.paymentService = paymentService;
//    }

    public void placeOrder()
    {
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
