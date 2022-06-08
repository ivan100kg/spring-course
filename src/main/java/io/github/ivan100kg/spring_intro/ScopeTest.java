package io.github.ivan100kg.spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext3.xml"
        );

        Cat cat1 = context.getBean("catBean", Cat.class);
        Cat cat2 = context.getBean("catBean", Cat.class);

        Dog dog1 = context.getBean("dog", Dog.class);
        Dog dog2 = context.getBean("dog", Dog.class);

        System.out.println("Prototype: obj1 == obj2 ? " + (cat1 == cat2));
        System.out.println("Singleton: obj1 == obj2 ? " + (dog1 == dog2));

        context.close();

    }
}
