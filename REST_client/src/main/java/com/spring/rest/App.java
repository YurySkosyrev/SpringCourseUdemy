package com.spring.rest;

import com.spring.rest.configuration.MyConfig;
import com.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployee();
//        System.out.println(allEmployees);

//        Employee empByID = communication.getEmployee(2);
//        System.out.println(empByID);

//        Employee emp = new Employee("Sveta", "Sokolova", "IT", 800);
//        emp.setId(5);
//        communication.saveEmployee(emp);

        communication.deleteEmployee(5);
    }
}
