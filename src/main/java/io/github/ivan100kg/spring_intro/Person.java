package io.github.ivan100kg.spring_intro;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("setSurname()");
        this.surname = surname;
    }

    public int getAge() {
        System.out.println("setAge()");
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person bean is created");
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
