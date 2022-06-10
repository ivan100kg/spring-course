package io.github.ivan100kg.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Ivan", 5, 9.9);
        Student st2 = new Student("Olga", 1, 8.2);
        Student st3 = new Student("Inna", 3, 6.3);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("getStudents starts");
        if (false) throw new IllegalStateException("My Test Exception");
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }
}
