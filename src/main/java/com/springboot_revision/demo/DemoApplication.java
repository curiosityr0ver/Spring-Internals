package com.springboot_revision.demo;

import com.springboot_revision.demo.service.PaymentService;
import com.springboot_revision.demo.service.RazorpayPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private final PaymentService paymentService;

	@Autowired
	public DemoApplication(
            PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		paymentService.pay();
	}
}
