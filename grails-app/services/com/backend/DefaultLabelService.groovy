package com.backend

import com.backend.util.command.DefaultLabelCO

class DefaultLabelService {

    static transactional = false
    def springSecurityService

    def create(DefaultLabelCO defaultLabelCO){
        DefaultLabel defaultLabel = new DefaultLabel(defaultLabelCO)
        defaultLabel.save(flush: true)
    }

    def delete(Integer id){
        DefaultLabel defaultLabel = DefaultLabel.findById(id)
        defaultLabel.delete()
    }

    def update(DefaultLabelCO defaultLabelCO, DefaultLabel defaultLabel) {
        User modifiedBy = springSecurityService.currentUser as User

        defaultLabel.name = defaultLabelCO.name
        defaultLabel.description = defaultLabelCO.description
        defaultLabel.modifiedBy = modifiedBy
        defaultLabel.save(flush: true, failOnError: true)
    }

    List<DefaultLabel> list(Integer max, Integer offset) {
        List<DefaultLabel> list = DefaultLabel.createCriteria().list {
            maxResults(max)
            firstResult(offset)
        }
        return list
    }


}
