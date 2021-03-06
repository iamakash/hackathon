package com.backend

import com.backend.util.command.DefaultMilestoneCO

class DefaultMilestone implements Serializable {

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

    DefaultMilestone(DefaultMilestoneCO defaultMilestoneCO){
        name = defaultMilestoneCO.name
        description = defaultMilestoneCO.description
        createdBy = defaultMilestoneCO.createdBy
        modifiedBy = defaultMilestoneCO.modifiedBy
    }
}
