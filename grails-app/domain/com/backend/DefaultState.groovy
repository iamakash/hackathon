package com.backend

import com.backend.util.command.DefaultStateCO

class DefaultState implements Serializable {

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

    DefaultState(DefaultStateCO defaultStateCO){
        name = defaultStateCO.name
        description = defaultStateCO.description
        createdBy = defaultStateCO.createdBy
        modifiedBy = defaultStateCO.createdBy
    }
}
