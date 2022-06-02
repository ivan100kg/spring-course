package io.github.ivan100kg.spring_intro;

public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("Bow-Bow");
    }
}
