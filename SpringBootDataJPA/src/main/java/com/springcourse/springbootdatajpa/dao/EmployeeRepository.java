package com.springcourse.springbootdatajpa.dao;


import com.springcourse.springbootdatajpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository <Employee, Integer> {
    public List<Employee> findAllByName(String name);
}
