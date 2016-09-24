package com.backend

import com.backend.command.DefaultLabelCO
import grails.plugin.springsecurity.annotation.Secured

@Secured("ROLE_ADMIN")

class DefaultLabelController {

    def defaultLabelService

    def create() {
        render view: "/defaultLabel/create"
    }

    def save(DefaultLabelCO defaultLabelCO) {
        if (defaultLabelCO.validate()) {
            defaultLabelService.save(defaultLabelCO)
            redirect action: "show"
        } else {
            render view: "/defaultLabel/create", model: [defaultLabelCOError: defaultLabelCO.errors]
        }
    }

    def edit() {
        DefaultLabel defaultLabel = DefaultLabel.findById(params.id as Long)
        render view: "/defaultLabel/edit", model: [defaultLabelId: defaultLabel.id,defaultLabelName:defaultLabel.name,defaultLabelDescription:defaultLabel.description]
    }

    def update(DefaultLabelCO defaultLabelCO) {

        if (defaultLabelCO.validate()) {
            println("#################"+defaultLabelCO.name)
            println("#################"+defaultLabelCO.description)
            DefaultLabel defaultLabel = DefaultLabel.findById(params.id as Long)
            println("##############"+defaultLabel.toString())
            defaultLabelService.update(defaultLabelCO, defaultLabel)
            redirect action: "show"

        } else {
            render view: "/defaultLabel/edit", model: [defaultLabelCOError: defaultLabelCO.errors]
        }

    }

    def show() {

        List<DefaultLabel> list = defaultLabelService.list(params.max ? params.int('max') : 10, params.offset ? params.int('offset') : 0)
        render view: "/defaultLabel/show", model: [list: list,count:DefaultLabel.count]
    }


}
