package com.github.service.impl;

import com.github.entity.Department;
import com.github.repository.IDepartmentRepository;
import com.github.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DepartmentService implements IDepartmentService {

    private final IDepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(IDepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void saveDepartment(Department department) {
        this.departmentRepository.save(department);
    }
}
