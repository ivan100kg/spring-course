package io.github.ivan100kg.hibernate2;

import io.github.ivan100kg.hibernate2.entity.Detail;
import io.github.ivan100kg.hibernate2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
            Session session = factory.getCurrentSession()) {
//            Employee emp = new Employee("Petr", "Pacman", "Security", 260);
//            Detail detail = new Detail("Samara", "+79172309076", "oleg@gmail.com");

//            emp.setEmpDetail(detail);
//            detail.setEmployee(emp);

            session.beginTransaction();
            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);
            session.getTransaction().commit();
        }
    }
}
