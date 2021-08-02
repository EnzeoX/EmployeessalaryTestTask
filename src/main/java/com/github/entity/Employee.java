package com.github.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String last_name;

    @ManyToOne
    @JoinColumn
    private Department department;

    private BigDecimal salary;

    public Employee(String last_name, Department department_id, BigDecimal salary) {
        this.last_name = last_name;
        this.department = department_id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", department_id=" + department +
                ", salary=" + salary +
                '}';
    }
}
