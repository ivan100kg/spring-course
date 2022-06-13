package io.github.ivan100kg.hibernate_learning;

import io.github.ivan100kg.hibernate_learning.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Inna", "Gorban", "HR", 350);
//            int myId = emp.getId();
//            System.out.println("Lena id: " + myId);

            session.beginTransaction(); // -------------------

            session.save(emp);
            emp = session.get(Employee.class, 3);

            session.getTransaction().commit();  // -----------

            System.out.println(emp);
        }
        finally {
            factory.close();
        }
    }
}
