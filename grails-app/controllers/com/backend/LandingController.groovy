package com.backend

import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')

class LandingController {

    def springSecurityService
    def decide() {
        User user = springSecurityService.currentUser
        List<Role> roles = user.getAuthorities().toList()
        roles.each { print it }
        if (roles.authority.contains("ROLE_ADMIN")) {
            render "you are a admin"
           // redirect(controller: "user", action: "index")
        } else if (roles.authority.contains("ROLE_USER") ) {
            render "you are a user"
         //   redirect(controller: "admin", action: "index")
        }
    }
}
