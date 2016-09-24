package com.backend

import com.backend.util.command.DefaultLabelCO

class DefaultLabelService {

    static transactional = false

    def create(DefaultLabelCO defaultLabelCO){
        DefaultLabel defaultLabel = new DefaultLabel(defaultLabelCO)
        defaultLabel.save(flush: true)
    }

    def delete(Integer id){
        DefaultLabel defaultLabel = DefaultLabel.findById(id)
        defaultLabel.delete()
    }
}
