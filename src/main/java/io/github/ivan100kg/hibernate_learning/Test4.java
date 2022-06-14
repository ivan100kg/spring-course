package io.github.ivan100kg.hibernate_learning;

import io.github.ivan100kg.hibernate_learning.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            // QUERY to DB
//            Employee emp = session.get(Employee.class, 2);
//            emp.setSalary(750);
            session.createQuery("UPDATE Employee SET salary=salary+10 WHERE name LIKE '%nn%'")
                    .executeUpdate();

            session.getTransaction().commit();
        }
    }
}
