package com.prod.ems.service.impl;

import com.prod.ems.kafka.EmployeeKafkaProducer;
import com.prod.ems.model.Employee;
import com.prod.ems.repository.EmployeeRepository;
import com.prod.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    private EmployeeKafkaProducer kafkaProducer;

    public Employee createEmployee (Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        kafkaProducer.sendEmployeeCreationEvent(savedEmployee);
        return employee;
    }

    public List<Employee> searchEmployees(String name, String role) {
        return employeeRepository.searchByNameAndRole(name,role);
    }
}
