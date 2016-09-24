package com.backend

import com.backend.command.DefaultLabelCO

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

    DefaultLabel(DefaultLabelCO defaultLabelCO, User createdBy, User modifiedBy) {
        this.name = defaultLabelCO.name
        this.description = defaultLabelCO.description
        this.createdBy = createdBy
        this.modifiedBy = modifiedBy

    }
}
