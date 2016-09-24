package com.fintech.hackathon.rabbitMq

class SendNotificationService {

    static transactional = false

    static rabbitSubscribe = [name: "trackIssue", routingKey: "trackIssue.sendNotification"]

    void handleMessage(String str){
        try{
            println("#################")
            println(str)
            println("#################")
        }catch (Exception e){
            println("i am handler exception "+e)
        }
    }
}
