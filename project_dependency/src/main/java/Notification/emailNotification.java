package Notification;

import com.sun.nio.sctp.Notification;
import org.springframework.stereotype.Component;

@Component
public class emailNotification implements Notification {
    @Override
    public void sendMessage()
    {
        System.out.println("Email Notification Send");
    }
}
