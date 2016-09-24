package com.backend

import com.backend.command.RegisterCO
import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')
class UserRegistrationController {

    def userRegisterationService


    def index() {
        render view: "/userRegistration/register"
    }

    def register(RegisterCO registerCO) {

        if (registerCO.validate()) {
            if (registerCO.validate()) {
                User user = userRegisterationService.save(registerCO)
                redirect action: "sendmail", params: [userId: user.id]
            }
        } else {
            render view: "/userRegistration/register", model: [registerCOError: registerCO.errors]
        }
    }

    def sendmail() {

        User user = User.findById(params.userId as Long)
        println("################" + user.id)
        println("################" + user.uuid)
        println("################" + user.uuid)
        sendMail {
            to "${user?.emailAddress}"
            subject "Hello ${user?.username}"
            html g.render(template: "/templates/email", model: [username: user.username, userId: user.uuid])
        }
    }

    def verifyEmailAddress() {

        User user = User.findByUuid(params?.token)
        if (user) {
            user.enabled = true
            user.save(flush: true, failOnError: true)
            flash.registerSuccess = "You have been successfully registered! Please login"
            redirect action: "auth", controller: "login"
            //render view: "/login/auth"
        } else {
            flash.registerFailure = "Please register your details again"
            render view: "/userRegistration/register"
        }

    }

}
