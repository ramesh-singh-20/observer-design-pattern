package com.alphacoder.listener;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PaymentLogger {

    public void logPayment(){
        System.out.println("Payment Received.");

    }
}
