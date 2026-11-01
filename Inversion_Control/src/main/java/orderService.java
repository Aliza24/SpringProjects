import org.springframework.steroetype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class orderService {

    // Field Injection
    // @Autowired
    private PaymentService paymentservice;

    //IOC Implementation
    public OrderService(@Qualifier("upi") PaymentService paymentservice)
    {
        this.paymentservice = paymentservice;
    }
    public void placeOrder()
    {
        // paymentservice.pay()
        System.out.println("Order Placed...");
    }
    // Constructor Injection
    // @Autowired
    // public OrderService(PaymentService paymentservice)
    // {
    //   this.paymentservice = paymentservice;
    // }

    // Setter Injection
    // @Autowired
    // public void main() {
    //
    // }

}

