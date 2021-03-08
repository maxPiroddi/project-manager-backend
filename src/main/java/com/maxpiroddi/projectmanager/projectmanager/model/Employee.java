package com.maxpiroddi.projectmanager.projectmanager.model;


import com.maxpiroddi.projectmanager.projectmanager.util.JobTitles;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {



    private @Id @GeneratedValue Long id;
    private String name;
    private JobTitles.JobTitle role;

    Employee() {
    }

    public Employee(String name, JobTitles.JobTitle role) {
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobTitles.JobTitle getRole() {
        return role;
    }

    public void setRole(JobTitles.JobTitle role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;

        return Objects.equals(this.id, employee.id)
                && Objects.equals(this.name, employee.name)
                && Objects.equals(this.role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\''
                + ", role='" + this.role + '\'' + '}';
    }
}

