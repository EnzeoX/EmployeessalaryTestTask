package com.github.service;

import com.github.entity.Department;
import org.springframework.stereotype.Service;

@Service
public interface IDepartmentService {

    void saveDepartment(Department department);
}
