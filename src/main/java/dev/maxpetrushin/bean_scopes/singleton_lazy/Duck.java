package dev.maxpetrushin.bean_scopes.singleton_lazy;

import org.springframework.stereotype.Component;

@Component
public class Duck {
    public Duck() {
        System.out.println("Duck created");
    }
}
