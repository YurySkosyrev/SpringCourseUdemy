package spring.hibernate_one_to_many_by;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import spring.hibernate_one_to_many_by.entity.Department;
import spring.hibernate_one_to_many_by.entity.Employee;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();

//            Department dep = new Department("Sales", 800, 1500);
//
//            Employee emp1 = new Employee("Yury", "Skosyrev", 800);
//            Employee emp2 = new Employee("Elena", "Sidorova", 1200);
//            Employee emp3 = new Employee("Anton", "Petrov", 850);
//
//            session.beginTransaction();
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//            session.save(dep);
//            session.getTransaction().commit();
//***********************************************************
            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 4);
            System.out.println("Show department");
            System.out.println(department);

            System.out.println("Loading Employes");
            department.getEmps().get(0);
            session.getTransaction().commit();

            System.out.println("Show Employes");
            System.out.println(department.getEmps());
//***********************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee.getDepartment());
//            session.getTransaction().commit();
//***********************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 4);
//
//            session.delete(employee);
//            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
