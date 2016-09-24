package com.backend

import com.backend.util.command.DefaultMilestoneCO
import com.backend.util.command.ProjectCO

class Project implements Serializable {

    String name
    String description

    Date dateCreated
    Date lastUpdated
    User createdBy
    User modifiedBy

    static hasMany = [
            issues    : Issue,
            labels    : Label,
            statuses  : State,
            milestones: Milestone
    ]

    static constraints = {
        name nullable: false, blank: false, matches: /[a-zA-Z0-9_-]+/
        description nullable: true
        createdBy nullable: true
        modifiedBy nullable: true
        dateCreated nullable: true
        lastUpdated nullable: true
    }

    Project(ProjectCO projectCO) {
        name = projectCO.name
        description = projectCO.description
        createdBy = projectCO.createdBy
        modifiedBy = projectCO.modifiedBy
    }
}
