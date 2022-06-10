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
        long start = System.currentTimeMillis();
        Object targetResult = point.proceed();
        System.out.println("After target method");
        System.out.println("time: " + (System.currentTimeMillis() - start));
        return targetResult;
    }
}
