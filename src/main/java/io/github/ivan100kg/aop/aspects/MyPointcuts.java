package io.github.ivan100kg.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* unknown*(..))")
    public void allAddMethods() {
    }
}
