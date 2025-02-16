package dev.maxpetrushin.aop.execution_chain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExecChainRunnner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        CustomService service = context.getBean(CustomService.class);
        service.exec();
    }
}
