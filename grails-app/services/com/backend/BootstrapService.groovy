package com.backend

import com.backend.util.AppUtil
import grails.transaction.Transactional

//@Transactional
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
        Role roleUser = Role.findByAuthority("ROLE_USER")
        if (!(User.findByUsername("akash"))) {
            User admin = new User(username: "akash", password: "akash",emailAddress: "akash@gmail.com")
            admin.save(flush: true, failOnError: true)
            UserRole.create(admin, roleAdmin, true)
            UserRole.create(admin, roleUser, true)
        }

    }

    def createUser() {
        def csvData = AppUtil.readCsvFile()
        Role roleUser = Role.findByAuthority("ROLE_USER")
        if (!(User.findByUsername("abhinav"))) {
            User user = new User(username: "abhinav", password: "abhinav",emailAddress: "abhinav@gmail.com")
            user.save(flush: true, failOnError: true)
            UserRole.create(user, roleUser, true)
        }

        csvData.each {
            saveIfNotExists(
                    new User(
                            username: fetchFromCsv('First Name', it) + "@email.com",
                            password: fetchFromCsv('First Name', it) + "@email.com",
                            emailAddress: fetchFromCsv('First Name', it) + "@email.com"
                    ), "ROLE_USER",
            )
        }

    }

    def fetchFromCsv(def field, def csvRecord) {
        try {
            field != 'null' ? csvRecord[field] : null
        }
        catch (Exception ex) {
            println("Exception in set listSubscriber field" + ex)
            return ""
        }
    }

    def saveIfNotExists(User user, String authority) {
        def existingUser = User.findByUsername(user.username)
        if (!existingUser) {
            user.validate()
            user.save(flush: true, failOnError: true)
            existingUser = user
            if (!user.hasErrors()) {
                UserRole.create(existingUser, Role.findByAuthority(authority), true)
            }
        }

    }

    def createMilestones() {
        User user = User.findByUsername("akash")
        if (DefaultMilestone.findAll().size() == 0) {

        }
    }


}
