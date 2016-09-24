package com.backend

import grails.transaction.Transactional

@Transactional
class BootstrapService {

    def createRoles() {
        if (Role.count < 1) {

            Role roleAdmin = new Role("ROLE_ADMIN")
            roleAdmin.save()
            Role roleUser = new Role("ROLE_USER")
            roleUser.save()
        }

    }

    def createAdmin() {
        Role roleAdmin = Role.findByAuthority("ROLE_ADMIN")
        Role roleUser=Role.findByAuthority("ROLE_USER")
        if (!(User.findByUsername("akash"))) {
            User admin = new User(username: "akash", password: "akash")
            admin.save(flush: true, failOnError: true)
            UserRole.create(admin, roleAdmin, true)
            UserRole.create(admin,roleUser,true)
        }

    }
    def createUser() {
        Role roleUser=Role.findByAuthority("ROLE_USER")
        if (!(User.findByUsername("abhinav"))) {
            User user = new User(username: "abhinav", password: "abhinav")
            user.save(flush: true, failOnError: true)
            UserRole.create(user,roleUser,true)
        }


    }

}
