package com.backend

import com.backend.util.command.DefaultStateCO

class DefaultStateService {

    static transactional = false

    def create(DefaultStateCO defaultStateCO){
        DefaultState defaultState = new DefaultState(defaultStateCO)
        defaultState.save(flush: true)
    }

    def delete(Integer id){
        DefaultState defaultState = DefaultState.findById(id)
        defaultState.delete()
    }
}
