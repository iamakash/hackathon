package com.backend

import com.backend.util.command.DefaultLabelCO
import com.backend.util.command.DefaultMilestoneCO
import com.backend.util.command.DefaultStateCO
import grails.plugin.springsecurity.annotation.Secured

@Secured("ROLE_ADMIN")
class AdminController {

    def springSecurityService
    def defaultMilestoneService
    def defaultLabelService
    def defaultStateService

    def index() {
        render view: "/admin/index"
    }

    def showMilestone() {
        render view: "/admin/showMilestone", model: [mileStoneList: DefaultMilestone.findAll()]
    }

    def showLabels() {
        render view: "/admin/showLabels", model: [labelList: DefaultLabel.findAll()]
    }

    def showState() {
        render view: "/admin/showState", model: [stateList: DefaultState.findAll()]
    }

    def createMileStone() {
        render view: "/admin/createMileStone"
    }

    def createLabel() {
        render view: "/admin/createLabel"
    }

    def createState() {
        render view: "/admin/createState"
    }

    def saveMilestone(DefaultMilestoneCO defaultMilestoneCO) {
        User user = springSecurityService.currentUser as User
        defaultMilestoneCO.createdBy = user
        if (defaultMilestoneCO.validate()) {
            def returnVal = defaultMilestoneService.create(defaultMilestoneCO)
            if (returnVal) {
                flash.message = "MileStone created Successfully"
            }
        }
        redirect(action: "showMilestone")
    }

    def saveLabel(DefaultLabelCO defaultLabelCO) {
        User user = springSecurityService.currentUser as User
        defaultLabelCO.createdBy = user
        def returnVal = defaultLabelService.create(defaultLabelCO)
        if (returnVal) {
            flash.message = "Label created Successfully"
        }
        redirect(action: "showLabels")
    }

    def saveState(DefaultStateCO defaultStateCO) {
        User user = springSecurityService.currentUser as User
        defaultStateCO.createdBy = user
        def returnVal = defaultStateService.create(defaultStateCO)
        if (returnVal) {
            flash.message = "Label created Successfully"
        }
        redirect(action: "showState")
    }

    def deleteMilestone() {
        defaultMilestoneService.delete(params.id as Integer)
        flash.message = "Milestone has been deleted"
        redirect(action: "showMilestone")
    }

    def deleteLabels() {
        defaultLabelService.delete(params.id as Integer)
        flash.message = "Label Deleted"
        redirect(action: "showLabels")
    }

    def deleteState(){
        defaultStateService.delete(params.id as Integer)
        flash.message = "Deleted State"
        redirect action: "showState"
    }
}
