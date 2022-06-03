package io.github.ivan100kg.spring_intro;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Pet was set in Person");
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
