package com.backend

import com.backend.util.command.DefaultMilestoneCO
import grails.plugin.springsecurity.annotation.Secured

@Secured("ROLE_ADMIN")
class DefaultMilestoneController {

    def springSecurityService
    def defaultMilestoneService

    def create(DefaultMilestoneCO defaultMilestoneCO) {
        User user = springSecurityService.currentUser as User
        defaultMilestoneCO.createdBy = user
        if (defaultMilestoneCO.validate()){
            def returnVal = defaultMilestoneService.create(defaultMilestoneCO)
            if (returnVal){
                flash.message = "MileStone created Successfully"
            }
        }
    }

    def show() {
    }
}
