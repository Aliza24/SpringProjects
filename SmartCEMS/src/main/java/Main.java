import event.EventRegistrationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EventRegistrationService service = context.getBean(EventRegistrationService.class);
        service.registerStudent("Aliza", "Tech Fest", 101);
    }
}
