package io.github.ivan100kg.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*())")
    private void allGetMethods() {
    }

    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: log of trying to get the paper");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: check rights");
    }

//    @Before("execution(* *(..))")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: trying to return the thing");
//    }

}
