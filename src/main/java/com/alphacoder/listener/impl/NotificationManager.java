package com.alphacoder.listener.impl;

import com.alphacoder.listener.PaymentListener;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class NotificationManager implements PaymentListener {

    private void notifyPayment(){

        System.out.println("Payment Notification sent.");
    }

    @Override
    public void paymentMade() {
        notifyPayment();
    }
}
