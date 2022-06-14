package io.github.ivan100kg.hibernate_learning;

import io.github.ivan100kg.hibernate_learning.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = factory.getCurrentSession();
            session.beginTransaction(); // -------------------

//            List<Employee> employees = session.createQuery("from Employee")
//                            .getResultList();
            List<Employee> employees = session.createQuery("FROM Employee " +
                            "WHERE salary > 100 AND id > -1 ORDER BY salary DESC")
                    .getResultList();

            employees.forEach(System.out::println);

            session.getTransaction().commit();  // -----------
        }
    }
}
