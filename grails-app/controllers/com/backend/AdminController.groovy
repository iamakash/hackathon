package com.backend

import com.backend.util.command.DefaultMilestoneCO
import grails.plugin.springsecurity.annotation.Secured

@Secured("ROLE_ADMIN")
class AdminController {

    def springSecurityService
    def defaultMilestoneService

    def index() {
        render view: "/admin/index"
    }

    def showMilestone() {
        render view: "/admin/showMilestone", model: [mileStoneList: DefaultMilestone.findAll()]
    }

    def createMileStone() {
        render view: "/admin/createMileStone"
    }

    def saveMilestone(DefaultMilestoneCO defaultMilestoneCO) {
        println defaultMilestoneCO.name
        println defaultMilestoneCO.description
        User user = springSecurityService.currentUser as User
        defaultMilestoneCO.createdBy = user
        if (defaultMilestoneCO.validate()) {
            def returnVal = defaultMilestoneService.create(defaultMilestoneCO)
            println(returnVal)
            println(defaultMilestoneCO.createdBy)
            if (returnVal) {
                flash.message = "MileStone created Successfully"
            }
        }
        redirect(action: "showMilestone")
    }

    def deleteMilestone() {
        defaultMilestoneService.delete(params.id as Integer)
        flash.message = "Milestone has been deleted"
        redirect(action: "showMilestone")
    }
}
