package dev.maxpetrushin.bean_scopes.singleton_lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        System.out.println("Before EAGER creation");
        context.getBean(Duck.class);
        System.out.println("After EAGER creation");

        System.out.println("Before LAZY creation (only created on first request)");
        context.getBean(Turkey.class);
        System.out.println("After LAZY creation");
    }
}
