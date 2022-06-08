package io.github.ivan100kg.spring_intro;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("singleton")
public class Dog implements Pet{
//    private String name;
    public Dog() {
        System.out.println("Dog bean is created");

    }

    @Override
    public void say() {
        System.out.println("Bow-Bow");
    }

//    @PostConstruct
//    private void init() {
//        System.out.println("class Dog: init method");
//    }
//
//    @PreDestroy
//    private void destroy() {
//        System.out.println("class Dog: destroy method");
//    }



//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
