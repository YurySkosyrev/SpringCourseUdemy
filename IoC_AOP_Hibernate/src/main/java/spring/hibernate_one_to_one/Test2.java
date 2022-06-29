package spring.hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import spring.hibernate_one_to_one.entity.Detail;
import spring.hibernate_one_to_one.entity.Employee;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Petrov", "HR", 850);
//            Detail detail = new Detail("Lomdon", "123456", "oleg@mail.ru");
//
//            employee.setEmpDetail(detail);
//
//            detail.setEmployee(employee);
//            session.beginTransaction();
//
//            session.save(detail);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Detail detail = session.get(Detail.class, 3);
//            System.out.println(detail.getEmployee());
//            session.getTransaction().commit();

            session = factory.getCurrentSession();

            session.beginTransaction();

            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);
            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
