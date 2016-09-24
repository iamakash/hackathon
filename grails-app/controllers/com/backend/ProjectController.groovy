package com.backend

import com.backend.util.command.ProjectCO
import grails.plugin.springsecurity.annotation.Secured

@Secured("ROLE_USER")
class ProjectController {

    def projectService
    def springSecurityService

    def index() {
        User user = springSecurityService.currentUser
        [projects: Project.findAllByCreatedBy(user)]
    }

    def create() {

    }

    def save(ProjectCO projectCO) {
        Project project = Project.findByName(projectCO.name)

        if (projectCO.validate() && !project) {
            projectService.save(projectCO)
            flash.message = "Project created Successfully"
            redirect action: "index"
        }
    }

    def projectDetail() {
        Project project = Project.findByName(params.name)
        [project: project]
    }
}
