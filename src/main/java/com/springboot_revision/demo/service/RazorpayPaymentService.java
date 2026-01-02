package com.springboot_revision.demo.service;

import org.springframework.stereotype.Component;

@Component
public class RazorpayPaymentService implements PaymentService {

    @Override
    public String pay() {
        String payment = "Razorpay Payment";
        System.out.println(payment);
        return payment;
    }
}
