package com.prod.ems.repository;

import com.prod.ems.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT e FROM Employee e WHERE e.name LIKE %:name AND e.role=:role")
    List<Employee> searchByNameAndRole(@Param("name") String name, @Param("role") String role);
}
