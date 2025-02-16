package dev.maxpetrushin.aop.intercept_method;

import dev.maxpetrushin.aop.annotation.AnnotAspectRunner;
import dev.maxpetrushin.aop.intercept_method.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class InterceptRunner {
    private static Logger LOGGER = Logger.getLogger(AnnotAspectRunner.class.getName());

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        CommentService service = context.getBean(CommentService.class);
        String result = service.publishComment(new Comment("AOP", "Max"));
        LOGGER.info(result + " (didn't change the agruments and return)\n");

        ChangeDecision decision = context.getBean(ChangeDecision.class);
        decision.setCHANGE_ARGUMENT(true);
        decision.setCHANGE_RETURNED_OBJECT(true);

        result = service.publishComment(new Comment("AOP", "Max"));
        LOGGER.info(result + " (changed the agruments and return)");
    }
}
