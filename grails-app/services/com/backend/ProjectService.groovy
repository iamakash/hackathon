package com.backend

import com.backend.util.command.ProjectCO
import grails.transaction.Transactional

@Transactional
class ProjectService {

    def springSecurityService

    def save(ProjectCO projectCO) {
        Project project = new Project(projectCO)
        User user = springSecurityService.currentUser as User
        project.createdBy = user
        project.modifiedBy = user
        project.save()
    }
}
