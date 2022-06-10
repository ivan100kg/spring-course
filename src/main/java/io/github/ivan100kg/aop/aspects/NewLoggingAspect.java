package io.github.ivan100kg.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint point) throws Throwable {
        System.out.println("Before target method");
        Object targetResult = null;
        try {
            targetResult = point.proceed();
        } catch (IllegalStateException ex) {
            System.out.println("Caught: " + ex.getMessage());
            throw ex;
        }
        System.out.println("After target method");
        return targetResult;
    }
}
