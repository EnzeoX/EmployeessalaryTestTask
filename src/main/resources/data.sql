DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    last_name VARCHAR (250),
    department_id BIGINT,
    salary NUMERIC NOT NULL
);

DROP TABLE IF EXISTS departments;

CREATE TABLE departments (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    department_name VARCHAR (250) NOT NULL
)
