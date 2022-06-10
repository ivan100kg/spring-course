package io.github.ivan100kg.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
        Book book = context.getBean("book", Book.class);
        universityLibrary.addBook("Ivan", book);
        universityLibrary.addMagazine();
        universityLibrary.getBook();
//        universityLibrary.returnMagazine();
//        System.out.println();
//        universityLibrary.addBook();
//        universityLibrary.returnBook();
//        universityLibrary.getMagazine();

//        System.out.println();
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
