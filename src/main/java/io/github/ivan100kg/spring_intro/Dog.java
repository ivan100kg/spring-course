package io.github.ivan100kg.spring_intro;

public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog bean is created");

    }

    @Override
    public void say() {
        System.out.println("Bow-Bow");
    }
}
