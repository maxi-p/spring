package dev.maxpetrushin.aop.intercept_method;

import dev.maxpetrushin.aop.intercept_method.service.CommentService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private final ChangeDecision changeDecision;

    public LoggingAspect(ChangeDecision changeDecision) {
        this.changeDecision = changeDecision;
    }
    private static Logger LOGGER = Logger.getLogger(CommentService.class.getName());

    @Around("execution(* dev.maxpetrushin.aop.intercept_method.service.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        LOGGER.info("Method " + methodName +
                " with parameters " + Arrays.asList(args) +
                " will execute");
        Object returnedByMethod;
        if (changeDecision.isCHANGE_ARGUMENT()) {
            Comment comment = new Comment("AOP", "John");
            Object[] newArgs = {comment};
            returnedByMethod = joinPoint.proceed(newArgs);

        } else {
            returnedByMethod = joinPoint.proceed();
        }
        LOGGER.info("Method executed and returned " + returnedByMethod + "\n");
        if (changeDecision.isCHANGE_RETURNED_OBJECT()) {
            return "FAILED";
        } else {
            return returnedByMethod;
        }
    }
}
