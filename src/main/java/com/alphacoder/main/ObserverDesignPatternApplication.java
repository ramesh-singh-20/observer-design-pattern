package com.alphacoder.main;

import com.alphacoder.listener.NotificationManager;
import com.alphacoder.listener.PaymentLogger;
import com.alphacoder.subject.PaymentManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverDesignPatternApplication {

	public static void main(String[] args) {

		SpringApplication.run(ObserverDesignPatternApplication.class, args);
		NotificationManager notificationManager= new NotificationManager();
		PaymentLogger paymentLogger= new PaymentLogger();
		PaymentManager paymentManager= new PaymentManager(notificationManager, paymentLogger);
		paymentManager.pay();
	}

}
