package com.backend

import com.backend.command.RegisterCO
import grails.transaction.Transactional
import spock.util.mop.Use

@Transactional
class UserRegisterationService {

    User save(RegisterCO registerCO) {

        User user =new User(registerCO)

        user.save(flush: true,failOnError: true)
        Role roleUser=Role.findByAuthority("ROLE_USER")
        UserRole.create(user,roleUser,true)
        return user
    }
}
