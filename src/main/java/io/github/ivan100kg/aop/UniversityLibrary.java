package io.github.ivan100kg.aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {
//    @Override
    public void getBook() {
        System.out.println("We are getting the book from University Library");
    }

    public void getMagazine() {
        System.out.println("We are getting the magazine from University Library");
    }

//    public void returnBook() {
//        System.out.println("We are returning the book to University Library");
//    }
}
