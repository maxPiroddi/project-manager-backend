package com.maxpiroddi.projectmanager.projectmanager.repository;

import com.maxpiroddi.projectmanager.projectmanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
