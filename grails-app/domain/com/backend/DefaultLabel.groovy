package com.backend

class DefaultLabel implements Serializable {

    String name
    String description

    Date dateCreated
    Date lastUpdated
    User createdBy
    User modifiedBy

    static constraints = {
        name nullable: false, blank: false, matches: /[a-zA-Z0-9_-]+/
        description nullable: true
        createdBy nullable: true
        modifiedBy nullable: true
        dateCreated nullable: true
        lastUpdated nullable: true
    }
}
