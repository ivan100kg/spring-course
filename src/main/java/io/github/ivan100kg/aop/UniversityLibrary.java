package io.github.ivan100kg.aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {
//    @Override
    public void getBook() {
        System.out.println("get the book from UL");
        System.out.println("-------------------------");
    }

    public void getMagazine() {
        System.out.println("get the magazine from UL");
        System.out.println("-------------------------");

    }

    public String returnBook() {
        System.out.println("returning the book to UL");
        if (true) throw new IllegalStateException("My test Exception");
        return "The Lord of the Rings";

    }

    public void returnMagazine() {
        System.out.println("return the magazine to UL");
        System.out.println("-------------------------");

    }

    public void addBook(String personName, Book book) {
        System.out.println("add the book: '" + book.getName() + "' to UL");
        System.out.println("-------------------------");

    }

    public void addMagazine() {
        System.out.println("add the magazine to UL");
        System.out.println("-------------------------");

    }

}
