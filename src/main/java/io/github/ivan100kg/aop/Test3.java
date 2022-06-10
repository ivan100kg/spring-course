package io.github.ivan100kg.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts-----+\n");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary library = context.getBean("universityLibrary", UniversityLibrary.class);
        String book = library.returnBook();
        System.out.println("book: " + book);

        context.close();
        System.out.println("\n+----Method main ends");
    }
}
