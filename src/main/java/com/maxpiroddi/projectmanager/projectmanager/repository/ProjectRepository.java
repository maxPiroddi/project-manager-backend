package com.maxpiroddi.projectmanager.projectmanager.repository;

import com.maxpiroddi.projectmanager.projectmanager.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
