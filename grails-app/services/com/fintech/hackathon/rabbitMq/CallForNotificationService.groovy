package com.fintech.hackathon.rabbitMq


class CallForNotificationService implements Runnable {

    static transactional = false

    def sendNotificationService

    @Override
    public void run(){
        println("Hi I am in Send Notification Thread")
        String str="Hi I am going to start rabbitmq for send notification"
        try{
            println("going to add to queue")
            rabbitSend "trackIssue", "trackIssue.sendNotification", str
        }catch (Exception exc){
            println("Exception is "+exc)
        }
    }
}
