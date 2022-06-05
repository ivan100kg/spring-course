package io.github.ivan100kg.spring_intro;

public class Dog implements Pet{
    private String name;
    public Dog() {
        System.out.println("Dog bean is created");

    }

    @Override
    public void say() {
        System.out.println("Bow-Bow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
