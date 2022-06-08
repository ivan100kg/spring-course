package io.github.ivan100kg.spring_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    @Autowired
    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

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


    public Person() {
        System.out.println("Person bean is created");
    }

//    @Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Pet was set in Person");
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
