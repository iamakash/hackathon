package com.backend

import com.backend.command.DefaultLabelCO
import grails.transaction.Transactional

@Transactional
class DefaultLabelService {
    def authenticationService

    def save(DefaultLabelCO defaultLabelCO) {
        User createdBy = authenticationService.authenticatedUser()
        User modifiedBy = authenticationService.authenticatedUser()
        DefaultLabel defaultLabel = new DefaultLabel(defaultLabelCO, createdBy, modifiedBy)
        defaultLabel.save(flush: true, failOnError: true)
    }

    def update(DefaultLabelCO defaultLabelCO, DefaultLabel defaultLabel) {
        User modifiedBy = authenticationService.authenticatedUser()

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
