package spring.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import spring.hibernate_test.entity.Employee;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();

            Employee emp = new Employee("Elena", "Petrova", "Sales", 800);

            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();

            int myId = emp.getId();

            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, myId);
            session.getTransaction().commit();

            System.out.println(employee);
        }
        finally {
            factory.close();
        }
    }
}
