package io.github.ivan100kg.aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {
//    @Override
    public void getBook() {
        System.out.println("get the book from UL");
    }

    public void getMagazine() {
        System.out.println("get the magazine from UL");
    }

    public void returnBook() {
        System.out.println("returning the book to UL");
    }

    public void returnMagazine() {
        System.out.println("return the magazine to UL");
    }

    public void addBook() {
        System.out.println("add the book to UL");
    }

    public void addMagazine() {
        System.out.println("add the magazine to UL");
    }

}
