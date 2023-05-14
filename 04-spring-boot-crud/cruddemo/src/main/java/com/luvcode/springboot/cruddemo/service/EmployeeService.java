package com.luvcode.springboot.cruddemo.service;

import com.luvcode.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
