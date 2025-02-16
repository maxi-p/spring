package dev.maxpetrushin.aop.execution_chain;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect
@Order(1)
public class LoggingAspect {
    Logger log = Logger.getLogger(this.getClass().getName());

    @Around("@annotation(ToLog)")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        log.info("Calling the method: " + methodName + " with args " + args);
        Object result = joinPoint.proceed();
        log.info("Result from the method: " + result + "\n");
    }
}
