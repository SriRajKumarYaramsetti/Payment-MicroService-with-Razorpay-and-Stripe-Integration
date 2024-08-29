package com.SriRaj.PaymentService.Services.PaymentGateWay;

public interface PaymentGateWay {
    String generatePaymentLink(String orderId, String email, String phoneNumber, Long amount);
}
