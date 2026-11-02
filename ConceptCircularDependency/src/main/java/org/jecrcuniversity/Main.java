package org.jecrcuniversity;

import org.jecrcuniversity.sample.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        System.out.println("Hello");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();

//        A a = new A();
        A obj = context.getBean(A.class);
        obj.showA();

    }
}