package com.backend

class Project implements Serializable {

    String name
    String description
    Label defaultLabel
    State defaultState
    Milestone defaultMilestone

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
        defaultLabel nullable: false
        defaultState nullable: false
        defaultMilestone nullable: false
        description nullable: true
        createdBy nullable: true
        modifiedBy nullable: true
        dateCreated nullable: true
        lastUpdated nullable: true
    }
}
