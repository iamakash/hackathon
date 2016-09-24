package com.backend

import com.backend.command.RegisterCO

class UserRegistrationController {

    def userRegisterationService

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
        sendMail {
            to "${user?.emailAddress}"
            subject "Hello ${user?.username}"
            html g.render(template: "/templates/email", model: [user: user])
        }
    }

    def verifyEmailAddress() {

        User user = User.findByUuid(params?.token)
        if (user) {
            user.enabled = true
            user.save(flush: true, failOnError: true)
            flash.registerSuccess = "You have been successfully registered! Please login"
            render view: "/login/auth"
        }
        else{
            flash.registerFailure="Please register your details again"
            render view: "/userRegistration/register"
        }

    }

}
