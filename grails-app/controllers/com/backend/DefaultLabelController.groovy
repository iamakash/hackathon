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
            render view: "/defaultLabel/create", model: [defaultLabelCOError: defaultLabelCO.errors]
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
            render view: "/defaultLabel/edit", model: [defaultLabelCOError: defaultLabelCO.errors]
        }

    }

    def show() {

        List<DefaultLabel> list = defaultLabelService.list(params.max ? params.int('max') : 10, params.offset ? params.int('offset') : 0)
    }


}
