package io.github.ivan100kg.spring_intro;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();
        System.out.println(person.getSurname());
//        Pet cat = context.getBean("catBean", Pet.class);
//        cat.say();

        context.close();
    }
}
