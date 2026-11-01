package event;

import notification.NotificationService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.jecrc")
public class EventRegistrationService {

    private NotificationService channel;

    public EventRegistrationService(NotificationService channel) {
        this.channel = channel;
    }

    public void registerStudent(String name, String eventName, int rollNo) {
        System.out.println("Registration of: " + name + " having Roll No: " + rollNo + " for " + eventName + " is Successful");
    }
}