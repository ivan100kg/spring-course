package io.github.ivan100kg.aop.aspects;

import io.github.ivan100kg.aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
@Order(10)
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(JoinPoint joinPoint) {
        System.out.println("beforeGetStudentsLoggingAdvice: logging before getStudents");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        students.get(0).setCourse(6);
        System.out.println("afterReturningGetStudentsLoggingAdvice: logging after success working getStudents");

    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "myEx")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable myEx){
        System.out.println("afterThrowingGetStudentsLoggingAdvice: throws " + myEx);
    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: log #12");
    }


}
