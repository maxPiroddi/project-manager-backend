DROP TABLE IF EXISTS employees;

CREATE TABLE employees(
    id serial PRIMARY KEY,
    name VARCHAR(255),
    role VARCHAR(255)
);

DROP TABLE IF EXISTS projects;

CREATE TABLE projects(
    id serial PRIMARY KEY,
    name VARCHAR(255),
    description VARCHAR(255),
    startDate VARCHAR(255),
    finishDate VARCHAR(255),
    employeesList VARCHAR(255)
);