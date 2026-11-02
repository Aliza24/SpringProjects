package org.jecrcuniversity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    private PaymentService paymentService;

//    public OrderService(PaymentService paymentService)
//    {
//        this.paymentService = paymentService;
//    }

    public void placeOrder()
    {
        paymentService.pay();
        // End of Circular Dependency
        getOrderService();
        System.out.println("Order Placed");
    }
    public void getOrderService()
    {
        System.out.println("Order Details");
    }
}
