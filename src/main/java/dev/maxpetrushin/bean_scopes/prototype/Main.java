package dev.maxpetrushin.bean_scopes.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PrototypeConfig.class);

        CommentService commentService = context.getBean("commentService3", CommentService.class);
        CommentProcBean c1 = commentService.processComment();
        CommentProcBean c2 = commentService.processComment();

        System.out.println(c1 == c2); // false
    }
}
