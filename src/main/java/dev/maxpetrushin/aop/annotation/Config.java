package dev.maxpetrushin.aop.annotation;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("dev.maxpetrushin.aop.annotation")
@EnableAspectJAutoProxy
public class Config {
    @Bean
    public AnnotationAspect annotationAspect() {
        return new AnnotationAspect();
    }
}
