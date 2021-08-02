package com.github.repository;


import com.github.dto.DepartmentDto;
import com.github.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDepartmentRepository extends JpaRepository<Department, Long> {

    @Query(value = "SELECT department_id, AVG(salary) FROM employees GROUP BY department_id", nativeQuery = true)
    List<DepartmentDto> getMidSalaryByDepartment();

    //SELECT
    //	e.department_id,
    //	department_name,
    //	AVG(salary)
    //FROM
    //	employees e
    //INNER JOIN departments d ON d.department_id = e.department_id
    //GROUP BY
    //	e.department_id;

//    SELECT
//            department_id,
//    AVG(salary)
//    FROM
//            employees
//    GROUP BY
//    department_id;
}
