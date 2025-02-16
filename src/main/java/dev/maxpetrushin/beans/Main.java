package dev.maxpetrushin.beans;

import dev.maxpetrushin.beans.stereotype.CommentRepo;
import dev.maxpetrushin.beans.stereotype.CommentService;
import dev.maxpetrushin.beans.stereotype.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        UserService userService = context.getBean(UserService.class);
        CommentService commentService = context.getBean(CommentService.class);
        CommentRepo commentRepo = context.getBean(CommentRepo.class);

        System.out.println(userService.commentRepo == commentService.commentRepo);
        System.out.println(userService.commentRepo == commentRepo);

        System.out.println(context.getBean(CommentService.class).commentRepo == context.getBean(UserService.class).commentRepo);
    }
}