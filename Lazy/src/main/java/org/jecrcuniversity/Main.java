package org.jecrcuniversity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        System.out.println("Hello");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


    }
}
