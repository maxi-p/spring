package dev.maxpetrushin.aop.intercept_method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("dev.maxpetrushin.aop.intercept_method")
@EnableAspectJAutoProxy
public class InterceptConfig {
    @Bean
    public LoggingAspect aspect(@Autowired ApplicationContext context) {
        ChangeDecision decision = context.getBean(ChangeDecision.class);
        return new LoggingAspect(decision);
    }
}
