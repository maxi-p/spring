package dev.maxpetrushin.bean_scopes;

import dev.maxpetrushin.bean_scopes.prototype.CommentProcBean;
import dev.maxpetrushin.bean_scopes.prototype.CommentService;
import dev.maxpetrushin.bean_scopes.prototype.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        CommentService commentService = context.getBean(CommentService.class);
        CommentProcBean c1 = commentService.processComment();
        CommentProcBean c2 = commentService.processComment();

        System.out.println(c1 == c2); // false
    }
}
