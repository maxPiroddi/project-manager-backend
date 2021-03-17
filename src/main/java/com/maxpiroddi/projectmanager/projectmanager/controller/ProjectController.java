package com.maxpiroddi.projectmanager.projectmanager.controller;

import java.util.List;

import com.maxpiroddi.projectmanager.projectmanager.exception.ProjectNotFoundException;
import com.maxpiroddi.projectmanager.projectmanager.model.Project;
import com.maxpiroddi.projectmanager.projectmanager.repository.ProjectRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    private final ProjectRepository repository;

    public ProjectController(ProjectRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/projects")
    List<Project> all() {
        return repository.findAll();
    }

    @PostMapping("/projects")
    Project newProject(@RequestBody Project newProject) {
        return repository.save(newProject);
    }

    @GetMapping("/projects/{id}")
    Project one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ProjectNotFoundException(id));
    }

    @PutMapping("/projects/{id}")
    Project replaceProject(@RequestBody Project newProject, @PathVariable Long id) {
        return repository.findById(id)
                .map(project -> {
                    project.setName(newProject.getName());
                    project.setDescription(newProject.getDescription());
                    project.setStartDate(newProject.getStartDate());
                    project.setFinishDate(newProject.getFinishDate());
                    project.setEmployeesList(newProject.getEmployeesList());
                    return repository.save(project);
                })
                .orElseGet(() -> {
                    newProject.setId(id);
                    return repository.save(newProject);
                });

    }

    @DeleteMapping("/project/{id}")
    void deleteProject(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
