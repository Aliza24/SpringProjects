package org.jecrcf;
import org.jecrcuniversity.cartService;
import org.jecrcf.payment.cardPayment;
import org.jecrcf.payment.paymentService;
import org.jecrcf.payment.upiPayment;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.jecrcf")
public class AppConfig {

    @Bean
    public User createUser()
    {

        return new User("Aliza", 22);
    }

    @Bean
    public cartService createCartService()
    {
        return new cartService();
    }

    @Primary
    @Bean
    public paymentService createPayment()
    {

        return new cardPayment();
    }

   // @Bean
//    public OrderService createOrderService(paymentService service)
//    {
//        return new OrderService(service);
//    }

    @Bean
    public OrderService createOrderService(paymentService service)
    {
//        paymentService payment = createPayment();
        OrderService order = new OrderService();
//        order.setService(payment);
        return new OrderService();
    }

    @Bean
    public paymentService createUPIPayment()
    {
        return new upiPayment();
    }


}