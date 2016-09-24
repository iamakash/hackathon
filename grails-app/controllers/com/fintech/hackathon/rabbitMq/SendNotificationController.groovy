package com.fintech.hackathon.rabbitMq

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class SendNotificationController {

    def callForNotificationService
    def send() {
        ExecutorService executorService = Executors.newFixedThreadPool(1)
        try {
            executorService.execute(callForNotificationService)
        }
        catch(Exception ex){
            println("Exception Occur : ${ex.message}")
        }
    }
}
