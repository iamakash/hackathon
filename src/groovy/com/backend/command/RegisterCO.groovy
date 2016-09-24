package com.backend.command

import grails.validation.Validateable

@Validateable
class RegisterCO {
    String username
    String password
    String emailAddress
    String confirmPassword
    static constraints = {
        username unique: true
        password blank: false, minSize: 3

        confirmPassword blank: false, validator: { val, obj ->
            if (!(obj.password.compareTo(val) == 0)) {
                return "validation.customRuntimePasswordComapreMessage"
            }
        }
    }
}
