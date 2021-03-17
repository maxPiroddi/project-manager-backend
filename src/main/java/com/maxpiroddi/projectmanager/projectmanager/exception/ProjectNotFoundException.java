package com.maxpiroddi.projectmanager.projectmanager.exception;

public class ProjectNotFoundException extends RuntimeException {
    public ProjectNotFoundException(Long id) {
        super("Could not find project with ID of " + id);
    }
}
