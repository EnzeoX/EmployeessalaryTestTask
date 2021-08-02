package com.github.service;

import com.github.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEmployeeService {

    void saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    List<Employee> getAvgSalaryByDepartment();
}
