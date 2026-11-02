package test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
@SpringBootApplication
public class Main {
    static void main() {
        ApplicationContext context = SpringApplication.run(Main.class);
        HelloWorld obj = context.getBean(HelloWorld.class);
        obj.print();
    }
}