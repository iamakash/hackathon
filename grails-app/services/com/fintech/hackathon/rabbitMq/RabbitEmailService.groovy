package com.fintech.hackathon.rabbitMq

import grails.transaction.Transactional

@Transactional
class RabbitEmailService {
def signupEmailService

    public void sendRegistrationRabbit(Map<String,String> map){
        try{
            println("inserting entry in queue for rabbit")
            rabbitSend "email", "email.user.register", map
        }catch (Exception exc){
            println("Exception is rabbitsend "+exc)
            signupEmailService.sendRegitrationmail(mailMap)
        }
    }
}
