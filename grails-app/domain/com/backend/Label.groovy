package com.backend

class Label implements Serializable {

    String name
    String description

    static constraints = {
        name nullable: false, blank: false, matches: /[a-zA-Z0-9_-]+/
        description nullable: true
    }
}
