package com.backend.command

import grails.validation.Validateable

@Validateable
class DefaultLabelCO {
    String name
    String description
    static constraints = {
        name nullable: false, blank: false, matches: /[a-zA-Z0-9_-]+/
        description nullable: true
    }


}
