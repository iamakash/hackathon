package com.backend

import grails.plugin.springsecurity.annotation.Secured

@Secured("ROLE_ADMIN")
class AdminController {

    def index() {
        render view: "/admin/index"
    }

    def showMilestone(){
        render view: "/admin/showMilestone"
    }
}
