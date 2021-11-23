package com.alphacoder.subject;

import com.alphacoder.listener.NotificationManager;
import com.alphacoder.listener.PaymentLogger;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor(onConstructor = @__ ({@Autowired}))
public class PaymentManager {
    private final NotificationManager notificationManager;
    private final PaymentLogger paymentLogger;

    public void pay(){
        paymentLogger.logPayment();
        notificationManager.notifyPayment();

    }
}
