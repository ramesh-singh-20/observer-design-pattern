package com.alphacoder.listener.impl;

import com.alphacoder.listener.PaymentListener;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PaymentLogger implements PaymentListener {

    private void logPayment(){
        System.out.println("Payment Received.");

    }

    @Override
    public void paymentMade() {
        logPayment();
    }
}
