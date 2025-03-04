package com.prod.ems.service;

import com.prod.ems.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee (Employee employee);
    List<Employee> searchEmployees(String name, String role);
}
