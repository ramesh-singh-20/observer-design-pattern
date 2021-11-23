package com.alphacoder.subject;

import com.alphacoder.listener.PaymentListener;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class PaymentManager {
    private List<PaymentListener> paymentListeners= new ArrayList<>();

    public void pay(){
        paymentListeners.forEach(PaymentListener:: paymentMade);
    }

    public void registerPaymentListeners(PaymentListener p){
        paymentListeners.add(p);
    }

    public void unRegisterPaymentListeners(PaymentListener p){
        paymentListeners.remove(p);
    }
}
