package com.github.service.impl;

import com.github.entity.Employee;
import com.github.repository.IEmployeeRepository;
import com.github.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeService implements IEmployeeService {

    private final IEmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void saveEmployee(Employee data) {
        this.employeeRepository.save(data);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public List<Employee> getAvgSalaryByDepartment() {
        return employeeRepository.getAvgSalaryByDepartment();
    }
}
