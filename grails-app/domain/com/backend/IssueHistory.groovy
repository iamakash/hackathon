package com.backend

class IssueHistory {

    IssueHistoryType type

    Date dateCreated
    Date lastUpdated
    User createdBy

    static belongsTo = [
            issue: Issue
    ]

    static constraints = {
        type nullable: false
        createdBy nullable: false
        dateCreated nullable: false
        lastUpdated nullable: false
    }
}
