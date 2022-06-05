package io.github.ivan100kg.spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
//        Pet pet = new Cat();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Pet pet = context.getBean("myPet", Pet.class);
//        Person person = new Person(pet);
//        person.callYourPet();
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
