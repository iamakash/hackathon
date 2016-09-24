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
            User admin = new User(username: "akash", password: "akash")
            admin.save(flush: true, failOnError: true)
            UserRole.create(admin, roleAdmin, true)
            UserRole.create(admin, roleUser, true)
        }

    }

    def createUser() {
        def csvData = AppUtil.readCsvFile()
        Role roleUser = Role.findByAuthority("ROLE_USER")
        if (!(User.findByUsername("abhinav"))) {
            User user = new User(username: "abhinav", password: "abhinav")
            user.save(flush: true, failOnError: true)
            UserRole.create(user, roleUser, true)
        }
        csvData.each {
            saveIfNotExists(
                    new User(
                            username: fetchFromCsv('First Name', it) + "@email.com",
                            password: fetchFromCsv('First Name', it) + "@email.com",

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

    def createMilestones(){
        User user = User.findByUsername("akash")
        if (DefaultMilestone.findAll().size()==0){
            new DefaultMilestone(name: "7days",description: "Must complete",createdBy: user).save(flush: true)
            new DefaultMilestone(name: "15days",description: "Must complete",createdBy: user).save(flush: true)
            new DefaultMilestone(name: "21days",description: "Must complete",createdBy: user).save(flush: true)
            new DefaultMilestone(name: "1 month",description: "Must complete",createdBy: user).save(flush: true)
        }
    }

    def createLabels(){
        User user = User.findByUsername("akash")
        if (DefaultLabel.findAll().size()==0){
            new DefaultLabel(name: "High",description: "Must complete with in 24 hours",createdBy: user).save(flush: true)
            new DefaultLabel(name: "Bug",description: "Must complete with in 24 hours",createdBy: user).save(flush: true)
            new DefaultLabel(name: "Priority High",description: "Must complete in 2 weeks",createdBy: user).save(flush: true)
            new DefaultLabel(name: "Low",description: "Can delay",createdBy: user).save(flush: true)
        }
    }

    def createStatus(){
        User user = User.findByUsername("akash")
        if (DefaultState.findAll().size()==0){
            new DefaultState(name: "Waiting",description: "Waiting",createdBy: user).save(flush: true)
            new DefaultState(name: "Approved",description: "Approved",createdBy: user).save(flush: true)
        }
    }


}
