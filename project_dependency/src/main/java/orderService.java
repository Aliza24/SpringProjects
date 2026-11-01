import Notification.Notification;
import org.springframework.stereotype.Component;

@Component
public class orderService {

    Notification notification;
    public orderService(Notification)
    {
        this.notification = notication;
    }
    public void orderNow()
    {

        System.out.println("Order Created");
    }

}
