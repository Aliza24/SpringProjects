package org.jecrcf;

import org.jecrcf.payment.paymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    // 1. Declare the field dependency (Best practice: make it final)
    private paymentService service;

    // 2. Constructor Injection (Recommended)
    // Note: If this is the only constructor, @Autowired is optional in modern Spring
    //@Autowired
    //public OrderService(@Qualifier("upi") paymentService service) {
    //  this.service = service;
    //}

//    public void placeOrder() {
    //      service.pay();
    //    System.out.println("Order Placed...");
    //}

    // Constructor Injection
    @Autowired
    public OrderService() {
        this.service = service;
    }


// Field Injection Method - Avoid
//@Autowired
    //  private paymentService service;
    // public OrderService(paymentService service)
    //{
    //this.service = service;
    //}
    //Constructor Injection
    // - Most Suitable

    // Setter Injection Method
    public void placeOrder()
    {
        service.pay();
        System.out.println("Order Placed");
    }

    //@Autowired
    public void setService(paymentService service) {
        //this.service = service;
    }

}