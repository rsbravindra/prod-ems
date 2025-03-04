package com.prod.ems.controller;

import com.prod.ems.model.Employee;
import com.prod.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping("/create")
    public ResponseEntity<Employee> createEmployee (@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.createEmployee(employee));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Employee>> searchEmployees(@RequestParam String name, @RequestParam String role){
        return ResponseEntity.ok(employeeService.searchEmployees(name,role));
    }
}
