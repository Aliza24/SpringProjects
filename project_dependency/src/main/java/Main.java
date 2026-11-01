import Notification.Notification;
import Notification.emailNotification;

import org.springframework.context.ApplicationContext;

public class Main {
    static void main() {
        System.out.println("Hello");

        Notification notification = new emailNotification();
        orderService obj1 = new orderService();
        obj1.orderNow();
        //Payment obj2 = new Payment();
        //obj1.orderNow();

    }
}
