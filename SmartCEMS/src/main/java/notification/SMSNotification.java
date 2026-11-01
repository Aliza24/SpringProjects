package notification;

import io.micrometer.observation.annotation.ObservationKeyValue;
import org.springframework.stereotype.Component;

@Component
public class SMSNotification implements NotificationService {
    @Override
            public void sendNotification()
    {
        System.out.println("Notification sent via SMS");
    }
}
