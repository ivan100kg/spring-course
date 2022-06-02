package io.github.ivan100kg.spring_intro;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
