package dev.maxpetrushin.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class AnnotationAspect {

    public Logger LOGGER = Logger.getLogger(AnnotationAspect.class.getName());

    @Around("@annotation(ToLog)")
    public void logDeleted(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        LOGGER.info("Calling the method: " + methodName + " with agruments: " + args);
        Object returned = joinPoint.proceed();
        LOGGER.info("After the method, result: " + returned + "\n");
    }

    @AfterReturning(value="@annotation(ToLog)", returning="returnedValue")
    public void logDeleted(Object returnedValue) throws Throwable {
        LOGGER.info("Method returned: " + returnedValue);
    }
}
