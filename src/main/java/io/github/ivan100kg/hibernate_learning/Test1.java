package io.github.ivan100kg.hibernate_learning;

import io.github.ivan100kg.hibernate_learning.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Ichtyandr", "Ebanyi", "HUI0", 4500);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
