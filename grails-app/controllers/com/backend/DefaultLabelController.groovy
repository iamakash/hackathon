package com.backend

import com.backend.command.DefaultLabelCO

class DefaultLabelController {

    def defaultLabelService

    def create() {
        render view: "/defaultLabel/create"
    }

    def save(DefaultLabelCO defaultLabelCO) {
        if (defaultLabelCO.validate()) {
            defaultLabelService.save(defaultLabelCO)
            //render view :"/defaultLabel/show"
        } else {
            flash.defaultLabelError = "please enter unique name"
            render view: "/defaultLabel/create"
        }
    }

    def edit() {
        DefaultLabel defaultLabel = DefaultLabel.findById(params.id as Long)
        render view: "/defaultLabel/edit", model: [defaultLabel: defaultLabel]
    }

    def update(DefaultLabelCO defaultLabelCO) {

        if (defaultLabelCO.validate()) {
            DefaultLabel defaultLabel = DefaultLabel.findById(params.id as Long)
            defaultLabelService.update(defaultLabelCO, defaultLabel)

        } else {
            flash.defaultLabelUpdateError = "please enter unique name"
            render view: "/defaultLabel/edit"
        }

    }

}
