package io.github.ivan100kg.hibernate2;

import io.github.ivan100kg.hibernate2.entity.Detail;
import io.github.ivan100kg.hibernate2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {
            Employee emp = new Employee("Oleg", "Pacman", "Security", 230);
            Detail detail = new Detail("Samara", "+79172309076", "oleg@gmail.com");
            emp.setEmpDetail(detail);
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(emp);


            session.getTransaction().commit();
        }
    }
}
