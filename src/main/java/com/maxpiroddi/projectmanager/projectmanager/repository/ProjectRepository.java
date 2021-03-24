package com.maxpiroddi.projectmanager.projectmanager.repository;

import com.maxpiroddi.projectmanager.projectmanager.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
}
