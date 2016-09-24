package com.backend

import grails.transaction.Transactional

@Transactional
class AuthenticationService {

    def springSecurityService

    def authenticatedUser() {
        if (springSecurityService.principal) {
                return User.findByUsername(springSecurityService.principal?.username)

        }
    }
}
