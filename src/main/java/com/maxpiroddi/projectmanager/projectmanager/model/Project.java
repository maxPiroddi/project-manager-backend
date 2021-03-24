package com.maxpiroddi.projectmanager.projectmanager.model;

import java.time.LocalDate;
import java.util.Objects;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate finishDate;

    @ElementCollection
    private List<Employee> employeesList;

    public Project(String name, String description, LocalDate startDate, LocalDate finishDate, List<Employee> employeesList) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.employeesList = employeesList;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public List<Employee> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employee> employeesList) {
        this.employeesList = employeesList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(id, project.id) && Objects.equals(name, project.name) && Objects.equals(description, project.description) && Objects.equals(startDate, project.startDate) && Objects.equals(finishDate, project.finishDate) && Objects.equals(employeesList, project.employeesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, startDate, finishDate, employeesList);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                ", employeesList=" + employeesList +
                '}';
    }
}
