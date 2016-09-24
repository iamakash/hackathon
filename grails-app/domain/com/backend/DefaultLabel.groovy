package com.backend

import com.backend.util.command.DefaultLabelCO

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

    DefaultLabel(DefaultLabelCO defaultLabelCO) {
        name = defaultLabelCO.name
        description = defaultLabelCO.description
        createdBy = defaultLabelCO.createdBy
        modifiedBy = defaultLabelCO.modifiedBy
    }
}
