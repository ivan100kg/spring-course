package io.github.ivan100kg.hibernate_many_to_many;

import io.github.ivan100kg.hibernate_many_to_many.entity.Child;
import io.github.ivan100kg.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        try (
                SessionFactory factory = new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Child.class)
                        .addAnnotatedClass(Section.class)
                        .buildSessionFactory();
                Session session = factory.getCurrentSession()) {
            session.beginTransaction();

//            Section section = new Section("Boxing");
//            Child child1 = session.get(Child.class, 5);
//            Child child2 = session.get(Child.class, 6);
//            Child child3 = session.get(Child.class, 7);
//            section.addChildToSection(child1);
//            section.addChildToSection(child2);
//            section.addChildToSection(child3);
//            session.persist(section);

//
//            Section section1 = new Section("Math");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Dance");
//            Child child = new Child("Inna", 5);
//            child.addSectionToChild(section1);
//            child.addSectionToChild(section2);
//            child.addSectionToChild(section3);
//            session.save(child);

//            Section section = session.get(Section.class, 4);
//            section.getChildren().forEach(System.out::println);
//            session.delete(section);

            Child child = session.get(Child.class, 4);
            child.getSections().forEach(System.out::println);
            session.remove(child);

            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
