package io.github.ivan100kg.aop;

import org.springframework.stereotype.Component;

@Component
public class Library {
    public void getBook() {
        System.out.println("We are getting the book");
    }
}
