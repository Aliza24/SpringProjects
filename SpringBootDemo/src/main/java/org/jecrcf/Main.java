package org.jecrcf;
import org.jecrcuniversity.cartService;
import org.jecrcf.payment.paymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        //org.jecrcf.OrderService obj = new org.jecrcf.OrderService();
       //obj.placeOrder();
        //org.jecrcf.payment.paymentService service = new org.jecrcf.payment.paymentService();
        //org.jecrcf.OrderService order = new org.jecrcf.OrderService(service);
        //order.placeOrder();
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();

        //cartService carts = new cartService();
        //carts.addToCart();
        //paymentService payment = context.getBean(paymentService.class);
        //payment.pay();

        // Use Case 1
//        User user = context.getBean(User.class);
//        System.out.println(user.getName());
//        System.out.println(user.getAge());

        // Use Case 2
       cartService cart = context.getBean(cartService.class);
       cart.addToCart();

       paymentService card = (paymentService) context.getBean("cardPayment");
       paymentService upi = (paymentService) context.getBean("upiPayment");

       card.pay();
       upi.pay();
    }
}