package io.github.ivan100kg.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(void get*())")
    private void allGetMethodsFromUL() {
    }

    @Pointcut("execution(void return*())")
    private void allReturnMethodsFromUL() {
    }

    @Pointcut("execution(void get*()) || execution(void return*())")
    private void allGetAndReturnMethodsFromUL() {
    }

    @Before("allGetMethodsFromUL()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: write Log #1");
    }

    @Before("allReturnMethodsFromUL()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: write Log #2");
    }

    @Before("allGetAndReturnMethodsFromUL()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: write Log #3");
    }


//    @Pointcut("execution(* get*())")
//    private void allGetMethods() {
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: log of trying to get the paper");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: check rights");
//    }

//    @Before("execution(* *(..))")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: trying to return the thing");
//    }

}
