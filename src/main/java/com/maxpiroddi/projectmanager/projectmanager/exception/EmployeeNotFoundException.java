package com.maxpiroddi.projectmanager.projectmanager.exception;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could not find employee with ID of " + id);
    }
}
