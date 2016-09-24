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
        if (projectCO.validate()) {
            projectService.save(projectCO)
            flash.message = "Project created Successfully"
            redirect action: "index"
        } else {

        }
    }

    def projectDetail() {

    }
}
