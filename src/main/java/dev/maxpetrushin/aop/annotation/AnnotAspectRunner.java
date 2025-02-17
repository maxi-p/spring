package dev.maxpetrushin.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class AnnotAspectRunner {
    private static Logger LOGGER = Logger.getLogger(AnnotAspectRunner.class.getName());
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AOPAnnotationConfig.class);

        PostService postService = context.getBean(PostService.class);

        LOGGER.info("Before calling addPost");
        postService.addPost();

        LOGGER.info("Before calling deletePost");
        postService.deletePost();

        LOGGER.info("Before calling editPost");
        postService.editPost();
    }
}
