package com.backend

class Issue implements Serializable {

    String name
    String description
    User assignee
    State state
    Milestone milestone
    Label label

    Date dateCreated
    Date lastUpdated
    User createdBy
    User modifiedBy

    static belongsTo = [
            project: Project
    ]

    static constraints = {
        name nullable: false, blank: false, matches: /[a-zA-Z0-9_-]+/
        assignee nullable: false
        state nullable: false
        milestone nullable: false
        label nullable: false
        description nullable: true
        createdBy nullable: true
        modifiedBy nullable: true
        dateCreated nullable: true
        lastUpdated nullable: true
    }
}
