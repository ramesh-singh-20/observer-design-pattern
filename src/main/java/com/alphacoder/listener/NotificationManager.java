package com.alphacoder.listener;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class NotificationManager {

    public void notifyPayment(){
        System.out.println("Payment Notification sent.");
    }
}
