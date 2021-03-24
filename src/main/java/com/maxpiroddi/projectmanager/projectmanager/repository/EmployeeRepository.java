package com.maxpiroddi.projectmanager.projectmanager.repository;

import com.maxpiroddi.projectmanager.projectmanager.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
