package spring.hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import spring.hibernate_one_to_one.entity.Detail;
import spring.hibernate_one_to_one.entity.Employee;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Yury", "Skosyrev", "IT", 500);
//            Detail detail = new Detail("Mosсow", "123456", "yury@mail.ru");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();

//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 600);
//            Detail detail = new Detail("Ekaterinburg", "123456", "oleg@mail.ru");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 10);
//            System.out.println(emp.getEmpDetail());
//            session.getTransaction().commit();

            session = factory.getCurrentSession();

            session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);
            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
