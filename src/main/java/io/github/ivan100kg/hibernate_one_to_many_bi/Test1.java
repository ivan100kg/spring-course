package io.github.ivan100kg.hibernate_one_to_many_bi;

import io.github.ivan100kg.hibernate_one_to_many_bi.entity.Department;
import io.github.ivan100kg.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
            Session session = factory.getCurrentSession()) {
            session.beginTransaction();

//            Department department1 = new Department("IT",1500, 300);
//            Department department2 = new Department("HR",1200, 800);
//
//            Employee employee1 = new Employee("Ivan", "Bond", 1300);
//            Employee employee2 = new Employee("Efim", "Bird", 980);
//
//            department1.addEmployeeToDepartment(employee1);
//            department1.addEmployeeToDepartment(employee2);
//
//            session.save(department1);

//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmployees());
//
            Employee employee = session.get(Employee.class, 15);
//            System.out.println(employee.getDepartment());
//
            session.delete(employee);

            session.getTransaction().commit();
        }
    }
}
