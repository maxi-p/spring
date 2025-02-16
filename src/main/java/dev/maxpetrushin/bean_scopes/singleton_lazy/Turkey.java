package dev.maxpetrushin.bean_scopes.singleton_lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Turkey {
    public Turkey() {
        System.out.println("Turkey created");
    }
}
