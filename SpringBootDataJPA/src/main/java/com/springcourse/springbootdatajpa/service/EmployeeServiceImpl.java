package com.springcourse.springbootdatajpa.service;



import com.springcourse.springbootdatajpa.dao.EmployeeRepository;
import com.springcourse.springbootdatajpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
//    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
//    @Transactional
    public void saveEmployee(Employee employee) { employeeRepository.save(employee);
    }

    @Override
//    @Transactional
    public Employee getEmployee(int id) {

        Employee employee = null;
        Optional<Employee> optional = employeeRepository.findById(id);
        if(optional.isPresent()){
            employee=optional.get();
        }
        return employee;
    }

    @Override
//    @Transactional
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAllByName(String name) {
        List<Employee> employees = employeeRepository.findAllByName(name);
        return employees;
    }
}
