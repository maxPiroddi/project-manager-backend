package com.maxpiroddi.projectmanager.projectmanager.service;

import com.maxpiroddi.projectmanager.projectmanager.model.Employee;
import com.maxpiroddi.projectmanager.projectmanager.model.Project;
import com.maxpiroddi.projectmanager.projectmanager.repository.EmployeeRepository;
import com.maxpiroddi.projectmanager.projectmanager.repository.ProjectRepository;

import com.maxpiroddi.projectmanager.projectmanager.util.JobTitle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    private final Employee employeeOne = new Employee("James Smith", JobTitle.Developer);
    private final Employee employeeTwo = new Employee("Jane Firth", JobTitle.Developer);
    private final Employee employeeThree = new Employee("Ari Buskev", JobTitle.Designer);
    private final Employee employeeFour = new Employee("James Smith", JobTitle.ProductOwner);
    private final Employee employeeFive = new Employee("Fred Jango", JobTitle.IterationManager);

    List<Employee> employeeList = Arrays.asList(employeeOne, employeeTwo, employeeThree,
            employeeFour, employeeFive);

    @Bean
    CommandLineRunner initEmployees(EmployeeRepository employeeRepository) {
        return args -> {
            log.info("Preloading " + employeeRepository.save(employeeOne));
            log.info("Preloading " + employeeRepository.save(employeeTwo));
            log.info("Preloading " + employeeRepository.save(employeeThree));
            log.info("Preloading " + employeeRepository.save(employeeFour));
            log.info("Preloading " + employeeRepository.save(employeeFive));
        };
    }

    @Bean
    CommandLineRunner initProjects(ProjectRepository projectRepository) {
        return args -> {
            log.info("Preloading " + projectRepository.save(new Project("Digital Renovation", "Renovation of our digital " +
                    "presence", LocalDate.now(), LocalDate.now(), employeeList )));
        };
    }
}
