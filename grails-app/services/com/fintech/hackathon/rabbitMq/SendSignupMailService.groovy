package com.fintech.hackathon.rabbitMq

import grails.transaction.NotTransactional
import grails.transaction.Transactional

@Transactional
class SendSignupMailService {

    def signupEmailService

    static rabbitSubscribe = [name: "email", routingKey: "email.user.register"]

    @NotTransactional
    void handleMessage(Map<String,String> mailMap){
        try{
            signupEmailService.sendRegitrationmail(mailMap)
        }catch (Exception e){
            println("i am handler exception "+e)
        }
    }
}
