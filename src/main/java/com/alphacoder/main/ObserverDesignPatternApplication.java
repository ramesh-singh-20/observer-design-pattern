package com.alphacoder.main;

import com.alphacoder.listener.PaymentListener;
import com.alphacoder.listener.impl.NotificationManager;
import com.alphacoder.listener.impl.PaymentLogger;
import com.alphacoder.subject.PaymentManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverDesignPatternApplication {

	public static void main(String[] args) {

		SpringApplication.run(ObserverDesignPatternApplication.class, args);
		PaymentManager paymentManager= new PaymentManager();
		paymentManager.registerPaymentListeners(new PaymentLogger());
		paymentManager.registerPaymentListeners(new NotificationManager());
		paymentManager.pay();
	}

}
