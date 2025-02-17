package dev.maxpetrushin.beans.abstraction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
            ApplicationContext context = new AnnotationConfigApplicationContext(AbstractionConfig.class);

            CommentService service = context.getBean("commentService2", CommentService.class);
            service.readComment();
            // If I didn't have @Primary at one of the abstractions, then would
            // throw UnsatisfiedDependencyException
    }
}
