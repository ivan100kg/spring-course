package io.github.ivan100kg.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//    @Pointcut("execution(* io.github.ivan100kg.aop.UniversityLibrary.*(..))")
//    private void allMethodsFromUL(){
//    }
//
//    @Pointcut("execution(public void returnMagazine())")
//    private void returnMagazineFromUL(){}
//
//    @Pointcut("allMethodsFromUL() && !returnMagazineFromUL()")
//    private void allMethodsExceptReturnMagazineFromUL(){}
//
//    @Before("allMethodsExceptReturnMagazineFromUL()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #4");
//    }


//    @Pointcut("execution(void get*())")
//    private void allGetMethodsFromUL() {
//    }
//
//    @Pointcut("execution(void return*())")
//    private void allReturnMethodsFromUL() {
//    }
//
//    @Pointcut("execution(void get*()) || execution(void return*())")
//    private void allGetAndReturnMethodsFromUL() {
//    }
//
//    @Before("allGetMethodsFromUL()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: write Log #1");
//    }
//
//    @Before("allReturnMethodsFromUL()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: write Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUL()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: write Log #3");
//    }



    @Before("io.github.ivan100kg.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature mS = (MethodSignature) joinPoint.getSignature();
        System.out.println("mS: " + mS);
        System.out.println("mS.getName(): " + mS.getName());
        System.out.println("mS.getMethod(): " + mS.getMethod());
        System.out.println("mS.getParameterTypes(): " + Arrays.toString(mS.getParameterTypes()));
        System.out.println("mS.getReturnType(): " + mS.getReturnType());
        Object[] arguments = joinPoint.getArgs();
        System.out.println(Arrays.toString(arguments));
        System.out.println("beforeAddLoggingAdvice: log of trying to get the paper");
        System.out.println("-------------------------");


    }


//    @Before("execution(* *(..))")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: trying to return the thing");
//    }

}
