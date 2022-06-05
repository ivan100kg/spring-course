package io.github.ivan100kg.spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext2.xml"
        );
        Dog dog1 = context.getBean("myPet", Dog.class);
//        Dog dog2 = context.getBean("myPet", Dog.class);
//        dog1.setName("Sharik");
//        dog2.setName("Bobik");
//
//        System.out.println(dog1 == dog2);
//        System.out.println("dog1 name: " + dog1.getName());
//        System.out.println("dog2 name: " + dog2.getName());
        context.close();
    }
}
