package com.emails

import grails.transaction.Transactional

@Transactional
class SignupEmailService {


    def sendRegitrationmail(Map<String,String> map){
        sendMail {
            to map.get("email")
            subject "Registration mail"
            body map.get("template")
        }
    }
}
