package com.github.repository;

import com.github.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "SELECT * FROM employees", nativeQuery = true)
    List<Employee> getAllEmployees();

    @Query(value = "SELECT department_id, AVG(salary) FROM employees WHERE department_id IS NOT NULL GROUP BY department_id", nativeQuery = true)
    List<Employee> getAvgSalaryByDepartment();

}
